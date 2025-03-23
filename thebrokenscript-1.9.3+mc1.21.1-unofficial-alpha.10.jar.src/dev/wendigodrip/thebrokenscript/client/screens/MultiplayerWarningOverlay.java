/*     */ package dev.wendigodrip.thebrokenscript.client.screens;
/*     */ 
/*     */ import com.mojang.blaze3d.platform.GlStateManager;
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.client.player.LocalPlayer;
/*     */ import net.minecraft.client.renderer.GameRenderer;
/*     */ import net.minecraft.client.renderer.ShaderInstance;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.neoforged.neoforge.client.event.ScreenEvent;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/screens/MultiplayerWarningOverlay;", "", "<init>", "()V", "eventHandler", "", "event", "Lnet/neoforged/neoforge/client/event/ScreenEvent$Render$Post;", "thebrokenscript"})
/*     */ public final class MultiplayerWarningOverlay
/*     */ {
/*     */   public final void eventHandler(@NotNull ScreenEvent.Render.Post event) {
/*  22 */     Intrinsics.checkNotNullParameter(event, "event"); if (event.getScreen() instanceof net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen) {
/*  23 */       int w = (event.getScreen()).width;
/*  24 */       int h = (event.getScreen()).height;
/*  25 */       Level world = null;
/*  26 */       double x = 0.0D;
/*  27 */       double y = 0.0D;
/*  28 */       double z = 0.0D;
/*  29 */       LocalPlayer entity = (Minecraft.getInstance()).player;
/*  30 */       if (entity != null) {
/*  31 */         world = entity.level();
/*  32 */         x = entity.getX();
/*  33 */         y = entity.getY();
/*  34 */         z = entity.getZ();
/*     */       } 
/*  36 */       RenderSystem.disableDepthTest();
/*  37 */       RenderSystem.depthMask(false);
/*  38 */       RenderSystem.enableBlend();
/*  39 */       RenderSystem.setShader(MultiplayerWarningOverlay::eventHandler$lambda$0);
/*  40 */       RenderSystem.blendFuncSeparate(
/*  41 */           GlStateManager.SourceFactor.SRC_ALPHA, 
/*  42 */           GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, 
/*  43 */           GlStateManager.SourceFactor.ONE, 
/*  44 */           GlStateManager.DestFactor.ZERO);
/*     */       
/*  46 */       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*  47 */       event.getGuiGraphics()
/*  48 */         .blit(
/*  49 */           TBSConstants.id("textures/screens/achtung.png"), 
/*  50 */           w / 2 + 99, 
/*  51 */           h / 2 + -76, 
/*  52 */           0.0F, 
/*  53 */           0.0F, 
/*  54 */           32, 
/*  55 */           32, 
/*  56 */           32, 
/*  57 */           32);
/*     */       
/*  59 */       event.getGuiGraphics()
/*  60 */         .blit(
/*  61 */           TBSConstants.id("textures/screens/achtung.png"), 
/*  62 */           w / 2 + -108, 
/*  63 */           h / 2 + -76, 
/*  64 */           0.0F, 
/*  65 */           0.0F, 
/*  66 */           32, 
/*  67 */           32, 
/*  68 */           32, 
/*  69 */           32);
/*     */       
/*  71 */       event.getGuiGraphics()
/*  72 */         .drawString(
/*  73 */           (Minecraft.getInstance()).font, 
/*  74 */           (Component)Component.translatable("gui.thebrokenscript.multiplayer_warning.label_warning"), 
/*  75 */           w / 2 + -18, 
/*  76 */           h / 2 + -112, 
/*  77 */           -52429, 
/*  78 */           false);
/*     */       
/*  80 */       event.getGuiGraphics()
/*  81 */         .drawString(
/*  82 */           (Minecraft.getInstance()).font, 
/*  83 */           (Component)Component.translatable(
/*  84 */             "gui.thebrokenscript.multiplayer_warning.label_multiplayer_is_not_supported"), 
/*     */           
/*  86 */           w / 2 + -72, 
/*  87 */           h / 2 + -103, 
/*  88 */           -1, 
/*  89 */           false);
/*     */       
/*  91 */       event.getGuiGraphics()
/*  92 */         .drawString(
/*  93 */           (Minecraft.getInstance()).font, 
/*  94 */           (Component)Component.translatable(
/*  95 */             "gui.thebrokenscript.multiplayer_warning.label_you_will_encounter_bugs_and_non"), 
/*     */           
/*  97 */           w / 2 + -126, 
/*  98 */           h / 2 + -94, 
/*  99 */           -1, 
/* 100 */           false);
/*     */       
/* 102 */       event.getGuiGraphics()
/* 103 */         .drawString(
/* 104 */           (Minecraft.getInstance()).font, 
/* 105 */           (Component)Component.translatable(
/* 106 */             "gui.thebrokenscript.multiplayer_warning.label_possible_bugs"), 
/*     */           
/* 108 */           w / 2 + -36, 
/* 109 */           h / 2 + -76, 
/* 110 */           -1, 
/* 111 */           false);
/*     */       
/* 113 */       event.getGuiGraphics()
/* 114 */         .drawString(
/* 115 */           (Minecraft.getInstance()).font, 
/* 116 */           (Component)Component.translatable(
/* 117 */             "gui.thebrokenscript.multiplayer_warning.label_event_engine_breaking"), 
/*     */           
/* 119 */           w / 2 + -63, 
/* 120 */           h / 2 + -67, 
/* 121 */           -1, 
/* 122 */           false);
/*     */       
/* 124 */       event.getGuiGraphics()
/* 125 */         .drawString(
/* 126 */           (Minecraft.getInstance()).font, 
/* 127 */           (Component)Component.translatable(
/* 128 */             "gui.thebrokenscript.multiplayer_warning.label_random_world_corruptions"), 
/*     */           
/* 130 */           w / 2 + -63, 
/* 131 */           h / 2 + -58, 
/* 132 */           -1, 
/* 133 */           false);
/*     */       
/* 135 */       event.getGuiGraphics()
/* 136 */         .drawString(
/* 137 */           (Minecraft.getInstance()).font, 
/* 138 */           (Component)Component.translatable(
/* 139 */             "gui.thebrokenscript.multiplayer_warning.label_lots_of_lag"), 
/*     */           
/* 141 */           w / 2 + -63, 
/* 142 */           h / 2 + -49, 
/* 143 */           -1, 
/* 144 */           false);
/*     */       
/* 146 */       event.getGuiGraphics()
/* 147 */         .drawString(
/* 148 */           (Minecraft.getInstance()).font, 
/* 149 */           (Component)Component.translatable(
/* 150 */             "gui.thebrokenscript.multiplayer_warning.label_client_side_events_breaking"), 
/*     */           
/* 152 */           w / 2 + -63, 
/* 153 */           h / 2 + -40, 
/* 154 */           -1, 
/* 155 */           false);
/*     */       
/* 157 */       event.getGuiGraphics()
/* 158 */         .drawString(
/* 159 */           (Minecraft.getInstance()).font, 
/* 160 */           (Component)Component.translatable(
/* 161 */             "gui.thebrokenscript.multiplayer_warning.label_log4shell_events_breaking"), 
/*     */           
/* 163 */           w / 2 + -63, 
/* 164 */           h / 2 + -31, 
/* 165 */           -1, 
/* 166 */           false);
/*     */       
/* 168 */       event.getGuiGraphics()
/* 169 */         .drawString(
/* 170 */           (Minecraft.getInstance()).font, 
/* 171 */           (Component)Component.translatable(
/* 172 */             "gui.thebrokenscript.multiplayer_warning.label_null_does_not_approve"), 
/*     */           
/* 174 */           w / 2 + -63, 
/* 175 */           h / 2 + -13, 
/* 176 */           -16776961, 
/* 177 */           false);
/*     */       
/* 179 */       RenderSystem.depthMask(true);
/* 180 */       RenderSystem.defaultBlendFunc();
/* 181 */       RenderSystem.enableDepthTest();
/* 182 */       RenderSystem.disableBlend();
/* 183 */       RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MultiplayerWarningOverlay INSTANCE = new MultiplayerWarningOverlay();
/*     */   
/*     */   private static final ShaderInstance eventHandler$lambda$0() {
/*     */     return GameRenderer.getPositionTexShader();
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\screens\MultiplayerWarningOverlay.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */