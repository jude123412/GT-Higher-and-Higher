import gregtech.api.recipes.recipeproperties.RecipeProperty
import gregtech.api.recipes.RecipeBuilder
import gregtech.api.recipes.ModHandler
import gregtech.api.recipes.RecipeMap
import gregtech.api.unification.material.Materials.*
import gregtech.api.unification.material.Materials
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.stack.UnificationEntry

import static gregtech.api.recipes.RecipeMaps.*

crafting.removeByOutput(item('forestry:bee_chest'))
crafting.removeByOutput(item('forestry:butterfly_chest'))

crafting.replaceShaped(item('forestry:miner_bag'), [
    [ore('string'), ore('wool'), ore('string')],
    [ore('plateBronze'), ore('chest'), ore('plateBronze')],
    [ore('string'), ore('wool'), ore('string')]
])

crafting.replaceShaped(item('forestry:digger_bag'), [
    [ore('string'), ore('wool'), ore('string')],
    [ore('plateStone'), ore('chest'), ore('plateStone')],
    [ore('string'), ore('wool'), ore('string')]
])

crafting.replaceShaped(item('forestry:forester_bag'), [
    [ore('string'), ore('wool'), ore('string')],
    [ore('plateTreatedWood'), ore('chest'), ore('plateTreatedWood')],
    [ore('string'), ore('wool'), ore('string')]
])

crafting.replaceShaped(item('forestry:hunter_bag'), [
    [ore('string'), ore('wool'), ore('string')],
    [item('minecraft:arrow'), ore('chest'), item('minecraft:arrow')],
    [ore('string'), ore('wool'), ore('string')]
])

crafting.replaceShaped(item('forestry:adventurer_bag'), [
    [ore('string'), ore('wool'), ore('string')],
    [item('minecraft:bone'), ore('chest'), item('minecraft:bone')],
    [ore('string'), ore('wool'), ore('string')]
])

crafting.replaceShaped(item('forestry:builder_bag'), [
    [ore('string'), ore('wool'), ore('string')],
    [item('minecraft:brick_block'), ore('chest'), item('minecraft:brick_block')],
    [ore('string'), ore('wool'), ore('string')]
])

crafting.replaceShaped(item('forestry:apiarist_bag'), [
    [ore('string'), ore('wool'), ore('string')],
    [item('forestry:honeydew'), item('forestry:bee_chest'), item('forestry:honeydew')],
    [ore('string'), ore('wool'), ore('string')]
])

crafting.replaceShaped(item('forestry:lepidopterist_bag'), [
    [ore('string'), ore('wool'), ore('string')],
    [item('forestry:honeydew'), item('forestry:butterfly_chest'), item('forestry:honeydew')],
    [ore('string'), ore('wool'), ore('string')]
])

recipemap('assembler').recipeBuilder()
    .inputs(ore('gemExquisiteDiamond') * 1, item('forestry:crafting_material', 3) * 8, item('forestry:miner_bag') * 1)
    .outputs(item('forestry:miner_bag_t2') * 1)
    .fluidInputs(fluid('water') * 1000)
    .duration(1200)
    .EUt(28)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('gemExquisiteDiamond') * 1, item('forestry:crafting_material', 3) * 8, item('forestry:digger_bag') * 1)
    .outputs(item('forestry:digger_bag_t2') * 1)
    .fluidInputs(fluid('water') * 1000)
    .duration(1200)
    .EUt(28)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('gemExquisiteDiamond') * 1, item('forestry:crafting_material', 3) * 8, item('forestry:forester_bag') * 1)
    .outputs(item('forestry:forester_bag_t2') * 1)
    .fluidInputs(fluid('water') * 1000)
    .duration(1200)
    .EUt(28)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('gemExquisiteDiamond') * 1, item('forestry:crafting_material', 3) * 8, item('forestry:hunter_bag') * 1)
    .outputs(item('forestry:hunter_bag_t2') * 1)
    .fluidInputs(fluid('water') * 1000)
    .duration(1200)
    .EUt(28)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('gemExquisiteDiamond') * 1, item('forestry:crafting_material', 3) * 8, item('forestry:adventurer_bag') * 1)
    .outputs(item('forestry:adventurer_bag_t2') * 1)
    .fluidInputs(fluid('water') * 1000)
    .duration(1200)
    .EUt(28)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('gemExquisiteDiamond') * 1, item('forestry:crafting_material', 3) * 8, item('forestry:builder_bag') * 1)
    .outputs(item('forestry:builder_bag_t2') * 1)
    .fluidInputs(fluid('water') * 1000)
    .duration(1200)
    .EUt(28)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('chest') * 1, ore('beeComb') * 8, ore('plateSteel') * 4)
    .outputs(item('forestry:bee_chest') * 1)
    .fluidInputs(fluid('honey') * 1000)
    .duration(2400)
    .EUt(96)
    .buildAndRegister()

recipemap('assembler').recipeBuilder()
    .inputs(ore('chest') * 1, ore('beeComb') * 8, ore('plateBronze') * 4)
    .outputs(item('forestry:butterfly_chest') * 1)
    .fluidInputs(fluid('honey') * 1000)
    .duration(2400)
    .EUt(28)
    .buildAndRegister()