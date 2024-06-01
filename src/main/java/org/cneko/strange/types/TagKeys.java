package org.cneko.strange.types;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TagKeys {
    public static final TagKey<Item> C_STEEL_INGOTS = TagKey.create(Registries.ITEM, new ResourceLocation("c", "steel_ingots"));
    public static final TagKey<Item> C_STEEL_PLATES = TagKey.create(Registries.ITEM, new ResourceLocation("c", "steel_plates"));
}
