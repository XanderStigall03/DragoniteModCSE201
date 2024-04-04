package net.user.dragonitemod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    // Creates the array that holds all new blocks
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, DragoniteMod.MOD_ID);

// Something something allows blocks to drop itself as a block?
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        // Registers the block itself
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        //Registers the item associated with the block
        registerBlockItem(name, toReturn);
        // Returns the block
        return toReturn;
    }


    // Something something allows blocks to drop an item instead of a block?
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    // Creates new block
    // This one makes a new block called 'ore_dragonite' that behaves like diamond ore
    public static final RegistryObject<Block> ORE_DRAGONITE = registerBlock("ore_dragonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)));

    public static final RegistryObject<Block> BLOCK_DRAGONITE = registerBlock("block_dragonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    // Loads blocks into game
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
