package net.user.dragonitemod.block;

import com.mojang.blaze3d.shaders.Uniform;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.user.dragonitemod.DragoniteMod;
import net.user.dragonitemod.block.custom.DragonBlock;
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


    // When adding a block, update needs tools, tool level, texture, item, loot table, blockstates, creative tab, and en_us


    // Creates new block
    // This one makes a new block called 'ore_dragonite' that behaves like diamond ore, also drops experience
    public static final RegistryObject<Block> ORE_DRAGONITE = registerBlock("ore_dragonite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(6, 10)));


    // This block is the actual dragonite that will be used for endstone generation, stone dragonite will not
    public static final RegistryObject<Block> ORE_ENDSTONE_DRAGONITE = registerBlock("ore_endstone_dragonite",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).sound(SoundType.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(6, 10)));


    // This block behaves like a normal block and does not drop experience
    public static final RegistryObject<Block> BLOCK_DRAGONITE = registerBlock("block_dragonite",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    // This is a custom block, will play an ender dragon growl when right clicked, maybe give powers?
    public static final RegistryObject<Block> BLOCK_DRAGON_ALTAR = registerBlock("block_dragon_altar",
            () -> new DragonBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));

    // Loads blocks into game
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
