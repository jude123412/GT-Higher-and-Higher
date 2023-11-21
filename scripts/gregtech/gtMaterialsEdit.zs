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

    var realgar = <material:realgar>;
    var cobaltite = <material:cobaltite>;
    var tricalcium_phosphate = <material:tricalcium_phosphate>;
    var pyrochlore = <material:pyrochlore>;
    var graphite = <material:graphite>;
    var calcite = <material:calcite>;
    var soapstone = <material:soapstone>;
    var talc = <material:talc>;
    var glauconite_sand = <material:glauconite_sand>;
    var bentonite = <material:bentonite>;
    var magnesite = <material:magnesite>;
    var redstone = <material:redstone>;
    var lepidolite = <material:lepidolite>;
    var spodumene = <material:spodumene>;
    var zeolite = <material:zeolite>;
    var vanadium_magnetite = <material:vanadium_magnetite>;
    var gypsum = <material:gypsum>;
    var fullers_earth = <material:fullers_earth>;
    var cobalt = <material:cobalt>;
    var ruby = <material:ruby>;
    var scandium = <material:scandium>;
    var armalcolite = <material:armalcolite>;
    var pyroxene = <material:pyroxene>;
    var tantalum = <material:tantalum>;
    var iron_iii_chloride = <material:iron_iii_chloride>;
    var mica = <material:mica>;

    realgar.addFlags(["disable_decomposition"]);
    cobaltite.addFlags(["disable_decomposition", "no_smelt"]);
    ruby.addFlags(["disable_decomposition"]);
    ruby.setFormula("Al₂O₃");
    tricalcium_phosphate.addGem();
    pyrochlore.addGem();
    graphite.addGem();
    calcite.addGem();
    soapstone.addGem();
    talc.addGem();
    glauconite_sand.addGem();
    bentonite.addGem();
    magnesite.addGem();
    redstone.addGem();
    lepidolite.addGem();
    spodumene.addGem();
    zeolite.addGem();
    vanadium_magnetite.addGem();
    gypsum.addGem();
    fullers_earth.addGem();
    scandium.addIngot();
    armalcolite.setFormula("(Mg,Fe²⁺)Ti₂O₅");    
    pyroxene.setFormula("Zn₁Sc₁(Si,Al)₂O₆");
    tantalum.addBlastTemp(3290);
    cobalt.addBlastTemp(1768);
    iron_iii_chloride.addFluid("fluid", true);
    mica.addIngot();
    mica.addFlags(["generate_plate", "generate_foil"]);