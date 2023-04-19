package com.Modcraft.modcraft_template.Item;

import com.Modcraft.modcraft_template.block.ModBlocks;
import com.Modcraft.modcraft_template.config.Config;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MODRAFT_TAB = new CreativeModeTab("modcraft") {
        @Override
        public ItemStack makeIcon() {

            if(Config.CONF.getItems().size() == 0){
                return new ItemStack(ModBlocks.REGISTERED_ITEMS[0].get().asItem());
            }
            return new ItemStack(ModItems.REGISTERED_ITEMS[0].get());
        }
    };
}
