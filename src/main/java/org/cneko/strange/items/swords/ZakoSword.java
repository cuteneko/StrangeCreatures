package org.cneko.strange.items.swords;

import net.minecraft.network.chat.Component;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import org.cneko.strange.items.SCSword;
import org.cneko.strange.types.Sounds;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static org.cneko.strange.util.SoundUtil.getSound;
public class ZakoSword extends SCSword {
    public static final String ID = "zako_sword";
    public ZakoSword() {
        super(createTier(), new Properties().durability(500).rarity(Rarity.COMMON));
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity target, LivingEntity attacker){
        attacker.playSound(Sounds.ZAKO);
        target.playSound(Sounds.ZAKO);
        return super.hurtEnemy(itemStack, target, attacker);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("item.strange_creatures.zako_sword.tooltip"));
    }



    public static TieredBase createTier(){
        TieredBase tier = new TieredBase();
        tier.setUses(500);
        tier.setSpeed(2.0F);
        tier.setAttackDamageBonus(0.5F);
        tier.setEnchantmentValue(10);
        tier.setRepairIngredient(Ingredient.of(ItemTags.FISHES));
        return tier;
    }


}
