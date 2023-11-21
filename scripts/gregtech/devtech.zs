import mods.gregtech.machine.MachineBuilder;
import mods.gregtech.recipe.RecipeMapBuilder;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

MachineBuilder.create(32000, "steam_centrifuge")
    .setRecipeMap(RecipeMaps.CENTRIFUGE_RECIPES)
    .setRenderer("machines/centrifuge")
    .addSteamTier(false, true)
    .addSteamTier(true)
    .buildAndRegister();