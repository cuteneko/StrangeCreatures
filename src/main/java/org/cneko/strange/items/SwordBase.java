package org.cneko.strange.items;

import net.minecraft.world.item.SwordItem;
import org.cneko.strange.types.TieredBase;

public abstract class SwordBase extends SwordItem {
    public SwordBase(TieredBase tier, Properties properties) {
        super(tier,0,0, properties);
    }


}
