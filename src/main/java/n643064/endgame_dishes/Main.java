package n643064.endgame_dishes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroupBuilderImpl;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

public class Main implements ModInitializer
{
    public static final String MODID = "endgame_dishes";

    public static final CreativeModeTab ITEMS = new FabricItemGroupBuilderImpl()
            .title(Component.translatable("itemGroup.endgame_dishes.items"))
            .icon(() -> new ItemStack(Main.GLISTERING_SOUP)).build();

    public static final Item GLISTERING_SOUP = new LoreRemainderFoodItem(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(8)
            .food(new FoodProperties.Builder()
                    .alwaysEat()
                    .nutrition(7)
                    .saturationMod(1f)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.HEAL, 1, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.LUCK, 600, 0), 1f)
                    .build()
            ), "lore.glistering_soup", ChatFormatting.GOLD, Items.BOWL);

    public static final Item SEA_BERRIES = new LoreItem(new FabricItemSettings().rarity(Rarity.RARE).maxCount(64)
            .food(new FoodProperties.Builder()
                    .alwaysEat()
                    .nutrition(2)
                    .saturationMod(0.4f)
                    .effect(new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 3), 1f)
                    .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 400, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0), 1f)
                    .build()),
            "lore.sea_berries", ChatFormatting.AQUA);


    public static final Item FAERIE_MALTOSE = new LoreItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(64)
            .food(new FoodProperties.Builder()
                    .alwaysEat()
                    .nutrition(0)
                    .saturationMod(0f)
                    .effect(new MobEffectInstance(MobEffects.LEVITATION, 200, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 300, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 300, 4), 1f)
                    .build()),
            "lore.faerie_maltose", ChatFormatting.LIGHT_PURPLE);

    public static final Item BLAZING_SKEWER = new LoreItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(64)
            .food(new FoodProperties.Builder()
                    .alwaysEat()
                    .nutrition(6)
                    .saturationMod(0.6f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 1800, 1), 1f)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1800, 0), 1f)
                    .build()),
            "lore.blazing_skewer", ChatFormatting.GOLD);

    public static final Item FRIED_EGG = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(64)
            .food(new FoodProperties.Builder()
                    .nutrition(3)
                    .saturationMod(0.3f)
                    .build()));

    public static final Item RUNNY_EGG_SANDWICH = new LoreItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(64)
            .food(new FoodProperties.Builder()
                    .alwaysEat()
                    .nutrition(10)
                    .saturationMod(1.6f)
                    .effect(new MobEffectInstance(MobEffects.DARKNESS, 20, 0), 1f)
                    .effect(new MobEffectInstance(MobEffects.WITHER, 20, 2), 1f)
                    .build()),
            "lore.runny_egg_sandwich", ChatFormatting.YELLOW);

    public static final Item HONEY_GLAZE = new Item(new FabricItemSettings().rarity(Rarity.COMMON).maxCount(64));

    public static final Item GLAZED_STEAK = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(64)
            .food(new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationMod(1f)
                    .build()));

    public static final Item GLAZED_MUTTON = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(64)
            .food(new FoodProperties.Builder()
                    .nutrition(8)
                    .saturationMod(0.9f)
                    .build()));

    public static final Item GLAZED_RABBIT = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(64)
            .food(new FoodProperties.Builder()
                    .nutrition(7)
                    .saturationMod(0.8f)
                    .build()));

    public static final Item GLAZED_PORKCHOP = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON).maxCount(64)
            .food(new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationMod(1f)
                    .build()));

    public static final Item ELIXIR_BOTTLE = new Item(new FabricItemSettings().rarity(Rarity.COMMON).maxCount(16));


    public static final Item ELIXIR_OF_HEALTH = new ElixirItem(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(16)
            .food(new FoodProperties.Builder()
                    .alwaysEat()
                    .fast()
                    .nutrition(0)
                    .saturationMod(0f)
                    .build()),
            "lore.elixir_of_health", ChatFormatting.RED, Items.GLASS_BOTTLE);

    @Override
    public void onInitialize()
    {

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "items"), ITEMS);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "glistering_soup"), GLISTERING_SOUP);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "sea_berries"), SEA_BERRIES);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "faerie_maltose"), FAERIE_MALTOSE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "blazing_skewer"), BLAZING_SKEWER);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "fried_egg"), FRIED_EGG);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "runny_egg_sandwich"), RUNNY_EGG_SANDWICH);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "honey_glaze"), HONEY_GLAZE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "glazed_steak"), GLAZED_STEAK);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "glazed_mutton"), GLAZED_MUTTON);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "glazed_rabbit"), GLAZED_RABBIT);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "glazed_porkchop"), GLAZED_PORKCHOP);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "elixir_bottle"), ELIXIR_BOTTLE);
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, "elixir_of_health"), ELIXIR_OF_HEALTH);

        ItemGroupEvents.modifyEntriesEvent(ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), new ResourceLocation(MODID, "items"))).register((entries ->
        {
            entries.accept(GLISTERING_SOUP);
            entries.accept(SEA_BERRIES);
            entries.accept(FAERIE_MALTOSE);
            entries.accept(BLAZING_SKEWER);
            entries.accept(FRIED_EGG);
            entries.accept(RUNNY_EGG_SANDWICH);
            entries.accept(HONEY_GLAZE);
            entries.accept(GLAZED_STEAK);
            entries.accept(GLAZED_MUTTON);
            entries.accept(GLAZED_RABBIT);
            entries.accept(GLAZED_PORKCHOP);
            entries.accept(ELIXIR_BOTTLE);
            entries.accept(ELIXIR_OF_HEALTH);
        }));
    }
}
