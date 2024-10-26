package classes

import gregtech.api.unification.material.event.PostMaterialEvent
import gregtech.api.unification.material.Materials
import gregtech.api.unification.material.info.MaterialIconType
import gregtech.api.unification.ore.StoneType
import gregtech.api.unification.ore.OrePrefix
import gregtech.common.blocks.StoneVariantBlock
import gregtech.common.blocks.StoneVariantBlock.StoneVariant

import micdoodle8.mods.galacticraft.core.GCBlocks
import micdoodle8.mods.galacticraft.core.blocks.BlockBasicMoon
import micdoodle8.mods.galacticraft.planets.mars.blocks.BlockBasicMars
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.BlockBasicAsteroids
import micdoodle8.mods.galacticraft.planets.venus.VenusBlocks
import micdoodle8.mods.galacticraft.planets.venus.blocks.BlockBasicVenus

import com.mjr.extraplanets.blocks.ExtraPlanets_Blocks
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicPluto
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicCeres
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicCallisto
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicDeimos
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicEris
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicEuropa
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicGanymede
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicIapetus
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicIo
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicJupiter
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicKepler22b
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicMercury
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicNeptune
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicOberon
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicPhobos
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicRhea
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicSaturn
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicTitan
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicTitania
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicTriton
import com.mjr.extraplanets.blocks.planetAndMoonBlocks.BlockBasicUranus

import net.minecraft.block.SoundType
import net.minecraft.block.state.IBlockState
import net.minecraft.init.Blocks

import material.GTHHOrePrefix
import materials.GTHHMaterials

import classes.GTHHMetaItem

import static gregtech.api.unification.ore.OrePrefix.Flags.ENABLE_UNIFICATION
import static gregtech.api.unification.ore.OrePrefix.Conditions.hasOreProperty

class GTHHStoneTypes {

    private static int startId = 12
    private static int endId = 512

    static void register() {

            final StoneType MOON = new StoneType(getMetaItemId(), "moon", SoundType.STONE, GTHHOrePrefix.oreMoon, GTHHMaterials.MoonStone,
                () -> GCBlocks.blockMoon.getDefaultState().withProperty(BlockBasicMoon.BASIC_TYPE_MOON, BlockBasicMoon.EnumBlockBasicMoon.MOON_STONE),
                    (state) -> state.getBlock() instanceof BlockBasicMoon && state.getValue(BlockBasicMoon.BASIC_TYPE_MOON) == BlockBasicMoon.EnumBlockBasicMoon.MOON_STONE, true)

            final StoneType MARS = new StoneType(getMetaItemId(), "mars", SoundType.STONE, GTHHOrePrefix.oreMars, GTHHMaterials.MarsStone,
                () -> MarsBlocks.marsBlock.getDefaultState().withProperty(BlockBasicMars.BASIC_TYPE, BlockBasicMars.EnumBlockBasic.MARS_STONE),
                    (state) -> state.getBlock() instanceof BlockBasicMars && state.getValue(BlockBasicMars.BASIC_TYPE) == BlockBasicMars.EnumBlockBasic.MARS_STONE, true)

            final StoneType ASTEROID_1 = new StoneType(getMetaItemId(), "asteroid_1", SoundType.STONE, GTHHOrePrefix.oreAsteroid, GTHHMaterials.AsteroidStone,
                () -> AsteroidBlocks.blockBasic.getDefaultState().withProperty(BlockBasicAsteroids.BASIC_TYPE, BlockBasicAsteroids.EnumBlockBasic.ASTEROID_0),
                    (state) -> state.getBlock() instanceof BlockBasicAsteroids && state.getValue(BlockBasicAsteroids.BASIC_TYPE) == BlockBasicAsteroids.EnumBlockBasic.ASTEROID_0, true)
            
            final StoneType ASTEROID_2 = new StoneType(getMetaItemId(), "asteroid_2", SoundType.STONE, GTHHOrePrefix.oreAsteroid, GTHHMaterials.AsteroidStone,
                () -> AsteroidBlocks.blockBasic.getDefaultState().withProperty(BlockBasicAsteroids.BASIC_TYPE, BlockBasicAsteroids.EnumBlockBasic.ASTEROID_1),
                    (state) -> state.getBlock() instanceof BlockBasicAsteroids && state.getValue(BlockBasicAsteroids.BASIC_TYPE) == BlockBasicAsteroids.EnumBlockBasic.ASTEROID_1, true)
            
            final StoneType ASTEROID_3 = new StoneType(getMetaItemId(), "asteroid_3", SoundType.STONE, GTHHOrePrefix.oreAsteroid, GTHHMaterials.AsteroidStone,
                () -> AsteroidBlocks.blockBasic.getDefaultState().withProperty(BlockBasicAsteroids.BASIC_TYPE, BlockBasicAsteroids.EnumBlockBasic.ASTEROID_2),
                    (state) -> state.getBlock() instanceof BlockBasicAsteroids && state.getValue(BlockBasicAsteroids.BASIC_TYPE) == BlockBasicAsteroids.EnumBlockBasic.ASTEROID_2, true)
                
            final StoneType VENUS = new StoneType(getMetaItemId(), "venus", SoundType.STONE, GTHHOrePrefix.oreVenus, GTHHMaterials.VenusStone,
                () -> VenusBlocks.venusBlock.getDefaultState().withProperty(BlockBasicVenus.BASIC_TYPE_VENUS, BlockBasicVenus.EnumBlockBasicVenus.ROCK_HARD),
                    (state) -> state.getBlock() instanceof BlockBasicVenus && state.getValue(BlockBasicVenus.BASIC_TYPE_VENUS) == BlockBasicVenus.EnumBlockBasicVenus.ROCK_HARD, true)

            final StoneType MERCURY = new StoneType(getMetaItemId(), "mercury", SoundType.STONE, GTHHOrePrefix.oreMercury, GTHHMaterials.MercuryStone,
                () -> ExtraPlanets_Blocks.MERCURY_BLOCKS.getDefaultState().withProperty(BlockBasicMercury.BASIC_TYPE, BlockBasicMercury.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicMercury && state.getValue(BlockBasicMercury.BASIC_TYPE) == BlockBasicMercury.EnumBlockBasic.STONE, true)

            final StoneType CERES = new StoneType(getMetaItemId(), "ceres", SoundType.STONE, GTHHOrePrefix.oreCeres, GTHHMaterials.CeresStone,
                () -> ExtraPlanets_Blocks.CERES_BLOCKS.getDefaultState().withProperty(BlockBasicCeres.BASIC_TYPE, BlockBasicCeres.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicCeres && state.getValue(BlockBasicCeres.BASIC_TYPE) == BlockBasicCeres.EnumBlockBasic.STONE, true)

            final StoneType JUPITER = new StoneType(getMetaItemId(), "jupiter", SoundType.STONE, GTHHOrePrefix.oreJupiter, GTHHMaterials.JupiterStone,
                () -> ExtraPlanets_Blocks.JUPITER_BLOCKS.getDefaultState().withProperty(BlockBasicJupiter.BASIC_TYPE, BlockBasicJupiter.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicJupiter && state.getValue(BlockBasicJupiter.BASIC_TYPE) == BlockBasicJupiter.EnumBlockBasic.STONE, true)

            final StoneType SATURN = new StoneType(getMetaItemId(), "saturn", SoundType.STONE, GTHHOrePrefix.oreSaturn, GTHHMaterials.SaturnStone,
                () -> ExtraPlanets_Blocks.SATURN_BLOCKS.getDefaultState().withProperty(BlockBasicSaturn.BASIC_TYPE, BlockBasicSaturn.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicSaturn && state.getValue(BlockBasicSaturn.BASIC_TYPE) == BlockBasicSaturn.EnumBlockBasic.STONE, true)

            final StoneType URANUS = new StoneType(getMetaItemId(), "uranus", SoundType.STONE, GTHHOrePrefix.oreUranus, GTHHMaterials.UranusStone,
                () -> ExtraPlanets_Blocks.URANUS_BLOCKS.getDefaultState().withProperty(BlockBasicUranus.BASIC_TYPE, BlockBasicUranus.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicUranus && state.getValue(BlockBasicUranus.BASIC_TYPE) == BlockBasicUranus.EnumBlockBasic.STONE, true)

            final StoneType NEPTUNE = new StoneType(getMetaItemId(), "neptune", SoundType.STONE, GTHHOrePrefix.oreNeptune, GTHHMaterials.NeptuneStone,
                () -> ExtraPlanets_Blocks.NEPTUNE_BLOCKS.getDefaultState().withProperty(BlockBasicNeptune.BASIC_TYPE, BlockBasicNeptune.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicNeptune && state.getValue(BlockBasicNeptune.BASIC_TYPE) == BlockBasicNeptune.EnumBlockBasic.STONE, true)

            final StoneType PLUTO = new StoneType(getMetaItemId(), "pluto", SoundType.STONE, GTHHOrePrefix.orePluto, GTHHMaterials.PlutoStone,
                () -> ExtraPlanets_Blocks.PLUTO_BLOCKS.getDefaultState().withProperty(BlockBasicPluto.BASIC_TYPE, BlockBasicPluto.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicPluto && state.getValue(BlockBasicPluto.BASIC_TYPE) == BlockBasicPluto.EnumBlockBasic.STONE, true)

            final StoneType ERIS = new StoneType(getMetaItemId(), "eris", SoundType.STONE, GTHHOrePrefix.oreEris, GTHHMaterials.ErisStone,
                () -> ExtraPlanets_Blocks.ERIS_BLOCKS.getDefaultState().withProperty(BlockBasicEris.BASIC_TYPE, BlockBasicEris.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicEris && state.getValue(BlockBasicEris.BASIC_TYPE) == BlockBasicEris.EnumBlockBasic.STONE, true)

            final StoneType KEPLER22B = new StoneType(getMetaItemId(), "kepler22b", SoundType.STONE, GTHHOrePrefix.oreKepler22B, GTHHMaterials.Kepler22bStone,
                () -> ExtraPlanets_Blocks.KEPLER22B_BLOCKS.getDefaultState().withProperty(BlockBasicKepler22b.BASIC_TYPE, BlockBasicKepler22b.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicKepler22b && state.getValue(BlockBasicKepler22b.BASIC_TYPE) == BlockBasicKepler22b.EnumBlockBasic.STONE, true)

            final StoneType EUROPA = new StoneType(getMetaItemId(), "europa", SoundType.STONE, GTHHOrePrefix.oreEuropa, GTHHMaterials.EuropaStone,
                () -> ExtraPlanets_Blocks.EUROPA_BLOCKS.getDefaultState().withProperty(BlockBasicEuropa.BASIC_TYPE, BlockBasicEuropa.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicEuropa && state.getValue(BlockBasicEuropa.BASIC_TYPE) == BlockBasicEuropa.EnumBlockBasic.STONE, true)

            final StoneType IO = new StoneType(getMetaItemId(), "io", SoundType.STONE, GTHHOrePrefix.oreIo, GTHHMaterials.IoStone,
                () -> ExtraPlanets_Blocks.IO_BLOCKS.getDefaultState().withProperty(BlockBasicIo.BASIC_TYPE, BlockBasicIo.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicIo && state.getValue(BlockBasicIo.BASIC_TYPE) == BlockBasicIo.EnumBlockBasic.STONE, true)

            final StoneType DEIMOS = new StoneType(getMetaItemId(), "deimos", SoundType.STONE, GTHHOrePrefix.oreDeimos, GTHHMaterials.DeimosStone,
                () -> ExtraPlanets_Blocks.DEIMOS_BLOCKS.getDefaultState().withProperty(BlockBasicDeimos.BASIC_TYPE, BlockBasicDeimos.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicDeimos && state.getValue(BlockBasicDeimos.BASIC_TYPE) == BlockBasicDeimos.EnumBlockBasic.STONE, true)

            final StoneType PHOBOS = new StoneType(getMetaItemId(), "phobos", SoundType.STONE, GTHHOrePrefix.orePhobos, GTHHMaterials.PhobosStone,
                () -> ExtraPlanets_Blocks.PHOBOS_BLOCKS.getDefaultState().withProperty(BlockBasicPhobos.BASIC_TYPE, BlockBasicPhobos.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicPhobos && state.getValue(BlockBasicPhobos.BASIC_TYPE) == BlockBasicPhobos.EnumBlockBasic.STONE, true)

            final StoneType TRITON = new StoneType(getMetaItemId(), "triton", SoundType.STONE, GTHHOrePrefix.oreTriton, GTHHMaterials.TritonStone,
                () -> ExtraPlanets_Blocks.TRITON_BLOCKS.getDefaultState().withProperty(BlockBasicTriton.BASIC_TYPE, BlockBasicTriton.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicTriton && state.getValue(BlockBasicTriton.BASIC_TYPE) == BlockBasicTriton.EnumBlockBasic.STONE, true)

            final StoneType CALLISTO = new StoneType(getMetaItemId(), "callisto", SoundType.STONE, GTHHOrePrefix.oreCallisto, GTHHMaterials.CallistoStone,
                () -> ExtraPlanets_Blocks.CALLISTO_BLOCKS.getDefaultState().withProperty(BlockBasicCallisto.BASIC_TYPE, BlockBasicCallisto.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicCallisto && state.getValue(BlockBasicCallisto.BASIC_TYPE) == BlockBasicCallisto.EnumBlockBasic.STONE, true)

            final StoneType GANYMEDE = new StoneType(getMetaItemId(), "ganymede", SoundType.STONE, GTHHOrePrefix.oreGanymede, GTHHMaterials.GanymedeStone,
                () -> ExtraPlanets_Blocks.GANYMEDE_BLOCKS.getDefaultState().withProperty(BlockBasicGanymede.BASIC_TYPE, BlockBasicGanymede.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicGanymede && state.getValue(BlockBasicGanymede.BASIC_TYPE) == BlockBasicGanymede.EnumBlockBasic.STONE, true)

            final StoneType RHEA = new StoneType(getMetaItemId(), "rhea", SoundType.STONE, GTHHOrePrefix.oreRhea, GTHHMaterials.RheaStone,
                () -> ExtraPlanets_Blocks.RHEA_BLOCKS.getDefaultState().withProperty(BlockBasicRhea.BASIC_TYPE, BlockBasicRhea.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicRhea && state.getValue(BlockBasicRhea.BASIC_TYPE) == BlockBasicRhea.EnumBlockBasic.STONE, true)

            final StoneType TITAN = new StoneType(getMetaItemId(), "titan", SoundType.STONE, GTHHOrePrefix.oreTitan, GTHHMaterials.TitaniaStone,
                () -> ExtraPlanets_Blocks.TITAN_BLOCKS.getDefaultState().withProperty(BlockBasicTitan.BASIC_TYPE, BlockBasicTitan.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicTitan && state.getValue(BlockBasicTitan.BASIC_TYPE) == BlockBasicTitan.EnumBlockBasic.STONE, true)

            final StoneType OBERON = new StoneType(getMetaItemId(), "oberon", SoundType.STONE, GTHHOrePrefix.oreOberon, GTHHMaterials.OberonStone,
                () -> ExtraPlanets_Blocks.OBERON_BLOCKS.getDefaultState().withProperty(BlockBasicOberon.BASIC_TYPE, BlockBasicOberon.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicOberon && state.getValue(BlockBasicOberon.BASIC_TYPE) == BlockBasicOberon.EnumBlockBasic.STONE, true)
                    
            final StoneType TITANIA = new StoneType(getMetaItemId(), "titania", SoundType.STONE, GTHHOrePrefix.oreTitania, GTHHMaterials.TitaniaStone,
                () -> ExtraPlanets_Blocks.TITANIA_BLOCKS.getDefaultState().withProperty(BlockBasicTitania.BASIC_TYPE, BlockBasicTitania.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicTitania && state.getValue(BlockBasicTitania.BASIC_TYPE) == BlockBasicTitania.EnumBlockBasic.STONE, true)
                    
            final StoneType IAPETUS = new StoneType(getMetaItemId(), "iapetus", SoundType.STONE, GTHHOrePrefix.oreIapetus, GTHHMaterials.IapetusStone,
                () -> ExtraPlanets_Blocks.IAPETUS_BLOCKS.getDefaultState().withProperty(BlockBasicIapetus.BASIC_TYPE, BlockBasicIapetus.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicIapetus && state.getValue(BlockBasicIapetus.BASIC_TYPE) == BlockBasicIapetus.EnumBlockBasic.STONE, true)

    }

    private static int getMetaItemId() {
        if (startId < endId){
        return startId++
        }
        throw new ArrayIndexOutOfBoundsException()
    }

}