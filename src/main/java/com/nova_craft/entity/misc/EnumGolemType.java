package com.nova_craft.entity.misc;

public enum EnumGolemType {

    COPARTZ(), LARIMAR(), TSAVOROKITE(), YTTRLINISTE(), AMETHYST(), AETHER();

	EnumGolemType() {

    }

    public int getId() {
        return this.ordinal();
    }

    public static EnumGolemType get(int id) {
        return values()[id];
    }
}
