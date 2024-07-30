import gregtech.api.items.metaitem.*
import gregtech.api.unification.material.event.PostMaterialEvent

eventManager.listen {
    PostMaterialEvent event ->
        log.infoMC("Adding metaitems...")
            StandardMetaItem gthhMetaItems = new StandardMetaItem((short)2)
                gthhMetaItems.setRegistryName("meta_item_2")
            
                //Mica
                gthhMetaItems.addItem(1, "component.mica_based_pulp")
                gthhMetaItems.addItem(2, "component.mica_based_sheet")
                gthhMetaItems.addItem(3, "component.mica_insulator_sheet")
                gthhMetaItems.addItem(4, "component.mica_insulator_foil")

                //Pam's Harvest Craft 
                gthhMetaItems.addItem(5, "unfired.juicer")
                gthhMetaItems.addItem(6, "unfired.bakeware")
                
                //Twilight Forest
                gthhMetaItems.addItem(10, "component.quick_and_dirty_portal_generator")
                
                //Raw Elements
                gthhMetaItems.addItem(100, "raw.aluminium")

                //Wafers
                gthhMetaItems.addItem(200, "wafer.sand_compound")
                gthhMetaItems.addItem(201, "wafer.basic_chip")
                gthhMetaItems.addItem(202, "wafer.advanced_chip")
                gthhMetaItems.addItem(203, "wafer.fpga")

                //Boules
                gthhMetaItems.addItem(300, "boule.sand_compound")

                //Dusts
                gthhMetaItems.addItem(400, "dust.sand_compound")

                //Circuits
                gthhMetaItems.addItem(800, "circuit.slimeware_processor")
                gthhMetaItems.addItem(801, "circuit.slimeware_assembly")
                gthhMetaItems.addItem(802, "circuit.slimeware_supercomputer")
                gthhMetaItems.addItem(803, "circuit.slimeware_mainframe")
                gthhMetaItems.addItem(804, "circuit.lasertronic_processor")
                gthhMetaItems.addItem(805, "circuit.lasertronic_assembly")
                gthhMetaItems.addItem(806, "circuit.lasertronic_supercomputer")
                gthhMetaItems.addItem(807, "circuit.lasertronic_mainframe")
                gthhMetaItems.addItem(808, "circuit.bohemian_processor")
                gthhMetaItems.addItem(809, "circuit.bohemian_assembly")
                gthhMetaItems.addItem(810, "circuit.bohemian_supercomputer")
                gthhMetaItems.addItem(811, "circuit.bohemian_mainframe")
                gthhMetaItems.addItem(812, "circuit.anti_processor")
                gthhMetaItems.addItem(813, "circuit.anti_assembly")
                gthhMetaItems.addItem(814, "circuit.anti_supercomputer")
                gthhMetaItems.addItem(815, "circuit.anti_mainframe")
                gthhMetaItems.addItem(816, "circuit.temporally_woven_processor")
                gthhMetaItems.addItem(817, "circuit.temporally_woven_assembly")
                gthhMetaItems.addItem(818, "circuit.temporally_woven_supercomputer")
                gthhMetaItems.addItem(819, "circuit.temporally_woven_mainframe")

                //Circuit Boards
                gthhMetaItems.addItem(820, "component.slimeware_slimesupport_circuit_board")
                gthhMetaItems.addItem(821, "component.photonically_aligned_circuit_board")
                gthhMetaItems.addItem(822, "component.bohemian_circuit_board")
                gthhMetaItems.addItem(823, "component.semi_stable_anti_matter_circuit_board")
                gthhMetaItems.addItem(824, "component.temporal_circuit_board")
                gthhMetaItems.addItem(825, "component.ultimate_circuit_board")
                gthhMetaItems.addItem(826, "component.psychotic_circuit_board")
                gthhMetaItems.addItem(827, "component.insane_circuit_board")
                gthhMetaItems.addItem(828, "component.reverse_circuit_board")
                gthhMetaItems.addItem(829, "component.temporally_woven_circuit_board")

                //Circuit Components
                gthhMetaItems.addItem(830, "component.nano_smd_transistor")
                gthhMetaItems.addItem(831, "component.nano_smd_resistor")
                gthhMetaItems.addItem(832, "component.nano_smd_capacitor")
                gthhMetaItems.addItem(833, "component.nano_smd_diode")
                gthhMetaItems.addItem(834, "component.nano_smd_inductor")
                gthhMetaItems.addItem(835, "component.quantum_smd_transistor")
                gthhMetaItems.addItem(836, "component.quantum_smd_resistor")
                gthhMetaItems.addItem(837, "component.quantum_smd_capacitor")
                gthhMetaItems.addItem(838, "component.quantum_smd_diode")
                gthhMetaItems.addItem(839, "component.quantum_smd_inductor")
                gthhMetaItems.addItem(840, "component.crystalline_smd_transistor")
                gthhMetaItems.addItem(841, "component.crystalline_smd_resistor")
                gthhMetaItems.addItem(842, "component.crystalline_smd_capacitor")
                gthhMetaItems.addItem(843, "component.crystalline_smd_diode")
                gthhMetaItems.addItem(844, "component.crystalline_smd_inductor")
                gthhMetaItems.addItem(845, "component.slime_smd_transistor")
                gthhMetaItems.addItem(846, "component.slime_smd_resistor")
                gthhMetaItems.addItem(847, "component.slime_smd_capacitor")
                gthhMetaItems.addItem(848, "component.slime_smd_diode")
                gthhMetaItems.addItem(849, "component.slime_smd_inductor")
                gthhMetaItems.addItem(850, "component.photonically_energized_smd_transistor")
                gthhMetaItems.addItem(851, "component.photonically_energized_smd_resistor")
                gthhMetaItems.addItem(852, "component.photonically_energized_smd_capacitor")
                gthhMetaItems.addItem(853, "component.photonically_energized_smd_diode")
                gthhMetaItems.addItem(854, "component.photonically_energized_smd_inductor")
                gthhMetaItems.addItem(855, "component.bohemian_smd_transistor")
                gthhMetaItems.addItem(856, "component.bohemian_smd_resistor")
                gthhMetaItems.addItem(857, "component.bohemian_smd_capacitor")
                gthhMetaItems.addItem(858, "component.bohemian_smd_diode")
                gthhMetaItems.addItem(859, "component.bohemian_smd_inductor")
                gthhMetaItems.addItem(860, "component.anti_smd_transistor")
                gthhMetaItems.addItem(861, "component.anti_smd_resistor")
                gthhMetaItems.addItem(862, "component.anti_smd_capacitor")
                gthhMetaItems.addItem(863, "component.anti_smd_diode")
                gthhMetaItems.addItem(864, "component.anti_smd_inductor")
                gthhMetaItems.addItem(865, "component.temporally_woven_smd_transistor")
                gthhMetaItems.addItem(866, "component.temporally_woven_smd_resistor")
                gthhMetaItems.addItem(867, "component.temporally_woven_smd_capacitor")
                gthhMetaItems.addItem(868, "component.temporally_woven_smd_diode")
                gthhMetaItems.addItem(869, "component.temporally_woven_smd_inductor")
}