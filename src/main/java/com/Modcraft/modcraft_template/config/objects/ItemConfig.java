package com.Modcraft.modcraft_template.config.objects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemConfig {


    int id;
    String itemName;
    String displayName;
    List<ItemProperties> proprietes = new ArrayList<>();
    ItemConfig(int id, String itemName, String displayName){
        this.id = id;
        this.itemName = itemName;
        this.displayName = displayName;
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public List<ItemProperties> getProprietes() {
        return proprietes;
    }


    public void setPropriete(List<ItemProperties> proprietes) {
        this.proprietes = proprietes;
    }

    @Override
    public String toString() {
        return "Item "+id+ " {" +
                "itemName='" + itemName + '\'' +
                ", proprietes='" + proprietes + '\'' +
                '}';
    }
}
