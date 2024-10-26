package materials

import gregtech.api.fluids.FluidBuilder
import gregtech.api.fluids.attribute.FluidAttributes
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.info.MaterialIconSet

import net.minecraft.init.Enchantments

import static gregtech.api.GTValues.*
import static gregtech.api.util.GTUtility.*
import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.*

import material.GTHHMaterialIconSet

import static materials.GTHHMaterials.*

class GTHHOreMaterials {

    private static int startId = 8000
    private static int endId = 8499

    static void register() {

        Albite = new Material.Builder(getMetaItemId(), gregtechId('albite'))
            .dust()
            .gem()
            .ore()
            .components(Sodium * 1, Aluminium * 1, Silicon * 3, Oxygen * 8)
            .color(0xFDFFD1)
            .iconSet(GTHHMaterialIconSet.ALBITE)
            .build()

        Anorthite = new Material.Builder(getMetaItemId(), gregtechId('Anorthite'))
            .dust()
            .gem()
            .ore()
            .components(Calcium * 1, Aluminium * 2, Silicon * 2, Oxygen * 8)
            .color(0xC8C9A5)
            .iconSet(MaterialIconSet.RUBY)
            .build()

        Plagioclase = new Material.Builder(getMetaItemId(), gregtechId('plagioclase'))
            .dust()
            .gem()
            .ore()
            .components(Calcium * 1, Sodium * 1, Aluminium * 3, Silicon * 5, Oxygen * 16)
            .color(0x535B4C)
            .iconSet(GTHHMaterialIconSet.PLAGIOCLASE)
            .build()

        Pyroxene = new Material.Builder(getMetaItemId(), gregtechId('pyroxene'))
            .dust()
            .gem()
            .ore()
            .components(Magnesium * 1, Lithium * 1, Silicon * 2, Oxygen * 6)
            .color(0x334225)
            .iconSet(MaterialIconSet.EMERALD)
            .build()
        
        Carbonate = new Material.Builder(getMetaItemId(), gregtechId('carbonate'))
            .dust()
            .ore()
            .components(Hydrogen * 2, Carbon * 1, Oxygen * 3)
            .color(0xE8DADA)
            .iconSet(MaterialIconSet.SHINY)
            .build()

        AmmoniatedSilicate = new Material.Builder(getMetaItemId(), gregtechId('ammoniated_silicate'))
            .dust()
            .gem()
            .ore()
            .components(Nitrogen * 1, Hydrogen * 3, Silicon * 1, Oxygen * 4)
            .color(0x9B70C1)
            .iconSet(MaterialIconSet.QUARTZ)
            .build()
        
        PreciousMetals = new Material.Builder(getMetaItemId(), gregtechId('precious_metals'))
            .dust()
            .ingot()
            .ore()
            .liquid(new FluidBuilder().temperature(1263))
            .color(0xE09D00)
            .iconSet(MaterialIconSet.SHINY)
            .build()

        Cryolite = new Material.Builder(getMetaItemId(), gregtechId('cryolite'))
            .dust()
            .ore()
            .addOreByproducts(Sodium, Aluminium, PreciousMetals)
            .components(Sodium * 3, Aluminium * 1, Fluorine * 6)
            .color(0x7FD8FF)
            .iconSet(MaterialIconSet.SHINY)
            .build()
        
        SolarGradeSilicon = new Material.Builder(getMetaItemId(), gregtechId('solar_grade_silicon'))
            .dust()
            .ingot()
            .ore()
            .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_DOUBLE_PLATE)
            .liquid(new FluidBuilder().temperature(2273))
            .blastTemp(2273, "MID", 120, 1568)
            .color(0x3C3C50)
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
