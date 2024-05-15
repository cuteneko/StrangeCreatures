package org.cneko.strange.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

public class SoundUtil {
    public static SoundEvent getSound(String namespace, String id,float f) {
        return SoundEvent.createVariableRangeEvent(new ResourceLocation(namespace, id));
    }
    public static SoundEvent getSound(String namespace, String id) {
        return getSound(namespace, id, 1.0f);
    }

    public static void playSound(Entity entity, SoundEvent sound) {
        Level world = entity.getCommandSenderWorld();
        world.playSound(entity,entity.getOnPos(),sound, SoundSource.PLAYERS,1.0f,1.0f);
    }
}
