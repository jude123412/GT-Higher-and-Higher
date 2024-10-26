package preInit

import net.minecraftforge.fml.common.eventhandler.EventPriority
import gregtech.api.unification.material.event.PostMaterialEvent

import classes.GTHHMetaItem
import classes.GTHHStoneTypes

log.infoMC("Adding new Post Material Event")

eventManager.listen(EventPriority.LOWEST) { PostMaterialEvent event ->

        log.infoMC("Adding Meta Items...")
        GTHHMetaItem.registerMetaItem2()
        GTHHMetaItem.registerMetaItem3()

        log.infoMC("Adding Stone Types...")
        GTHHStoneTypes.register()

}