/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class PhysicalStacktraceOnTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 10 */     double dig = 0.0D;
/* 11 */     if (Math.random() < 0.8D) {
/* 12 */       if (world.getBlockState(BlockPos.containing(x + 1.0D, y, z)).canOcclude()) {
/* 13 */         world.setBlock(
/* 14 */             BlockPos.containing(x + 1.0D, y, z), ((Block)TBSBlocks.PHYSICAL_STACKTRACE
/* 15 */             .get()).defaultBlockState(), 3);
/*    */       }
/*    */ 
/*    */       
/* 19 */       if (world.getBlockState(BlockPos.containing(x - 1.0D, y, z)).canOcclude()) {
/* 20 */         world.setBlock(
/* 21 */             BlockPos.containing(x - 1.0D, y, z), ((Block)TBSBlocks.PHYSICAL_STACKTRACE
/* 22 */             .get()).defaultBlockState(), 3);
/*    */       }
/*    */ 
/*    */       
/* 26 */       if (world.getBlockState(BlockPos.containing(x, y, z + 1.0D)).canOcclude()) {
/* 27 */         world.setBlock(
/* 28 */             BlockPos.containing(x, y, z + 1.0D), ((Block)TBSBlocks.PHYSICAL_STACKTRACE
/* 29 */             .get()).defaultBlockState(), 3);
/*    */       }
/*    */ 
/*    */       
/* 33 */       if (world.getBlockState(BlockPos.containing(x, y, z - 1.0D)).canOcclude()) {
/* 34 */         world.setBlock(
/* 35 */             BlockPos.containing(x, y, z - 1.0D), ((Block)TBSBlocks.PHYSICAL_STACKTRACE
/* 36 */             .get()).defaultBlockState(), 3);
/*    */       }
/*    */ 
/*    */       
/* 40 */       dig = y;
/* 41 */       for (int index0 = 0; index0 < 300; index0++) {
/* 42 */         world.setBlock(
/* 43 */             BlockPos.containing(x, --dig, z), Blocks.AIR
/* 44 */             .defaultBlockState(), 3);
/*    */       }
/*    */ 
/*    */       
/* 48 */       world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\PhysicalStacktraceOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */