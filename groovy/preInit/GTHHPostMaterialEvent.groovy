import gregtech.api.unification.material.event.PostMaterialEvent

import classes.GTHHMetaItem
import classes.GTHHStoneTypes

log.infoMC("Adding new Post Material Event")

eventManager.listen { PostMaterialEvent event ->

        log.infoMC("Adding Meta Items...")
        GTHHMetaItem.register()

        log.infoMC("Adding Stone Types...")
        GTHHStoneTypes.register()

}