package materials

import gregtech.api.fluids.FluidBuilder
import gregtech.api.fluids.attribute.FluidAttributes
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.properties.BlastProperty.GasTier
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.material.properties.ToolProperty

import static gregtech.api.GTValues.*
import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.info.MaterialIconSet.*
import static gregtech.api.util.GTUtility.gregtechId

import net.minecraft.init.Enchantments

import materials.GTHHMaterialIconSet.*

import static materials.GTHHMaterials.*


class GTHHFantasyMaterials {

    static void register() {

        // CosmicNeutronium = new Material.Builder(9000, gregtechId('cosmic_neutronium'))
        //     .dust()
        //     .ingot()
        //     .ore()
        //     .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE)
        //     .iconSet(GTHHMaterialIconSet.COSMIC_NEUTRONIUM)
        //     .build()

        // InfinityCatalyst = new Material.Builder(9001, gregtechId('infinity_catalyst'))
        //     .dust()
        //     .gem()
        //     .ore()
        //     .iconSet(RUBY)
        //     .build()

        // Infinity = new Material.Builder(9002, gregtechId('infinity'))
        //     .dust()
        //     .ingot()
        //     .ore()
        //     .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE)
        //     .iconSet(RUBY)
        //     .build()

    }

}
