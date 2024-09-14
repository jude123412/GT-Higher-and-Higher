package metatileentity

import gregtech.api.capability.impl.SteamMultiWorkable
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapSteamMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.recipes.RecipeMaps
import gregtech.client.particle.VanillaParticleEffects
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.client.utils.TooltipHelper
import gregtech.common.ConfigHolder
import gregtech.common.blocks.BlockMetalCasing
import gregtech.common.blocks.MetaBlocks
import net.minecraft.block.state.IBlockState
import net.minecraft.client.resources.I18n
import net.minecraft.item.ItemStack
import net.minecraft.util.EnumParticleTypes
import net.minecraft.util.ResourceLocation
import net.minecraft.world.World
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

import groovyjarjarantlr4.v4.runtime.misc.NotNull
import groovyjarjarantlr4.v4.runtime.misc.Nullable

import java.util.List

import static gregtech.client.renderer.texture.Textures.BRONZE_PLATED_BRICKS
import static gregtech.client.renderer.texture.Textures.SOLID_STEEL_CASING

class GTHHMetaTileEntitySteamForgeHammer extends RecipeMapSteamMultiblockController {

    private static final int PARALLEL_LIMIT = 8

    GTHHMetaTileEntitySteamForgeHammer(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.FORGE_HAMMER_RECIPES, CONVERSION_RATE)
        this.recipeMapWorkable = new SteamMultiWorkable(this, CONVERSION_RATE)
        this.recipeMapWorkable.setParallelLimit(PARALLEL_LIMIT)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity metaTileEntityHolder) {
        return new GTHHMetaTileEntitySteamForgeHammer(metaTileEntityId)
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "XXX", "XXX")
                .aisle("XXX", "X#X", "XXX")
                .aisle("XXX", "XSX", "XXX")
                .where('S'as char, selfPredicate())
                .where('X'as char, states(getCasingState()).setMinGlobalLimited(14).or(autoAbilities()))
                .where('#'as char, air())
                .build()
    }

    IBlockState getCasingState() {
        return ConfigHolder.machines.steelSteamMultiblocks ?
                MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.STEEL_SOLID) :
                MetaBlocks.METAL_CASING.getState(BlockMetalCasing.MetalCasingType.BRONZE_BRICKS)
    }

    @SideOnly(Side.CLIENT)
    @Override
    ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return ConfigHolder.machines.steelSteamMultiblocks ? SOLID_STEEL_CASING : BRONZE_PLATED_BRICKS
    }

    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.FORGE_HAMMER_OVERLAY
    }

    @Override
    boolean hasMaintenanceMechanics() {
        return false
    }

    @Override
    int getItemOutputLimit() {
        return 1
    }

    @Override
    void addInformation(ItemStack stack, @Nullable World player, @NotNull List<String> tooltip,
                        boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced)
        tooltip.add(I18n.format("gregtech.multiblock.steam_.duration_modifier"))
        tooltip.add(I18n.format("gregtech.universal.tooltip.parallel", PARALLEL_LIMIT))
        tooltip.add(I18n.format("gregtech.multiblock.require_steam_parts"))
    }

    @SideOnly(Side.CLIENT)
    @Override
    void randomDisplayTick() {
        if (isActive()) {
            VanillaParticleEffects.defaultFrontEffect(this, 0.4F, EnumParticleTypes.SMOKE_NORMAL)
        }
    }
}