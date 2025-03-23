/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ import com.mojang.blaze3d.vertex.PoseStack;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.player.AbstractClientPlayer;
/*    */ import net.minecraft.client.renderer.MultiBufferSource;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\007\n\002\b\006\030\0002\030\022\004\022\0020\002\022\016\022\f\022\006\022\004\030\0010\002\030\0010\0030\001B'\022\036\020\004\032\032\022\006\022\004\030\0010\002\022\016\022\f\022\006\022\004\030\0010\002\030\0010\0030\005¢\006\004\b\006\020\007JX\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\0022\006\020\021\032\0020\0222\006\020\023\032\0020\0222\006\020\024\032\0020\0222\006\020\025\032\0020\0222\006\020\026\032\0020\0222\006\020\027\032\0020\022H\026¨\006\030"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/CustomPlayerLayer;", "Lnet/minecraft/client/renderer/entity/layers/RenderLayer;", "Lnet/minecraft/client/player/AbstractClientPlayer;", "Lnet/minecraft/client/model/PlayerModel;", "renderer", "Lnet/minecraft/client/renderer/entity/RenderLayerParent;", "<init>", "(Lnet/minecraft/client/renderer/entity/RenderLayerParent;)V", "render", "", "poseStack", "Lcom/mojang/blaze3d/vertex/PoseStack;", "buffer", "Lnet/minecraft/client/renderer/MultiBufferSource;", "packedLight", "", "player", "limbSwing", "", "limbSwingAmount", "ageInTicks", "netHeadYaw", "headPitch", "scale", "thebrokenscript"})
/*    */ public final class CustomPlayerLayer extends RenderLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {
/*    */   public CustomPlayerLayer(@NotNull RenderLayerParent renderer) {
/* 12 */     super(renderer);
/*    */   }
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
/*    */   public void render(@NotNull PoseStack poseStack, @NotNull MultiBufferSource buffer, int packedLight, @NotNull AbstractClientPlayer player, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
/* 25 */     Intrinsics.checkNotNullParameter(poseStack, "poseStack"); Intrinsics.checkNotNullParameter(buffer, "buffer"); Intrinsics.checkNotNullParameter(player, "player"); CompoundTag persistentData = player.getPersistentData();
/*    */     
/* 27 */     if (!persistentData.getBoolean("useCustomTexture")) {
/*    */       return;
/*    */     }
/*    */     
/* 31 */     ResourceLocation texture = TBSConstants.id("textures/entity/notexture.png");
/*    */     
/* 33 */     RenderLayer.renderColoredCutoutModel(getParentModel(), texture, poseStack, buffer, packedLight, (LivingEntity)player, 16777215);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\CustomPlayerLayer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */