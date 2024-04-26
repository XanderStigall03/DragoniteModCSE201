package net.user.dragonitemod;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.user.dragonitemod.block.ModBlocks;
import net.user.dragonitemod.entity.ModEntities;
import net.user.dragonitemod.entity.client.PigRenderer;
import net.user.dragonitemod.entity.client.ZombieRenderer;
import net.user.dragonitemod.entity.custom.FireballProjectileEntity;
import net.user.dragonitemod.item.ModCreativeModTabs;
import net.user.dragonitemod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DragoniteMod.MOD_ID)
public class DragoniteMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "dragonitemod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public DragoniteMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Calls item list to be loaded
        ModItems.register(modEventBus);

        // Calls block list to be loaded
        ModBlocks.register(modEventBus);

        // Calls creative tabs list to be loaded
        ModCreativeModTabs.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register mob entities
        ModEntities.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        // Load custom items into specific creative mode tabs
        /*
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.SCALE_DRAGON);
            event.accept(ModItems.INGOT_DRAGONITE);
        } */
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(ModEntities.PIGDRAGON.get(), PigRenderer::new);
            EntityRenderers.register(ModEntities.ZOMBIEDRAGON.get(), ZombieRenderer::new);
            //EntityRenderers.register(ModEntities.FIREBALL_PROJECTILE.get(), ThrownItemRenderer::new);
        }
    }
}
