/*    */ package dev.wendigodrip.thebrokenscript.client.gui;
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import dev.wendigodrip.thebrokenscript.world.inventory.TabMenu;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.gui.GuiGraphics;
/*    */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\004\n\002\020\013\n\002\b\007\030\000 $2\n\022\006\022\004\030\0010\0020\001:\001$B\037\022\006\020\003\032\0020\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\004\b\b\020\tJ(\020\022\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\r2\006\020\027\032\0020\r2\006\020\030\032\0020\031H\026J(\020\032\032\0020\0232\006\020\024\032\0020\0252\006\020\030\032\0020\0312\006\020\033\032\0020\r2\006\020\034\032\0020\rH\024J \020\035\032\0020\0362\006\020\037\032\0020\r2\006\020 \032\0020\r2\006\020!\032\0020\rH\026J \020\"\032\0020\0232\006\020\024\032\0020\0252\006\020\026\032\0020\r2\006\020\027\032\0020\rH\024J\b\020#\032\0020\023H\026R\016\020\n\032\0020\013X\004¢\006\002\n\000R\016\020\f\032\0020\rX\004¢\006\002\n\000R\016\020\016\032\0020\rX\004¢\006\002\n\000R\016\020\017\032\0020\rX\004¢\006\002\n\000R\016\020\020\032\0020\021X\004¢\006\002\n\000¨\006%"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/gui/TabScreen;", "Lnet/minecraft/client/gui/screens/inventory/AbstractContainerScreen;", "Ldev/wendigodrip/thebrokenscript/world/inventory/TabMenu;", "container", "inventory", "Lnet/minecraft/world/entity/player/Inventory;", "text", "Lnet/minecraft/network/chat/Component;", "<init>", "(Ldev/wendigodrip/thebrokenscript/world/inventory/TabMenu;Lnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/network/chat/Component;)V", "world", "Lnet/minecraft/world/level/Level;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/player/Player;", "render", "", "guiGraphics", "Lnet/minecraft/client/gui/GuiGraphics;", "mouseX", "mouseY", "partialTicks", "", "renderBg", "gx", "gy", "keyPressed", "", "key", "b", "c", "renderLabels", "init", "Companion", "thebrokenscript"})
/*    */ public final class TabScreen extends AbstractContainerScreen<TabMenu> {
/*    */   public TabScreen(@NotNull TabMenu container, @NotNull Inventory inventory, @NotNull Component text) {
/* 15 */     super((AbstractContainerMenu)container, inventory, text);
/* 16 */     this.world = container.getWorld();
/* 17 */     this.x = container.getX();
/* 18 */     this.y = container.getY();
/* 19 */     this.z = container.getZ();
/* 20 */     this.entity = container.getEntity();
/*    */ 
/*    */     
/* 23 */     this.imageWidth = 176;
/* 24 */     this.imageHeight = 166;
/*    */   }
/*    */   
/*    */   public void render(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/* 28 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics"); renderBackground(guiGraphics, mouseX, mouseY, partialTicks); super
/* 29 */       .render(guiGraphics, mouseX, mouseY, partialTicks);
/* 30 */     renderTooltip(guiGraphics, mouseX, mouseY);
/*    */   }
/*    */   
/*    */   protected void renderBg(@NotNull GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/* 34 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics"); RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 35 */     RenderSystem.enableBlend();
/* 36 */     RenderSystem.defaultBlendFunc();
/* 37 */     guiGraphics.blit(
/* 38 */         TBSConstants.id("textures/screens/tab.png"), 
/* 39 */         this.leftPos + 58, 
/* 40 */         this.topPos + -32, 
/* 41 */         0.0F, 
/* 42 */         0.0F, 
/* 43 */         64, 
/* 44 */         16, 
/* 45 */         64, 
/* 46 */         16);
/*    */     
/* 48 */     RenderSystem.disableBlend();
/*    */   }
/*    */   
/*    */   public boolean keyPressed(int key, int b, int c) {
/* 52 */     if (key == 256) {
/* 53 */       Intrinsics.checkNotNull(this.minecraft); Intrinsics.checkNotNull(this.minecraft.player); this.minecraft.player.closeContainer();
/* 54 */       return true;
/*    */     } 
/* 56 */     return super.keyPressed(key, b, c);
/*    */   }
/*    */   
/*    */   protected void renderLabels(@NotNull GuiGraphics guiGraphics, int mouseX, int mouseY) {
/* 60 */     Intrinsics.checkNotNullParameter(guiGraphics, "guiGraphics"); guiGraphics.drawString(this.font, ReturnPlayerNameProcedure.execute((Entity)this.entity), 61, -29, -12829636, false);
/*    */   }
/*    */   
/*    */   public void init() {
/* 64 */     super.init();
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\016\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R*\020\004\032\036\022\004\022\0020\006\022\004\022\0020\0010\005j\016\022\004\022\0020\006\022\004\022\0020\001`\007X\004¢\006\002\n\000¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/gui/TabScreen$Companion;", "", "<init>", "()V", "guistate", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "thebrokenscript"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @NotNull
/* 68 */   public static final Companion Companion = new Companion(null); @NotNull private final Level world; private final int x; private final int y; private final int z; @NotNull private final Player entity; @NotNull private static final HashMap<String, Object> guistate = TabMenu.Companion.getGuistate();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\gui\TabScreen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */