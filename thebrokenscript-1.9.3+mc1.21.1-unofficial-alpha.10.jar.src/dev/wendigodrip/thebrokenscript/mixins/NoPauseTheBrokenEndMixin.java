/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndEntity;
/*    */ import dev.wendigodrip.thebrokenscript.util.EntityChecker;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({Minecraft.class})
/*    */ public class NoPauseTheBrokenEndMixin {
/*    */   @Inject(method = {"pauseGame"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void preventPause(boolean bl, CallbackInfo info) {
/* 16 */     LocalPlayer player = (Minecraft.getInstance()).player;
/*    */     
/* 18 */     if (player != null && EntityChecker.isCustomEntityNearby((Player)player, TheBrokenEndEntity.class))
/* 19 */       info.cancel(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\NoPauseTheBrokenEndMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */