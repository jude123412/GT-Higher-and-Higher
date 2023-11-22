import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;

//Drawer Recipe Changes
recipes.remove(<storagedrawers:framingtable>);
recipes.addShaped(<storagedrawers:framingtable>,[
	[<storagedrawers:customtrim>,<storagedrawers:customtrim>,<storagedrawers:customtrim>],
	[<storagedrawers:customtrim>,<ore:craftingToolSaw>,<storagedrawers:customtrim>]
]);
recipes.remove(<storagedrawers:drawer_key>);
recipes.addShaped(<storagedrawers:drawer_key>,[
	[<ore:nuggetGold>, <ore:ingotGold>, null],
	[<ore:craftingToolHardHammer>, <ore:ingotGold>, null],
	[null, <storagedrawers:upgrade_template>, null]
]);
recipes.remove(<storagedrawers:controllerslave>);
recipes.addShaped(<storagedrawers:controllerslave>,[
	[<ore:stone>,<ore:circuitAdvanced>,<ore:stone>],
	[<ore:stone>,<storagedrawers:customdrawers:*>,<ore:stone>],
	[<ore:stone>,<ore:ingotGold>,<ore:stone>]
]);
recipes.remove(<storagedrawers:controller>);
recipes.addShaped(<storagedrawers:controller>,[
	[<ore:stone>,<ore:circuitExtreme>,<ore:stone>],
	[<ore:stone>,<storagedrawers:customdrawers:*>,<ore:stone>],
	[<ore:stone>,<ore:gemDiamond>,<ore:stone>]
]);

//Upgrade Recipe Changes
recipes.remove(<storagedrawers:upgrade_template>);
recipes.addShapeless(<storagedrawers:upgrade_template>,[
	<ore:craftingToolSaw>,<storagedrawers:customtrim>
]);
recipes.remove(<storagedrawers:upgrade_storage>);
recipes.addShaped(<storagedrawers:upgrade_storage>,[
	[<ore:plateBronze>,<ore:plateBronze>,<ore:plateBronze>],
	[<ore:plateBronze>,<storagedrawers:upgrade_template>,<ore:plateBronze>],
	[<ore:plateBronze>,<ore:plateBronze>,<ore:plateBronze>]
]);
recipes.remove(<storagedrawers:upgrade_storage:1>);
recipes.addShaped(<storagedrawers:upgrade_storage:1>,[
	[<ore:plateSteel>,<ore:plateSteel>,<ore:plateSteel>],
	[<ore:plateSteel>,<storagedrawers:upgrade_template>,<ore:plateSteel>],
	[<ore:plateSteel>,<ore:plateSteel>,<ore:plateSteel>]
]);
recipes.remove(<storagedrawers:upgrade_storage:2>);
recipes.addShaped(<storagedrawers:upgrade_storage:2>,[
	[<ore:plateStainlessSteel>,<ore:plateStainlessSteel>,<ore:plateStainlessSteel>],
	[<ore:plateStainlessSteel>,<storagedrawers:upgrade_template>,<ore:plateStainlessSteel>],
	[<ore:plateStainlessSteel>,<ore:plateStainlessSteel>,<ore:plateStainlessSteel>]
]);
recipes.remove(<storagedrawers:upgrade_storage:3>);
recipes.addShaped(<storagedrawers:upgrade_storage:3>,[
	[<ore:plateTitanium>,<ore:plateTitanium>,<ore:plateTitanium>],
	[<ore:plateTitanium>,<storagedrawers:upgrade_template>,<ore:plateTitanium>],
	[<ore:plateTitanium>,<ore:plateTitanium>,<ore:plateTitanium>]
]);
recipes.remove(<storagedrawers:upgrade_storage:4>);
recipes.addShaped(<storagedrawers:upgrade_storage:4>,[
	[<ore:plateTungstenSteel>,<ore:plateTungstenSteel>,<ore:plateTungstenSteel>],
	[<ore:plateTungstenSteel>,<storagedrawers:upgrade_template>,<ore:plateTungstenSteel>],
	[<ore:plateTungstenSteel>,<ore:plateTungstenSteel>,<ore:plateTungstenSteel>]
]);
recipes.remove(<storagedrawers:upgrade_one_stack>);
recipes.addShaped(<storagedrawers:upgrade_one_stack>,[
	[<minecraft:flint>,<minecraft:flint>,<minecraft:flint>],
	[<minecraft:flint>,<storagedrawers:upgrade_template>,<minecraft:flint>],
	[<minecraft:flint>,<minecraft:flint>,<minecraft:flint>]
]);
// Jei Item hide
val IArray = [<storagedrawers:basicdrawers>.withTag({material: "oak"}),
	<storagedrawers:basicdrawers>.withTag({material: "oak"}),
	<storagedrawers:basicdrawers>.withTag({material: "spruce"}),
	<storagedrawers:basicdrawers>.withTag({material: "birch"}),
	<storagedrawers:basicdrawers>.withTag({material: "jungle"}),
	<storagedrawers:basicdrawers>.withTag({material: "acacia"}),
	<storagedrawers:basicdrawers>.withTag({material: "dark_oak"}),
	<storagedrawers:basicdrawers:3>.withTag({material: "oak"}),
	<storagedrawers:basicdrawers:3>.withTag({material: "spruce"}),
	<storagedrawers:basicdrawers:3>.withTag({material: "birch"}),
	<storagedrawers:basicdrawers:3>.withTag({material: "jungle"}),
	<storagedrawers:basicdrawers:3>.withTag({material: "acacia"}),
	<storagedrawers:basicdrawers:3>.withTag({material: "dark_oak"}),
	<storagedrawers:basicdrawers:4>.withTag({material: "oak"}),
	<storagedrawers:basicdrawers:4>.withTag({material: "spruce"}),
	<storagedrawers:basicdrawers:4>.withTag({material: "birch"}),
	<storagedrawers:basicdrawers:2>.withTag({material: "oak"}),
	<storagedrawers:basicdrawers:2>.withTag({material: "spruce"}),
	<storagedrawers:basicdrawers:2>.withTag({material: "birch"}),
	<storagedrawers:basicdrawers:2>.withTag({material: "jungle"}),
	<storagedrawers:basicdrawers:2>.withTag({material: "acacia"}),
	<storagedrawers:basicdrawers:2>.withTag({material: "dark_oak"}),
	<storagedrawers:basicdrawers:4>.withTag({material: "jungle"}),
	<storagedrawers:basicdrawers:4>.withTag({material: "acacia"}),
	<storagedrawers:basicdrawers:4>.withTag({material: "dark_oak"}),
	<storagedrawers:basicdrawers:1>.withTag({material: "oak"}),
	<storagedrawers:basicdrawers:1>.withTag({material: "spruce"}),
	<storagedrawers:basicdrawers:1>.withTag({material: "birch"}),
	<storagedrawers:basicdrawers:1>.withTag({material: "jungle"}),
	<storagedrawers:basicdrawers:1>.withTag({material: "acacia"}),
	<storagedrawers:basicdrawers:1>.withTag({material: "dark_oak"}),
	<storagedrawers:compdrawers>,
	<storagedrawers:trim>,
	<storagedrawers:trim:1>,
	<storagedrawers:trim:2>,
	<storagedrawers:trim:3>,
	<storagedrawers:trim:4>,
	<storagedrawers:trim:5>] as IItemStack[];

for item in IArray {
    mods.jei.JEI.removeAndHide(item);
}
    
