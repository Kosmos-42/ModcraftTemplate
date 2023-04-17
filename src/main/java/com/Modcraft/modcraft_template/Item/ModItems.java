package com.Modcraft.modcraft_template.Item;

import com.Modcraft.modcraft_template.ModcraftTemplate;
import com.Modcraft.modcraft_template.config.Config;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModcraftTemplate.MOD_ID);

    public static final Config CONF = new Config().newConfig();

    public static final RegistryObject<Item>[] REGISTERED_ITEMS = new RegistryObject[CONF.getItems().size()];

    public static void registerItems() {
        for (int i = 0; i < CONF.getItems().size(); i++) {
            final String itemName = CONF.getItems().get(i).getItemName();
            REGISTERED_ITEMS[i] = ITEMS.register(itemName, () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODRAFT_TAB)));
        }
    }

//    public static RegistryObject<Item> ZIRCON = ITEMS.register("zircon", //ce nom doit etre le nom du fichier
//            // resources->assets->...->models->item->zircon.json ainsi que dans le fichier lang : "item.<modName>.zircon"
//            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODRAFT_TAB)));
//    public static RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
//            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MODRAFT_TAB)));
//
//    public static RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
//            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.MODRAFT_TAB)
//                    .stacksTo(1)));

    public static void register (IEventBus eventBus){
        registerItems();
        ITEMS.register(eventBus);
    }
}
