package net.user.dragonitemod.item;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.user.dragonitemod.DragoniteMod;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    DRAGONITE("dragonite", 26, new int[]{5,7,5,4}, 25,
    SoundEvents.ARMOR_EQUIP_GOLD, 1f, 0f, () -> Ingredient.of(ModItems.DRAGONITE.get()));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @java.lang.Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @java.lang.Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.protectionAmounts[type.ordinal()];
    }

    @java.lang.Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @java.lang.Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @java.lang.Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @java.lang.Override
    public java.lang.String getName() {
        return DragoniteMod.MOD_ID + ":" + this.name;
    }

    @java.lang.Override
    public float getToughness() {
        return this.toughness;
    }

    @java.lang.Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
