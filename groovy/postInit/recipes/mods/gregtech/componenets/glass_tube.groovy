recipemap('forming_press').recipeBuilder()
    .notConsumable(metaitem('shape.mold.ball') * 1)
    .inputs(metaitem('dustBorosilicateGlass') * 1)
    .outputs(metaitem('component.borosilicate_glass.tube') * 1)
    .duration(80)
    .EUt(28)
    .buildAndRegister()

recipemap('fluid_solidifier').recipeBuilder()
    .notConsumable(metaitem('shape.mold.ball') * 1)
    .outputs(metaitem('component.borosilicate_glass.tube') * 1)
    .fluidInputs(fluid('borosilicate_glass') * 144)
    .circuitMeta(1)
    .duration(200)
    .EUt(96)
    .buildAndRegister()

recipemap('alloy_smelter').recipeBuilder()
    .notConsumable(metaitem('shape.mold.ball') * 1)
    .inputs(metaitem('dustBorosilicateGlass') * 1)
    .outputs(metaitem('component.borosilicate_glass.tube') * 1)
    .duration(160)
    .EUt(16)
    .buildAndRegister()

