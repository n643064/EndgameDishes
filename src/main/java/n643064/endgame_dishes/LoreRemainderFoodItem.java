package n643064.endgame_dishes;

import net.minecraft.ChatFormatting;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class LoreRemainderFoodItem extends LoreItem
{
    private final Item remainder;
    public LoreRemainderFoodItem(Properties properties, String loreId, ChatFormatting formatting, Item remainder)
    {
        super(properties, loreId, formatting);
        this.remainder = remainder;
    }

    @NotNull
    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity)
    {
        if (livingEntity instanceof Player player)
        {
            player.addItem(new ItemStack(remainder));
        }
        return super.finishUsingItem(itemStack, level, livingEntity);
    }
}
