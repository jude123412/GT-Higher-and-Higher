    
    import crafttweaker.item.IItemStack;
    import crafttweaker.item.IIngredient;

    macerator.recipeBuilder()
            .inputs(<aether_legacy:holystone> * 1)
            .outputs(<gregtech:meta_dust:32200> * 1)
            .chancedOutput(<gregtech:meta_dust_tiny:32005> * 1, 500, 120)
            .duration(150)
            .EUt(2)
            .buildAndRegister();
