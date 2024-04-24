package net.user.dragonitemod.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.entity.client.ModModelLayers;
import net.user.dragonitemod.entity.client.PigDragonModel;

@Mod.EventBusSubscriber(modid = DragoniteMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PIGDRAGON_LAYER, PigDragonModel::createBodyLayer);
    }
}
