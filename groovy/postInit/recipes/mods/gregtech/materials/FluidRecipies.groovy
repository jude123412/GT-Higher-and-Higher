recipemap('mixer').recipeBuilder()
    .inputs(ore('dustLapis') * 1)
    .fluidInputs(fluid('distilled_water') * 1000)
    .fluidOutputs(fluid('coolant') * 1000)
    .duration(40)
    .EUt(16)
    .buildAndRegister()

recipemap('extractor').recipeBuilder()
    .inputs(ore('itemPowderPhotovoltaic') * 1)
    .fluidOutputs(fluid('photovoltaic_composite') * 144)
    .duration(100)
    .EUt(64)
    .buildAndRegister()