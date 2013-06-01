package grapemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class ModBlock extends Block
{
    public ModBlock(int par1, Material par2)
    {
        super(par1,par2);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    public String getTextureFile(){
        
        return "";
    }

}
