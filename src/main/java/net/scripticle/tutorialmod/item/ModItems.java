package net.scripticle.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scripticle.tutorialmod.TutorialMod;

public class ModItems {
    public static final Item RUBY = registeritem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registeritem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item DOCTORPEPPER = registeritem("dr_pepper", new Item(new FabricItemSettings()));
    public static final Item BABY = registeritem("Baby", new Item(new FabricItemSettings().food(ModFoodComponents.DOCTORPEPPER)));




    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registeritem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for " + TutorialMod.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);

    }
}


