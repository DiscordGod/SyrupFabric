package com.emhwebserver.syrup.listeners;

import com.emhwebserver.syrup.event.Event;
import org.dimdev.rift.listener.client.OverlayRenderer;

public class RenderOverlayListener implements OverlayRenderer {
    @Override
    public void renderOverlay() {
        Event.uiRenderer.draw();
    }
}
