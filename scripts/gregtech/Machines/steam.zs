import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;

val steamCentrifuge = <gregtech:machine:32000>;
val hpSteamCentrifuge = <gregtech:machine:32001>;
val steamMixer = <gregtech:machine:32003>;
val hpSteamMixer = <gregtech:machine:32004>;
val bronzePlate = <gregtech:meta_plate:260>;
val steelPlate = <gregtech:meta_plate:324>;
val wroughtIronPlate = <gregtech:meta_plate:335>;
val smallBronzeFluidPipe = <gregtech:fluid_pipe_small:260>;
val smallTinAlloyFluidPipe = <gregtech:fluid_pipe_small:328>;
val bronzeHull = <gregtech:steam_casing>;
val bronzeRotor = <gregtech:meta_rotor:260>;
val glassBlock = <ore:blockGlass>;

recipes.addShaped(steamCentrifuge * 1, [
    [bronzePlate, bronzeRotor, bronzePlate],
    [smallBronzeFluidPipe, bronzeHull, smallBronzeFluidPipe],
    [bronzePlate, smallBronzeFluidPipe, bronzePlate]
]);

recipes.addShaped(hpSteamCentrifuge * 1, [
    [smallTinAlloyFluidPipe, steelPlate, smallTinAlloyFluidPipe],
    [wroughtIronPlate, steamCentrifuge, wroughtIronPlate],
    [smallTinAlloyFluidPipe, smallTinAlloyFluidPipe, smallTinAlloyFluidPipe]
]);

recipes.addShaped(steamMixer * 1, [
    [glassBlock, smallBronzeFluidPipe, glassBlock],
    [glassBlock, bronzeRotor, glassBlock],
    [smallBronzeFluidPipe, bronzeHull, smallBronzeFluidPipe]
]);

recipes.addShaped(hpSteamMixer * 1, [
    [wroughtIronPlate, steelPlate, wroughtIronPlate],
    [smallTinAlloyFluidPipe, steamMixer, smallTinAlloyFluidPipe],
    [wroughtIronPlate, wroughtIronPlate, wroughtIronPlate]
]);