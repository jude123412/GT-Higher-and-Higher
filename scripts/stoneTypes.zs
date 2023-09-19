#priority 1001

#loader gregtech

import mods.gregtech.StoneType;
import mods.gregtech.material.MaterialBuilder;

val holyStone = MaterialBuilder(32200, "holystone")
    .dust(1)
    .build();

val blockStateHolystone = "aether_legacy:holystone:aether_legacy_double_drops=true";

StoneType.create(16, "holystone", "oreHolystone", holyStone, blockStateHolystone);
