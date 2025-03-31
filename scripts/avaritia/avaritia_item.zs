// #loader avaritiaitem reloadable

// import mods.avaritiaitem.AvaritiaItemBuilder;
// import mods.avaritiaitem.ItemPrimer;

// AvaritiaItemBuilder.registerItem("circuit.antimatter_processor", 64, "circuit.antimatter_processor")
//     .shouldDrawHalo(true)
//     .haloSize(8)
//     .haloTextures("halo_noise")
//     .addTooltip("A Circuit made of pure Antimatter")
//     .addTooltip("§8UEV-Tier Circuit")
//     .create();

// AvaritiaItemBuilder.registerItem("circuit.antimatter_assembly", 64, "circuit.antimatter_assembly")
//     .shouldDrawHalo(true)
//     .haloSize(8)
//     .haloTextures("halo_noise")
//     .addTooltip("Just dont touch it on anything")
//     .addTooltip("§8UIV-Tier Circuit")
//     .create();

// AvaritiaItemBuilder.registerItem("circuit.antimatter_computer", 64, "circuit.antimatter_computer")
//     .shouldDrawHalo(true)
//     .haloSize(8)
//     .haloTextures("halo_noise")
//     .addTooltip("How is this even possible?")
//     .addTooltip("§8UXV-Tier Circuit")
//     .create();

// AvaritiaItemBuilder.registerItem("circuit.antimatter_mainframe", 64, "circuit.antimatter_mainframe")
//     .shouldDrawHalo(true)
//     .haloSize(8)
//     .haloTextures("halo_noise")
//     .addTooltip("Cosmic, Computation, Calculation")
//     .addTooltip("§8OPV-Tier Circuit")
//     .create();

// AvaritiaItemBuilder.registerItem("board.antimatter", 64, "board.antimatter")
//     .shouldDrawHalo(true)
//     .haloSize(8)
//     .haloTextures("halo_noise")
//     .addTooltip("§AA Circuit Board made from Antimatter")
//     .create();

// AvaritiaItemBuilder.registerItem("circuit_board.antimatter", 64, "circuit_board.antimatter")
//     .shouldDrawHalo(true)
//     .haloSize(8)
//     .haloTextures("halo_noise")
//     .addTooltip("§AI have a bad feeling about this")
//     .create();

// AvaritiaItemBuilder.registerItem("circuit.temporal_processor", 64, "circuit.temporal_processor")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("000000")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .shouldDrawCosmic(true)
//     .mask("circuit.temporal_processor_overlay")
//     .maskOpacity(1.0f)
//     .addTooltip("Universe Simulation Device")
//     .addTooltip("UIV-Tier Circuit", true)
//     .create();

// AvaritiaItemBuilder.registerItem("circuit.temporal_assembly", 64, "circuit.temporal_assembly")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("000000")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .shouldDrawCosmic(true)
//     .mask("circuit.temporal_assembly_overlay")
//     .maskOpacity(1.0f)
//     .addTooltip("Multiverse Simulation Device")
//     .addTooltip("UXV-Tier Circuit", true)
//     .create();

// AvaritiaItemBuilder.registerItem("circuit.temporal_computer", 64, "circuit.temporal_computer")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("000000")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .shouldDrawCosmic(true)
//     .mask("circuit.temporal_computer_overlay")
//     .maskOpacity(1.0f)
//     .addTooltip("Temporal Simulation Device")
//     .addTooltip("OPV-Tier Circuit", true)
//     .create();

// AvaritiaItemBuilder.registerItem("circuit.temporal_mainframe", 64, "circuit.temporal_mainframe")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("000000")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .shouldDrawCosmic(true)
//     .mask("circuit.temporal_mainframe_overlay")
//     .maskOpacity(1.0f)
//     .addTooltip("All is one and one is all")
//     .addTooltip("MAX-Tier Circuit", true)
//     .create();

// AvaritiaItemBuilder.registerItem("board.temporal", 64, "board.temporal")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("000000")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .shouldDrawCosmic(true)
//     .mask("board.temporal_overlay")
//     .maskOpacity(1.0f)
//     .addTooltip("Universe containment field", true)
//     .create();

// AvaritiaItemBuilder.registerItem("circuit_board.temporal", 64, "circuit_board.temporal")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("000000")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .shouldDrawCosmic(true)
//     .mask("circuit_board.temporal_overlay")
//     .maskOpacity(1.0f)
//     .addTooltip("Universe on a board", true)
//     .create();

// val antimatterSMD = {
//     "component.antimatter.smd.transistor" : "component.antimatter.smd.transistor",
//     "component.antimatter.smd.resistor" : "component.antimatter.smd.resistor",
//     "component.antimatter.smd.capacitor" : "component.antimatter.smd.capacitor",
//     "component.antimatter.smd.diode" : "component.antimatter.smd.diode",
//     "component.antimatter.smd.inductor" : "component.antimatter.smd.inductor"
// }as string[string];

// for stringOne, stringTwo in antimatterSMD {
        
//     val stackSize = 64;
//     val haloSize = 8;

//     AvaritiaItemBuilder.registerItem(stringOne, stackSize, stringTwo)
//         .shouldDrawHalo(true)
//         .haloSize(8)
//         .haloTextures("halo_noise")
//         .addTooltip("Its soo tiny And dangerous")
//         .create();

// }

// val temporalSMD = {
//     "component.temporal.smd.transistor" : "component.temporal.smd.transistor",
//     "component.temporal.smd.resistor" : "component.temporal.smd.resistor",
//     "component.temporal.smd.capacitor" : "component.temporal.smd.capacitor",
//     "component.temporal.smd.diode" : "component.temporal.smd.diode",
//     "component.temporal.smd.inductor" : "component.temporal.smd.inductor"
// }as string[string];

// for stringOne, stringTwo in temporalSMD {
        
//     val stackSize = 64;
//     val haloSize = 10;

//     AvaritiaItemBuilder.registerItem(stringOne, stackSize, stringTwo)
//         .shouldDrawHalo(true)
//         .haloSize(10)
//         .haloColour("000000")
//         .haloTextures("halo")
//         .shouldDrawPulse(true)
//         .shouldDrawCosmic(true)
//         .mask("component.temporal.smd_overlay")
//         .maskOpacity(1.0f)
//         .addTooltip("The pinnacle of SMD Components", true)
//         .create();

// }

// val materialCosmicNeutronium = {

//     "dust.cosmic_neutronium" : "dust.cosmic_neutronium",
//     "dust_small.cosmic_neutronium" : "dust_small.cosmic_neutronium",
//     "dust_tiny.cosmic_neutronium" : "dust_tiny.cosmic_neutronium",
//     "ingot_hot.cosmic_neutronium" : "ingot_hot.cosmic_neutronium",
//     "plate.cosmic_neutronium" : "plate.cosmic_neutronium",
//     "plate_double.cosmic_neutronium" : "plate_double.cosmic_neutronium",
//     "plate_dense.cosmic_neutronium" : "plate_dense.cosmic_neutronium",
//     "foil.cosmic_neutronium" : "foil.cosmic_neutronium",
//     "stick.cosmic_neutronium" : "stick.cosmic_neutronium",
//     "stick_long.cosmic_neutronium" : "stick_long.cosmic_neutronium",
//     "bolt.cosmic_neutronium" : "bolt.cosmic_neutronium",
//     "screw.cosmic_neutronium" : "screw.cosmic_neutronium",
//     "ring.cosmic_neutronium" : "ring.cosmic_neutronium",
//     "round.cosmic_neutronium" : "round.cosmic_neutronium",
//     "spring.cosmic_neutronium" : "spring.cosmic_neutronium",
//     "spring_small.cosmic_neutronium" : "spring_small.cosmic_neutronium",
//     "gear.cosmic_neutronium" : "gear.cosmic_neutronium",
//     "gear_small.cosmic_neutronium" : "gear_small.cosmic_neutronium",
//     "wire_fine.cosmic_neutronium" : "wire_fine.cosmic_neutronium",
//     "rotor.cosmic_neutronium" : "rotor.cosmic_neutronium",
//     "lens.cosmic_neutronium" : "lens.cosmic_neutronium"
    
// }as string[string];

// for stringOne, stringTwo in materialCosmicNeutronium {
        
//     val stackSize = 64;
//     val haloSize = 10;

//     AvaritiaItemBuilder.registerItem(stringOne, stackSize, stringTwo)
//         .shouldDrawHalo(true)
//         .haloSize(7)
//         .haloTextures("halo_noise")
//         .shouldDrawPulse(true)
//         .addTooltip("The dense heart of a star in convenient material form")
//         .create();

// }

// val materialInfinity = {

//     "dust.infinity" : "dust.infinity",
//     "dust_small.infinity" : "dust_small.infinity",
//     "dust_tiny.infinity" : "dust_tiny.infinity",
//     "ingot_hot.infinity" : "ingot_hot.infinity",
//     "plate.infinity" : "plate.infinity",
//     "plate_double.infinity" : "plate_double.infinity",
//     "plate_dense.infinity" : "plate_dense.infinity",
//     "foil.infinity" : "foil.infinity",
//     "stick.infinity" : "stick.infinity",
//     "stick_long.infinity" : "stick_long.infinity",
//     "bolt.infinity" : "bolt.infinity",
//     "screw.infinity" : "screw.infinity",
//     "ring.infinity" : "ring.infinity",
//     "round.infinity" : "round.infinity",
//     "spring.infinity" : "spring.infinity",
//     "spring_small.infinity" : "spring_small.infinity",
//     "gear.infinity" : "gear.infinity",
//     "gear_small.infinity" : "gear_small.infinity",
//     "wire_fine.infinity" : "wire_fine.infinity",
//     "rotor.infinity" : "rotor.infinity",
//     "lens.infinity" : "lens.infinity"
    
// }as string[string];

// for stringOne, stringTwo in materialInfinity {
        
//     val stackSize = 64;
//     val haloSize = 10;

//     AvaritiaItemBuilder.registerItem(stringOne, stackSize, stringTwo)
//         .shouldDrawHalo(true)
//         .haloSize(haloSize)
//         .haloColour("000000")
//         .haloTextures("halo")
//         .shouldDrawPulse(true)
//         .addTooltip("The fury of the universe in the palm of your hand")
//         .create();

// }

// AvaritiaItemBuilder.registerItem("dust.multiversium", 64, "dust.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("dust")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("dust_small.multiversium", 64, "dust_small.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("dust_small")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("dust_tiny.multiversium", 64, "dust_tiny.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("dust_tiny")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("ingot.multiversium", 64, "ingot.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("ingot")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("ingot_hot.multiversium", 64, "ingot_hot.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("ingot")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("plate.multiversium", 64, "plate.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("plate")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("plate_double.multiversium", 64, "plate_double.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("plate_double")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("plate_dense.multiversium", 64, "plate_dense.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("plate_dense")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("foil.multiversium", 64, "foil.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("foil")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("stick.multiversium", 64, "stick.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("stick")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("stick_long.multiversium", 64, "stick_long.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("stick_long")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("bolt.multiversium", 64, "bolt.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("bolt")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("screw.multiversium", 64, "screw.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("screw")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("ring.multiversium", 64, "ring.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("ring")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("round.multiversium", 64, "round.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("round")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("spring.multiversium", 64, "spring.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("spring")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("spring_small.multiversium", 64, "spring_small.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("spring_small")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("gear.multiversium", 64, "gear.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("gear")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("gear_small.multiversium", 64, "gear_small.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("gear_small")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("wire_fine.multiversium", 64, "wire_fine.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("wire_fine")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("rotor.multiversium", 64, "rotor.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("rotor")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("lens.multiversium", 64, "lens.multiversium")
//     .shouldDrawCosmic(true)
//     .mask("lens")
//     .maskOpacity(1.0f)
//     .addTooltip("0.0000000000000001% of the Multiverse conveniently distilled into Material Form", true)
//     .create();

// AvaritiaItemBuilder.registerItem("stone.dormant", 64, "stone.dormant")
//     .shouldDrawHalo(true)
//     .haloSize(7)
//     .haloTextures("halo_noise")
//     .shouldDrawPulse(true)
//     .addTooltip("§7The building block of all infinity stones")
//     .create();

// AvaritiaItemBuilder.registerItem("stone.reality", 64, "stone.reality")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("FF191C")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .addTooltip("§4formerly know as the Aether, With the power to manipulate Reality its self")
//     .create();
    
// AvaritiaItemBuilder.registerItem("stone.soul", 64, "stone.soul")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("D87D27")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .addTooltip("§6Acessing the Soul Network")
//     .create();

// AvaritiaItemBuilder.registerItem("stone.space", 64, "stone.space")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("2667F2")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .addTooltip("§3All of Space in your control, Probably should take a rest")
//     .create();

// AvaritiaItemBuilder.registerItem("stone.power", 64, "stone.power")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("4F2B9B")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .addTooltip("§5Infinite Power, Infinite Destruction, Infinite Chaos")
//     .create();
    
// AvaritiaItemBuilder.registerItem("stone.mind", 64, "stone.mind")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("F2DC00")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .addTooltip("§eControlling all minds is somthing quite scary actually")
//     .create();

// AvaritiaItemBuilder.registerItem("stone.time", 64, "stone.time")
//     .shouldDrawHalo(true)
//     .haloSize(10)
//     .haloColour("00AF4F")
//     .haloTextures("halo")
//     .shouldDrawPulse(true)
//     .addTooltip("§2The ability to manipulate time, Just don't do it too much.")
//     .create();