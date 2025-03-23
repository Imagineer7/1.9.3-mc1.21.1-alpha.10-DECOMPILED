/*     */ package dev.wendigodrip.thebrokenscript.procedures.villager;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class FalseVillagerOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  19 */     if (entity == null) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  31 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/*  32 */       if (Math.random() < 1.0E-4D) {
/*  33 */         if (!entity.level().isClientSide()) {
/*  34 */           entity.discard();
/*     */         }
/*  36 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  37 */           Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT.get()).spawn(_level, 
/*     */               
/*  39 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  46 */           if (entityToSpawn != null) {
/*  47 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           } }
/*     */       
/*     */       } 
/*  51 */       if (entity instanceof Mob) {
/*     */         try {
/*  53 */           ((Mob)entity).setTarget(null);
/*  54 */         } catch (Exception e2) {
/*  55 */           e2.printStackTrace();
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */ 
/*     */     
/*     */     }
/*  67 */     else if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/*     */ 
/*     */ 
/*     */       
/*  71 */       if (entity instanceof Mob) {
/*  72 */         Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  87 */         Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*  88 */         if (entity2 instanceof LivingEntity) {
/*  89 */           LivingEntity _ent = (LivingEntity)entity2;
/*  90 */           _entity.setTarget(_ent);
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 102 */       if (!world.getEntitiesOfClass(IronGolem.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).isEmpty()) {
/*     */         Entity entity2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 117 */         if (entity2 = world.getEntitiesOfClass(IronGolem.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof Mob) {
/*     */           
/* 119 */           Mob _entity = (Mob)entity2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 134 */           entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 135 */           if (entity2 instanceof LivingEntity) {
/* 136 */             LivingEntity _ent = (LivingEntity)entity2;
/* 137 */             _entity.setTarget(_ent);
/*     */           } 
/*     */         } 
/*     */       } 
/* 141 */     }  Level _lvl11; if (world instanceof Level && (_lvl11 = (Level)world)
/* 142 */       .isDay() && 
/* 143 */       Math.random() < 1.0E-4D && 
/* 144 */       !entity.level().isClientSide())
/* 145 */       entity.discard(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\villager\FalseVillagerOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */