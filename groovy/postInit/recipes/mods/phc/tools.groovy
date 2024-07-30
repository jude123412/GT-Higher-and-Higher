crafting.removeByOutput(item('harvestcraft:bakewareitem'))
crafting.removeByOutput(item('harvestcraft:juiceritem'))

crafting.replaceShaped(item('harvestcraft:mixingbowlitem'), [
    [null, null, null],
    [ore('plankWood'), ore('stickWood'), ore('plankWood')],
    [ore('craftingToolSaw'), ore('plankWood'), ore('craftingToolSoftHammer')]
])

crafting.replaceShaped(item('harvestcraft:mortarandpestleitem'), [
    [null, null, null],
    [ore('stone'), ore('stickWood'), ore('stone')],
    [ore('craftingToolFile'), ore('stone'), ore('craftingToolHardHammer')]
])

crafting.replaceShaped(item('harvestcraft:cuttingboarditem'), [
    [ore('plateSteel'), ore('plateSteel'), ore('stickWood')],
    [ore('craftingToolFile'), ore('craftingToolHardHammer'), ore('stickWood')],
    [ore('slabWood'), ore('slabWood'), ore('slabWood')]
])

crafting.replaceShaped(item('harvestcraft:potitem'), [
    [ore('plateSteel'), null, ore('plateSteel')],
    [ore('plateSteel'), ore('craftingToolHardHammer'), ore('plateSteel')],
    [ore('plateSteel'), ore('plateSteel'), ore('plateSteel')]
])

crafting.replaceShaped(item('harvestcraft:skilletitem'), [
    [ore('craftingToolHardHammer'), ore('plateSteel'), ore('plateSteel')],
    [ore('screwSteel'), ore('plateSteel'), ore('plateSteel')],
    [ore('stickWood'), ore('screwSteel'), ore('craftingToolScrewdriver')]
])

crafting.replaceShaped(item('harvestcraft:saucepanitem'), [
    [ore('craftingToolScrewdriver'), ore('screwSteel'), ore('stickSteel')],
    [ore('plateSteel'), ore('plateSteel'), ore('screwSteel')],
    [ore('plateSteel'), ore('plateSteel'), ore('craftingToolHardHammer')]
])

crafting.replaceShaped(metaitem('unfired.bakeware'), [
        [metaitem('compressed.clay'), metaitem('compressed.clay'), metaitem('compressed.clay')],
    [metaitem('compressed.clay'), null, metaitem('compressed.clay')],
    [metaitem('compressed.clay'), metaitem('compressed.clay'), metaitem('compressed.clay')]
])

crafting.replaceShaped(metaitem('unfired.juicer'), [
    [null, metaitem('compressed.clay'), null],
    [metaitem('compressed.clay'), metaitem('compressed.clay'), metaitem('compressed.clay')],
    [null, metaitem('compressed.clay'), null]
])

furnace.add(metaitem('unfired.bakeware'), item('harvestcraft:bakewareitem'), 0.5f)
furnace.add(metaitem('unfired.juicer'), item('harvestcraft:juiceritem'), 0.5f)