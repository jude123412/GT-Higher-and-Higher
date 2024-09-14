package material

import gregtech.api.unification.material.info.MaterialIconType
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.stack.MaterialStack

import gregtech.common.items.MetaItems

import materials.GTHHMaterials

import material.GTHHMaterialIconType

import static gregtech.api.unification.material.Materials.*

class GTHHOrePrefix {

    static OrePrefix oreMoon = new OrePrefix("oreMoon", -1, null, MaterialIconType.ore, OrePrefix.Flags.ENABLE_UNIFICATION, OrePrefix.Conditions.hasOreProperty)
    static OrePrefix oreCeres = new OrePrefix("oreCeres", -1, null, MaterialIconType.ore, OrePrefix.Flags.ENABLE_UNIFICATION, OrePrefix.Conditions.hasOreProperty)
    static OrePrefix orePluto = new OrePrefix("orePluto", -1, null, MaterialIconType.ore, OrePrefix.Flags.ENABLE_UNIFICATION, OrePrefix.Conditions.hasOreProperty)

    static OrePrefix cluster = new OrePrefix("cluster", -1, null, GTHHMaterialIconType.cluster, OrePrefix.Flags.ENABLE_UNIFICATION, OrePrefix.Conditions.hasOreProperty)

    static void init() {

        OrePrefix orePrefixPlate = OrePrefix.getPrefix("plate")
        OrePrefix orePrefixIngot = OrePrefix.getPrefix("ingot")
        OrePrefix orePrefixNugget = OrePrefix.getPrefix("nugget")
        OrePrefix orePrefixBlock = OrePrefix.getPrefix("block")
        OrePrefix orePrefixDust = OrePrefix.getPrefix("dust")

        orePrefixPlate.removeIgnored(BorosilicateGlass)

        orePrefixIngot.setIgnored(GTHHMaterials.ElectricalSteel)
        orePrefixIngot.setIgnored(GTHHMaterials.EnergeticAlloy)
        orePrefixIngot.setIgnored(GTHHMaterials.VibrantAlloy)
        orePrefixIngot.setIgnored(GTHHMaterials.RedstoneAlloy)
        orePrefixIngot.setIgnored(GTHHMaterials.ConductiveIron)
        orePrefixIngot.setIgnored(GTHHMaterials.PulsatingIron)
        orePrefixIngot.setIgnored(GTHHMaterials.DarkSteel)
        orePrefixIngot.setIgnored(GTHHMaterials.Soularium)
        orePrefixIngot.setIgnored(GTHHMaterials.EndSteel)
        orePrefixIngot.setIgnored(GTHHMaterials.CrudeSteel)
        orePrefixIngot.setIgnored(GTHHMaterials.CrystallineAlloy)
        orePrefixIngot.setIgnored(GTHHMaterials.MelodicAlloy)
        orePrefixIngot.setIgnored(GTHHMaterials.CrystallinePinkSlime)
        orePrefixIngot.setIgnored(GTHHMaterials.EnergeticSilver)
        orePrefixIngot.setIgnored(GTHHMaterials.VividAlloy)
        orePrefixIngot.setIgnored(GTHHMaterials.StellarAlloy)

        orePrefixNugget.setIgnored(GTHHMaterials.ElectricalSteel)
        orePrefixNugget.setIgnored(GTHHMaterials.EnergeticAlloy)
        orePrefixNugget.setIgnored(GTHHMaterials.VibrantAlloy)
        orePrefixNugget.setIgnored(GTHHMaterials.RedstoneAlloy)
        orePrefixNugget.setIgnored(GTHHMaterials.ConductiveIron)
        orePrefixNugget.setIgnored(GTHHMaterials.PulsatingIron)
        orePrefixNugget.setIgnored(GTHHMaterials.DarkSteel)
        orePrefixNugget.setIgnored(GTHHMaterials.Soularium)
        orePrefixNugget.setIgnored(GTHHMaterials.EndSteel)
        orePrefixNugget.setIgnored(GTHHMaterials.CrudeSteel)
        orePrefixNugget.setIgnored(GTHHMaterials.CrystallineAlloy)
        orePrefixNugget.setIgnored(GTHHMaterials.MelodicAlloy)
        orePrefixNugget.setIgnored(GTHHMaterials.CrystallinePinkSlime)
        orePrefixNugget.setIgnored(GTHHMaterials.EnergeticSilver)
        orePrefixNugget.setIgnored(GTHHMaterials.VividAlloy)
        orePrefixNugget.setIgnored(GTHHMaterials.ElectricalSteel)
        orePrefixNugget.setIgnored(GTHHMaterials.StellarAlloy)

        orePrefixBlock.setIgnored(GTHHMaterials.ElectricalSteel)
        orePrefixBlock.setIgnored(GTHHMaterials.EnergeticAlloy)
        orePrefixBlock.setIgnored(GTHHMaterials.VibrantAlloy)
        orePrefixBlock.setIgnored(GTHHMaterials.RedstoneAlloy)
        orePrefixBlock.setIgnored(GTHHMaterials.ConductiveIron)
        orePrefixBlock.setIgnored(GTHHMaterials.PulsatingIron)
        orePrefixBlock.setIgnored(GTHHMaterials.DarkSteel)
        orePrefixBlock.setIgnored(GTHHMaterials.Soularium)
        orePrefixBlock.setIgnored(GTHHMaterials.EndSteel)
        orePrefixBlock.setIgnored(GTHHMaterials.CrudeSteel)
        orePrefixBlock.setIgnored(GTHHMaterials.CrystallineAlloy)
        orePrefixBlock.setIgnored(GTHHMaterials.MelodicAlloy)
        orePrefixBlock.setIgnored(GTHHMaterials.CrystallinePinkSlime)
        orePrefixBlock.setIgnored(GTHHMaterials.EnergeticSilver)
        orePrefixBlock.setIgnored(GTHHMaterials.VividAlloy)
        orePrefixBlock.setIgnored(GTHHMaterials.StellarAlloy)

        orePrefixDust.setIgnored(GTHHMaterials.Soularium)

        oreMoon.addSecondaryMaterial(new MaterialStack(GTHHMaterials.Moon, OrePrefix.dust.materialAmount))
        oreCeres.addSecondaryMaterial(new MaterialStack(GTHHMaterials.Ceres, OrePrefix.dust.materialAmount))
        orePluto.addSecondaryMaterial(new MaterialStack(GTHHMaterials.Pluto, OrePrefix.dust.materialAmount))

        MetaItems.addOrePrefix(GTHHOrePrefix.cluster)

    }
    
}
