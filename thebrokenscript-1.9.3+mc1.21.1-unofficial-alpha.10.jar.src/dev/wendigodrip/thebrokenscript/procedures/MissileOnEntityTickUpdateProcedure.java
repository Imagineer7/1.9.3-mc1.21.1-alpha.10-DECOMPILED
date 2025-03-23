/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class MissileOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 11 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 14 */     if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).getBlock() != Blocks.AIR) {
/*    */ 
/*    */       
/* 17 */       if (!entity.level().isClientSide())
/* 18 */         entity.discard(); 
/*    */       Level _level;
/* 20 */       if (world instanceof Level && !(_level = (Level)world).isClientSide())
/* 21 */         _level.explode(null, x, y, z, 5.0F, Level.ExplosionInteraction.TNT); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\MissileOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */