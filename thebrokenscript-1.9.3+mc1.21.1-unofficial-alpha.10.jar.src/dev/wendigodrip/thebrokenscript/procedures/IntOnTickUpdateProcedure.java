/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class IntOnTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 10 */     if (world.getBlockState(BlockPos.containing(x, y, z)).getBlock() != Blocks.AIR) {
/*    */       
/* 12 */       int horizontalRadiusSquare = 1;
/* 13 */       int verticalRadiusSquare = 1, yIterationsSquare = verticalRadiusSquare;
/* 14 */       for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 15 */         for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 16 */           for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/* 17 */             world.setBlock(
/* 18 */                 BlockPos.containing(x + xi, y + i, z + zi), ((Block)TBSBlocks.DISRUPTION
/*    */ 
/*    */ 
/*    */                 
/* 22 */                 .get()).defaultBlockState(), 3);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     
/* 28 */     world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\IntOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */