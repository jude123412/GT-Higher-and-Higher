crafting.removeByOutput(item('harvestcraft:flouritem'))
furnace.removeByInput(item('appliedenergistics2:material', 4))

crafting.addShapeless(item('harvestcraft:flouritem'), [ore('toolMortarandpestle'), ore('listAllgrain')])
furnace.add(item('harvestcraft:doughitem'), item('minecraft:bread'), 0.1f)
