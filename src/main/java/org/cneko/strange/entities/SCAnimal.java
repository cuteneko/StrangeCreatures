package org.cneko.strange.entities;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.cneko.strange.types.Gender;
import org.jetbrains.annotations.Nullable;
public abstract class SCAnimal extends Animal implements Creatures{
    private Gender gender;
    protected SCAnimal(EntityType<? extends Animal> entityType, Level level) {
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
    public abstract AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob);

    public void getChildBase(SCAnimal entity , ServerLevel world){
        entity.setGender(Gender.getRandom());
        entity.setAge(-48000);
    }
    @Override
    public void readAdditionalSaveData(CompoundTag nbt){
        // 读取性别
        if(!nbt.getCompound("gender").toString().equalsIgnoreCase("{}")) {
            CompoundTag genderNbt = nbt.getCompound("gender");
            String value = "unknown";
            if(genderNbt.contains("value")){
                value = genderNbt.getString("value");
            }
            this.gender = new Gender(value);
        }else {
            this.gender = Gender.getRandom();
        }
    }

    @Override
    public void addAdditionalSaveData(CompoundTag compoundTag) {
        // 写入性别
        CompoundTag genderNbt = new CompoundTag();
        genderNbt.putString("value", this.gender.getGenderString());
        if(this.gender.getGender() == Gender.GenderTypes.CUSTOM){
            genderNbt.putString("custom", this.gender.getCustomGenderString());
        }
        compoundTag.put("gender", genderNbt);
    }

}
