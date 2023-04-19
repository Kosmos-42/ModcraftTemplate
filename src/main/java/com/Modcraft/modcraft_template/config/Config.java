package com.Modcraft.modcraft_template.config;

import com.Modcraft.modcraft_template.ModcraftTemplate;
import com.Modcraft.modcraft_template.config.objects.BlockConfig;
import com.Modcraft.modcraft_template.config.objects.ItemConfig;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Config {

    public static final Config CONF = new Config().newConfig();

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

    public Config newConfig() {

        // obtenir la référence de la ressource à partir du classloader
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream("configs.json");

        // créer un objet InputStreamReader pour lire le contenu de la ressource
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);

        // créer un objet Gson pour convertir le contenu en un objet Config
        Gson gson = new Gson();
        Config conf = gson.fromJson(inputStreamReader, Config.class);

        // fermer les ressources
        try {
            inputStream.close();
            inputStreamReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return conf;

    }

//    public static void main(String[] args) {
//        Config conf = new Config().newConfig();
//        System.out.println(conf.items.get(0).getProprietes().get(1).getDurability());
//
//    }

}
