package com.Kosmos42.modcraft_template.Item;

import com.Kosmos42.modcraft_template.ModcraftTemplate;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModcraftTemplate.MOD_ID);

    public static RegistryObject<Item> ZIRCON = ITEMS.register("zircon", //ce nom doit etre le nom du fichier
            // resources->assets->...->models->item->zircon.json ainsi que dans le fichier lang : "item.<modName>.zircon"
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODRAFT_TAB)));
    public static RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODRAFT_TAB)));
    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}