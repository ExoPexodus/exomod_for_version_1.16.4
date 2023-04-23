package net.Exo.pexomod.item;

import net.Exo.pexomod.PexoMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PexoMod.MOD_ID);

    public static final RegistryObject<Item> KATHIUM = ITEMS.register("kathium",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> MUSHROOM_PINK = ITEMS.register("pinkshroom",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> MUSHROOM_RED = ITEMS.register("redshroom",
            () -> new Item(new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
