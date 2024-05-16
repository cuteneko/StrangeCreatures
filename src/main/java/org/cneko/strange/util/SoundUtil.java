package org.cneko.strange.util;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

import static org.cneko.strange.StrangeCreatures.MODID;

public class SoundUtil {
    public static SoundEvent getSound(String namespace, String id,float f) {

        return SoundEvent.createVariableRangeEvent(new ResourceLocation(namespace, id));
    }
    public static SoundEvent getSound(String namespace, String id) {
        return getSound(namespace, id, 1.0f);
    }
    public static SoundEvent getSound(String id){
        return getSound(MODID, id);
    }

    public static void playSound(Player entity, SoundEvent sound) {
        Level world = entity.getCommandSenderWorld();
        world.playSound(entity, entity.getX(), entity.getY(), entity.getZ(), sound, SoundSource.PLAYERS, 1.0f, 1.0f);
    }

    public static Holder<SoundEvent> register(ResourceLocation resourceLocation, ResourceLocation resourceLocation2, float f) {
        return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, resourceLocation, SoundEvent.createFixedRangeEvent(resourceLocation2, f));
    }

    public static SoundEvent register(String string) {
        return register(new ResourceLocation(MODID,string));
    }

    public static SoundEvent register(ResourceLocation resourceLocation) {
        return register(resourceLocation, resourceLocation);
    }

    public static SoundEvent register(ResourceLocation resourceLocation, ResourceLocation resourceLocation2) {
        return Registry.register(BuiltInRegistries.SOUND_EVENT, resourceLocation, SoundEvent.createVariableRangeEvent(resourceLocation2));
    }
}
