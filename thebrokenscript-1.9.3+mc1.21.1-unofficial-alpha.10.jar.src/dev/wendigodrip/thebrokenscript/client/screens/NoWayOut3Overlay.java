/*    */ package dev.wendigodrip.thebrokenscript.client.screens;
/*    */ import com.mojang.blaze3d.platform.GlStateManager;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import dev.wendigodrip.thebrokenscript.procedures.nowayout.NoWayOut3DisplayOverlayIngameProcedure;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.client.player.LocalPlayer;
/*    */ import net.minecraft.client.renderer.ShaderInstance;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.EventPriority;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.client.event.RenderGuiEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/screens/NoWayOut3Overlay;", "", "<init>", "()V", "eventHandler", "", "event", "Lnet/neoforged/neoforge/client/event/RenderGuiEvent$Pre;", "thebrokenscript"})
/*    */ public final class NoWayOut3Overlay {
/*    */   @SubscribeEvent(priority = EventPriority.NORMAL)
/*    */   public final void eventHandler(@NotNull RenderGuiEvent.Pre event) {
/* 20 */     Intrinsics.checkNotNullParameter(event, "event"); int w = event.getGuiGraphics().guiWidth();
/* 21 */     int h = event.getGuiGraphics().guiHeight();
/* 22 */     Level world = null;
/* 23 */     double x = 0.0D;
/* 24 */     double y = 0.0D;
/* 25 */     double z = 0.0D;
/* 26 */     LocalPlayer entity = (Minecraft.getInstance()).player;
/* 27 */     if (entity != null) {
/* 28 */       world = entity.level();
/* 29 */       x = entity.getX();
/* 30 */       y = entity.getY();
/* 31 */       z = entity.getZ();
/*    */     } 
/* 33 */     RenderSystem.disableDepthTest();
/* 34 */     RenderSystem.depthMask(false);
/* 35 */     RenderSystem.enableBlend();
/* 36 */     RenderSystem.setShader(NoWayOut3Overlay::eventHandler$lambda$0);
/* 37 */     RenderSystem.blendFuncSeparate(
/* 38 */         GlStateManager.SourceFactor.SRC_ALPHA, 
/* 39 */         GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, 
/* 40 */         GlStateManager.SourceFactor.ONE, 
/* 41 */         GlStateManager.DestFactor.ZERO);
/*    */     
/* 43 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 44 */     if (NoWayOut3DisplayOverlayIngameProcedure.execute((LevelAccessor)world)) {
/* 45 */       event.getGuiGraphics()
/* 46 */         .blit(
/* 47 */           TBSConstants.id("textures/screens/textvhs1.png"), 
/* 48 */           w / 2 + -459, 
/* 49 */           h / 2 + 5, 
/* 50 */           0.0F, 
/* 51 */           0.0F, 
/* 52 */           750, 
/* 53 */           150, 
/* 54 */           750, 
/* 55 */           150);
/*    */     }
/*    */     
/* 58 */     RenderSystem.depthMask(true);
/* 59 */     RenderSystem.defaultBlendFunc();
/* 60 */     RenderSystem.enableDepthTest();
/* 61 */     RenderSystem.disableBlend();
/* 62 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final NoWayOut3Overlay INSTANCE = new NoWayOut3Overlay();
/*    */   
/*    */   private static final ShaderInstance eventHandler$lambda$0() {
/*    */     return GameRenderer.getPositionTexShader();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\screens\NoWayOut3Overlay.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */