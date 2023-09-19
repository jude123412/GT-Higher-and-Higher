#loader contenttweaker

import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Item;
import mods.contenttweaker.Block;
import mods.contenttweaker.Color;
import mods.contenttweaker.Fluid;
import mods.contenttweaker.AxisAlignedBB;
import mods.contenttweaker.IItemFoodEaten;
import crafttweaker.potions.IPotion;

//Items
var nether_key = VanillaFactory.createItem("nether_key");
nether_key.maxStackSize = 1;
nether_key.register();

var twilight_key = VanillaFactory.createItem("twilight_key");
twilight_key.maxStackSize = 1;
twilight_key.register();

var aether_key = VanillaFactory.createItem("aether_key");
aether_key.maxStackSize = 1;
aether_key.register();


var end_key = VanillaFactory.createItem("end_key");
end_key.maxStackSize = 1;
end_key.register();
