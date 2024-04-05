package net.user.dragonitemod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.item.custom.MetalDetectorItem;

public class ModItems {

    // Creates the array that holds all new items
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DragoniteMod.MOD_ID);

    // Create new items
    // Ex: public static final RegistryObject<Item> CODEREFNAME = ITEMS.register("itemidname", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCALE_DRAGON =
            ITEMS.register("scale_dragon", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INGOT_DRAGONITE =
            ITEMS.register("ingot_dragonite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DRAGONITE =
            ITEMS.register("raw_dragonite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAGONITE_SWORD = ITEMS.register("dragonite_sword",
            () -> new SwordItem(ModToolTiers.DRAGONITE, 4, 1, new Item.Properties()));

    // Joke item, Jimmy John's Sandwich
    public static final RegistryObject<Item> JIMMY_JOHNS = ITEMS.register("jimmy_johns",
            () -> new Item(new Item.Properties().food(ModFoods.JIMMY_JOHNS)));

    public static final RegistryObject<Item> DRAGON_STEW = ITEMS.register("dragon_stew",
            () -> new Item(new Item.Properties().food(ModFoods.DRAGON_STEW)));

    // Creates Custom Item Example
    public static final RegistryObject<Item> METAL_DETECTOR =
            ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(64)));

    // Loads items into game
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
