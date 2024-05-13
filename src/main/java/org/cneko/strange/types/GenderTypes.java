package org.cneko.strange.types;

public enum GenderTypes {
    MALE("genders.strange_creatures.male"),
    FEMALE("genders.strange_creatures.female"),
    NONBINARY("genders.strange_creatures.nonbinary"),
    UNKNOWN("genders.strange_creatures.unknown");

    GenderTypes(String a) {
    }

    /**
     * 获取随机性别，雄雌随机概率相等，为(1-chance)/2
     * @param chance 非二元随机概率(0~1)
     * @return 性别
     */
    public static GenderTypes getRandom(float chance){
        float adjustedChance = chance < 0.5f ? chance * 2 : 1;
        return Math.random() < adjustedChance / 2f ?
            MALE : (Math.random() < adjustedChance ? FEMALE : NONBINARY);
    }
    /**
     * 获取随机性别，雄雌随机概率相等，非二元概率为1%
     * @return 性别
     */
    public static GenderTypes getRandom(){
        return getRandom(0.01f);
    }
}
