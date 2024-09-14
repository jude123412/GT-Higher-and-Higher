//Item Conduit
crafting.removeByOutput(item('enderio:item_item_conduit'))
crafting.addShaped(item('enderio:item_item_conduit'), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFinePulsatingIron'), ore('wireFinePulsatingIron'), ore('wireFinePulsatingIron')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFinePulsatingIron') * 1)
    .outputs(item('enderio:item_item_conduit') * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFinePulsatingIron') * 1)
    .outputs(item('enderio:item_item_conduit') * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFinePulsatingIron') * 1)
    .outputs(item('enderio:item_item_conduit') * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFinePulsatingIron') * 1)
    .outputs(item('enderio:item_item_conduit') * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Fluid Conduit
crafting.removeByOutput(item('enderio:item_liquid_conduit'))
crafting.addShaped(item('enderio:item_liquid_conduit'), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineGlass'), ore('wireFineGlass'), ore('wireFineGlass')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineGlass') * 1)
    .outputs(item('enderio:item_liquid_conduit') * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineGlass') * 1)
    .outputs(item('enderio:item_liquid_conduit') * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineGlass') * 1)
    .outputs(item('enderio:item_liquid_conduit') * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineGlass') * 1)
    .outputs(item('enderio:item_liquid_conduit') * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Pressurized Fluid Conduit
crafting.removeByOutput(item('enderio:item_liquid_conduit', 1))
crafting.addShaped(item('enderio:item_liquid_conduit', 1), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineBorosilicateGlass'), ore('wireFineBorosilicateGlass'), ore('wireFineBorosilicateGlass')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineBorosilicateGlass') * 1)
    .outputs(item('enderio:item_liquid_conduit', 1) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineBorosilicateGlass') * 1)
    .outputs(item('enderio:item_liquid_conduit', 1) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineBorosilicateGlass') * 1)
    .outputs(item('enderio:item_liquid_conduit', 1) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineBorosilicateGlass') * 1)
    .outputs(item('enderio:item_liquid_conduit', 1) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Ender Fluid Conduit
crafting.removeByOutput(item('enderio:item_liquid_conduit', 2))
crafting.addShaped(item('enderio:item_liquid_conduit', 2), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineVibrantAlloy'), ore('wireFineVibrantAlloy'), ore('wireFineVibrantAlloy')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineVibrantAlloy') * 1)
    .outputs(item('enderio:item_liquid_conduit', 2) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineVibrantAlloy') * 1)
    .outputs(item('enderio:item_liquid_conduit', 2) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineVibrantAlloy') * 1)
    .outputs(item('enderio:item_liquid_conduit', 2) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineVibrantAlloy') * 1)
    .outputs(item('enderio:item_liquid_conduit', 2) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Redstone Conduit
crafting.removeByOutput(item('enderio:item_redstone_conduit'))
crafting.addShaped(item('enderio:item_redstone_conduit'), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineRedstoneAlloy'), ore('wireFineRedstoneAlloy'), ore('wireFineRedstoneAlloy')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineRedstoneAlloy') * 1)
    .outputs(item('enderio:item_redstone_conduit') * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineRedstoneAlloy') * 1)
    .outputs(item('enderio:item_redstone_conduit') * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineRedstoneAlloy') * 1)
    .outputs(item('enderio:item_redstone_conduit') * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineRedstoneAlloy') * 1)
    .outputs(item('enderio:item_redstone_conduit') * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Extract Speed Upgrade
crafting.removeByOutput(item('enderio:item_extract_speed_upgrade'))
crafting.addShaped(item('enderio:item_extract_speed_upgrade') * 1, [
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')],
    [ore('plateEnergeticSilver'), metaitem('electric.motor.lv'), ore('plateEnergeticSilver')],
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')]
])

crafting.addShaped(item('enderio:item_extract_speed_upgrade') * 2, [
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')],
    [ore('plateEnergeticSilver'), metaitem('electric.motor.mv'), ore('plateEnergeticSilver')],
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')]
])

crafting.addShaped(item('enderio:item_extract_speed_upgrade') * 4, [
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')],
    [ore('plateEnergeticSilver'), metaitem('electric.motor.hv'), ore('plateEnergeticSilver')],
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')]
])

crafting.addShaped(item('enderio:item_extract_speed_upgrade') * 8, [
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')],
    [ore('plateEnergeticSilver'), metaitem('electric.motor.ev'), ore('plateEnergeticSilver')],
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')]
])

crafting.addShaped(item('enderio:item_extract_speed_upgrade') * 16, [
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')],
    [ore('plateEnergeticSilver'), metaitem('electric.motor.iv'), ore('plateEnergeticSilver')],
    [ore('screwElectricalSteel'), ore('plateEnergeticSilver'), ore('screwElectricalSteel')]
])

//Extract Speed Downgrade
crafting.removeByOutput(item('enderio:item_extract_speed_downgrade'))
crafting.addShaped(item('enderio:item_extract_speed_downgrade') * 1, [
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')],
    [ore('plateRedstoneAlloy'), metaitem('electric.motor.lv'), ore('plateRedstoneAlloy')],
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')]
])

crafting.addShaped(item('enderio:item_extract_speed_downgrade') * 2, [
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')],
    [ore('plateRedstoneAlloy'), metaitem('electric.motor.mv'), ore('plateRedstoneAlloy')],
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')]
])

crafting.addShaped(item('enderio:item_extract_speed_downgrade') * 4, [
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')],
    [ore('plateRedstoneAlloy'), metaitem('electric.motor.hv'), ore('plateRedstoneAlloy')],
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')]
])

crafting.addShaped(item('enderio:item_extract_speed_downgrade') * 8, [
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')],
    [ore('plateRedstoneAlloy'), metaitem('electric.motor.ev'), ore('plateRedstoneAlloy')],
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')]
])

crafting.addShaped(item('enderio:item_extract_speed_downgrade') * 16, [
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')],
    [ore('plateRedstoneAlloy'), metaitem('electric.motor.iv'), ore('plateRedstoneAlloy')],
    [ore('screwElectricalSteel'), ore('plateRedstoneAlloy'), ore('screwElectricalSteel')]
])

//ME Conduit
crafting.removeByOutput(item('enderio:item_me_conduit'))
crafting.addShaped(item('enderio:item_me_conduit'), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('cableCovered'), ore('cableCovered'), ore('cableCovered')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('cableCovered') * 1)
    .outputs(item('enderio:item_me_conduit') * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('cableCovered') * 1)
    .outputs(item('enderio:item_me_conduit') * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('cableCovered') * 1)
    .outputs(item('enderio:item_me_conduit') * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('cableCovered') * 1)
    .outputs(item('enderio:item_me_conduit') * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//ME Dense Conduit
crafting.removeByOutput(item('enderio:item_me_conduit', 1))
crafting.addShaped(item('enderio:item_me_conduit', 1), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('cableCoveredDense'), ore('cableCoveredDense'), ore('cableCoveredDense')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('cableCoveredDense') * 1)
    .outputs(item('enderio:item_me_conduit', 1) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('cableCoveredDense') * 1)
    .outputs(item('enderio:item_me_conduit', 1) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('cableCoveredDense') * 1)
    .outputs(item('enderio:item_me_conduit', 1) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('cableCoveredDense') * 1)
    .outputs(item('enderio:item_me_conduit', 1) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Crude Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit'))
crafting.addShaped(item('enderio:item_endergy_conduit'), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineCrudeSteel'), ore('wireFineCrudeSteel'), ore('wireFineCrudeSteel')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrudeSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit') * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrudeSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit') * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrudeSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit') * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrudeSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit') * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Electrical Steel Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 1))
crafting.addShaped(item('enderio:item_endergy_conduit', 1), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineElectricalSteel'), ore('wireFineElectricalSteel'), ore('wireFineElectricalSteel')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineElectricalSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 1) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineElectricalSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 1) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineElectricalSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 1) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineElectricalSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 1) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Dark Steel Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 2))
crafting.addShaped(item('enderio:item_endergy_conduit', 2), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineDarkSteel'), ore('wireFineDarkSteel'), ore('wireFineDarkSteel')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineDarkSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 2) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineDarkSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 2) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineDarkSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 2) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineDarkSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 2) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Energetic Silver Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 3))
crafting.addShaped(item('enderio:item_endergy_conduit', 3), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineEnergeticSilver'), ore('wireFineEnergeticSilver'), ore('wireFineEnergeticSilver')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEnergeticSilver') * 1)
    .outputs(item('enderio:item_endergy_conduit', 3) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEnergeticSilver') * 1)
    .outputs(item('enderio:item_endergy_conduit', 3) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEnergeticSilver') * 1)
    .outputs(item('enderio:item_endergy_conduit', 3) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEnergeticSilver') * 1)
    .outputs(item('enderio:item_endergy_conduit', 3) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Vivid Alloy Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 4))
crafting.addShaped(item('enderio:item_endergy_conduit', 4), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineVividAlloy'), ore('wireFineVividAlloy'), ore('wireFineVividAlloy')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineVividAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 4) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineVividAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 4) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineVividAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 4) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineVividAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 4) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Conductive Iron Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 5))
crafting.addShaped(item('enderio:item_endergy_conduit', 5), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineConductiveIron'), ore('wireFineConductiveIron'), ore('wireFineConductiveIron')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineConductiveIron') * 1)
    .outputs(item('enderio:item_endergy_conduit', 5) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineConductiveIron') * 1)
    .outputs(item('enderio:item_endergy_conduit', 5) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineConductiveIron') * 1)
    .outputs(item('enderio:item_endergy_conduit', 5) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineConductiveIron') * 1)
    .outputs(item('enderio:item_endergy_conduit', 5) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Energetic Alloy Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 6))
crafting.addShaped(item('enderio:item_endergy_conduit', 6), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineEnergeticAlloy'), ore('wireFineEnergeticAlloy'), ore('wireFineEnergeticAlloy')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEnergeticAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 6) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEnergeticAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 6) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEnergeticAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 6) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEnergeticAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 6) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//End Steel Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 7))
crafting.addShaped(item('enderio:item_endergy_conduit', 7), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineEndSteel'), ore('wireFineEndSteel'), ore('wireFineEndSteel')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEndSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 7) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEndSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 7) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEndSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 7) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineEndSteel') * 1)
    .outputs(item('enderio:item_endergy_conduit', 7) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Crystalline Alloy Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 8))
crafting.addShaped(item('enderio:item_endergy_conduit', 8), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineCrystallineAlloy'), ore('wireFineCrystallineAlloy'), ore('wireFineCrystallineAlloy')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrystallineAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 8) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrystallineAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 8) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrystallineAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 8) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrystallineAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 8) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Melodic Alloy Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 9))
crafting.addShaped(item('enderio:item_endergy_conduit', 9), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineMelodicAlloy'), ore('wireFineMelodicAlloy'), ore('wireFineMelodicAlloy')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineMelodicAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 9) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineMelodicAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 9) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineMelodicAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 9) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineMelodicAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 9) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Crystalline Pink Slime Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 10))
crafting.addShaped(item('enderio:item_endergy_conduit', 10), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineCrystallinePinkSlime'), ore('wireFineCrystallinePinkSlime'), ore('wireFineCrystallinePinkSlime')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrystallinePinkSlime') * 1)
    .outputs(item('enderio:item_endergy_conduit', 10) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrystallinePinkSlime') * 1)
    .outputs(item('enderio:item_endergy_conduit', 10) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrystallinePinkSlime') * 1)
    .outputs(item('enderio:item_endergy_conduit', 10) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineCrystallinePinkSlime') * 1)
    .outputs(item('enderio:item_endergy_conduit', 10) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

//Stellar Alloy Energy Conduit
crafting.removeByOutput(item('enderio:item_endergy_conduit', 11))
crafting.addShaped(item('enderio:item_endergy_conduit', 11), [
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')],
    [ore('wireFineStellarAlloy'), ore('wireFineStellarAlloy'), ore('wireFineStellarAlloy')],
    [ore('itemConduitBinder'), ore('screwDarkSteel'), ore('itemConduitBinder')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineStellarAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 11) * 1)
    .fluidInputs(fluid('glue') * 288)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineStellarAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 11) * 1)
    .fluidInputs(fluid('plastic') * 144)
    .duration(150)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineStellarAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 11) * 1)
    .fluidInputs(fluid('polytetrafluoroethylene') * 72)
    .duration(100)
    .EUt(384)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('itemConduitBinder') * 4, ore('wireFineStellarAlloy') * 1)
    .outputs(item('enderio:item_endergy_conduit', 11) * 1)
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .duration(50)
    .EUt(384)
    .buildAndRegister()

// crafting.removeByOutput(null)
// crafting.addShaped(null, [
//     [null, null, null],
//     [null, null, null],
//     [null, null, null]
// ])
