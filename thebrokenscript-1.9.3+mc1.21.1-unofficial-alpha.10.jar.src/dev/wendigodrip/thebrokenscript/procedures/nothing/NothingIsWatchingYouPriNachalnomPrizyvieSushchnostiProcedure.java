/*    */ package dev.wendigodrip.thebrokenscript.procedures.nothing;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class NothingIsWatchingYouPriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  9 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 12 */     if (!world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && 
/* 13 */       !entity.level().isClientSide())
/* 14 */       entity.discard(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nothing\NothingIsWatchingYouPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */