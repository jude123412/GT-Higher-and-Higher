mods.gregtech.distillery.removeByInput(72, [item('gregtech:meta_item_1', 461).withNbt(['Configuration': 1]) * 1], [fluid('oil_heavy') * 50])
mods.gregtech.distillery.removeByInput(72, [item('gregtech:meta_item_1', 461).withNbt(['Configuration': 2]) * 1], [fluid('oil_heavy') * 100])
mods.gregtech.distillery.removeByInput(72, [item('gregtech:meta_item_1', 461).withNbt(['Configuration': 3]) * 1], [fluid('oil_heavy') * 100])
mods.gregtech.distillery.removeByInput(72, [item('gregtech:meta_item_1', 461).withNbt(['Configuration': 4]) * 1], [fluid('oil_heavy') * 50])
mods.gregtech.distillation_tower.removeByInput(288, null, [fluid('oil_heavy') * 100])

recipemap('distillation_tower').recipeBuilder()
    .fluidInputs(fluid('oil_heavy') * 100)
    .fluidOutputs(fluid('sulfuric_heavy_fuel') * 250, fluid('sulfuric_light_fuel') * 45, fluid('sulfuric_naphtha') * 15, fluid('sulfuric_gas') * 60)
    .duration(20)
    .EUt(96)
    .buildAndRegister()