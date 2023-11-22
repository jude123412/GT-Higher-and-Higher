import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDictEntry;

// Mana Infusion
val manaInfusionRecipeInputs = [
    <minecraft:stick>,
    <gregtech:meta_dust:1599>,
    <minecraft:dirt:1>,
    <gregtech:meta_block_compressed_20:4>,
    <gregtech:meta_ingot:324>
] as IIngredient[];

val manaInfusionRecipeManaCosts = [
    500,
    500,
    250,
    8000,
    1000
] as int[];

val manaInfusionRecipeOutputs = [
    <botania:manaresource:20>,
    <minecraft:clay_ball>,
    <minecraft:dirt>,
    <gregtech:meta_block_compressed_2000>,
    <gregtech:meta_ingot:32000>
] as IItemStack[];

for index, recipeInput in manaInfusionRecipeInputs {
    val recipeOutput = manaInfusionRecipeOutputs[index];
    val recipeManaCost = manaInfusionRecipeManaCosts[index];

    mods.botania.ManaInfusion.addInfusion(recipeOutput, recipeInput, recipeManaCost);
}


//Elementium Ingot
    mods.botania.ElvenTrade.addRecipe([<gregtech:meta_ingot:32002>], [<gregtech:meta_ingot:32000>, <gregtech:meta_ingot:32000>]);

//Elementium Block
    mods.botania.ElvenTrade.addRecipe([<gregtech:meta_block_compressed_2000:2>], [<gregtech:meta_block_compressed_2000>, <gregtech:meta_block_compressed_2000>]);

//Orchid Ignem
    mods.botania.Apothecary.addRecipe(<botania:specialflower>.withTag({type: "orechidIgnem"}), [<ore:petalRed>, <ore:petalRed>, <ore:petalWhite>, <ore:petalWhite>, <ore:petalPink>, <ore:redstoneRoot>, <ore:runeGreedB>, <ore:runePrideB>, <ore:blockZanite>, <ore:blockEnchantedGravitite>]);

//Petro Petunia
    mods.botania.Apothecary.addRecipe(<botania:specialflower>.withTag({type: "petro_petunia"}), [<ore:petalBrown>, <ore:petalBlack>, <ore:petalOrange>, <ore:runeGluttonyB>, <ore:runeWrathB>, <ore:runeSlothB>, <ore:redstoneRoot>, <ore:elvenDragonstone>, <ore:ingotTerrasteel>]);

//Orchid Ores
    val orechidRecipeArray = {
      <ore:oreCoal>:32000,
      <ore:oreIron>:8000,
      <ore:oreTin>:8000,
      <ore:oreCopper>:24000,
      <ore:oreLead>:8000,
      <ore:oreRedstone>:12000,
      <ore:oreGypsum>:8000,
      <ore:oreCalcite>:8000,
      <ore:oreDiamond>:4000,
      <ore:oreSulfur>:20000,
      <ore:oreSlimond>:16000,
      <ore:oreGold>:8000,
      <ore:oreEmerald>:8000
    } as int[IOreDictEntry];

    for key, value in orechidRecipeArray {
        mods.botania.Orechid.addOre(key, value);  
    }
//Water Bowl
    recipes.addShapeless(<botania:waterbowl>.withTag({Fluid: {FluidName: "water", Amount: 1000}}) * 1,[<botania:dye:11> * 1, <botania:dye:9> * 1, <minecraft:bowl> * 1]);

//Dilute Mana Pool
    recipes.addShaped(<botania:pool:2> * 1,
        [[null,null,null],
        [<botania:livingrock0slab>,null,<botania:livingrock0slab>],
        [<botania:livingrock>,<botania:livingrock>,<botania:livingrock>]]);
