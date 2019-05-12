package com.emhwebserver.syrup.mixin;

import com.emhwebserver.syrup.utils.CPSHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({Mouse.class})
public class MixinMouseClick
{
  @Inject(method={"onMouseButton"}, at={@org.spongepowered.asm.mixin.injection.At("TAIL")})
  private void onMouseButton(CallbackInfo callbackInfo)
  {
    if (MinecraftClient.getInstance().mouse.wasLeftButtonClicked()) {
      CPSHelper.addClick();
    }
  }
}
