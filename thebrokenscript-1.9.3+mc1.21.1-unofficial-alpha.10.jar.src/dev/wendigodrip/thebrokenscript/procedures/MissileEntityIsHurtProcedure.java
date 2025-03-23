/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class MissileEntityIsHurtProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 10 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 13 */     if (!entity.level().isClientSide())
/* 14 */       entity.discard(); 
/*    */     Level _level;
/* 16 */     if (world instanceof Level && !(_level = (Level)world).isClientSide())
/* 17 */       _level.explode(null, x, y, z, 5.0F, Level.ExplosionInteraction.TNT); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\MissileEntityIsHurtProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */