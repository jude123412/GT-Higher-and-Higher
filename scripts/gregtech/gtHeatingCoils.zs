import mods.gregtech.blocks.HeatingCoils;
import crafttweaker.item.IItemDefinition;
import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;
import crafttweaker.liquid.ILiquidStack;
import crafttweaker.oredict.IOreDictEntry;
import mods.gregtech.recipe.RecipeMap;

    val bronzeFoil = <gregtech:meta_foil:260>;
    val lcrHeatingCoil = <gregtech:wire_coil>;
    val cupronickelCoil = <contenttweaker:gt_coil_1>;
    val kanthalCoil = <contenttweaker:gt_coil_2>;
    val nichromeCoil = <contenttweaker:gt_coil_3>;
    val tungstensteelCoil = <contenttweaker:gt_coil_4>;
    val hssgCoil = <contenttweaker:gt_coil_5>;
    val infernoriteCoil = <contenttweaker:gt_coil_6>;
    val naquadahCoil = <contenttweaker:gt_coil_7>;
    val crynoriumCoil = <contenttweaker:gt_coil_8>;
    val triniumCoil = <contenttweaker:gt_coil_9>;
    val tritaniumCoil = <contenttweaker:gt_coil_10>;
    val galasiumCoil = <contenttweaker:gt_coil_11>;
    val cupronickelWireDouble = <gregtech:wire_double:274>;
    val kanthalWireDouble = <gregtech:wire_double:288>;
    val nichromeWireDouble = <gregtech:wire_double:294>;
    val tungstensteelWireDouble = <gregtech:wire_double:2013>;
    val hssgWireDouble = <gregtech:wire_double:2516>;
    val infernoriteWireDouble = <gregtech:wire_double:32025>;
    val naquadahWireDouble = <gregtech:wire_double:124>;
    val crynoriumWireDouble = <gregtech:wire_double:32026>;
    val triniumWireDouble = <gregtech:wire_double:130>;
    val tritaniumWireDouble = <gregtech:wire_double:128>;
    val galasiumWireDouble = <gregtech:wire_double:32027>;
    val aluminiumFoil = <gregtech:meta_foil:2>;
    val stainlesssteelFoil = <gregtech:meta_foil:323>;
    val vanadiumsteelFoil = <gregtech:meta_foil:2036>;
    val tungstencarbideFoil = <gregtech:meta_foil:396>;
    val goldGalliumFoil = <gregtech:meta_foil:32022>;
    val osmiumFoil  = <gregtech:meta_foil:75>;
    val naquadahAlloyFoil = <gregtech:meta_foil:2042>;
    val enrichedNaquadahFoil = <gregtech:meta_foil:125>;
    val naquadriaFoil = <gregtech:meta_foil:126>;
    val enrichedNaquadahTriniumEuropiumDuranideFoil = <gregtech:meta_foil:431>;

    val assemblerEUt = [
        30,
        120,
        480,
        1920,
        7680,
        30720,
        122880,
        491520,
    ]as int[];

    val assemblerItemInputs = [
        [cupronickelWireDouble * 8, bronzeFoil * 8],
        [kanthalWireDouble * 8, aluminiumFoil * 8],
        [nichromeWireDouble * 8, stainlesssteelFoil * 8],
        [tungstensteelWireDouble * 8, vanadiumsteelFoil * 8],
        [hssgWireDouble * 8, tungstencarbideFoil * 8],
        [naquadahWireDouble * 8, osmiumFoil * 8],
        [triniumWireDouble * 8, enrichedNaquadahFoil * 8],
        [tritaniumWireDouble * 8, naquadriaFoil * 8],
    ]as IIngredient[][];

    val assemblerFluidInputs = [
        [<liquid:tin_alloy> * 144],
        [<liquid:copper> * 144],
        [<liquid:aluminium> * 144],
        [<liquid:nichrome> * 144],
        [<liquid:tungsten> * 144],
        [<liquid:tungsten_steel> * 144],
        [<liquid:naquadah> * 144],
        [<liquid:trinium> * 144],
    ]as ILiquidStack[][];

        for index, recipeEUt in assemblerEUt {
            val recipeInputs = assemblerItemInputs[index];
            val recipeFluidInputs = assemblerFluidInputs[index];

            <recipemap:assembler>.findRecipe(recipeEUt, recipeInputs, recipeFluidInputs).remove();
        }

    HeatingCoils.remove(<blockstate:gregtech:wire_coil:variant=cupronickel,active=false>);
    HeatingCoils.remove(<blockstate:gregtech:wire_coil:variant=kanthal,active=false>);
    HeatingCoils.remove(<blockstate:gregtech:wire_coil:variant=nichrome,active=false>);
    HeatingCoils.remove(<blockstate:gregtech:wire_coil:variant=tungstensteel,active=false>);
    HeatingCoils.remove(<blockstate:gregtech:wire_coil:variant=hss_g,active=false>);
    HeatingCoils.remove(<blockstate:gregtech:wire_coil:variant=naquadah,active=false>);
    HeatingCoils.remove(<blockstate:gregtech:wire_coil:variant=trinium,active=false>);
    HeatingCoils.remove(<blockstate:gregtech:wire_coil:variant=tritanium,active=false>);


    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_1>, "cupronickel", 1800, 1, 32, 1, <material:cupronickel>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_2>, "kanthal", 2700, 1, 16, 2, <material:kanthal>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_3>, "nichrome", 3600, 2, 32, 3, <material:cupronickel>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_4>, "tungsten_steel", 4500, 2, 16, 4, <material:tungsten_steel>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_5>, "hssg", 5400, 3, 32, 5, <material:hssg>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_6>, "infernorite", 6300, 3, 16, 6, <material:infernorite>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_7>, "naquadah", 7200, 4, 32, 7, <material:naquadah>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_8>, "crynorium", 8100, 4, 16, 8, <material:crynorium>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_9>, "trinium", 9000, 5, 32, 9, <material:trinium>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_10>, "tritanium", 9900, 5, 16, 10, <material:tritanium>);
    HeatingCoils.add(<blockstate:contenttweaker:gt_coil_11>, "galasium", 10800, 6, 32, 11, <material:galasium>);

//Coil Recipes
    assembler.recipeBuilder()
    .inputs(cupronickelWireDouble * 8, bronzeFoil * 8)
    .fluidInputs(<liquid:polytetrafluoroethylene> * 576)
    .outputs(lcrHeatingCoil * 1)
    .duration(200)
    .EUt(512)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(cupronickelWireDouble * 8, bronzeFoil * 8)
    .fluidInputs(<liquid:tin_alloy> * 144)
    .outputs(cupronickelCoil * 1)
    .duration(200)
    .EUt(30)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(kanthalWireDouble * 8, aluminiumFoil * 8)
    .fluidInputs(<liquid:cupronickel> * 144)
    .outputs(kanthalCoil * 1)
    .duration(300)
    .EUt(120)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(nichromeWireDouble * 8, stainlesssteelFoil * 8)
    .fluidInputs(<liquid:kanthal> * 144)
    .outputs(nichromeCoil * 1)
    .duration(400)
    .EUt(480)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(tungstensteelWireDouble * 8, vanadiumsteelFoil * 8)
    .fluidInputs(<liquid:nichrome> * 144)
    .outputs(tungstensteelCoil * 1)
    .duration(500)
    .EUt(1920)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(hssgWireDouble * 8, tungstencarbideFoil * 8)
    .fluidInputs(<liquid:tungsten_steel> * 144)
    .outputs(hssgCoil * 1)
    .duration(600)
    .EUt(7680)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(infernoriteWireDouble * 8, goldGalliumFoil * 8)
    .fluidInputs(<liquid:hssg> * 144)
    .outputs(infernoriteCoil * 1)
    .duration(700)
    .EUt(30720)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(naquadahWireDouble * 8, osmiumFoil * 8)
    .fluidInputs(<liquid:infernorite> * 144)
    .outputs(naquadahCoil * 1)
    .duration(800)
    .EUt(122880)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(crynoriumWireDouble * 8, naquadahAlloyFoil * 8)
    .fluidInputs(<liquid:naquadah> * 144)
    .outputs(crynoriumCoil * 1)
    .duration(900)
    .EUt(491520)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(triniumWireDouble * 8, enrichedNaquadahFoil * 8)
    .fluidInputs(<liquid:crynorium> * 144)
    .outputs(triniumCoil * 1)
    .duration(1000)
    .EUt(1966080)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(tritaniumWireDouble * 8, naquadriaFoil * 8)
    .fluidInputs(<liquid:trinium> * 144)
    .outputs(tritaniumCoil * 1)
    .duration(1100)
    .EUt(7864320)
    .buildAndRegister();

    assembler.recipeBuilder()
    .inputs(galasiumWireDouble * 8, enrichedNaquadahTriniumEuropiumDuranideFoil * 8)
    .fluidInputs(<liquid:tritanium> * 144)
    .outputs(galasiumCoil * 1)
    .duration(1200)
    .EUt(31457280)
    .buildAndRegister();
