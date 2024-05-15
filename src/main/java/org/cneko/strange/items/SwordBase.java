package org.cneko.strange.items;

import net.minecraft.world.item.SwordItem;

public abstract class SwordBase extends SwordItem {
    public SwordBase(TieredBase tier,Properties properties) {
        super(tier,1,1, properties);
    }


}
