import mods.gregtech.machine.MachineBuilder;
import mods.gregtech.recipe.RecipeMapBuilder;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

    MachineBuilder.create(32000, "centrifuge")
        .setRecipeMap(RecipeMaps.CENTRIFUGE_RECIPES)
        .setRenderer("machines/centrifuge")
        .addTier(0)
        .addSteamTier(false, true)
        .addSteamTier(true)
        .buildAndRegister();

    MachineBuilder.create(32003, "mixer")
        .setRecipeMap(RecipeMaps.MIXER_RECIPES)
        .setRenderer("machines/mixer")
        .addTier(0)
        .addSteamTier(false, true)
        .addSteamTier(true)
        .buildAndRegister();

    MachineBuilder.create(32006, "assembler")
        .setRecipeMap(RecipeMaps.ASSEMBLER_RECIPES)
        .setRenderer("machines/assembler")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32007, "circuit_assembler")
        .setRecipeMap(RecipeMaps.CIRCUIT_ASSEMBLER_RECIPES)
        .setRenderer("machines/assembler")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32008, "alloy_smelter")
        .setRecipeMap(RecipeMaps.ALLOY_SMELTER_RECIPES)
        .setRenderer("machines/alloy_smelter")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32009, "macerator")
        .setRecipeMap(RecipeMaps.MACERATOR_RECIPES)
        .setRenderer("machines/macerator")
        .addTier(0)
        .buildAndRegister();
    
    
    MachineBuilder.create(32010, "brewery")
        .setRecipeMap(RecipeMaps.BREWING_RECIPES)
        .setRenderer("machines/brewery")
        .addTier(0)
        .buildAndRegister();

    
    MachineBuilder.create(32011, "canning_machine")
        .setRecipeMap(RecipeMaps.CANNER_RECIPES)
        .setRenderer("machines/canner")
        .addTier(0)
        .buildAndRegister();


    MachineBuilder.create(32012, "chemical_bath")
        .setRecipeMap(RecipeMaps.CHEMICAL_BATH_RECIPES)
        .setRenderer("machines/chemical_bath")
        .addTier(0)
        .buildAndRegister();
    
    MachineBuilder.create(32013, "cutting_machine")
        .setRecipeMap(RecipeMaps.CUTTER_RECIPES)
        .setRenderer("machines/cutter")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32014, "extractor")
        .setRecipeMap(RecipeMaps.EXTRACTOR_RECIPES)
        .setRenderer("machines/extractor")
        .addTier(0)
        .buildAndRegister();
    
    MachineBuilder.create(32015, "forge_hammer")
        .setRecipeMap(RecipeMaps.FORGE_HAMMER_RECIPES)
        .setRenderer("machines/forge_hammer")
        .addTier(0)
        .buildAndRegister();
    
    MachineBuilder.create(32016, "lathe")
        .setRecipeMap(RecipeMaps.LATHE_RECIPES)
        .setRenderer("machines/lathe")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32017, "ore_washer")
        .setRecipeMap(RecipeMaps.ORE_WASHER_RECIPES)
        .setRenderer("machines/ore_washer")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32018, "packager")
        .setRecipeMap(RecipeMaps.PACKER_RECIPES)
        .setRenderer("machines/packer")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32019, "gas_collector")
        .setRecipeMap(RecipeMaps.GAS_COLLECTOR_RECIPES)
        .setRenderer("machines/gas_collector")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32020, "wiremill")
        .setRecipeMap(RecipeMaps.WIREMILL_RECIPES)
        .setRenderer("machines/wiremill")
        .addTier(0)
        .buildAndRegister();
    
    MachineBuilder.create(32021, "rock_breaker")
        .setRecipeMap(RecipeMaps.ROCK_BREAKER_RECIPES)
        .setRenderer("machines/rock_crusher")
        .addTier(0)
        .buildAndRegister();

    MachineBuilder.create(32022, "steam_turbine")
        .setTankScalingFunction(function(tier as int) as int {return 8000;})
        .setRecipeMap(RecipeMaps.STEAM_TURBINE_FUELS)
        .setRenderer("generators/steam_turbine")
        .addTier(0)
        .setGenerator()
        .buildAndRegister();
