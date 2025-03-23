/*     */ package dev.wendigodrip.thebrokenscript.procedures.brokenend;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.entity.vehicle.Boat;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TheBrokenEndStalkOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  30 */     if (entity == null) {
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
/*  42 */     if (!world.getEntitiesOfClass(IronGolem.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/*  43 */       ((IronGolem)world.getEntitiesOfClass(IronGolem.class, 
/*     */           
/*  45 */           AABB.ofSize(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  52 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  55 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/*  57 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).hurt(new DamageSource((Holder)world
/*  58 */             .registryAccess()
/*  59 */             .registryOrThrow(Registries.DAMAGE_TYPE)
/*  60 */             .getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 30.0F);
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
/*     */     
/*  72 */     if (!world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/*  73 */       ((Boat)world.getEntitiesOfClass(Boat.class, 
/*     */           
/*  75 */           AABB.ofSize(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  82 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  85 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/*  87 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).hurt(new DamageSource((Holder)world
/*  88 */             .registryAccess()
/*  89 */             .registryOrThrow(Registries.DAMAGE_TYPE)
/*  90 */             .getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 30.0F);
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
/*     */     
/* 102 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).isEmpty()) {
/* 103 */       if (Math.random() < 0.7D) {
/* 104 */         if (!entity.level().isClientSide()) {
/* 105 */           entity.discard();
/*     */         }
/* 107 */         ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 109 */             AABB.ofSize(new Vec3(x, y, z), 56.0D, 56.0D, 56.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 116 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 119 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 121 */             }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 122 */           .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/* 123 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 124 */           Entity entityToSpawn = ((EntityType)TBSEntities.THE_BROKEN_END.get()).spawn(_level, 
/*     */               
/* 126 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 133 */           if (entityToSpawn == null); }
/*     */ 
/*     */       
/*     */       }
/* 137 */       else if (Math.random() < 0.7D) {
/*     */ 
/*     */         
/* 140 */         if (!entity.level().isClientSide()) {
/* 141 */           entity.discard();
/*     */         }
/* 143 */         ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 145 */             AABB.ofSize(new Vec3(x, y, z), 56.0D, 56.0D, 56.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 152 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 155 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 157 */             }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 158 */           .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/* 159 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 160 */           Entity entityToSpawn = ((EntityType)TBSEntities.STRIKE.get()).spawn(_level, 
/*     */               
/* 162 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 169 */           if (entityToSpawn != null); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         LivingEntity _entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         Entity entity2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 188 */         if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 56.0D, 56.0D, 56.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 189 */           !(_entity = (LivingEntity)entity2).level().isClientSide()) {
/* 190 */           _entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, false, false));
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 195 */         if (!entity.level().isClientSide()) {
/* 196 */           entity.discard();
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         LivingEntity _entity;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         Entity entity3;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 213 */         if (entity3 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 56.0D, 56.0D, 56.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 214 */           !(_entity = (LivingEntity)entity3).level().isClientSide()) {
/* 215 */           _entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1, false, false));
/*     */         }
/*     */       } 
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
/* 228 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty())
/* 229 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/* 231 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 233 */               AABB.ofSize(new Vec3(x, y, z), 1200.0D, 1200.0D, 1200.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 240 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 243 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 249 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), y, ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 251 */               AABB.ofSize(new Vec3(x, y, z), 1200.0D, 1200.0D, 1200.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 258 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 261 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 267 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\brokenend\TheBrokenEndStalkOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */