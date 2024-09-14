import net.minecraftforge.fml.common.eventhandler.EventPriority
import gregtech.api.unification.material.event.MaterialEvent

import materials.GTHHMaterials
import material.GTHHMaterialFlags

log.infoMC("Adding new Material Event")

eventManager.listen(EventPriority.LOWEST) { MaterialEvent event ->

        log.infoMC("Registering new Materials")
        GTHHMaterials.init()

        log.infoMC("Modifying Material flags")
        GTHHMaterialFlags.init()
        
}
