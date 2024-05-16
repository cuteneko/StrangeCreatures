package org.cneko.strange.entities;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.cneko.strange.types.Gender;
import org.jetbrains.annotations.Nullable;

public abstract class AnimalBase extends Animal implements Creatures{
    private Gender gender;

    protected AnimalBase(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    @Override
    public Gender getGender() {
        return this.gender;
    }

    @Override
    public boolean isFood(ItemStack itemStack) {
        return false;
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return this;
    }
}
