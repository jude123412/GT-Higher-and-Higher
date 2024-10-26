package metatileentity

import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.common.blocks.MetaBlocks
import gregtech.api.pattern.BlockPattern
import gregtech.core.sound.GTSoundEvents

import net.minecraft.block.state.IBlockState
import net.minecraft.util.ResourceLocation
import net.minecraft.util.SoundEvent
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly

import groovyjarjarantlr4.v4.runtime.misc.NotNull

import classes.*

class GTHHMetaTileEntityPreciseAssembler extends RecipeMapMultiblockController {

    public GTHHMetaTileEntityPreciseAssembler(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, GTHHRecipeMaps.GTHH_PRECISE_RECIPES)
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new GTHHMetaTileEntityPreciseAssembler(metaTileEntityId)
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXXXXXX", "X#####X", "X#####X", "X#####X", "XXXXXXX")
                .aisle("XXXXXXX", "XGGGGGX", "XGGGGGX", "XGGGGGX", "XXXXXXX")
                .aisle("XXXXXXX", "X#####X", "X#####X", "X#####X", "XXXXXXX")
                .aisle("XXXXXXX", "XGGGGGX", "XGGGGGX", "XGGGGGX", "XXXXXXX")
                .aisle("XXXSXXX", "X#####X", "X#####X", "X#####X", "XXXXXXX")
                .where('S' as char, selfPredicate())
                .where('X' as char, states(getCasingState()).setMinGlobalLimited(14).or(autoAbilities()))
                .where('G' as char, states(blockstate('gregtech:transparent_casing', 'active=false', 'variant=tempered_glass')))
                .where('#' as char, air())
                .build()
    }

    @Override
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        //return GTHHTextures.PRECISE_CASING
        return Textures.FROST_PROOF_CASING
    }

    protected IBlockState getCasingState() {
        return blockstate('gthh:precise_casing')
    }

    @Override
    public SoundEvent getBreakdownSound() {
        return GTSoundEvents.BREAKDOWN_ELECTRICAL
    }

    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.VACUUM_FREEZER_OVERLAY
    }
}