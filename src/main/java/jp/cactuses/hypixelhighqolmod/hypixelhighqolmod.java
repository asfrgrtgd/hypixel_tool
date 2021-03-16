package jp.cactuses.hypixelhighqoltool;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = hypixelhighqoltool.MODID, version = hypixelhighqoltool.VERSION)
public class hypixelhighqoltool{
    public static final String MODID = "hypixelhighqoltool";
    public static final String VERSION = "1.0";

    @EventHandler
    public void init(FMLInitializationEvent event){
        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onChat(ClientChatReceivedEvent event){
    String message = event.message.getUnformattedText();
        if(message.contains("hi")){
            Minecraft.getMinecraft().toggleFullscreen();
        }
    }
}
