package com.emhwebserver.syrup.mixin;

import com.emhwebserver.syrup.event.Event;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({GameRenderer.class})
public class MixinGameRenderer
{
  @Inject(method={"render"}, slice={@org.spongepowered.asm.mixin.injection.Slice(from=@org.spongepowered.asm.mixin.injection.At(value="INVOKE", target="Lnet/minecraft/client/gui/hud/InGameHud;draw(F)V"))}, at={@org.spongepowered.asm.mixin.injection.At(value="INVOKE", ordinal=0)})
  private void renderOverlay(float var1, long nanoTime, boolean var4, CallbackInfo callbackInfo)
  {
    Event.uiRenderer.draw();
  }
}
