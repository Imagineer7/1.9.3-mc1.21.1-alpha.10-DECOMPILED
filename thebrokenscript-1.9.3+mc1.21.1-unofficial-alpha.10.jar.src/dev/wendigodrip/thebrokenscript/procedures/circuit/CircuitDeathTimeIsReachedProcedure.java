/*    */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ 
/*    */ public class CircuitDeathTimeIsReachedProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if (world instanceof ServerLevel) {
/* 16 */       ServerLevel _level = (ServerLevel)world;
/* 17 */       Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT_STALK.get()).spawn(_level, 
/*    */           
/* 19 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 26 */       if (entityToSpawn != null) {
/* 27 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */       }
/*    */     } 
/* 30 */     if (world instanceof ServerLevel) {
/* 31 */       ServerLevel _level = (ServerLevel)world;
/* 32 */       Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT_STALK.get()).spawn(_level, 
/*    */           
/* 34 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 41 */       if (entityToSpawn != null) {
/* 42 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */       }
/*    */     } 
/* 45 */     if (world instanceof ServerLevel) {
/* 46 */       ServerLevel _level = (ServerLevel)world;
/* 47 */       Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT_STALK.get()).spawn(_level, 
/*    */           
/* 49 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 56 */       if (entityToSpawn != null)
/* 57 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitDeathTimeIsReachedProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */