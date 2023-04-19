package com.Modcraft.modcraft_template.config.objects;

public class ItemProperties {

    int stacksTo = 64;
    int durability = -1;

    public int getStacksTo() {
        return stacksTo;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public void setStacksTo(int stacksTo) {
        this.stacksTo = stacksTo;
    }

}
