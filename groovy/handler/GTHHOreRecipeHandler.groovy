package handler

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

import net.minecraft.item.ItemStack

import org.apache.commons.lang3.tuple.Pair

import material.GTHHOrePrefix

import static material.GTHHOrePrefix.*

class GTHHOreRecipeHandler {

    static void register() {

        oreMoon.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreMars.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreAsteroid.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreVenus.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreMercury.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreCeres.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreJupiter.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreSaturn.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreUranus.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreNeptune.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        orePluto.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreEris.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreKepler22B.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreEuropa.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreIo.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreDeimos.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        orePhobos.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreTriton.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreCallisto.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreGanymede.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreRhea.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreTitan.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreOberon.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreTitania.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        oreIapetus.addProcessingHandler(PropertyKey.ORE, OreRecipeHandler::processOre)
        
        cluster.addProcessingHandler(PropertyKey.ORE, GTHHOreRecipeHandler::processCluster)
        glob.addProcessingHandler(PropertyKey.ORE, GTHHOreRecipeHandler::processGlob)
        fragment.addProcessingHandler(PropertyKey.ORE, GTHHOreRecipeHandler::processFragment)
        murky.addProcessingHandler(PropertyKey.ORE, GTHHOreRecipeHandler::processMurky)

        }

    static void processCluster(OrePrefix clusterPrefix, Material material, OreProperty property) {
        
        mods.thaumcraft.crucible.recipeBuilder()
            .researchKey('METALPURIFICATION')
            .catalyst(OreDictUnifier.get(GTHHOrePrefix.glob, material, 1))
            .output(OreDictUnifier.get(GTHHOrePrefix.cluster, material, 2))
            .aspect(aspect('metallum') * 5)
            .aspect(aspect('ordo') * 5)
            .register()

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
            .input(clusterPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.dustImpure, material, 1))
            .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(0, material), property.getByProductMultiplier()), 1400, 850)
            .duration(400).EUt(2)
            .buildAndRegister();

        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(clusterPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1))
            .fluidInputs(Materials.Water.getFluid(100))
            .circuitMeta(2)
            .duration(8).EUt(4)
            .buildAndRegister();

        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(clusterPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .fluidInputs(Materials.Water.getFluid(1000))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
            .circuitMeta(1)
            .duration(400).EUt(16)
            .buildAndRegister();
        
        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(clusterPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .fluidInputs(Materials.DistilledWater.getFluid(100))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
            .duration(200).EUt(16)
            .buildAndRegister()
        
        RecipeMaps.THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
            .input(clusterPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedCentrifuged, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(1, material), property.getByProductMultiplier(), 3333, 0)
            .buildAndRegister()
        
        if (property.getWashedIn().getKey() != null) {
            Pair<Material, Integer> washedInTuple = property.getWashedIn();
            RecipeMaps.CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(clusterPrefix, material)
                    .fluidInputs(washedInTuple.getKey().getFluid(washedInTuple.getValue()))
                    .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1))
                    .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(3, material), property.getByProductMultiplier()),7000, 580)
                    .chancedOutput(OreDictUnifier.get(OrePrefix.dust, Materials.Stone), 4000, 650)
                    .duration(200).EUt(30)
                    .buildAndRegister()

        }
    }

    static void processGlob(OrePrefix globPrefix, Material material, OreProperty property) {
        
        mods.botania.mana_infusion.recipeBuilder()
            .input(OreDictUnifier.get(GTHHOrePrefix.fragment, material, 1))
            .output(OreDictUnifier.get(GTHHOrePrefix.glob, material, 2))
            .mana(1000)
            .catalyst(blockstate('botania:alchemycatalyst'))
            .register()

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
            .input(globPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.dustImpure, material, 1))
            .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(0, material), property.getByProductMultiplier()), 1400, 850)
            .duration(400).EUt(2)
            .buildAndRegister();

        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(globPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1))
            .fluidInputs(Materials.Water.getFluid(100))
            .circuitMeta(2)
            .duration(8).EUt(4)
            .buildAndRegister();

        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(globPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .fluidInputs(Materials.Water.getFluid(1000))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
            .circuitMeta(1)
            .duration(400).EUt(16)
            .buildAndRegister();
        
        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(globPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .fluidInputs(Materials.DistilledWater.getFluid(100))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
            .duration(200).EUt(16)
            .buildAndRegister()
        
        RecipeMaps.THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
            .input(globPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedCentrifuged, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(1, material), property.getByProductMultiplier(), 3333, 0)
            .buildAndRegister()
        
        if (property.getWashedIn().getKey() != null) {
            Pair<Material, Integer> washedInTuple = property.getWashedIn();
            RecipeMaps.CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(globPrefix, material)
                    .fluidInputs(washedInTuple.getKey().getFluid(washedInTuple.getValue()))
                    .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1))
                    .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(3, material), property.getByProductMultiplier()),7000, 580)
                    .chancedOutput(OreDictUnifier.get(OrePrefix.dust, Materials.Stone), 4000, 650)
                    .duration(200).EUt(30)
                    .buildAndRegister()
        }
    }

    static void processFragment(OrePrefix fragmentPrefix, Material material, OreProperty property) {

        mods.astralsorcery.infusion_altar.recipeBuilder()
            .input(OreDictUnifier.get(GTHHOrePrefix.murky, material, 1))
            .output(OreDictUnifier.get(GTHHOrePrefix.fragment, material, 2))
            .consumption(1f)
            .chalice(true)
            .consumeMultiple(true)
            .time(10)
            .register()

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
            .input(fragmentPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.dustImpure, material, 1))
            .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(0, material), property.getByProductMultiplier()), 1400, 850)
            .duration(400).EUt(2)
            .buildAndRegister();

        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(fragmentPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1))
            .fluidInputs(Materials.Water.getFluid(100))
            .circuitMeta(2)
            .duration(8).EUt(4)
            .buildAndRegister();

        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(fragmentPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .fluidInputs(Materials.Water.getFluid(1000))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
            .circuitMeta(1)
            .duration(400).EUt(16)
            .buildAndRegister();
        
        RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
            .input(fragmentPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .fluidInputs(Materials.DistilledWater.getFluid(100))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
            .duration(200).EUt(16)
            .buildAndRegister()
        
        RecipeMaps.THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
            .input(fragmentPrefix, material)
            .outputs(OreDictUnifier.get(OrePrefix.crushedCentrifuged, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
            .chancedOutput(OrePrefix.dust, property.getOreByProduct(1, material), property.getByProductMultiplier(), 3333, 0)
            .buildAndRegister()
        
        if (property.getWashedIn().getKey() != null) {
            Pair<Material, Integer> washedInTuple = property.getWashedIn();
            RecipeMaps.CHEMICAL_BATH_RECIPES.recipeBuilder()
                    .input(fragmentPrefix, material)
                    .fluidInputs(washedInTuple.getKey().getFluid(washedInTuple.getValue()))
                    .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 2))
                    .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(3, material), property.getByProductMultiplier()),7000, 580)
                    .chancedOutput(OreDictUnifier.get(OrePrefix.dust, Materials.Stone), 4000, 650)
                    .duration(200).EUt(30)
                    .buildAndRegister()
        }  
    }

    static void processMurky(OrePrefix murkyPrefix, Material material, OreProperty property) {

            mods.bloodmagic.blood_altar.recipeBuilder()
                .input(OreDictUnifier.get(OrePrefix.crushed, material, 1))
                .output(OreDictUnifier.get(GTHHOrePrefix.murky, material, 2))
                .minimumTier(1)
                .drainRate(5)
                .syphon(500)
                .consumeRate(5)
                .register()

            RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .input(murkyPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.dustImpure, material, 1))
                .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(0, material), property.getByProductMultiplier()), 1400, 850)
                .duration(400).EUt(2)
                .buildAndRegister();

            RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
                .input(murkyPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1))
                .fluidInputs(Materials.Water.getFluid(100))
                .circuitMeta(2)
                .duration(8).EUt(4)
                .buildAndRegister();

            RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
                .input(murkyPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
                .fluidInputs(Materials.Water.getFluid(1000))
                .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
                .circuitMeta(1)
                .duration(400).EUt(16)
                .buildAndRegister();
            
            RecipeMaps.ORE_WASHER_RECIPES.recipeBuilder()
                .input(murkyPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
                .fluidInputs(Materials.DistilledWater.getFluid(100))
                .chancedOutput(OrePrefix.dust, property.getOreByProduct(0, material), 3333, 0)
                .duration(200).EUt(16)
                .buildAndRegister()
            
            RecipeMaps.THERMAL_CENTRIFUGE_RECIPES.recipeBuilder()
                .input(murkyPrefix, material)
                .outputs(OreDictUnifier.get(OrePrefix.crushedCentrifuged, material, 1), OreDictUnifier.get(OrePrefix.dust, Materials.Stone, 1))
                .chancedOutput(OrePrefix.dust, property.getOreByProduct(1, material), property.getByProductMultiplier(), 3333, 0)
                .buildAndRegister()
            
            if (property.getWashedIn().getKey() != null) {
                Pair<Material, Integer> washedInTuple = property.getWashedIn();
                RecipeMaps.CHEMICAL_BATH_RECIPES.recipeBuilder()
                        .input(murkyPrefix, material)
                        .fluidInputs(washedInTuple.getKey().getFluid(washedInTuple.getValue()))
                        .outputs(OreDictUnifier.get(OrePrefix.crushedPurified, material, 1))
                        .chancedOutput(OreDictUnifier.get(OrePrefix.dust, property.getOreByProduct(3, material), property.getByProductMultiplier()),7000, 580)
                        .chancedOutput(OreDictUnifier.get(OrePrefix.dust, Materials.Stone), 4000, 650)
                        .duration(200).EUt(30)
                        .buildAndRegister()

        }
    }
}

