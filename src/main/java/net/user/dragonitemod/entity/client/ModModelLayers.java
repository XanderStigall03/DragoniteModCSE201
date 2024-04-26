package net.user.dragonitemod.entity.client;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.user.dragonitemod.DragoniteMod;

public class ModModelLayers {
    public static final ModelLayerLocation PIGDRAGON_LAYER = new ModelLayerLocation(
            new ResourceLocation(DragoniteMod.MOD_ID, "pigdragon_layer"), "main");

    public static final ModelLayerLocation ZOMBIEDRAGON_LAYER = new ModelLayerLocation(
            new ResourceLocation(DragoniteMod.MOD_ID, "zombiedragon_layer"), "main");
}
