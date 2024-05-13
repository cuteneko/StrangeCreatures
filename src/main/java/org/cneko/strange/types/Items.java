package org.cneko.strange.types;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import org.cneko.strange.items.swords.ZakoSword;

import static org.cneko.strange.StrangeCreatures.MODID;

public class Items {
    public static final ZakoSword ZAKO_SWORD = new ZakoSword();

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM,
                new ResourceLocation(MODID, ZakoSword.ID),
                ZAKO_SWORD);
    }
}
