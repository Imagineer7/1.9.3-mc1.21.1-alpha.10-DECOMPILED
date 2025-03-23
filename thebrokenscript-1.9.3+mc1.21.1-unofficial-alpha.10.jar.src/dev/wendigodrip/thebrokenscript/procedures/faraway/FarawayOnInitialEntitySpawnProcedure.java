/*    */ package dev.wendigodrip.thebrokenscript.procedures.faraway;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class FarawayOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  9 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 12 */     if (Math.random() < 0.7D) {
/* 13 */       if (!entity.level().isClientSide()) {
/* 14 */         entity.discard();
/*    */       }
/* 16 */     } else if (!world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && 
/* 17 */       !entity.level().isClientSide()) {
/* 18 */       entity.discard();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\faraway\FarawayOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */