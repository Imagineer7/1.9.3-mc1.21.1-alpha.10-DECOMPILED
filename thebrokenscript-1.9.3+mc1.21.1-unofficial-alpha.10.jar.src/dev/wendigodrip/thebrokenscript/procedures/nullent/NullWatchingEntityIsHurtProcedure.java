/*    */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class NullWatchingEntityIsHurtProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity) {
/* 22 */     if (damagesource == null || entity == null) {
/*    */       return;
/*    */     }
/* 25 */     if (damagesource.is(DamageTypes.ARROW)) {
/* 26 */       if (!entity.level().isClientSide()) {
/* 27 */         entity.discard();
/*    */       }
/* 29 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 30 */         Entity entityToSpawn = ((EntityType)TBSEntities.NULLL.get()).spawn(_level, 
/*    */             
/* 32 */             BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 39 */         if (entityToSpawn != null)
/* 40 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullWatchingEntityIsHurtProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */