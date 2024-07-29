import net.minecraftforge.fml.common.eventhandler.EventPriority
import gregtech.api.unification.material.event.MaterialEvent

import materials.GTHHMaterials
import materials.GTHHMaterialIconSet
import classes.GTHHMaterialFlags

log.infoMC("Adding new Material Event Manager")

eventManager.listen(EventPriority.LOWEST) {
    MaterialEvent event ->

        log.infoMC("Registering new Icon Sets")
        GTHHMaterialIconSet.init()

        log.infoMC("Registering new Materials")
        GTHHMaterials.init()

        log.infoMC("Modifying Material flags")
        GTHHMaterialFlags.init()

        
}
