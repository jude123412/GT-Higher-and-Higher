import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDictEntry;
import crafttweaker.liquid.ILiquidStack;
import mods.gregtech.recipe.RecipeMap;

    val shapedInput = [
        <ore:plateWood>,
        <ore:plateStone>
    ]as IOreDictEntry[];

    val shapedOutputSword = [
        <minecraft:wooden_sword>,
        <minecraft:stone_sword>
    ]as IItemStack[];
    val shapedOutputShovel = [
        <minecraft:wooden_shovel>,
        <minecraft:stone_shovel>
    ]as IItemStack[];
    val shapedOutputPickaxe = [
        <minecraft:wooden_pickaxe>,
        <minecraft:stone_pickaxe>
    ]as IItemStack[];
    val shapedOutputAxe = [
        <minecraft:wooden_axe>,
        <minecraft:stone_axe>
    ]as IItemStack[];
    val shapedOutputHoe = [
        <minecraft:wooden_hoe>,
        <minecraft:stone_hoe>
    ]as IItemStack[];
    for index, recipeInputs in shapedInput{
        val recipeSwordOutput = shapedOutputSword[index];
        val recipeShovelOutput = shapedOutputShovel[index];
        val recipePickaxeOutput = shapedOutputPickaxe[index];
        val recipeAxeOutput = shapedOutputAxe[index];
        val recipeHoeOutput = shapedOutputHoe[index];
        recipes.addShaped(recipeSwordOutput * 1, [
            [null, recipeInputs, null],
            [<ore:craftingToolHardHammer>, recipeInputs, <ore:craftingToolFile>],
            [null, <ore:stickWood>, null]]);
        recipes.addShaped(recipeShovelOutput * 1, [
            [<ore:craftingToolHardHammer>, recipeInputs, <ore:craftingToolFile>],
            [null, <ore:stickWood>, null],
            [null, <ore:stickWood>, null]]);
        recipes.addShaped(recipePickaxeOutput * 1, [
            [recipeInputs, recipeInputs, recipeInputs],
            [<ore:craftingToolHardHammer>, <ore:stickWood>, <ore:craftingToolFile>],
            [null, <ore:stickWood>, null]]);
        recipes.addShaped(recipeAxeOutput * 1, [
            [recipeInputs, recipeInputs, <ore:craftingToolFile>],
            [recipeInputs, <ore:stickWood>, null],
            [<ore:craftingToolHardHammer>, <ore:stickWood>, null]]);
        recipes.addShaped(recipeHoeOutput * 1, [
            [recipeInputs, recipeInputs, <ore:craftingToolFile>],
            [<ore:craftingToolHardHammer>, <ore:stickWood>, null],
            [null, <ore:stickWood>, null]]);
        }