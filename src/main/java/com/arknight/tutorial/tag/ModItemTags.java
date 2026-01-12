package com.arknight.tutorial.tag;

import com.arknight.tutorial.ArknightMod;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> TOOL_FOR_FOOD = of("tool_for_food");

    public static final TagKey<Item> COOKED_MEAT =
            TagKey.of(
                    RegistryKeys.ITEM,
                    new Identifier("arknight-mod", "cooked_meat")
            );

    //public static final TagKey<Item> UNCOOKED_MOONCAKE = of("uncooked_mooncake");

    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(ArknightMod.MOD_ID,id));
    }
}

