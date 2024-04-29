package net.user.dragonitemod.item;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.entity.ModEntities;
import net.user.dragonitemod.entity.custom.FireballProjectileEntity;
import net.user.dragonitemod.item.custom.DragoniteBowItem;
import net.user.dragonitemod.item.custom.FireballItem;
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
            () -> new SwordItem(ModToolTiers.DRAGONITE, 4, 1,
                    new Item.Properties()));

    public static final RegistryObject<Item> DRAGONITE_PICKAXE = ITEMS.register("dragonite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DRAGONITE, 2, 1, new Item.Properties()));
    public static final RegistryObject<Item> DRAGONITE_AXE = ITEMS.register("dragonite_axe",
            () -> new AxeItem(ModToolTiers.DRAGONITE, 7, 1, new Item.Properties()));

    public static final RegistryObject<Item> DRAGONITE_SHOVEL = ITEMS.register("dragonite_shovel",
            () -> new ShovelItem(ModToolTiers.DRAGONITE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> DRAGONITE_HOE = ITEMS.register("dragonite_hoe",
            () -> new HoeItem(ModToolTiers.DRAGONITE, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> FIREBALL = ITEMS.register("fireball",
            () -> new FireballItem(new Item.Properties()));

    // Joke item, Jimmy John's Sandwich
    public static final RegistryObject<Item> JIMMY_JOHNS = ITEMS.register("jimmy_johns",
            () -> new Item(new Item.Properties().food(ModFoods.JIMMY_JOHNS)));

    public static final RegistryObject<Item> DRAGON_STEW = ITEMS.register("dragon_stew",
            () -> new Item(new Item.Properties().food(ModFoods.DRAGON_STEW)));

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

    public static final RegistryObject<Item> DRAGONITE_BOW = ITEMS.register("dragonite_bow",
            () -> new DragoniteBowItem(new Item.Properties().durability(500)));
    // Loads items into game
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
