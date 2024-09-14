// Cupronickel Coil Block * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('wireGtDoubleCupronickel') * 8, metaitem('foilBronze') * 8], [fluid('tin_alloy') * 144 * 144])
// Kanthal Coil Block * 1
mods.gregtech.assembler.removeByInput(120, [metaitem('wireGtDoubleKanthal') * 8, metaitem('foilAluminium') * 8], [fluid('copper') * 144 * 144])
// Nichrome Coil Block * 1
mods.gregtech.assembler.removeByInput(480, [metaitem('wireGtDoubleNichrome') * 8, metaitem('foilStainlessSteel') * 8], [fluid('aluminium') * 144 * 144])
// RTM Alloy Coil Block * 1
mods.gregtech.assembler.removeByInput(1920, [metaitem('wireGtDoubleRtmAlloy') * 8, metaitem('foilVanadiumSteel') * 8], [fluid('nichrome') * 144 * 144])


recipemap('assembler').recipeBuilder()
    .inputs(metaitem('wireGtDoubleCupronickel') * 8, metaitem('component.mica_insulator_foil') * 8)
    .outputs(item('gregtech:wire_coil') * 1)
    .fluidInputs(fluid('tin_alloy') * 144)
    .duration(200)
    .EUt(30)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(metaitem('wireGtDoubleKanthal') * 8, metaitem('component.mica_insulator_foil') * 16)
    .outputs(item('gregtech:wire_coil', 1) * 1)
    .fluidInputs(fluid('copper') * 144)
    .duration(300)
    .EUt(120)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(metaitem('wireGtDoubleNichrome') * 8, metaitem('component.mica_insulator_foil') * 24)
    .outputs(item('gregtech:wire_coil', 2) * 1)
    .fluidInputs(fluid('aluminium') * 144)
    .duration(400)
    .EUt(480)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(metaitem('wireGtDoubleRtmAlloy') * 8, metaitem('component.mica_insulator_foil') * 32)
    .outputs(item('gregtech:wire_coil', 3) * 1)
    .fluidInputs(fluid('nichrome') * 144)
    .duration(500)
    .EUt(1920)
    .buildAndRegister()