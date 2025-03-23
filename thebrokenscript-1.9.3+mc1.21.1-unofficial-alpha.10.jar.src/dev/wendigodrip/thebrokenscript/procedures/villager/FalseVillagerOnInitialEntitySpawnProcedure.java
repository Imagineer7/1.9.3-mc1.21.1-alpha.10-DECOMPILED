/*    */ package dev.wendigodrip.thebrokenscript.procedures.villager;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FalseVillagerOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 20 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 23 */     double NUMBER = 0.0D; LivingEntity _entity;
/* 24 */     if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).level().isClientSide()) {
/* 25 */       _entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 100, 1, false, false));
/*    */     }
/* 27 */     Vec3 _center = new Vec3(x, y, z);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 32 */     List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, (new AABB(_center, _center)).inflate(500.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
/* 33 */     for (Entity entityiterator : _entfound) {
/* 34 */       if (entityiterator instanceof dev.wendigodrip.thebrokenscript.entity.FalseVillagerEntity) {
/* 35 */         NUMBER++;
/*    */       }
/* 37 */       if (!(entityiterator instanceof dev.wendigodrip.thebrokenscript.entity.PigCircuitEntity))
/* 38 */         continue;  NUMBER++;
/*    */     } 
/* 40 */     if ((NUMBER == 2.0D || NUMBER > 2.0D) && !entity.level().isClientSide()) {
/* 41 */       entity.discard();
/*    */     }
/* 43 */     TheBrokenScript.queueServerWork(18000, () -> {
/*    */           if (!entity.level().isClientSide())
/*    */             entity.discard(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\villager\FalseVillagerOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */