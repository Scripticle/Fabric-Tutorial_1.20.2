package net.scripticle.tutorialmod;

import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.scripticle.tutorialmod.item.ModItemGroups;
import net.scripticle.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroup();
		ModItems.registerModItems();

		FuelRegistry.INSTANCE.add(ModItems.BABY, 1000);

		LOGGER.info("Hello Fabric world!");
	}
}