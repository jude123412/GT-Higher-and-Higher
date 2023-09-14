
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;

//Stone Dust Crafting Table
recipes.addShaped(<gregtech:meta_dust:1599> * 1, [
    [null, <ore:cobblestone>, null],
    [null, <ore:craftingToolMortar>, null],
    [null, null, null]
]);

//Iron Ingot
val IronSmelting = [
    <gregtech:meta_crushed:51>,
    <gregtech:ore_iron_0>,
    <gregtech:meta_crushed_purified:2513>,
    <gregtech:meta_crushed_purified:337>,
    <gregtech:meta_dust_impure:51>,
    <gregtech:meta_dust:292>,
    <gregtech:meta_dust_impure:306>,
    <gregtech:meta_ingot:395>,
    <gregtech:meta_dust_impure:337>,
    <gregtech:meta_dust_impure:255>,
    <gregtech:meta_crushed_centrifuged:292>,
    <gregtech:meta_dust_pure:51>,
    <gregtech:meta_dust_pure:255>,
    <gregtech:meta_dust_impure:261>,
    <gregtech:ore_banded_iron_0>,
    <gregtech:meta_dust:51>,
    <gregtech:meta_crushed_purified:51>,
    <gregtech:meta_crushed_purified:292>,
    <gregtech:meta_crushed_purified:306>,
    <gregtech:meta_dust_pure:292>,
    <gregtech:meta_crushed:255>,
    <gregtech:meta_dust:2513>,
    <gregtech:meta_dust_pure:2513>,
    <gregtech:meta_crushed_centrifuged:255>,
    <gregtech:meta_crushed_purified:255>,
    <gregtech:meta_crushed_centrifuged:261>,
    <gregtech:meta_dust:261>,
    <gregtech:meta_dust:337>,
    <gregtech:meta_crushed:2513>,
    <gregtech:meta_dust_pure:337>,
    <gregtech:ore_basaltic_mineral_sand_0>,
    <gregtech:ore_magnetite_0>,
    <gregtech:meta_dust_pure:306>,
    <gregtech:meta_crushed_centrifuged:51>,
    <gregtech:meta_crushed:261>,
    <gregtech:meta_crushed:306>,
    <gregtech:ore_granitic_mineral_sand_0>,
    <gregtech:meta_crushed_purified:261>,
    <gregtech:meta_crushed_purified:2518>,
    <gregtech:meta_dust:306>,
    <gregtech:meta_dust_pure:261>,
    <gregtech:meta_crushed:292>,
    <gregtech:ore_pyrite_0>,
    <gregtech:meta_dust_pure:2518>,
    <gregtech:meta_dust:2518>,
    <minecraft:iron_ore>,
    <gregtech:ore_brown_limonite_0>,
    <gregtech:meta_crushed_centrifuged:306>,
    <gregtech:meta_dust_impure:2513>,
    <gregtech:meta_dust_impure:2518>,
    <gregtech:meta_crushed_centrifuged:2513>,
    <gregtech:meta_crushed_centrifuged:2518>,
    <gregtech:meta_crushed:337>,
    <gregtech:meta_dust_impure:292>,
    <gregtech:meta_crushed_centrifuged:337>,
    <gregtech:meta_dust:255>,
    <gregtech:meta_crushed:2518>,
    <gregtech:ore_yellow_limonite_0>
]as IItemStack[];

for item in IronSmelting{
    alloy_smelter.recipeBuilder()
    .inputs(item * 1)
    .outputs(<minecraft:iron_ingot> * 1)
    .notConsumable(<contenttweaker:basic_ingot_mold>)
    .duration(80)
    .EUt(4)
    .buildAndRegister();
}
val IronSmeltingNetherEnd = [
    <gregtech:ore_iron_0:2>,
    <gregtech:ore_banded_iron_0:1>,
    <gregtech:ore_banded_iron_0:2>,
    <gregtech:ore_yellow_limonite_0:2>,
    <gregtech:ore_pyrite_0:2>,
    <gregtech:ore_magnetite_0:1>,
    <gregtech:ore_magnetite_0:2>,
    <gregtech:ore_pyrite_0:1>,
    <gregtech:ore_granitic_mineral_sand_0:1>,
    <gregtech:ore_iron_0:1>,
    <gregtech:ore_yellow_limonite_0:1>,
    <gregtech:ore_brown_limonite_0:1>,
    <gregtech:ore_brown_limonite_0:2>,
    <gregtech:ore_granitic_mineral_sand_0:2>,
    <gregtech:ore_basaltic_mineral_sand_0:1>,
    <gregtech:ore_basaltic_mineral_sand_0:2>
]as IItemStack[];

for item in IronSmeltingNetherEnd{
    alloy_smelter.recipeBuilder()
    .inputs(item * 1)
    .outputs(<minecraft:iron_ingot> * 2)
    .notConsumable(<contenttweaker:basic_ingot_mold>)
    .duration(80)
    .EUt(4)
    .buildAndRegister();
}

//Slimond
    compressor.recipeBuilder()
    .inputs(<ore:dustSlimond> * 1)
    .outputs(<gregtech:meta_gem:32004> * 1)
    .duration(160)
    .EUt(2)
    .buildAndRegister();
//Sticky Resin
    alloy_smelter.recipeBuilder()
    .inputs(<ore:gemSlimond> * 1)
    .outputs(<gregtech:meta_item_1:438> * 1)
    .notConsumable(<gregtech:meta_item_1:17>)
    .duration(60)
    .EUt(4)
    .buildAndRegister();

