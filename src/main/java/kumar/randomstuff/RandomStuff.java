package kumar.randomstuff;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.enums.ArtType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.util.ClientStartEntrypoint;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class RandomStuff implements ModInitializer, RecipeEntrypoint, GameStartEntrypoint {
	public static final String MOD_ID = "randomstuff";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ArtType paintingAlex;

	@Override
	public void onInitialize() {
		LOGGER.info("RandomStuff initialized.");
	}

	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}

	@Override
	public void beforeGameStart() {
		paintingAlex = new ArtType("paintingAlex", "Alex", "dunno tbh", "randomstuff:art/alex", 16, 16);
	}

	@Override
	public void afterGameStart() {

	}
}
