    
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;

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
    //Gallium Arsenide
        blast_furnace.recipeBuilder()
        .inputs(<ore:dustGallium> * 1, <ore:dustArsenic> * 1)
        .outputs(<gregtech:meta_dust:351> * 2)
        .duration(1200)
        .property("temperature", 1200)
        .EUt(120)
        .buildAndRegister();
    //Aluminium Ingot
        blast_furnace.recipeBuilder()
        .inputs(<ore:dustCryolite> * 9, <ore:dustAluminium> * 4)
        .outputs(<gregtech:meta_ingot:2> * 5, <gregtech:meta_dust:32012> * 3)
        .duration(900)
        .property("temperature", 1700)
        .EUt(120)
        .buildAndRegister();
    //Chrome Ingots
        blast_furnace.recipeBuilder()
        .inputs(<ore:dustBrezinaite> * 7, <ore:dustCarbon> * 4)
        .outputs(<gregtech:meta_ingot:22> * 3)
        .duration(1800)
        .property("temperature", 1700)
        .EUt(120)
        .buildAndRegister();