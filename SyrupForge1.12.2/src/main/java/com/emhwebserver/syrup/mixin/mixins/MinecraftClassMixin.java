package com.emhwebserver.syrup.mixin.mixins;

import com.emhwebserver.syrup.event.Event;
import com.emhwebserver.syrup.handler.KeyHandler;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftClassMixin {

    @Inject(method = "runTick", at = @At(value = "INVOKE", target = "net/minecraft/client/renderer/texture/TextureManager.tick()V"))
    private void runTick(CallbackInfo callbackInfo) {
        Event.clientTick();
        KeyHandler.onTick();
    }

}
