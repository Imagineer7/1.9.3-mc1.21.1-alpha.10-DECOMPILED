/*    */ package dev.wendigodrip.thebrokenscript.client.gui;
/*    */ 
/*    */ import com.mojang.blaze3d.systems.RenderSystem;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.world.inventory.NullInterfaceMenu;
/*    */ import java.util.HashMap;
/*    */ import net.minecraft.client.gui.GuiGraphics;
/*    */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class NullinterfaceScreen
/*    */   extends AbstractContainerScreen<NullInterfaceMenu> {
/* 18 */   private static final HashMap<String, Object> guistate = NullInterfaceMenu.guistate;
/* 19 */   private static final ResourceLocation texture = TBSConstants.id("textures/screens/nullinterface.png");
/*    */   
/*    */   private final Level world;
/*    */   private final int x;
/*    */   private final int y;
/*    */   private final int z;
/*    */   private final Player entity;
/*    */   
/*    */   public NullinterfaceScreen(NullInterfaceMenu container, Inventory inventory, Component text) {
/* 28 */     super((AbstractContainerMenu)container, inventory, text);
/* 29 */     this.world = container.world;
/* 30 */     this.x = container.x;
/* 31 */     this.y = container.y;
/* 32 */     this.z = container.z;
/* 33 */     this.entity = container.entity;
/* 34 */     this.imageWidth = 176;
/* 35 */     this.imageHeight = 166;
/*    */   }
/*    */   
/*    */   public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/* 39 */     renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
/* 40 */     super.render(guiGraphics, mouseX, mouseY, partialTicks);
/* 41 */     renderTooltip(guiGraphics, mouseX, mouseY);
/*    */   }
/*    */   
/*    */   protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/* 45 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/* 46 */     RenderSystem.enableBlend();
/* 47 */     RenderSystem.defaultBlendFunc();
/* 48 */     guiGraphics.blit(texture, this.leftPos, this.topPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 59 */     RenderSystem.disableBlend();
/*    */   }
/*    */   
/*    */   public boolean keyPressed(int key, int b, int c) {
/* 63 */     if (key == 256) {
/* 64 */       this.minecraft.player.closeContainer();
/* 65 */       return true;
/*    */     } 
/* 67 */     return super.keyPressed(key, b, c);
/*    */   }
/*    */   
/*    */   protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
/* 71 */     guiGraphics.drawString(this.font, 
/*    */         
/* 73 */         (Component)Component.translatable("gui.thebrokenscript.nullinterface.label_behind_you"), 60, 70, -12829636, false);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public void init() {
/* 82 */     super.init();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\gui\NullinterfaceScreen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */