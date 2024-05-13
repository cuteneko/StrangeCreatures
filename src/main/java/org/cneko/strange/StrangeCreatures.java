package org.cneko.strange;

import net.fabricmc.api.ModInitializer;
import org.cneko.strange.types.ItemGroups;
import org.cneko.strange.types.Items;
import org.cneko.strange.util.ConfigUtil;

public class StrangeCreatures implements ModInitializer {
    public static final String MODID = "strange_creatures";
    @Override
    public void onInitialize() {
        // 加载配置文件
        ConfigUtil.load();
        // 注册物品
        Items.register();
        // 注册物品组
        ItemGroups.register();
    }
}
