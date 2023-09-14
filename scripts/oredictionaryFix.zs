import crafttweaker.oredict.IOreDictEntry;
import crafttweaker.item.IItemStack;

//Ore Dictionary Register
    val oreGold = <ore:oreGold>;
    val oreIron = <ore:oreIron>;
    val oreCoal = <ore:oreCoal>;
    val oreEmerald = <ore:oreEmerald>;
    val oreDiamond = <ore:oreDiamond>;
    val oreApatite = <ore:oreApatite>;
    val oreCopper = <ore:oreCopper>;
    val oreTin = <ore:oreTin>;
    val oreRedstone = <ore:oreRedstone>;
    val oreLapis = <ore:oreLapis>;

//Ore Dictionary Remove
    oreGold.remove(<minecraft:gold_ore>);
    oreIron.remove(<minecraft:iron_ore>);
    oreCoal.remove(<minecraft:coal_ore>);
    oreEmerald.remove(<minecraft:emerald_ore>);
    oreDiamond.remove(<minecraft:diamond_ore>);
    oreApatite.removeItems([<forestry:resources>]);
    oreCopper.removeItems([<forestry:resources:1>]);
    oreTin.removeItems([<forestry:resources:2>]);
    oreRedstone.remove(<minecraft:redstone_ore>);
    oreLapis.remove(<minecraft:lapis_ore>);