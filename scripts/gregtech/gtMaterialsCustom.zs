    #priority 1001

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
    var element_draconium = Elements.add(130, 234, -1, null, "Draconium", "DC", false);
    var element_awakended_draconium = Elements.add(130, 234, -1, null, "AwakenedDraconium", "AWDC", false);
    var element_raw_infinity = Elements.add(130, 234, -1, null, "RawInfinity", "IF", false);

    var manasteel = MaterialBuilder(32000, "manasteel")
        .element("Manasteel")  
        .dust()
        .ingot()
        .fluid()
        .color(0x006BFF)
        .iconSet("shiny")
        .toolStats(7, 10, 768, 3, 2)
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var terrasteel = MaterialBuilder(32001, "terrasteel")
        .element("Terrasteel") 
        .dust()
        .ingot()
        .fluid()
        .color(0x5FFF0C)
        .iconSet("shiny")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var elementium = MaterialBuilder(32002, "elven_elementium")
        .element("Elementium") 
        .dust()
        .ingot()
        .fluid()
        .color(0xE90081)
        .iconSet("shiny")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var gaia = MaterialBuilder(32003, "gaia")
        .element("Gaia") 
        .dust()
        .ingot()
        .fluid()
        .color(0x729886)
        .iconSet("dull")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var slimond = MaterialBuilder(32004, "slimond") 
        .dust().gem().fluid()
        .ore(1, 1, true)
        .addOreByproducts(<material:carbon>, <material:glowstone>, <material:diamond>)
        .color(0x82C873)
        .iconSet("shiny")
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
        .color(0xC041B6)
        .iconSet("shiny")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var mana = MaterialBuilder(32007, "mana") 
        .fluid("acid", false)
        .color(0x52C4FF)
        .iconSet("fluid")
        .flags(["disable_decomposition", "generate_plate"])
        .build();

    var cobalt_arsenide = MaterialBuilder(32008, "cobalt_arsenide")
        .dust()
        .color(0x000068)
        .iconSet("dull")
        .flags(["decomposition_by_electrolyzing"])
        .components([<material:cobalt> * 1, <material:arsenic> * 1])
        .build();

    var formaldehyde = MaterialBuilder(32009, "formaldehyde")
        .fluid("fluid", true)
        .color(0x512A06)
        .iconSet("fluid")
        .flags(["disable_decomposition"])
        .components([<material:carbon> * 1, <material:hydrogen> * 2, <material:oxygen> * 1])
        .build();

    var phenol_formaldehyde_resin = MaterialBuilder(32010, "phenol_formaldehyde_resin")
        .fluid("fluid", true)
        .color(0xB05D0E)
        .iconSet("dull")
        .flags(["disable_decomposition"])
        .components([<material:carbon> * 8, <material:hydrogen> * 6, <material:oxygen> * 2])
        .build();

    var cryolite = MaterialBuilder(32011, "cryolite")
        .dust()
        .ore(1, 1, false)
        .color(0x328EFF)
        .iconSet("dull")
        .flags(["disable_decomposition"])
        .components([<material:sodium> * 2, <material:aluminium> * 1, <material:fluorine> * 6])
        .build();

    var sodium_difluoride = MaterialBuilder(32012, "sodium_difluoride")
        .dust()
        .ore(1, 1, false)
        .color(0x008967)
        .iconSet("dull")
        .flags(["decomposition_by_electrolyzing"])
        .components([<material:sodium> * 1, <material:fluorine> * 2])
        .build();

    var brezinaite = MaterialBuilder(32013, "brezinaite")
        .dust().gem()
        .ore(1, 1, true)
        .addOreByproducts(<material:chrome>, <material:chrome>, <material:sulfur>)
        .color(0xBF9417)
        .iconSet("certus")
        .flags(["disable_decomposition"])
        .components([<material:chrome> * 3, <material:sulfur> * 4])
        .build();

    var pyroxene = MaterialBuilder(32014, "pyroxene")
        .dust().gem()
        .ore(1, 1, true)
        .color(0x656E48)
        .iconSet("certus")
        .components([<material:zinc> * 1, <material:scandium> * 1, <material:silicon> * 2, <material:aluminium> * 2, <material:oxygen> * 6])
        .build();

    var armalcolite = MaterialBuilder(32015, "armalcolite")
        .dust().gem()
        .ore(1, 1, true)
        .color(0x231E17)
        .iconSet("certus")
        .components([<material:magnesium> * 1, <material:iron> * 1, <material:rutile> * 2, <material:oxygen> * 1])
        .build();

    var spinel = MaterialBuilder(32016, "spinel")
        .dust().gem()
        .ore(1, 1, true)
        .color(0xBA2848)
        .iconSet("certus")
        .components([<material:magnesium> * 1, <material:iron> * 1, <material:rutile> * 2, <material:oxygen> * 1])
        .build();

    var draconium = MaterialBuilder(32017, "draconium")
        .element("draconium")
        .dust()
        .ingot()
        .color(0x4A107E)
        .iconSet("shiny")
        .blastTemp(10800, "highest", 8388608, 20000)
        .cableProperties(8388608, 32, 128)
        .build();

    var draconium_awakened = MaterialBuilder(32018, "draconium_awakened")
        .element("awakened_draconium")
        .dust()
        .ingot()
        .color(0xFF6200)
        .iconSet("shiny")
        .blastTemp(11700, "highest", 33554432, 20000)
        .cableProperties(33554432, 64, 256)
        .build();

    var cosmic_neutronium = MaterialBuilder(32019, "cosmic_neutronium")
        .dust()
        .ingot()
        .color(0x2D202B)
        .iconSet("shiny")
        .blastTemp(12600, "highest", 134217728, 20000)
        .cableProperties(134217728, 32, 512)
        .components([<material:neutronium> * 4, <material:draconium_awakened> * 1])
        .build();

    var raw_infinity = MaterialBuilder(32020, "raw_infinity")
        .element("raw_infinity")
        .dust()
        .ingot()
        .color(0xD8D8D8)
        .iconSet("shiny")
        .blastTemp(13500, "highest", 536870912, 20000)
        .cableProperties(536870912, 32, 1024)
        .build();

    var infinity = MaterialBuilder(32021, "infinity")
        .dust()
        .ingot()
        .color(0xFFC9F6)
        .iconSet("shiny")
        .blastTemp(14400, "highest", 2147483647, 20000)
        .cableProperties(2147483647, 32, 2048)
        .components([<material:cosmic_neutronium> * 4, <material:raw_infinity> * 1])
        .build();

    var gold_gallium = MaterialBuilder(32022, "gold_gallium")
        .dust()
        .ingot()
        .fluid()
        .color(0x7F7FFF)
        .iconSet("shiny")
        .flags(["generate_plate", "generate_foil"])
        .blastTemp(900, "mid", 1024, 1600)
        .fluidTemp(802)
        .components([<material:gallium> * 1, <material:gold> * 5])
        .build();

    var gold_titanium = MaterialBuilder(32023, "gold_titanium")
        .dust()
        .ingot()
        .fluid()
        .color(0xFF9FBA)
        .iconSet("shiny")
        .flags(["generate_plate", "generate_foil", "generate_ring"])
        .blastTemp(1200, "mid", 1024, 2000)
        .fluidTemp(802)
        .components([<material:gold> * 1, <material:titanium> * 1])
        .build();

    var tgt_alloy = MaterialBuilder(32024, "tgt_alloy")
        .dust()
        .ingot()
        .fluid()
        .color(0xB575FF)
        .iconSet("shiny")
        .flags(["generate_plate", "generate_foil", "generate_ring", "generate_fine_wire"])
        .blastTemp(2112, "mid", 1024, 2200)
        .fluidTemp(2112)
        .cableProperties(2048, 4, 4)
        .components([<material:tantalum> * 1, <material:titanium> * 7, <material:gold> * 2])
        .build();

    var infernorite = MaterialBuilder(32025, "infernorite")
        .dust()
        .ore()
        .ingot()
        .fluid()
        .color(0xFF0000)
        .iconSet("shiny")
        .flags(["generate_plate", "generate_foil", "generate_ring", "generate_fine_wire"])
        .blastTemp(5399, "mid", 131072, 2000)
        .fluidTemp(2112)
        .cableProperties(32768, 12, 4)
        .build();

    var crynorium = MaterialBuilder(32026, "crynorium")
        .dust()
        .ore()
        .ingot()
        .fluid()
        .color(0x003FFF)
        .iconSet("shiny")
        .flags(["generate_plate", "generate_foil", "generate_ring", "generate_fine_wire"])
        .blastTemp(7000, "mid", 1024, 2800)
        .fluidTemp(6800)
        .cableProperties(131072, 12, 8)
        .build();

    var galasium = MaterialBuilder(32027, "galasium")
        .dust()
        .ore()
        .ingot()
        .fluid()
        .color(0x5F0096)
        .iconSet("shiny")
        .flags(["generate_plate", "generate_foil", "generate_ring", "generate_fine_wire"])
        .blastTemp(11700, "mid", 1024, 4200)
        .fluidTemp(11500)
        .cableProperties(2097152, 16, 96)
        .build();