package com.Modcraft.modcraft_template.Item;

import com.Modcraft.modcraft_template.Item.custom.EightBallItem;
import com.Modcraft.modcraft_template.ModcraftTemplate;
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

    public static RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.MODRAFT_TAB)
                    .stacksTo(1)));
    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
