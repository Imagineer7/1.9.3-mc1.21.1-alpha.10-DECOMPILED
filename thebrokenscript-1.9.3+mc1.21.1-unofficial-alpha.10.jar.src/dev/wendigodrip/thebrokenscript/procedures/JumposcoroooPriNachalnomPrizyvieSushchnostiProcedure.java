/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class JumposcoroooPriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 17 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 18 */       Entity entityToSpawn = ((EntityType)TBSEntities.JFRAME_1ENTITY.get()).spawn(_level, 
/*    */           
/* 20 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 27 */       if (entityToSpawn != null) {
/* 28 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */       } }
/*    */     
/* 31 */     TheBrokenScript.queueServerWork(5, () -> {
/*    */           if (world instanceof ServerLevel) {
/*    */             ServerLevel _level = (ServerLevel)world;
/*    */             Entity entityToSpawn = ((EntityType)TBSEntities.JFRAME_2ENTITY.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */             if (entityToSpawn != null)
/*    */               entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F); 
/*    */           } 
/*    */           TheBrokenScript.queueServerWork(5, ());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\JumposcoroooPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */