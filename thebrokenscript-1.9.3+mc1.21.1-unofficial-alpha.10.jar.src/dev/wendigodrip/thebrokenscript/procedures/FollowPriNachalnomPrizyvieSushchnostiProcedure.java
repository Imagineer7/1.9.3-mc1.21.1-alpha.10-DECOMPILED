/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class FollowPriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 14 */       Entity entityToSpawn = ((EntityType)TBSEntities.WRONG_OVERLAY.get()).spawn(_level, 
/*    */           
/* 16 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 23 */       if (entityToSpawn != null)
/* 24 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\FollowPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */