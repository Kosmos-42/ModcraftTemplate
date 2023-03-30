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


    public static Config getConfig() {
        return config;
    }

    protected static Config config;
    protected List <ItemConfig> items = new ArrayList<>();
    protected List <BlockConfig> blocks = new ArrayList<>();

    public void ajouter(ItemConfig item) {
        this.items.add(item);
    }
    public void ajouter(BlockConfig block) {
        this.blocks.add(block);
    }

    @Override
    public String toString() {
        return "items = "+this.items+" blocks = "+this.blocks;

    }

    public static void newConfig() {
        String json = "";
        try
        {
            // Le fichier d'entrée
            File file = new File("src\\main\\java\\com\\Modcraft\\modcraft_template\\config\\configs.json");
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
            json = sb.toString();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }



        final Gson gson = new GsonBuilder().create();
        gson.fromJson(json, Config.class);
        Config.config = gson.fromJson(json, Config.class);
    }
}
