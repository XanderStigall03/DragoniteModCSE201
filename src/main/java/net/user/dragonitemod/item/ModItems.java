package net.user.dragonitemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.user.dragonitemod.DragoniteMod;

public class ModItems {

    // Creates the array that holds all new items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragoniteMod.MOD_ID);

    // Register new items
    // Ex: public static final RegistryObject<Item> CODEREFNAME = ITEMS.register("itemidname", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCALE_DRAGON =
            ITEMS.register("scale_dragon", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INGOT_DRAGONITE =
            ITEMS.register("ingot_dragonite", () -> new Item(new Item.Properties()));

    // Loads items into game

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
