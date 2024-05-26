package org.cneko.strange.types;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;

import static org.cneko.strange.StrangeCreatures.MODID;

public class ItemGroups {
    public static final CreativeModeTab STRANGE_CREATURES_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.ZAKO_SWORD))
            .title(Component.translatable("itemGroup.strange_creatures.strange"))
            .displayItems((context, entries) -> {
                entries.accept(Items.ZAKO_SWORD);
                entries.accept(Items.JINKELA);
                entries.accept(Items.STEEL_PLATE);
            })
            .build();
    public static void register(){
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, new ResourceLocation(MODID, "strange"),STRANGE_CREATURES_GROUP);
    }
}
