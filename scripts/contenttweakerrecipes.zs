import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;

    recipes.addShaped(<contenttweaker:basic_empty_shape_plate> * 1, [
        [<ore:craftingToolHardHammer>, <ore:craftingToolFile>, null],
        [<ore:plateGold>, <ore:plateGold>, null],
        [<ore:plateGold>, <ore:plateGold>, null]
    ]);

    recipes.addShaped(<contenttweaker:basic_ingot_mold> * 1, [
        [null, null, null],
        [null, <contenttweaker:basic_empty_shape_plate>, null],
        [null, <ore:craftingToolHardHammer>, null]
    ]);