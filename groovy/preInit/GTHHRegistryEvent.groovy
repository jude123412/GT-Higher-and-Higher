import net.minecraftforge.event.RegistryEvent
import net.minecraft.item.crafting.IRecipe

import classes.GTHHOreRecipeHandler


eventManager.listen { RegistryEvent.Register<IRecipe> event ->
        log.infoMC("Adding Ore Recipe Handler...")
        GTHHOreRecipeHandler.register()


}