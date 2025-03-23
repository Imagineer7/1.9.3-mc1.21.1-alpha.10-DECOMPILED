/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import net.minecraft.client.gui.GuiGraphics;
/*    */ import net.minecraft.client.gui.screens.TitleScreen;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
/*    */ 
/*    */ @Mixin({TitleScreen.class})
/*    */ public class MainMenuGlitchMixin1 {
/* 13 */   private static final ResourceLocation MINECRAFT_LOGO = ResourceLocation.parse("textures/gui/title/minecraft.png");
/*    */   
/*    */   @Inject(method = {"render"}, at = {@At("HEAD")})
/*    */   private void repositionMinecraftLogo(GuiGraphics graphics, int mouseX, int mouseY, float delta, CallbackInfo ci) {
/* 17 */     int logoX = 100;
/* 18 */     int logoY = 10;
/* 19 */     int width = 256;
/* 20 */     int height = 44;
/* 21 */     graphics.blit(MINECRAFT_LOGO, logoX, logoY, 50.0F, 10.0F, width, height, width, height);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\MainMenuGlitchMixin1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */