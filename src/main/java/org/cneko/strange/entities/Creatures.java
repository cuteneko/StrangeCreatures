package org.cneko.strange.entities;

import org.cneko.strange.types.GenderTypes;

public interface Creatures {
    /**
     * 获取性别
     * @return 性别
     */
    public GenderTypes getGender();
    /**
     * 设置性别
     * @param gender 性别
     */
    public void setGender(GenderTypes gender);

}
