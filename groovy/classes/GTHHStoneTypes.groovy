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
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.AsteroidBlocks
import micdoodle8.mods.galacticraft.planets.asteroids.blocks.BlockBasicAsteroids
import micdoodle8.mods.galacticraft.planets.mars.blocks.BlockBasicMars
import micdoodle8.mods.galacticraft.planets.mars.blocks.MarsBlocks

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

            final StoneType MOON = new StoneType(getMetaItemId(), "moon", SoundType.STONE, GTHHOrePrefix.oreMoon, GTHHMaterials.Moon,
                () -> GCBlocks.blockMoon.getDefaultState().withProperty(BlockBasicMoon.BASIC_TYPE_MOON, BlockBasicMoon.EnumBlockBasicMoon.MOON_STONE),
                    (state) -> state.getBlock() instanceof BlockBasicMoon && state.getValue(BlockBasicMoon.BASIC_TYPE_MOON) == BlockBasicMoon.EnumBlockBasicMoon.MOON_STONE, true)

            final StoneType CERES = new StoneType(getMetaItemId(), "ceres", SoundType.STONE, GTHHOrePrefix.oreCeres, GTHHMaterials.Ceres,
                () -> ExtraPlanets_Blocks.CERES_BLOCKS.getDefaultState().withProperty(BlockBasicCeres.BASIC_TYPE, BlockBasicCeres.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicCeres && state.getValue(BlockBasicCeres.BASIC_TYPE) == BlockBasicCeres.EnumBlockBasic.STONE, true)

            final StoneType PLUTO = new StoneType(getMetaItemId(), "pluto", SoundType.STONE, GTHHOrePrefix.orePluto, GTHHMaterials.Pluto,
                () -> ExtraPlanets_Blocks.PLUTO_BLOCKS.getDefaultState().withProperty(BlockBasicPluto.BASIC_TYPE, BlockBasicPluto.EnumBlockBasic.STONE),
                    (state) -> state.getBlock() instanceof BlockBasicPluto && state.getValue(BlockBasicPluto.BASIC_TYPE) == BlockBasicPluto.EnumBlockBasic.STONE, true)

    }

    private static int getMetaItemId() {
        if (startId < endId){
        return startId++
        }
        throw new ArrayIndexOutOfBoundsException()
    }

}