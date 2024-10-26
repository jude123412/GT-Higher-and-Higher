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

        Soularium = new Material.Builder(getMetaItemId(), gregtechId('soularium'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(2280))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE, GENERATE_ROUND)
            .blastTemp(2280, "MID", 120, 1100)
            .color(0x7A502E)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()

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

        CrudeSteel = new Material.Builder(getMetaItemId(), gregtechId('crude_steel'))
            .dust()
            .ingot()
            .liquid(new FluidBuilder().temperature(1300))
            .flags(EXT2_METAL, GENERATE_SPRING, GENERATE_SPRING_SMALL, GENERATE_RING, GENERATE_ROTOR, GENERATE_SMALL_GEAR, GENERATE_FRAME, GENERATE_DENSE, GENERATE_FOIL, GENERATE_GEAR, GENERATE_DOUBLE_PLATE, GENERATE_FINE_WIRE)
            .blastTemp(1300, "LOW", 32, 651)
            .color(0xCCC3B1)
            .iconSet(GTHHMaterialIconSet.ENDERIOINGOT)
            .build()

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
        
        MoonStone = new Material.Builder(getMetaItemId(), gregtechId('moon_stone'))
            .dust()
            .color(0x6D6D6D)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
        
        MarsStone = new Material.Builder(getMetaItemId(), gregtechId('mars_stone'))
            .dust()
            .color(0x841C02)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        AsteroidStone = new Material.Builder(getMetaItemId(), gregtechId('asteroid_stone'))
            .dust()
            .color(0x2D2C27)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
            
        VenusStone = new Material.Builder(getMetaItemId(), gregtechId('venus_stone'))
            .dust()
            .color(0x634B44)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        MercuryStone = new Material.Builder(getMetaItemId(), gregtechId('mercury_stone'))
            .dust()
            .color(0x4E4D6B)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        CeresStone = new Material.Builder(getMetaItemId(), gregtechId('ceres_stone'))
            .dust()
            .color(0x65647F)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
        
        JupiterStone = new Material.Builder(getMetaItemId(), gregtechId('jupiter_stone'))
            .dust()
            .color(0xDD9B68)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        SaturnStone = new Material.Builder(getMetaItemId(), gregtechId('saturn_stone'))
            .dust()
            .color(0xA5744F)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
            
        UranusStone = new Material.Builder(getMetaItemId(), gregtechId('uranus_stone'))
            .dust()
            .color(0x88B4FC)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        NeptuneStone = new Material.Builder(getMetaItemId(), gregtechId('neptune_stone'))
            .dust()
            .color(0x166DF9)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
        
        PlutoStone = new Material.Builder(getMetaItemId(), gregtechId('pluto_stone'))
            .dust()
            .color(0x5B5B5B)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        ErisStone = new Material.Builder(getMetaItemId(), gregtechId('eris_stone'))
            .dust()
            .color(0x979E91)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        Kepler22bStone = new Material.Builder(getMetaItemId(), gregtechId('kepler_twotwob_stone'))
            .dust()
            .color(0xA58359)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        EuropaStone = new Material.Builder(getMetaItemId(), gregtechId('europa_stone'))
            .dust()
            .color(0x847670)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
        
        IoStone = new Material.Builder(getMetaItemId(), gregtechId('io_stone'))
            .dust()
            .color(0xD18F3E)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        DeimosStone = new Material.Builder(getMetaItemId(), gregtechId('deimos_stone'))
            .dust()
            .color(0xC1A58D)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
            
        PhobosStone = new Material.Builder(getMetaItemId(), gregtechId('phobos_stone'))
            .dust()
            .color(0x846B57)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        TritonStone = new Material.Builder(getMetaItemId(), gregtechId('triton_stone'))
            .dust()
            .color(0x7C797C)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
        
        CallistoStone = new Material.Builder(getMetaItemId(), gregtechId('callisto_stone'))
            .dust()
            .color(0x543A28)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        GanymedeStone = new Material.Builder(getMetaItemId(), gregtechId('ganymede_stone'))
            .dust()
            .color(0x4F4943)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        RheaStone = new Material.Builder(getMetaItemId(), gregtechId('rhea_stone'))
            .dust()
            .color(0x333333)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        TitanStone = new Material.Builder(getMetaItemId(), gregtechId('titan_stone'))
            .dust()
            .color(0x332B1F)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
        
        OberonStone = new Material.Builder(getMetaItemId(), gregtechId('oberon_stone'))
            .dust()
            .color(0x897A88)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

        TitaniaStone = new Material.Builder(getMetaItemId(), gregtechId('titania_stone'))
            .dust()
            .color(0x8B8F93)
            .iconSet(MaterialIconSet.ROUGH)
            .build()
            
        IapetusStone = new Material.Builder(getMetaItemId(), gregtechId('iapetus_stone'))
            .dust()
            .color(0x35230E)
            .iconSet(MaterialIconSet.ROUGH)
            .build()

    }

    private static int getMetaItemId() {
        if (startId < endId){
        return startId++
        }
        throw new ArrayIndexOutOfBoundsException()
    }

}
