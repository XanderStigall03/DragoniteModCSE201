package net.user.dragonitemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties JIMMY_JOHNS = new FoodProperties.Builder()
            // Negative Effects
            .effect(() -> new MobEffectInstance(MobEffects.DARKNESS, 200), 1)
            .effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 200), 1)
            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 200), 1)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 200), 1)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100), 1)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100), 1)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 1)
            .effect(() -> new MobEffectInstance(MobEffects.HARM, 1), 1)
            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 50), 1)
            .meat()
            .nutrition(1)
            .saturationMod(1)
            // Positive effects that have a 10% chance of triggering
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 1000, 10), 0.1f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1000, 10), 0.1f)
            .build();

    // 10% chance for every effect in the game
    public static final FoodProperties DRAGON_STEW = new FoodProperties.Builder()
            .effect(new MobEffectInstance(MobEffects.DARKNESS, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.POISON, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.HARM, 1, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.REGENERATION, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.CONFUSION, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.WEAKNESS, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.BLINDNESS, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.CONDUIT_POWER, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.HEAL, 1, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.JUMP, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.LEVITATION, 20, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.LUCK, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.SATURATION, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.UNLUCK, 100, 5), 0.1f)
            .effect(new MobEffectInstance(MobEffects.WITHER, 100, 5), 0.1f)
            .build();
}