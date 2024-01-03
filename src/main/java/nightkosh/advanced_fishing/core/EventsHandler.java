package nightkosh.advanced_fishing.core;

import baubles.api.BaublesApi;
import baubles.api.cap.IBaublesItemHandler;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import nightkosh.advanced_fishing.entity.projectile.EntityCustomFishHook;
import nightkosh.advanced_fishing.item.ItemFrogLeg;

import java.util.HashSet;
import java.util.Set;

/**
 * Advanced Fishing
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class EventsHandler {

    @SubscribeEvent
    public void onJump(LivingEvent.LivingJumpEvent event) {
        if (event.getEntityLiving() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) event.getEntityLiving();
            IBaublesItemHandler baubles = BaublesApi.getBaublesHandler(player);
            for (int i = 0; i<baubles.getSlots(); i++) {
                ItemStack stack = baubles.getStackInSlot(i);
                if (stack.getItem() instanceof ItemFrogLeg) {
                    player.motionY += 0.1;
                    player.fallDistance -= 1.3;
                }
            }
        }
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void entityJoinWorldEvent(EntityJoinWorldEvent event) {
        Entity entity = event.getEntity();

        if (Config.overrideVanillaFishing && entity instanceof EntityFishHook && entity.getClass().equals(EntityFishHook.class)) {
            World world = event.getWorld();
            if (!world.isRemote) {
                EntityPlayer player = ((EntityFishHook) entity).getAngler();
                ItemStack stack = player.getHeldItem(EnumHand.MAIN_HAND);
                if (stack.getItem() != Items.FISHING_ROD) {
                    stack = player.getHeldItem(EnumHand.OFF_HAND);
                }
                entity.setDead();

                EntityCustomFishHook hook = new EntityCustomFishHook(world, player);

                int speed = EnchantmentHelper.getFishingSpeedBonus(stack);
                if (speed > 0) {
                    hook.setLureSpeed(speed);
                }
                int luck = EnchantmentHelper.getFishingLuckBonus(stack);
                if (luck > 0) {
                    hook.setLuck(luck);
                }

                world.spawnEntity(hook);

                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public void lootLoad(LootTableLoadEvent event) {
        LootTables.inject(event);
    }
}
