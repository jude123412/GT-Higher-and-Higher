package classes

import net.minecraftforge.fml.common.eventhandler.EventPriority

import gregtech.api.unification.material.Material
import gregtech.api.GregTechAPI
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.material.info.MaterialFlag
import gregtech.api.unification.material.properties.*
import gregtech.api.unification.material.properties.OreProperty
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.material.properties.BlastProperty
import gregtech.api.unification.material.properties.BlastProperty.GasTier
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.RecipeMaps

import static materials.GTHHMaterials.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.Materials.*

class GTHHMaterialFlags {

    static void init() { 
        
        BorosilicateGlass.addOre()

        CobaltOxide.setProperty(PropertyKey.ORE, new OreProperty())
        CobaltOxide.setProperty(PropertyKey.INGOT, new IngotProperty())
        CobaltOxide.setFormula("Co3O4", true)
        CobaltOxide.addFlags("disable_decomposition")

    }

}