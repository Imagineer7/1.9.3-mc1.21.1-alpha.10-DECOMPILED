/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSParticleTypes;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class EmptyOnTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (x == 0.0D && y == 0.0D && z == 0.0D) {
/* 15 */       world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 17 */     world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/* 18 */     if (world instanceof ServerLevel) {
/* 19 */       ServerLevel serverLevel = (ServerLevel)world;
/* 20 */       serverLevel.sendParticles((ParticleOptions)TBSParticleTypes.EYES
/* 21 */           .get(), x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/*    */     ServerLevel _level;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     if (world instanceof Level && !(_level = (ServerLevel)world).isClientSide())
/* 33 */       _level.explode(null, x, y, z, 4.0F, Level.ExplosionInteraction.TNT); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\EmptyOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */