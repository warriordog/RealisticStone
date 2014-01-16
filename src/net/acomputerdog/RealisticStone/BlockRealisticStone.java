package net.acomputerdog.RealisticStone;

import net.acomputerdog.BlazeLoader.api.block.ApiBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class BlockRealisticStone extends BlockStone {

    protected BlockRealisticStone(Block oldStone) {
        super();
        this.func_149711_c(1.5F);
        this.func_149752_b(10.0F);
        this.func_149672_a(field_149780_i);
        this.func_149663_c("stone");
        this.func_149658_d("stone");
        this.field_149761_L = ApiBlock.getBlockIcon(oldStone);
    }

    public Item func_149650_a(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.func_150898_a(Blocks.field_150347_e);
    }

    public float func_149712_f(World world, int x, int y, int z)
    {
        if (y <= 11) {
            return field_149782_v * 2;
        } else if (y <= 32) {
            return (float)(field_149782_v * 1.75);
        } else if (y <= 48) {
            return (float)(field_149782_v * 1.5);
        } else if (y <= 64) {
            return (float)(field_149782_v * 1.25);
        } else {
            return field_149782_v;
        }
    }
}
