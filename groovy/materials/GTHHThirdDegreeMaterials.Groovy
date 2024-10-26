package materials

import gregtech.api.fluids.FluidBuilder
import gregtech.api.fluids.attribute.FluidAttributes
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.properties.BlastProperty.GasTier
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.material.properties.ToolProperty
import gregtech.api.unification.material.info.MaterialIconSet

import net.minecraft.init.Enchantments

import static gregtech.api.GTValues.*
import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.info.MaterialIconSet.*
import static gregtech.api.util.GTUtility.gregtechId

import material.GTHHMaterialIconSet

import static materials.GTHHMaterials.*


class GTHHThirdDegreeMaterials {

    private static int startId = 11500
    private static int endId = 11999

    static void register() {

        SilverGallium = new Material.Builder(getMetaItemId(), gregtechId('silver_gallium'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(2105))
            .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, GENERATE_RING)
            .blastTemp(2105, "LOW", 120, 1200)
            .components(Silver * 2, Gallium * 1)
            .color(0xBCFCFF)
            .iconSet(MaterialIconSet.SHINY)
            .build()
        
        Tantaloper = new Material.Builder(getMetaItemId(), gregtechId('tantaloper'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1985))
            .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, GENERATE_RING)
            .blastTemp(1985, "LOW", 1920, 1200)
            .components(Tantalum * 5, Copper * 2, Gold * 1)
            .color(0xc3b058)
            .iconSet(MaterialIconSet.SHINY)
            .build()
        
        Zinvar = new Material.Builder(getMetaItemId(), gregtechId('zinvar'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1985))
            .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, GENERATE_RING)
            .blastTemp(1985, "LOW", 480, 1200)
            .components(Invar * 3, Zinc * 1)
            .color(0xA9C130)
            .iconSet(MaterialIconSet.DULL)
            .build()
        
        SterlingPlatinum = new Material.Builder(getMetaItemId(), gregtechId('sterling_platinum'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(2234))
            .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, GENERATE_RING)
            .blastTemp(2234, "LOW", 1920, 1200)
            .components(Silver * 1, Platinum * 4)
            .color(0xFFF9C6)
            .iconSet(MaterialIconSet.SHINY)
            .build()

        // Found on Mercury T3
        Mytryl = new Material.Builder(getMetaItemId(), gregtechId('mytryl'))
            .dust()
            .ingot()
            .ore()
            .liquid(new FluidBuilder().temperature(2105))
            .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, GENERATE_RING)
            .blastTemp(2987, "LOW", 30720, 1200)
            .components(Carbon * 9, Copper * 4, Silver * 3, Gallium * 1)
            .color(0x8DAA42)
            .iconSet(MaterialIconSet.DULL)
            .build()

        Tetrapech = new Material.Builder(getMetaItemId(), gregtechId('tetrapech'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1985))
            .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, GENERATE_RING)
            .blastTemp(1985, "LOW", 7680, 1200)
            .components(UraniumTriplatinum * 7, Ruridit * 3)
            .color(0x39EF67)
            .iconSet(MaterialIconSet.DULL)
            .build()

        // Found on Venus T3 
        CosmicCarbon = new Material.Builder(getMetaItemId(), gregtechId('cosmic_carbon'))
            .dust()
            .ingot()
            .ore()
            .liquid(new FluidBuilder().temperature(1985))
            .flags(EXT2_METAL, GENERATE_FOIL, GENERATE_FINE_WIRE, GENERATE_BOLT_SCREW, GENERATE_RING)
            .blastTemp(1985, "LOW", 7680, 1200)
            .color(0x000000)
            .iconSet(MaterialIconSet.SHINY)
            .build()
        
    }

    private static int getMetaItemId() {
        if (startId < endId){
        return startId++
        }
        throw new ArrayIndexOutOfBoundsException()
    }

}
