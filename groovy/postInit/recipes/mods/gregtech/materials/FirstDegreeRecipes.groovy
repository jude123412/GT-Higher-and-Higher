import gregtech.api.recipes.recipeproperties.RecipeProperty
import gregtech.api.recipes.RecipeBuilder
import gregtech.api.recipes.ModHandler
import gregtech.api.recipes.RecipeMap
import gregtech.api.unification.material.Materials.*
import gregtech.api.unification.material.Materials
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.stack.UnificationEntry

import static gregtech.api.recipes.RecipeMaps.*

recipemap('chemical_reactor').recipeBuilder()
    .inputs(metaitem('dustCobalt') * 3)
    .fluidInputs(fluid('oxygen') * 4000)
    .outputs(metaitem('dustCobaltOxide') * 7)
    .duration(300)
    .EUt(96)
    .buildAndRegister()

recipemap('electrolyzer').recipeBuilder()
    .inputs(metaitem('dustCobaltOxide') * 7)
    .outputs(metaitem('dustCobalt') * 3)
    .fluidOutputs(fluid('oxygen') * 4000)
    .duration(80)
    .EUt(30)
    .buildAndRegister()

// Recipe Removal
// Cobalt Oxide Dust * 1
mods.gregtech.electric_blast_furnace.removeByInput(120, [metaitem('dustCobaltite')], [fluid('oxygen') * 3000])


