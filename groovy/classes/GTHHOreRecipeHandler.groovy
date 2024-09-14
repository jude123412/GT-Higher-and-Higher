package classes


import gregtech.api.unification.OreDictUnifier
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.Materials
import gregtech.api.unification.material.properties.OreProperty
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.recipes.RecipeBuilder
import gregtech.api.recipes.RecipeMaps
import gregtech.api.util.GTUtility
import gregtech.loaders.recipe.handlers.OreRecipeHandler
import gregtech.integration.groovy.GroovyScriptModule


import net.minecraft.item.ItemStack

import org.apache.commons.lang3.tuple.Pair

import material.GTHHOrePrefix

import static material.GTHHOrePrefix.*

class GTHHOreRecipeHandler {

    static void register() {

        oreMoon.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreCeres.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        orePluto.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        cluster.addProcessingHandler(PropertyKey.ORE, GTHHOreRecipeHandler::processCluster)

    }

    static void processCluster(OrePrefix clusterPrefix, Material material, OreProperty property) {

            RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .inputs(OreDictUnifier.get(OrePrefix.crushed, material, 1), OreDictUnifier.get("catalystNative"))
                .outputs(OreDictUnifier.get(GTHHOrePrefix.cluster, material, 1))
                .fluidInputs(Materials.Water.getFluid(1000))
                .duration(20).EUt(32)
                .buildAndRegister();

            RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .input(clusterPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.dustImpure, material, 2))
                .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(0, material), property.getByProductMultiplier()), 1400, 850)
                .duration(400).EUt(2)
                .buildAndRegister();

            RecipeMaps.FORGE_HAMMER_RECIPES.recipeBuilder()
                .input(clusterPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.dustImpure, material, 2))
                .duration(10)
                .EUt(16)
                .buildAndRegister();

            RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
                .input(clusterPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 2))
                .fluidInputs(Materials.Water.getFluid(100))
                .circuitMeta(2)
                .duration(8).EUt(4)
                .buildAndRegister();

            RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
                .input(clusterPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 2), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
                .fluidInputs(Materials.Water.getFluid(1000))
                .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
                .circuitMeta(1)
                .duration(400).EUt(16)
                .buildAndRegister();
            
            RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
                .input(clusterPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 2), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
                .fluidInputs(Materials.DistilledWater.getFluid(100))
                .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
                .duration(200).EUt(16)
                .buildAndRegister()
            
            RecipeMaps.THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
                .input(clusterPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.crushedCentrifuged, material, 2), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
                .chancedOutput(OrePrefix.dust, property.getOreByProduct(1, material), property.getByProductMultiplier(), 3333, 0)
                .buildAndRegister()
            
            if (property.getWashedIn().getKey() != null) {
                Pair<Material, Integer> washedInTuple = property.getWashedIn();
                RecipeMaps.CHEMICAL_BATH_RECIPES.recipeBuilder()
                        .input(clusterPrefix, material)
                        .fluidInputs(washedInTuple.getKey().getFluid(washedInTuple.getValue()))
                        .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 2))
                        .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(3, material), property.getByProductMultiplier()),7000, 580)
                        .chancedOutput(OreDictUnifier.get(OrePrefix.dust, Materials.Stone), 4000, 650)
                        .duration(200).EUt(30)
                        .buildAndRegister()

        }
    }
}