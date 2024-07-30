
recipemap('assembler').recipeBuilder()
    .inputs(ore('gemDiamond') * 1, ore('circuitLv') * 4, ore('wireFineAluminium') * 16)
    .outputs(metaitem('component.quick_and_dirty_portal_generator') * 1)
    .fluidInputs(fluid('steel') * 2304)
    .duration(1200)
    .EUt(32)
    .buildAndRegister()