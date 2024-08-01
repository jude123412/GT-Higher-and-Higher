package materials

import gregtech.api.fluids.FluidBuilder
import gregtech.api.fluids.attribute.FluidAttributes
import gregtech.api.unification.material.Material
import gregtech.api.unification.material.properties.BlastProperty.GasTier
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.material.properties.ToolProperty

import net.minecraft.init.Enchantments

import static gregtech.api.GTValues.*
import static gregtech.api.unification.material.Materials.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.info.MaterialIconSet.*
import static gregtech.api.util.GTUtility.gregtechId


import static materials.GTHHMaterials.*

class GTHHSecondDegreeMaterials {

    static void register() {

        DirtyPreciousMetalSolution = new Material.Builder(10000, gregtechId('dirty_precious_metal_solution'))
            .liquid(new FluidBuilder()
                .attribute(FluidAttributes.ACID)
                .temperature(300)
                .acidic())
            .color(0xB29A00)
            .iconSet(FLUID)
            .build()
        
        DilutePreciousMetalSolution = new Material.Builder(10001, gregtechId('dilte_precious_metal_solution'))
            .liquid(new FluidBuilder()
                .attribute(FluidAttributes.ACID)
                .temperature(300)
                .acidic())
            .color(0xDDBC6C)
            .iconSet(FLUID)
            .build()
        
        CleanPreciousMetalSolution = new Material.Builder(10002, gregtechId('clean_precious_metal_solution'))
            .liquid(new FluidBuilder()
                .attribute(FluidAttributes.ACID)
                .temperature(300)
                .acidic())
            .color(0xFFD77C)
            .iconSet(FLUID)
            .build()

        ConcentratedPreciousMetalSolution = new Material.Builder(10003, gregtechId('concentrated_precious_metal_solution'))
            .liquid(new FluidBuilder()
                .attribute(FluidAttributes.ACID)
                .temperature(300)
                .acidic())
            .color(0xFFB619)
            .iconSet(FLUID)
            .build()

        DirtyPreciousMetalSolution.setFormula('(Au?Ag?)((HNO3)(HCl))', true)
        DilutePreciousMetalSolution.setFormula('(Au?Ag?)((HNO3)(HCl))(H2O)', true)
        CleanPreciousMetalSolution.setFormula('(Au)(Ag)((HNO3)(HCl))(H2O)', true)
        ConcentratedPreciousMetalSolution.setFormula('(Au)(Ag)((HNO3)(HCl))', true)
    }
}
