

import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemStack;

val ulvEmitter = <contenttweaker:emitter_ulv>;
val circuitUlv = <ore:circuitUlv>;
val leadCableSingle = <gregtech:cable_single:55>;
val glassBlock = <ore:blockGlass>;
val bronzeRod = <gregtech:meta_stick:260>;

recipes.addShaped(ulvEmitter * 1, [
    [leadCableSingle, bronzeRod, circuitUlv],
    [bronzeRod, glassBlock, bronzeRod],
    [circuitUlv, bronzeRod, leadCableSingle]
]);