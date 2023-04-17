package com.Modcraft.modcraft_template.config;

import com.Modcraft.modcraft_template.config.objects.BlockConfig;
import com.Modcraft.modcraft_template.config.objects.ItemConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Config {

    public List<ItemConfig> getItems() {
        return items;
    }

    public List<BlockConfig> getBlocks() {
        return blocks;
    }

    protected List <ItemConfig> items = new ArrayList<>();
    protected List <BlockConfig> blocks = new ArrayList<>();

    public void ajouter(ItemConfig item) {
        this.items.add(item);
    }
    public void ajouter(BlockConfig block) {
        this.blocks.add(block);
    }


    public String getConfigFileData(String configFile){
        try {
            // Le fichier d'entrée
            File file = new File(configFile);
            // Créer l'objet File Reader
            FileReader fr = new FileReader(file);
            // Créer l'objet BufferedReader
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;
            while((line = br.readLine()) != null)
            {
                // ajoute la ligne au buffer
                sb.append(line);
                sb.append("\n");
            }
            fr.close();

            return sb.toString();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return "erreur";
    }
    public Config newConfig() {
        String json = getConfigFileData("C:\\Users\\comen\\OneDrive\\Bureau\\Programmation\\configs.json");
        final Gson gson = new GsonBuilder().create();
        Config conf = gson.fromJson(json, Config.class);
        return conf;
    }



}
