import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMap;

//Items
val integratedLogicCircuit = <gregtech:meta_item_1:623>;
val goodIntegratedCircuit = <gregtech:meta_item_1:624>;
val circuitBoard = <gregtech:meta_item_1:401>;
val goodCircuitBoard = <gregtech:meta_item_1:402>;
val smdResistor = <gregtech:meta_item_1:524>;
val smdDiode = <gregtech:meta_item_1:526>;
val smdTransistor = <gregtech:meta_item_1:523>;
val redAlloyWire1x = <gregtech:wire_single:2517>;
val fineCopperWire = <gregtech:meta_wire_fine:25>;
val fineGoldWire = <gregtech:meta_wire_fine:41>;
val fineElectrumWire = <gregtech:meta_wire_fine:277>;
val tinBolt = <gregtech:meta_bolt:112>;
val silverBolt = <gregtech:meta_bolt:100>;
val annealedCopperBolt = <gregtech:meta_bolt:252>;
val vacuumTube = <gregtech:meta_item_1:516>;
val integratedCircuit = <gregtech:meta_item_1:593>;
val ram = <gregtech:meta_item_1:592>;

//Circuit Assembler removal
    val circuitAssemblerEUt = [
        16,
        16,
        16,
        16,
        24,
        24,
        30,
        30,
    ]as int[];

    val circuitAssemblerItemInputs = [
        [circuitBoard * 1, smdResistor * 2, redAlloyWire1x * 2, vacuumTube * 2],
        [circuitBoard * 1, smdResistor * 2, redAlloyWire1x * 2, vacuumTube * 2],
        [circuitBoard * 1, integratedCircuit * 1, smdResistor * 2, smdDiode * 2, fineCopperWire * 2, tinBolt * 2],
        [circuitBoard * 1, integratedCircuit * 1, smdResistor * 2, smdDiode * 2, fineCopperWire * 2, tinBolt * 2],
        [goodCircuitBoard * 1, integratedLogicCircuit * 2, smdResistor * 2, smdDiode * 2, fineGoldWire * 4, silverBolt * 4],
        [goodCircuitBoard * 1, integratedLogicCircuit * 2, smdResistor * 2, smdDiode * 2, fineGoldWire * 4, silverBolt * 4],
        [goodIntegratedCircuit * 2, integratedCircuit * 2, ram * 2, smdTransistor * 4, fineElectrumWire * 8, annealedCopperBolt * 8],
        [goodIntegratedCircuit * 2, integratedCircuit * 2, ram * 2, smdTransistor * 4, fineElectrumWire * 8, annealedCopperBolt * 8],
    ]as IIngredient[][];

    val CircuitAssemblerFluidInputs = [
        [<liquid:soldering_alloy> * 72],
        [<liquid:tin> * 144],
        [<liquid:soldering_alloy> * 72],
        [<liquid:tin> * 144],
        [<liquid:soldering_alloy> * 72],
        [<liquid:tin> * 144],
        [<liquid:soldering_alloy> * 72],
        [<liquid:tin> * 144],
        [<liquid:soldering_alloy> * 72],
        [<liquid:tin> * 144],
    ]as ILiquidStack[][];

        for index, recipeEUt in circuitAssemblerEUt {
            val recipeInputs = circuitAssemblerItemInputs[index];
            val recipeFluidInputs = CircuitAssemblerFluidInputs[index];

            <recipemap:circuit_assembler>.findRecipe(recipeEUt, recipeInputs, recipeFluidInputs).remove();
        }

//Primative Circuits LV->MV
    circuit_assembler.recipeBuilder()
    .inputs(circuitBoard * 1, <ore:componentResistor> * 2, redAlloyWire1x * 2, <ore:circuitUlv> * 2)
    .fluidInputs(<liquid:soldering_alloy> * 72)
    .outputs(<gregtech:meta_item_1:621> * 1)
    .duration(200)
    .EUt(16)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(circuitBoard * 1, <ore:componentResistor> * 2, redAlloyWire1x * 2, <ore:circuitUlv> * 2)
    .fluidInputs(<liquid:tin> * 144)
    .outputs(<gregtech:meta_item_1:621> * 1)
    .duration(200)
    .EUt(16)
    .buildAndRegister();

//Primative Circuits LV->HV
    circuit_assembler.recipeBuilder()
    .inputs(circuitBoard * 1, integratedCircuit * 1, <ore:componentResistor> * 2, <ore:componentDiode> * 2, fineCopperWire * 2, tinBolt * 2)
    .fluidInputs(<liquid:soldering_alloy> * 72)
    .outputs(<gregtech:meta_item_1:623> * 1)
    .duration(200)
    .EUt(64)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(circuitBoard * 1, integratedCircuit * 1, <ore:componentResistor> * 2, <ore:componentDiode> * 2, fineCopperWire * 2, tinBolt * 2)
    .fluidInputs(<liquid:tin> * 144)
    .outputs(<gregtech:meta_item_1:623> * 1)
    .duration(200)
    .EUt(64)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(goodCircuitBoard * 1, integratedLogicCircuit * 2, <ore:componentResistor> * 1, <ore:componentDiode> * 2, fineGoldWire * 4, silverBolt * 4)
    .fluidInputs(<liquid:soldering_alloy> * 72)
    .outputs(<gregtech:meta_item_1:624> * 1)
    .duration(400)
    .EUt(96)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(goodCircuitBoard * 1, integratedLogicCircuit * 2, <ore:componentResistor> * 1, <ore:componentDiode> * 2, fineGoldWire * 4, silverBolt * 4)
    .fluidInputs(<liquid:tin> * 144)
    .outputs(<gregtech:meta_item_1:624> * 1)
    .duration(400)
    .EUt(96)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(goodIntegratedCircuit * 1, integratedCircuit * 2, ram * 2, <ore:componentTransistor> * 4, fineElectrumWire * 8, annealedCopperBolt * 8)
    .fluidInputs(<liquid:soldering_alloy> * 72)
    .outputs(<gregtech:meta_item_1:625> * 1)
    .duration(800)
    .EUt(128)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(goodIntegratedCircuit * 1, integratedCircuit * 2, ram * 2, <ore:componentTransistor> * 4, fineElectrumWire * 8, annealedCopperBolt * 8)
    .fluidInputs(<liquid:tin> * 144)
    .outputs(<gregtech:meta_item_1:625> * 1)
    .duration(800)
    .EUt(128)
    .buildAndRegister();