package n643064.endgame_dishes;

import net.minecraft.ChatFormatting;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ElixirItem extends LoreRemainderFoodItem
{
    public ElixirItem(Properties properties, String loreId, ChatFormatting formatting, Item remainder)
    {
        super(properties, loreId, formatting, remainder);
    }

    @Override @NotNull
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity)
    {
        livingEntity.heal(5f);
        return super.finishUsingItem(itemStack, level, livingEntity);
    }

    @Override @NotNull
    public SoundEvent getEatingSound()
    {
        return SoundEvents.WANDERING_TRADER_DRINK_POTION;
    }

    @Override @NotNull
    public SoundEvent getDrinkingSound()
    {
        return SoundEvents.WANDERING_TRADER_DRINK_POTION;
    }
}
