/*    */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*    */ import dev.wendigodrip.thebrokenscript.entity.NullIsHereEntity;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class NullIsHereThisEntityKillsAnotherOneProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 19 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world; if (TBSConfigs.COMMON != null && 
/*    */         
/* 21 */         !TBSConfigs.COMMON.getDisableBanning()) {
/* 22 */         Entity entityToSpawn = ((EntityType)TBSEntities.BAN.get()).spawn(_level, 
/*    */             
/* 24 */             BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 31 */         if (entityToSpawn != null);
/*    */       }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 49 */     if (!((NullIsHereEntity)world.getEntitiesOfClass(NullIsHereEntity.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
/* 50 */       ((NullIsHereEntity)world.getEntitiesOfClass(NullIsHereEntity.class, 
/*    */           
/* 52 */           AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 59 */         .stream().sorted((new Object()
/*    */           {
/*    */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 62 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*    */             }
/* 64 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullIsHereThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */