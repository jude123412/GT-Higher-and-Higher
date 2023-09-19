
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;

//Slimond
    compressor.recipeBuilder()
    .inputs(<ore:dustSlimond> * 1)
    .outputs(<gregtech:meta_gem:32004> * 1)
    .duration(160)
    .EUt(2)
    .buildAndRegister();
//Sticky Resin
    alloy_smelter.recipeBuilder()
    .inputs(<gregtech:meta_item_1:438> * 2, <gregtech:meta_plate:1648> * 1)
    .outputs(<gregtech:meta_item_1:381> * 1)
    .duration(60)
    .EUt(4)
    .buildAndRegister();
//Coated Circuit Board
    alloy_smelter.recipeBuilder()
    .inputs(<ore:gemSlimond> * 1)
    .outputs(<gregtech:meta_item_1:438> * 1)
    .notConsumable(<gregtech:meta_item_1:17>)
    .duration(60)
    .EUt(4)
    .buildAndRegister();
//Circuit Board
    assembler.recipeBuilder()
    .inputs(<ore:foilCopper> * 4, <ore:plateTreatedWood> * 1)
    .fluidInputs(<liquid:glue> * 100)
    .outputs(<gregtech:meta_item_1:401> * 1)
    .duration(200)
    .EUt(7)
    .buildAndRegister();
//Redstone Root
    chemical_reactor.recipeBuilder()
    .inputs(<ore:livingRoot> * 1)
    .fluidInputs(<liquid:redstone> * 144)
    .outputs(<botania:manaresource:6> * 1)
    .duration(50)
    .buildAndRegister();
//Skyroot Stick
    lathe.recipeBuilder()
    .inputs(<aether_legacy:skyroot_plank> * 1)
    .outputs(<aether_legacy:skyroot_stick> * 2)
    .duration(240)
    .EUt(16)
    .buildAndRegister();
//Skyroot Planks Water
    cutter.recipeBuilder()
    .inputs(<aether_legacy:aether_log> * 1)
    .fluidInputs(<liquid:water> * 4)
    .outputs(<aether_legacy:skyroot_plank> * 6, <gregtech:meta_dust:1617> * 2)
    .duration(300)
    .EUt(7)
    .buildAndRegister();
//Skyroot Planks Distilled Water
    cutter.recipeBuilder()
    .inputs(<aether_legacy:aether_log> * 1)
    .fluidInputs(<liquid:distilled_water> * 3)
    .outputs(<aether_legacy:skyroot_plank> * 6, <gregtech:meta_dust:1617> * 2)
    .duration(240)
    .EUt(7)
    .buildAndRegister();
//Skyroot Planks Lubricant
    cutter.recipeBuilder()
    .inputs(<aether_legacy:aether_log> * 1)
    .fluidInputs(<liquid:lubricant> * 1)
    .outputs(<aether_legacy:skyroot_plank> * 6, <gregtech:meta_dust:1617> * 2)
    .duration(200)
    .EUt(7)
    .buildAndRegister();
//Golden Skyroot Planks Water
    cutter.recipeBuilder()
    .inputs(<aether_legacy:aether_log:1> * 1)
    .fluidInputs(<liquid:water> * 4)
    .outputs(<aether_legacy:skyroot_plank> * 6)
    .chancedOutput(<gregtech:meta_dust:41>, 500, 250)
    .duration(300)
    .EUt(7)
    .buildAndRegister();
//Golden Skyroot Planks Distilled Water
    cutter.recipeBuilder()
    .inputs(<aether_legacy:aether_log:1> * 1)
    .fluidInputs(<liquid:distilled_water> * 3)
    .outputs(<aether_legacy:skyroot_plank> * 6)
    .chancedOutput(<gregtech:meta_dust:41>, 500, 250)
    .duration(240)
    .EUt(7)
    .buildAndRegister();
//Golden Skyroot Planks Lubricant
    cutter.recipeBuilder()
    .inputs(<aether_legacy:aether_log:1> * 1)
    .fluidInputs(<liquid:lubricant> * 1)
    .outputs(<aether_legacy:skyroot_plank> * 6)
    .chancedOutput(<gregtech:meta_dust:41>, 500, 250)
    .duration(200)
    .EUt(7)
    .buildAndRegister();
//Zanite Dust
    macerator.recipeBuilder()
    .inputs(<ore:gemZanite> * 1)
    .outputs(<gregtech:meta_dust:32005> * 1)
    .duration(80)
    .EUt(2)
    .buildAndRegister();
//Aether Alter
    assembler.recipeBuilder()
    .inputs(<aether_legacy:holystone> * 4, <aether_legacy:skyroot_plank> * 4, <ore:screwGold> * 4, <ore:blockZanite> * 1, <ore:circuitLv> * 1)
    .outputs(<aether_legacy:enchanter> * 1)
    .fluidInputs(<liquid:glowstone> * 1152)
    .duration(800)
    .EUt(32)
    .buildAndRegister();
//Mana Pool
    assembler.recipeBuilder()
    .inputs(<ore:plateZanite> * 4, <ore:plateEnchantedGravitite> * 4, <ore:plateManasteel> * 4, <ore:livingrock> * 8, <botania:pool:2> * 1)
    .outputs(<botania:pool> * 1)
    .fluidInputs(<liquid:mana> * 1000)
    .duration(800)
    .EUt(32)
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
    .property("temperature", 1800)
    .EUt(120)
    .buildAndRegister();
//Phenolic Circuit Board
    assembler.recipeBuilder()
    .inputs(<ore:dustWood> * 1)
    .outputs(<gregtech:meta_item_1:382> * 1)
    .fluidInputs(<liquid:phenol_formaldehyde_resin> * 50)
    .notConsumable(<gregtech:meta_item_1:12> * 1)
    .duration(100)
    .EUt(32)
    .buildAndRegister();



