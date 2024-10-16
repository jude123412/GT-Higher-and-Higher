log.infoMC("Changing EnderIO Filter Recipes...")

//Redstone Filter Base
crafting.removeByOutput(item('enderio:item_material', 60))
crafting.addShaped(item('enderio:item_material', 60), [
    [ore('plateRedstoneAlloy'), ore('plateIron'), ore('screwIron')],
    [ore('plateRedstoneAlloy'), ore('paperBlack'), ore('plateIron')],
    [ore('plateRedstoneAlloy'), ore('plateIron'), ore('screwIron')]
])

//Basic Item Filter
crafting.removeByOutput(item('enderio:item_basic_item_filter'))
crafting.addShaped(item('enderio:item_basic_item_filter'), [
    [ore('screwIron'), ore('plateIron'), ore('screwIron')],
    [ore('plateIron'), metaitem('item_filter'), ore('plateIron')],
    [ore('screwIron'), ore('plateIron'), ore('screwIron')]
])

//Advanced Item Filter
crafting.removeByOutput(item('enderio:item_advanced_item_filter'))
crafting.addShaped(item('enderio:item_advanced_item_filter'), [
    [ore('screwIron'), ore('plateIron'), ore('screwIron')],
    [item('enderio:item_basic_item_filter'), ore('skullZombieController'), item('enderio:item_basic_item_filter')],
    [ore('screwIron'), ore('plateIron'), ore('screwIron')]
])


//Limited Item Filter
crafting.removeByOutput(item('enderio:item_limited_item_filter'))
crafting.addShaped(item('enderio:item_limited_item_filter'), [
    [ore('screwIron'), ore('plateIron'), ore('screwIron')],
    [metaitem('robot.arm.mv'), item('enderio:item_advanced_item_filter'), metaitem('robot.arm.mv')],
    [ore('screwIron'), ore('plateIron'), ore('screwIron')]
])

//Big Item Filter
crafting.removeByOutput(item('enderio:item_big_item_filter'))
crafting.addShaped(item('enderio:item_big_item_filter'), [
    [ore('screwIron'), item('enderio:item_advanced_item_filter'), ore('screwIron')],
    [item('enderio:item_advanced_item_filter'), ore('skullSkeletalContractor'), item('enderio:item_advanced_item_filter')],
    [ore('screwIron'), item('enderio:item_advanced_item_filter'), ore('screwIron')]
])

//Advanced Big Item Filter
crafting.removeByOutput(item('enderio:item_big_advanced_item_filter'))
crafting.addShaped(item('enderio:item_big_advanced_item_filter'), [
    [ore('screwIron'), item('enderio:item_advanced_item_filter'), ore('screwIron')],
    [item('minecraft:shulker_shell'), item('enderio:item_big_item_filter'), item('minecraft:shulker_shell')],
    [ore('screwIron'), item('enderio:item_advanced_item_filter'), ore('screwIron')]
])

//Existing Item Filter
crafting.removeByOutput(item('enderio:item_existing_item_filter'))
crafting.addShaped(item('enderio:item_existing_item_filter'), [
    [ore('screwRedstoneAlloy'), ore('craftingRedstoneTorch'), ore('screwRedstoneAlloy')],
    [ore('plateRedstoneAlloy'), item('enderio:item_advanced_item_filter'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('plateRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

//Mod Based Item Filter
crafting.removeByOutput(item('enderio:item_mod_item_filter'))
crafting.addShaped(item('enderio:item_mod_item_filter'), [
    [ore('screwEnergeticSilver'), ore('plateEnergeticSilver'), ore('screwEnergeticSilver')],
    [ore('plateEnergeticSilver'), item('enderio:item_advanced_item_filter'), ore('plateEnergeticSilver')],
    [ore('screwEnergeticSilver'), ore('plateEnergeticSilver'), ore('screwEnergeticSilver')]
])

//Power Item Filter
crafting.removeByOutput(item('enderio:item_power_item_filter'))
crafting.addShaped(item('enderio:item_power_item_filter'), [
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')],
    [ore('plateElectricalSteel'), ore('batteryLv'), ore('plateElectricalSteel')],
    [ore('screwElectricalSteel'), ore('plateElectricalSteel'), ore('screwElectricalSteel')]
])

//Enchantment Item Filter
crafting.removeByOutput(item('enderio:item_enchantment_filter_normal'))
crafting.addShaped(item('enderio:item_enchantment_filter_normal'), [
    [ore('screwEnergeticAlloy'), ore('bookEnchanted'), ore('screwEnergeticAlloy')],
    [ore('plateEnergeticAlloy'), item('enderio:item_basic_item_filter'), ore('plateEnergeticAlloy')],
    [ore('screwEnergeticAlloy'), ore('plateEnergeticAlloy'), ore('screwEnergeticAlloy')]
])

//Big Enchantment Item Filter
crafting.removeByOutput(item('enderio:item_enchantment_filter_big'))
crafting.addShaped(item('enderio:item_enchantment_filter_big'), [
    [ore('screwEnergeticAlloy'), ore('bookEnchanted'), ore('screwEnergeticAlloy')],
    [ore('plateEnergeticAlloy'), item('enderio:item_big_item_filter'), ore('plateEnergeticAlloy')],
    [ore('screwEnergeticAlloy'), ore('plateEnergeticAlloy'), ore('screwEnergeticAlloy')]
])

//Redstone NOT Filter
crafting.removeByOutput(item('enderio:item_redstone_not_filter'))
crafting.addShaped(item('enderio:item_redstone_not_filter'), [
    [ore('screwRedstoneAlloy'), ore('plateRedstoneAlloy'), ore('screwRedstoneAlloy')],
    [ore('craftingRedstoneTorch'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('plateRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

//Redstone OR Filter
crafting.removeByOutput(item('enderio:item_redstone_or_filter'))
crafting.addShaped(item('enderio:item_redstone_or_filter'), [
    [ore('screwRedstoneAlloy'), ore('ingotRedstoneAlloy'), ore('screwRedstoneAlloy')],
    [ore('plateRedstoneAlloy'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('ingotRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

//Redstone AND Filter
crafting.removeByOutput(item('enderio:item_redstone_and_filter'))
crafting.addShaped(item('enderio:item_redstone_and_filter'), [
    [ore('screwRedstoneAlloy'), ore('craftingRedstoneTorch'), ore('screwRedstoneAlloy')],
    [ore('plateRedstoneAlloy'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('craftingRedstoneTorch'), ore('screwRedstoneAlloy')]
])

//Redstone NOR Filter
crafting.removeByOutput(item('enderio:item_redstone_nor_filter'))
crafting.addShaped(item('enderio:item_redstone_nor_filter'), [
    [ore('screwRedstoneAlloy'), ore('ingotRedstoneAlloy'), ore('screwRedstoneAlloy')],
    [ore('craftingRedstoneTorch'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('ingotRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

//Redstone NAND Filter
crafting.removeByOutput(item('enderio:item_redstone_nand_filter'))
crafting.addShaped(item('enderio:item_redstone_nand_filter'), [
    [ore('screwRedstoneAlloy'), ore('craftingRedstoneTorch'), ore('screwRedstoneAlloy')],
    [ore('craftingRedstoneTorch'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('craftingRedstoneTorch'), ore('screwRedstoneAlloy')]
])

//Redstone XOR Filter
crafting.removeByOutput(item('enderio:item_redstone_xor_filter'))
crafting.addShaped(item('enderio:item_redstone_xor_filter'), [
    [ore('screwRedstoneAlloy'), ore('plateRedstoneAlloy'), ore('screwRedstoneAlloy')],
    [ore('plateRedstoneAlloy'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('plateRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

//Redstone XNOR Filter
crafting.removeByOutput(item('enderio:item_redstone_xnor_filter'))
crafting.addShaped(item('enderio:item_redstone_xnor_filter'), [
    [ore('screwRedstoneAlloy'), ore('craftingRedstoneTorch'), ore('screwRedstoneAlloy')],
    [ore('craftingRedstoneTorch'), ore('itemRedstoneFilterBase'), ore('craftingRedstoneTorch')],
    [ore('screwRedstoneAlloy'), ore('craftingRedstoneTorch'), ore('screwRedstoneAlloy')]
])

//Redstone Toggle Latch Filter
crafting.removeByOutput(item('enderio:item_redstone_toggle_filter'))
crafting.addShaped(item('enderio:item_redstone_toggle_filter'), [
    [ore('screwRedstoneAlloy'), item('minecraft:lever'), ore('screwRedstoneAlloy')],
    [ ore('plateRedstoneAlloy'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('plateRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

//Redstone Counting Filter
crafting.removeByOutput(item('enderio:item_redstone_counting_filter'))
crafting.addShaped(item('enderio:item_redstone_counting_filter'), [
    [ore('screwRedstoneAlloy'), item('minecraft:stone_button'), ore('screwRedstoneAlloy')],
    [ore('ingotRedstoneAlloy'), ore('itemRedstoneFilterBase'), ore('ingotRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('ingotRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

//Redstone Sensor Filter
crafting.removeByOutput(item('enderio:item_redstone_sensor_filter'))
crafting.addShaped(item('enderio:item_redstone_sensor_filter'), [
    [ore('screwRedstoneAlloy'), item('minecraft:daylight_detector'), ore('screwRedstoneAlloy')],
    [ore('plateRedstoneAlloy'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('plateRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

//Redstone Timer Filter
crafting.removeByOutput(item('enderio:item_redstone_timer_filter'))
crafting.addShaped(item('enderio:item_redstone_timer_filter'), [
    [ore('screwRedstoneAlloy'), item('minecraft:clock'), ore('screwRedstoneAlloy')],
    [ore('plateRedstoneAlloy'), ore('itemRedstoneFilterBase'), ore('plateRedstoneAlloy')],
    [ore('screwRedstoneAlloy'), ore('plateRedstoneAlloy'), ore('screwRedstoneAlloy')]
])

