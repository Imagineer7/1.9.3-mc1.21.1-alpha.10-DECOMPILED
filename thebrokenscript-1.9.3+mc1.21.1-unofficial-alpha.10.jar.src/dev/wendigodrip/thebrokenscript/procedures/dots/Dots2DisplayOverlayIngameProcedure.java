/*    */ package dev.wendigodrip.thebrokenscript.procedures.dots;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.Dotsframe2Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class Dots2DisplayOverlayIngameProcedure {
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
/* 19 */       !world.getEntitiesOfClass(Dotsframe2Entity.class, AABB.ofSize(new Vec3(x, y, z), 300.0D, 300.0D, 300.0D), e -> true).isEmpty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\dots\Dots2DisplayOverlayIngameProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */