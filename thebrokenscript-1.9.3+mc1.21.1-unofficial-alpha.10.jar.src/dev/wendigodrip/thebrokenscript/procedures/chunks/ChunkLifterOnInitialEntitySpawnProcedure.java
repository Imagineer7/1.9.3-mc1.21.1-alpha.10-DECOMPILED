/*    */ package dev.wendigodrip.thebrokenscript.procedures.chunks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.entity.BlockEntity;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.chunk.LevelChunk;
/*    */ 
/*    */ public class ChunkLifterOnInitialEntitySpawnProcedure {
/*    */   public static void execute(Level world, double x, double y, double z) {
/* 13 */     if (world instanceof ServerLevel) { ServerLevel serverLevel = (ServerLevel)world;
/* 14 */       int chunkX = (int)x >> 4;
/* 15 */       int chunkZ = (int)z >> 4;
/* 16 */       moveChunkUp(serverLevel, chunkX, chunkZ, 100); }
/*    */   
/*    */   }
/*    */   
/*    */   private static void moveChunkUp(ServerLevel world, int chunkX, int chunkZ, int offsetY) {
/* 21 */     LevelChunk chunk = world.getChunk(chunkX, chunkZ);
/* 22 */     for (int x = 0; x < 16; x++) {
/* 23 */       for (int z = 0; z < 16; z++) {
/* 24 */         for (int y = world.getMinBuildHeight(); y < world.getMaxBuildHeight(); y++) {
/*    */           
/* 26 */           BlockPos oldPos = new BlockPos(chunkX * 16 + x, y, chunkZ * 16 + z);
/* 27 */           BlockPos newPos = oldPos.above(offsetY);
/* 28 */           BlockState oldState = world.getBlockState(oldPos);
/* 29 */           BlockEntity oldTile = world.getBlockEntity(oldPos);
/* 30 */           world.setBlock(newPos, oldState, 3); BlockEntity newTile;
/* 31 */           if (oldTile != null && (newTile = world.getBlockEntity(newPos)) != null) {
/* 32 */             newTile.loadWithComponents(oldTile
/* 33 */                 .saveWithFullMetadata((HolderLookup.Provider)world.registryAccess()), (HolderLookup.Provider)world
/* 34 */                 .registryAccess());
/*    */             
/* 36 */             newTile.setChanged();
/*    */           } 
/* 38 */           world.setBlock(oldPos, Blocks.AIR.defaultBlockState(), 3);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\chunks\ChunkLifterOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */