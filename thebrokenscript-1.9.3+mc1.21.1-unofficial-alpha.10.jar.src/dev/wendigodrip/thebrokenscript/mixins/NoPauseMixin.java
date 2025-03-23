/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.CircuitEntity;
/*    */ import java.util.List;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.gui.components.Button;
/*    */ import net.minecraft.client.gui.screens.PauseScreen;
/*    */ import net.minecraft.client.multiplayer.ClientLevel;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({PauseScreen.class})
/*    */ public class NoPauseMixin
/*    */ {
/*    */   @Shadow
/*    */   private Button disconnectButton;
/*    */   
/*    */   @Inject(method = {"init"}, at = {@At("TAIL")})
/*    */   private void disableSaveAndQuitButton(CallbackInfo ci) {
/* 24 */     if (this.disconnectButton != null) {
/* 25 */       boolean entityNearby = isEntityNearby(1000.0D);
/* 26 */       this.disconnectButton.active = !entityNearby;
/*    */     } 
/*    */   }
/*    */   
/*    */   private boolean isEntityNearby(double range) {
/* 31 */     Minecraft minecraft = Minecraft.getInstance();
/* 32 */     LocalPlayer player = minecraft.player;
/* 33 */     ClientLevel world = minecraft.level;
/* 34 */     if (player == null || world == null) {
/* 35 */       return false;
/*    */     }
/* 37 */     List entities = world.getEntitiesOfClass(CircuitEntity.class, player.getBoundingBox().inflate(range));
/* 38 */     return !entities.isEmpty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\NoPauseMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */