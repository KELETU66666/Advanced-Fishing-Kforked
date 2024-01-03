package nightkosh.advanced_fishing.core;

import net.minecraft.init.PotionTypes;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nightkosh.advanced_fishing.api.EnumFishType;
import nightkosh.advanced_fishing.api.ModInfo;

import static net.minecraft.init.Items.*;

/**
 * Advanced Fishing
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class Recipes {

    private static final ResourceLocation GROUP = new ResourceLocation(ModInfo.ID);


    public static void smeltingRecipesRegistration() {

        GameRegistry.registerFuelHandler(fuel -> {

            if(fuel.isItemEqual(new ItemStack(Items.FISH, 1, EnumFishType.OAK_FISH.ordinal()))) {
                return 300;
            }
            if(fuel.isItemEqual(new ItemStack(Items.FISH, 1, EnumFishType.CHARFISH.ordinal()))) {
                return 1600;
            }

            return 0;
        });

        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.OAK_FISH.ordinal()), new ItemStack(Items.FISH, 1, EnumFishType.CHARFISH.ordinal()), 1);

        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.BLUE_JELLYFISH.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.MAGMA_JELLYFISH.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.OBSIDIAN_BREAM.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.NETHER_STURGEON.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.QUARTZ_CHUB.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.ENDER_SHAD.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.EXPLOSIVE_CRUCIAN.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.ANGELFISH.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SPONGE_EATER.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SNOWY_WALLEYE.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SQUID.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.WITHERED_CRUCIAN.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SANDY_BASS.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.RED_SHROOMFIN.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.BROWN_SHROOMFIN.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.FUNGI_CATFISH.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SWAMP_PLAICE.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.CRYSTAL_MULLET.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.CHARGED_BULLHEAD.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.ABYSSAL_LURKER.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.GLACIER_ANCHOVY.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.GREEN_JELLYFISH.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.CURSED_KOI.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SPOOKYFIN.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);


        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.MUD_TUNA.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.FROST_MINNOW.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.PIRANHA.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.GOLDEN_KOI.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SPECULAR_SNAPPER.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.CAVE_TROUT.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.FLAREFIN_KOI.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.BLAZE_PIKE.ordinal()), new ItemStack(COOKED_FISH, 2, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.PEARL_SARDINE.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.CHORUS_KOI.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.RUFFE.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SPARKLING_EEL.ordinal()), new ItemStack(COOKED_FISH, 1, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.ANGLER_FISH.ordinal()), new ItemStack(COOKED_FISH, 3, 1), 1);

        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.MANDARINFISH.ordinal()), new ItemStack(COOKED_FISH, 2, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.SUNFISH.ordinal()), new ItemStack(COOKED_FISH, 2, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.CATFISH.ordinal()), new ItemStack(COOKED_FISH, 3, 1), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.PIKE.ordinal()), new ItemStack(COOKED_FISH, 3, 0), 1);
        GameRegistry.addSmelting(new ItemStack(Items.FISH, 1, EnumFishType.BLUE_JELLYFISH.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);

        //vanilla
        GameRegistry.addSmelting(new ItemStack(FISH, 1, ItemFishFood.FishType.PUFFERFISH.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
        GameRegistry.addSmelting(new ItemStack(FISH, 1, ItemFishFood.FishType.CLOWNFISH.ordinal()), new ItemStack(COOKED_FISH, 1, 0), 1);
    }

    public static void addLuckPotionRecipe() {
        PotionHelper.addMix(PotionTypes.AWKWARD, Ingredient.fromStacks(new ItemStack(FISH, 1, 2)), PotionType.getPotionTypeForName("luck"));
        PotionHelper.addMix(PotionTypes.AWKWARD, Ingredient.fromStacks(new ItemStack(Items.FISH, 1, EnumFishType.CHARFISH.ordinal())), PotionType.getPotionTypeForName("weakness"));
    }
}
