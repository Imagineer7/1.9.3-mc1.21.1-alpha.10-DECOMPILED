/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class CorruptionOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 10 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 13 */     double dig = 0.0D;
/* 14 */     if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
/* 15 */       dig = y;
/* 16 */       for (int index0 = 0; index0 < 300; index0++) {
/* 17 */         world.setBlock(
/* 18 */             BlockPos.containing(x, --dig, z), Blocks.AIR
/* 19 */             .defaultBlockState(), 3);
/*    */       }
/*    */ 
/*    */       
/* 23 */       world.setBlock(
/* 24 */           BlockPos.containing(x + 1.0D, y, z), Blocks.REDSTONE_TORCH
/* 25 */           .defaultBlockState(), 3);
/*    */ 
/*    */       
/* 28 */       world.setBlock(
/* 29 */           BlockPos.containing(x - 1.0D, y, z), Blocks.REDSTONE_TORCH
/* 30 */           .defaultBlockState(), 3);
/*    */ 
/*    */       
/* 33 */       world.setBlock(
/* 34 */           BlockPos.containing(x, y, z + 1.0D), Blocks.REDSTONE_TORCH
/* 35 */           .defaultBlockState(), 3);
/*    */ 
/*    */       
/* 38 */       world.setBlock(
/* 39 */           BlockPos.containing(x, y, z - 1.0D), Blocks.REDSTONE_TORCH
/* 40 */           .defaultBlockState(), 3);
/*    */ 
/*    */       
/* 43 */       if (!entity.level().isClientSide()) {
/* 44 */         entity.discard();
/*    */       }
/* 46 */     } else if (!entity.level().isClientSide()) {
/* 47 */       entity.discard();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\CorruptionOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */