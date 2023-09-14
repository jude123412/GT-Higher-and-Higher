import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import crafttweaker.oredict.IOreDictEntry;

//Pure Daisy
    mods.botania.PureDaisy.addRecipe(<minecraft:cobblestone>, <minecraft:gravel>, 600);

//Manasteel Ingot
    mods.botania.ManaInfusion.addInfusion(<gregtech:meta_ingot:32000>, <minecraft:iron_ingot>, 1000);

//Manasteel Block
    mods.botania.ManaInfusion.addInfusion(<gregtech:meta_block_compressed_2000>, <minecraft:iron_block>, 9000);

//Dirt
    mods.botania.ManaInfusion.addInfusion(<minecraft:dirt>, <minecraft:dirt:1>, 250);

//Clay
    mods.botania.ManaInfusion.addInfusion(<minecraft:clay_ball>, <gregtech:meta_dust:1599>, 500);

//Living Root
    mods.botania.ManaInfusion.addInfusion(<botania:manaresource:20>, <minecraft:stick>, 500);

//Elven Trade
    mods.botania.ElvenTrade.addRecipe([<gregtech:meta_ingot:32002>], [<gregtech:meta_ingot:32000>, <gregtech:meta_ingot:32000>]);
    mods.botania.ElvenTrade.addRecipe([<gregtech:meta_block_compressed_2000:2>], [<gregtech:meta_block_compressed_2000>, <gregtech:meta_block_compressed_2000>]);

//Orchid
    val orechidRecipeArray = {
      <ore:oreCoal>:32000,
      <ore:oreIron>:8000,
      <ore:oreTin>:24000,
      <ore:oreCopper>:8000,
      <ore:oreLead>:8000,
      <ore:oreRedstone>:12000,
      <ore:oreGypsum>:8000,
      <ore:oreCalcite>:4000,
      <ore:oreDiamond>:4000,
      <ore:oreSulfur>:20000,
      <ore:oreSlimond>:16000
    }as int[IOreDictEntry];

    for key, value in orechidRecipeArray{
          mods.botania.Orechid.addOre(key, value);  
    }

//Water Bowl
    recipes.addShapeless(<botania:waterbowl>.withTag({Fluid: {FluidName: "water", Amount: 1000}}) * 1,[<botania:dye:11> * 1, <botania:dye:9> * 1, <minecraft:bowl> * 1]);

//Dilute Mana Pool
    recipes.addShaped(<botania:pool:2> * 1,
        [[null,null,null],
        [<botania:livingrock0slab>,null,<botania:livingrock0slab>],
        [<botania:livingrock>,<botania:livingrock>,<botania:livingrock>]]);
