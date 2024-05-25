package org.cneko.strange.items.misc;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class Jinkela extends Item {
    public static String ID = "jinkela";
    public Jinkela() {
        super(createProperties());
    }

    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("item.strange_creatures.jinkela.tooltip"));
    }

    public static Properties createProperties(){
        Properties p = new Properties();
        return p;
    }
}
