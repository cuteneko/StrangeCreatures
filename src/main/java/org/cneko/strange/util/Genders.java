package org.cneko.strange.util;

public enum Genders {
    MALE("genders.strange_creatures.male"),
    FEMALE("genders.strange_creatures.female"),
    NONBINARY("genders.strange_creatures.nonbinary"),
    UNKNOWN("genders.strange_creatures.unknown");

    Genders(String a) {
    }
    public static Genders getRandom(){
        return Genders.values()[(int) (Math.random() * Genders.values().length)];
    }
}
