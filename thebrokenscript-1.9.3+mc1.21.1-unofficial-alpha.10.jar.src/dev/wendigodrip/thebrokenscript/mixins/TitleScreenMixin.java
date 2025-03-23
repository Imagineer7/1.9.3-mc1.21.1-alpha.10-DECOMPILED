/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import net.minecraft.client.gui.GuiGraphics;
/*    */ import net.minecraft.client.gui.components.Button;
/*    */ import net.minecraft.client.gui.components.Renderable;
/*    */ import net.minecraft.client.gui.screens.Screen;
/*    */ import net.minecraft.client.gui.screens.TitleScreen;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.ModifyArg;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({TitleScreen.class})
/*    */ public class TitleScreenMixin
/*    */   extends Screen {
/*    */   protected TitleScreenMixin(Component title) {
/* 20 */     super(title);
/*    */   }
/*    */   
/*    */   @Inject(method = {"init"}, at = {@At("HEAD")})
/*    */   private void refreshMenuBackground(CallbackInfo ci) {
/* 25 */     TBSConstants.refreshMenuBackground();
/*    */   }
/*    */   
/*    */   @Inject(method = {"init"}, at = {@At("TAIL")})
/*    */   private void repositionButtons(CallbackInfo ci) {
/* 30 */     TitleScreen screen = (TitleScreen)this;
/*    */     
/* 32 */     for (Renderable renderable : screen.renderables) {
/* 33 */       if (renderable instanceof Button) { Button button = (Button)renderable; if (!(renderable instanceof net.minecraft.client.gui.components.PlainTextButton)) {
/* 34 */           button.setX(button.getX() - this.width / 2 + 138);
/*    */         } }
/*    */     
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ModifyArg(method = {"render"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/components/LogoRenderer;renderLogo(Lnet/minecraft/client/gui/GuiGraphics;IF)V"), index = 1)
/*    */   private int modifyTitlePosition(int screenWidth) {
/* 47 */     return 290;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ModifyArg(method = {"render"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/components/SplashRenderer;render(Lnet/minecraft/client/gui/GuiGraphics;ILnet/minecraft/client/gui/Font;I)V"), index = 1)
/*    */   private int modifySplashPosition(int screenWidth) {
/* 58 */     return 290;
/*    */   }
/*    */   
/*    */   @Inject(method = {"renderPanorama"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void cancelPanorama(GuiGraphics guiGraphics, float partialTick, CallbackInfo ci) {
/* 63 */     ci.cancel();
/*    */   }
/*    */   
/*    */   @Inject(method = {"renderBackground"}, at = {@At("HEAD")})
/*    */   private void renderCustomBackground(GuiGraphics cx, int mouseX, int mouseY, float partialTick, CallbackInfo ci) {
/* 68 */     cx.blit(
/* 69 */         TBSConstants.getMENU_BACKGROUND(), 0, 0, 0.0F, 0.0F, this.width, this.height, this.width, this.height);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\TitleScreenMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */