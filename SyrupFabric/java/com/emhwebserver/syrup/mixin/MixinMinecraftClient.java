package com.emhwebserver.syrup.mixin;

import com.emhwebserver.syrup.SyrupClient;
import com.emhwebserver.syrup.SyrupMod;
import com.emhwebserver.syrup.event.Event;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({MinecraftClient.class})
public class MixinMinecraftClient
{
  @Inject(method={"tick"}, slice={@Slice(from=@At(value="INVOKE", target="Lnet/minecraft/util/profiler/DisableableProfiler;push(Ljava/lang/String;)V"))}, at={@At(value="HEAD", ordinal=0)})
  private void clientTick(CallbackInfo callbackInfo) {
    Event.clientTick();
  }
  
  @Inject(method={"handleInputEvents"}, at={@At("TAIL")})
  private void handleKeybinds(CallbackInfo callbackInfo) {
    SyrupClient.handleKeybinds();
  }

}
