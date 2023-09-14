#loader contenttweaker

import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Item;
import mods.contenttweaker.Block;
import mods.contenttweaker.Color;
import mods.contenttweaker.Fluid;
import mods.contenttweaker.AxisAlignedBB;
import mods.contenttweaker.IItemFoodEaten;
import crafttweaker.potions.IPotion;

//Blocks
var iron_enriched_stone = VanillaFactory.createBlock("iron_enriched_stone", <blockmaterial:rock>);
iron_enriched_stone.register();

var basic_ingot_mold = VanillaFactory.createItem("basic_ingot_mold");
basic_ingot_mold.maxStackSize = 1;
basic_ingot_mold.register();

var basic_empty_shape_plate = VanillaFactory.createItem("basic_empty_shape_plate");
basic_empty_shape_plate.maxStackSize = 16;
basic_empty_shape_plate.register();