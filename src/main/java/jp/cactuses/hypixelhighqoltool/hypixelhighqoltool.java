package jp.cactuses.hypixelhighqoltool;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.event.CommandEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

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
