crafting.removeByOutput(metaitem('electric_blast_furnace'))
crafting.removeByOutput(metaitem('vacuum_freezer'))

//Steam Smasher
crafting.addShaped(metaitem('gthh_steam_smasher'), [
    [item('gregtech:metal_casing'), metaitem('gearSteel'), item('gregtech:metal_casing')],
    [item('gregtech:metal_casing'), metaitem('steam_hammer_bronze'), item('gregtech:metal_casing')],
    [item('gregtech:metal_casing'), metaitem('gearSteel'), item('gregtech:metal_casing')]
])

//Steam Squasher
crafting.addShaped(metaitem('gthh_steam_squasher'), [
    [item('gregtech:metal_casing'), metaitem('gearSteel'), item('gregtech:metal_casing')],
    [item('gregtech:metal_casing'), metaitem('steam_compressor_bronze'), item('gregtech:metal_casing')],
    [item('gregtech:metal_casing'), metaitem('gearSteel'), item('gregtech:metal_casing')]
])

//GTHH Electric Blast Furnace
crafting.addShaped(metaitem('gthh_electric_blast_furnace'), [
    [item('minecraft:furnace'), item('minecraft:furnace'), item('minecraft:furnace')],
    [ore('circuitHv'), item('gregtech:metal_casing', 2), ore('circuitHv')],
    [metaitem('cableGtSingleTin'), ore('circuitHv'), metaitem('cableGtSingleTin')]
])

crafting.addShapeless(metaitem('gthh_electric_blast_furnace'), 
    [metaitem('electric_blast_furnace')]
)

//GTHH Vacuum Freezer
crafting.addShaped(metaitem('gthh_vacuum_freezer'), [
    [metaitem('electric.pump.hv'), metaitem('electric.pump.hv'), metaitem('electric.pump.hv')],
    [ore('circuitEv'), item('gregtech:metal_casing', 3), ore('circuitEv')],
    [metaitem('cableGtSingleGold'), ore('circuitEv'), metaitem('cableGtSingleGold')]
])

crafting.addShapeless(metaitem('gthh_vacuum_freezer'), 
    [metaitem('vacuum_freezer')]
)