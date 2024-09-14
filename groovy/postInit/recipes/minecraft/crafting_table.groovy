crafting.removeByOutput(item('minecraft:crafting_table'))

crafting.addShaped(item('minecraft:crafting_table'), [
    [ore('gemFlint'), ore('gemFlint'), null],
    [ore('logWood'), ore('logWood'), null],
    [null, null, null]
])