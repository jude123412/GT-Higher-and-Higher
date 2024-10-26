import gregtech.api.metatileentity.MetaTileEntity
import gregtech.common.metatileentities.MetaTileEntities
import gregtech.common.metatileentities.electric.MetaTileEntitySingleTurbine
import gregtech.common.metatileentities.electric.MetaTileEntitySingleCombustion
import gregtech.common.metatileentities.electric.SimpleMachineMetaTileEntityResizable
import gregtech.api.metatileentity.SimpleMachineMetaTileEntity
import gregtech.api.util.GTUtility
import gregtech.client.renderer.texture.Textures
import gregtech.api.recipes.RecipeMaps

import metatileentity.*

import classes.GTHHRecipeMaps
import classes.GTHHTextures

log.infoMC("Registering MetaTileEntities...")

//GTHH Multiblocks 6000-6499
MetaTileEntities.registerMetaTileEntity(6000, new GTHHMetaTileEntityMacerationStack(new ResourceLocation("gregtech", "gthh_maceration_stack")) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6001, new GTHHMetaTileEntitySteamForgeHammer(new ResourceLocation("gregtech", "gthh_steam_smasher")) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6002, new GTHHMetaTileEntitySteamCompressor(new ResourceLocation("gregtech", "gthh_steam_squasher")) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6003, new GTHHMetaTileEntityElectricBlastFurance(new ResourceLocation("gregtech", "gthh_electric_blast_furnace")) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6004, new GTHHMetaTileEntityVacuumFreezer(new ResourceLocation("gregtech", "gthh_vacuum_freezer")) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6005, new GTHHMetaTileEntityPreciseAssembler(new ResourceLocation("gregtech", "gthh_precise_assembler")) as MetaTileEntity)

//Zombie Engine 4000-4014
MetaTileEntities.registerMetaTileEntity(4001, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "zombie_engine.lv"), GTHHRecipeMaps.ZOMBIE_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 1, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(4002, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "zombie_engine.mv"), GTHHRecipeMaps.ZOMBIE_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 2, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(4003, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "zombie_engine.hv"), GTHHRecipeMaps.ZOMBIE_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 3, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)

// Ender Engine 4015-4029
MetaTileEntities.registerMetaTileEntity(4016, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "ender_engine.lv"), GTHHRecipeMaps.ENDER_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 1, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(4017, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "ender_engine.mv"), GTHHRecipeMaps.ENDER_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 2, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(4018, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "ender_engine.hv"), GTHHRecipeMaps.ENDER_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 3, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)


//Precise Assembler 6500-6512
MetaTileEntities.registerMetaTileEntity(6500, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.lv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 1, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6501, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.mv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 2, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6502, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.hv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 3, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6503, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.ev"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 4, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6504, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.iv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 5, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6505, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.luv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 6, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6506, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.zpm"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 7, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6507, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.uv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 8, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6508, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.uhv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 9, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6509, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.uev"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 10, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6510, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.uiv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 11, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6511, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.uxv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 12, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6512, new SimpleMachineMetaTileEntity(new ResourceLocation("gregtech", "precise_assembler.opv"), GTHHRecipeMaps.GTHH_PRECISE_RECIPES, Textures.ASSEMBLER_OVERLAY, 13, false, GTUtility.hvCappedTankSizeFunction) as MetaTileEntity)

//Textures.COMBUSTION_GENERATOR_OVERLAY
//GTHHTextures.ZOMBIE_ENGINE_OVERLAY
//GTHHTextures.ENDER_ENGINE_OVERLAY

