package net.user.dragonitemod.util;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.user.dragonitemod.DragoniteMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.user.dragonitemod.item.ModItems;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");
        public static final TagKey<Block> NEEDS_DRAGONITE_TOOL = tag("needs_dragonite_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(DragoniteMod.MOD_ID, name));
        }
    }

    /**

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(DragoniteMod.MOD_ID, name));
        }

        protected void addTags(HolderLookup.Provider pProvider) {
            this.tag(ItemTags.TRIMMABLE_ARMOR)
                    .add(ModItems.DRAGONITE_HELMET.get(),
                            ModItems.DRAGONITE_CHESTPLATE.get(),
                            ModItems.DRAGONITE_LEGGINGS.get(),
                            ModItems.DRAGONITE_BOOTS.get());

        }


    }
     */

    public static class Item extends ItemTagsProvider {
        public Item(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                                   CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
            super(p_275343_, p_275729_, p_275322_, DragoniteMod.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider pProvider) {
            this.tag(ItemTags.TRIMMABLE_ARMOR)
                    .add(ModItems.DRAGONITE_HELMET.get(),
                            ModItems.DRAGONITE_CHESTPLATE.get(),
                            ModItems.DRAGONITE_LEGGINGS.get(),
                            ModItems.DRAGONITE_BOOTS.get());
        }
    }
}
