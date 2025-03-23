/*    */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class CircuitStalkEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 19 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 22 */     if (Math.random() < 0.05D) {
/* 23 */       if (world instanceof Level) { Level _level = (Level)world;
/* 24 */         if (!_level.isClientSide()) {
/* 25 */           _level.playSound(null, 
/*    */               
/* 27 */               BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 28 */               .get(TBSConstants.id("youwillregretthat")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */         
/*    */         }
/*    */         else {
/*    */ 
/*    */           
/* 34 */           _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*    */ 
/*    */ 
/*    */               
/* 38 */               .get(TBSConstants.id("youwillregretthat")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 46 */       if (!entity.level().isClientSide()) {
/* 47 */         entity.discard();
/*    */       }
/* 49 */       TheBrokenScript.queueServerWork(60, () -> {
/*    */             if (world instanceof ServerLevel) {
/*    */               ServerLevel _level = (ServerLevel)world;
/*    */               Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*    */               if (entityToSpawn != null)
/*    */                 entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F); 
/*    */             } 
/*    */           });
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitStalkEntityIsHurtProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */