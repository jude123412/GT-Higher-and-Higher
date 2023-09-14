    #priority 1000

    #loader gregtech

    import mods.gregtech.material.MaterialBuilder;
    import mods.gregtech.material.MaterialRegistry;
    import mods.gregtech.material.Material;
    import mods.gregtech.material.Elements;
    import mods.gregtech.ore.OrePrefix;
    import crafttweaker.item.IItemStack;
    import crafttweaker.item.IIngredient;

    var element_mana_steel = Elements.add(130, 234, -1, null, "Manasteel", "MA", false);
    var element_elementium = Elements.add(130, 234, -1, null, "Elementium", "EL", false);
    var element_terra_steel = Elements.add(130, 234, -1, null, "Terrasteel", "TS", false);
    var element_gaia = Elements.add(130, 234, -1, null, "Gaia", "GS", false);

    var manasteel = MaterialBuilder(32000, "manasteel")
        .element("Manasteel")  
        .dust().ingot().fluid()
        .color(0x006BFF).iconSet("shiny")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var terrasteel = MaterialBuilder(32001, "terrasteel")
        .element("Terrasteel") 
        .dust().ingot().fluid()
        .color(0x5FFF0C).iconSet("shiny")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var elementium = MaterialBuilder(32002, "elven_elementium")
        .element("Elementium") 
        .dust().ingot().fluid()
        .color(0xE90081).iconSet("shiny")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var gaia = MaterialBuilder(32003, "gaia")
        .element("Gaia") 
        .dust().ingot().fluid()
        .color(0x729886).iconSet("dull")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var slimond = MaterialBuilder(32004, "slimond") 
        .dust().gem().fluid()
        .ore(1, 1, true).addOreByproducts(<material:carbon>)
        .color(0x82C873).iconSet("shiny")
        .flags(["disable_decomposition"])
        .components([<material:carbon> * 5, <material:hydrogen> * 8, <material:oxygen> * 4])
        .build();