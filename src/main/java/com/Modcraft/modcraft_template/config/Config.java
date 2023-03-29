package com.Modcraft.modcraft_template.config;

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

    @Override
    public String toString() {
        return "items = "+this.items+" blocks = "+this.blocks;

    }

    public static void main(String[] args) throws Exception {
        String string = "";
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
            System.out.println("Contenu du fichier: ");
            System.out.println(sb);
            string = sb.toString();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }



        final Gson gson = new GsonBuilder().create();
        final Config test = gson.fromJson(string, Config.class);
        System.out.println("Le test : " + test);
        System.out.println(test.getItems().get(0).getItemName());
    }
}
