log.infoMC("Changing EnderIO Equipment Recipes...")

//Conduit Probe
crafting.removeByOutput(item('enderio:item_conduit_probe'))
crafting.addShaped(item('enderio:item_conduit_probe') * 1, [
    [ore('boltElectricalSteel'), ore('craftingToolHardHammer'), ore('boltElectricalSteel')],
    [ore('plateElectricalSteel'), ore('circuitLv'), ore('plateElectricalSteel')],
    [ore('plateElectricalSteel'), ore('dustBedrock'), ore('plateElectricalSteel')]
])

//Yeta Wrench
crafting.removeByOutput(item('enderio:item_yeta_wrench'))
crafting.addShaped(item('enderio:item_yeta_wrench'), [
    [ore('plateElectricalSteel'), ore('circuitLv'), ore('plateElectricalSteel')],
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')],
    [ore('craftingToolHardHammer'), ore('plateElectricalSteel'), ore('craftingToolScrewdriver')]
])
//Cold Fire Igniter
crafting.removeByOutput(item('enderio:item_cold_fire_igniter'))
crafting.addShaped(item('enderio:item_cold_fire_igniter'), [
    [null, ore('gearSmallDarkSteel'), null],
    [null, ore('gemFlint'), null],
    [null, ore('springSmallDarkSteel'), null]
])

//Coordinate Selector
crafting.removeByOutput(item('enderio:item_coord_selector'))
crafting.addShaped(item('enderio:item_coord_selector'), [
    [metaitem('sensor.mv'), ore('circuitMv'), ore('plateDoubleDarkSteel')],
    [null, ore('boltDarkSteel'), ore('plateDoubleDarkSteel')],
    [null, ore('craftingToolHardHammer'), ore('plateDarkSteel')]
])

//Staff of Travelling
crafting.removeByOutput(item('enderio:item_travel_staff').withNbt(['enderio.darksteel.upgrade.energyUpgrade': ['level': 0]]))
crafting.addShaped(item('enderio:item_travel_staff').withNbt(['enderio.darksteel.upgrade.energyUpgrade': ['level': 0]]), [
    [ore('craftingToolFile'), ore('plateDarkSteel'), ore('itemEnderCrystal')],
    [ore('plateDarkSteel'), ore('circuitHv'), ore('plateDarkSteel')],
    [ore('itemInfinityRod'), ore('plateDarkSteel'), ore('craftingToolHardHammer')]
])

//Staff of Return
crafting.removeByOutput(item('enderio:item_rod_of_return'))
crafting.addShaped(item('enderio:item_rod_of_return'), [
    [ore('craftingToolFile'), ore('itemPulsatingCrystal'), ore('itemEnderCrystal')],
    [ore('plateDarkSteel'), ore('circuitHv'), ore('itemPulsatingCrystal')],
    [ore('itemInfinityRod'), ore('plateDarkSteel'), ore('craftingToolHardHammer')]
])

//Electromagnet
crafting.removeByOutput(item('enderio:item_magnet'))
crafting.addShaped(item('enderio:item_magnet'), [
    [ore('plateRedstoneAlloy'), ore('itemVibrantCrystal'), ore('plateRedstoneAlloy')],
    [ore('plateRedstoneAlloy'), metaitem('battery.re.lv.cadmium'), ore('plateRedstoneAlloy')],
    [ore('ingotSteelMagnetic'), ore('craftingToolHardHammer'), ore('ingotSteelMagnetic')]
])

//Dark Helm
crafting.removeByOutput(item('enderio:item_dark_steel_helmet'))
crafting.addShaped(item('enderio:item_dark_steel_helmet'), [
    [null, null, null],
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('craftingToolHardHammer'), ore('plateDarkSteel')]
])

//Dark Plate
crafting.removeByOutput(item('enderio:item_dark_steel_chestplate'))
crafting.addShaped(item('enderio:item_dark_steel_chestplate'), [
    [ore('plateDarkSteel'), ore('craftingToolHardHammer'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('plateDarkSteel')]
])

//Dark Leggings
crafting.removeByOutput(item('enderio:item_dark_steel_leggings'))
crafting.addShaped(item('enderio:item_dark_steel_leggings'), [
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('craftingToolHardHammer'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), null, ore('plateDarkSteel')]
])

//Dark boots
crafting.removeByOutput(item('enderio:item_dark_steel_boots'))
crafting.addShaped(item('enderio:item_dark_steel_boots'), [
    [null, null, null],
    [ore('plateDarkSteel'), null, ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('craftingToolHardHammer'), ore('plateDarkSteel')]
])

//Dark Shield
crafting.removeByOutput(item('enderio:item_dark_steel_shield'))
crafting.addShaped(item('enderio:item_dark_steel_shield'), [
    [ore('boltDarkSteel'), ore('stickDarkSteel'), ore('boltDarkSteel')],
    [ore('stickLongDarkSteel'), ore('plateDarkSteel'), ore('stickLongDarkSteel')],
    [ore('boltDarkSteel'), ore('stickDarkSteel'), ore('boltDarkSteel')]
])
//The Ender
crafting.removeByOutput(item('enderio:item_dark_steel_sword'))
crafting.addShaped(item('enderio:item_dark_steel_sword'), [
    [null, ore('plateDarkSteel'), null],
    [ore('craftingToolHardHammer'), ore('plateDarkSteel'), ore('craftingToolFile')],
    [null, ore('itemNutritiousStick'), null]
])

//Dark Pick
crafting.removeByOutput(item('enderio:item_dark_steel_pickaxe'))
crafting.addShaped(item('enderio:item_dark_steel_pickaxe'), [
    [ore('plateDarkSteel'), ore('ingotDarkSteel'), ore('ingotDarkSteel')],
    [ore('craftingToolHardHammer'), ore('itemNutritiousStick'), ore('craftingToolFile')],
    [null, ore('itemNutritiousStick'), null]
])

//Dark Axe
crafting.removeByOutput(item('enderio:item_dark_steel_axe'))
crafting.addShaped(item('enderio:item_dark_steel_axe'), [
    [ore('plateDarkSteel'), ore('ingotDarkSteel'), ore('craftingToolFile')],
    [ore('plateDarkSteel'), ore('itemNutritiousStick'), null],
    [ore('craftingToolHardHammer'), ore('itemNutritiousStick'), null]
])

//Dark Bow
crafting.removeByOutput(item('enderio:item_dark_steel_bow'))
crafting.addShaped(item('enderio:item_dark_steel_bow'), [
    [ore('craftingToolSaw'), ore('itemNutritiousStick'), ore('string')],
    [ore('skullSkeletalContractor'), ore('ringDarkSteel'), ore('string')],
    [ore('craftingToolSoftHammer'), ore('itemNutritiousStick'), ore('string')]
])

//Dark Shears
crafting.removeByOutput(item('enderio:item_dark_steel_shears'))
crafting.addShaped(item('enderio:item_dark_steel_shears'), [
    [ore('plateDarkSteel'), ore('screwDarkSteel'), ore('plateDarkSteel')],
    [ore('craftingToolHardHammer'), ore('ringDarkSteel'), ore('craftingToolFile')],
    [ore('itemNutritiousStick'), ore('craftingToolScrewdriver'), ore('itemNutritiousStick')]
])

//Dark Crook
crafting.removeByOutput(item('enderio:item_dark_steel_crook'))
crafting.addShaped(item('enderio:item_dark_steel_crook'), [
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('itemNutritiousStick')],
    [ore('craftingToolHardHammer'), ore('itemNutritiousStick'), ore('craftingToolFile')],
    [ore('itemNutritiousStick'), null, null]
])

//Dark Backhoe
crafting.removeByOutput(item('enderio:item_dark_steel_hand'))
crafting.addShaped(item('enderio:item_dark_steel_hand'), [
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('itemNutritiousStick')],
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('itemNutritiousStick')],
    [ore('craftingToolHardHammer'), ore('craftingToolFile'), ore('itemNutritiousStick')]
])

//Simple Inventory Charger
crafting.removeByOutput(item('enderio:item_inventory_charger_simple'))
crafting.addShaped(item('enderio:item_inventory_charger_simple'), [
    [ore('screwDarkSteel'), ore('itemWirelessDish'), ore('screwDarkSteel')],
    [ore('plateConductiveIron'), ore('batteryLv'), ore('plateConductiveIron')],
    [ore('screwDarkSteel'), ore('capacitorPrimative'), ore('screwDarkSteel')]
])

//Basic Inventory Charger
crafting.removeByOutput(item('enderio:item_inventory_charger_basic'))
crafting.addShaped(item('enderio:item_inventory_charger_basic'), [
    [ore('screwDarkSteel'), ore('itemWirelessDish'), ore('screwDarkSteel')],
    [ore('plateEnergeticAlloy'), ore('batteryMv'), ore('plateEnergeticAlloy')],
    [ore('screwDarkSteel'), ore('capacitorBasic'), ore('screwDarkSteel')]
])

//Inventory Charger
crafting.removeByOutput(item('enderio:item_inventory_charger'))
crafting.addShaped(item('enderio:item_inventory_charger'), [
    [ore('screwDarkSteel'), item('enderio:block_normal_wireless_charger'), ore('screwDarkSteel')],
    [ore('plateVibrantAlloy'), ore('batteryHv'), ore('plateVibrantAlloy')],
    [ore('screwDarkSteel'), ore('capacitorIntegrated'), ore('screwDarkSteel')]
])

//Vibrant Inventory Charger
crafting.removeByOutput(item('enderio:item_inventory_charger_vibrant'))
crafting.addShaped(item('enderio:item_inventory_charger_vibrant'), [
    [ore('screwDarkSteel'), item('enderio:block_enhanced_wireless_charger'), ore('screwDarkSteel')],
    [ore('plateMelodicAlloy'), ore('batteryEv'), ore('plateMelodicAlloy')],
    [ore('screwDarkSteel'), ore('capacitorAdvanced'), ore('screwDarkSteel')]
])

//The Ender Mk2
crafting.removeByOutput(item('enderio:item_end_steel_sword'))
crafting.addShaped(item('enderio:item_end_steel_sword'), [
    [null, ore('plateEndSteel'), null],
    [ore('craftingToolHardHammer'), ore('plateEndSteel'), ore('craftingToolFile')],
    [null, ore('itemInfinityRod'), null]
])

//Ender Pickaxe
crafting.removeByOutput(item('enderio:item_end_steel_pickaxe'))
crafting.addShaped(item('enderio:item_end_steel_pickaxe'), [
    [ore('plateEndSteel'), ore('ingotEndSteel'), ore('ingotEndSteel')],
    [ore('craftingToolHardHammer'), ore('itemInfinityRod'), ore('craftingToolFile')],
    [null, ore('itemInfinityRod'), null]
])

//Ender Axe
crafting.removeByOutput(item('enderio:item_end_steel_axe'))
crafting.addShaped(item('enderio:item_end_steel_axe'), [
    [ore('plateEndSteel'), ore('ingotEndSteel'), ore('craftingToolFile')],
    [ore('plateEndSteel'), ore('itemInfinityRod'), null],
    [ore('craftingToolHardHammer'), ore('itemInfinityRod'), null]
])

//Ender Bow
crafting.removeByOutput(item('enderio:item_end_steel_bow'))
crafting.addShaped(item('enderio:item_end_steel_bow'), [
    [ore('craftingToolFile'), ore('itemInfinityRod'), ore('string')],
    [ore('skullSkeletalContractor'), ore('ringEndSteel'), ore('string')],
    [ore('craftingToolHardHammer'), ore('itemInfinityRod'), ore('string')]
])

//Ender Helm
crafting.removeByOutput(item('enderio:item_end_steel_helmet'))
crafting.addShaped(item('enderio:item_end_steel_helmet'), [
    [ore('plateEndSteel'), ore('skullGuardianDiode'), ore('plateEndSteel')],
    [ore('plateEndSteel'), ore('craftingToolHardHammer'), ore('plateEndSteel')],
    [null, null, null]
])

//Ender Plate
crafting.removeByOutput(item('enderio:item_end_steel_chestplate'))
crafting.addShaped(item('enderio:item_end_steel_chestplate'), [
    [ore('plateEndSteel'), ore('craftingToolHardHammer'), ore('plateEndSteel')],
    [ore('plateEndSteel'), ore('skullGuardianDiode'), ore('plateEndSteel')],
    [ore('plateEndSteel'), ore('plateEndSteel'), ore('plateEndSteel')]
])

//Ender Leggings
crafting.removeByOutput(item('enderio:item_end_steel_leggings'))
crafting.addShaped(item('enderio:item_end_steel_leggings'), [
    [ore('plateEndSteel'), ore('skullGuardianDiode'), ore('plateEndSteel')],
    [ore('plateEndSteel'), ore('craftingToolHardHammer'), ore('plateEndSteel')],
    [ore('plateEndSteel'), null, ore('plateEndSteel')]
])

//Ender Boots
crafting.removeByOutput(item('enderio:item_end_steel_boots'))
crafting.addShaped(item('enderio:item_end_steel_boots'), [
    [null, null, null],
    [ore('plateEndSteel'), ore('craftingToolHardHammer'), ore('plateEndSteel')],
    [ore('plateEndSteel'), ore('skullGuardianDiode'), ore('plateEndSteel')]
])

//Ender Shield
crafting.removeByOutput(item('enderio:item_end_steel_shield'))
crafting.addShaped(item('enderio:item_end_steel_shield'), [
    [ore('boltEndSteel'), ore('stickEndSteel'), ore('boltEndSteel')],
    [ore('stickLongEndSteel'), ore('skullGuardianDiode'), ore('stickLongEndSteel')],
    [ore('boltEndSteel'), ore('stickEndSteel'), ore('boltEndSteel')]
])

//Staff of Levity
crafting.removeByOutput(item('enderio:item_staff_of_levity'))
crafting.addShaped(item('enderio:item_staff_of_levity'), [
    [ore('craftingToolFile'), ore('plateDarkSteel'), ore('itemPrecientCrystal')],
    [ore('plateDarkSteel'), ore('circuitHv'), ore('plateDarkSteel')],
    [ore('itemInfinityRod'), ore('plateDarkSteel'), ore('craftingToolHardHammer')]
])

//Blank Dark Steel Upgrade
crafting.addShaped(item('enderio:item_dark_steel_upgrade'), [
    [ore('screwDarkSteel'), ore('plateDenseDarkSteel'), ore('screwDarkSteel')],
    [item('enderio:block_dark_iron_bars'), ore('craftingToolScrewdriver'), item('enderio:block_dark_iron_bars')],
    [ore('screwDarkSteel'), ore('plateDenseDarkSteel'), ore('screwDarkSteel')]
])


//The Ender MkIV
crafting.removeByOutput(item('enderio:item_stellar_alloy_sword'))
crafting.addShaped(item('enderio:item_stellar_alloy_sword'), [
    [null, ore('plateStellarAlloy'), null],
    [ore('craftingToolHardHammer'), ore('plateStellarAlloy'), ore('craftingToolFile')],
    [null, ore('itemInfinityRod'), null]
])

//Stellar Pickaxe
crafting.removeByOutput(item('enderio:item_stellar_alloy_pickaxe'))
crafting.addShaped(item('enderio:item_stellar_alloy_pickaxe'), [
    [ore('plateStellarAlloy'), ore('ingotStellarAlloy'), ore('ingotStellarAlloy')],
    [ore('craftingToolHardHammer'), ore('itemInfinityRod'), ore('craftingToolFile')],
    [null, ore('itemInfinityRod'), null]
])

//Stellar Axe
crafting.removeByOutput(item('enderio:item_stellar_alloy_axe'))
crafting.addShaped(item('enderio:item_stellar_alloy_axe'), [
    [ore('plateStellarAlloy'), ore('ingotStellarAlloy'), ore('craftingToolFile')],
    [ore('plateStellarAlloy'), ore('itemInfinityRod'), null],
    [ore('craftingToolHardHammer'), ore('itemInfinityRod'), null]
])

//Stellar Helm
crafting.removeByOutput(item('enderio:item_stellar_alloy_helmet'))
crafting.addShaped(item('enderio:item_stellar_alloy_helmet'), [
    [ore('plateStellarAlloy'), ore('skullSentientEnder'), ore('plateStellarAlloy')],
    [ore('plateStellarAlloy'), ore('craftingToolHardHammer'), ore('plateStellarAlloy')],
    [null, null, null]
])

//Stellar Plate
crafting.removeByOutput(item('enderio:item_stellar_alloy_chestplate'))
crafting.addShaped(item('enderio:item_stellar_alloy_chestplate'), [
    [ore('plateStellarAlloy'), ore('craftingToolHardHammer'), ore('plateStellarAlloy')],
    [ore('plateStellarAlloy'), ore('skullSentientEnder'), ore('plateStellarAlloy')],
    [ore('plateStellarAlloy'), ore('plateStellarAlloy'), ore('plateStellarAlloy')]
])

//Stellar Leggings
crafting.removeByOutput(item('enderio:item_stellar_alloy_leggings'))
crafting.addShaped(item('enderio:item_stellar_alloy_leggings'), [
    [ore('plateStellarAlloy'), ore('skullSentientEnder'), ore('plateStellarAlloy')],
    [ore('plateStellarAlloy'), ore('craftingToolHardHammer'), ore('plateStellarAlloy')],
    [ore('plateStellarAlloy'), null, ore('plateStellarAlloy')]
])

//Stellar Boots
crafting.removeByOutput(item('enderio:item_stellar_alloy_boots'))
crafting.addShaped(item('enderio:item_stellar_alloy_boots'), [
    [null, null, null],
    [ore('plateStellarAlloy'), ore('craftingToolHardHammer'), ore('plateStellarAlloy')],
    [ore('plateStellarAlloy'), ore('skullSentientEnder'), ore('plateStellarAlloy')]
])


// crafting.removeByOutput(null)
// crafting.addShaped(null, [
//     [null, null, null],
//     [null, null, null],
//     [null, null, null]
// ])
