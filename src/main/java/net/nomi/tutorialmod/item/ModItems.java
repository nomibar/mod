package net.nomi.tutorialmod.item;


import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nomi.tutorialmod.TutorialMod;
import net.nomi.tutorialmod.base.ModArmorMaterial;
import net.nomi.tutorialmod.item.custom.EightBallItem;
import net.nomi.tutorialmod.item.custom.Trefle;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ZIRCON = ITEMS.register("zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<Item> RAW_ZIRCON = ITEMS.register("raw_zircon",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));
    public static final RegistryObject<ArmorItem> ZIRCON_CHESTPLATE = ITEMS.register("zircon_chestplate",
            () -> new ArmorItem(ArmorTiers.ZIRCON, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> ZIRCON_BOOT = ITEMS.register("zircon_boots",
            () -> new ArmorItem(ArmorTiers.ZIRCON, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> ZIRCON_HELMET = ITEMS.register("zircon_helmet",
            () -> new ArmorItem(ArmorTiers.ZIRCON, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static final RegistryObject<ArmorItem> ZIRCON_LEGGING = ITEMS.register("zircon_leggings",
            () -> new ArmorItem(ArmorTiers.ZIRCON, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));

    public static final RegistryObject<Item> EIGHT_BALL = ITEMS.register("eight_ball",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> TREFLE = ITEMS.register("trefle",
            () -> new Trefle(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB).stacksTo(1)));

    public static final RegistryObject<Item> ZIRCON_NUGGET = ITEMS.register("zircon_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.TUTORIAL_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }




    public static class ArmorTiers {
        public static final ArmorMaterial ZIRCON = new ModArmorMaterial(
                "zircon",
                45,
                new int[] {5,8,10,5},
                    30,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                4.0F,
                0.2F,
                () -> Ingredient.of(ModItems.ZIRCON.get())

        );

    }
}

