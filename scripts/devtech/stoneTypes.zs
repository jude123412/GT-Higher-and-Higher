    #priority 1000

    #loader gregtech

    import mods.gregtech.StoneType;
    import mods.gregtech.material.MaterialBuilder;
    import mods.gregtech.material.Material;

        val holyStone = MaterialBuilder(32200, "holystone")
            .dust(1)
            .components([<material:hydrogen> * 2, <material:aluminium> * 1, <material:fluorine> * 1, <material:carbon> * 1])
            .build();
        val moonDirt = MaterialBuilder(32201, "moondirt")
            .dust(1)
            .components([<material:silicon> * 1, <material:aluminium> * 2, <material:calcium> * 1, <material:magnesium> * 1, <material:titanium> * 1, <material:iron> * 1, <material:oxygen> * 9])
            .build();
        val moonRock = MaterialBuilder(32202, "moonrock")
            .dust(1)
            .components([<material:helium_3> * 4, <material:olivine> * 3, <material:potassium_feldspar> * 1, <material:ilmenite> * 2])
            .build();
        val minecraftDirt = MaterialBuilder(32203, "dirt")
            .dust(1)
            .build();
        val twilightRoot = MaterialBuilder(32204, "root")
            .dust(1)
            .components([<material:carbon> * 6, <material:hydrogen> * 12, <material:oxygen> * 6, <material:calcium> * 1])
            .build();
        val minecraftGravel = MaterialBuilder(32205, "gravel")
            .dust(1)
            .build();


        val blockStateHolystone = "aether_legacy:holystone:aether_legacy_double_drops=true";
        val blockStateMoonDirt = "galacticraftcore:basic_block_moon:basictypemoon=moon_dirt_moon";
        val blockStateMoonRock = "galacticraftcore:basic_block_moon:basictypemoon=moon_stone";
        val blockStateDirt="minecraft:dirt:variant=dirt";
        val blockStateRoot="twilightforest:root:variant=root";
        val blockStateGravel="minecraft:gravel";

        StoneType.create(16, "holystone", "oreHolystone", holyStone, blockStateHolystone, null, true);
        StoneType.create(17, "moondirt", "oreMoonDirt", moonDirt, blockStateMoonDirt);
        StoneType.create(18, "moonrock", "oreMoonRock", moonRock, blockStateMoonRock);
        StoneType.create(19, "dirt", "oreDirt", minecraftDirt, blockStateDirt);
        StoneType.create(20, "root", "oreRoot", twilightRoot, blockStateRoot);
        StoneType.create(21, "gravel", "oreGravel", minecraftGravel, blockStateGravel, null, true);