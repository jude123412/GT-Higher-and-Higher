package materials

import gregtech.api.unification.material.properties.PropertyKey
import gregtech.loaders.recipe.handlers.OreRecipeHandler

import static classes.GTHHOrePrefix.*

class GTHHOreRecipeHandler {
    static void register() {

        oreMoon.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreCeres.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        orePluto.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        
    }
}
