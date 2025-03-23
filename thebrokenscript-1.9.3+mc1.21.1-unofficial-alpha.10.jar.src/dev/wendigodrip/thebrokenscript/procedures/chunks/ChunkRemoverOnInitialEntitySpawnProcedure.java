/*    */ package dev.wendigodrip.thebrokenscript.procedures.chunks;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.engine.ChunkManipulationEngine;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundEvents;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class ChunkRemoverOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 15 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 18 */     if (entity.level().dimension() == Level.OVERWORLD) {
/* 19 */       if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
/* 20 */         if (Math.random() < 0.999D) {
/* 21 */           if (!entity.level().isClientSide()) {
/* 22 */             entity.discard();
/*    */           }
/*    */         } else {
/* 25 */           if (world instanceof Level) { Level _level = (Level)world;
/* 26 */             if (!_level.isClientSide()) {
/* 27 */               _level.playSound(null, 
/*    */                   
/* 29 */                   BlockPos.containing(x, y, z), (SoundEvent)SoundEvents.AMBIENT_CAVE
/* 30 */                   .value(), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */             
/*    */             }
/*    */             else {
/*    */ 
/*    */               
/* 36 */               _level.playLocalSound(x, y, z, (SoundEvent)SoundEvents.AMBIENT_CAVE
/*    */ 
/*    */ 
/*    */                   
/* 40 */                   .value(), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */             }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 49 */           if (world instanceof ServerLevel) { ServerLevel level = (ServerLevel)world;
/* 50 */             BlockPos pos = BlockPos.containing(x, y, z);
/* 51 */             ChunkManipulationEngine.clearChunk((Level)level, pos.getX(), pos.getZ()); }
/*    */ 
/*    */           
/* 54 */           if (!entity.level().isClientSide()) {
/* 55 */             entity.discard();
/*    */           }
/*    */         } 
/* 58 */       } else if (!entity.level().isClientSide()) {
/* 59 */         entity.discard();
/*    */       } 
/* 61 */     } else if (!entity.level().isClientSide()) {
/* 62 */       entity.discard();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\chunks\ChunkRemoverOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */