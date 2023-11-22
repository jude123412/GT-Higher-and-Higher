#priority 1
#loader contenttweaker

import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Item;
import mods.contenttweaker.Block;
import mods.contenttweaker.Color;
import mods.contenttweaker.Fluid;
import mods.contenttweaker.AxisAlignedBB;
import mods.contenttweaker.IItemFoodEaten;
import crafttweaker.potions.IPotion;

//Items
var nether_key = VanillaFactory.createItem("nether_key");
nether_key.maxStackSize = 1;
nether_key.register();

var twilight_key = VanillaFactory.createItem("twilight_key");
twilight_key.maxStackSize = 1;
twilight_key.register();

var aether_key = VanillaFactory.createItem("aether_key");
aether_key.maxStackSize = 1;
aether_key.register();


var end_key = VanillaFactory.createItem("end_key");
end_key.maxStackSize = 1;
end_key.register();

//GT Circuits
var slimeware_processor = VanillaFactory.createItem("slimeware_processor");
slimeware_processor.maxStackSize = 64;
slimeware_processor.register();

var slimeware_assembly = VanillaFactory.createItem("slimeware_assembly");
slimeware_assembly.maxStackSize = 64;
slimeware_assembly.register();

var slimeware_supercomputer = VanillaFactory.createItem("slimeware_supercomputer");
slimeware_supercomputer.maxStackSize = 64;
slimeware_supercomputer.register();

var slimeware_mainframe = VanillaFactory.createItem("slimeware_mainframe");
slimeware_mainframe.maxStackSize = 64;
slimeware_mainframe.register();

var lasertronic_processor = VanillaFactory.createItem("lasertronic_processor");
lasertronic_processor.maxStackSize = 64;
lasertronic_processor.register();

var lasertronic_assembly = VanillaFactory.createItem("lasertronic_assembly");
lasertronic_assembly.maxStackSize = 64;
lasertronic_assembly.register();

var lasertronic_supercomputer = VanillaFactory.createItem("lasertronic_supercomputer");
lasertronic_supercomputer.maxStackSize = 64;
lasertronic_supercomputer.register();

var lasertronic_mainframe = VanillaFactory.createItem("lasertronic_mainframe");
lasertronic_mainframe.maxStackSize = 64;
lasertronic_mainframe.register();

var bohemian_processor = VanillaFactory.createItem("bohemian_processor");
bohemian_processor.maxStackSize = 64;
bohemian_processor.register();

var bohemian_assembly = VanillaFactory.createItem("bohemian_assembly");
bohemian_assembly.maxStackSize = 64;
bohemian_assembly.register();

var bohemian_supercomputer = VanillaFactory.createItem("bohemian_supercomputer");
bohemian_supercomputer.maxStackSize = 64;
bohemian_supercomputer.register();

var bohemian_mainframe = VanillaFactory.createItem("bohemian_mainframe");
bohemian_mainframe.maxStackSize = 64;
bohemian_mainframe.register();

var anti_processor = VanillaFactory.createItem("anti_processor");
anti_processor.maxStackSize = 64;
anti_processor.register();

var anti_assembly = VanillaFactory.createItem("anti_assembly");
anti_assembly.maxStackSize = 64;
anti_assembly.register();

var anti_supercomputer = VanillaFactory.createItem("anti_supercomputer");
anti_supercomputer.maxStackSize = 64;
anti_supercomputer.register();

var anti_mainframe = VanillaFactory.createItem("anti_mainframe");
anti_mainframe.maxStackSize = 64;
anti_mainframe.register();

var multiversally_evolved_technolically_advanced_processor = VanillaFactory.createItem("multiversally_evolved_technolically_advanced_processor");
multiversally_evolved_technolically_advanced_processor.maxStackSize = 64;
multiversally_evolved_technolically_advanced_processor.register();

var multiversally_evolved_technolically_advanced_assembly = VanillaFactory.createItem("multiversally_evolved_technolically_advanced_assembly");
multiversally_evolved_technolically_advanced_assembly.maxStackSize = 64;
multiversally_evolved_technolically_advanced_assembly.register();

var multiversally_evolved_technolically_advanced_supercomputer = VanillaFactory.createItem("multiversally_evolved_technolically_advanced_supercomputer");
multiversally_evolved_technolically_advanced_supercomputer.maxStackSize = 64;
multiversally_evolved_technolically_advanced_supercomputer.register();

var multiversally_evolved_technolically_advanced_mainframe = VanillaFactory.createItem("multiversally_evolved_technolically_advanced_mainframe");
multiversally_evolved_technolically_advanced_mainframe.maxStackSize = 64;
multiversally_evolved_technolically_advanced_mainframe.register();

//GT Circuit Boards
var slimeware_slimesupport_circuit_board = VanillaFactory.createItem("slimeware_slimesupport_circuit_board");
slimeware_slimesupport_circuit_board.maxStackSize = 64;
slimeware_slimesupport_circuit_board.register();

var photonically_alined_circuit_board = VanillaFactory.createItem("photonically_alined_circuit_board");
photonically_alined_circuit_board.maxStackSize = 64;
photonically_alined_circuit_board.register();

var bohemian_circuit_board = VanillaFactory.createItem("bohemian_circuit_board");
bohemian_circuit_board.maxStackSize = 64;
bohemian_circuit_board.register();

var semi_stable_anti_matter_circuit_board = VanillaFactory.createItem("semi_stable_anti_matter_circuit_board");
semi_stable_anti_matter_circuit_board.maxStackSize = 64;
semi_stable_anti_matter_circuit_board.register();

var multiversally_sustaining_circuit_board = VanillaFactory.createItem("multiversally_sustaining_circuit_board");
multiversally_sustaining_circuit_board.maxStackSize = 64;
multiversally_sustaining_circuit_board.register();

var ultimate_circuit_board = VanillaFactory.createItem("ultimate_circuit_board");
ultimate_circuit_board.maxStackSize = 64;
ultimate_circuit_board.register();

var insane_circuit_board = VanillaFactory.createItem("insane_circuit_board");
insane_circuit_board.maxStackSize = 64;
insane_circuit_board.register();

var psychotic_circuit_board = VanillaFactory.createItem("psychotic_circuit_board");
psychotic_circuit_board.maxStackSize = 64;
psychotic_circuit_board.register();

var universal_circuit_board = VanillaFactory.createItem("universal_circuit_board");
universal_circuit_board.maxStackSize = 64;
universal_circuit_board.register();

var multiversal_circuit_board = VanillaFactory.createItem("multiversal_circuit_board");
multiversal_circuit_board.maxStackSize = 64;
multiversal_circuit_board.register();

//GT SMD Components
var  nano_smd_transistor = VanillaFactory.createItem("nano_smd_transistor");
nano_smd_transistor.maxStackSize = 64;
nano_smd_transistor.register();

var nano_smd_resistor = VanillaFactory.createItem("nano_smd_resistor");
nano_smd_resistor.maxStackSize = 64;
nano_smd_resistor.register();

var nano_smd_capacitor = VanillaFactory.createItem("nano_smd_capacitor");
nano_smd_capacitor.maxStackSize = 64;
nano_smd_capacitor.register();

var nano_smd_diode = VanillaFactory.createItem("nano_smd_diode");
nano_smd_diode.maxStackSize = 64;
nano_smd_diode.register();

var nano_smd_inductor = VanillaFactory.createItem("nano_smd_inductor");
nano_smd_inductor.maxStackSize = 64;
nano_smd_inductor.register();

var quantum_smd_transistor = VanillaFactory.createItem("quantum_smd_transistor");
quantum_smd_transistor.maxStackSize = 64;
quantum_smd_transistor.register();

var quantum_smd_resistor = VanillaFactory.createItem("quantum_smd_resistor");
quantum_smd_resistor.maxStackSize = 64;
quantum_smd_resistor.register();

var quantum_smd_capacitor = VanillaFactory.createItem("quantum_smd_capacitor");
quantum_smd_capacitor.maxStackSize = 64;
quantum_smd_capacitor.register();

var quantum_smd_diode = VanillaFactory.createItem("quantum_smd_diode");
quantum_smd_diode.maxStackSize = 64;
quantum_smd_diode.register();

var quantum_smd_inductor = VanillaFactory.createItem("quantum_smd_inductor");
quantum_smd_inductor.maxStackSize = 64;
quantum_smd_inductor.register();

var crystalline_smd_transistor = VanillaFactory.createItem("crystalline_smd_transistor");
crystalline_smd_transistor.maxStackSize = 64;
crystalline_smd_transistor.register();

var crystalline_smd_resistor = VanillaFactory.createItem("crystalline_smd_resistor");
crystalline_smd_resistor.maxStackSize = 64;
crystalline_smd_resistor.register();

var crystalline_smd_capacitor = VanillaFactory.createItem("crystalline_smd_capacitor");
crystalline_smd_capacitor.maxStackSize = 64;
crystalline_smd_capacitor.register();

var crystalline_smd_diode = VanillaFactory.createItem("crystalline_smd_diode");
crystalline_smd_diode.maxStackSize = 64;
crystalline_smd_diode.register();

var crystalline_smd_inductor = VanillaFactory.createItem("crystalline_smd_inductor");
crystalline_smd_inductor.maxStackSize = 64;
crystalline_smd_inductor.register();

var slime_smd_transistor = VanillaFactory.createItem("slime_smd_transistor");
slime_smd_transistor.maxStackSize = 64;
slime_smd_transistor.register();

var slime_smd_resistor = VanillaFactory.createItem("slime_smd_resistor");
slime_smd_resistor.maxStackSize = 64;
slime_smd_resistor.register();

var slime_smd_capacitor = VanillaFactory.createItem("slime_smd_capacitor");
slime_smd_capacitor.maxStackSize = 64;
slime_smd_capacitor.register();

var slime_smd_diode = VanillaFactory.createItem("slime_smd_diode");
slime_smd_diode.maxStackSize = 64;
slime_smd_diode.register();

var slime_smd_inductor = VanillaFactory.createItem("slime_smd_inductor");
slime_smd_inductor.maxStackSize = 64;
slime_smd_inductor.register();

var photonically_energized_smd_transistor = VanillaFactory.createItem("photonically_energized_smd_transistor");
photonically_energized_smd_transistor.maxStackSize = 64;
photonically_energized_smd_transistor.register();

var photonically_energized_smd_resistor = VanillaFactory.createItem("photonically_energized_smd_resistor");
photonically_energized_smd_resistor.maxStackSize = 64;
photonically_energized_smd_resistor.register();

var photonically_energized_smd_capacitor = VanillaFactory.createItem("photonically_energized_smd_capacitor");
photonically_energized_smd_capacitor.maxStackSize = 64;
photonically_energized_smd_capacitor.register();

var photonically_energized_smd_diode = VanillaFactory.createItem("photonically_energized_smd_diode");
photonically_energized_smd_diode.maxStackSize = 64;
photonically_energized_smd_diode.register();

var photonically_energized_smd_inductor = VanillaFactory.createItem("photonically_energized_smd_inductor");
photonically_energized_smd_inductor.maxStackSize = 64;
photonically_energized_smd_inductor.register();

var bohemian_smd_transistor = VanillaFactory.createItem("bohemian_smd_transistor");
bohemian_smd_transistor.maxStackSize = 64;
bohemian_smd_transistor.register();

var bohemian_smd_resistor = VanillaFactory.createItem("bohemian_smd_resistor");
bohemian_smd_resistor.maxStackSize = 64;
bohemian_smd_resistor.register();

var bohemian_smd_capacitor = VanillaFactory.createItem("bohemian_smd_capacitor");
bohemian_smd_capacitor.maxStackSize = 64;
bohemian_smd_capacitor.register();

var bohemian_smd_diode = VanillaFactory.createItem("bohemian_smd_diode");
bohemian_smd_diode.maxStackSize = 64;
bohemian_smd_diode.register();

var bohemian_smd_inductor = VanillaFactory.createItem("bohemian_smd_inductor");
bohemian_smd_inductor.maxStackSize = 64;
bohemian_smd_inductor.register();

var anti_smd_transistor = VanillaFactory.createItem("anti_smd_transistor");
anti_smd_transistor.maxStackSize = 64;
anti_smd_transistor.register();

var anti_smd_resistor = VanillaFactory.createItem("anti_smd_resistor");
anti_smd_resistor.maxStackSize = 64;
anti_smd_resistor.register();

var anti_smd_capacitor = VanillaFactory.createItem("anti_smd_capacitor");
anti_smd_capacitor.maxStackSize = 64;
anti_smd_capacitor.register();

var anti_smd_diode = VanillaFactory.createItem("anti_smd_diode");
anti_smd_diode.maxStackSize = 64;
anti_smd_diode.register();

var anti_smd_inductor = VanillaFactory.createItem("anti_smd_inductor");
anti_smd_inductor.maxStackSize = 64;
anti_smd_inductor.register();

var technologically_advanced_smd_transistor = VanillaFactory.createItem("technologically_advanced_smd_transistor");
technologically_advanced_smd_transistor.maxStackSize = 64;
technologically_advanced_smd_transistor.register();

var technologically_advanced_smd_resistor = VanillaFactory.createItem("technologically_advanced_smd_resistor");
technologically_advanced_smd_resistor.maxStackSize = 64;
technologically_advanced_smd_resistor.register();

var technologically_advanced_smd_capacitor = VanillaFactory.createItem("technologically_advanced_smd_capacitor");
technologically_advanced_smd_capacitor.maxStackSize = 64;
technologically_advanced_smd_capacitor.register();

var technologically_advanced_smd_diode = VanillaFactory.createItem("technologically_advanced_smd_diode");
technologically_advanced_smd_diode.maxStackSize = 64;
technologically_advanced_smd_diode.register();

var technologically_advanced_smd_inductor = VanillaFactory.createItem("technologically_advanced_smd_inductor");
technologically_advanced_smd_inductor.maxStackSize = 64;
technologically_advanced_smd_inductor.register();

//Components
var emitter_ulv = VanillaFactory.createItem("emitter_ulv");
emitter_ulv.maxStackSize = 64;
emitter_ulv.register();

//GT Coils
var gt_coil_1 = VanillaFactory.createBlock("gt_coil_1", <blockmaterial:iron>);
gt_coil_1.setToolClass("wrench");
gt_coil_1.setToolLevel(2);
gt_coil_1.register();

var gt_coil_2 = VanillaFactory.createBlock("gt_coil_2", <blockmaterial:iron>);
gt_coil_2.setToolClass("wrench");
gt_coil_2.setToolLevel(2);
gt_coil_2.register();

var gt_coil_3 = VanillaFactory.createBlock("gt_coil_3", <blockmaterial:iron>);
gt_coil_3.setToolClass("wrench");
gt_coil_3.setToolLevel(2);
gt_coil_3.register();

var gt_coil_4 = VanillaFactory.createBlock("gt_coil_4", <blockmaterial:iron>);
gt_coil_4.setToolClass("wrench");
gt_coil_4.setToolLevel(2);
gt_coil_4.register();

var gt_coil_5 = VanillaFactory.createBlock("gt_coil_5", <blockmaterial:iron>);
gt_coil_5.setToolClass("wrench");
gt_coil_5.setToolLevel(2);
gt_coil_5.register();

var gt_coil_6 = VanillaFactory.createBlock("gt_coil_6", <blockmaterial:iron>);
gt_coil_6.setToolClass("wrench");
gt_coil_6.setToolLevel(2);
gt_coil_6.register();

var gt_coil_7 = VanillaFactory.createBlock("gt_coil_7", <blockmaterial:iron>);
gt_coil_7.setToolClass("wrench");
gt_coil_7.setToolLevel(2);
gt_coil_7.register();

var gt_coil_8 = VanillaFactory.createBlock("gt_coil_8", <blockmaterial:iron>);
gt_coil_8.setToolClass("wrench");
gt_coil_8.setToolLevel(2);
gt_coil_8.register();

var gt_coil_9 = VanillaFactory.createBlock("gt_coil_9", <blockmaterial:iron>);
gt_coil_9.setToolClass("wrench");
gt_coil_9.setToolLevel(2);
gt_coil_9.register();

var gt_coil_10 = VanillaFactory.createBlock("gt_coil_10", <blockmaterial:iron>);
gt_coil_10.setToolClass("wrench");
gt_coil_10.setToolLevel(2);
gt_coil_10.register();

var gt_coil_11 = VanillaFactory.createBlock("gt_coil_11", <blockmaterial:iron>);
gt_coil_11.setToolClass("wrench");
gt_coil_11.setToolLevel(2);
gt_coil_11.register();
