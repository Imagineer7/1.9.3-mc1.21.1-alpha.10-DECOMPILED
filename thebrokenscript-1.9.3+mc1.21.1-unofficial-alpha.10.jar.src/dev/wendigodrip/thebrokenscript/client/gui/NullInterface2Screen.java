/*     */ package dev.wendigodrip.thebrokenscript.client.gui;
/*     */ 
/*     */ import com.mojang.blaze3d.systems.RenderSystem;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.world.inventory.NullInterface2Menu;
/*     */ import java.util.HashMap;
/*     */ import net.minecraft.client.gui.GuiGraphics;
/*     */ import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.level.Level;
/*     */ 
/*     */ public class NullInterface2Screen
/*     */   extends AbstractContainerScreen<NullInterface2Menu> {
/*  18 */   private static final HashMap<String, Object> guistate = NullInterface2Menu.guistate;
/*  19 */   private static final ResourceLocation texture = TBSConstants.id("textures/screens/null_interface_2.png");
/*     */   
/*     */   private final Level world;
/*     */   private final int x;
/*     */   private final int y;
/*     */   private final int z;
/*     */   private final Player entity;
/*     */   
/*     */   public NullInterface2Screen(NullInterface2Menu container, Inventory inventory, Component text) {
/*  28 */     super((AbstractContainerMenu)container, inventory, text);
/*  29 */     this.world = container.world;
/*  30 */     this.x = container.x;
/*  31 */     this.y = container.y;
/*  32 */     this.z = container.z;
/*  33 */     this.entity = container.entity;
/*  34 */     this.imageWidth = 176;
/*  35 */     this.imageHeight = 166;
/*     */   }
/*     */   
/*     */   public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
/*  39 */     renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
/*  40 */     super.render(guiGraphics, mouseX, mouseY, partialTicks);
/*  41 */     renderTooltip(guiGraphics, mouseX, mouseY);
/*     */   }
/*     */   
/*     */   protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
/*  45 */     RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
/*  46 */     RenderSystem.enableBlend();
/*  47 */     RenderSystem.defaultBlendFunc();
/*  48 */     guiGraphics.blit(texture, this.leftPos, this.topPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  59 */     RenderSystem.disableBlend();
/*     */   }
/*     */   
/*     */   public boolean keyPressed(int key, int b, int c) {
/*  63 */     if (key == 256) {
/*  64 */       this.minecraft.player.closeContainer();
/*  65 */       return true;
/*     */     } 
/*  67 */     return super.keyPressed(key, b, c);
/*     */   }
/*     */   
/*     */   protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
/*  71 */     guiGraphics.drawString(this.font, 
/*     */         
/*  73 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null"), 6, 7, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  79 */     guiGraphics.drawString(this.font, 
/*     */         
/*  81 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null1"), 42, 7, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  87 */     guiGraphics.drawString(this.font, 
/*     */         
/*  89 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null2"), 78, 7, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     guiGraphics.drawString(this.font, 
/*     */         
/*  97 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null3"), 114, 7, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 103 */     guiGraphics.drawString(this.font, 
/*     */         
/* 105 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null4"), 150, 7, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 111 */     guiGraphics.drawString(this.font, 
/*     */         
/* 113 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null5"), 6, 25, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     guiGraphics.drawString(this.font, 
/*     */         
/* 121 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null6"), 42, 25, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     guiGraphics.drawString(this.font, 
/*     */         
/* 129 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null7"), 78, 25, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 135 */     guiGraphics.drawString(this.font, 
/*     */         
/* 137 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null8"), 114, 25, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     guiGraphics.drawString(this.font, 
/*     */         
/* 145 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null9"), 150, 25, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     guiGraphics.drawString(this.font, 
/*     */         
/* 153 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null10"), 6, 43, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     guiGraphics.drawString(this.font, 
/*     */         
/* 161 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null11"), 42, 43, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 167 */     guiGraphics.drawString(this.font, 
/*     */         
/* 169 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null12"), 78, 43, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 175 */     guiGraphics.drawString(this.font, 
/*     */         
/* 177 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null13"), 114, 43, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 183 */     guiGraphics.drawString(this.font, 
/*     */         
/* 185 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null14"), 150, 43, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     guiGraphics.drawString(this.font, 
/*     */         
/* 193 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null15"), 6, 61, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     guiGraphics.drawString(this.font, 
/*     */         
/* 201 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null16"), 42, 61, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 207 */     guiGraphics.drawString(this.font, 
/*     */         
/* 209 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null17"), 78, 61, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 215 */     guiGraphics.drawString(this.font, 
/*     */         
/* 217 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null18"), 114, 61, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 223 */     guiGraphics.drawString(this.font, 
/*     */         
/* 225 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null19"), 150, 61, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 231 */     guiGraphics.drawString(this.font, 
/*     */         
/* 233 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null20"), 6, 79, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 239 */     guiGraphics.drawString(this.font, 
/*     */         
/* 241 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null21"), 42, 79, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 247 */     guiGraphics.drawString(this.font, 
/*     */         
/* 249 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null22"), 78, 79, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 255 */     guiGraphics.drawString(this.font, 
/*     */         
/* 257 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null23"), 114, 79, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 263 */     guiGraphics.drawString(this.font, 
/*     */         
/* 265 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null24"), 150, 79, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 271 */     guiGraphics.drawString(this.font, 
/*     */         
/* 273 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null25"), 6, 97, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 279 */     guiGraphics.drawString(this.font, 
/*     */         
/* 281 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null26"), 42, 97, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 287 */     guiGraphics.drawString(this.font, 
/*     */         
/* 289 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null27"), 78, 97, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 295 */     guiGraphics.drawString(this.font, 
/*     */         
/* 297 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null28"), 114, 97, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 303 */     guiGraphics.drawString(this.font, 
/*     */         
/* 305 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null29"), 150, 97, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 311 */     guiGraphics.drawString(this.font, 
/*     */         
/* 313 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null30"), 6, 115, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 319 */     guiGraphics.drawString(this.font, 
/*     */         
/* 321 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null31"), 42, 115, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 327 */     guiGraphics.drawString(this.font, 
/*     */         
/* 329 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null32"), 78, 115, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 335 */     guiGraphics.drawString(this.font, 
/*     */         
/* 337 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null33"), 114, 115, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 343 */     guiGraphics.drawString(this.font, 
/*     */         
/* 345 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null34"), 150, 115, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 351 */     guiGraphics.drawString(this.font, 
/*     */         
/* 353 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null35"), 6, 133, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 359 */     guiGraphics.drawString(this.font, 
/*     */         
/* 361 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null36"), 42, 133, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 367 */     guiGraphics.drawString(this.font, 
/*     */         
/* 369 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null37"), 78, 133, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 375 */     guiGraphics.drawString(this.font, 
/*     */         
/* 377 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null38"), 114, 133, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 383 */     guiGraphics.drawString(this.font, 
/*     */         
/* 385 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null39"), 150, 133, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 391 */     guiGraphics.drawString(this.font, 
/*     */         
/* 393 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null40"), 6, 151, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 399 */     guiGraphics.drawString(this.font, 
/*     */         
/* 401 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null41"), 42, 151, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 407 */     guiGraphics.drawString(this.font, 
/*     */         
/* 409 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null42"), 78, 151, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     guiGraphics.drawString(this.font, 
/*     */         
/* 417 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null43"), 114, 151, -12829636, false);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 423 */     guiGraphics.drawString(this.font, 
/*     */         
/* 425 */         (Component)Component.translatable("gui.thebrokenscript.null_interface_2.label_null44"), 150, 151, -12829636, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void init() {
/* 434 */     super.init();
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\gui\NullInterface2Screen.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */