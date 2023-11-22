import mods.gregtech.recipe.RecipeMaps;

    <recipemap:steam_turbine>.findRecipe(32, null, [<liquid:steam> *640]).remove();

    steam_turbine.recipeBuilder()
    .fluidInputs(<liquid:steam> * 16)
    .duration(1)
    .EUt(8)
    .buildAndRegister();