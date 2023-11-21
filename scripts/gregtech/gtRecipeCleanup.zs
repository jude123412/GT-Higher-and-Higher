#priority 1000

import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMap;

val platePolyethylene = <gregtech:meta_plate:1012>;
val platePolyvinylChloride = <gregtech:meta_plate:1007>;
val platePolytetrafluoroethylene = <gregtech:meta_plate:1016>;
val platePolybenzimidazole = <gregtech:meta_plate:1010>;
val goodCircuitBoard = <gregtech:meta_item_1:382>;
val foilSilver = <gregtech:meta_foil:100>;
val foilCopper = <gregtech:meta_foil:25>;

//EBF Recipe Removal
    val ebfEUt = [
        120,
        120,
        120
    ]as int[];

    val ebfInputs = [
        [<gregtech:meta_dust:272> * 1],
        [<gregtech:meta_dust:2> * 1, <gregtech:meta_item_1:461>.withTag({Configuration: 1}) * 1],
        [<gregtech:meta_dust:2> * 1, <gregtech:meta_item_1:461>.withTag({Configuration: 2}) * 1]
    ]as IIngredient[][];

    val ebfFluidInputs = [
        [<liquid:oxygen> * 3000],
        [null],
        [<liquid:nitrogen> * 1000],
    ]as ILiquidStack[][];

    for index, recipeEUt in ebfEUt {
        val recipeInputs = ebfInputs[index];
        val recipeFluidInputs = ebfFluidInputs[index];

        <recipemap:electric_blast_furnace>.findRecipe(recipeEUt, recipeInputs, recipeFluidInputs).remove();
    }

//Mixer Recipe Removal
        <recipemap:mixer>.findRecipe(7, [<gregtech:meta_dust:6> * 1, <gregtech:meta_dust:39> * 1, <gregtech:meta_item_1:461>.withTag({Configuration: 1}) * 1], null).remove();

//Assembler Recipe Removal
        <recipemap:assembler>.findRecipe(7, [<gregtech:meta_foil:25> * 4, <gregtech:meta_plate:1617> * 1], [<liquid:glue> * 100]).remove();
        <recipemap:assembler>.findRecipe(30, [<gregtech:meta_dust:1617> * 1, <gregtech:meta_item_1:461>.withTag({Configuration: 1}) * 1], [<liquid:glue> * 50]).remove();

//Chemical Reactor Recipe Removal
    val chemReactorEUt = [
        10,
        10,
        10,
        10,
        30,
    ]as int[];

    val chemReactorItemInputs = [
        [platePolyethylene * 1, foilCopper * 4],
        [platePolyvinylChloride * 1, foilCopper * 4],
        [platePolytetrafluoroethylene * 1, foilCopper * 4],
        [platePolybenzimidazole * 1, foilCopper * 4],
        [goodCircuitBoard * 1, foilSilver * 4],
    ]as IIngredient[][];

    val chemReactorFluidInputs = [
        [<liquid:sulfuric_acid> * 250],
        [<liquid:sulfuric_acid> * 250],
        [<liquid:sulfuric_acid> * 250],
        [<liquid:sulfuric_acid> * 250],
        [<liquid:iron_iii_chloride> * 100],
    ]as ILiquidStack[][];

        for index, recipeEUt in chemReactorEUt {
            val recipeInputs = chemReactorItemInputs[index];
            val recipeFluidInputs = chemReactorFluidInputs[index];

            <recipemap:chemical_reactor>.findRecipe(recipeEUt, recipeInputs, recipeFluidInputs).remove();
            <recipemap:large_chemical_reactor>.findRecipe(recipeEUt, recipeInputs, recipeFluidInputs).remove();
        }