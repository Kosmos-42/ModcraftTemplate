package com.Modcraft.modcraft_template.block;

import com.Modcraft.modcraft_template.Item.ModCreativeModeTab;
import com.Modcraft.modcraft_template.Item.ModItems;
import com.Modcraft.modcraft_template.ModcraftTemplate;
import com.Modcraft.modcraft_template.config.Config;
import com.Modcraft.modcraft_template.config.objects.BlockConfig;
import com.Modcraft.modcraft_template.config.objects.ItemConfig;
import com.Modcraft.modcraft_template.config.objects.ItemProperties;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ModcraftTemplate.MOD_ID);
    public static final Config CONF = new Config().newConfig();

    public static final RegistryObject<Block>[] REGISTERED_ITEMS = new RegistryObject[CONF.getItems().size()];

    public static void registerBlocks() {
        for (int i = 0; i < CONF.getItems().size(); i++) {
            BlockConfig block = CONF.getBlocks().get(i);
            //ItemProperties blockProps = item.getProprietes().get(0);


        }
    }

//    public static final RegistryObject<Block> ZIRCON_ORE = registerBlock("zircon_ore",
//            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
//                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.MODRAFT_TAB);
//
//    public static final RegistryObject<Block> ZIRCON_BLOCK = registerBlock("zircon_block",
//            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
//                    .strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.MODRAFT_TAB);
//
//    public static final RegistryObject<Block> DEEPSLATE_ZIRCON_ORE = registerBlock("deepslate_zircon_ore",
//            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
//                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)), ModCreativeModeTab.MODRAFT_TAB);
//
//    public static final RegistryObject<Block> JUMPY_BLOCK = registerBlock("jumpy_block",
//            () -> new JumpyBlock(BlockBehaviour.Properties.of(Material.STONE)
//                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.MODRAFT_TAB);
//
//    public static final RegistryObject<Block> ZIRCON_LAMP = registerBlock("zircon_lamp",
//            () -> new ZirconLampBlock(BlockBehaviour.Properties.of(Material.STONE)
//                    .strength(2f).requiresCorrectToolForDrops()
//                    .lightLevel(state -> state.getValue(ZirconLampBlock.LIT) ? 15 : 0)), ModCreativeModeTab.MODRAFT_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
