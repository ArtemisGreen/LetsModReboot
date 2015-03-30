package com.ArtemisGreen.LetsModReboot;

import com.ArtemisGreen.LetsModReboot.proxy.IProxy;
import com.ArtemisGreen.LetsModReboot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.Mod_ID, name = Reference.Mod_Name, version = Reference.Version)
public class LetsModReboot
{
    @Mod.Instance(Reference.Mod_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide = "com.ArtemisGreen.LetsModReboot.proxy.ClientProxy", serverSide = "com.ArtemisGreen.LetsModReboot.proxy.ServerProxy")
    public  static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public  void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public  void postInit(FMLPostInitializationEvent event)
    {

    }
}
