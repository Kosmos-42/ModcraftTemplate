package com.Modcraft.modcraft_template.Item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MODRAFT_TAB = new CreativeModeTab("modcraft") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Item.byId(29));
        }
    };
}
