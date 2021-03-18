package jp.cactuses.hypixelhighqoltool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
@Mod(modid = hypixelhighqoltool.MODID, version = hypixelhighqoltool.VERSION)
public class hypixelhighqoltool{
    public static final String MODID = "hypixelhighqoltool";
    public static final String VERSION = "1.0";
    public String test = "FIRST";

    @EventHandler
    public void init(FMLInitializationEvent event){
        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @SubscribeEvent
    public void receivecommand(ServerChatEvent event){
        String com = event.message;
        test = com;
        if(com.equals(".rp")){
            test = "i got that";
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/p list");
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onRender(RenderTickEvent event){
        if(Minecraft.getMinecraft().inGameHasFocus){
            Minecraft.getMinecraft().fontRendererObj.drawString(test,300,5,5312237);
        }
    }

}

    