
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
//Sodium Hydroxide
    chemical_reactor.recipeBuilder()
    .inputs(<ore:dustSodium> * 1)
    .fluidInputs(<liquid:water> * 1000)
    .outputs(<gregtech:meta_dust:377> * 3)
    .fluidOutputs(<liquid:hydrogen> * 1000)
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
    