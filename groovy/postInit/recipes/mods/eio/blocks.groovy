log.infoMC("Changing EnderIO Block Recipes...")

//Infinity Dust Block
crafting.removeByOutput(item('enderio:block_infinity'))
recipemap('compressor').recipeBuilder()
    .inputs(ore('dustBedrock') * 9)
    .outputs(item('enderio:block_infinity') * 1)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Compressed Infinity Dust Block
crafting.removeByOutput(item('enderio:block_infinity', 1))
recipemap('compressor').recipeBuilder()
    .inputs(ore('compressed1xDustBedrock') * 9)
    .outputs(item('enderio:block_infinity', 1) * 1)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Double Compressed Infinity Dust Block
crafting.removeByOutput(item('enderio:block_infinity', 2))
recipemap('compressor').recipeBuilder()
    .inputs(ore('compressed2xDustBedrock') * 9)
    .outputs(item('enderio:block_infinity', 2) * 1)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Infinity Dust Block /Grains of Infinity /Infinity Dust
recipemap('macerator').recipeBuilder()
    .inputs(ore('compressed2xDustBedrock') * 1)
    .outputs(item('enderio:block_infinity') * 9)
    .chancedOutput(item('enderio:item_material', 20), 500, 100)
    .chancedOutput(item('enderio:block_infinity_fog'), 1000, 200)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Compressed Infinity Block /Infinity Dust Block /Grains of Infinity /Infinity Dust
recipemap('macerator').recipeBuilder()
    .inputs(ore('compressed3xDustBedrock') * 1)
    .outputs(item('enderio:block_infinity', 1) * 9)
    .chancedOutput(item('enderio:block_infinity'), 500, 100)
    .chancedOutput(item('enderio:item_material', 20), 1000, 200)
    .chancedOutput(item('enderio:block_infinity_fog'), 2000, 400)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Dark Steel Anvil
crafting.removeByOutput(item('enderio:block_dark_steel_anvil'))
crafting.addShaped(item('enderio:block_dark_steel_anvil'), [
    [ore('blockDarkSteel'), ore('blockDarkSteel'), ore('blockDarkSteel')],
    [ore('screwDarkSteel'), ore('plateDarkSteel'), ore('screwDarkSteel')],
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('plateDarkSteel')]
])

recipemap('fluid_solidifier').recipeBuilder()
    .outputs(item('enderio:block_dark_steel_anvil') * 1)
    .fluidInputs(fluid('dark_steel') * 4464)
    .notConsumable(item('gregtech:meta_item_1', 21) * 1)
    .duration(1680)
    .EUt(64)
    .buildAndRegister()

recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('ingotDarkSteel') * 31)
    .outputs(item('enderio:block_dark_steel_anvil') * 1)
    .notConsumable(item('gregtech:meta_item_1', 21) * 1)
    .duration(1680)
    .EUt(64)
    .buildAndRegister()

//Dark Paper Anvil
crafting.removeByOutput(item('enderio:block_dark_paper_anvil'))
crafting.addShaped(item('enderio:block_dark_paper_anvil'), [
    [ore('paperBlack'), ore('paperBlack'), ore('paperBlack')],
    [ore('screwDarkSteel'), ore('paperBlack'), ore('screwDarkSteel')],
    [ore('paperBlack'), ore('paperBlack'), ore('paperBlack')]
])

//Dark Steel Ladder
crafting.removeByOutput(item('enderio:block_dark_steel_ladder'))
crafting.addShaped(item('enderio:block_dark_steel_ladder') * 2, [
    [ore('stickDarkSteel'), ore('craftingToolSoftHammer'), ore('stickDarkSteel')],
    [ore('stickDarkSteel'), ore('boltDarkSteel'), ore('stickDarkSteel')],
    [ore('stickDarkSteel'), ore('craftingToolHardHammer'), ore('stickDarkSteel')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('stickDarkSteel') * 7)
    .outputs(item('enderio:block_dark_steel_ladder') * 2)
    .circuitMeta(7)
    .duration(40)
    .EUt(64)
    .buildAndRegister()

//Dark Iron Bars
crafting.removeByOutput(item('enderio:block_dark_iron_bars'))
crafting.addShaped(item('enderio:block_dark_iron_bars') * 8, [
    [null, ore('craftingToolHardHammer'), null],
    [ore('stickDarkSteel'), ore('stickDarkSteel'), ore('stickDarkSteel')],
    [ore('stickDarkSteel'), ore('stickDarkSteel'), ore('stickDarkSteel')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('stickDarkSteel') * 3)
    .outputs(item('enderio:block_dark_iron_bars') * 4)
    .circuitMeta(3)
    .duration(300)
    .EUt(256)
    .buildAndRegister()

//Dark Steel Trapdoor
crafting.removeByOutput(item('enderio:block_dark_steel_trapdoor'))
crafting.addShaped(item('enderio:block_dark_steel_trapdoor'), [
    [ore('screwDarkSteel'), ore('plateDarkSteel'), ore('screwDarkSteel')],
    [ore('plateDarkSteel'), ore('trapdoorWood'), ore('plateDarkSteel')],
    [ore('craftingToolSaw'), ore('plateDarkSteel'), ore('craftingToolScrewdriver')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('plateDarkSteel') * 4)
    .outputs(item('enderio:block_dark_steel_trapdoor') * 1)
    .circuitMeta(4)
    .duration(100)
    .EUt(448)
    .buildAndRegister()

//Dark Steel Door
crafting.removeByOutput(item('enderio:block_dark_steel_door'))
crafting.addShaped(item('enderio:block_dark_steel_door'), [
    [ore('plateDarkSteel'), item('enderio:block_dark_iron_bars'), ore('craftingToolHardHammer')],
    [ore('plateDarkSteel'), ore('ringDarkSteel'), ore('screwDarkSteel')],
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('craftingToolScrewdriver')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('plateDarkSteel') * 4, item('enderio:block_dark_iron_bars'))
    .outputs(item('enderio:block_dark_steel_door') * 1)
    .fluidInputs(fluid('dark_steel') * 16)
    .duration(100)
    .EUt(448)
    .buildAndRegister()

//Reinforced Obsidian
crafting.removeByOutput(item('enderio:block_reinforced_obsidian'))
recipemap('assembler').recipeBuilder()
    .inputs(item('enderio:block_dark_iron_bars') * 6, ore('screwDarkSteel') * 6, ore('dustBedrock') * 6, ore('blockObsidian') * 1)
    .outputs(item('enderio:block_reinforced_obsidian') * 1)
    .fluidInputs(fluid('vibrant_alloy') * 1152)
    .duration(1600)
    .EUt(1920)
    .buildAndRegister()

//Industrial Insulation
recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('dyeMachine') * 6, metaitem('component.mica_insulator_sheet') * 1)
    .outputs(item('enderio:block_industrial_insulation') * 1)
    .duration(320)
    .EUt(16)
    .buildAndRegister()

//End Steel Bars
crafting.removeByOutput(item('enderio:block_end_iron_bars'))
crafting.addShaped(item('enderio:block_end_iron_bars') * 8, [
    [null, ore('craftingToolHardHammer'), null],
    [ore('stickEndSteel'), ore('stickEndSteel'), ore('stickEndSteel')],
    [ore('stickEndSteel'), ore('stickEndSteel'), ore('stickEndSteel')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('stickEndSteel') * 3)
    .outputs(item('enderio:block_end_iron_bars') * 4)
    .circuitMeta(3)
    .duration(300)
    .EUt(256)
    .buildAndRegister()

//Dark Pressure Plate
crafting.removeByOutput(item('enderio:block_painted_pressure_plate', 8))
crafting.addShaped(item('enderio:block_painted_pressure_plate', 8) * 1, [
    [ore('screwSteel'), ore('craftingToolHardHammer'), ore('screwSteel')],
    [ore('plateDarkSteel'), ore('springSteel'), ore('plateDarkSteel')],
    [ore('screwSteel'), ore('craftingToolScrewdriver'), ore('screwSteel')]
])

//Soularium Pressure Plate
crafting.removeByOutput(item('enderio:block_painted_pressure_plate', 10))
crafting.addShaped(item('enderio:block_painted_pressure_plate', 10) * 1, [
    [ore('screwSteel'), ore('craftingToolHardHammer'), ore('screwSteel')],
    [ore('plateSoularium'), ore('springSteel'), ore('plateSoularium')],
    [ore('screwSteel'), ore('craftingToolScrewdriver'), ore('screwSteel')]
])