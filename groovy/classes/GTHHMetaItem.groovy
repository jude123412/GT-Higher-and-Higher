package classes

import gregtech.api.items.metaitem.*

class GTHHMetaItem {

    private static int startId = 0
    private static int endId = 32768

    //Soft Coded Values
    //Add Here if Not needed in Groovy Class File
    static void registerMetaItem2() {
        StandardMetaItem metaItem2 = new StandardMetaItem((short) 0)
            metaItem2.setRegistryName("meta_item_2")
            metaItem2.addItem(getMetaItemId(), "component.mica_based_pulp")
            metaItem2.addItem(getMetaItemId(), "component.mica_based_sheet")
            metaItem2.addItem(getMetaItemId(), "component.mica_insulator_sheet")
            metaItem2.addItem(getMetaItemId(), "component.mica_insulator_foil")
            metaItem2.addItem(getMetaItemId(), "unfired.juicer")
            metaItem2.addItem(getMetaItemId(), "unfired.bakeware")
            metaItem2.addItem(getMetaItemId(), "component.quick_and_dirty_portal_generator")
            metaItem2.addItem(getMetaItemId(), "component.10k_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.10k_nak_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.10k_space_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.30k_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.30k_nak_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.30k_space_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.60k_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.60k_nak_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.60k_space_coolant_cell").setMaxStackSize(1)
            metaItem2.addItem(getMetaItemId(), "component.empty_10k_coolant_cell")
            metaItem2.addItem(getMetaItemId(), "component.empty_30k_coolant_cell")
            metaItem2.addItem(getMetaItemId(), "component.empty_60k_coolant_cell")
            metaItem2.addItem(getMetaItemId(), "raw.aluminium")
            metaItem2.addItem(getMetaItemId(), "raw.gallium_arsenide")
            metaItem2.addItem(getMetaItemId(), "wafer.sand_compound")
            metaItem2.addItem(getMetaItemId(), "wafer.basic_chip")
            metaItem2.addItem(getMetaItemId(), "wafer.advanced_chip")
            metaItem2.addItem(getMetaItemId(), "wafer.fpga")
            metaItem2.addItem(getMetaItemId(), "boule.sand_compound")
            metaItem2.addItem(getMetaItemId(), "circuit.slimeware_processor")
            metaItem2.addItem(getMetaItemId(), "circuit.slimeware_assembly")
            metaItem2.addItem(getMetaItemId(), "circuit.slimeware_supercomputer")
            metaItem2.addItem(getMetaItemId(), "circuit.slimeware_mainframe")
            metaItem2.addItem(getMetaItemId(), "circuit.lasertronic_processor")
            metaItem2.addItem(getMetaItemId(), "circuit.lasertronic_assembly")
            metaItem2.addItem(getMetaItemId(), "circuit.lasertronic_supercomputer")
            metaItem2.addItem(getMetaItemId(), "circuit.lasertronic_mainframe")
            metaItem2.addItem(getMetaItemId(), "circuit.bohemian_processor")
            metaItem2.addItem(getMetaItemId(), "circuit.bohemian_assembly")
            metaItem2.addItem(getMetaItemId(), "circuit.bohemian_supercomputer")
            metaItem2.addItem(getMetaItemId(), "circuit.bohemian_mainframe")
            metaItem2.addItem(getMetaItemId(), "board.slimeware")
            metaItem2.addItem(getMetaItemId(), "board.lasertronic")
            metaItem2.addItem(getMetaItemId(), "board.bohemian")
            metaItem2.addItem(getMetaItemId(), "circuit_board.slimeware")
            metaItem2.addItem(getMetaItemId(), "circuit_board.lasertronic")
            metaItem2.addItem(getMetaItemId(), "circuit_board.bohemian")
            metaItem2.addItem(getMetaItemId(), "component.nano.smd.transistor")
            metaItem2.addItem(getMetaItemId(), "component.nano.smd.resistor")
            metaItem2.addItem(getMetaItemId(), "component.nano.smd.capacitor")
            metaItem2.addItem(getMetaItemId(), "component.nano.smd.diode")
            metaItem2.addItem(getMetaItemId(), "component.nano.smd.inductor")
            metaItem2.addItem(getMetaItemId(), "component.quantum.smd.transistor")
            metaItem2.addItem(getMetaItemId(), "component.quantum.smd.resistor")
            metaItem2.addItem(getMetaItemId(), "component.quantum.smd.capacitor")
            metaItem2.addItem(getMetaItemId(), "component.quantum.smd.diode")
            metaItem2.addItem(getMetaItemId(), "component.quantum.smd.inductor")
            metaItem2.addItem(getMetaItemId(), "component.crystalline.smd.transistor")
            metaItem2.addItem(getMetaItemId(), "component.crystalline.smd.resistor")
            metaItem2.addItem(getMetaItemId(), "component.crystalline.smd.capacitor")
            metaItem2.addItem(getMetaItemId(), "component.crystalline.smd.diode")
            metaItem2.addItem(getMetaItemId(), "component.crystalline.smd.inductor")
            metaItem2.addItem(getMetaItemId(), "component.slimeware.smd.transistor")
            metaItem2.addItem(getMetaItemId(), "component.slimeware.smd.resistor")
            metaItem2.addItem(getMetaItemId(), "component.slimeware.smd.capacitor")
            metaItem2.addItem(getMetaItemId(), "component.slimeware.smd.diode")
            metaItem2.addItem(getMetaItemId(), "component.slimeware.smd.inductor")
            metaItem2.addItem(getMetaItemId(), "component.lasertronic.smd.transistor")
            metaItem2.addItem(getMetaItemId(), "component.lasertronic.smd.resistor")
            metaItem2.addItem(getMetaItemId(), "component.lasertronic.smd.capacitor")
            metaItem2.addItem(getMetaItemId(), "component.lasertronic.smd.diode")
            metaItem2.addItem(getMetaItemId(), "component.lasertronic.smd.inductor")
            metaItem2.addItem(getMetaItemId(), "component.bohemian.smd.transistor")
            metaItem2.addItem(getMetaItemId(), "component.bohemian.smd.resistor")
            metaItem2.addItem(getMetaItemId(), "component.bohemian.smd.capacitor")
            metaItem2.addItem(getMetaItemId(), "component.bohemian.smd.diode")
            metaItem2.addItem(getMetaItemId(), "component.bohemian.smd.inductor")
            metaItem2.addItem(getMetaItemId(), "component.borosilicate_glass.tube")
            metaItem2.addItem(getMetaItemId(), "base.manganese_phosphide")

    }

    private static int getMetaItemId() {
        if (startId < endId){
        return startId++
        }
        throw new ArrayIndexOutOfBoundsException()
    }

    //Hard Coded Values
    //Add Here if ItemStack Is required in a Groovy Class File
    static void registerMetaItem3() {

        StandardMetaItem metaItem3 = new StandardMetaItem((short) 0)
            metaItem3.setRegistryName("meta_item_3")

    }
}