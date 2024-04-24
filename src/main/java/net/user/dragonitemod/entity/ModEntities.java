package net.user.dragonitemod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.entity.custom.PigDragon;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DragoniteMod.MOD_ID);

    public static final RegistryObject<EntityType<PigDragon>> PIGDRAGON =
            ENTITY_TYPES.register("pigdragon", () -> EntityType.Builder.of(PigDragon::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("pigdragon"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
