
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;

//Portable Analyzer
    assembler.recipeBuilder()
    .inputs(<ore:plateTin> * 4,<ore:plateRedAlloy> * 1, <ore:paneGlass> * 2, <ore:gemFlawlessDiamond> * 1, <ore:circuitMv> * 1)
    .outputs(<forestry:portable_alyzer> * 1)
    .fluidInputs(<liquid:water> * 2000)
    .duration(1200)
    .circuit(17)
    .EUt(96)
    .buildAndRegister();
//Sturdy Casing
    assembler.recipeBuilder()
    .inputs(<ore:plateBronze> * 8)
    .outputs(<forestry:sturdy_machine> * 1)
    .fluidInputs(<liquid:glue> * 500)
    .duration(400)
    .circuit(17)
    .EUt(72)
    .buildAndRegister();
//Analyzer
    assembler.recipeBuilder()
    .inputs(<ore:plateBronze> * 4, <forestry:sturdy_machine> * 1, <forestry:portable_alyzer> * 1)
    .outputs(<forestry:analyzer> * 1)
    .duration(800)
    .circuit(17)
    .EUt(96)
    .buildAndRegister();
//Habitat Former
    assembler.recipeBuilder()
    .inputs(<ore:gearBronze> * 4, <ore:blockGlass> * 2, <forestry:thermionic_tubes:3> * 2, <forestry:chipsets> * 1, <forestry:sturdy_machine> * 1, <ore:wireGtSingleRedAlloy> * 1)
    .outputs(<forestry:habitat_former> * 1)
    .duration(2000)
    .circuit(17)
    .EUt(128)
    .buildAndRegister();
//Database
    assembler.recipeBuilder()
    .inputs(<ore:plateBronze> * 4, <ore:plankTreatedWood> * 2, <forestry:royal_jelly>* 1, <forestry:sturdy_machine> * 1, <forestry:chipsets> * 1, <forestry:butterfly_chest> * 1, <forestry:tree_chest> * 1, <forestry:bee_chest> * 1)
    .outputs(<forestry:database> * 1)
    .duration(2000)
    .circuit(17)
    .EUt(128)
    .buildAndRegister();
//Hardened Casing
    assembler.recipeBuilder()
    .inputs(<ore:gemExquisiteDiamond> * 16, <forestry:sturdy_machine> * 2)
    .outputs(<forestry:hardened_machine> * 1)
    .duration(2000)
    .circuit(17)
    .EUt(128)
    .buildAndRegister();
//Rainmaker
    assembler.recipeBuilder()
    .inputs(<ore:gearTin> * 4, <ore:circuitHv> * 2, <forestry:hardened_machine> * 1)
    .outputs(<forestry:rainmaker> * 1)
    .duration(3200)
    .circuit(17)
    .EUt(512)
    .buildAndRegister();
//Impregnated Casing
    assembler.recipeBuilder()
    .inputs(<ore:logWood> * 8)
    .outputs(<forestry:impregnated_casing> * 1)
    .fluidInputs(<liquid:seed.oil> * 500)
    .duration(400)
    .circuit(17)
    .EUt(64)
    .buildAndRegister();
//Scented Paneling
    assembler.recipeBuilder()
    .inputs(<ore:plankWood> * 4, <ore:itemBeeswax> * 2, <ore:dropRoyalJelly> * 1, <ore:itemPollen> * 1)
    .outputs(<forestry:crafting_material:6> * 1)
    .fluidInputs(<liquid:seed.oil> * 500)
    .duration(200)
    .circuit(17)
    .EUt(64)
    .buildAndRegister();
//Alveary
    assembler.recipeBuilder()
    .inputs(<forestry:crafting_material:6> * 8, <forestry:impregnated_casing> * 1)
    .outputs(<forestry:alveary.plain> * 1)
    .fluidInputs(<liquid:glue> * 500)
    .duration(800)
    .circuit(17)
    .EUt(128)
    .buildAndRegister();
//Apiary
    assembler.recipeBuilder()
    .inputs(<ore:plankWood> * 5, <ore:slabWood> * 3, <forestry:impregnated_casing> * 1)
    .outputs(<forestry:apiary> * 1)
    .fluidInputs(<liquid:glue> * 100)
    .duration(1200)
    .circuit(17)
    .EUt(128)
    .buildAndRegister();
//Escritoire
    assembler.recipeBuilder()
    .inputs(<ore:plankWood> * 6)
    .outputs(<forestry:escritoire> * 1)
    .fluidInputs(<liquid:seed.oil> * 500)
    .duration(1200)
    .circuit(17)
    .EUt(128)
    .buildAndRegister();