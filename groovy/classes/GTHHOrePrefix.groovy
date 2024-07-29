package classes

import gregtech.api.unification.material.info.MaterialIconType
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.stack.MaterialStack

import materials.GTHHMaterials

class GTHHOrePrefix {

    static OrePrefix oreMoon = new OrePrefix("oreMoon", -1, null, MaterialIconType.ore, OrePrefix.Flags.ENABLE_UNIFICATION, OrePrefix.Conditions.hasOreProperty)
    static OrePrefix oreCeres = new OrePrefix("oreCeres", -1, null, MaterialIconType.ore, OrePrefix.Flags.ENABLE_UNIFICATION, OrePrefix.Conditions.hasOreProperty)
    static OrePrefix orePluto = new OrePrefix("orePluto", -1, null, MaterialIconType.ore, OrePrefix.Flags.ENABLE_UNIFICATION, OrePrefix.Conditions.hasOreProperty)


    static void init() {
        oreMoon.addSecondaryMaterial(new MaterialStack(GTHHMaterials.Moon, OrePrefix.dust.materialAmount))
        oreCeres.addSecondaryMaterial(new MaterialStack(GTHHMaterials.Ceres, OrePrefix.dust.materialAmount))
        orePluto.addSecondaryMaterial(new MaterialStack(GTHHMaterials.Pluto, OrePrefix.dust.materialAmount))
    }
    
}
