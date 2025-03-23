/*    */ package dev.wendigodrip.thebrokenscript.client.renderer;
/*    */ import dev.wendigodrip.thebrokenscript.entity.BsodEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0020\0030\001B\017\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\002H\026¨\006\013"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/renderer/BsodRenderer;", "Lnet/minecraft/client/renderer/entity/HumanoidMobRenderer;", "Ldev/wendigodrip/thebrokenscript/entity/BsodEntity;", "Lnet/minecraft/client/model/HumanoidModel;", "context", "Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;", "<init>", "(Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;)V", "getTextureLocation", "Lnet/minecraft/resources/ResourceLocation;", "entity", "thebrokenscript"})
/*    */ public final class BsodRenderer extends HumanoidMobRenderer<BsodEntity, HumanoidModel<BsodEntity>> {
/*    */   public BsodRenderer(@NotNull EntityRendererProvider.Context context) {
/* 13 */     super(
/* 14 */         context, 
/* 15 */         new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 
/* 16 */         0.5F);
/*    */ 
/*    */     
/* 19 */     addLayer(
/* 20 */         (RenderLayer)new HumanoidArmorLayer(
/* 21 */           (RenderLayerParent)this, 
/* 22 */           new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), 
/* 23 */           new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), 
/* 24 */           context.getModelManager()));
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ResourceLocation getTextureLocation(@NotNull BsodEntity entity) {
/* 30 */     Intrinsics.checkNotNullParameter(entity, "entity"); return TBSConstants.id("textures/entities/gandoniovinvize.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\renderer\BsodRenderer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */