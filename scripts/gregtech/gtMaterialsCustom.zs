    #priority 1000

    #loader gregtech

    import mods.gregtech.material.MaterialBuilder;
    import mods.gregtech.material.MaterialRegistry;
    import mods.gregtech.material.Material;
    import mods.gregtech.material.Elements;
    import mods.gregtech.ore.OrePrefix;
    import crafttweaker.item.IItemStack;
    import crafttweaker.item.IIngredient;
    import crafttweaker.enchantments.IEnchantment;
    import crafttweaker.enchantments.IEnchantmentDefinition;

    var element_mana_steel = Elements.add(130, 234, -1, null, "Manasteel", "MA", false);
    var element_elementium = Elements.add(130, 234, -1, null, "Elementium", "EL", false);
    var element_terra_steel = Elements.add(130, 234, -1, null, "Terrasteel", "TS", false);
    var element_gaia = Elements.add(130, 234, -1, null, "Gaia", "GS", false);

    var manasteel = MaterialBuilder(32000, "manasteel")
        .element("Manasteel")  
        .dust().ingot().fluid()
        .color(0x006BFF).iconSet("shiny")
        .toolStats(7, 10, 768, 3, 2)
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
        .ore(1, 1, true)
        .addOreByproducts(<material:carbon>, <material:glowstone>, <material:diamond>)
        .color(0x82C873).iconSet("shiny")
        .flags(["disable_decomposition"])
        .components([<material:carbon> * 5, <material:hydrogen> * 8, <material:oxygen> * 4])
        .build();
        
    var zanite = MaterialBuilder(32005, "zanite") 
        .dust()
        .color(0x7E00F6).iconSet("shiny")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var enchanted_gravitite = MaterialBuilder(32006, "enchanted_gravitite") 
        .dust().gem()
        .color(0xC041B6).iconSet("shiny")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var mana = MaterialBuilder(32007, "mana") 
        .fluid("acid", false)
        .color(0x52C4FF).iconSet("fluid")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var cobalt_arsenide = MaterialBuilder(32008, "cobalt_arsenide")
        .dust()
        .color(0x000068).iconSet("dull")
        .flags(["decomposition_by_electrolyzing"])
        .components([<material:cobalt> * 1, <material:arsenic> * 1])
        .build();

    var formaldehyde = MaterialBuilder(32009, "formaldehyde")
        .fluid("fluid", true)
        .color(0x512A06).iconSet("fluid")
        .flags(["disable_decomposition"])
        .components([<material:carbon> * 1, <material:hydrogen> * 2, <material:oxygen> * 1])
        .build();

    var phenol_formaldehyde_resin = MaterialBuilder(32010, "phenol_formaldehyde_resin")
        .fluid("fluid", true)
        .color(0xB05D0E).iconSet("dull")
        .flags(["disable_decomposition"])
        .components([<material:carbon> * 8, <material:hydrogen> * 6, <material:oxygen> * 2])
        .build();

    var cryolite = MaterialBuilder(32011, "cryolite")
        .dust()
        .ore(1, 1, false)
        .color(0x328EFF).iconSet("dull")
        .flags(["disable_decomposition"])
        .components([<material:sodium> * 2, <material:aluminium> * 1, <material:fluorine> * 6])
        .build();

    var sodium_difluoride = MaterialBuilder(32012, "sodium_difluoride")
        .dust()
        .ore(1, 1, false)
        .color(0x008967).iconSet("dull")
        .flags(["decomposition_by_electrolyzing"])
        .components([<material:sodium> * 1, <material:fluorine> * 2])
        .build();
