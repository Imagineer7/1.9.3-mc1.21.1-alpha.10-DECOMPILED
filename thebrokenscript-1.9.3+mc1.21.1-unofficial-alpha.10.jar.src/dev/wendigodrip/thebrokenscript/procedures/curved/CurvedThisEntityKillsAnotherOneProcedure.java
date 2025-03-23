/*    */ package dev.wendigodrip.thebrokenscript.procedures.curved;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.CurvedEntity;
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
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
/*    */ public class CurvedThisEntityKillsAnotherOneProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 27 */     if (!((CurvedEntity)world.getEntitiesOfClass(CurvedEntity.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
/* 28 */       ((CurvedEntity)world.getEntitiesOfClass(CurvedEntity.class, 
/*    */           
/* 30 */           AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 37 */         .stream().sorted((new Object()
/*    */           {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 40 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*    */             }
/* 42 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\curved\CurvedThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */