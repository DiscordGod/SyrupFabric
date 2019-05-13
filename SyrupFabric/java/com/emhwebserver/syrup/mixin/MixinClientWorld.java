package com.emhwebserver.syrup.mixin;

import com.emhwebserver.syrup.SyrupMod;
import net.minecraft.client.world.ClientWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientWorld.class)
public class MixinClientWorld {

    @Inject(method = {"disconnect"}, at= @At("TAIL"))
    private void leaveWorld(CallbackInfo callbackInfo) {
        SyrupMod.CONFIG.save();
    }

}
