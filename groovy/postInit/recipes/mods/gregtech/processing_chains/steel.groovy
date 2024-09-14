// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), item('minecraft:coal') * 2 * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCoal') * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), item('minecraft:coal', 1) * 2 * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCharcoal') * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('gemCoke')], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_ingot'), metaitem('dustCoke')], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), item('minecraft:coal') * 2 * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), metaitem('dustCoal') * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), item('minecraft:coal', 1) * 2 * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), metaitem('dustCharcoal') * 2], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), metaitem('gemCoke')], null)
// Steel Ingot * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('ingotWroughtIron'), metaitem('dustCoke')], null)
// Block of Steel * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_block'), item('minecraft:coal_block') * 2 * 2], null)
// Block of Steel * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_block'), metaitem('blockCharcoal') * 2], null)
// Block of Steel * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [item('minecraft:iron_block'), metaitem('blockCoke')], null)
// Block of Steel * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('blockWroughtIron'), item('minecraft:coal_block') * 2 * 2], null)
// Block of Steel * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('blockWroughtIron'), metaitem('blockCharcoal') * 2], null)
// Block of Steel * 1
mods.gregtech.primitive_blast_furnace.removeByInput(1, [metaitem('blockWroughtIron'), metaitem('blockCoke')], null)

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotIron') * 1, ore('gemCoal') * 4)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(4800)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotIron') * 1, ore('dustCoal') * 4)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(4800)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotIron') * 1, ore('gemCharcoal') * 2)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(3600)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotIron') * 1, ore('dustCharcoal') * 2)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(3600)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotIron') * 1, ore('gemCoke') * 1)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(2400)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotIron') * 1, ore('dustCoke') * 1)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(2400)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotWroughtIron') * 1, ore('gemCoal') * 4)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(3600)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotWroughtIron') * 1, ore('dustCoal') * 4)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(3600)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotWroughtIron') * 1, ore('gemCharcoal') * 2)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(2400)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotWroughtIron') * 1, ore('dustCharcoal') * 2)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(2400)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotWroughtIron') * 1, ore('gemCoke') * 1)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(1200)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('ingotWroughtIron') * 1, ore('dustCoke') * 1)
    .outputs(metaitem('ingotSteel') * 1, metaitem('dustTinyDarkAsh') * 2)
    .duration(1200)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('blockIron') * 1, ore('blockCoal') * 4)
    .outputs(metaitem('blockSteel') * 1, metaitem('dustDarkAsh') * 2)
    .duration(43200)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('blockIron') * 1, ore('blockCharcoal') * 2)
    .outputs(metaitem('blockSteel') * 1, metaitem('dustDarkAsh') * 2)
    .duration(32400)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('blockIron') * 1, ore('blockCoke') * 1)
    .outputs(metaitem('blockSteel') * 1, metaitem('dustDarkAsh') * 2)
    .duration(21600)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('blockWroughtIron') * 1, ore('blockCoal') * 4)
    .outputs(metaitem('blockSteel') * 1, metaitem('dustDarkAsh') * 2)
    .duration(32400)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('blockWroughtIron') * 1, ore('blockCharcoal') * 2)
    .outputs(metaitem('blockSteel') * 1, metaitem('dustDarkAsh') * 2)
    .duration(21600)
    .buildAndRegister()

recipemap('primitive_blast_furnace').recipeBuilder()
    .inputs(ore('blockWroughtIron') * 1, ore('blockCoke') * 1)
    .outputs(metaitem('blockSteel') * 1, metaitem('dustDarkAsh') * 2)
    .duration(10800)
    .buildAndRegister()
