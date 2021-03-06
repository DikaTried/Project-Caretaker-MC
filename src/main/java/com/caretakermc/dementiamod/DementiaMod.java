package com.caretakermc.dementiamod;

import com.caretakermc.dementiamod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DementiaMod.MODID, name = DementiaMod.NAME, version = DementiaMod.VERSION)
public class DementiaMod {
    public static final String MODID = "dementiamod";
    public static final String NAME = "Dementia Mod";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide = "com.caretakermc.dementiamod.proxy.ClientProxy", serverSide = "com.caretakermc.dementiamod.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.init(event);
    }
}
