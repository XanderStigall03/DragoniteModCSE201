package net.user.dragonitemod.item;

import net.user.dragonitemod.DragoniteMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tiers;
import net.user.dragonitemod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier DRAGONITE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2500, 1.6f,7f, 30,
                    ModTags.Blocks.NEEDS_DRAGONITE_TOOL, () -> Ingredient.of(ModItems.INGOT_DRAGONITE.get())),
            new ResourceLocation(DragoniteMod.MOD_ID, "dragonite"), List.of(Tiers.NETHERITE), List.of());
}
