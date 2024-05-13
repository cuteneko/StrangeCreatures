package org.cneko.strange.items;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public abstract class SwordBase extends SwordItem {
    public SwordBase(TieredBase tier,Properties properties) {
        super(tier, properties);
    }


}
