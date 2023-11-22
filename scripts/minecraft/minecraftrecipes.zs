import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
//Flint
recipes.addShapeless(<minecraft:flint> * 1, [<minecraft:gravel>, <minecraft:gravel>, <minecraft:gravel>]);
//Bricks Block
    recipes.addShaped(<minecraft:brick_block> * 2, [
        [<ore:ingotBrick>, <ore:ingotBrick>, <ore:ingotBrick>],
        [<ore:ingotBrick>, <botania:waterbowl>.withTag({Fluid: {FluidName: "water", Amount: 1000}}), <ore:ingotBrick>],
        [<ore:ingotBrick>, <ore:ingotBrick>, <ore:ingotBrick>]
    ]);
//Stone Dust
recipes.addShaped(<gregtech:meta_dust:1599> * 1, [
    [null, <ore:cobblestone>, null],
    [null, <ore:craftingToolMortar>, null],
    [null, null, null]
]);
//Zanite Helmet
    recipes.addShaped(<aether_legacy:zanite_helmet> * 1, [
        [<ore:plateZanite>, <ore:plateZanite>, <ore:plateZanite>],
        [<ore:plateZanite>, <ore:craftingToolHardHammer>, <ore:plateZanite>],
        [null, null, null]
    ]);
//Zanite Chestplate
    recipes.addShaped(<aether_legacy:zanite_chestplate> * 1, [
        [<ore:plateZanite>, <ore:craftingToolHardHammer>, <ore:plateZanite>],
        [<ore:plateZanite>, <ore:plateZanite>, <ore:plateZanite>],
        [<ore:plateZanite>, <ore:plateZanite>, <ore:plateZanite>]
    ]);
//Zanite Leggings
    recipes.addShaped(<aether_legacy:zanite_leggings> * 1, [
        [<ore:plateZanite>, <ore:plateZanite>, <ore:plateZanite>],
        [<ore:plateZanite>, <ore:craftingToolHardHammer>, <ore:plateZanite>],
        [<ore:plateZanite>, null, <ore:plateZanite>]
    ]);
//Zanite Boots
    recipes.addShaped(<aether_legacy:zanite_boots> * 1, [
        [null, null, null],
        [<ore:plateZanite>, null, <ore:plateZanite>],
        [<ore:plateZanite>, <ore:craftingToolHardHammer>, <ore:plateZanite>]
    ]);
//Zanite Gloves
    recipes.addShaped(<aether_legacy:zanite_gloves> * 1, [
        [null, null, null],
        [<ore:plateZanite>, <ore:craftingToolHardHammer>, <ore:plateZanite>],
        [null, null, null]
    ]);
//Zanite Ring
    recipes.addShaped(<aether_legacy:zanite_ring> * 1, [
        [null, <ore:plateZanite>, null],
        [<ore:plateZanite>, <ore:craftingToolHardHammer>, <ore:plateZanite>],
        [null, <ore:plateZanite>, null]
    ]);
//Zanite Pendant
    recipes.addShaped(<aether_legacy:zanite_pendant> * 1, [
        [<ore:string>, <ore:string>, <ore:string>],
        [<ore:string>, <ore:craftingToolHardHammer>, <ore:string>],
        [null, <ore:plateZanite>, null]
    ]);
//Gravitite Helmet
    recipes.addShaped(<aether_legacy:gravitite_helmet> * 1, [
        [<ore:plateEnchantedGravitite>, <ore:plateEnchantedGravitite>, <ore:plateEnchantedGravitite>],
        [<ore:plateEnchantedGravitite>, <ore:craftingToolHardHammer>, <ore:plateEnchantedGravitite>],
        [null, null, null]
    ]);
//Gravitite Chestplate
    recipes.addShaped(<aether_legacy:gravitite_chestplate> * 1, [
        [<ore:plateEnchantedGravitite>, <ore:craftingToolHardHammer>, <ore:plateEnchantedGravitite>],
        [<ore:plateEnchantedGravitite>, <ore:plateEnchantedGravitite>, <ore:plateEnchantedGravitite>],
        [<ore:plateEnchantedGravitite>, <ore:plateEnchantedGravitite>, <ore:plateEnchantedGravitite>]
    ]);
//Gravitite Leggings
    recipes.addShaped(<aether_legacy:gravitite_leggings> * 1, [
        [<ore:plateEnchantedGravitite>, <ore:plateEnchantedGravitite>, <ore:plateEnchantedGravitite>],
        [<ore:plateEnchantedGravitite>, <ore:craftingToolHardHammer>, <ore:plateEnchantedGravitite>],
        [<ore:plateEnchantedGravitite>, null, <ore:plateEnchantedGravitite>]
    ]);
//Gravitite Boots
    recipes.addShaped(<aether_legacy:gravitite_boots> * 1, [
        [null, null, null],
        [<ore:plateEnchantedGravitite>, null, <ore:plateEnchantedGravitite>],
        [<ore:plateEnchantedGravitite>, <ore:craftingToolHardHammer>, <ore:plateEnchantedGravitite>]
    ]);
//Gravitite Gloves
    recipes.addShaped(<aether_legacy:gravitite_gloves> * 1, [
        [null, null, null],
        [<ore:plateEnchantedGravitite>, <ore:craftingToolHardHammer>, <ore:plateEnchantedGravitite>],
        [null, null, null]
    ]);
//Nether Key
    recipes.addShaped(<contenttweaker:nether_key> * 1, [
        [null, <ore:plateSteel>, <ore:plateSteel>],
        [null, <ore:plateSteel>, <ore:plateSteel>],
        [<ore:craftingToolHardHammer>, <ore:plateSteel>, <ore:plateSteel>]
    ]);
//Twilight Key
    recipes.addShaped(<contenttweaker:twilight_key> * 1, [
        [null, <ore:circuitMv>, <ore:plateBatteryAlloy>],
        [null, <ore:plateBatteryAlloy>, <ore:plateBatteryAlloy>],
        [<ore:craftingToolHardHammer>, <ore:plateBatteryAlloy>, <ore:plateBatteryAlloy>]
    ]);
//Aether Key

//End Key

//Bed
    recipes.addShaped(<minecraft:bed> * 1, [
        [<ore:wool>, <ore:wool>, <ore:wool>],
        [<ore:plankWood>, <ore:plankWood>, <ore:plankWood>],
        [<ore:fenceWood>, <ore:craftingToolSoftHammer>, <ore:fenceWood>]
    ]);

