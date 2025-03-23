/*    */ package dev.wendigodrip.thebrokenscript.client.renderer;
/*    */ import dev.wendigodrip.thebrokenscript.entity.CantYouSeeEntity;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.client.renderer.entity.layers.RenderLayer;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\030\0002\024\022\004\022\0020\002\022\n\022\b\022\004\022\0020\0020\0030\001B\017\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\002H\026¨\006\013"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/renderer/CantYouSeeRenderer;", "Lnet/minecraft/client/renderer/entity/HumanoidMobRenderer;", "Ldev/wendigodrip/thebrokenscript/entity/CantYouSeeEntity;", "Lnet/minecraft/client/model/HumanoidModel;", "context", "Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;", "<init>", "(Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;)V", "getTextureLocation", "Lnet/minecraft/resources/ResourceLocation;", "entity", "thebrokenscript"})
/*    */ public final class CantYouSeeRenderer extends HumanoidMobRenderer<CantYouSeeEntity, HumanoidModel<CantYouSeeEntity>> {
/*    */   public CantYouSeeRenderer(@NotNull EntityRendererProvider.Context context) {
/* 14 */     super(
/* 15 */         context, 
/* 16 */         new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 
/* 17 */         0.5F);
/*    */ 
/*    */     
/* 20 */     addLayer(
/* 21 */         (RenderLayer)new HumanoidArmorLayer(
/* 22 */           (RenderLayerParent)this, 
/* 23 */           new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), 
/* 24 */           new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), 
/* 25 */           context.getModelManager()));
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public ResourceLocation getTextureLocation(@NotNull CantYouSeeEntity entity) {
/* 31 */     Intrinsics.checkNotNullParameter(entity, "entity"); return TBSConstants.id("textures/entities/gandoniovinvize.png");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\renderer\CantYouSeeRenderer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */