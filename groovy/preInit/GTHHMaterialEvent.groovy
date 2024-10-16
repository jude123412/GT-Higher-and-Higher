import net.minecraftforge.fml.common.eventhandler.EventPriority
import gregtech.api.unification.material.event.MaterialEvent

import materials.GTHHMaterials

import material.GTHHMaterialFlags

import handler.GTHHMaterialRecipeHandler
import handler.GTHHOreRecipeHandler

log.infoMC("Adding new Material Event")
eventManager.listen(EventPriority.HIGHEST) { MaterialEvent event ->

        log.infoMC("Registering new Materials")
        GTHHMaterials.init()

        log.infoMC("Modifying Material flags")
        GTHHMaterialFlags.init()

        log.infoMC("Adding Material Recipe Handler...")
        GTHHMaterialRecipeHandler.register()

        log.infoMC("Adding Ore Recipe Handler...")
        GTHHOreRecipeHandler.register()

}