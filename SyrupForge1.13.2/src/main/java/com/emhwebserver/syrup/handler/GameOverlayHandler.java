package com.emhwebserver.syrup.handler;

import com.emhwebserver.syrup.event.Event;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class GameOverlayHandler {

    @SubscribeEvent
    public void onGameOverlay(RenderGameOverlayEvent.Post event){
        Event.uiRenderer.draw();
    }

}
