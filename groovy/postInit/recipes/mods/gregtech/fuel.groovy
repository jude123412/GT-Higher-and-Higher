import classes.GTHHRecipeMaps

//Zombie Engine Fuels
recipemap('zombie_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorPrimative'))
    .fluidInputs(fluid('nutrient_distillation') * 1)
    .duration(12)
    .EUt(32)
    .buildAndRegister()

recipemap('zombie_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorBasic'))
    .fluidInputs(fluid('nutrient_distillation') * 1)
    .duration(15)
    .EUt(32)
    .buildAndRegister()


recipemap('zombie_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorIntegrated'))
    .fluidInputs(fluid('nutrient_distillation') * 1)
    .duration(18)
    .EUt(32)
    .buildAndRegister()

recipemap('zombie_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorAdvanced'))
    .fluidInputs(fluid('nutrient_distillation') * 1)
    .duration(21)
    .EUt(32)
    .buildAndRegister()

recipemap('zombie_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorExtreme'))
    .fluidInputs(fluid('nutrient_distillation') * 1)
    .duration(24)
    .EUt(32)
    .buildAndRegister()


recipemap('zombie_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorInsane'))
    .fluidInputs(fluid('nutrient_distillation') * 1)
    .duration(27)
    .EUt(32)
    .buildAndRegister()

//Ender Engine Fuels

recipemap('ender_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorPrimative'))
    .fluidInputs(fluid('ender_distillation') * 1)
    .duration(96)
    .EUt(32)
    .buildAndRegister()

recipemap('ender_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorBasic'))
    .fluidInputs(fluid('ender_distillation') * 1)
    .duration(120)
    .EUt(32)
    .buildAndRegister()

recipemap('ender_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorIntegrated'))
    .fluidInputs(fluid('ender_distillation') * 1)
    .duration(168)
    .EUt(32)
    .buildAndRegister()

recipemap('ender_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorAdvanced'))
    .fluidInputs(fluid('ender_distillation') * 1)
    .duration(192)
    .EUt(32)
    .buildAndRegister()

recipemap('ender_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorExtreme'))
    .fluidInputs(fluid('ender_distillation') * 1)
    .duration(216)
    .EUt(32)
    .buildAndRegister()

recipemap('ender_engine_fuels').recipeBuilder()
    .notConsumable(ore('capacitorInsane'))
    .fluidInputs(fluid('ender_distillation') * 1)
    .duration(240)
    .EUt(32)
    .buildAndRegister()
