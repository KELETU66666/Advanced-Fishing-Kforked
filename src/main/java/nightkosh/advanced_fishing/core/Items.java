package nightkosh.advanced_fishing.core;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nightkosh.advanced_fishing.api.AdvancedFishingAPI;
import nightkosh.advanced_fishing.api.ModInfo;
import nightkosh.advanced_fishing.item.ItemBlazingFishingPole;
import nightkosh.advanced_fishing.item.ItemFish;
import nightkosh.advanced_fishing.item.ItemFrogLeg;

/**
 * Advanced Fishing
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
@GameRegistry.ObjectHolder(ModInfo.ID)
public class Items {

    public static final Item FISH = new ItemFish();
    public static final Item BLAZING_FISHING_POLE = new ItemBlazingFishingPole();

    public static final Item FROG_LEG = new ItemFrogLeg();

    @Mod.EventBusSubscriber(modid = ModInfo.ID)
    public static class RegistrationHandler {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().register(BLAZING_FISHING_POLE);
            event.getRegistry().register(FISH);
            event.getRegistry().register(FROG_LEG);

            AdvancedFishingAPI.FISH_ITEM = FISH;
        }
    }
}
