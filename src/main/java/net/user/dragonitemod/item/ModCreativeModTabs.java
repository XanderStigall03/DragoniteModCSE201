package net.user.dragonitemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.block.ModBlocks;

public class ModCreativeModTabs {

    // Creating an array of modded creative mode tabs
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DragoniteMod.MOD_ID);

    // Create a modded creative tab
    public static final RegistryObject<CreativeModeTab> DRAGONITE_TAB =
            CREATIVE_MODE_TABS.register("dragonite_tab",() -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SCALE_DRAGON.get()))
                    .title(Component.translatable("creativetab.dragonite_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Load items into mod tab display
                        pOutput.accept(ModItems.SCALE_DRAGON.get());
                        pOutput.accept(ModItems.INGOT_DRAGONITE.get());

                        // Load blocks into mod tab display
                        pOutput.accept(ModBlocks.ORE_DRAGONITE.get());
                        pOutput.accept(ModBlocks.BLOCK_DRAGONITE.get());
                    })
                    .build());


    // Loads list into game
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
