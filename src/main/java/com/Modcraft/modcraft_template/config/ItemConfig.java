package com.Modcraft.modcraft_template.config;

import java.util.ArrayList;
import java.util.List;

public class ItemConfig {


    int id;
    String itemName;
    List<String> proprietes = new ArrayList();
    List<String> textures = new ArrayList();

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public List<String> getProprietes() {
        return proprietes;
    }

    public List<String> getTextures() {
        return textures;
    }
    ItemConfig(int id, String itemName){
        this.id = id;
        this.itemName = itemName;
    }

    public void ajouterPropriete(String propriete) {
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
