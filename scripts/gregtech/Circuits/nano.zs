import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMap;

val nanoSMDTransistor = <contenttweaker:nano_smd_transistor>;
val nanoSMDResistor = <contenttweaker:nano_smd_resistor>;
val nanoSMDCapacitor = <contenttweaker:nano_smd_capacitor>;
val nanoSMDDiode = <contenttweaker:nano_smd_diode>;
val nanoSMDInductor = <contenttweaker:nano_smd_inductor>;
val findTgtWire = <gregtech:meta_wire_fine:32024>;
val graphiteDust = <gregtech:meta_dust:341>;
val galliumArsenideDust = <gregtech:meta_dust:351>;
val micaFoil = <gregtech:meta_foil:386>;
val silverFoil = <gregtech:meta_foil:100>;
val goldGalliumFoil = <gregtech:meta_foil:32022>;
val goldTitaniumRing = <gregtech:meta_ring:32023>;
//Circuit Assembler removal
    val circuitAssemblerEUt = [

    ]as int[];

    val circuitAssemblerItemInputs = [

    ]as IIngredient[][];

    val CircuitAssemblerFluidInputs = [

    ]as ILiquidStack[][];

        for index, recipeEUt in circuitAssemblerEUt {
            val recipeInputs = circuitAssemblerItemInputs[index];
            val recipeFluidInputs = CircuitAssemblerFluidInputs[index];

            <recipemap:circuit_assembler>.findRecipe(recipeEUt, recipeInputs, recipeFluidInputs).remove();
        }

//Nano SMD Components

    assembler.recipeBuilder()
    .inputs(findTgtWire * 8, goldGalliumFoil * 1)
    .outputs(nanoSMDTransistor * 32)
    .fluidInputs(<liquid:polytetrafluoroethylene> * 288)
    .duration(200)
    .EUt(784)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(findTgtWire * 4, graphiteDust * 1)
    .outputs(nanoSMDResistor * 32)
    .fluidInputs(<liquid:polytetrafluoroethylene> * 576)
    .duration(200)
    .EUt(784)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(micaFoil * 2, silverFoil * 1)
    .outputs(nanoSMDCapacitor * 24)
    .fluidInputs(<liquid:polytetrafluoroethylene> * 144)
    .duration(200)
    .EUt(784)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(findTgtWire * 8, galliumArsenideDust * 1)
    .outputs(nanoSMDDiode * 32)
    .fluidInputs(<liquid:polytetrafluoroethylene> * 576)
    .duration(200)
    .EUt(784)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(findTgtWire * 4, goldTitaniumRing * 1)
    .outputs(nanoSMDInductor * 32)
    .fluidInputs(<liquid:polytetrafluoroethylene> * 288)
    .duration(200)
    .EUt(784)
    .buildAndRegister();

