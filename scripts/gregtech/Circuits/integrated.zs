import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMap;

val microprocessor = <gregtech:meta_item_1:627>;
val integratedProcessor = <gregtech:meta_item_1:628>;
val processorAssembly = <gregtech:meta_item_1:629>;
val workstation = <gregtech:meta_item_1:630>;
val mainframe = <gregtech:meta_item_1:631>;
val plasticCircuitBoard = <gregtech:meta_item_1:403>;
val cpu = <gregtech:meta_item_1:591>;
val soc = <gregtech:meta_item_1:597>;
val ram = <gregtech:meta_item_1:592>;
val advancedSmdInductor = <gregtech:meta_item_1:532>;
val advancedSmdCapacitor = <gregtech:meta_item_1:530>;
val smdResistor = <gregtech:meta_item_1:524>;
val smdCapacitor = <gregtech:meta_item_1:525>;
val smdTransistor = <gregtech:meta_item_1:523>;
val smdInductor = <gregtech:meta_item_1:527>;
val smdDiode = <gregtech:meta_item_1:526>;
val resistor = <gregtech:meta_item_1:519>;
val capacitor = <gregtech:meta_item_1:520>;
val transistor = <gregtech:meta_item_1:518>;
val inductor = <gregtech:meta_item_1:522>;
val diode = <gregtech:meta_item_1:521>;
val fineCopperWire = <gregtech:meta_wire_fine:25>;
val fineRedAlloyWire = <gregtech:meta_wire_fine:2517>;
val fineElectrumWire = <gregtech:meta_wire_fine:277>;
val tinBolt = <gregtech:meta_bolt:112>;
val annealedCopperBolt = <gregtech:meta_bolt:252>;
val blueAlloyBolt = <gregtech:meta_bolt:2527>;
val aluminiumFrameBox = <gregtech:meta_block_frame_0:2>;
val blueAlloyWireSingle = <gregtech:wire_single:2527>;
val annealedCopperWireSingle = <gregtech:wire_single:252>;

//Circuit Assembler removal
    val circuitAssemblerEUt = [
        60,
        60,
        600,
        600,
        60,
        60,
        2400,
        2400,
        120,
        120,
        120,
        120,
        480,
        480,
        480,
        480,
    ]as int[];

    val circuitAssemblerItemInputs = [
        [plasticCircuitBoard * 1, cpu * 1, smdResistor * 2, smdCapacitor * 2, smdTransistor * 2, fineCopperWire * 2],
        [plasticCircuitBoard * 1, cpu * 1, smdResistor * 2, smdCapacitor * 2, smdTransistor * 2, fineCopperWire * 2],
        [plasticCircuitBoard * 1, soc * 1, fineCopperWire * 2, tinBolt * 2],
        [plasticCircuitBoard * 1, soc * 1, fineCopperWire * 2, tinBolt * 2],
        [plasticCircuitBoard * 1, cpu * 1, smdResistor * 4, smdCapacitor * 4, smdTransistor * 4, fineRedAlloyWire * 4],
        [plasticCircuitBoard * 1, cpu * 1, smdResistor * 4, smdCapacitor * 4, smdTransistor * 4, fineRedAlloyWire * 4],
        [plasticCircuitBoard * 1, soc * 1, fineRedAlloyWire * 4, annealedCopperBolt * 4],
        [plasticCircuitBoard * 1, soc * 1, fineRedAlloyWire * 4, annealedCopperBolt * 4],
        [plasticCircuitBoard * 1, integratedProcessor * 2, smdInductor * 4, smdCapacitor * 8, ram * 4, fineRedAlloyWire * 16],
        [plasticCircuitBoard * 1, integratedProcessor * 2, smdInductor * 4, smdCapacitor * 8, ram * 4, fineRedAlloyWire * 16],
        [plasticCircuitBoard * 1, processorAssembly * 2, smdDiode * 4, ram * 4, fineElectrumWire * 16, blueAlloyBolt * 16],
        [plasticCircuitBoard * 1, processorAssembly * 2, smdDiode * 4, ram * 4, fineElectrumWire * 16, blueAlloyBolt * 16],
        [aluminiumFrameBox * 2, workstation * 2, smdInductor * 8, smdCapacitor * 16, ram * 16, annealedCopperWireSingle * 16],
        [aluminiumFrameBox * 2, workstation * 2, smdInductor * 8, smdCapacitor * 16, ram * 16, annealedCopperWireSingle * 16],
        [aluminiumFrameBox * 2, workstation * 2, advancedSmdInductor * 2, advancedSmdCapacitor * 4, ram * 16, annealedCopperWireSingle * 16],
        [aluminiumFrameBox * 2, workstation * 2, advancedSmdInductor * 2, advancedSmdCapacitor * 4, ram * 16, annealedCopperWireSingle * 16],
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
        [<liquid:soldering_alloy> * 144],
        [<liquid:tin> * 288],
        [<liquid:soldering_alloy> * 144],
        [<liquid:tin> * 288],
        [<liquid:soldering_alloy> * 288],
        [<liquid:tin> * 576],
        [<liquid:soldering_alloy> * 288],
        [<liquid:tin> * 576],
    ]as ILiquidStack[][];

        for index, recipeEUt in circuitAssemblerEUt {
            val recipeInputs = circuitAssemblerItemInputs[index];
            val recipeFluidInputs = CircuitAssemblerFluidInputs[index];

            <recipemap:circuit_assembler>.findRecipe(recipeEUt, recipeInputs, recipeFluidInputs).remove();
        }

//Microprocessor LV
    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, cpu * 1, smdResistor * 2, smdCapacitor * 2, smdTransistor * 2, fineCopperWire * 2)
    .fluidInputs(<liquid:soldering_alloy> * 72)
    .outputs(microprocessor * 1)
    .duration(200)
    .EUt(256)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, cpu * 1, smdResistor * 2, smdCapacitor * 2, smdTransistor * 2, fineCopperWire * 2)
    .fluidInputs(<liquid:tin> * 144)
    .outputs(microprocessor * 1)
    .duration(200)
    .EUt(256)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, soc * 1, fineCopperWire * 2, tinBolt * 2)
    .fluidInputs(<liquid:soldering_alloy> * 72)
    .outputs(microprocessor * 1)
    .duration(50)
    .property("cleanroom", "cleanroom")
    .EUt(2560)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, soc * 1, fineCopperWire * 2, tinBolt * 2)
    .fluidInputs(<liquid:tin> * 144)
    .outputs(microprocessor * 1)
    .property("cleanroom", "cleanroom")
    .duration(50)
    .EUt(2560)
    .buildAndRegister();

//Integreted Circuits MV->IV

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, cpu * 1, smdResistor * 4, smdCapacitor * 4, smdTransistor * 4, fineRedAlloyWire * 4)
    .fluidInputs(<liquid:soldering_alloy> * 72)
    .outputs(integratedProcessor * 1)
    .duration(200)
    .property("cleanroom", "cleanroom")
    .EUt(192)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, cpu * 1, smdResistor * 4, smdCapacitor * 4, smdTransistor * 4, fineRedAlloyWire * 4)
    .fluidInputs(<liquid:tin> * 144)
    .outputs(integratedProcessor * 1)
    .property("cleanroom", "cleanroom")
    .duration(200)
    .EUt(192)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, soc * 1, fineRedAlloyWire * 4, annealedCopperBolt * 4)
    .fluidInputs(<liquid:soldering_alloy> * 72)
    .outputs(integratedProcessor * 1)
    .property("cleanroom", "cleanroom")
    .duration(50)
    .EUt(2560)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, soc * 1, fineRedAlloyWire * 4, annealedCopperBolt * 4)
    .fluidInputs(<liquid:tin> * 144)
    .outputs(integratedProcessor * 1)
    .property("cleanroom", "cleanroom")
    .duration(50)
    .EUt(2560)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, integratedProcessor * 2, smdInductor * 4, smdCapacitor * 8, ram * 4, fineRedAlloyWire * 8)
    .fluidInputs(<liquid:soldering_alloy> * 144)
    .outputs(processorAssembly * 1)
    .property("cleanroom", "cleanroom")
    .duration(200)
    .EUt(256)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, integratedProcessor * 2, smdInductor * 4, smdCapacitor * 8, ram * 4, fineRedAlloyWire * 8)
    .fluidInputs(<liquid:tin> * 288)
    .outputs(processorAssembly * 1)
    .property("cleanroom", "cleanroom")
    .duration(200)
    .EUt(256)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, processorAssembly * 1, smdDiode * 4, ram * 4, fineElectrumWire * 16, blueAlloyBolt * 16)
    .fluidInputs(<liquid:soldering_alloy> * 144)
    .outputs(workstation * 1)
    .property("cleanroom", "cleanroom")
    .duration(400)
    .EUt(320)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(plasticCircuitBoard * 1, processorAssembly * 1, smdDiode * 4, ram * 4, fineElectrumWire * 16, blueAlloyBolt * 16)
    .fluidInputs(<liquid:tin> * 288)
    .outputs(workstation * 1)
    .property("cleanroom", "cleanroom")
    .duration(400)
    .EUt(320)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(aluminiumFrameBox * 2, workstation * 2, smdInductor * 8, smdCapacitor * 16, ram * 16, blueAlloyWireSingle * 16)
    .fluidInputs(<liquid:soldering_alloy> * 288)
    .outputs(mainframe * 1)
    .property("cleanroom", "cleanroom")
    .duration(800)
    .EUt(384)
    .buildAndRegister();

    circuit_assembler.recipeBuilder()
    .inputs(aluminiumFrameBox * 2, workstation * 2, smdInductor * 8, smdCapacitor * 16, ram * 16, blueAlloyWireSingle * 16)
    .fluidInputs(<liquid:tin> * 576)
    .outputs(mainframe * 1)
    .property("cleanroom", "cleanroom")
    .duration(800)
    .EUt(384)
    .buildAndRegister();

//Plastic Circuit Board
    chemical_reactor.recipeBuilder()
    .inputs(<ore:platePlastic> * 1, <ore:foilCobalt> * 4)
    .outputs(<gregtech:meta_item_1:383> * 1)
    .fluidInputs(<liquid:sulfuric_acid> * 250)
    .duration(200)
    .EUt(64)
    .buildAndRegister();
    
    chemical_reactor.recipeBuilder()
    .inputs(<ore:platePolyvinylChloride> * 2, <ore:foilCobalt> * 8)
    .outputs(<gregtech:meta_item_1:383> * 2)
    .fluidInputs(<liquid:sulfuric_acid> * 250)
    .duration(300)
    .EUt(256)
    .buildAndRegister();
    
    chemical_reactor.recipeBuilder()
    .inputs(<ore:platePolytetrafluoroethylene> * 4, <ore:foilCobalt> * 16)
    .outputs(<gregtech:meta_item_1:383> * 4)
    .fluidInputs(<liquid:sulfuric_acid> * 250)
    .duration(400)
    .EUt(1024)
    .buildAndRegister();
    
    chemical_reactor.recipeBuilder()
    .inputs(<ore:platePolybenzimidazole> * 8, <ore:foilCobalt> * 32)
    .outputs(<gregtech:meta_item_1:383> * 8)
    .fluidInputs(<liquid:sulfuric_acid> * 250)
    .duration(500)
    .EUt(4096)
    .buildAndRegister();
    