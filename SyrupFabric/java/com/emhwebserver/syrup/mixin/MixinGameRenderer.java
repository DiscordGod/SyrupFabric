package com.emhwebserver.syrup.mixin;

import com.emhwebserver.syrup.SyrupMod;
import com.emhwebserver.syrup.event.Event;
import com.emhwebserver.syrup.ui.UIRenderer;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameRenderer.class})
public class MixinGameRenderer {
  @Inject(method={"render"}, slice={@Slice(from=@At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/InGameHud;draw(F)V"))}, at={@At(value="INVOKE", ordinal=0)})
  private void renderOverlay(float var1, long nanoTime, boolean var4, CallbackInfo callbackInfo) {
    Event.uiRenderer.draw();
  }
}
