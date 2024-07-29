//NO_RELOAD
package classes

import gregtech.api.capability.impl.MultiblockRecipeLogic
import gregtech.api.metatileentity.multiblock.MultiblockAbility
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapMultiblockController
import gregtech.api.metatileentity.multiblock.ParallelLogicType
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.api.recipes.RecipeMaps
import gregtech.api.GTValues
import gregtech.api.util.GTUtility
import gregtech.client.renderer.ICubeRenderer
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType
import gregtech.common.blocks.MetaBlocks
import gregtech.core.sound.GTSoundEvents
import gregtech.api.metatileentity.multiblock.MultiblockDisplayText
import gregtech.api.pattern.PatternMatchContext
import groovyjarjarantlr4.v4.runtime.misc.NotNull;

import net.minecraft.block.state.IBlockState
import net.minecraft.util.ResourceLocation
import net.minecraft.util.SoundEvent
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly


public class MetaTileEntityMacerationStack extends RecipeMapMultiblockController {

    MetaTileEntityMacerationStack(ResourceLocation metaTileEntityId) {
        super(metaTileEntityId, RecipeMaps.MACERATOR_RECIPES)
        this.recipeMapWorkable = new MacerationStackLogic(this)
    }

    @Override
    MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntityMacerationStack(metaTileEntityId)
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start()
                .aisle("XXX", "XXX", "XXX", "XXX", "XXX")
                .aisle("XXX", "X#X", "X#X", "X#X", "XXX")
                .aisle("XSX", "XXX", "XXX", "XXX", "XXX")
                .where('S' as char, selfPredicate())
                .where('X' as char, states(getCasingState()).setMinGlobalLimited(14).or(autoAbilities(true, true, true, true, false, false, false)))
                .where('#' as char, air())
            .build()
    }

    @Override
    ICubeRenderer getBaseTexture (IMultiblockPart sourcePart) {
        return Textures.STABLE_TITANIUM_CASING
    }

    protected IBlockState getCasingState() {
        

        return MetaBlocks.METAL_CASING.getState(MetalCasingType.TITANIUM_STABLE)
    }

    @Override
    public SoundEvent getBreakdownSound() {
        return GTSoundEvents.BREAKDOWN_ELECTRICAL;
    }
    
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.VACUUM_FREEZER_OVERLAY
    }

    private class MacerationStackLogic extends MultiblockRecipeLogic {

        public MacerationStackLogic(RecipeMapMultiblockController tileEntity) {
            super(tileEntity)
        }

        @Override
        public int getParallelLimit() {

            int voltageTier = Math.max(0, GTUtility.getTierByVoltage(this.getMaxVoltage()))
            int baseParallels = 2
            int overclockParallels = voltageTier * baseParallels
                
            return overclockParallels;
        }

        @NotNull
        @Override
        public ParallelLogicType getParallelLogicType() {
            return ParallelLogicType.MULTIPLY
        }
    }
}
