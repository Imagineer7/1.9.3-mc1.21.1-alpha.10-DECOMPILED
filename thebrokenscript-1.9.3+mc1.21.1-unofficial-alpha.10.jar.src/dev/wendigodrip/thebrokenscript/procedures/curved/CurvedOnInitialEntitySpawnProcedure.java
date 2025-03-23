/*    */ package dev.wendigodrip.thebrokenscript.procedures.curved;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class CurvedOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 16 */     if (world instanceof Level) { Level _level = (Level)world;
/* 17 */       if (!_level.isClientSide()) {
/* 18 */         _level.playSound(null, 
/*    */             
/* 20 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 21 */             .get(TBSConstants.id("youknownothing")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       
/*    */       }
/*    */       else {
/*    */ 
/*    */         
/* 27 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*    */ 
/*    */ 
/*    */             
/* 31 */             .get(TBSConstants.id("youknownothing")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     int horizontalRadiusSquare = 2;
/* 40 */     int verticalRadiusSquare = 2, yIterationsSquare = verticalRadiusSquare;
/* 41 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 42 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 43 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/* 44 */           if (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 49 */             .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 50 */             BlockPos _pos = BlockPos.containing(x + xi, y + i, z + zi);
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 55 */             Block.dropResources(world
/* 56 */                 .getBlockState(_pos), world, 
/*    */                 
/* 58 */                 BlockPos.containing(x, y, z), null);
/*    */ 
/*    */             
/* 61 */             world.destroyBlock(_pos, false);
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\curved\CurvedOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */