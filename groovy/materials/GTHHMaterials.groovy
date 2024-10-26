package materials

import gregtech.api.unification.material.properties.*
import gregtech.api.unification.material.Material
import gregtech.api.GregTechAPI

import materials.GTHHFantasyMaterials
import materials.GTHHFluidMaterials
import materials.GTHHOreMaterials
import materials.GTHHSecondDegreeMaterials
import materials.GTHHThirdDegreeMaterials

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
    static Material Carbonate
    static Material AmmoniatedSilicate
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
    static Material MoonStone
    static Material MarsStone
    static Material AsteroidStone
    static Material VenusStone
    static Material MercuryStone
    static Material CeresStone
    static Material JupiterStone
    static Material SaturnStone
    static Material UranusStone
    static Material NeptuneStone
    static Material PlutoStone
    static Material ErisStone
    static Material Kepler22bStone
    static Material EuropaStone
    static Material IoStone
    static Material DeimosStone
    static Material PhobosStone
    static Material TritonStone
    static Material CallistoStone
    static Material GanymedeStone
    static Material RheaStone
    static Material TitanStone
    static Material OberonStone
    static Material TitaniaStone
    static Material IapetusStone

    //Third Degree Materials
    static Material Sand
    static Material SilverGallium
    static Material Tantaloper
    static Material Zinvar
    static Material SterlingPlatinum
    static Material Mytryl
    static Material CosmicCarbon
    static Material Tetrapech

    static void changeFormula() {

        log.infoMC("Changing Formulas!")
        // Fantasy Material Formulas

        // Fluid Material Formulas
        DirtyPreciousMetalSolution.setFormula('(Au?Ag?)((HNO3)(HCl))', true)
        DilutePreciousMetalSolution.setFormula('(Au?Ag?)((HNO3)(HCl))(H2O)', true)
        CleanPreciousMetalSolution.setFormula('(Au)(Ag)((HNO3)(HCl))(H2O)', true)
        ConcentratedPreciousMetalSolution.setFormula('(Au)(Ag)((HNO3)(HCl))', true)

        // Ore Material Formulas
        PreciousMetals.setFormula('Au?Ag?Cu?', true)
        Plagioclase.setFormula('((NaAlSi3O8)(CaAl2Si2O8))', true)
        SolarGradeSilicon.setFormula('*Si*', true)

        // Second Degree Material Formulas
        ElectricalSteel.setFormula("(Fe99C)Si", true)
        ConductiveIron.setFormula("(((Fe99C)Si)4(Si(FeS2)5(CrAl2O3)Hg3)Si)4(Fe99C)(Si(FeS2)5(CrAl2O3)Hg3)", true)
        PulsatingIron.setFormula("(Fe99C)(BeK4N5)", true)
        DarkSteel.setFormula("(Fe99C)(MgFeSi2O4)",true)
        Soularium.setFormula("(AgAu)?", true)
        EndSteel.setFormula("((Fe99C)(MgFeSi2O4))?", true)
        CrudeSteel.setFormula("(Na2LiAl2Si2(H2O)6)??", true)
        CrystallineAlloy.setFormula("((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))?", true)
        MelodicAlloy.setFormula("((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))?", true)
        CrystallinePinkSlime.setFormula("((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))(((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))?)((Fe99C)(MgFeSi2O4)?)(((Au(Si(FeS2)5(CrAl2O3)Hg3)?)(BeK4N5))?)", true)

        // Third Degree Material Formulas
        Mytryl.setFormula("SpC9Cu4Ag3Ga", true)
        CosmicCarbon.setFormula("SpC", true)

    }
    static void init() {

        GTHHFantasyMaterials.register()
        GTHHFluidMaterials.register()
        GTHHOreMaterials.register()
        GTHHSecondDegreeMaterials.register()
        GTHHThirdDegreeMaterials.register()
        GTHHOrePrefix.init()
        changeFormula()

    }

}