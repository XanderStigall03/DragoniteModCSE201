package net.user.dragonitemod.item;

import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> DRAGONITE = ITEMS.register("dragonite",
            () -> new Item(new Item.Properties()));

    // Create new items
    // Ex: public static final RegistryObject<Item> CODEREFNAME = ITEMS.register("itemidname", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCALE_DRAGON =
            ITEMS.register("scale_dragon", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> INGOT_DRAGONITE =
            ITEMS.register("ingot_dragonite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_DRAGONITE =
            ITEMS.register("raw_dragonite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DRAGONITE_SWORD = ITEMS.register("dragonite_sword",
            () -> new SwordItem(ModToolTiers.DRAGONITE, 4, 2, new Item.Properties()));

    // Creates Custom Item Example
    public static final RegistryObject<Item> METAL_DETECTOR =
            ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(64)));

    public static final RegistryObject<Item> DRAGONITE_HELMET = ITEMS.register("dragonite_helmet",
            () -> new ArmorItem(ModArmorMaterials.DRAGONITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONITE_CHESTPLATE = ITEMS.register("dragonite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.DRAGONITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONITE_LEGGINGS = ITEMS.register("dragonite_leggings",
            () -> new ArmorItem(ModArmorMaterials.DRAGONITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONITE_BOOTS = ITEMS.register("dragonite_boots",
            () -> new ArmorItem(ModArmorMaterials.DRAGONITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    // Loads items into game
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
