import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;

    val primitiveCentrifuge = <gregtech:machine:32002>;
    val primitiveMixer = <gregtech:machine:32005>;
    val primitiveAssembler = <gregtech:machine:32008>;
    val primitiveCircuitAssembler = <gregtech:machine:32009>;
    val primitiveAlloySmelter = <gregtech:machine:32010>;
    val primitiveMacerator = <gregtech:machine:32011>;
    val primitiveBrewery = <gregtech:machine:32012>;
    val primitiveCanningMachine = <gregtech:machine:32013>;
    val primitiveChemicalBath = <gregtech:machine:32014>;
    val primitiveCuttingMachine = <gregtech:machine:32015>;
    val primitiveExtractor = <gregtech:machine:32016>;
    val primitiveForgeHammer = <gregtech:machine:32017>;
    val primitiveLathe = <gregtech:machine:32018>;
    val primitiveOreWasher = <gregtech:machine:32019>;
    val primitivePackager = <gregtech:machine:32020>;
    val primitiveGasCollector = <gregtech:machine:32021>;
    val primitiveWiremill = <gregtech:machine:32022>;
    val primitiveRockBreaker = <gregtech:machine:32023>;
    val primitiveSteamTurbine = <gregtech:machine:32024>;
    val leadCableSingle = <gregtech:cable_single:55>;
    val tinWireQuadruple = <gregtech:wire_quadruple:112>;
    val ulvConveyor = <ulv_covers:ulv_cover_meta_item>;
    val ulvPump = <ulv_covers:ulv_cover_meta_item:1>;
    val ulvMotor = <ulv_covers:ulv_cover_meta_item:2>;
    val ulvPiston = <ulv_covers:ulv_cover_meta_item:3>;
    val ulvRobotArm = <ulv_covers:ulv_cover_meta_item:4>;
    val ulvEmitter = <contenttweaker:emitter_ulv>;
    val ulvMachineHull = <gregtech:machine:985>;
    val circuitUlv = <ore:circuitUlv>;
    val circuitLv = <ore:circuitLv>;
    val leadRotor = <gregtech:meta_rotor:55>;
    val glassBlock = <ore:blockGlass>;
    val diamond = <ore:gemDiamond>;
    val leadSpring = <gregtech:meta_spring:55>;
    val bronzeBuzzSaw = <gregtech:meta_tool_head_buzz_saw:260>;
    val anvil = <minecraft:anvil>;
    val chest = <minecraft:chest>;
    val ironBars = <minecraft:iron_bars>;
    val fluidFilter = <gregtech:meta_item_1:290>;
    val leadFluidPipe = <gregtech:fluid_pipe_normal:55>;

    recipes.addShaped(primitiveCentrifuge * 1, [
    [circuitUlv, ulvMotor, circuitUlv],
    [leadCableSingle, ulvMachineHull, leadCableSingle],
    [circuitUlv, ulvMotor, circuitUlv]
]);

    recipes.addShaped(primitiveMixer * 1, [
    [glassBlock, leadRotor, glassBlock],
    [glassBlock, ulvMotor, glassBlock],
    [circuitUlv, ulvMachineHull, circuitUlv]
]);

    recipes.addShaped(primitiveAssembler * 1, [
    [ulvRobotArm, circuitUlv, ulvRobotArm],
    [ulvConveyor, ulvMachineHull, ulvConveyor],
    [leadCableSingle, circuitUlv, leadCableSingle]
]);

    recipes.addShaped(primitiveCircuitAssembler * 1, [
    [ulvRobotArm, circuitLv, ulvEmitter],
    [ulvConveyor, ulvMachineHull, ulvConveyor],
    [leadCableSingle, circuitLv, leadCableSingle]
]);

    recipes.addShaped(primitiveAlloySmelter * 1, [
    [circuitUlv, tinWireQuadruple, circuitUlv],
    [tinWireQuadruple, ulvMachineHull, tinWireQuadruple],
    [leadCableSingle, tinWireQuadruple, leadCableSingle]
]);

    recipes.addShaped(primitiveMacerator * 1, [
    [ulvPiston, ulvMotor, diamond],
    [leadCableSingle, leadCableSingle, ulvMachineHull],
    [circuitUlv, circuitUlv, leadCableSingle]
]);

    recipes.addShaped(primitiveBrewery * 1, [
    [glassBlock, ulvPump, glassBlock],
    [leadCableSingle, ulvMachineHull, leadCableSingle],
    [circuitUlv, leadSpring, circuitUlv]
]);

    recipes.addShaped(primitiveCanningMachine * 1, [
    [leadCableSingle, ulvPump, leadCableSingle],
    [circuitUlv, ulvMachineHull, circuitUlv],
    [glassBlock, glassBlock, glassBlock]
]);

    recipes.addShaped(primitiveChemicalBath * 1, [
    [ulvConveyor, glassBlock, leadCableSingle],
    [ulvPump, glassBlock, ulvConveyor],
    [circuitUlv, ulvMachineHull, circuitUlv]
]);

    recipes.addShaped(primitiveCuttingMachine * 1, [
    [leadCableSingle, circuitUlv, glassBlock],
    [ulvConveyor, ulvMachineHull, bronzeBuzzSaw],
    [circuitUlv, leadCableSingle, ulvMotor]
]);

    recipes.addShaped(primitiveExtractor * 1, [
    [glassBlock, circuitUlv, glassBlock],
    [ulvPiston, ulvMachineHull, ulvPump],
    [leadCableSingle, circuitUlv, leadCableSingle]
]);

    recipes.addShaped(primitiveForgeHammer * 1, [
    [leadCableSingle, ulvPiston, leadCableSingle],
    [circuitUlv, ulvMachineHull, circuitUlv],
    [leadCableSingle, anvil, leadCableSingle]
]);

    recipes.addShaped(primitiveLathe * 1, [
    [leadCableSingle, circuitUlv, leadCableSingle],
    [ulvMotor, ulvMachineHull, diamond],
    [circuitUlv, leadCableSingle, ulvPiston]
]);

    recipes.addShaped(primitiveOreWasher * 1, [
    [leadRotor, glassBlock, leadRotor],
    [circuitUlv, ulvMotor, circuitUlv],
    [leadCableSingle, ulvMachineHull, leadCableSingle]
]);

    recipes.addShaped(primitivePackager * 1, [
    [chest, circuitUlv, chest],
    [ulvRobotArm, ulvMachineHull, ulvConveyor],
    [leadCableSingle, circuitUlv, leadCableSingle]
]);

    recipes.addShaped(primitiveGasCollector * 1, [
    [ironBars, fluidFilter, ironBars],
    [ulvPump, ulvMachineHull, ulvPump],
    [ironBars, circuitUlv, ironBars]
]);

    recipes.addShaped(primitiveWiremill * 1, [
    [ulvMotor, leadCableSingle, ulvMotor],
    [circuitUlv, ulvMachineHull, circuitUlv],
    [ulvMotor, leadCableSingle, ulvMotor]
]);

    recipes.addShaped(primitiveRockBreaker * 1, [
    [ulvPiston, ulvMotor, diamond],
    [leadCableSingle, ulvMachineHull, leadCableSingle],
    [glassBlock, glassBlock, glassBlock]
]);

    recipes.addShaped(primitiveSteamTurbine * 1, [
    [leadFluidPipe, circuitUlv, leadFluidPipe],
    [leadRotor, ulvMachineHull, leadRotor],
    [ulvMotor, leadCableSingle, ulvMotor]
]);