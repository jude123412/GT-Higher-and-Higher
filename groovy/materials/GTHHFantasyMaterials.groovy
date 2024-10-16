package materials

import gregtech.api.fluids.FluidBuilder
import gregtech.api.fluids.attribute.FluidAttributes
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.properties.BlastProperty.GasTier
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.material.properties.ToolProperty
import gregtech.api.items.toolitem.ToolBuilder
import gregtech.api.unification.Element

import static gregtech.api.GTValues.*
import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.info.MaterialIconSet.*
import static gregtech.api.util.GTUtility.gregtechId

import net.minecraft.init.Enchantments

import material.*
import materials.*

import static materials.GTHHMaterials.*


class GTHHFantasyMaterials {

    private static int startId = 9000
    private static int endId = 9499

    static void register() {

        def ElementCosmicNeutronium = new Element(121, 189, -1, null, "Cosmic-Neutronium", "Ct", false)
        def ElementInfinityCatalyst = new Element(122, 189, -1, null, "Infinity-Catalyst", "Ic", false)
        def ElementInfinity = new Element(123, 189, -1, null, "Infinity", "∞", false)
        def ElementMultiversium = new Element(124, 189, -1, null, "Multiversium", "✱", false)
        def ElementInfernorite = new Element(126, 189, -1, null, "Infernorite", "☼", false)
        def ElementCrynorium = new Element(127, 189, -1, null, "Crynorium", "❄", false)

        CosmicNeutronium = new Material.Builder(getMetaItemId(), gregtechId('cosmic_neutronium'))
            .dust()
            .ingot()
            .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_SMALL_GEAR, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_LENS)
            .blastTemp(10000, "LOW", 7864320, 9600)
            .iconSet(GTHHMaterialIconSet.COSMICNEUTRONIUM)
            .element(ElementCosmicNeutronium)
            .build()

        InfinityCatalyst = new Material.Builder(getMetaItemId(), gregtechId('infinity_catalyst'))
            .dust()
            .gem()
            .ore()
            .iconSet(GTHHMaterialIconSet.INFINITYCATALYST)
            .element(ElementInfinityCatalyst)
            .build()

        Infinity = new Material.Builder(getMetaItemId(), gregtechId('infinity'))
            .dust()
            .ingot()
            .blastTemp(10000, "LOW", 31457280, 9600)
            .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_SMALL_GEAR, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_LENS)
            .iconSet(GTHHMaterialIconSet.INFINITY)
            .element(ElementInfinity)
            .build()
        
        Multiversium = new Material.Builder(getMetaItemId(), gregtechId('multiversium'))
            .dust()
            .ingot()
            .blastTemp(10000, "LOW", 125829120, 9600)
            .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_SMALL_GEAR, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_LENS)
            .iconSet(GTHHMaterialIconSet.MULTIVERSIUM)
            .element(ElementMultiversium)
            .build()

        Infernorite = new Material.Builder(getMetaItemId(), gregtechId('infernorite'))
            .dust()
            .ingot()
            .ore()
            .liquid(new FluidBuilder().temperature(5299))
            .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_SMALL_GEAR, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_LENS)
            .blastTemp(5299, "LOW", 30720, 3333)
            .toolStats(ToolProperty.Builder.of(24, 11, 3678, 4)
            .attackSpeed(1).enchantability(33)
            .magnetic()
            .durabilityMultiplier(1).build())
            .iconSet(GTHHMaterialIconSet.INFERNORITE)
            .element(ElementInfernorite)
            .build()
        
        Crynorium = new Material.Builder(getMetaItemId(), gregtechId('crynorium'))
            .dust()
            .ingot()
            .ore()
            .liquid(new FluidBuilder().temperature(103))
            .flags(GENERATE_PLATE, GENERATE_DOUBLE_PLATE, GENERATE_DENSE, GENERATE_ROD, GENERATE_BOLT_SCREW, GENERATE_FRAME, GENERATE_GEAR, GENERATE_LONG_ROD, GENERATE_FOIL, GENERATE_RING, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_SMALL_GEAR, GENERATE_FINE_WIRE, GENERATE_ROTOR, GENERATE_ROUND, GENERATE_LENS)
            .blastTemp(7015, "LOW", 122880, 4455)
            .iconSet(GTHHMaterialIconSet.CRYNORIUM)
            .element(ElementCrynorium)
            .build()
            
    }

        private static int getMetaItemId() {
        if (startId < endId){
        return startId++
        }
        throw new ArrayIndexOutOfBoundsException()
    }
}
