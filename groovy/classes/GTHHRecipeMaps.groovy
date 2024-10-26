package classes

import gregtech.api.recipes.builders.SimpleRecipeBuilder
import gregtech.api.recipes.builders.FuelRecipeBuilder
import gregtech.api.recipes.builders.BlastRecipeBuilder
import gregtech.api.recipes.RecipeMap
import gregtech.api.gui.GuiTextures
import gregtech.api.gui.widgets.ProgressWidget
import gregtech.core.sound.GTSoundEvents

import static gregtech.api.GTValues.*

final class GTHHRecipeMaps {

        static final RecipeMap<FuelRecipeBuilder> ZOMBIE_ENGINE_FUELS = new RecipeMap<>("zombie_engine_fuels", 1, 0, 1, 0, new FuelRecipeBuilder(), false)
                .setSlotOverlay(false, true, true, GuiTextures.FURNACE_OVERLAY_2)
                .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.BATH)
                    
        static final RecipeMap<FuelRecipeBuilder> ENDER_ENGINE_FUELS = new RecipeMap<>("ender_engine_fuels", 1, 0, 1, 0, new FuelRecipeBuilder(), false)
                .setSlotOverlay(false, true, true, GuiTextures.FURNACE_OVERLAY_2)
                .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.BATH)

        static final RecipeMap<BlastRecipeBuilder> GTHH_BLAST_RECIPES = new RecipeMap<>("gthh_blast_recipes", 3, 3, 3, 3, new BlastRecipeBuilder(), false)
                .setSound(GTSoundEvents.FURNACE)

        static final RecipeMap<SimpleRecipeBuilder> GTHH_VACUUM_RECIPES = new RecipeMap<>("gthh_vacuum_recipes", 1, 1, 1, 1, new SimpleRecipeBuilder().EUt(VA[MV]), false)
                .setSound(GTSoundEvents.COOLING)
        
        static final RecipeMap<SimpleRecipeBuilder> GTHH_PRECISE_RECIPES = new RecipeMap<>("gthh_precise_recipes", 6, 9, 6, 0, new SimpleRecipeBuilder().EUt(VA[MV]), false)
                .setSlotOverlay(false, false, false, GuiTextures.CIRCUIT_OVERLAY)
                .setProgressBar(GuiTextures.PROGRESS_BAR_CIRCUIT_ASSEMBLER, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.ASSEMBLER)
}