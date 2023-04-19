package com.Modcraft.modcraft_template.config.objects;

public class BlockConfig {

    int id;
    String blockName; //le nom

    String type = "block"; //le type (peut etre "block" ou "minerai" seulement)
    float strength = 1.5f; //le temps qu'il faut pour casser le block (plus c'est élevé plus il faut de temps) 1.5 = stone

    int min_exp = 3;

    int max_exp = 7;
    BlockConfig(int id, String blockName, String type, float strength,
                int min_exp, int max_exp){
        this.id = id;
        this.blockName = blockName;
        this.type = type;
        this.strength = strength;
        //pour les minerais
        this.min_exp = min_exp;
        this.max_exp = max_exp;
    }

    public int getId() {
        return id;
    }

    public String getBlockName() {
        return blockName;
    }

    public String getType() {
        return type;
    }

    public float getStrength() {
        return strength;
    }

    public int getMin_exp() {
        return min_exp;
    }

    public int getMax_exp() {
        return max_exp;
    }

    @Override
    public String toString() {
        return "Block "+id+ " {" + "blockName='"+this.blockName
                +"'}";
    }
}
