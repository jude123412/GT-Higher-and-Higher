    import crafttweaker.item.IItemStack;
    import crafttweaker.item.IIngredient;
    import mods.aether_legacy.Freezer;

    val ingotHotCobalt = <gregtech:meta_ingot_hot:23>;
    val ingotCobalt = <gregtech:meta_ingot:23>;

    val registerFreezerRecipeInput = [
        ingotHotCobalt,
    ]as IItemStack[];

    val registerFreezerRecipeOutput = [
        ingotCobalt,
    ]as IItemStack[];

    val registerFreezerRecipeTime = [
        200,
    ]as int[];

    for index, recipeInput in registerFreezerRecipeInput {
        val recipeOutput = registerFreezerRecipeOutput[index];
        val recipeTime = registerFreezerRecipeTime[index];

        Freezer.registerFreezable(recipeInput, recipeOutput, recipeTime);
}
    val freezerRecipeRemoval = [
        <aether_legacy:iron_ring>,
        <aether_legacy:golden_ring>,
        <aether_legacy:iron_pendant>,
        <aether_legacy:golden_pendant>
    ]as IItemStack[];

    for recipeInput in freezerRecipeRemoval{
        Freezer.removeFreezable(recipeInput);
    }