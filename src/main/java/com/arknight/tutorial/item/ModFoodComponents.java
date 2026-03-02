package com.arknight.tutorial.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    //测试食物
    public static final FoodComponent CORN = new FoodComponent.Builder().hunger(3).saturationModifier(0.7f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 200), 0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,200), 0.2f).build();

    //自制食物、作物
    public static final FoodComponent A_BAG_OF_SUGAR = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f)
            .alwaysEdible()
            .build();//一袋糖
    public static final FoodComponent SUGAR_GROUP = new FoodComponent.Builder().hunger(2).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 1), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent SUGAR_CUBE = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400, 2), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent STRAWBERRY = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED,200),0.2f).build();

    public static final FoodComponent COOKED_GLUTINOUS_RICE_DOUGH = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();
    public static final FoodComponent SALTED_EGG_YOLK = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 1.0f)
            .snack()
            .build();//咸蛋黄
    public static final FoodComponent ZANG_JIN_BO = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f) //藏金波
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 650, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2500, 6), 1.0f)
            .alwaysEdible()
            .build();
    public static final FoodComponent QING_QIU_YU = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f) //清秋玉
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2600, 15), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent LIANG_QING_YU = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3000, 4), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent HUA_GUI_PO = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3000, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent MEAT_FLOSS = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();

    public static final FoodComponent CANNED_VEGETABLES_AND_RADISHES = new FoodComponent.Builder().hunger(4).saturationModifier(0.4f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 200, 3), 1.0f)
            .build();

    public static final FoodComponent REFRESHING_SPORTS_DRINK = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 3000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 3000, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent CRUNCHY_SHELL_SUGAR_OIL_FRUIT = new FoodComponent.Builder().hunger(3).saturationModifier(0.03f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 500, 1), 1.0f).snack().build();

    public static final FoodComponent EMERGENCY_RATIONAL_COMPOUND = new FoodComponent.Builder().hunger(10).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000, 0), 0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000, 0), 0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 0), 0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 0), 0.8f)
            .snack()
            .alwaysEdible()
            .build();

    public static final FoodComponent EMERGENCY_RATIONAL_CONCENTRATE = new FoodComponent.Builder().hunger(20).saturationModifier(1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 1), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 1), 1.0f)
            .alwaysEdible()
            .build();

    public static final FoodComponent ROASTED_ALMOND_CHOCOLATE = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();

    public static final FoodComponent SALTED_EGG_YOLK_FLAVORED_CHOCOLATE = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).snack().build();

    public static final FoodComponent EDIBLE_CUBE = new FoodComponent.Builder().hunger(4).saturationModifier(10)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1000, 1), 1.0f)
            .build();

    public static final FoodComponent FURNACE_FRIED_RICE_FROM_WISH_A_DALE =
            new FoodComponent.Builder()
                    .hunger(8)
                    .saturationModifier(1.2f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1200, 1), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1200, 1), 1.0f)
                    .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 1), 1.0f)
                    .alwaysEdible()
                    .build();

    public static final FoodComponent GUANG_HAN_LE = new FoodComponent.Builder().hunger(6).saturationModifier(0.8f) //清秋玉
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2600, 15), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 2, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 3000, 5), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2), 1.0f)
            .alwaysEdible()
            .build();




    //蔬菜
    public static final FoodComponent KALE = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();




}
