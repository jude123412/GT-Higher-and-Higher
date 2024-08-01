package materials
import gregtech.api.unification.material.properties.*
import gregtech.api.unification.material.Material
import gregtech.api.GregTechAPI

import classes.GTHHOrePrefix

import static gregtech.api.unification.material.info.MaterialIconSet.*
import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.Materials.*

import static materials.GTHHSecondDegreeMaterials.*
import static materials.GTHHOreMaterials.*
import static materials.GTHHOreRecipeHandler.*



class GTHHMaterials {
    
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

    //Fantasy Materials
    static Material CosmicNeutronium
    static Material InfinityCatalyst
    static Material Infinity
    
    //Second Degree Materials
    static Material DirtyPreciousMetalSolution
    static Material DilutePreciousMetalSolution
    static Material CleanPreciousMetalSolution
    static Material ConcentratedPreciousMetalSolution

    static void init() {

        GTHHSecondDegreeMaterials.register()
        GTHHFantasyMaterials.register()
        GTHHOreMaterials.register()
        GTHHOreRecipeHandler.register()
        GTHHOrePrefix.init()

    }

}