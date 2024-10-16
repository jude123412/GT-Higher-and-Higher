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

class GTHHSecondDegreeMaterials {

    private static int startId = 11000
    private static int endId = 11499


    static void register() {

        ElectricalSteel = new Material.Builder(getMetaItemId(), gregtechId('electrical_steel'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1688))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(1688, "LOW", 120, 1100)
            .components(Steel * 1, Silicon * 1)
            .color(0x999999)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(32, 4, 1, false)
            .build()
        ElectricalSteel.setFormula("(Fe99C)Si", true)

        EnergeticAlloy = new Material.Builder(getMetaItemId(), gregtechId('energetic_alloy'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(2100))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(2100, "LOW", 120, 1680)
            .components(Gold * 1, Redstone * 1, Glowstone * 1)
            .color(0xFF7402)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(2048, 16, 6, false)
            .build()

        VibrantAlloy = new Material.Builder(getMetaItemId(), gregtechId('vibrant_alloy'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(2950))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(2950, "MID", 480, 2052)
            .components(EnergeticAlloy * 1, EnderPearl * 1)
            .color(0xBEFF1C)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(8192, 20, 8, false)
            .build()

        RedstoneAlloy = new Material.Builder(getMetaItemId(), gregtechId('redstone_alloy'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1750))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(1750, "LOW", 120, 860)
            .components(ElectricalSteel * 4, Redstone * 1, Silicon * 1)
            .color(0xCC3030)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(128, 8, 2, false)
            .build()

        ConductiveIron = new Material.Builder(getMetaItemId(), gregtechId('conductive_iron'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1555))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(1555, "LOW", 120, 900)
            .components(RedstoneAlloy * 4, Steel * 1, Redstone * 1)
            .color(0xFFB4A5)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(512, 12, 4, false)
            .build()
        ConductiveIron.setFormula("(((Fe99C)Si)4(Si(FeS2)5(CrAl2O3)Hg3)Si)4(Fe99C)(Si(FeS2)5(CrAl2O3)Hg3)", true)

        PulsatingIron = new Material.Builder(getMetaItemId(), gregtechId('pulsating_iron'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1720))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(1720, "LOW", 120, 625)
            .components(Steel * 1, EnderPearl * 1)
            .color(0x9AFFB1)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(8, 1, 1, false)
            .build()
        PulsatingIron.setFormula("(Fe99C)(BeK4N5)", true)

        DarkSteel = new Material.Builder(getMetaItemId(), gregtechId('dark_steel'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1690))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE, GENERATE_ROUND)
            .blastTemp(1690, "LOW", 120, 1200)
            .components(Steel * 1, Obsidian * 1)
            .color(0x4C4C4C)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()
        DarkSteel.setFormula("(Fe99C)(MgFeSi2O4)",true)

        Soularium = new Material.Builder(getMetaItemId(), gregtechId('soularium'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(2280))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE, GENERATE_ROUND)
            .blastTemp(2280, "MID", 120, 1100)
            .color(0x7A502E)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()
        Soularium.setFormula("(AgAu)?", true) // Electrum * 1, SoulSand * 1

        EndSteel = new Material.Builder(getMetaItemId(), gregtechId('end_steel'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(3000))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .components(DarkSteel * 1, Obsidian * 1)
            .blastTemp(3000, "MID", 480, 1100)
            .color(0xE5DB8B)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()
        EndSteel.setFormula("((Fe99C)(MgFeSi2O4))?", true) // Steel * 1, Obsidian * 1

        CrudeSteel = new Material.Builder(getMetaItemId(), gregtechId('crude_steel'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1300))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(1300, "LOW", 32, 651)
            .color(0xCCC3B1)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()
        CrudeSteel.setFormula("(Na2LiAl2Si2(H2O)6)??", true) //Clay * 1, Gravel * 4, Cobblestone * 1

        CrystallineAlloy = new Material.Builder(getMetaItemId(), gregtechId('crystalline_alloy'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(3820))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(3820, "HIGH", 1920, 2872)
            .color(0x91FFFF)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(32768, 24, 4, false)
            .build()
        CrystallineAlloy.setFormula("((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))?", true) // VibrantAlloy * 1, GrainsOfPiezallity * 1

        MelodicAlloy = new Material.Builder(getMetaItemId(), gregtechId('melodic_alloy'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(3290))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(3290, "HIGH", 480, 2490)
            .color(0xB26EB2)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(131072, 28, 16, false)
            .build()
        MelodicAlloy.setFormula("((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))?", true) // EndSteel * 1, PopedChorusFruit * 1

        CrystallinePinkSlime = new Material.Builder(getMetaItemId(), gregtechId('crystalline_pink_slime'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(3890))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(4890, "HIGH", 1920, 1100)
            .color(0xFF99EF)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(524288, 32, 64, false)
            .build()
        CrystallinePinkSlime.setFormula("((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))(((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))?)((Fe99C)(MgFeSi2O4)?)(((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))?)", true) // VibrantAlloy * 1, MelodicAlloy * 1, EndSteel * 1, CrystallineAlloy * 1

        EnergeticSilver = new Material.Builder(getMetaItemId(), gregtechId('energetic_silver'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(2085))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(2085, "LOW", 120, 1680)
            .components(Silver * 1, Redstone * 1, Glowstone * 1)
            .color(0x639ECC)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()

        VividAlloy = new Material.Builder(getMetaItemId(), gregtechId('vivid_alloy'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(2925))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(2925, "MID", 480, 2052)
            .components(EnergeticSilver * 1, EnderPearl * 1)
            .color(0x7AE6FF)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()

        StellarAlloy = new Material.Builder(getMetaItemId(), gregtechId('stellar_alloy'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(5480))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(5480, "HIGHER", 7680, 3890, 7680, 2400)
            .components(VividAlloy * 1, VibrantAlloy * 1, EndSteel * 1, ConductiveIron * 1, NaquadahAlloy * 1, CrystallinePinkSlime * 6)
            .color(0xDBFFFF)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .cableProperties(2097152, 36, 256, false)
            .build()
        
        WeatherCrystal = new Material.Builder(getMetaItemId(), gregtechId('weather_crystal'))
            .dust()
            .color(0x793BAB)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()
        
        SandCompound = new Material.Builder(getMetaItemId(), gregtechId('sand_compound'))
            .dust()
            .color(0xB4B394)
            .iconSet(GTHHMaterialIconSet.SANDCOMPOUND)
            .build()

        Cryotheum = new Material.Builder(getMetaItemId(), gregtechId('cryotheum'))
            .dust()
            .liquid(new FluidBuilder().temperature(393))
            .components(Blaze * 2, Redstone * 1, Saltpeter * 1)
            .color(0x00AEFF)
            .iconSet(MaterialIconSet.SHINY)
            .build()
        
        Pyrotheum = new Material.Builder(getMetaItemId(), gregtechId('pyrotheum'))
            .dust()
            .liquid(new FluidBuilder().temperature(1473))
            .components(Blaze * 2, Redstone * 1, Sulfur * 1)
            .color(0xFF9000)
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
