package materials

import gregtech.api.unification.material.properties.*
import gregtech.api.unification.material.Material
import gregtech.api.GregTechAPI

import materials.GTHHFantasyMaterials
import materials.GTHHFirstDegreeMaterials
import materials.GTHHFluidMaterials
import materials.GTHHOreMaterials
import materials.GTHHSecondDegreeMaterials

import material.GTHHOrePrefix

import static gregtech.api.unification.material.info.MaterialIconSet.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.Materials.*

class GTHHMaterials {
    
    //Fantasy Materials
    static Material CosmicNeutronium
    static Material InfinityCatalyst
    static Material Infinity
    static Material Multiversium
    static Material Infernorite
    static Material Crynorium

    //First Degree Materials
    static Material Sand

    //Fluid Materials
    static Material DirtyPreciousMetalSolution
    static Material DilutePreciousMetalSolution
    static Material CleanPreciousMetalSolution
    static Material ConcentratedPreciousMetalSolution
    static Material CoalSlurry
    static Material Coolant
    static Material SpaceCoolant
    static Material PhotovoltaicComposite

    //Ore Materials
    static Material Albite
    static Material Anorthite
    static Material Plagioclase
    static Material Pyroxene
    static Material Moon
    static Material Carbonate
    static Material AmmoniatedSilicate
    static Material Ceres
    static Material Pluto
    static Material PreciousMetals
    static Material Cryolite
    static Material SolarGradeSilicon
    
    //Second Degree Materials
    static Material VividAlloy
    static Material VibrantAlloy
    static Material StellarAlloy
    static Material Soularium
    static Material RedstoneAlloy
    static Material PulsatingIron
    static Material MelodicAlloy
    static Material EnergeticSilver
    static Material EnergeticAlloy
    static Material EndSteel
    static Material ElectricalSteel
    static Material DarkSteel
    static Material CrystallinePinkSlime
    static Material CrystallineAlloy
    static Material CrudeSteel
    static Material ConductiveIron
    static Material WeatherCrystal
    static Material SandCompound
    static Material Pyrotheum
    static Material Cryotheum

    static void init() {

        GTHHFantasyMaterials.register()
        // GTHHFirstDegreeMaterials.register() Currently Empty
        GTHHFluidMaterials.register()
        GTHHOreMaterials.register()
        GTHHSecondDegreeMaterials.register()
        GTHHOrePrefix.init()

    }

}