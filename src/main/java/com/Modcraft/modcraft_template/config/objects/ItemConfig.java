package com.Modcraft.modcraft_template.config.objects;

import java.util.ArrayList;
import java.util.List;

public class ItemConfig {


    int id;
    String itemName;
    String displayName;
    List<ItemProperties> proprietes = new ArrayList<>();
    List<String> textures = new ArrayList<>();
    ItemConfig(int id, String itemName, String displayName){
        this.id = id;
        this.itemName = itemName;
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
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

    public List<String> getTextures() {
        return textures;
    }

    public void ajouterPropriete(ItemProperties propriete) {
        this.proprietes.add(propriete);
    }
    public void ajouterTexture(String texture) {
        this.textures.add(texture);
    }

    @Override
    public String toString() {
        return "Item "+id+ " {" +
                "itemName='" + itemName + '\'' +
                ", proprietes='" + proprietes + '\'' +
                ", textures='" + textures + '\'' +
                '}';
    }
}
