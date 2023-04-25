package net.Exo.pexomod.block;

import net.Exo.pexomod.PexoMod;
import net.Exo.pexomod.item.Moditems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PexoMod.MOD_ID);

    public static final RegistryObject<Block> KATHIUM_BLOCK = registerBlock("kathium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> KRYING_GOLD_BLOCK = registerBlock("krying_gold_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops(), UniformInt.of(4,10)));

    public static final RegistryObject<Block> NETHER_KATHIUM_BLOCK = registerBlock("nether_kathium_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops(), UniformInt.of(3,11)));

    public static final RegistryObject<Block> DEEPSLATE_KATHIUM_BLOCK = registerBlock("deepslate_kathium_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops(), UniformInt.of(1,9)));

    public static final RegistryObject<Block> STONE_KATHIUM_BLOCK = registerBlock("stone_kathium_block",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).strength(1f).requiresCorrectToolForDrops(), UniformInt.of(3,13)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
