package org.cneko.strange.types;

import net.minecraft.network.chat.Component;

public class Gender {
    private GenderTypes gender = GenderTypes.UNKNOWN;
    private String customGender = "";

    public Gender(String v){
        if(v != null){
            if(v.equalsIgnoreCase("male")){
                this.setGender(GenderTypes.MALE);
            }else if(v.equalsIgnoreCase("female")){
                this.setGender(GenderTypes.FEMALE);
            }else if(v.equalsIgnoreCase("custom")){
                this.setGender(GenderTypes.CUSTOM);
            }
        }
    }
    public Gender(){
    }
    public Component getCustomGender() {
        return Component.translatable(customGender);
    }
    public String getCustomGenderString() {
        return customGender;
    }
    public void setCustomGender(String customGender) {
        this.customGender = customGender;
    }
    public GenderTypes getGender() {
        return gender;
    }
    public String getGenderString() {
        if (gender == GenderTypes.CUSTOM) return "custom";
        if (gender == GenderTypes.MALE) return "male";
        if (gender == GenderTypes.FEMALE) return "female";
        return "unknown";
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
