package org.cneko.strange.items;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

public abstract class ArmorBase extends ArmorItem{

    public ArmorBase(ArmorMaterial armorMaterial, Type type, Properties properties) {
        super(armorMaterial, type, properties);
    }

    public static class ArmorMaterialBase implements ArmorMaterial {
        public final int[] BASE_DURABILITY = new int[] {10, 10, 10, 10};
        public final int[] PROTECTION_VALUES = new int[] {1, 1, 1, 1};
        private int enchantmentValue = 0;
        private SoundEvent equipSound = SoundEvents.ARMOR_EQUIP_IRON;
        private Ingredient repairIngredient = Ingredient.EMPTY;
        private String name = "";
        private float toughness = 0;
        private float knockbackResistance = 0;
        public void setDurability(ArmorItem.Type type,int durability){
            BASE_DURABILITY[type.getSlot().getIndex()] = durability;
        }
        public void setProtection(ArmorItem.Type type, int protection){
            PROTECTION_VALUES[type.getSlot().getIndex()] = protection;
        }
        @Override
        public int getDurabilityForType(ArmorItem.Type type) {
            return BASE_DURABILITY[type.getSlot().getIndex()];
        }

        @Override
        public int getDefenseForType(ArmorItem.Type type) {
            return PROTECTION_VALUES[type.getSlot().getIndex()];
        }

        @Override
        public int getEnchantmentValue() {
            return enchantmentValue;
        }
        public void setEnchantmentValue(int enchantmentValue){
            this.enchantmentValue = enchantmentValue;
        }

        @Override
        public @NotNull SoundEvent getEquipSound() {
            return equipSound;
        }
        public void setEquipSound(SoundEvent equipSound){
            this.equipSound = equipSound;
        }

        @Override
        public @NotNull Ingredient getRepairIngredient() {
            return repairIngredient;
        }
        public void setRepairIngredient(@NotNull Ingredient repairIngredient){
            this.repairIngredient = repairIngredient;
        }

        @Override
        public @NotNull String getName() {
            return name;
        }
        public void setName(String name){
            this.name = name;
        }

        @Override
        public float getToughness() {
            return toughness;
        }
        public void setToughness(float toughness){
            this.toughness = toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return knockbackResistance;
        }
        public void setKnockbackResistance(float knockbackResistance){
            this.knockbackResistance = knockbackResistance;
        }

    }

}
