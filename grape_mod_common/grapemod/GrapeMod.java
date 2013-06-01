package grapemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import grapemod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class GrapeMod {

    
    //Blocks
    public static Block vineStalk;
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        
    }
    
    @Init
    public void init(FMLInitializationEvent event) {
        
       vineStalk = (new ModBlock(4000,Material.wood)).setHardness(2.0F).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("Grape Vine");
        
        registeringBlocks();
        blockNames();
        itemNames();
        recipes();
        smelting();
        
    }
    
    private void registeringBlocks() {
        // TODO Auto-generated method stub
        
    }
    
    private void blockNames() {
        // TODO Auto-generated method stub
        
    }
    
    private void itemNames() {
        // TODO Auto-generated method stub
        
    }  
    
    private void recipes() {
        // TODO Auto-generated method stub
        
    }
    
    private void smelting() {
        // TODO Auto-generated method stub
        
    }

    @PostInit
    public void postInit(FMLPostInitializationEvent event) {
        
    }
}
