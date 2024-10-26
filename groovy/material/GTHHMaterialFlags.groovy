package material

import net.minecraftforge.fml.common.eventhandler.EventPriority

import gregtech.api.unification.material.Material
import gregtech.api.GregTechAPI
import gregtech.api.unification.ore.OrePrefix
import gregtech.api.unification.material.info.MaterialFlag
import gregtech.api.unification.material.info.MaterialFlags
import gregtech.api.unification.material.properties.*
import gregtech.api.unification.material.properties.OreProperty
import gregtech.api.unification.material.properties.PropertyKey
import gregtech.api.unification.material.properties.BlastProperty
import gregtech.api.unification.material.properties.BlastProperty.GasTier
import gregtech.api.recipes.RecipeMap
import gregtech.api.recipes.RecipeMaps

import static materials.GTHHMaterials.*

import static gregtech.api.unification.material.info.MaterialFlags.*
import static gregtech.api.unification.material.Materials.*

class GTHHMaterialFlags {

    static final MaterialFlag GENERATE_RAW = new MaterialFlag.Builder("generate_raw").build()

    static void init() { 

        RecipeMaps.THERMAL_CENTRIFUGE_RECIPES.setMaxFluidInputs(3)
        RecipeMaps.THERMAL_CENTRIFUGE_RECIPES.setMaxFluidOutputs(3)
        RecipeMaps.SIFTER_RECIPES.setMaxFluidInputs(3)
        RecipeMaps.SIFTER_RECIPES.setMaxFluidOutputs(3)
        RecipeMaps.FLUID_HEATER_RECIPES.setMaxFluidOutputs(3)
        RecipeMaps.MIXER_RECIPES.setMaxInputs(9)
        RecipeMaps.FLUID_SOLIDFICATION_RECIPES.setMaxInputs(2)
        RecipeMaps.IMPLOSION_RECIPES.setMaxInputs(6)
        RecipeMaps.IMPLOSION_RECIPES.setMaxFluidInputs(3)
        RecipeMaps.CHEMICAL_RECIPES.setMaxInputs(3)


        BorosilicateGlass.addOre()

        Steel.setFormula("Fe99C", true)

        CobaltOxide.setProperty(PropertyKey.ORE, new OreProperty())
        CobaltOxide.setProperty(PropertyKey.INGOT, new IngotProperty())
        CobaltOxide.setFormula("Co3O4", true)
        CobaltOxide.addFlags("disable_decomposition")

        BlueAlloy.addFlags("generate_foil", "generate_fine_wire")

        RoseGold.addFlags("generate_foil", "generate_fine_wire")

        BorosilicateGlass.addFlags("generate_plate", "no_smashing")

        Glass.addFlags("generate_fine_wire")

        Iron.addFlags("generate_fine_wire")

        Aluminium.addFlags("generate_raw")

        GalliumArsenide.addFlags("generate_raw")

        Neutronium.setProperty(PropertyKey.BLAST, new BlastProperty(6920, GasTier.LOW, 491520, 4800, -1, -1))
        Neutronium.addFlags("generate_raw")


        OreProperty orePropCopper = Copper.getProperty(PropertyKey.ORE)
        orePropCopper.getOreByProducts().clear()
        orePropCopper.setOreByProducts(Cobalt, PreciousMetals, Nickel, PreciousMetals)

        OreProperty orePropGold = Gold.getProperty(PropertyKey.ORE)
        orePropGold.getOreByProducts().clear()
        orePropGold.setOreByProducts(PreciousMetals, Nickel, PreciousMetals)

        OreProperty orePropIron = Iron.getProperty(PropertyKey.ORE)
        orePropIron.getOreByProducts().clear()
        orePropIron.setOreByProducts(Nickel, Tin, Tin, PreciousMetals)

        OreProperty orePropSilver = Silver.getProperty(PropertyKey.ORE)
        orePropSilver.getOreByProducts().clear()
        orePropSilver.setOreByProducts(Lead, Sulfur, Sulfur, PreciousMetals)

        OreProperty orePropChalcopyrite = Chalcopyrite.getProperty(PropertyKey.ORE)
        orePropChalcopyrite.getOreByProducts().clear()
        orePropChalcopyrite.setOreByProducts(Pyrite, Cobalt, Cadmium, PreciousMetals)

        // OreProperty orePropElectrum = Electrum.getProperty(PropertyKey.ORE)
        // orePropElectrum.getOreByProducts().clear()
        // orePropElectrum.setOreByProducts(PreciousMetals, PreciousMetals, PreciousMetals)

        OreProperty orePropMagnetite = Magnetite.getProperty(PropertyKey.ORE)
        orePropMagnetite.getOreByProducts().clear()
        orePropMagnetite.getSeparatedInto().clear()
        orePropMagnetite.setOreByProducts(Iron, PreciousMetals)

        OreProperty orePropBornite = Bornite.getProperty(PropertyKey.ORE);
        orePropBornite.getOreByProducts().clear()
        orePropBornite.setOreByProducts(Pyrite, Cobalt, Cadmium, PreciousMetals);

        OreProperty orePropVanadiumMagnetite = VanadiumMagnetite.getProperty(PropertyKey.ORE);
        orePropVanadiumMagnetite.getOreByProducts().clear()
        orePropVanadiumMagnetite.getSeparatedInto().clear()
        orePropVanadiumMagnetite.setOreByProducts(Magnetite, Magnetite, Vanadium)
        orePropVanadiumMagnetite.setSeparatedInto(PreciousMetals)

        OreProperty orePropGraniticMineralSand = GraniticMineralSand.getProperty(PropertyKey.ORE);
        orePropGraniticMineralSand.getOreByProducts().clear()
        orePropGraniticMineralSand.getSeparatedInto().clear()
        orePropGraniticMineralSand.setOreByProducts(GraniteBlack, Magnetite);
        orePropGraniticMineralSand.setSeparatedInto(PreciousMetals);

        OreProperty orePropBasalticMineralSand = BasalticMineralSand.getProperty(PropertyKey.ORE);
        orePropBasalticMineralSand.getOreByProducts().clear()
        orePropBasalticMineralSand.getSeparatedInto().clear()
        orePropBasalticMineralSand.setOreByProducts(Basalt, Magnetite);
        orePropBasalticMineralSand.setSeparatedInto(PreciousMetals)

    }

}