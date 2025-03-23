/*    */ package dev.wendigodrip.thebrokenscript.world.dimension;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.renderer.DimensionSpecialEffects;
/*    */ import net.minecraft.world.phys.Vec3;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\002*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\006H\026J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nH\026¨\006\f"}, d2 = {"dev/wendigodrip/thebrokenscript/world/dimension/DayBDimension$DayBSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1", "Lnet/minecraft/client/renderer/DimensionSpecialEffects;", "getBrightnessDependentFogColor", "Lnet/minecraft/world/phys/Vec3;", "color", "sunHeight", "", "isFoggyAt", "", "x", "", "y", "thebrokenscript"})
/*    */ public final class DayBDimension$DayBSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1
/*    */   extends DimensionSpecialEffects
/*    */ {
/*    */   DayBDimension$DayBSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1(DimensionSpecialEffects.SkyType $super_call_param$1) {
/* 40 */     super(
/* 41 */         Float.NaN, 
/* 42 */         true, 
/* 43 */         $super_call_param$1, 
/* 44 */         false, 
/* 45 */         false);
/*    */   }
/*    */   public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
/* 48 */     Intrinsics.checkNotNullParameter(color, "color"); return new Vec3(1.0D, 1.0D, 1.0D);
/*    */   }
/*    */   
/*    */   public boolean isFoggyAt(int x, int y) {
/* 52 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\world\dimension\DayBDimension$DayBSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */