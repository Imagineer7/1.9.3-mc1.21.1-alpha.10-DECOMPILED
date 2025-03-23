/*    */ package dev.wendigodrip.thebrokenscript.entity.base;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import software.bernie.geckolib.animatable.GeoAnimatable;
/*    */ import software.bernie.geckolib.model.GeoModel;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\013\n\002\030\002\n\002\b\005\b&\030\000*\b\b\000\020\001*\0020\0022\b\022\004\022\002H\0010\003B\007¢\006\004\b\004\020\005J\025\020\022\032\0020\0232\006\020\024\032\0028\000H\026¢\006\002\020\025J\025\020\026\032\0020\0232\006\020\024\032\0028\000H\026¢\006\002\020\025J\025\020\027\032\0020\0232\006\020\024\032\0028\000H\026¢\006\002\020\025R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\tR\022\020\n\032\0020\007X¦\004¢\006\006\032\004\b\013\020\tR\022\020\f\032\0020\007X¦\004¢\006\006\032\004\b\r\020\tR\022\020\016\032\0020\007X¦\004¢\006\006\032\004\b\017\020\tR\022\020\020\032\0020\007X¦\004¢\006\006\032\004\b\021\020\t¨\006\030"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/base/UwuableGeoModel;", "T", "Ldev/wendigodrip/thebrokenscript/entity/base/UwuableMonster;", "Lsoftware/bernie/geckolib/model/GeoModel;", "<init>", "()V", "modelPath", "", "getModelPath", "()Ljava/lang/String;", "texturePath", "getTexturePath", "animationPath", "getAnimationPath", "uwuModelPath", "getUwuModelPath", "uwuTexturePath", "getUwuTexturePath", "getModelResource", "Lnet/minecraft/resources/ResourceLocation;", "animatable", "(Ldev/wendigodrip/thebrokenscript/entity/base/UwuableMonster;)Lnet/minecraft/resources/ResourceLocation;", "getTextureResource", "getAnimationResource", "thebrokenscript"})
/*    */ public abstract class UwuableGeoModel<T extends UwuableMonster>
/*    */   extends GeoModel<T> {
/*    */   @NotNull
/*    */   public ResourceLocation getModelResource(@NotNull UwuableMonster animatable) {
/* 16 */     Intrinsics.checkNotNullParameter(animatable, "animatable"); return animatable.isUwu() ? TBSConstants.id(getUwuModelPath()) : TBSConstants.id(getModelPath());
/*    */   }
/*    */   @NotNull
/*    */   public ResourceLocation getTextureResource(@NotNull UwuableMonster animatable) {
/* 20 */     Intrinsics.checkNotNullParameter(animatable, "animatable"); return animatable.isUwu() ? TBSConstants.id(getUwuTexturePath()) : TBSConstants.id(getTexturePath());
/*    */   }
/*    */   @NotNull
/*    */   public ResourceLocation getAnimationResource(@NotNull UwuableMonster animatable) {
/* 24 */     Intrinsics.checkNotNullParameter(animatable, "animatable"); return TBSConstants.id(getAnimationPath());
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public abstract String getModelPath();
/*    */   
/*    */   @NotNull
/*    */   public abstract String getTexturePath();
/*    */   
/*    */   @NotNull
/*    */   public abstract String getAnimationPath();
/*    */   
/*    */   @NotNull
/*    */   public abstract String getUwuModelPath();
/*    */   
/*    */   @NotNull
/*    */   public abstract String getUwuTexturePath();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\base\UwuableGeoModel.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */