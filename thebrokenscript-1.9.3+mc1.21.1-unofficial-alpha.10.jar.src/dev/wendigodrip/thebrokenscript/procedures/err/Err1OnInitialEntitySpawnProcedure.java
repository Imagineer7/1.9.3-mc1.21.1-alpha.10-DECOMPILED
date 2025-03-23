/*    */ package dev.wendigodrip.thebrokenscript.procedures.err;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class Err1OnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 10 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 13 */     if (!world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
/* 14 */       if (!entity.level().isClientSide()) {
/* 15 */         entity.discard();
/*    */       }
/* 17 */       TheBrokenScript.queueServerWork(18000, () -> {
/*    */             if (!entity.level().isClientSide())
/*    */               entity.discard(); 
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\err\Err1OnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */