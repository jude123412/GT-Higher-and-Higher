log.infoMC("Changing EnderIO Component Recipes...")

//Basic Capacitor
crafting.removeByOutput(item('enderio:item_basic_capacitor'))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilElectricalSteel') * 16, item('enderio:item_capacitor_grainy') * 2, ore('boltGold') * 2)
    .outputs(item('enderio:item_basic_capacitor') * 1)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .duration(200)
    .EUt(24)
    .buildAndRegister()

//Double-layer Capacitor
crafting.removeByOutput(item('enderio:item_basic_capacitor', 1))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilEnergeticAlloy') * 16, ore('capacitorPrimative') * 2, ore('boltElectrum') * 2)
    .outputs(item('enderio:item_basic_capacitor', 1) * 1)
    .fluidInputs(fluid('soldering_alloy') * 144)
    .duration(400)
    .EUt(96)
    .buildAndRegister()

//Octadic Capacitor
crafting.removeByOutput(item('enderio:item_basic_capacitor', 2))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilVibrantAlloy') * 16, ore('capacitorBasic') * 2, ore('boltBlueAlloy') * 2)
    .outputs(item('enderio:item_basic_capacitor', 2) * 1)
    .fluidInputs(fluid('soldering_alloy') * 288)
    .duration(800)
    .EUt(384)
    .buildAndRegister()

//Dark Steel Grinding Ball
crafting.removeByOutput(item('enderio:item_alloy_ball', 6))
crafting.addShaped(item('enderio:item_alloy_ball', 6), [
    [null, ore('plateDarkSteel'), null],
    [ore('plateDarkSteel'), ore('ringDarkSteel'), ore('plateDarkSteel')],
    [null, ore('plateDarkSteel'), null]
])

//Soularium Grinding Ball
crafting.removeByOutput(item('enderio:item_alloy_ball', 7))
crafting.addShaped(item('enderio:item_alloy_ball', 7), [
    [null, ore('plateSoularium'), null],
    [ore('plateSoularium'), ore('ringSoularium'), ore('plateSoularium')],
    [null, ore('plateSoularium'), null]
])

//Machine Parts
crafting.removeByOutput(item('enderio:item_material', 2))
crafting.addShaped(item('enderio:item_material', 2) * 16, [
    [ore('screwIron'), ore('plateIron'), ore('screwIron')],
    [ore('plateIron'), ore('itemMachineChassi'), ore('plateIron')],
    [ore('screwIron'), ore('plateIron'), ore('screwIron')]
])

//Photovoltaic Plate
recipemap('chemical_bath').recipeBuilder()
    .inputs(ore('plateDarkSteel') * 1)
    .outputs(item('enderio:item_material', 3) * 1)
    .fluidInputs(fluid('photovoltaic_composite') * 288)
    .duration(800)
    .EUt(384)
    .buildAndRegister()

//Conduit Binder
furnace.removeByInput(item('enderio:item_material', 22))
recipemap('chemical_bath').recipeBuilder()
    .inputs(ore('itemBinderComposite') * 1)
    .outputs(item('enderio:item_material', 4) * 2)
    .chancedOutput(item('enderio:item_material', 4) * 2, 8000, 100)
    .chancedOutput(item('enderio:item_material', 4) * 2, 5000, 200)
    .chancedOutput(item('enderio:item_material', 4) * 1, 4000, 250)
    .chancedOutput(item('enderio:item_material', 4) * 1, 3000, 400)
    .chancedOutput(item('enderio:item_material', 4) * 1, 1000, 500)
    .fluidInputs(fluid('rubber') * 288)
    .duration(60)
    .EUt(16)
    .buildAndRegister()

//Glider Wing
crafting.removeByOutput(item('enderio:item_material', 6))
crafting.addShaped(item('enderio:item_material', 6) * 1, [
    [ore('craftingToolScrewdriver'), metaitem('screwDarkSteel'), metaitem('plateDarkSteel')],
    [metaitem('screwDarkSteel'), metaitem('plateVibrantAlloy'), ore('itemLeather')],
    [metaitem('plateDarkSteel'), ore('itemLeather'), ore('itemLeather')]
])

//Glider Wings
crafting.removeByOutput(item('enderio:item_material', 7))
crafting.addShaped(item('enderio:item_material', 7) * 1, [
    [ore('craftingToolScrewdriver'), metaitem('stickLongDarkSteel'), ore('craftingToolFile')],
    [metaitem('screwDarkSteel'), metaitem('stickLongDarkSteel'), metaitem('screwDarkSteel')],
    [ore('itemGliderWing'), metaitem('stickLongDarkSteel'), ore('itemGliderWing')]
])

//Nutritious Stick
recipemap('chemical_bath').recipeBuilder()
    .inputs(ore('stickWood') * 1)
    .outputs(item('enderio:item_material', 8) * 1)
    .fluidInputs(fluid('nutrient_distillation') * 1000)
    .duration(20)
    .EUt(8)
    .buildAndRegister()

//Infinity Bimetal Gear
crafting.removeByOutput(item('enderio:item_material', 11))
recipemap('fluid_solidifier').recipeBuilder()
    .notConsumable(metaitem('shape.mold.gear') * 1)
    .inputs(ore('dustBedrock') * 1)
    .outputs(item('enderio:item_material', 11) * 1)
    .fluidInputs(fluid('iron') * 576)
    .duration(100)
    .EUt(7)
    .buildAndRegister()

//Energized Bimetal Gear
crafting.removeByOutput(item('enderio:item_material', 12))
recipemap('fluid_solidifier').recipeBuilder()
    .notConsumable(metaitem('shape.mold.gear') * 1)
    .inputs(ore('gearIronInfinity') * 1)
    .outputs(item('enderio:item_material', 12) * 1)
    .fluidInputs(fluid('energetic_alloy') * 576)
    .duration(100)
    .EUt(7)
    .buildAndRegister()

//Vibrant Bimetal Gear
crafting.removeByOutput(item('enderio:item_material', 13))
recipemap('fluid_solidifier').recipeBuilder()
    .notConsumable(metaitem('shape.mold.gear') * 1)
    .inputs(ore('gearEnergized') * 1)
    .outputs(item('enderio:item_material', 13) * 1)
    .fluidInputs(fluid('vibrant_alloy') * 576)
    .duration(100)
    .EUt(7)
    .buildAndRegister()

//Pulsating Crystal
crafting.removeByOutput(item('enderio:item_material', 14))
recipemap('autoclave').recipeBuilder()
    .inputs(ore('gemDiamond') * 1)
    .outputs(item('enderio:item_material', 14) * 1)
    .fluidInputs(fluid('pulsating_iron') * 576)
    .duration(200)
    .EUt(96)
    .buildAndRegister()

//Vibrant Crystal
crafting.removeByOutput(item('enderio:item_material', 15))
recipemap('autoclave').recipeBuilder()
    .inputs(ore('gemFlawlessDiamond') * 1)
    .outputs(item('enderio:item_material', 15) * 1)
    .fluidInputs(fluid('vibrant_alloy') * 576)
    .duration(200)
    .EUt(384)
    .buildAndRegister()

//Enticing Crystal
mods.enderio.soul_binder.remove(item('enderio:item_material', 17))
mods.enderio.soul_binder.recipeBuilder()
    .input(ore('gemExquisiteEmerald'))
    .output(item('enderio:item_material', 17))
    .entity(entity('minecraft:villager'))
    .name('gt_enticing_crystal')
    .energy(100000)
    .xp(4)
    .register()

//Weather Crystal
crafting.removeByOutput(item('enderio:item_material', 18))
recipemap('implosion_compressor').recipeBuilder()
    .inputs(ore('dustWeatherCrystal') * 5)
    .outputs(item('enderio:item_material', 18) * 1)
    .chancedOutput(metaitem('dustDarkAsh') * 1, 2500, 0)
    .explosivesType(item('gregtech:powderbarrel') * 8)
    .duration(200)
    .EUt(480)
    .buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
    .inputs(ore('dustWeatherCrystal') * 5)
    .outputs(item('enderio:item_material', 18) * 1)
    .chancedOutput(metaitem('dustDarkAsh') * 1, 2500, 0)
    .explosivesType(item('minecraft:tnt') * 4)
    .duration(200)
    .EUt(480)
    .buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
    .inputs(ore('dustWeatherCrystal') * 5)
    .outputs(item('enderio:item_material', 18) * 1)
    .chancedOutput(metaitem('dustDarkAsh') * 1, 2500, 0)
    .explosivesType(item('gregtech:meta_item_1', 460) * 2)
    .duration(200)
    .EUt(480)
    .buildAndRegister()

recipemap('implosion_compressor').recipeBuilder()
    .inputs(ore('dustWeatherCrystal') * 5)
    .outputs(item('enderio:item_material', 18) * 1)
    .chancedOutput(metaitem('dustDarkAsh') * 1, 2500, 0)
    .explosivesType(item('gregtech:itnt') * 1)
    .duration(200)
    .EUt(480)
    .buildAndRegister()

//Conduit Binder Composite
crafting.removeByOutput(item('enderio:item_material', 22))
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustClay') * 4, ore('dustStone') * 4, ore('dustSiliconDioxide') * 4)
    .outputs(item('enderio:item_material', 22) * 12)
    .circuitMeta(5)
    .fluidInputs(fluid('construction_foam') * 1000)
    .duration(100)
    .EUt(30)
    .buildAndRegister()

//Grains of Prescience
recipemap('macerator').recipeBuilder()
    .inputs(ore('itemPrecientCrystal') * 1)
    .outputs(item('enderio:item_material', 34) * 1)
    .chancedOutput(item('enderio:item_material', 34) * 1, 2500, 500)
    .chancedOutput(item('enderio:item_material', 34) * 1, 1500, 300)
    .chancedOutput(item('enderio:item_material', 34) * 1, 500, 100)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Grains of Vibrancy
recipemap('macerator').recipeBuilder()
    .inputs(ore('itemVibrantCrystal') * 1)
    .outputs(item('enderio:item_material', 35) * 1)
    .chancedOutput(item('enderio:item_material', 35) * 1, 2500, 500)
    .chancedOutput(item('enderio:item_material', 35) * 1, 1500, 300)
    .chancedOutput(item('enderio:item_material', 35) * 1, 500, 100)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Grains of Piezallity
recipemap('macerator').recipeBuilder()
    .inputs(ore('itemPulsatingCrystal') * 1)
    .outputs(item('enderio:item_material', 36) * 1)
    .chancedOutput(item('enderio:item_material', 36) * 1, 2500, 500)
    .chancedOutput(item('enderio:item_material', 36) * 1, 1500, 300)
    .chancedOutput(item('enderio:item_material', 36) * 1, 500, 100)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Grains of the End
recipemap('macerator').recipeBuilder()
    .inputs(ore('itemEnderCrystal') * 1)
    .outputs(item('enderio:item_material', 37) * 1)
    .chancedOutput(item('enderio:item_material', 37) * 1, 2500, 500)
    .chancedOutput(item('enderio:item_material', 37) * 1, 1500, 300)
    .chancedOutput(item('enderio:item_material', 37) * 1, 500, 100)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Photovoltaic Composite
crafting.removeByOutput(item('enderio:item_material', 38))
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustLapis') * 1, ore('dustCoal') * 1, ore('dustSilicon') * 1)
    .outputs(item('enderio:item_material', 38) * 3)
    .fluidInputs(fluid('rubber') * 144)
    .circuitMeta(5)
    .duration(120)
    .EUt(16)
    .buildAndRegister()

//Zombie Electrode
mods.enderio.slice_n_splice.remove(item('enderio:item_material', 40))
mods.enderio.slice_n_splice.recipeBuilder()
    .input(ore('plateEnergeticAlloy'), item('minecraft:skull', 2), ore('plateEnergeticAlloy'))
    .input(ore('plateSolarGradeSilicon'), ore('capacitorPrimative'), ore('plateSolarGradeSilicon'))
    .output(item('enderio:item_material', 40))
    .energy(20000)
    .register()

//Z-Logic Controller
mods.enderio.slice_n_splice.remove(item('enderio:item_material', 41))
mods.enderio.slice_n_splice.recipeBuilder()
    .input(ore('plateSoularium'), item('minecraft:skull', 2), ore('plateSoularium'))
    .input(ore('plateSolarGradeSilicon'), ore('plateRedAlloy'), ore('plateSolarGradeSilicon'))
    .output(item('enderio:item_material', 41))
    .energy(20000)
    .register()

//Ender Resonator
mods.enderio.slice_n_splice.remove(item('enderio:item_material', 43))
mods.enderio.slice_n_splice.recipeBuilder()
    .input(ore('plateSoularium'), item('enderio:block_enderman_skull'), ore('plateSoularium'))
    .input(ore('plateSolarGradeSilicon'), ore('plateVibrantAlloy'), ore('plateSolarGradeSilicon'))
    .output(item('enderio:item_material', 43))
    .energy(20000)
    .register()

//Skeletal Contractor
mods.enderio.slice_n_splice.remove(item('enderio:item_material', 45))
mods.enderio.slice_n_splice.recipeBuilder()
    .input(ore('plateSoularium'), item('minecraft:skull'), ore('plateSoularium'))
    .input(item('minecraft:rotten_flesh'), ore('capacitorPrimative'), item('minecraft:rotten_flesh'))
    .output(item('enderio:item_material', 45))
    .energy(20000)
    .register()

//Chemical Green Dye
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustCoal') * 2, ore('dustClay') * 2, item('gregtech:meta_item_1', 440) * 2)
    .outputs(item('enderio:item_material', 48) * 4)
    .fluidInputs(fluid('dye_green') * 576)
    .circuitMeta(5)
    .duration(80)
    .EUt(16)
    .buildAndRegister()

//Chemical Brown Dye
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustCoal') * 2, ore('dustClay') * 2, item('gregtech:meta_item_1', 440) * 2)
    .outputs(item('enderio:item_material', 49) * 4)
    .fluidInputs(fluid('dye_brown') * 576)
    .circuitMeta(5)
    .duration(80)
    .EUt(16)
    .buildAndRegister()

//Chemical Black Dye
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustCoal') * 2, ore('dustClay') * 2, item('gregtech:meta_item_1', 440) * 2)
    .outputs(item('enderio:item_material', 50) * 4)
    .fluidInputs(fluid('dye_black') * 576)
    .circuitMeta(5)
    .duration(80)
    .EUt(16)
    .buildAndRegister()

//Industrial Dye Blend
crafting.removeByOutput(item('enderio:item_material', 51))
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustSiliconDioxide') * 4, ore('dyeBlue') * 2, item('enderio:item_material', 48) * 2, item('enderio:item_material', 50) * 1)
    .outputs(item('enderio:item_material', 51) * 9)
    .circuitMeta(5)
    .duration(200)
    .EUt(8)
    .buildAndRegister()

//Soul Attuned Dye Blend
crafting.removeByOutput(item('enderio:item_material', 52))
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustSiliconDioxide') * 4, ore('dustSoularium') * 2, item('enderio:item_material', 49) * 2, item('enderio:item_material', 50) * 1)
    .outputs(item('enderio:item_material', 52) * 9)
    .circuitMeta(5)
    .duration(200)
    .EUt(24)
    .buildAndRegister()

//Guardian Diode
mods.enderio.slice_n_splice.remove(item('enderio:item_material', 56))
mods.enderio.slice_n_splice.recipeBuilder()
    .input(ore('plateEnergeticAlloy'), ore('gemPrismarine'), ore('plateEnergeticAlloy'))
    .input(ore('dustPrismarine'), ore('capacitorPrimative'), ore('dustPrismarine'))
    .output(item('enderio:item_material', 56))
    .energy(20000)
    .register()

//Wireless Energy Transmitter Dish Assembly
crafting.removeByOutput(item('enderio:item_material', 65))
crafting.addShaped(item('enderio:item_material', 65), [
    [metaitem('screwElectricalSteel'), metaitem('plateElectricalSteel'), null],
    [ore('craftingToolScrewdriver'), metaitem('emitter.hv'), metaitem('plateElectricalSteel')],
    [metaitem('screwElectricalSteel'), metaitem('plateElectricalSteel'), null]
])

//Enhanced Dye Blend
crafting.removeByOutput(item('enderio:item_material', 67))
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustSiliconDioxide') * 4, ore('itemPulsatingPowder') * 4, item('enderio:item_material', 50) * 1)
    .outputs(item('enderio:item_material', 67) * 9)
    .circuitMeta(5)
    .duration(200)
    .EUt(96)
    .buildAndRegister()

//Enhanced Machine Parts
crafting.removeByOutput(item('enderio:item_material', 68))
crafting.addShaped(item('enderio:item_material', 68) * 16, [
    [ore('screwIron'), ore('plateIron'), ore('screwIron')],
    [ore('plateIron'), ore('itemEnhancedMachineChassi'), ore('plateIron')],
    [ore('screwIron'), ore('plateIron'), ore('screwIron')]
])

//Simple Machine Parts 
crafting.removeByOutput(item('enderio:item_material', 69))
crafting.addShaped(item('enderio:item_material', 69) * 16, [
    [ore('screwIron'), ore('plateIron'), ore('screwIron')],
    [ore('plateIron'), ore('itemSimpleMachineChassi'), ore('plateIron')],
    [ore('screwIron'), ore('plateIron'), ore('screwIron')]
])

//Cake Base
recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('foodFlour') * 3, ore('listAllegg') * 1)
    .outputs(item('enderio:item_material', 70) * 1)
    .duration(80)
    .EUt(8)
    .buildAndRegister()

//Infinity Rod
crafting.removeByOutput(item('enderio:item_material', 71))
recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('dustBedrock') * 3, ore('stickLongDarkSteel') * 1)
    .outputs(item('enderio:item_material', 71) * 1)
    .duration(80)
    .EUt(8)
    .buildAndRegister()


//Dark Bimetal Gear
crafting.removeByOutput(item('enderio:item_material', 73))
recipemap('fluid_solidifier').recipeBuilder()
    .notConsumable(metaitem('shape.mold.gear') * 1)
    .inputs(ore('gearIronInfinity') * 1)
    .outputs(item('enderio:item_material', 73) * 1)
    .fluidInputs(fluid('dark_steel') * 576)
    .duration(100)
    .EUt(7)
    .buildAndRegister()

//Infinity Reagent
recipemap('mixer').recipeBuilder()
    .inputs(ore('dustBedrock') * 1, ore('dustCoal') * 1)
    .outputs(item('enderio:item_material', 75) * 2)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .circuitMeta(5)
    .duration(40)
    .EUt(16)
    .buildAndRegister()

recipemap('mixer').recipeBuilder()
    .inputs(ore('dustBedrock') * 1, ore('dustCharcoal') * 1)
    .outputs(item('enderio:item_material', 75) * 2)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .circuitMeta(5)
    .duration(40)
    .EUt(16)
    .buildAndRegister()

recipemap('mixer').recipeBuilder()
    .inputs(ore('dustBedrock') * 1, ore('dustCarbon') * 1)
    .outputs(item('enderio:item_material', 75) * 2)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .circuitMeta(5)
    .duration(40)
    .EUt(16)
    .buildAndRegister()

//Clay-Coated Glowstone Dust
recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('itemClay') * 1, ore('dustGlowstone') * 1)
    .outputs(item('enderio:item_material', 76) * 1)
    .duration(100)
    .EUt(8)
    .buildAndRegister()

//Black Paper
crafting.removeByOutput(item('enderio:item_material', 77))
recipemap('chemical_bath').recipeBuilder()
    .inputs(ore('paper') * 1)
    .chancedOutput(item('enderio:item_material', 77) * 1, 9000, 100)
    .fluidInputs(fluid('dye_black') * 144)
    .duration(80)
    .EUt(8)
    .buildAndRegister()

//Unfired Death Urn
crafting.removeByOutput(item('enderio:item_material', 81))
crafting.addShaped(item('enderio:item_material', 81), [
    [metaitem('compressed.clay'), ore('itemPulsatingPowder'), metaitem('compressed.clay')],
    [metaitem('compressed.clay'), ore('craftingToolSoftHammer'), metaitem('compressed.clay')],
    [metaitem('compressed.clay'), metaitem('compressed.clay'), metaitem('compressed.clay')]
])

//Grains Of Infinity/Infinity Dust
recipemap('macerator').recipeBuilder()
    .inputs(ore('compressed1xDustBedrock') * 1)
    .outputs(item('enderio:item_material', 20) * 9)
    .chancedOutput(item('enderio:block_infinity_fog'), 500, 100)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Glowstone Nano-Particles
recipemap('macerator').recipeBuilder()
    .inputs(ore('itemClayedGlowstone') * 1)
    .chancedOutput(item('enderio:block_holier_fog'), 9500, 50)
    .chancedOutput(metaitem('dustClay'), 500, 0)
    .duration(200)
    .EUt(2)
    .buildAndRegister()

//Death Urn
recipemap('alloy_smelter').recipeBuilder()
    .inputs(ore('itemDeathUrnUnfired') * 1, ore('itemPrecientPowder') * 4)
    .outputs(item('enderio:block_death_pouch') * 1)
    .duration(600)
    .EUt(512)
    .buildAndRegister()

//Tormented Enderman Head
mods.enderio.slice_n_splice.remove(item('enderio:block_enderman_skull', 2))
mods.enderio.slice_n_splice.recipeBuilder()
    .input(ore('plateSoularium'), item('enderio:block_enderman_skull'), ore('plateSoularium'))
    .input(item('minecraft:potion').withNbt(['Potion': 'minecraft:water']), ore('capacitorPrimative'), item('minecraft:potion').withNbt(['Potion': 'minecraft:water']))
    .output(item('enderio:block_enderman_skull', 2))
    .energy(20000)
    .register()

//"Enderios"
crafting.removeByOutput(item('enderio:item_ender_food'))
recipemap('mixer').recipeBuilder()
    .inputs(item('minecraft:bowl') * 1, ore('foodFlour') * 1, ore('dustEnderPearl') * 4, ore('dustSugar') * 7)
    .outputs(item('enderio:item_ender_food') * 1)
    .fluidInputs(fluid('milk') * 1000)
    .circuitMeta(5)
    .duration(600)
    .EUt(512)
    .buildAndRegister()

//Grainy Capacitor
crafting.removeByOutput(item('enderio:item_capacitor_grainy'))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilElectricalSteel') * 16, ore('dustBedrock') * 2, ore('boltElectricalSteel') * 2)
    .outputs(item('enderio:item_capacitor_grainy') * 1)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .duration(100)
    .EUt(6)
    .buildAndRegister()

//Crystalline Capacitor
crafting.removeByOutput(item('enderio:item_capacitor_crystalline'))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilCrystallineAlloy') * 16, ore('capacitorIntegrated') * 2, ore('boltElectricalSteel') * 2)
    .outputs(item('enderio:item_capacitor_crystalline') * 1)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .duration(1600)
    .EUt(1536)
    .buildAndRegister()

//Melodic Capacitor
crafting.removeByOutput(item('enderio:item_capacitor_melodic'))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilMelodicAlloy') * 16, ore('capacitorAdvanced') * 2, ore('boltElectricalSteel') * 2)
    .outputs(item('enderio:item_capacitor_melodic') * 1)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .duration(3200)
    .EUt(6144)
    .buildAndRegister()

//Stellar Capacitor
crafting.removeByOutput(item('enderio:item_capacitor_stellar'))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilStellarAlloy') * 16, ore('capacitorExtreme') * 2, ore('boltElectricalSteel') * 2)
    .outputs(item('enderio:item_capacitor_stellar') * 1)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .duration(6400)
    .EUt(24576)
    .buildAndRegister()

//Totemic Capacitor
mods.enderio.slice_n_splice.remove(item('enderio:item_capacitor_totemic'))
mods.enderio.slice_n_splice.recipeBuilder()
    .input(ore('plateSoularium'), item('minecraft:totem_of_undying'), ore('plateSoularium'))
    .input(ore('itemVibrantPowder'), item('enderio:item_capacitor_crystalline'), ore('itemVibrantPowder'))
    .output(item('enderio:item_capacitor_totemic'))
    .energy(20000)
    .register()

//Silver Capacitor
crafting.removeByOutput(item('enderio:item_capacitor_silver'))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilSilver') * 16, ore('capacitorPathetic') * 2, ore('boltElectricalSteel') * 2)
    .outputs(item('enderio:item_capacitor_silver') * 1)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .duration(200)
    .EUt(24)
    .buildAndRegister()

//Endergetic Silver Capacitor
crafting.removeByOutput(item('enderio:item_capacitor_energetic_silver'))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilEnergeticSilver') * 16, ore('capacitorPrimative') * 2, ore('boltElectricalSteel') * 2)
    .outputs(item('enderio:item_capacitor_energetic_silver') * 1)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .duration(400)
    .EUt(96)
    .buildAndRegister()


//Endergised Capacitor
crafting.removeByOutput(item('enderio:item_capacitor_vivid'))
recipemap('assembler').recipeBuilder()
    .inputs(ore('foilVividAlloy') * 16, ore('capacitorBasic') * 2, ore('boltElectricalSteel') * 2)
    .outputs(item('enderio:item_capacitor_vivid') * 1)
    .fluidInputs(fluid('soldering_alloy') * 72)
    .duration(800)
    .EUt(384)
    .buildAndRegister()

//Soul Vial
crafting.removeByOutput(item('enderio:item_soul_vial'))
crafting.addShaped(item('enderio:item_soul_vial'), [
    [null, metaitem('roundSoularium'), null],
    [null, metaitem('component.borosilicate_glass.tube'), null],
    [null, null, null]
])
