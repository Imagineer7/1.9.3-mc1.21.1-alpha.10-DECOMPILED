/*    */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.misc.RandomSafeTeleport;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class NullBaseInvadeOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 12 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 15 */     int horizontalRadiusSquare = 3;
/* 16 */     int verticalRadiusSquare = 3, yIterationsSquare = verticalRadiusSquare;
/* 17 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 18 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 19 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/* 20 */           if (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))
/*    */ 
/*    */ 
/*    */             
/* 24 */             .getBlock() == Blocks.WATER || world
/* 25 */             .getBlockState(BlockPos.containing(x + xi, y + i, z + zi))
/*    */ 
/*    */ 
/*    */             
/* 29 */             .getBlock() == Blocks.WATER) {
/* 30 */             world.setBlock(
/* 31 */                 BlockPos.containing(x + xi, y + i, z + zi), Blocks.COBBLESTONE
/*    */ 
/*    */ 
/*    */                 
/* 35 */                 .defaultBlockState(), 3);
/*    */           }
/*    */         } 
/*    */       } 
/*    */     } 
/* 40 */     if (entity.getDeltaMovement().x() <= 0.0D) {
/* 41 */       if (entity.getDeltaMovement().y() <= 0.0D) {
/* 42 */         if (entity.getDeltaMovement().z() <= 0.0D) {
/* 43 */           entity.getPersistentData()
/* 44 */             .putDouble("timerstuck", entity.getPersistentData().getDouble("timerstuck") + 1.0D);
/* 45 */           if (entity.getPersistentData().getDouble("timerstuck") > 10.0D) {
/* 46 */             entity.getPersistentData().putDouble("timerstuck", 0.0D);
/* 47 */             RandomSafeTeleport.teleport(entity);
/*    */           } 
/*    */         } else {
/* 50 */           entity.getPersistentData().putDouble("timerstuck", 0.0D);
/*    */         } 
/*    */       } else {
/* 53 */         entity.getPersistentData().putDouble("timerstuck", 0.0D);
/*    */       } 
/*    */     } else {
/* 56 */       entity.getPersistentData().putDouble("timerstuck", 0.0D);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullBaseInvadeOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */