import gregtech.api.recipes.recipeproperties.RecipeProperty
import gregtech.api.recipes.RecipeBuilder
import gregtech.api.recipes.ModHandler
import gregtech.api.recipes.RecipeMap
import gregtech.api.unification.material.Materials.*
import gregtech.api.unification.material.Materials
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.stack.UnificationEntry

import static gregtech.api.recipes.RecipeMaps.*

recipemap('assembler').recipeBuilder()
    .inputs(metaitem('wireFineCopper') * 4, metaitem('dustSmallCobaltOxide') * 1)
    .outputs(metaitem('component.diode') * 6)
    .fluidInputs(fluid('plastic') * 144)
    .duration(1800)
    .EUt(30)
    .buildAndRegister()
    
recipemap('assembler').recipeBuilder()
    .inputs(metaitem('wireFineAnnealedCopper') * 4, metaitem('dustSmallCobaltOxide') * 1)
    .outputs(metaitem('component.diode') * 12)
    .fluidInputs(fluid('plastic') * 144)
    .duration(1800)
    .EUt(30)
    .buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
    .inputs(metaitem('plateWood') * 1)
    .fluidInputs(fluid('phenol') * 50)
    .outputs(metaitem('board.phenolic') * 1)
    .duration(200)
    .EUt(30)
    .buildAndRegister()

recipemap('chemical_reactor').recipeBuilder()
    .inputs(metaitem('plateWood') * 4)
    .fluidInputs(fluid('bisphenol_a') * 50)
    .outputs(metaitem('board.phenolic') * 4)
    .duration(100)
    .EUt(120)
    .buildAndRegister()

// Recipe removal
// Diode * 2
mods.gregtech.assembler.removeByInput(30, [metaitem('wireFineCopper') * 4, metaitem('wafer.silicon')], [fluid('plastic') * 144])

// Diode * 4
mods.gregtech.assembler.removeByInput(30, [metaitem('wireFineAnnealedCopper') * 4, metaitem('wafer.silicon')], [fluid('plastic') * 144])
mods.gregtech.assembler.removeByInput(30, [metaitem('dustWood') * 1, item('gregtech:meta_item_1', 461).withNbt(['Configuration': 1])], [fluid('glue') * 50])

