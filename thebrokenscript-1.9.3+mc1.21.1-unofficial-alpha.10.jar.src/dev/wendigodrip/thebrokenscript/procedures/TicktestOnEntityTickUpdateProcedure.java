/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.HolderSet;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.ClipContext;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class TicktestOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/* 16 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 19 */     if (world.getBlockState(new BlockPos(entity
/* 20 */           .level().clip(new ClipContext(entity
/* 21 */               .getEyePosition(1.0F), entity
/* 22 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*    */ 
/*    */ 
/*    */           
/* 26 */           .getBlockPos().getX(), entity.level().clip(new ClipContext(entity
/* 27 */               .getEyePosition(1.0F), entity
/* 28 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*    */ 
/*    */ 
/*    */           
/* 32 */           .getBlockPos().getY(), entity.level().clip(new ClipContext(entity
/* 33 */               .getEyePosition(1.0F), entity
/* 34 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*    */ 
/*    */ 
/*    */           
/* 38 */           .getBlockPos().getZ()))
/* 39 */       .getBlock() == ((HolderSet.Named)BuiltInRegistries.BLOCK
/* 40 */       .getTag(BlockTags.create(TBSConstants.id("circuitbreakable")))
/* 41 */       .get())
/* 42 */       .getRandomElement(RandomSource.create())
/* 43 */       .orElseGet(() -> Blocks.AIR.builtInRegistryHolder()))
/* 44 */       world.destroyBlock(new BlockPos(entity
/*    */             
/* 46 */             .level().clip(new ClipContext(entity
/* 47 */                 .getEyePosition(1.0F), entity
/* 48 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*    */ 
/*    */ 
/*    */             
/* 52 */             .getBlockPos().getX(), entity.level().clip(new ClipContext(entity
/* 53 */                 .getEyePosition(1.0F), entity
/* 54 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*    */ 
/*    */ 
/*    */             
/* 58 */             .getBlockPos().getY(), entity.level().clip(new ClipContext(entity
/* 59 */                 .getEyePosition(1.0F), entity
/* 60 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(5.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*    */ 
/*    */ 
/*    */             
/* 64 */             .getBlockPos().getZ()), false); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\TicktestOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */