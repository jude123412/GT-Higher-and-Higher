
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;

//Formaldehyde Coke Oven
    coke_oven.recipeBuilder()
    .inputs(<ore:plankWood> * 4)
    .fluidOutputs(<liquid:formaldehyde> * 50)
    .chancedOutput(<gregtech:meta_dust:254> * 1, 1000, 0)
    .duration(160)
    .buildAndRegister();
//Redstone Liquid
    extractor.recipeBuilder()
    .inputs(<ore:dustRedstone> * 1)
    .fluidOutputs(<liquid:redstone> * 144)
    .duration(240)
    .EUt(16)
    .buildAndRegister();
//Mana Liquid
    extractor.recipeBuilder()
    .inputs(<botania:manabottle> * 1)
    .outputs(<minecraft:glass_bottle>* 1)
    .fluidOutputs(<liquid:mana> * 500)
    .duration(800)
    .EUt(32)
    .buildAndRegister();
//Cobaltite->Arsenic,Cobalt,Sulfur Dioxide
    blast_furnace.recipeBuilder()
    .inputs(<ore:dustCobaltite> * 3)
    .outputs(<gregtech:meta_dust:32008> * 2)
    .fluidInputs(<liquid:oxygen> * 2000)
    .fluidOutputs(<liquid:sulfur_dioxide> * 1000)
    .duration(400)
    .property("temperature", 1200)
    .EUt(120)
    .buildAndRegister();
//Realgar->Arsenic,Sulfur Dioxide
    blast_furnace.recipeBuilder()
    .inputs(<ore:dustRealgar> * 8)
    .outputs(<gregtech:meta_dust:6> * 4)
    .fluidInputs(<liquid:oxygen> * 8000)
    .fluidOutputs(<liquid:sulfur_dioxide> * 4000)
    .duration(1600)
    .property("temperature", 1200)
    .EUt(120)
    .buildAndRegister();
//Formaldehyde EBF
    blast_furnace.recipeBuilder()
    .inputs(<ore:logWood> * 1)
    .chancedOutput(<gregtech:meta_dust:254> * 1, 2500, 500)
    .fluidOutputs(<liquid:formaldehyde> * 100)
    .duration(80)
    .property("temperature", 1200)
    .EUt(64)
    .buildAndRegister();
//Sodium Hydroxide
    chemical_reactor.recipeBuilder()
    .inputs(<ore:dustSodium> * 1)
    .outputs(<gregtech:meta_dust:377> * 1)
    .fluidInputs(<liquid:oxygen> * 1000, <liquid:hydrogen> * 1000)
    .duration(200)
    .EUt(24)
    .buildAndRegister();
//Phenol-Formaldehyde Resin
    chemical_reactor.recipeBuilder()
    .inputs(<ore:dustSodiumHydroxide> * 1)
    .fluidInputs(<liquid:phenol> * 400, <liquid:formaldehyde> * 600)
    .fluidOutputs(<liquid:phenol_formaldehyde_resin> * 500)
    .duration(200)
    .EUt(24)
    .buildAndRegister();
//Wood Tar->Phenol Inefficient
    distillery.recipeBuilder()
    .fluidInputs(<liquid:wood_tar> * 1000)
    .fluidOutputs(<liquid:phenol> * 20)
    .circuit(6)
    .duration(160)
    .EUt(16)
    .buildAndRegister();
    