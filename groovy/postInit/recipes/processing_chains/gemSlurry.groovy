// Ruby Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedRuby') * 2], [fluid('aqua_regia') * 3000 * 3000])
// Sapphire Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedSapphire') * 2], [fluid('aqua_regia') * 3000 * 3000])
// Green Sapphire Slurry * 3000
mods.gregtech.mixer.removeByInput(1920, [metaitem('crushedGreenSapphire') * 2], [fluid('aqua_regia') * 3000 * 3000])
// Aluminium Dust * 2
mods.gregtech.centrifuge.removeByInput(480, null, [fluid('ruby_slurry') * 3000 * 3000])
// Aluminium Dust * 2
mods.gregtech.centrifuge.removeByInput(480, null, [fluid('sapphire_slurry') * 3000 * 3000])
// Aluminium Dust * 2
mods.gregtech.centrifuge.removeByInput(480, null, [fluid('green_sapphire_slurry') * 3000 * 3000])




recipemap('mixer').recipeBuilder()
    .inputs(metaitem('crushedCoal') * 2)
    .fluidInputs(fluid('aqua_regia') * 3000)
    .fluidOutputs(fluid('coal_slurry') * 3000)
    .duration(500)
    .EUt(32)
    .buildAndRegister()

recipemap('mixer').recipeBuilder()
    .inputs(metaitem('crushedRuby') * 2)
    .fluidInputs(fluid('aqua_regia') * 3000)
    .fluidOutputs(fluid('ruby_slurry') * 3000)
    .duration(500)
    .EUt(128)
    .buildAndRegister()

recipemap('mixer').recipeBuilder()
    .inputs(metaitem('crushedSapphire') * 2)
    .fluidInputs(fluid('aqua_regia') * 3000)
    .fluidOutputs(fluid('sapphire_slurry') * 3000)
    .duration(500)
    .EUt(32)
    .buildAndRegister()

recipemap('mixer').recipeBuilder()
    .inputs(metaitem('crushedGreenSapphire') * 2)
    .fluidInputs(fluid('aqua_regia') * 3000)
    .fluidOutputs(fluid('green_sapphire_slurry') * 3000)
    .duration(500)
    .EUt(32)
    .buildAndRegister()

recipemap('centrifuge').recipeBuilder()
    .outputs(metaitem('dustCarbon') * 1)
    .chancedOutput(metaitem('dustGraphite') * 1, 200,  0)
    .chancedOutput(metaitem('dustPreciousMetals') * 1, 200,  0)
    .chancedOutput(metaitem('dustGallium') * 1, 200,  0)
    .fluidInputs(fluid('coal_slurry') * 3000)
    .fluidOutputs(fluid('aqua_regia') * 3000)
    .duration(600)
    .EUt(24)
    .buildAndRegister()

recipemap('centrifuge').recipeBuilder()
    .outputs(metaitem('dustChrome') * 1, metaitem('dustAluminium') * 2)
    .chancedOutput(metaitem('dustIron') * 1, 200,  0)
    .chancedOutput(metaitem('dustVanadium') * 1, 500,  0)
    .fluidInputs(fluid('ruby_slurry') * 3000)
    .fluidOutputs(fluid('aqua_regia') * 3000)
    .duration(600)
    .EUt(96)
    .buildAndRegister()

recipemap('centrifuge').recipeBuilder()
    .outputs(metaitem('dustAluminium') * 2)
    .chancedOutput(metaitem('dustIron') * 1, 200,  0)
    .chancedOutput(metaitem('dustVanadium') * 1, 200,  0)
    .fluidInputs(fluid('sapphire_slurry') * 3000)
    .fluidOutputs(fluid('aqua_regia') * 3000)
    .duration(600)
    .EUt(24)
    .buildAndRegister()

recipemap('centrifuge').recipeBuilder()
    .outputs(metaitem('dustAluminium') * 2)
    .chancedOutput(metaitem('dustIron') * 1, 200,  0)
    .chancedOutput(metaitem('dustVanadium') * 1, 200,  0)
    .chancedOutput(metaitem('dustBeryllium') * 1, 200,  0)
    .fluidInputs(fluid('green_sapphire_slurry') * 3000)
    .fluidOutputs(fluid('aqua_regia') * 3000)
    .duration(600)
    .EUt(24)
    .buildAndRegister()