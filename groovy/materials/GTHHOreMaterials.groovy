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

    static void register() {

        Albite = new Material.Builder(8000, gregtechId('albite'))
            .dust()
            .gem()
            .ore()
            .components(Sodium * 1, Aluminium * 1, Silicon * 3, Oxygen * 8)
            .color(0xFDFFD1)
            .iconSet(GTHHMaterialIconSet.ALBITE)
            .build()

        Anorthite = new Material.Builder(8001, gregtechId('Anorthite'))
            .dust()
            .gem()
            .ore()
            .components(Calcium * 1, Aluminium * 2, Silicon * 2, Oxygen * 8)
            .color(0xC8C9A5)
            .iconSet(MaterialIconSet.RUBY)
            .build()

        Plagioclase = new Material.Builder(8002, gregtechId('plagioclase'))
            .dust()
            .gem()
            .ore()
            .components(Calcium * 1, Sodium * 1, Aluminium * 3, Silicon * 5, Oxygen * 16)
            .color(0x535B4C)
            .iconSet(GTHHMaterialIconSet.PLAGIOCLASE)
            .build()

        Pyroxene = new Material.Builder(8003, gregtechId('pyroxene'))
            .dust()
            .gem()
            .ore()
            .components(Magnesium * 1, Lithium * 1, Silicon * 2, Oxygen * 6)
            .color(0x334225)
            .iconSet(MaterialIconSet.EMERALD)
            .build()

        Moon = new Material.Builder(8004, gregtechId('moon'))
            .dust()
            .components(Magnesium * 1, Lithium * 1, Calcium * 1, Sodium * 1, Aluminium * 3, Silicon * 7, Oxygen * 22)
            .color(0x6D6D6D)
            .iconSet(MaterialIconSet.DULL)
            .build()
        
        Carbonate = new Material.Builder(8005, gregtechId('carbonate'))
            .dust()
            .ore()
            .components(Hydrogen * 2, Carbon * 1, Oxygen * 3)
            .color(0xE8DADA)
            .iconSet(MaterialIconSet.SHINY)
            .build()

        AmmoniatedSilicate = new Material.Builder(8006, gregtechId('ammoniated_silicate'))
            .dust()
            .gem()
            .ore()
            .components(Nitrogen * 1, Hydrogen * 3, Silicon * 1, Oxygen * 4)
            .color(0x9B70C1)
            .iconSet(MaterialIconSet.QUARTZ)
            .build()

        Ceres = new Material.Builder(8007, gregtechId('ceres'))
            .dust()
            .color(0x709EBF)
            .iconSet(MaterialIconSet.DULL)
            .build()

        Pluto = new Material.Builder(8008, gregtechId('pluto'))
            .dust()
            .components()
            .color(0x7B6049)
            .iconSet(MaterialIconSet.DULL)
            .build()
        
        PreciousMetals = new Material.Builder(8009, gregtechId('precious_metals'))
            .dust()
            .ingot()
            .ore()
            .liquid(new FluidBuilder().temperature(1263))
            .color(0xE09D00)
            .iconSet(MaterialIconSet.SHINY)
            .build()

        Cryolite = new Material.Builder(8010, gregtechId('cryolite'))
            .dust()
            .ore()
            .addOreByproducts(Sodium, Aluminium, PreciousMetals)
            .components(Sodium * 3, Aluminium * 1, Fluorine * 6)
            .color(0x7FD8FF)
            .iconSet(MaterialIconSet.SHINY)
            .build()
        
        SolarGradeSilicon = new Material.Builder(8011, gregtechId('solar_grade_silicon'))
            .dust()
            .ingot()
            .ore()
            .flags(EXT2_METAL, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_DOUBLE_PLATE)
            .liquid(new FluidBuilder().temperature(2273))
            .blastTemp(2273, "MID", 120, 1568)
            .color(0x3C3C50)
            .iconSet(MaterialIconSet.SHINY)
            .build()

        PreciousMetals.setFormula('Au?Ag?Cu?', true)
        Plagioclase.setFormula('((NaAlSi3O8)(CaAl2Si2O8))', true)
        Moon.setFormula('((((NaAlSi3O8)(CaAl2Si2O8))(MgLiSi2O6)(Mg2Fe(SiO2)2)(FeTiO3)))', true)
        Ceres.setFormula('(NH3SiO4)(H2CO3)(FeHO2)(Al2O3)', true)
        Pluto.setFormula('(H2O)')
        SolarGradeSilicon.setFormula('*Si*', true)
    }

}
