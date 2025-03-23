/*    */ package dev.wendigodrip.thebrokenscript.engine;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.Level;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\tH\007¨\006\013"}, d2 = {"Ldev/wendigodrip/thebrokenscript/engine/ChunkManipulationEngine;", "", "<init>", "()V", "clearChunk", "", "world", "Lnet/minecraft/world/level/Level;", "x", "", "z", "thebrokenscript"})
/*    */ public final class ChunkManipulationEngine {
/*    */   @JvmStatic
/*    */   public static final void clearChunk(@NotNull Level world, double x, double z) {
/* 10 */     Intrinsics.checkNotNullParameter(world, "world"); int chunkX = (int)x >> 4;
/* 11 */     int chunkZ = (int)z >> 4;
/* 12 */     int startX = chunkX * 16;
/* 13 */     int startZ = chunkZ * 16;
/*    */     
/* 15 */     for (int blockX = startX, i = startX + 16; blockX < i; blockX++) {
/* 16 */       for (int blockZ = startZ, j = startZ + 16; blockZ < j; blockZ++) {
/* 17 */         for (int blockY = world.getMinBuildHeight(), k = world.getMaxBuildHeight(); blockY < k; blockY++) {
/* 18 */           BlockPos blockPos = new BlockPos(blockX, blockY, blockZ);
/* 19 */           world.setBlock(blockPos, Blocks.AIR.defaultBlockState(), 3);
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final ChunkManipulationEngine INSTANCE = new ChunkManipulationEngine();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\engine\ChunkManipulationEngine.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */