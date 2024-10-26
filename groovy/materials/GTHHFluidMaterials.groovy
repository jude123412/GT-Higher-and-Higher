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

public class GTHHFluidMaterials {

        static void register() {

        DirtyPreciousMetalSolution = new Material.Builder(10000, gregtechId('dirty_precious_metal_solution'))
            .liquid(new FluidBuilder()
                .attribute(FluidAttributes.ACID)
                .temperature(293)
                .acidic())
            .color(0xB29A00)
            .iconSet(FLUID)
            .build()
        
        DilutePreciousMetalSolution = new Material.Builder(10001, gregtechId('dilte_precious_metal_solution'))
            .liquid(new FluidBuilder()
                .attribute(FluidAttributes.ACID)
                .temperature(293)
                .acidic())
            .color(0xDDBC6C)
            .iconSet(FLUID)
            .build()
        
        CleanPreciousMetalSolution = new Material.Builder(10002, gregtechId('clean_precious_metal_solution'))
            .liquid(new FluidBuilder()
                .attribute(FluidAttributes.ACID)
                .temperature(293)
                .acidic())
            .color(0xFFD77C)
            .iconSet(FLUID)
            .build()

        ConcentratedPreciousMetalSolution = new Material.Builder(10003, gregtechId('concentrated_precious_metal_solution'))
            .liquid(new FluidBuilder()
                .attribute(FluidAttributes.ACID)
                .temperature(293)
                .acidic())
            .color(0xFFB619)
            .iconSet(FLUID)
            .build()

        CoalSlurry = new Material.Builder(10004, gregtechId('coal_slurry'))
            .liquid(new FluidBuilder()
                .temperature(293))
            .color(0x4F4F4F)
            .iconSet(FLUID)
            .build()
        
        Coolant = new Material.Builder(10005, gregtechId('coolant'))
            .liquid(new FluidBuilder()
                .temperature(293))
            .color(0x0F0FAD)
            .iconSet(FLUID)
            .build()

        SpaceCoolant = new Material.Builder(10006, gregtechId('space_coolant'))
            .liquid(new FluidBuilder()
                .temperature(293))
            .color(0x00FF00)
            .iconSet(FLUID)
            .build()
        
        PhotovoltaicComposite = new Material.Builder(10007, gregtechId('photovoltaic_composite'))
            .liquid(new FluidBuilder()
                .temperature(1120))
            .color(0x313156)
            .iconSet(DULL)
            .build()

    }
}