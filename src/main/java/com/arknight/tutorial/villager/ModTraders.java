package com.arknight.tutorial.villager;

import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModTraders {
    public static void registerTraders() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new TradeOffers.SellItemFactory(ModItems.GLUTINOUS_RICE.getDefaultStack(), 1, 3,5,2, 0.05f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.CORN.getDefaultStack(), 1, 2,5,2, 0.05f));
            factories.add(new TradeOffers.SellItemFactory(ModItems.STRAWBERRY_SEEDS.getDefaultStack(), 1, 2,5,2, 0.05f));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 2, factories -> {
            factories.add(new TradeOffers.ProcessItemFactory(Items.MILK_BUCKET, 1, 2, ModItems.CHEESE, 3, 16, 5));
        });

        TradeOfferHelper.registerVillagerOffers(ModVillagers.ORIGINIUM_MERCHANT, 1, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.LUNGMEN_DOLLAR, 7), // 5 龙门币
                    new ItemStack(ModItems.ORUNDUM, 1),         // 1 合成玉
                    10,    // 最大交易次数
                    4,     // 给予村民经验
                    0.05f  // 价格浮动
            ));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.ORUNDUM, 1),
                    new ItemStack(ModItems.LUNGMEN_DOLLAR, 7),
                    10,
                    4,
                    0.05f
            ));

            factories.add((entity,random) -> new TradeOffer(
                    new ItemStack(ModItems.RAW_ORIGINIUM, 1),
                    new ItemStack(ModItems.LUNGMEN_DOLLAR, 5),
                    12,
                    3,
                    0.05f
            ));
        });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.ORIGINIUM_MERCHANT, 2, factories -> {
            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.RAW_ORIGINIUM, 2), // 第一个输入
                    new ItemStack(Items.IRON_INGOT, 2),         // 第二个输入
                    new ItemStack(ModItems.ORUNDUM, 1),         // 输出
                    12,     // 最大交易次数
                    10,     // 村民获得经验
                    0.05f   // 价格浮动
            ));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.ORUNDUM, 1),
                    new ItemStack(ModItems.LUNGMEN_DOLLAR, 60),
                    new ItemStack(ModItems.HUA_GUI_PO, 1),
                    2,
                    5,
                    0.05f
            ));

            factories.add((entity, random) -> new TradeOffer(
                    new ItemStack(ModItems.LUNGMEN_DOLLAR, 10),
                    new ItemStack(ModItems.REFRESHING_SPORTS_DRINK, 1),
                    3,
                    5,
                    0.05f
            ));
        });
    }
}
