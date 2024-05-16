package org.cneko.strange.types;

import net.minecraft.network.chat.Component;

public class Gender {
    private GenderTypes gender = GenderTypes.UNKNOWN;
    private String customGender = "";

    public Component getCustomGender() {
        return Component.translatable(customGender);
    }
    public void setCustomGender(String customGender) {
        this.customGender = customGender;
    }
    public GenderTypes getGender() {
        return gender;
    }
    public void setGender(GenderTypes gender) {
        this.gender = gender;
    }
    public static Gender getRandom() {
        Gender gender = new Gender();
        gender.setGender(GenderTypes.getRandom());
        return gender;
    }


    public static enum GenderTypes {
        MALE("genders.strange_creatures.male"),
        FEMALE("genders.strange_creatures.female"),
        CUSTOM("genders.strange_creatures.custom"),
        UNKNOWN("genders.strange_creatures.unknown");

        GenderTypes(String a) {
        }

        /**
         * 获取随机性别，雄雌随机概率相等
         * @return 性别
         */
        public static GenderTypes getRandom(){
            return GenderTypes.values()[(int)(Math.random()*2)];
        }
    }
}
