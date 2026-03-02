package com.arknight.tutorial.datagen;

import com.arknight.tutorial.block.ModBlocks;
import com.arknight.tutorial.item.ModItemGroups;
import com.arknight.tutorial.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class ModZhCnLangProvider extends FabricLanguageProvider {
    public ModZhCnLangProvider(FabricDataOutput dataOutput){
        super(dataOutput, "zh_cn");
    }
    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        //模组物品
        translationBuilder.add(ModItems.CARDBOARD, "纸板");
        translationBuilder.add(ModItems.ORIGINIUM_WITH_IMPURITIES, "含杂质的源石");
        translationBuilder.add(ModItems.ORIGINIUM, "至纯源石");
        translationBuilder.add(ModItems.RAW_ORIGINIUM, "源石碎片");
        translationBuilder.add(ModItems.ORIGINIUM_ORE, "源石锭");
        translationBuilder.add(ModItems.LUNGMEN_DOLLAR, "龙门币");
        translationBuilder.add(ModItems.ORUNDUM,"合成玉");

        //食物
        translationBuilder.add(ModItems.CORN, "玉米");
        translationBuilder.add(ModItems.STRAWBERRY, "草莓");
        translationBuilder.add(ModItems.CHEESE, "芝士");

        translationBuilder.add(ModItems.A_BAG_OF_SUGAR, "一袋糖");
        translationBuilder.add(ModItems.SUGAR_GROUP, "糖组");
        translationBuilder.add(ModItems.SUGAR_CUBE, "糖聚块");

        translationBuilder.add(ModItems.HUA_GUI_PO, "画桂魄");


        //食物
        translationBuilder.add(ModItems.SALTED_EGG_YOLK, "咸蛋黄");
        translationBuilder.add(ModItems.FLOUR, "面粉");
        translationBuilder.add(ModItems.DOUGH, "面团");
        translationBuilder.add(ModItems.DOUGH_WRAPPER, "面皮");
        translationBuilder.add(ModItems.UNFORMED_ZANGJINBO, "未定型的月饼(藏金波)");
        translationBuilder.add(ModItems.ZANG_JIN_BO, "未烤熟的藏金波");
        translationBuilder.add(ModItems.COOKED_ZANG_JIN_BO, "藏金波");

        translationBuilder.add(ModItems.MEAT_FLOSS, "肉松");
        translationBuilder.add(ModItems.UNCOOKED_GLUTINOUS_RICE_DOUGH, "未煮熟的糯米面团");//冰皮月饼制作
        translationBuilder.add(ModItems.COOKED_GLUTINOUS_RICE_DOUGH, "煮熟的糯米面团");
        translationBuilder.add(ModItems.GLUTINOUS_RICE_DOUGH_WRAPPER, "糯米面皮");
        translationBuilder.add(ModItems.UNFORMED_LIANG_XIAO_QING, "未塑形的良宵晴");
        translationBuilder.add(ModItems.LIANG_XIAO_QING,"良宵晴");

        //作物
        translationBuilder.add(ModItems.GLUTINOUS_RICE, "糯米");
        translationBuilder.add(ModItems.STRAWBERRY_SEEDS, "草莓种子");

        translationBuilder.add(ModItems.ANTHRACITE, "无烟煤");

        translationBuilder.add(ModBlocks.ORIGINIUM_BLOCK, "至纯源石块");
        translationBuilder.add(ModBlocks.RAW_ORIGINIUM_BLOCK, "源石矿");
        translationBuilder.add(ModBlocks.DEEPSLATE_RAW_ORIGINIUM_ORE, "深层源石矿");

        //工具
        translationBuilder.add(ModItems.MOONCAKE_MOLD, "月饼磨具");
        translationBuilder.add(ModItems.ROLLING_PIN, "擀面杖");

        translationBuilder.add(ModItems.EMPTY_CAN, "铁罐");


        translationBuilder.add(ModItems.CANNED_VEGETABLES_AND_RADISHES, "青菜萝卜罐头");
        translationBuilder.add(ModItems.KALE, "甘蓝菜");

        translationBuilder.add(ModItems.REFRESHING_SPORTS_DRINK, "清爽运动饮料");

        translationBuilder.add(ModItems.CRUNCHY_SHELL_SUGAR_OIL_FRUIT, "脆皮糖油果");

        translationBuilder.add(ModItems.EMERGENCY_RATIONAL_COMPOUND, "应急理智合剂");
        translationBuilder.add(ModItems.EMERGENCY_RATIONAL_CONCENTRATE, "应急理智浓缩液");

        translationBuilder.add(ModItems.ROASTED_ALMOND_CHOCOLATE, "烤杏仁巧克力");
        translationBuilder.add(ModItems.SALTED_EGG_YOLK_FLAVORED_CHOCOLATE, "咸蛋黄味巧克力");
        translationBuilder.add(ModItems.EDIBLE_CUBE, "可食用立方体");
        translationBuilder.add(ModItems.FURNACE_FRIED_RICE_FROM_WISH_A_DALE, "熔炉炒饭 (维什戴尔特供)");

        //调料
        translationBuilder.add(ModBlocks.SALT_ORE, "盐矿");
        translationBuilder.add(ModItems.SALT, "盐");

        translationBuilder.add(ModItems.STARCH, "淀粉");
        translationBuilder.add(ModItems.STARCH_DOUGH, "水晶面团");//水晶皮月饼
        translationBuilder.add(ModItems.COOKED_STARCH_DOUGH, "熟的水晶面团");
        translationBuilder.add(ModItems.STARCH_DOUGH_WRAPPER, "水晶面皮");
        translationBuilder.add(ModItems.UNFORMED_QING_QIU_YU, "未塑形的清秋玉");
        translationBuilder.add(ModItems.QING_QIU_YU, "清秋玉");
        translationBuilder.add(ModItems.GUANG_HAN_LE, "广寒乐");

        //盔甲
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_HELMET, "深海猎人帽子");
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_CHESTPLATE, "深海猎人胸甲");
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_LEGGINGS, "深海猎人护腿");
        translationBuilder.add(ModItems.ABYSSAL_HUNTERS_BOOTS, "深海猎人靴子");
        translationBuilder.add(ModItems.SHADOWGUARD_HELMET, "影卫蓑笠");
        translationBuilder.add(ModItems.SHADOWGUARD_CHESTPLATE, "影卫胸甲");
        translationBuilder.add(ModItems.SHADOWGUARD_LEGGINGS, "影卫护腿");
        translationBuilder.add(ModItems.SHADOWGUARD_BOOTS, "影卫靴子");

        translationBuilder.add(ModItemGroups.ARKNIGHT_GROUP, "Arknight Group");
        translationBuilder.add("arknight_group2", "Arknight Group2");

        //村民

        translationBuilder.add("entity.minecraft.villager.originium_merchant", "源石商人");

    }
}
