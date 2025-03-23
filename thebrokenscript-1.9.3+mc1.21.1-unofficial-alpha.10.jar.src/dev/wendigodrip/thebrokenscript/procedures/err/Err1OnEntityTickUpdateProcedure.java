/*     */ package dev.wendigodrip.thebrokenscript.procedures.err;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class Err1OnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  17 */     if (entity == null) {
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
/*  29 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/*  30 */       if (Math.random() < 0.5D) {
/*     */ 
/*     */         
/*  33 */         if (!entity.level().isClientSide()) {
/*  34 */           entity.discard();
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
/*     */         Entity entity2;
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  51 */         if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/*  52 */           !(_entity = (LivingEntity)entity2).level().isClientSide()) {
/*  53 */           _entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, false, false));
/*     */         }
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
/*     */         
/*  70 */         if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/*  71 */           !(_entity = (LivingEntity)entity2).level().isClientSide()) {
/*  72 */           _entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 60, 1, false, false));
/*     */         }
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
/*     */         
/*  89 */         if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/*  90 */           !(_entity = (LivingEntity)entity2).level().isClientSide()) {
/*  91 */           _entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1, false, false));
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/*  96 */         if (!entity.level().isClientSide()) {
/*  97 */           entity.discard();
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
/* 114 */         if (entity3 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 115 */           !(_entity = (LivingEntity)entity3).level().isClientSide()) {
/* 116 */           _entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 60, 1, false, false));
/*     */         }
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
/*     */         
/* 133 */         if (entity3 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 134 */           !(_entity = (LivingEntity)entity3).level().isClientSide()) {
/* 135 */           _entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1, false, false));
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
/* 148 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 459.0D, 459.0D, 459.0D), e -> true).isEmpty())
/* 149 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/* 151 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 153 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 160 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 163 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 169 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 171 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 178 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 181 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 187 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 189 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 196 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 199 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 205 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\err\Err1OnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */