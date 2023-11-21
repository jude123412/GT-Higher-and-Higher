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

//Custom Circuit Tiers UHV+
    val circuitZpm = <ore:circuitZpm>;
    val circuitUv = <ore:circuitUv>;
    val circuitUhv = <ore:circuitUhv>;
    val circuitUev = <ore:circuitUev>;
    val circuitUiv = <ore:circuitUiv>;
    val circuitUxv = <ore:circuitUxv>;
    val circuitOpv = <ore:circuitOpv>;
    val circuitMax = <ore:circuitMax>;

    circuitZpm.add(<contenttweaker:slimeware_processor>);
    circuitUv.addItems([<contenttweaker:slimeware_assembly>, <contenttweaker:lasertronic_processor>]);
    circuitUhv.addItems([<contenttweaker:slimeware_supercomputer>, <contenttweaker:lasertronic_assembly>, <contenttweaker:bohemian_processor>]);
    circuitUev.addItems([<contenttweaker:slimeware_mainframe>, <contenttweaker:lasertronic_supercomputer>, <contenttweaker:bohemian_assembly>, <contenttweaker:anti_processor>]);
    circuitUiv.addItems([<contenttweaker:lasertronic_mainframe>, <contenttweaker:bohemian_supercomputer>, <contenttweaker:anti_assembly>, <contenttweaker:multiversally_evolved_technolically_advanced_processor>]);
    circuitUxv.addItems([<contenttweaker:bohemian_mainframe>, <contenttweaker:anti_supercomputer>, <contenttweaker:multiversally_evolved_technolically_advanced_assembly>]);
    circuitOpv.addItems([<contenttweaker:anti_mainframe>, <contenttweaker:multiversally_evolved_technolically_advanced_supercomputer>]);
    circuitMax.addItems([<contenttweaker:multiversally_evolved_technolically_advanced_mainframe>]);

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