
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;

//Intricate Circuit Board
    val forestryCircuitBoards = {
        <forestry:chipsets>.withTag({T: 0 as short}) * 1:[<ore:wireGtSingleRedAlloy> * 6, <ore:circuitUlv> * 1],
        <forestry:chipsets:1>.withTag({T: 1 as short}) * 1:[<ore:wireGtSingleRedAlloy> * 6, <ore:circuitLv> * 1],
        <forestry:chipsets:2>.withTag({T: 2 as short}) * 1:[<ore:wireGtSingleRedAlloy> * 6, <ore:circuitMv> * 1],
        <forestry:chipsets:3>.withTag({T: 3 as short}) * 1:[<ore:wireGtSingleRedAlloy> * 6, <ore:circuitHv> * 1]
    } as IIngredient[][IItemStack];
    for outputs, inputs in forestryCircuitBoards {
        assembler.recipeBuilder()
        .inputs(inputs)
        .outputs(outputs)
        .fluidInputs(<liquid:soldering_alloy> * 72)
        .duration(400)
        .circuit(17)
        .EUt(128)
        .buildAndRegister();
        }
//Electron Tubes
    val electronTubes = {
        <forestry:thermionic_tubes>:[<gregtech:meta_item_1:517> * 1, <ore:dustCopper> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:1>:[<gregtech:meta_item_1:517> * 1, <ore:dustTin> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:2>:[<gregtech:meta_item_1:517> * 1, <ore:dustBronze> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:4>:[<gregtech:meta_item_1:517> * 1, <ore:dustGold> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:5>:[<gregtech:meta_item_1:517> * 1, <ore:dustDiamond> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:6>:[<gregtech:meta_item_1:517> * 1, <ore:dustObsidian> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:7>:[<gregtech:meta_item_1:517> * 1, <ore:dustBlaze> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:9>:[<gregtech:meta_item_1:517> * 1, <ore:dustEmerald> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:10>:[<gregtech:meta_item_1:517> * 1, <ore:dustApatite> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:11>:[<gregtech:meta_item_1:517> * 1, <ore:dustLapis> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:12>:[<gregtech:meta_item_1:517> * 1, <ore:dustEnderEye> * 1, <ore:wireGtSingleRedAlloy> * 1],
        <forestry:thermionic_tubes:13>:[<gregtech:meta_item_1:517> * 1, <ore:dustRedAlloy> * 1, <ore:wireGtSingleRedAlloy> * 1],
    }as IIngredient[][IItemStack];
    for outputs, inputs in electronTubes {
        assembler.recipeBuilder()
        .inputs(inputs)
        .outputs(outputs)
        .fluidInputs(<liquid:soldering_alloy> * 72)
        .duration(200)
        .circuit(17)
        .EUt(128)
        .buildAndRegister();
    }
//Farm Block
    val farmBlock = {
        <forestry:ffarm>.withTag({FarmBlock: 0}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:stonebrick> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 1}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:stonebrick:1> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 2}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:stonebrick:2> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 3}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:brick_block> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 4}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:sandstone:2> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 5}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:sandstone:1> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 6}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:nether_brick> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 7}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:stonebrick:3> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 8}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:quartz_block> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 9}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:quartz_block:1> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm>.withTag({FarmBlock: 10}):[<ore:slabWood> * 2, <gregtech:meta_ingot:25> * 2, <minecraft:quartz_block:2> * 1, <forestry:thermionic_tubes:1> * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 0}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 0}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 1}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 1}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 2}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 2}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 3}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 3}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 4}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 4}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 5}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 5}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 6}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 6}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 7}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 7}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 8}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 8}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 9}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 9}) * 1],
        <forestry:ffarm:2>.withTag({FarmBlock: 10}):[<ore:gearTin> * 3, <forestry:ffarm>.withTag({FarmBlock: 10}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 0}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 0}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 1}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 1}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 2}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 2}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 3}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 3}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 4}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 4}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 5}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 5}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 6}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 6}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 7}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 7}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 8}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 8}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 9}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 9}) * 1],
        <forestry:ffarm:3>.withTag({FarmBlock: 10}):[<ore:gearTin> * 2, <ore:trapdoorWood> * 1, <forestry:ffarm>.withTag({FarmBlock: 10}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 0}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 0}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 1}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 1}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 2}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 2}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 3}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 3}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 4}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 4}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 5}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 5}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 6}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 6}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 7}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 7}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 8}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 8}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 9}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 9}) * 1],
        <forestry:ffarm:4>.withTag({FarmBlock: 10}):[<ore:gearTin> * 1, <ore:blockGlass> * 2, <forestry:ffarm>.withTag({FarmBlock: 10}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 0}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 0}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 1}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 1}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 2}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 2}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 3}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 3}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 4}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 4}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 5}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 5}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 6}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 6}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 7}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 7}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 8}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 8}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 9}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 9}) * 1],
        <forestry:ffarm:5>.withTag({FarmBlock: 10}):[<ore:wireGtSingleRedAlloy> * 2, <forestry:thermionic_tubes:4> * 1, <forestry:ffarm>.withTag({FarmBlock: 10}) * 1]
    }as IIngredient[][IItemStack];
    for outputs, inputs in farmBlock{
        assembler.recipeBuilder()
        .inputs(inputs)
        .outputs(outputs)
        .fluidInputs(<liquid:concrete> * 72)
        .duration(100)
        .circuit(17)
        .EUt(64)
        .buildAndRegister();
        }