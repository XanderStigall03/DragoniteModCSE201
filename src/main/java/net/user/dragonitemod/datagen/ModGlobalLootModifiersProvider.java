package net.user.dragonitemod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.item.ModItems;
import net.user.dragonitemod.loot.AddItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, DragoniteMod.MOD_ID);
    }

    @Override
    protected void start() {
        add("scale_dragon_from_dragon", new AddItemModifier(new LootItemCondition[]
                {
                        new LootTableIdCondition.Builder(new ResourceLocation("entities/ender_dragon")).build() }, ModItems.SCALE_DRAGON.get()));
    }
}
