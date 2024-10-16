log.infoMC("Changing EnderIO Machine Recipes...")

//Simple Machine Chassis
crafting.removeByOutput(item('enderio:item_material'))
crafting.addShaped(item('enderio:item_material'), [
    [ore('barsIron'), ore('plateIron'), ore('barsIron')],
    [ore('plateIron'), ore('dustBedrock'), ore('plateIron')],
    [ore('barsIron'), ore('plateIron'), ore('barsIron')]
])

//Industrial Machine Chassis
recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('itemSimpleMachineChassi') * 1, ore('dyeMachine') * 6)
    .outputs(item('enderio:item_material', 1) * 1)
    .duration(200)
    .EUt(32)
    .buildAndRegister()

//Soul Machine Chassis
recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('itemMachineChassi') * 1, ore('dyeSoulMachine') * 6)
    .outputs(item('enderio:item_material', 53) * 1)
    .duration(200)
    .EUt(32)
    .buildAndRegister()

//Enhanced Machine Chassis
recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('itemEndSteelMachineChassi') * 1, ore('dyeEnhancedMachine') * 6)
    .outputs(item('enderio:item_material', 54) * 1)
    .duration(200)
    .EUt(480)
    .buildAndRegister()

//Souless Machine Chassis
crafting.removeByOutput(item('enderio:item_material', 55))
recipemap('assembler').recipeBuilder()
    .inputs(ore('itemIndustrialInsulation') * 8, ore('skullGuardianDiode') * 2, ore('itemSoulMachineChassi') * 1)
    .outputs(item('enderio:item_material', 55) * 1)
    .duration(200)
    .EUt(128)
    .buildAndRegister()

//End Steel Machine Chassis
crafting.removeByOutput(item('enderio:item_material', 66))
crafting.addShaped(item('enderio:item_material', 66), [
    [ore('barsEndSteel'), ore('plateEndSteel'), ore('barsEndSteel')],
    [ore('plateEndSteel'), ore('dustBedrock'), ore('plateEndSteel')],
    [ore('barsEndSteel'), ore('plateEndSteel'), ore('barsEndSteel')]
])

//Creative Capacitor Bank
mods.extendedcrafting.TableCrafting.addShaped(0, item('enderio:block_cap_bank').withNbt(['enderio:energy': 50000000]), [
[ore('plateDenseStellarAlloy'), ore('plateDoubleStellarAlloy'), ore('plateStellarAlloy'), ore('plateDoubleStellarAlloy'), ore('plateDenseStellarAlloy'), ore('plateDoubleStellarAlloy'), ore('plateStellarAlloy'), ore('plateDoubleStellarAlloy'), ore('plateDenseStellarAlloy')], 
[ore('plateDoubleStellarAlloy'), item('enderio:block_cap_bank', 3), ore('plateDenseInfinity'), ore('capacitorInsane'), item('enderio:block_cap_bank', 3), ore('capacitorInsane'), ore('plateDenseInfinity'), item('enderio:block_cap_bank', 3), ore('plateDoubleStellarAlloy')], 
[ore('plateStellarAlloy'), ore('plateDenseInfinity'), ore('circuitUhv'), ore('plateDenseCosmicNeutronium'), ore('batteryUhv'), ore('plateDenseCosmicNeutronium'), ore('circuitUhv'), ore('plateDenseInfinity'), ore('plateStellarAlloy')], 
[ore('plateDoubleStellarAlloy'), ore('capacitorInsane'), ore('plateDenseCosmicNeutronium'), item('enderio:block_cap_bank', 3), ore('capacitorInsane'), item('enderio:block_cap_bank', 3), ore('plateDenseCosmicNeutronium'), ore('capacitorInsane'), ore('plateDoubleStellarAlloy')], 
[ore('plateDenseStellarAlloy'), item('enderio:block_cap_bank', 3), ore('batteryUhv'), ore('capacitorInsane'), ore('plateDenseStellarAlloy'), ore('capacitorInsane'), ore('batteryUhv'), item('enderio:block_cap_bank', 3), ore('plateDenseStellarAlloy')], 
[ore('plateDoubleStellarAlloy'), ore('capacitorInsane'), ore('plateDenseCosmicNeutronium'), item('enderio:block_cap_bank', 3), ore('capacitorInsane'), item('enderio:block_cap_bank', 3), ore('plateDenseCosmicNeutronium'), ore('capacitorInsane'), ore('plateDoubleStellarAlloy')], 
[ore('plateStellarAlloy'), ore('plateDenseInfinity'), ore('circuitUhv'), ore('plateDenseCosmicNeutronium'), ore('batteryUhv'), ore('plateDenseCosmicNeutronium'), ore('circuitUhv'), ore('plateDenseInfinity'), ore('plateStellarAlloy')], 
[ore('plateDoubleStellarAlloy'), item('enderio:block_cap_bank', 3), ore('plateDenseInfinity'), ore('capacitorInsane'), item('enderio:block_cap_bank', 3), ore('capacitorInsane'), ore('plateDenseInfinity'), item('enderio:block_cap_bank', 3), ore('plateDoubleStellarAlloy')], 
[ore('plateDenseStellarAlloy'), ore('plateDoubleStellarAlloy'), ore('plateStellarAlloy'), ore('plateDoubleStellarAlloy'), ore('plateDenseStellarAlloy'), ore('plateDoubleStellarAlloy'), ore('plateStellarAlloy'), ore('plateDoubleStellarAlloy'), ore('plateDenseStellarAlloy')]
])

//Basic Capacitor Bank
crafting.removeByOutput(item('enderio:block_cap_bank', 1))
crafting.addShaped(item('enderio:block_cap_bank', 1), [
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')],
    [ore('capacitorPrimative'), ore('batteryHv'), ore('capacitorPrimative')],
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')]
])

//Capacitor Bank
crafting.removeByOutput(item('enderio:block_cap_bank', 2))
crafting.addShaped(item('enderio:block_cap_bank', 2), [
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')],
    [ore('capacitorBasic'), ore('batteryEv'), ore('capacitorBasic')],
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')]
])

//Vibrant Capacitor Bank
crafting.removeByOutput(item('enderio:block_cap_bank', 3))
crafting.addShaped(item('enderio:block_cap_bank', 3), [
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')],
    [ore('capacitorIntegrated'), ore('batteryIv'), ore('capacitorIntegrated')],
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')]
])

//Energy Gauge
crafting.removeByOutput(item('enderio:block_gauge'))
crafting.addShaped(item('enderio:block_gauge'), [
    [ore('screwElectricalSteel'), ore('stickLongElectricalSteel'), ore('screwElectricalSteel')],
    [ore('stickLongElectricalSteel'), item('enderio:item_conduit_probe'), ore('stickLongElectricalSteel')],
    [ore('screwElectricalSteel'), ore('stickLongElectricalSteel'), ore('screwElectricalSteel')]
])

//Power Monitor
crafting.removeByOutput(item('enderio:block_power_monitor'))
crafting.addShaped(item('enderio:block_power_monitor'), [
    [ore('screwElectricalSteel'), item('enderio:block_gauge'), ore('screwElectricalSteel')],
    [ore('plateElectricalSteel'), ore('itemMachineChassi'), ore('plateElectricalSteel')],
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')]
])

//Graphical Power Monitor
crafting.removeByOutput(item('enderio:block_advanced_power_monitor'))
crafting.addShaped(item('enderio:block_advanced_power_monitor'), [
    [ore('screwElectricalSteel'), item('gregtech:meta_item_1', 307), ore('screwElectricalSteel')],
    [ore('plateElectricalSteel'), item('enderio:block_power_monitor'), ore('plateElectricalSteel')],
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')]
])

//Item Buffer
crafting.removeByOutput(item('enderio:block_buffer'))
crafting.addShaped(item('enderio:block_buffer'), [
    [ore('screwDarkSteel'), ore('plateElectricalSteel'), ore('screwDarkSteel')],
    [ore('plateElectricalSteel'), metaitem('crate.wood'), ore('plateElectricalSteel')],
    [ore('screwDarkSteel'), ore('plateElectricalSteel'), ore('screwDarkSteel')]
])

//Power Buffer
crafting.removeByOutput(item('enderio:block_buffer', 1))
crafting.addShaped(item('enderio:block_buffer', 1), [
    [ore('screwDarkSteel'), ore('plateElectricalSteel'), ore('screwDarkSteel')],
    [ore('plateElectricalSteel'), metaitem('battery_buffer.ulv.4'), ore('plateElectricalSteel')],
    [ore('screwDarkSteel'), ore('plateElectricalSteel'), ore('screwDarkSteel')]
])

//Omni Buffer
crafting.removeByOutput(item('enderio:block_buffer', 2))
crafting.addShaped(item('enderio:block_buffer', 2), [
    [ore('screwDarkSteel'), ore('plateElectricalSteel'), ore('screwDarkSteel')],
    [item('enderio:block_buffer'), ore('itemMachineChassi'), item('enderio:block_buffer', 1)],
    [ore('screwDarkSteel'), ore('plateElectricalSteel'), ore('screwDarkSteel')]
])

crafting.addShaped(item('enderio:block_buffer', 2), [
    [ore('screwDarkSteel'), ore('plateElectricalSteel'), ore('screwDarkSteel')],
    [item('enderio:block_buffer', 1), ore('itemMachineChassi'), item('enderio:block_buffer')],
    [ore('screwDarkSteel'), ore('plateElectricalSteel'), ore('screwDarkSteel')]
])

//Enchanter
crafting.removeByOutput(item('enderio:block_enchanter'))
crafting.addShaped(item('enderio:block_enchanter'), [
    [item('enderio:item_material', 15), ore('bookEnchanted'), item('enderio:item_material', 15)],
    [null, item('enderio:block_dark_steel_anvil'), null],
    [ore('blockDarkSteel'), ore('blockDarkSteel'), ore('blockDarkSteel')]
])

//Farming Station
crafting.removeByOutput(item('enderio:block_farm_station'))
crafting.addShaped(item('enderio:block_farm_station'), [
    [ore('itemVibrantCrystal'), ore('skullZombieController'), ore('itemVibrantCrystal')],
    [ore('plateSoularium'), ore('itemSoulMachineChassi'), ore('plateSoularium')],
    [ore('gearEnergized'), ore('itemPulsatingCrystal'), ore('gearEnergized')]
])

//Killer Joe
crafting.removeByOutput(item('enderio:block_killer_joe'))
crafting.addShaped(item('enderio:block_killer_joe'), [
    [ore('plateDoubleDarkSteel'), ore('fusedQuartz'), ore('plateDoubleDarkSteel')],
    [ore('fusedQuartz'), ore('skullZombieFrankenstein'), ore('fusedQuartz')],
    [ore('plateDoubleDarkSteel'), ore('fusedQuartz'), ore('plateDoubleDarkSteel')]
])

//Electric Light
crafting.removeByOutput(item('enderio:block_electric_light'))
crafting.addShaped(item('enderio:block_electric_light'), [
    [ore('fusedQuartz'), ore('fusedQuartz'), ore('fusedQuartz')],
    [ore('plateDarkSteel'), ore('dustGlowstone'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('capacitorPrimative'), ore('plateDarkSteel')]
])

crafting.addShapeless(item('enderio:block_electric_light'), [
    item('enderio:block_electric_light', 1)
])

//Light
crafting.removeByOutput(item('enderio:block_electric_light', 2))
crafting.addShaped(item('enderio:block_electric_light', 2), [
    [null, null, null],
    [ore('fusedQuartz'), ore('fusedQuartz'), ore('fusedQuartz')],
    [ore('plateDarkSteel'), item('minecraft:redstone_lamp'), ore('plateDarkSteel')],
])

crafting.addShapeless(item('enderio:block_electric_light', 2), [
    item('enderio:block_electric_light', 3)
])

//Wireless Light
crafting.removeByOutput(item('enderio:block_electric_light', 4))
crafting.addShapeless(item('enderio:block_electric_light', 4), [item('enderio:block_electric_light'), metaitem('sensor.hv'), ore('circuitHv')])

crafting.addShapeless(item('enderio:block_electric_light', 4), [
    item('enderio:block_electric_light', 5)
])

//Attractor Obelisk
crafting.removeByOutput(item('enderio:block_attractor_obelisk'))
crafting.addShaped(item('enderio:block_attractor_obelisk'), [
    [null, ore('itemAttractorCrystal'), null],
    [ore('plateEnergeticAlloy'), ore('gearWood'), ore('plateEnergeticAlloy')],
    [ore('plateSoularium'), ore('itemSoulMachineChassi'), ore('plateSoularium')]
])

//Aversion Obelisk
crafting.removeByOutput(item('enderio:block_aversion_obelisk'))
crafting.addShaped(item('enderio:block_aversion_obelisk'), [
    [null, item('enderio:block_enderman_skull', 2), null],
    [ore('plateEnergeticAlloy'), ore('gearEnergized'), ore('plateEnergeticAlloy')],
    [ore('plateSoularium'), ore('itemSoulMachineChassi'), ore('plateSoularium')]
])

//Inhibitor Obelisk
crafting.removeByOutput(item('enderio:block_inhibitor_obelisk'))
crafting.addShaped(item('enderio:block_inhibitor_obelisk'), [
    [null, ore('gemEnderPearl'), null],
    [ore('plateEnergeticAlloy'), ore('gearIronInfinity'), ore('plateEnergeticAlloy')],
    [ore('plateSoularium'), ore('itemSoulMachineChassi'), ore('plateSoularium')]
])

//Relocator Obelisk
crafting.removeByOutput(item('enderio:block_relocator_obelisk'))
crafting.addShaped(item('enderio:block_relocator_obelisk'), [
    [null, ore('blockPrismarine'), null],
    [ore('plateEnergeticAlloy'), ore('gearVibrant'), ore('plateEnergeticAlloy')],
    [ore('plateSoularium'), ore('itemSoulMachineChassi'), ore('plateSoularium')]
])

//Weather Obelisk
crafting.removeByOutput(item('enderio:block_weather_obelisk'))
crafting.addShaped(item('enderio:block_weather_obelisk'), [
    [null, item('minecraft:fireworks'), null],
    [ore('plateEnergeticAlloy'), ore('itemWeatherCrystal'), ore('plateEnergeticAlloy')],
    [ore('plateSoularium'), ore('itemSoulMachineChassi'), ore('plateSoularium')]
])

//Experience Obelisk
crafting.removeByOutput(item('enderio:block_experience_obelisk'))
crafting.addShaped(item('enderio:block_experience_obelisk'), [
    [null, item('enderio:item_xp_transfer'), null],
    [ore('plateEnergeticAlloy'), metaitem('super_tank.hv'), ore('plateEnergeticAlloy')],
    [ore('plateSoularium'), ore('itemSoulMachineChassi'), ore('plateSoularium')]
])

//Painting Machine
crafting.removeByOutput(item('enderio:block_painter'))
crafting.addShaped(item('enderio:block_painter'), [
    [ore('plateNetherQuartz'), ore('gemExquisiteDiamond'), ore('plateNetherQuartz')],
    [ore('gearIronInfinity'), ore('itemMachineChassi'), ore('gearIronInfinity')],
    [ore('plateDoubleElectricalSteel'), ore('plateDoubleElectricalSteel'), ore('plateDoubleElectricalSteel')]
])

//Endervoir
crafting.removeByOutput(item('enderio:block_reservoir'))
crafting.addShaped(item('enderio:block_reservoir'), [
    [ore('plateDoubleDarkSteel'), ore('fusedQuartz'), ore('plateDoubleDarkSteel')],
    [ore('fusedQuartz'), item('minecraft:cauldron'), ore('fusedQuartz')],
    [ore('plateDoubleDarkSteel'), ore('fusedQuartz'), ore('plateDoubleDarkSteel')]
])

crafting.addShapeless(item('enderio:block_reservoir'), [
    item('enderio:block_omni_reservoir')
])

//Omnivoir
crafting.removeByOutput(item('enderio:block_omni_reservoir'))
crafting.addShapeless(item('enderio:block_omni_reservoir'), [
    item('enderio:block_reservoir')
])

//Slice'N'Splice
crafting.removeByOutput(item('enderio:block_slice_and_splice'))
crafting.addShaped(item('enderio:block_slice_and_splice'), [
    [ore('plateSoularium'), ore('itemSkull'), ore('plateSoularium')],
    [ore('plateSoularium'), ore('itemSoulMachineChassi'), ore('plateSoularium')],
    [ore('gearEnergized'), item('enderio:block_dark_iron_bars'), ore('gearEnergized')]
])

//Simple Photovoltaic Cell
crafting.removeByOutput(item('enderio:block_solar_panel'))
crafting.addShaped(item('enderio:block_solar_panel'), [
    [ore('plateElectricalSteel'), ore('fusedQuartz'), ore('plateElectricalSteel')],
    [ore('itemPlatePhotovoltaic'), ore('itemPlatePhotovoltaic'), ore('itemPlatePhotovoltaic')],
    [ore('capacitorPathetic'), ore('circuitUlv'), ore('capacitorPathetic')]
])

//Photovoltaic Cell
crafting.removeByOutput(item('enderio:block_solar_panel', 1))
crafting.addShaped(item('enderio:block_solar_panel', 1), [
    [ore('plateEnergeticAlloy'), ore('fusedQuartz'), ore('plateEnergeticAlloy')],
    [item('enderio:block_solar_panel'), item('enderio:block_solar_panel'), item('enderio:block_solar_panel')],
    [ore('capacitorPrimative'), ore('circuitLv'), ore('capacitorPrimative')]
])

//Advanced Photovoltaic Cell
crafting.removeByOutput(item('enderio:block_solar_panel', 2))
crafting.addShaped(item('enderio:block_solar_panel', 2), [
    [ore('platePulsatingIron'), ore('fusedQuartz'), ore('platePulsatingIron')],
    [item('enderio:block_solar_panel', 1), item('enderio:block_solar_panel', 1), item('enderio:block_solar_panel', 1)],
    [ore('capacitorBasic'), ore('circuitMv'), ore('capacitorBasic')]
])

//Vibrant Photovoltaic Cell
crafting.removeByOutput(item('enderio:block_solar_panel', 3))
crafting.addShaped(item('enderio:block_solar_panel', 3), [
    [ore('plateVibrantAlloy'), ore('fusedQuartz'), ore('plateVibrantAlloy')],
    [item('enderio:block_solar_panel', 2), item('enderio:block_solar_panel', 2), item('enderio:block_solar_panel', 2)],
    [ore('capacitorIntegrated'), ore('circuitHv'), ore('capacitorIntegrated')]
])

//Crystalline Photovoltaic Cell
crafting.removeByOutput(item('enderio:block_solar_panel', 4))
crafting.addShaped(item('enderio:block_solar_panel', 4), [
    [ore('plateCrystallineAlloy'), ore('fusedQuartz'), ore('plateCrystallineAlloy')],
    [item('enderio:block_solar_panel', 3), item('enderio:block_solar_panel', 3), item('enderio:block_solar_panel', 3)],
    [ore('capacitorAdvanced'), ore('circuitEv'), ore('capacitorAdvanced')]
])

//Melodic Photovoltaic Cell
crafting.removeByOutput(item('enderio:block_solar_panel', 5))
crafting.addShaped(item('enderio:block_solar_panel', 5), [
    [ore('plateMelodicAlloy'), ore('fusedQuartz'), ore('plateMelodicAlloy')],
    [item('enderio:block_solar_panel', 4), item('enderio:block_solar_panel', 4), item('enderio:block_solar_panel', 4)],
    [ore('capacitorExtreme'), ore('circuitIv'), ore('capacitorExtreme')]
])

//Stellar Photovoltaic Cell
crafting.removeByOutput(item('enderio:block_solar_panel', 6))
crafting.addShaped(item('enderio:block_solar_panel', 6), [
    [ore('plateStellarAlloy'), ore('fusedQuartz'), ore('plateStellarAlloy')],
    [item('enderio:block_solar_panel', 5), item('enderio:block_solar_panel', 5), item('enderio:block_solar_panel', 5)],
    [ore('capacitorInsane'), ore('circuitLuv'), ore('capacitorInsane')]
])


//Soul Binder 
crafting.removeByOutput(item('enderio:block_soul_binder'))
crafting.addShaped(item('enderio:block_soul_binder'), [
    [ore('plateSoularium'), item('enderio:block_enderman_skull'), ore('plateSoularium')],
    [item('minecraft:skull', 4), ore('itemSoulMachineChassi'), item('minecraft:skull', 2)],
    [ore('plateSoularium'), item('minecraft:skull'), ore('plateSoularium')]
])

//Powered Spawner
crafting.removeByOutput(item('enderio:block_powered_spawner'))
crafting.addShaped(item('enderio:block_powered_spawner'), [
    [ore('plateElectricalSteel'), ore('itemSkull'), ore('plateElectricalSteel')],
    [ore('plateElectricalSteel'), ore('itemSoulMachineChassi'), ore('plateElectricalSteel')],
    [ore('itemVibrantCrystal'), ore('skullZombieController'), ore('itemVibrantCrystal')]
])

//The Vat
crafting.removeByOutput(item('enderio:block_vat'))
crafting.addShaped(item('enderio:block_vat'), [
    [ore('plateDarkSteel'), item('minecraft:cauldron'), ore('plateDarkSteel')],
    [item('enderio:block_tank'), ore('itemMachineChassi'), item('enderio:block_tank')],
    [ore('plateDarkSteel'), ore('craftingFurnace'), ore('plateDarkSteel')]
])

//The Enhanced Vat
crafting.removeByOutput(item('enderio:block_enhanced_vat'))
crafting.addShaped(item('enderio:block_enhanced_vat'), [
    [ore('plateMelodicAlloy'), item('enderio:block_vat'), ore('plateMelodicAlloy')],
    [item('enderio:block_tank', 1), ore('itemEnhancedMachineChassi'), item('enderio:block_tank', 1)],
    [ore('plateMelodicAlloy'), metaitem('electric_furnace.hv'), ore('plateMelodicAlloy')]
])

//Simple Wired Charger
crafting.removeByOutput(item('enderio:block_simple_wired_charger'))
crafting.addShaped(item('enderio:block_simple_wired_charger'), [
    [ore('plateElectricalSteel'), ore('capacitorPrimative'), ore('plateElectricalSteel')],
    [ore('plateElectricalSteel'), metaitem('field.generator.hv'), ore('plateElectricalSteel')],
    [ore('plateElectricalSteel'), ore('itemSimpleMachineChassi'), ore('plateElectricalSteel')]
])

//Wired Charger
crafting.removeByOutput(item('enderio:block_wired_charger'))
crafting.addShaped(item('enderio:block_wired_charger'), [
    [ore('plateDarkSteel'), ore('capacitorBasic'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), item('enderio:block_simple_wired_charger'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('itemMachineChassi'), ore('plateDarkSteel')]
])

//Enhanced Wired Charger
crafting.removeByOutput(item('enderio:block_enhanced_wired_charger'))
crafting.addShaped(item('enderio:block_enhanced_wired_charger'), [
    [ore('plateMelodicAlloy'), ore('capacitorIntegrated'), ore('plateMelodicAlloy')],
    [ore('plateMelodicAlloy'), item('enderio:block_wired_charger'), ore('plateMelodicAlloy')],
    [ore('plateMelodicAlloy'), ore('itemEnhancedMachineChassi'), ore('plateMelodicAlloy')]
])

//Wireless Charger
crafting.removeByOutput(item('enderio:block_wireless_charger'))
crafting.addShaped(item('enderio:block_wireless_charger'), [
    [metaitem('emitter.hv'),ore('skullEnderResonator'), metaitem('emitter.hv')],
    [ore('plateElectricalSteel'), ore('itemMachineChassi'), ore('plateElectricalSteel')],
    [ore('plateElectricalSteel'), ore('capacitorBasic'), ore('plateElectricalSteel')]
])

//Wireless Charging Antenna 
crafting.removeByOutput(item('enderio:block_normal_wireless_charger'))
crafting.addShaped(item('enderio:block_normal_wireless_charger'), [
    [ore('itemWirelessDish'), ore('itemWirelessDish'), ore('itemWirelessDish')],
    [ore('itemWirelessDish'), item('enderio:block_wireless_charger'), ore('itemWirelessDish')],
    [ore('plateDarkSteel'), ore('capacitorIntegrated'), ore('plateDarkSteel')]
])

//Enhanced Wireless Chargeing Antenna
crafting.removeByOutput(item('enderio:block_enhanced_wireless_charger'))
crafting.addShaped(item('enderio:block_enhanced_wireless_charger'), [
    [null, item('enderio:block_normal_wireless_charger'), null],
    [null, ore('itemEnhancedMachineChassi'), null],
    [null, ore('capacitorAdvanced'), null]
])

//Wireless Charging Antenna Extension
crafting.removeByOutput(item('enderio:block_wireless_charger_extension'))
crafting.addShaped(item('enderio:block_wireless_charger_extension'), [
    [ore('screwEndSteel'), ore('itemWirelessDish'), ore('itemWirelessDish')],
    [ore('itemWirelessDish'), ore('blockEndSteel'), ore('itemWirelessDish')],
    [ore('itemWirelessDish'), ore('itemWirelessDish'), ore('screwEndSteel')]
])

//Fluid Tank
crafting.removeByOutput(item('enderio:block_tank'))
crafting.addShaped(item('enderio:block_tank'), [
    [ore('plateIron'), ore('barsIron'), ore('plateIron')],
    [ore('barsIron'), ore('blockGlass'), ore('barsIron')],
    [ore('plateIron'), ore('barsIron'), ore('plateIron')]
])

//Pressureized Fluid Tank
crafting.removeByOutput(item('enderio:block_tank', 1))
crafting.addShaped(item('enderio:block_tank', 1), [
    [ore('plateDarkSteel'), ore('barsDarkSteel'), ore('plateDarkSteel')],
    [ore('barsDarkSteel'), ore('fusedQuartz'), ore('barsDarkSteel')],
    [ore('plateDarkSteel'), ore('barsDarkSteel'), ore('plateDarkSteel')]
])

//Dimensional Transceiver
crafting.removeByOutput(item('enderio:block_transceiver'))
crafting.addShaped(item('enderio:block_transceiver'), [
    [ore('plateCrystallineAlloy'), ore('skullSentientEnder'), ore('plateCrystallineAlloy')],
    [metaitem('emitter.iv'), ore('itemEnderCrystal'), metaitem('sensor.iv')],
    [ore('plateCrystallineAlloy'), ore('capacitorExtreme'), ore('plateCrystallineAlloy')]
])

//Vacuum Chest
crafting.removeByOutput(item('enderio:block_vacuum_chest'))
crafting.addShaped(item('enderio:block_vacuum_chest'), [
    [ore('plateDarkSteel'), metaitem('item_filter'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), metaitem('crate.wood'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('itemPulsatingCrystal'), ore('plateDarkSteel')]
])

//XP Vacuum
crafting.removeByOutput(item('enderio:block_xp_vacuum'))
crafting.addShaped(item('enderio:block_xp_vacuum'), [
    [ore('plateDarkSteel'), metaitem('fluid_filter'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), item('enderio:item_xp_transfer'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('itemPulsatingCrystal'), ore('plateDarkSteel')]
])

//The Niard
crafting.removeByOutput(item('enderio:block_niard'))
crafting.addShaped(item('enderio:block_niard'), [
    [ore('plateDarkSteel'), item('enderio:block_tank'), ore('plateDarkSteel')],
    [metaitem('electric.pump.hv'), ore('itemMachineChassi'), metaitem('electric.pump.hv')],
    [ore('plateDarkSteel'), ore('barsDarkSteel'), ore('plateDarkSteel')]
])

//Travel Anchor
crafting.removeByOutput(item('enderio:block_travel_anchor'))
crafting.addShaped(item('enderio:block_travel_anchor'), [
    [ore('plateDarkSteel'), metaitem('emitter.hv'), ore('plateDarkSteel')],
    [metaitem('sensor.hv'), ore('itemPulsatingCrystal'), metaitem('sensor.hv')],
    [ore('plateDarkSteel'), metaitem('emitter.hv'), ore('plateDarkSteel')]
])

//Telepad Block
crafting.removeByOutput(item('enderio:block_tele_pad'))
crafting.addShaped(item('enderio:block_tele_pad'), [
    [metaitem('sensor.iv'), ore('plateCrystallineAlloy'), metaitem('emitter.iv')],
    [ore('plateDarkSteel'), item('enderio:block_travel_anchor'), ore('plateDarkSteel')],
    [ore('plateDarkSteel'), ore('capacitorExtreme'), ore('plateDarkSteel')]
])

//Dialing Device
crafting.removeByOutput(item('enderio:block_dialing_device'))
crafting.addShaped(item('enderio:block_dialing_device'), [
    [null, item('enderio:item_mod_item_filter'), null],
    [ore('skullEnderResonator'), item('enderio:block_dark_steel_anvil'), ore('skullEnderResonator')],
    [ore('plateDarkSteel'), ore('plateDarkSteel'), ore('plateDarkSteel')]
])

//Impulse Hopper
crafting.removeByOutput(item('enderio:block_impulse_hopper'))
crafting.addShaped(item('enderio:block_impulse_hopper'), [
    [ore('plateElectricalSteel'), ore('blockHopper'), ore('plateElectricalSteel')],
    [ore('gearEnergized'), ore('itemMachineChassi'), ore('gearEnergized')],
    [ore('plateElectricalSteel'), ore('ringRedstoneAlloy'), ore('plateElectricalSteel')]
])

//Simple Crafter
crafting.removeByOutput(item('enderio:block_simple_crafter'))
crafting.addShaped(item('enderio:block_simple_crafter'), [
    [ore('plateSolarGradeSilicon'), ore('plateSolarGradeSilicon'), ore('plateSolarGradeSilicon')],
    [ore('plateElectricalSteel'), ore('itemSimpleMachineChassi'), ore('plateElectricalSteel')],
    [ore('gearElectricalSteel'), ore('workbench'), ore('gearElectricalSteel')]
])

//Crafter
crafting.removeByOutput(item('enderio:block_crafter'))
crafting.addShaped(item('enderio:block_crafter'), [
    [ore('plateSolarGradeSilicon'), ore('plateSolarGradeSilicon'), ore('plateSolarGradeSilicon')],
    [ore('plateDarkSteel'), ore('itemMachineChassi'), ore('plateDarkSteel')],
    [ore('gearDarkSteel'), item('enderio:block_simple_crafter'), ore('gearDarkSteel')]
])

// crafting.removeByOutput(null)
// crafting.addShaped(null, [
//     [null, null, null],
//     [null, null, null],
//     [null, null, null]
// ])
