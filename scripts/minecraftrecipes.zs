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
