/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.WeCanHearUOverlayEntity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class WecanhearuDisplayOverlayIngameProcedure {
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/* 10 */     return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 19 */       !world.getEntitiesOfClass(WeCanHearUOverlayEntity.class, AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).isEmpty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\WecanhearuDisplayOverlayIngameProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */