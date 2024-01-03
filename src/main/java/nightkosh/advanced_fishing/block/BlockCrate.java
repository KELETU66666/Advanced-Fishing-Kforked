package nightkosh.advanced_fishing.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.world.storage.loot.LootTable;
import nightkosh.advanced_fishing.api.ModInfo;
import nightkosh.advanced_fishing.core.ModBlocks;
import nightkosh.advanced_fishing.core.Tabs;

import java.util.List;
import java.util.Random;

/**
 * Advanced Fishing
 *
 * @author Keletu
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class BlockCrate extends Block {

    private String loottable = "";

    public BlockCrate(Material material, String name) {
        super(material);
        this.setTranslationKey(ModInfo.ID + "." + name + "_"  + "crate");
        this.setRegistryName(ModInfo.ID, name + "_" + "crate");
        this.setCreativeTab(Tabs.FISH_TAB);
    }

    public String getLootTable() {
        if (this == ModBlocks.WOODEN_CRATE) {
            this.loottable = "gameplay/fishing/fish";
        }
        // Junk
        //else if (this.mode == 1) {
        //    this.loottable = "gameplay/fishing/junk";
        //}
        //// Loot
        //else if (this.mode == 2) {
        //    this.loottable = "gameplay/fishing/treasure";
        //}else {
        //}
        return loottable;
    }

    public int quantityDropped(Random random) {
        return random.nextInt(5);
    }

    @Override
    public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        LootTable table = ((World)world).getLootTableManager().getLootTableFromLocation(new ResourceLocation(getLootTable()));
        LootContext ctx = new LootContext.Builder((WorldServer) world).build();
        List<ItemStack> stacks = table.generateLootForPools(((WorldServer) world).rand, ctx);
        drops.addAll(stacks);
    }
}
