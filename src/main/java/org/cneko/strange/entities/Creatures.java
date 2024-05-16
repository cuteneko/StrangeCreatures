package org.cneko.strange.entities;

import org.cneko.strange.types.Gender;

public interface Creatures {
    /**
     * 获取性别
     * @return 性别
     */
    public Gender getGender();
    /**
     * 设置性别
     * @param gender 性别
     */
    public void setGender(Gender gender);

}
