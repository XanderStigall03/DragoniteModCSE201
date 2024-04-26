package net.user.dragonitemod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.entity.ModEntities;
import net.user.dragonitemod.entity.custom.PigDragon;
import net.user.dragonitemod.entity.custom.ZombieDragon;

@Mod.EventBusSubscriber(modid = DragoniteMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PIGDRAGON.get(), PigDragon.createAttributes().build());
        event.put(ModEntities.ZOMBIEDRAGON.get(), ZombieDragon.createAttributes().build());
    }
}
