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
        <forestry:logs.fireproof.0>,
        <forestry:logs.fireproof.0:1>,
        <forestry:logs.fireproof.0:2>,
        <forestry:logs.fireproof.0:3>,
        <forestry:logs.fireproof.1>,
        <forestry:logs.fireproof.1:1>,
        <forestry:logs.fireproof.1:2>,
        <forestry:logs.fireproof.1:3>,
        <forestry:logs.fireproof.2>,
        <forestry:logs.fireproof.2:1>,
        <forestry:logs.fireproof.2:2>,
        <forestry:logs.fireproof.2:3>,
        <forestry:logs.fireproof.3>,
        <forestry:logs.fireproof.3:1>,
        <forestry:logs.fireproof.3:2>,
        <forestry:logs.fireproof.3:3>,
        <forestry:logs.fireproof.4>,
        <forestry:logs.fireproof.4:1>,
        <forestry:logs.fireproof.4:2>,
        <forestry:logs.fireproof.4:3>,
        <forestry:logs.fireproof.5>,
        <forestry:logs.fireproof.5:1>,
        <forestry:logs.fireproof.5:2>,
        <forestry:logs.fireproof.5:3>,
        <forestry:logs.fireproof.6>,
        <forestry:logs.fireproof.6:1>,
        <forestry:logs.fireproof.6:2>,
        <forestry:logs.fireproof.6:3>,
        <forestry:logs.fireproof.7>,
        <forestry:logs.vanilla.fireproof.0>,
        <forestry:logs.vanilla.fireproof.0:1>,
        <forestry:logs.vanilla.fireproof.0:2>,
        <forestry:logs.vanilla.fireproof.0:3>,
        <forestry:logs.vanilla.fireproof.1>,
        <forestry:logs.vanilla.fireproof.1:1>,
        <forestry:planks.fireproof.0>,
        <forestry:planks.fireproof.0:1>,
        <forestry:planks.fireproof.0:2>,
        <forestry:planks.fireproof.0:3>,
        <forestry:planks.fireproof.0:4>,
        <forestry:planks.fireproof.0:5>,
        <forestry:planks.fireproof.0:6>,
        <forestry:planks.fireproof.0:7>,
        <forestry:planks.fireproof.0:8>,
        <forestry:planks.fireproof.0:9>,
        <forestry:planks.fireproof.0:10>,
        <forestry:planks.fireproof.0:11>,
        <forestry:planks.fireproof.0:12>,
        <forestry:planks.fireproof.0:13>,
        <forestry:planks.fireproof.0:14>,
        <forestry:planks.fireproof.0:15>,
        <forestry:planks.fireproof.1>,
        <forestry:planks.fireproof.1:1>,
        <forestry:planks.fireproof.1:2>,
        <forestry:planks.fireproof.1:3>,
        <forestry:planks.fireproof.1:4>,
        <forestry:planks.fireproof.1:5>,
        <forestry:planks.fireproof.1:6>,
        <forestry:planks.fireproof.1:7>,
        <forestry:planks.fireproof.1:8>,
        <forestry:planks.fireproof.1:9>,
        <forestry:planks.fireproof.1:10>,
        <forestry:planks.fireproof.1:11>,
        <forestry:planks.fireproof.1:12>,
        <forestry:planks.vanilla.fireproof.0>,
        <forestry:planks.vanilla.fireproof.0:1>,
        <forestry:planks.vanilla.fireproof.0:2>,
        <forestry:planks.vanilla.fireproof.0:3>,
        <forestry:planks.vanilla.fireproof.0:4>,
        <forestry:planks.vanilla.fireproof.0:5>,
        <forestry:slabs.fireproof.0>,
        <forestry:slabs.fireproof.0:1>,
        <forestry:slabs.fireproof.0:2>,
        <forestry:slabs.fireproof.0:3>,
        <forestry:slabs.fireproof.0:4>,
        <forestry:slabs.fireproof.0:5>,
        <forestry:slabs.fireproof.0:6>,
        <forestry:slabs.fireproof.0:7>,
        <forestry:slabs.fireproof.1>,
        <forestry:slabs.fireproof.1:1>,
        <forestry:slabs.fireproof.1:2>,
        <forestry:slabs.fireproof.1:3>,
        <forestry:slabs.fireproof.1:4>,
        <forestry:slabs.fireproof.1:5>,
        <forestry:slabs.fireproof.1:6>,
        <forestry:slabs.fireproof.1:7>,
        <forestry:slabs.fireproof.2>,
        <forestry:slabs.fireproof.2:1>,
        <forestry:slabs.fireproof.2:2>,
        <forestry:slabs.fireproof.2:3>,
        <forestry:slabs.fireproof.2:4>,
        <forestry:slabs.fireproof.2:5>,
        <forestry:slabs.fireproof.2:6>,
        <forestry:slabs.fireproof.2:7>,
        <forestry:slabs.fireproof.3>,
        <forestry:slabs.fireproof.3:1>,
        <forestry:slabs.fireproof.3:2>,
        <forestry:slabs.fireproof.3:3>,
        <forestry:slabs.fireproof.3:4>,
        <forestry:slabs.vanilla.fireproof.0>,
        <forestry:slabs.vanilla.fireproof.0:1>,
        <forestry:slabs.vanilla.fireproof.0:2>,
        <forestry:slabs.vanilla.fireproof.0:3>,
        <forestry:slabs.vanilla.fireproof.0:4>,
        <forestry:slabs.vanilla.fireproof.0:5>,
        <forestry:fences.fireproof.0>,
        <forestry:fences.fireproof.0:1>,
        <forestry:fences.fireproof.0:2>,
        <forestry:fences.fireproof.0:3>,
        <forestry:fences.fireproof.0:4>,
        <forestry:fences.fireproof.0:5>,
        <forestry:fences.fireproof.0:6>,
        <forestry:fences.fireproof.0:7>,
        <forestry:fences.fireproof.0:8>,
        <forestry:fences.fireproof.0:9>,
        <forestry:fences.fireproof.0:10>,
        <forestry:fences.fireproof.0:11>,
        <forestry:fences.fireproof.0:12>,
        <forestry:fences.fireproof.0:13>,
        <forestry:fences.fireproof.0:14>,
        <forestry:fences.fireproof.0:15>,
        <forestry:fences.fireproof.1>,
        <forestry:fences.fireproof.1:1>,
        <forestry:fences.fireproof.1:2>,
        <forestry:fences.fireproof.1:3>,
        <forestry:fences.fireproof.1:4>,
        <forestry:fences.fireproof.1:5>,
        <forestry:fences.fireproof.1:6>,
        <forestry:fences.fireproof.1:7>,
        <forestry:fences.fireproof.1:8>,
        <forestry:fences.fireproof.1:9>,
        <forestry:fences.fireproof.1:10>,
        <forestry:fences.fireproof.1:11>,
        <forestry:fences.fireproof.1:12>,
        <forestry:fences.vanilla.fireproof.0>,
        <forestry:fences.vanilla.fireproof.0:1>,
        <forestry:fences.vanilla.fireproof.0:2>,
        <forestry:fences.vanilla.fireproof.0:3>,
        <forestry:fences.vanilla.fireproof.0:4>,
        <forestry:fences.vanilla.fireproof.0:5>,
        <forestry:fence.gates.fireproof.larch>,
        <forestry:fence.gates.fireproof.teak>,
        <forestry:fence.gates.fireproof.acacia>,
        <forestry:fence.gates.fireproof.lime>,
        <forestry:fence.gates.fireproof.chestnut>,
        <forestry:fence.gates.fireproof.wenge>,
        <forestry:fence.gates.fireproof.baobab>,
        <forestry:fence.gates.fireproof.sequoia>,
        <forestry:fence.gates.fireproof.kapok>,
        <forestry:fence.gates.fireproof.ebony>,
        <forestry:fence.gates.fireproof.mahogany>,
        <forestry:fence.gates.fireproof.balsa>,
        <forestry:fence.gates.fireproof.willow>,
        <forestry:fence.gates.fireproof.walnut>,
        <forestry:fence.gates.fireproof.greenheart>,
        <forestry:fence.gates.fireproof.cherry>,
        <forestry:fence.gates.fireproof.mahoe>,
        <forestry:fence.gates.fireproof.poplar>,
        <forestry:fence.gates.fireproof.palm>,
        <forestry:fence.gates.fireproof.papaya>,
        <forestry:fence.gates.fireproof.pine>,
        <forestry:fence.gates.fireproof.plum>,
        <forestry:fence.gates.fireproof.maple>,
        <forestry:fence.gates.fireproof.citrus>,
        <forestry:fence.gates.fireproof.giganteum>,
        <forestry:fence.gates.fireproof.ipe>,
        <forestry:fence.gates.fireproof.padauk>,
        <forestry:fence.gates.fireproof.cocobolo>,
        <forestry:fence.gates.fireproof.zebrawood>,
        <forestry:fence.gates.vanilla.fireproof.oak>,
        <forestry:fence.gates.vanilla.fireproof.spruce>,
        <forestry:fence.gates.vanilla.fireproof.birch>,
        <forestry:fence.gates.vanilla.fireproof.jungle>,
        <forestry:fence.gates.vanilla.fireproof.acacia>,
        <forestry:fence.gates.vanilla.fireproof.dark_oak>,
        <forestry:stairs.fireproof.larch>,
        <forestry:stairs.fireproof.teak>,
        <forestry:stairs.fireproof.acacia>,
        <forestry:stairs.fireproof.lime>,
        <forestry:stairs.fireproof.chestnut>,
        <forestry:stairs.fireproof.wenge>,
        <forestry:stairs.fireproof.baobab>,
        <forestry:stairs.fireproof.sequoia>,
        <forestry:stairs.fireproof.kapok>,
        <forestry:stairs.fireproof.ebony>,
        <forestry:stairs.fireproof.mahogany>,
        <forestry:stairs.fireproof.balsa>,
        <forestry:stairs.fireproof.willow>,
        <forestry:stairs.fireproof.walnut>,
        <forestry:stairs.fireproof.greenheart>,
        <forestry:stairs.fireproof.cherry>,
        <forestry:stairs.fireproof.mahoe>,
        <forestry:stairs.fireproof.poplar>,
        <forestry:stairs.fireproof.palm>,
        <forestry:stairs.fireproof.papaya>,
        <forestry:stairs.fireproof.pine>,
        <forestry:stairs.fireproof.plum>,
        <forestry:stairs.fireproof.maple>,
        <forestry:stairs.fireproof.citrus>,
        <forestry:stairs.fireproof.giganteum>,
        <forestry:stairs.fireproof.ipe>,
        <forestry:stairs.fireproof.padauk>,
        <forestry:stairs.fireproof.cocobolo>,
        <forestry:stairs.fireproof.zebrawood>,
        <forestry:stairs.vanilla.fireproof.oak>,
        <forestry:stairs.vanilla.fireproof.spruce>,
        <forestry:stairs.vanilla.fireproof.birch>,
        <forestry:stairs.vanilla.fireproof.jungle>,
        <forestry:stairs.vanilla.fireproof.acacia>,
        <forestry:stairs.vanilla.fireproof.dark_oak>,
        <gregtech:wire_coil:1>,
        <gregtech:wire_coil:2>,
        <gregtech:wire_coil:3>,
        <gregtech:wire_coil:4>,
        <gregtech:wire_coil:5>,
        <gregtech:wire_coil:6>,
        <gregtech:wire_coil:7>,
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


