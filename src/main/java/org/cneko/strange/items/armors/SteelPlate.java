package org.cneko.strange.items.armors;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.cneko.strange.items.SCArmor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SteelPlate extends SCArmor {
    public static final String ID = "steel_plate";
    public SteelPlate() {
        super(createMaterial(),Type.CHESTPLATE, new Properties());
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("item.strange_creatures.steel_plate.tooltip"));
    }

    public static ArmorMaterialBase createMaterial(){
        ArmorMaterialBase material = new ArmorMaterialBase();
        material.setName(ID);
        material.setProtection(Type.CHESTPLATE, 4); // 抗性4
        material.setDurability(Type.CHESTPLATE, 150); // 耐久150
        material.setRepairIngredient(Ingredient.of(TagKey.create(Registries.ITEM,new ResourceLocation("c","steel_ingots")))); // 使用钢锭修复
        material.setToughness(1.0f); // 韧性1
        material.setKnockbackResistance(0.0f);
        material.setEquipSound(SoundEvents.ANVIL_FALL);
        return material;
    }
}
