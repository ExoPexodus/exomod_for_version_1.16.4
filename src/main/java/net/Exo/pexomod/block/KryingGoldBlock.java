package net.Exo.pexomod.block;

import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;

public class KryingGoldBlock extends DropExperienceBlock {
    public KryingGoldBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE)
                        .strength(1f)
                        .requiresCorrectToolForDrops(),
                UniformInt.of(6, 10));
    }




    public boolean isCorrectToolForDrops(BlockState state, ItemStack stack) {
        if (stack.getItem() instanceof TieredItem) {
            Tier tier = ((TieredItem) stack.getItem()).getTier();
            return tier.getLevel() >= Tiers.DIAMOND.getLevel();
        }
        return false;
    }
}
