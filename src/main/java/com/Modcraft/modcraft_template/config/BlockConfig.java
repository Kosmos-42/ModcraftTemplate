package com.Modcraft.modcraft_template.config;

public class BlockConfig {

    int id;
    String blockName;

    BlockConfig(int id, String blockName){
        this.id = id;
        this.blockName = blockName;
    }

    @Override
    public String toString() {
        return "Item "+id+ " {" + "blockName='"+this.blockName
                +"'}";
    }
}
