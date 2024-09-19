package n643064.endgame_dishes;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class LoreItem extends Item
{
    private final String loreId;
    private final ChatFormatting formatting;
    public LoreItem(Properties properties, String loreId, ChatFormatting formatting)
    {
        super(properties);
        this.loreId = loreId;
        this.formatting = formatting;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag)
    {
        super.appendHoverText(itemStack, level, list, tooltipFlag);
        list.add(Component.translatable(loreId).withStyle(formatting));
    }
}
