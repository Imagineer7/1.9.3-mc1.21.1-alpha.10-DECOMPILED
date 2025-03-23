/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import dev.wendigodrip.thebrokenscript.misc.GameProfiles;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.client.multiplayer.PlayerInfo;
/*    */ import net.minecraft.client.resources.PlayerSkin;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({PlayerInfo.class})
/*    */ public class PlayerInfoMixin
/*    */ {
/*    */   @Inject(method = {"createSkinLookup"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private static void modifySkinLookup(GameProfile profile, CallbackInfoReturnable<Supplier<PlayerSkin>> cir) {
/* 18 */     if (profile.getId().toString().equals("00000000-0000-0000-0000-000000000000")) {
/* 19 */       cir.setReturnValue(() -> GameProfiles.NULL_SKIN);
/* 20 */       cir.cancel();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\PlayerInfoMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */