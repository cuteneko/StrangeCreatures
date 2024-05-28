package org.cneko.strange;

import net.fabricmc.api.ModInitializer;
import org.cneko.strange.events.EntityDamageEvent;
import org.cneko.strange.types.ItemGroups;
import org.cneko.strange.types.Items;

public class StrangeCreatures implements ModInitializer {
    public static final String MODID = "strange_creatures";
    @Override
    public void onInitialize() {
        // 注册物品
        Items.register();
        // 注册物品组
        ItemGroups.register();
        // 注册事件
        EntityDamageEvent.init();
    }
}
