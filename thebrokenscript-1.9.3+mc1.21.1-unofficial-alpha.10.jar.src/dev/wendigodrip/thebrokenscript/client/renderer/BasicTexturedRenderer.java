/*    */ package dev.wendigodrip.thebrokenscript.client.renderer;
/*    */ import net.minecraft.client.model.HumanoidModel;
/*    */ import net.minecraft.client.model.geom.ModelLayers;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\004\030\000 \017*\n\b\000\020\001*\004\030\0010\0022\026\022\004\022\002H\001\022\f\022\n\022\004\022\002H\001\030\0010\0040\003:\001\017B\031\b\002\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b¢\006\004\b\t\020\nJ\025\020\013\032\0020\f2\006\020\r\032\0028\000H\026¢\006\002\020\016R\016\020\007\032\0020\bX\004¢\006\002\n\000¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/renderer/BasicTexturedRenderer;", "T", "Lnet/minecraft/world/entity/Mob;", "Lnet/minecraft/client/renderer/entity/HumanoidMobRenderer;", "Lnet/minecraft/client/model/HumanoidModel;", "context", "Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;", "location", "", "<init>", "(Lnet/minecraft/client/renderer/entity/EntityRendererProvider$Context;Ljava/lang/String;)V", "getTextureLocation", "Lnet/minecraft/resources/ResourceLocation;", "entity", "(Lnet/minecraft/world/entity/Mob;)Lnet/minecraft/resources/ResourceLocation;", "Companion", "thebrokenscript"})
/*    */ public final class BasicTexturedRenderer<T extends Mob> extends HumanoidMobRenderer<T, HumanoidModel<T>> {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/*    */   private BasicTexturedRenderer(EntityRendererProvider.Context context, String location) {
/* 13 */     super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5F);
/*    */ 
/*    */ 
/*    */     
/* 17 */     addLayer(
/* 18 */         (RenderLayer)new HumanoidArmorLayer(
/* 19 */           (RenderLayerParent)this, 
/* 20 */           new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), 
/* 21 */           new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), 
/* 22 */           context.getModelManager()));
/*    */ 
/*    */ 
/*    */     
/* 26 */     this.location = location;
/*    */   } @NotNull
/*    */   private final String location; @NotNull
/*    */   public ResourceLocation getTextureLocation(Mob entity) {
/* 30 */     return TBSConstants.id(this.location);
/*    */   }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\"\020\004\032\n\022\006\022\004\030\001H\0060\005\"\n\b\001\020\006*\004\030\0010\0072\006\020\b\032\0020\t¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/renderer/BasicTexturedRenderer$Companion;", "", "<init>", "()V", "create", "Lnet/minecraft/client/renderer/entity/EntityRendererProvider;", "T", "Lnet/minecraft/world/entity/Mob;", "location", "", "thebrokenscript"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 35 */     public final <T extends Mob> EntityRendererProvider<T> create(@NotNull String location) { Intrinsics.checkNotNullParameter(location, "location"); return location::create$lambda$0; } private static final EntityRenderer create$lambda$0(String $location, EntityRendererProvider.Context context) {
/* 36 */       Intrinsics.checkNotNullParameter(context, "context"); return (EntityRenderer)new BasicTexturedRenderer<>(
/* 37 */           context, 
/* 38 */           $location, null);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\renderer\BasicTexturedRenderer.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */