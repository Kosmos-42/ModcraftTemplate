package com.Modcraft.modcraft_template.config.objects;

public class BlockConfig {

    int id;
    String blockName;

    BlockConfig(int id, String blockName){
        this.id = id;
        this.blockName = blockName;
    }

    @Override
    public String toString() {
        return "Block "+id+ " {" + "blockName='"+this.blockName
                +"'}";
    }
}
