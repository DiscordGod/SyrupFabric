package com.emhwebserver.syrup.mixin;

import com.emhwebserver.syrup.utils.CPSHelper;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class ClickMixin {

    @Inject(method = "clickMouse", at = @At("TAIL"))
    private void onLeftClick(CallbackInfo ci) {
        CPSHelper.addClick();
    }

}
