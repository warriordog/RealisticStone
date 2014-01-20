package net.acomputerdog.RealisticStone;

import net.acomputerdog.BlazeLoader.api.block.ApiBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class BlockRealisticStone extends BlockStone {

    protected BlockRealisticStone(Block oldStone) {
        super();
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypePiston);
        this.setBlockName("stone");
        this.setBlockTextureName("stone");
        this.blockIcon = ApiBlock.getBlockIcon(oldStone);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(this);
    }

    public float getBlockHardness(World world, int x, int y, int z)
    {
        if (y <= 11) {
            return blockHardness * 2;
        } else if (y <= 32) {
            return (float)(blockHardness * 1.75);
        } else if (y <= 48) {
            return (float)(blockHardness * 1.5);
        } else if (y <= 64) {
            return (float)(blockHardness * 1.25);
        } else {
            return blockHardness;
        }
    }
}
