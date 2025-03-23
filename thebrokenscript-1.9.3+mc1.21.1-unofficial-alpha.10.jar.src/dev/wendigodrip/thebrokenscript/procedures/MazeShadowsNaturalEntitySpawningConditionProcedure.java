/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class MazeShadowsNaturalEntitySpawningConditionProcedure {
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     boolean found = false;
/* 10 */     double sx = 0.0D;
/* 11 */     double sy = 0.0D;
/* 12 */     double sz = 0.0D;
/* 13 */     sx = -3.0D;
/* 14 */     found = false;
/* 15 */     for (int index0 = 0; index0 < 6; index0++) {
/* 16 */       sy = -3.0D;
/* 17 */       for (int index1 = 0; index1 < 6; index1++) {
/* 18 */         sz = -3.0D;
/* 19 */         for (int index2 = 0; index2 < 6; index2++) {
/* 20 */           if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))
/*    */ 
/*    */ 
/*    */             
/* 24 */             .getBlock() == Blocks.BEDROCK) {
/* 25 */             found = true;
/*    */           }
/* 27 */           sz++;
/*    */         } 
/* 29 */         sy++;
/*    */       } 
/* 31 */       sx++;
/*    */     } 
/* 33 */     return found;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\MazeShadowsNaturalEntitySpawningConditionProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */