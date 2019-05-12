package com.emhwebserver.syrup.listeners;

import com.emhwebserver.syrup.event.Event;
import net.minecraft.client.Minecraft;
import org.dimdev.rift.listener.MinecraftStartListener;
import org.dimdev.rift.listener.client.ClientTickable;

public class MainListener implements ClientTickable, MinecraftStartListener {

    @Override
    public void clientTick(Minecraft mc) {
        Event.clientTick();
    }

    @Override
    public void onMinecraftStart() {
        Event.init();
    }

}