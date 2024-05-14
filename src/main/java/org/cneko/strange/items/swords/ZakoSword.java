package org.cneko.strange.items.swords;

import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import org.cneko.strange.items.SwordBase;
import org.cneko.strange.items.TieredBase;
import org.cneko.strange.util.SoundUtil;

import java.util.List;
import java.util.Random;

import static org.cneko.strange.util.SoundUtil.getSound;
public class ZakoSword extends SwordBase {
    public static final String ID = "zako_sword";
    public ZakoSword() {
        super(createTier(), new Properties().durability(500).rarity(Rarity.COMMON));
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity attacker, LivingEntity entity){
        super.hurtEnemy(itemStack, attacker, entity);
        // 播放杂鱼音效
        SoundUtil.playSound(attacker, getSound("strange_creatures", "zako"));
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> list, TooltipFlag tooltipFlag) {
        list.add(Component.translatable("item.strange_creatures.zako_sword.tooltip"));
    }



    public static TieredBase createTier(){
        TieredBase tier = new TieredBase();
        tier.setUses(500);
        tier.setSpeed(2.0F);
        tier.setAttackDamageBonus(0.5F);
        tier.setEnchantmentValue(10);
        tier.setRepairIngredient(Ingredient.of(ItemTags.FISHES));
        tier.setIncorrectBlocksForDrops(BlockTags.DIRT);
        return tier;
    }


}
