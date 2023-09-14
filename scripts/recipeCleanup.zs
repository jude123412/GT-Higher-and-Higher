import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;
import crafttweaker.oredict.IOreDictEntry;

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
        <extrautils2:user>,
        <extrautils2:miner>,
        <extrautils2:scanner>
    ]as IItemStack[];

    for items in CraftingTableArray{
        recipes.remove(items);
    } 

//Carpenter Recipe Removal
    val CarpenterArray = [
        <forestry:crated.ingotbronze>,
        <forestry:ingot_bronze>
    ]as IItemStack[];

    for items in CarpenterArray {
        mods.forestry.Carpenter.removeRecipe(items);
    }

//Furnace Recipe Removal
    val FurnaceArray = [
        <minecraft:coal:1>,
        <minecraft:iron_ingot>,
        <gregtech:meta_item_1:353>
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