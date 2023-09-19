#priority -9998

import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidDefinition;
import crafttweaker.liquid.ILiquidStack;
import crafttweaker.mods.IMod;
import crafttweaker.oredict.IOreDict;
import crafttweaker.oredict.IOreDictEntry;
//Hide Catagory
    val hiddenCatagorys = [
        "forestry.bottler",
        "forestry.fermenter",
        "forestry.moistener",
        "forestry.still"
    ]as string[];
    for items in hiddenCatagorys{
        mods.jei.JEI.hideCategory(items);
    }
//Hide Items
    val hiddenItems = [
        <botania:storage>,
        <botania:manaresource>,
        <forestry:ingot_bronze>,
        <forestry:gear_bronze>,
        <forestry:resource_storage:3>,
        <gregtech:meta_item_1:350>,
        <botania:manaresource:7>,
        <botania:storage:2>,
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
        <aether_legacy:chain_gloves>,
        <aether_legacy:diamond_gloves>,
        <aether_legacy:iron_ring>,
        <aether_legacy:golden_ring>,
        <aether_legacy:iron_pendant>,
        <aether_legacy:golden_pendant>,
        <aether_legacy:enchanted_gravitite>,
        <draconicevolution:magnet>,
        <draconicevolution:magnet:1>,
        <forestry:resources>,
        <forestry:resources:1>,
        <forestry:resources:2>,
        <forestry:resource_storage>,
        <forestry:resource_storage:1>,
        <forestry:resource_storage:2>,
        <forestry:broken_bronze_pickaxe>,
        <forestry:broken_bronze_shovel>,
        <forestry:bronze_pickaxe>,
        <forestry:bronze_shovel>,
        <forestry:kit_shovel>,
        <forestry:kit_pickaxe>,
        <forestry:ingot_copper>,
        <forestry:ingot_tin>,
        <forestry:wrench>,
        <forestry:apatite>,
        <forestry:pipette>,
        <forestry:bottler>,
        <forestry:flexible_casing>,
    ]as IItemStack[];

    for items in hiddenItems{
        mods.jei.JEI.hide(items);
    }

/* Hide all of AE2's facades (can still be crafted, just hiding from JEI) */
val ae2 as IMod = loadedMods["appliedenergistics2"];
if(!isNull(ae2)) {
    val ae2Items as IItemStack[] = ae2.items;

    for item in ae2Items {
        if(item.displayName has "Cable Facade") {
            if(item.displayName has "Block of Neutronium") {
                item.addTooltip(format.darkAqua("Facades can be crafted from most blocks, but are hidden from JEI to reduce clutter"));
            }
            else {
               mods.jei.JEI.hide(item); 
            }
        }
    }
}

//Adding a tooltop to the GTCEu facade
<gregtech:meta_item_1:330>.withTag({Facade: {id: "minecraft:stone", Count: 1 as byte, Damage: 0 as short}}).addTooltip(format.darkAqua("GTCEu Cable facades can be made from most non-tile-entites, and craft into different amounts based on the metal used."));


