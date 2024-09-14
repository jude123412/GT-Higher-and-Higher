package classes

import gregtech.api.recipes.builders.SimpleRecipeBuilder
import gregtech.api.recipes.builders.FuelRecipeBuilder
import gregtech.api.recipes.RecipeMap
import gregtech.api.gui.GuiTextures
import gregtech.api.gui.widgets.ProgressWidget
import gregtech.core.sound.GTSoundEvents

import crazypants.enderio.base.sound.SoundRegistry

final class GTHHRecipeMaps {

        private static final RecipeMap<FuelRecipeBuilder> ZOMBIE_ENGINE_FUELS = new RecipeMap<>("zombie_engine_fuels", 1, 0, 1, 0, new FuelRecipeBuilder(), false)
                .setSlotOverlay(false, true, true, GuiTextures.FURNACE_OVERLAY_2)
                .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.BATH)
                    
        private static final RecipeMap<FuelRecipeBuilder> ENDER_ENGINE_FUELS = new RecipeMap<>("ender_engine_fuels", 1, 0, 1, 0, new FuelRecipeBuilder(), false)
                .setSlotOverlay(false, true, true, GuiTextures.FURNACE_OVERLAY_2)
                .setProgressBar(GuiTextures.PROGRESS_BAR_ARROW_MULTIPLE, ProgressWidget.MoveType.HORIZONTAL)
                .setSound(GTSoundEvents.BATH)

}