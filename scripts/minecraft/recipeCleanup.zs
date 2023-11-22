#priority 2000

import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMap;
import mods.aether_legacy.Enchanter;

//Crafting Table Recipe Removal
    val CraftingTableArray = [
        <botania:storage>,
        <botania:manaresource>,
        <botania:manaresource:7>,
        <botania:storage:2>,
        <botania:pool:2>,
        <botania:pool>,
        <forestry:ingot_bronze>,
        <forestry:gear_bronze>,
        <forestry:resource_storage:3>,
        <forestry:raintank>,
        <minecraft:bed>, 
        <minecraft:bed:1>,
        <minecraft:bed:2>,
        <minecraft:bed:3>,
        <minecraft:bed:4>,
        <minecraft:bed:5>,
        <minecraft:bed:6>,
        <minecraft:bed:7>,
        <minecraft:bed:8>,
        <minecraft:bed:9>,
        <minecraft:bed:10>,
        <minecraft:bed:11>,
        <minecraft:bed:12>,
        <minecraft:bed:13>,
        <minecraft:bed:14>,
        <minecraft:bed:15>,
        <gregtech:meta_item_1:350>,
        <botania:manaresource:6>,
        <aether_legacy:gravitite_shovel>,
        <aether_legacy:gravitite_axe>,
        <aether_legacy:gravitite_pickaxe>,
        <aether_legacy:zanite_shovel>,
        <aether_legacy:zanite_axe>,
        <aether_legacy:zanite_pickaxe>,
        <aether_legacy:holystone_shovel>,
        <aether_legacy:holystone_axe>,
        <aether_legacy:holystone_pickaxe>,
        <aether_legacy:skyroot_shovel>,
        <aether_legacy:skyroot_axe>,
        <aether_legacy:skyroot_pickaxe>,
        <aether_legacy:gravitite_sword>,
        <aether_legacy:zanite_sword>,
        <aether_legacy:holystone_sword>,
        <aether_legacy:skyroot_sword>,
        <aether_legacy:leather_gloves>,
        <aether_legacy:iron_gloves>,
        <aether_legacy:golden_gloves>,
        <aether_legacy:diamond_gloves>,
        <aether_legacy:iron_ring>,
        <aether_legacy:golden_ring>,
        <aether_legacy:iron_pendant>,
        <aether_legacy:golden_pendant>,
        <aether_legacy:gravitite_helmet>,
        <aether_legacy:gravitite_chestplate>,
        <aether_legacy:gravitite_leggings>,
        <aether_legacy:gravitite_boots>,
        <aether_legacy:gravitite_gloves>,
        <aether_legacy:zanite_helmet>,
        <aether_legacy:zanite_chestplate>,
        <aether_legacy:zanite_leggings>,
        <aether_legacy:zanite_boots>,
        <aether_legacy:zanite_gloves>,
        <aether_legacy:zanite_ring>,
        <aether_legacy:zanite_pendant>,
        <aether_legacy:enchanter>,
        <gregtech:meta_item_1:402>,
        <gregtech:meta_item_1:381>,
        <draconicevolution:magnet>,
        <draconicevolution:magnet:1>,
        <forestry:bronze_pickaxe>,
        <forestry:bronze_shovel>,
        <forestry:kit_shovel>,
        <forestry:kit_pickaxe>,
        <forestry:ingot_copper>,
        <forestry:ingot_tin>,
        <forestry:wrench>,
        <forestry:resource_storage>,
        <forestry:resource_storage:1>,
        <forestry:resource_storage:2>,
        <forestry:apatite>,
        <forestry:pipette>,
        <forestry:bottler>,
        <forestry:carpenter>,
        <forestry:centrifuge>,
        <forestry:fermenter>,
        <forestry:moistener>,
        <forestry:squeezer>,
        <forestry:still>,
        <forestry:fabricator>,
        <forestry:sturdy_machine>,
        <forestry:apiary>,
        <forestry:analyzer>,
        <forestry:habitat_former>,
        <forestry:database>,
        <forestry:rainmaker>,
        <forestry:alveary.plain>,
        <minecraft:wooden_sword>,
        <minecraft:wooden_shovel>,
        <minecraft:wooden_pickaxe>,
        <minecraft:wooden_axe>,
        <minecraft:wooden_hoe>,
        <minecraft:stone_sword>,
        <minecraft:stone_shovel>,
        <minecraft:stone_pickaxe>,
        <minecraft:stone_axe>,
        <minecraft:stone_hoe>,
        <forestry:ffarm>.withTag({FarmBlock: 0}),
        <forestry:ffarm>.withTag({FarmBlock: 1}),
        <forestry:ffarm>.withTag({FarmBlock: 2}),
        <forestry:ffarm>.withTag({FarmBlock: 3}),
        <forestry:ffarm>.withTag({FarmBlock: 4}),
        <forestry:ffarm>.withTag({FarmBlock: 5}),
        <forestry:ffarm>.withTag({FarmBlock: 6}),
        <forestry:ffarm>.withTag({FarmBlock: 7}),
        <forestry:ffarm>.withTag({FarmBlock: 8}),
        <forestry:ffarm>.withTag({FarmBlock: 9}),
        <forestry:ffarm>.withTag({FarmBlock: 10}),
        <forestry:ffarm:2>.withTag({FarmBlock: 0}),
        <forestry:ffarm:2>.withTag({FarmBlock: 1}),
        <forestry:ffarm:2>.withTag({FarmBlock: 2}),
        <forestry:ffarm:2>.withTag({FarmBlock: 3}),
        <forestry:ffarm:2>.withTag({FarmBlock: 4}),
        <forestry:ffarm:2>.withTag({FarmBlock: 5}),
        <forestry:ffarm:2>.withTag({FarmBlock: 6}),
        <forestry:ffarm:2>.withTag({FarmBlock: 7}),
        <forestry:ffarm:2>.withTag({FarmBlock: 8}),
        <forestry:ffarm:2>.withTag({FarmBlock: 9}),
        <forestry:ffarm:2>.withTag({FarmBlock: 10}),
        <forestry:ffarm:3>.withTag({FarmBlock: 0}),
        <forestry:ffarm:3>.withTag({FarmBlock: 1}),
        <forestry:ffarm:3>.withTag({FarmBlock: 2}),
        <forestry:ffarm:3>.withTag({FarmBlock: 3}),
        <forestry:ffarm:3>.withTag({FarmBlock: 4}),
        <forestry:ffarm:3>.withTag({FarmBlock: 5}),
        <forestry:ffarm:3>.withTag({FarmBlock: 6}),
        <forestry:ffarm:3>.withTag({FarmBlock: 7}),
        <forestry:ffarm:3>.withTag({FarmBlock: 8}),
        <forestry:ffarm:3>.withTag({FarmBlock: 9}),
        <forestry:ffarm:3>.withTag({FarmBlock: 10}),
        <forestry:ffarm:4>.withTag({FarmBlock: 0}),
        <forestry:ffarm:4>.withTag({FarmBlock: 1}),
        <forestry:ffarm:4>.withTag({FarmBlock: 2}),
        <forestry:ffarm:4>.withTag({FarmBlock: 3}),
        <forestry:ffarm:4>.withTag({FarmBlock: 4}),
        <forestry:ffarm:4>.withTag({FarmBlock: 5}),
        <forestry:ffarm:4>.withTag({FarmBlock: 6}),
        <forestry:ffarm:4>.withTag({FarmBlock: 7}),
        <forestry:ffarm:4>.withTag({FarmBlock: 8}),
        <forestry:ffarm:4>.withTag({FarmBlock: 9}),
        <forestry:ffarm:4>.withTag({FarmBlock: 10}),
        <forestry:ffarm:5>.withTag({FarmBlock: 0}),
        <forestry:ffarm:5>.withTag({FarmBlock: 1}),
        <forestry:ffarm:5>.withTag({FarmBlock: 2}),
        <forestry:ffarm:5>.withTag({FarmBlock: 3}),
        <forestry:ffarm:5>.withTag({FarmBlock: 4}),
        <forestry:ffarm:5>.withTag({FarmBlock: 5}),
        <forestry:ffarm:5>.withTag({FarmBlock: 6}),
        <forestry:ffarm:5>.withTag({FarmBlock: 7}),
        <forestry:ffarm:5>.withTag({FarmBlock: 8}),
        <forestry:ffarm:5>.withTag({FarmBlock: 9}),
        <forestry:ffarm:5>.withTag({FarmBlock: 10}),
        <aether_legacy:freezer>,
    ]as IItemStack[];

    for items in CraftingTableArray{
        recipes.remove(items);
    } 

//Carpenter Recipe Removal
    val CarpenterArray = [
        <forestry:ingot_bronze>
    ]as IItemStack[];

    for items in CarpenterArray {
        mods.forestry.Carpenter.removeRecipe(items);
    }

//Furnace Recipe Removal
    val FurnaceArray = [
        <minecraft:coal:1>,
        <gregtech:meta_item_1:353>,
    ]as IItemStack[];

    for items in FurnaceArray {
        furnace.remove(items);
    }

//Orchid Recipe Removal
    val orchidArray = [
        <ore:oreSilver>,
        <ore:oreCertusQuartz>,
        <ore:oreBlueTopaz>,
        <ore:oreCinnabar>,
        <ore:oreNickel>,
        <ore:oreApatite>,
        <ore:oreLapis>,
        <ore:oreRuby>,
        <ore:oreSapphire>,
        <ore:oreOlivine>,
        <ore:oreGalena>,
        <ore:oreEmerald>,
        <ore:orePlatinum>,
    ]as IOreDictEntry[];
    for items in orchidArray{
        mods.botania.Orechid.removeOre(items);
    }

//Mana Infusion Recipe Removal
    val manaInfusionArray = [
        <botania:manaresource>,
        <botania:storage>
    ]as IItemStack[];
    for items in manaInfusionArray{
        mods.botania.ManaInfusion.removeRecipe(items);
    }

//Eleven Trade Recipe Removal
    val elvenTradeArray = [
        <botania:storage:2>,
        <botania:manaresource:7>
    ]as IItemStack[];
    for items in elvenTradeArray{
        mods.botania.ElvenTrade.removeRecipe(items);
    }
//Apothecary Recipe Removal
    val apothecaryArray = [
        <botania:specialflower>.withTag({type: "orechidIgnem"})
    ]as IItemStack[];
    for items in apothecaryArray{
        mods.botania.Apothecary.removeRecipe(items);
    }
//Shapeless Recipe Removal
    val shapelessArray = {
        <aether_legacy:zanite_block>:[<gregtech:meta_dust:32005>, <gregtech:meta_dust:32005>, <gregtech:meta_dust:32005>, <gregtech:meta_dust:32005>, <gregtech:meta_dust:32005>, <gregtech:meta_dust:32005>, <gregtech:meta_dust:32005>, <gregtech:meta_dust:32005>, <gregtech:meta_dust:32005>],
        <gregtech:meta_dust:32005>:[<aether_legacy:zanite_block>]
    }as IIngredient[][IItemStack];
    for recipe, inputs in shapelessArray{
        recipes.removeShapeless(recipe, inputs);
    }
//Input Recipe Removal
    val inputRecipeArray = [
        <gregtech:meta_gear:1599>
    ]as IIngredient[];
    for items in inputRecipeArray{
        recipes.removeByInput(items);
    }
//Aether Alter Recipe Removal
    val alterArray = [
        <aether_legacy:enchanted_gravitite>
    ]as IItemStack[];
    for items in alterArray{
        Enchanter.removeEnchantment(items);
    }