crafting.addShaped(metaitem('component.empty_10k_coolant_cell'), [ 
    [null, ore('plateTin'), null],
    [ore('plateTin'), metaitem('fluid_cell'), ore('plateTin')],
    [null, ore('plateTin'), null]
])

crafting.addShaped(metaitem('component.empty_30k_coolant_cell'), [ 
    [ore('plateTin'), ore('plateTin'), ore('plateTin')],
    [metaitem('component.empty_10k_coolant_cell'), ore('plateTin'), metaitem('component.empty_10k_coolant_cell')],
    [ore('plateTin'), ore('plateTin'), ore('plateTin')]
])

crafting.addShaped(metaitem('component.empty_60k_coolant_cell'), [ 
    [ore('plateTin'), ore('plateTin'), ore('plateTin')],
    [metaitem('component.empty_30k_coolant_cell'), ore('plateTin'), metaitem('component.empty_30k_coolant_cell')],
    [ore('plateTin'), ore('plateTin'), ore('plateTin')]
])
recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_10k_coolant_cell') * 1)
    .outputs(metaitem('component.10k_coolant_cell') * 1)
    .fluidInputs(fluid('coolant') * 1000)
    .duration(20)
    .EUt(16)
    .buildAndRegister()

recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_30k_coolant_cell') * 1)
    .outputs(metaitem('component.30k_coolant_cell') * 1)
    .fluidInputs(fluid('coolant') * 2000)
    .duration(40)
    .EUt(16)
    .buildAndRegister()

recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_60k_coolant_cell') * 1)
    .outputs(metaitem('component.60k_coolant_cell') * 1)
    .fluidInputs(fluid('coolant') * 4000)
    .duration(80)
    .EUt(16)
    .buildAndRegister()

recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_10k_coolant_cell') * 1)
    .outputs(metaitem('component.10k_nak_coolant_cell') * 1)
    .fluidInputs(fluid('sodium_potassium') * 1000)
    .duration(20)
    .EUt(1024)
    .buildAndRegister()

recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_30k_coolant_cell') * 1)
    .outputs(metaitem('component.30k_nak_coolant_cell') * 1)
    .fluidInputs(fluid('sodium_potassium') * 2000)
    .duration(40)
    .EUt(1024)
    .buildAndRegister()

recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_60k_coolant_cell') * 1)
    .outputs(metaitem('component.60k_nak_coolant_cell') * 1)
    .fluidInputs(fluid('sodium_potassium') * 4000)
    .duration(80)
    .EUt(1024)
    .buildAndRegister()

recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_10k_coolant_cell') * 1)
    .outputs(metaitem('component.10k_space_coolant_cell') * 1)
    .fluidInputs(fluid('space_coolant') * 1000)
    .duration(20)
    .EUt(65536)
    .buildAndRegister()

recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_30k_coolant_cell') * 1)
    .outputs(metaitem('component.30k_space_coolant_cell') * 1)
    .fluidInputs(fluid('space_coolant') * 2000)
    .duration(40)
    .EUt(65536)
    .buildAndRegister()

recipemap('canner').recipeBuilder()
    .inputs(metaitem('component.empty_60k_coolant_cell') * 1)
    .outputs(metaitem('component.60k_space_coolant_cell') * 1)
    .fluidInputs(fluid('space_coolant') * 4000)
    .duration(80)
    .EUt(65536)
    .buildAndRegister()