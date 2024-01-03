package nightkosh.advanced_fishing.item;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import nightkosh.advanced_fishing.api.EnumFishType;
import nightkosh.advanced_fishing.api.ModInfo;
import nightkosh.advanced_fishing.core.Tabs;

/**
 * Advanced Fishing
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class ItemFrogLeg extends Item implements IBauble {

    public ItemFrogLeg() {
        this.setTranslationKey("advanced-fishing.frog_leg");
        this.setRegistryName(ModInfo.ID, "frog_leg");
        this.setCreativeTab(Tabs.FISH_TAB);
        this.setHasSubtypes(true);
        this.setMaxStackSize(1);
    }

    @Override
    public BaubleType getBaubleType(ItemStack itemStack) {
        return BaubleType.TRINKET;
    }

    @Override
    public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
        if(!(player instanceof EntityPlayer))
            return;

        if(((EntityPlayer) player).capabilities.isFlying)
            return;

        if (player.motionY < 0.0)
        {
            player.motionY -= (0.05 - player.motionY) * 0.1D;
        }
        if (player.motionY > 0.0)
        {
            player.motionY += (0.05 - player.motionY) * 0.1D;
        }
        if (player.moveForward > 0.0f && !player.isSneaking()) {
            player.stepHeight = 1.0f;
        }else
            player.stepHeight = 0.5f;
    }
}
