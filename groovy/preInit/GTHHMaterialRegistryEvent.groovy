import net.minecraftforge.fml.common.eventhandler.EventPriority
import gregtech.api.unification.material.event.MaterialRegistryEvent

import classes.GTHHOreDictionary

log.infoMC("Adding new Material Registry Event")
eventManager.listen(EventPriority.HIGHEST) { MaterialRegistryEvent event ->

        log.infoMC("Adding Ore Dictionaries...")
        GTHHOreDictionary.register()

}