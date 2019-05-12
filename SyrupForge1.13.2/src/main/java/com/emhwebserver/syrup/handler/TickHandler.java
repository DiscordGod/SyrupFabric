package com.emhwebserver.syrup.handler;

import com.emhwebserver.syrup.event.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class TickHandler {

    @SubscribeEvent
    public void clientTick(TickEvent.PlayerTickEvent event) {
        Event.playerTick();
        KeyHandler.onTick();
    }

}
