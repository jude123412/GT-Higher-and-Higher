import gregtech.api.metatileentity.MetaTileEntity
import gregtech.common.metatileentities.MetaTileEntities
import gregtech.common.metatileentities.electric.MetaTileEntitySingleTurbine
import gregtech.common.metatileentities.electric.MetaTileEntitySingleCombustion
import gregtech.api.util.GTUtility
import gregtech.client.renderer.texture.Textures
import gregtech.api.recipes.RecipeMaps

import metatileentity.GTHHMetaTileEntityMacerationStack
import metatileentity.GTHHMetaTileEntitySteamForgeHammer
import metatileentity.GTHHMetaTileEntitySteamCompressor

import classes.GTHHRecipeMaps
import classes.GTHHTextures

log.infoMC("Registering MetaTileEntities...")

//GTHH Multiblocks
MetaTileEntities.registerMetaTileEntity(6000, new GTHHMetaTileEntityMacerationStack(new ResourceLocation("gregtech", "maceration_stack")) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6001, new GTHHMetaTileEntitySteamForgeHammer(new ResourceLocation("gregtech", "steam_smasher")) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(6002, new GTHHMetaTileEntitySteamCompressor(new ResourceLocation("gregtech", "steam_squasher")) as MetaTileEntity)

//Zombie Engine 4000-4014
MetaTileEntities.registerMetaTileEntity(4001, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "zombie_engine.lv"), GTHHRecipeMaps.ZOMBIE_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 1, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(4002, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "zombie_engine.mv"), GTHHRecipeMaps.ZOMBIE_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 2, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(4003, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "zombie_engine.hv"), GTHHRecipeMaps.ZOMBIE_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 3, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)

// Ender Engine 4015-4029
MetaTileEntities.registerMetaTileEntity(4016, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "ender_engine.lv"), GTHHRecipeMaps.ENDER_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 1, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(4017, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "ender_engine.mv"), GTHHRecipeMaps.ENDER_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 2, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)
MetaTileEntities.registerMetaTileEntity(4018, new MetaTileEntitySingleCombustion(new ResourceLocation("gregtech", "ender_engine.hv"), GTHHRecipeMaps.ENDER_ENGINE_FUELS, Textures.COMBUSTION_GENERATOR_OVERLAY, 3, GTUtility.genericGeneratorTankSizeFunction) as MetaTileEntity)


//Textures.COMBUSTION_GENERATOR_OVERLAY
//GTHHTextures.ZOMBIE_ENGINE_OVERLAY
//GTHHTextures.ENDER_ENGINE_OVERLAY

