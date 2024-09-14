// LV Energy Hatch * 1
mods.gregtech.assembler.removeByInput(30, [metaitem('hull.lv'), metaitem('cableGtSingleTin') * 2, metaitem('voltage_coil.lv')], null)

crafting.removeByOutput(metaitem('emitter.lv'))
crafting.removeByOutput(metaitem('field.generator.lv'))
crafting.removeByOutput(metaitem('energy_hatch.input.lv'))

crafting.addShaped(metaitem('energy_hatch.input.lv'), [ 
    [ore('10kCoolantCell'), metaitem('voltage_coil.lv'), ore('10kCoolantCell')],
    [metaitem('cableGtSingleTin'), metaitem('hull.lv'), metaitem('cableGtSingleTin')],
    [null, null, null]
])

recipemap('assembler').recipeBuilder()
    .inputs(metaitem('cableGtSingleTin') * 2, metaitem('voltage_coil.lv') * 1, metaitem('hull.lv') * 1, ore('10kCoolantCell') * 1, ore('10kCoolantCell') * 1)
    .outputs(metaitem('energy_hatch.input.lv') * 1)
    .duration(20)
    .EUt(16)
    .buildAndRegister()