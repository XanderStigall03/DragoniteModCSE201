package net.user.dragonitemod.item.custom;


import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;

import java.util.Map;


public class DragoniteBowItem extends BowItem {

    public DragoniteBowItem(Properties pProperties) {
        super(pProperties);
        ItemStack bowStack = new ItemStack(this);
        applyEnchantments(bowStack);
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        // Allow Flame, Punch, and Infinity enchantments on the custom bow
        return enchantment == Enchantments.FLAMING_ARROWS ||
                enchantment == Enchantments.PUNCH_ARROWS ||
                enchantment == Enchantments.INFINITY_ARROWS;
    }

    // Method to apply enchantments to the bow
    public static void applyEnchantments(ItemStack stack) {
        // Apply Flame, Punch, and Infinity enchantments to the item
        EnchantmentInstance flameEnchantment = new EnchantmentInstance(Enchantments.FLAMING_ARROWS, 1);
        EnchantmentInstance punchEnchantment = new EnchantmentInstance(Enchantments.PUNCH_ARROWS, 1);
        EnchantmentInstance infinityEnchantment = new EnchantmentInstance(Enchantments.INFINITY_ARROWS, 1);

        Map<Enchantment, Integer> enchantments = Map.of(
                flameEnchantment.enchantment, flameEnchantment.level,
                punchEnchantment.enchantment, punchEnchantment.level,
                infinityEnchantment.enchantment, infinityEnchantment.level
        );

        EnchantmentHelper.setEnchantments(enchantments, stack);
    }
}