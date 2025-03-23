/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import dev.wendigodrip.thebrokenscript.entity.HetzerEntity;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import dev.wendigodrip.thebrokenscript.util.TimeOfDay;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class HetzerOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  33 */     if (entity == null) {
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
/*  45 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).isEmpty()) {
/*  46 */       entity.getPersistentData().putDouble("distance", entity.getPersistentData().getDouble("distance") + 2.0D);
/*  47 */       if (entity.getPersistentData().getDouble("distance") > 500.0D) {
/*  48 */         entity.getPersistentData().putDouble("distance", 0.0D);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 410 */       if (!world.getEntitiesOfClass(HetzerEntity.class, AABB.ofSize(new Vec3(((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().clip(new ClipContext(((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F), ((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F).add(((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1.0F).scale(entity.getPersistentData().getDouble("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).getBlockPos().getX(), ((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().clip(new ClipContext(((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F), ((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F).add(((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1.0F).scale(entity.getPersistentData().getDouble("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).getBlockPos().getY(), ((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().clip(new ClipContext(((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F), ((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F).add(((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).getViewVector(1.0F).scale(entity.getPersistentData().getDouble("distance"))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null))).getBlockPos().getZ()), 10.0D, 10.0D, 10.0D), e -> true).isEmpty())
/* 411 */         if (Math.random() < 0.7D) {
/*     */ 
/*     */ 
/*     */           
/* 415 */           if (!entity.level().isClientSide()) {
/* 416 */             entity.discard();
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           LivingEntity _entity;
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           Entity entity2;
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 433 */           if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 434 */             !(_entity = (LivingEntity)entity2).level().isClientSide()) {
/* 435 */             _entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 5, 1, false, false));
/*     */           }
/* 437 */           if (world instanceof Level) {
/* 438 */             Level _level = (Level)world;
/* 439 */             if (!_level.isClientSide()) {
/* 440 */               _level.playSound(null, 
/*     */                   
/* 442 */                   BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 443 */                   .get(TBSConstants.id("falsesubwooferlullaby")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */             
/*     */             }
/*     */             else {
/*     */ 
/*     */               
/* 449 */               _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                   
/* 453 */                   .get(TBSConstants.id("falsesubwooferlullaby")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */             } 
/*     */           } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 461 */           if (world instanceof ServerLevel) {
/* 462 */             TimeOfDay.DAY.set(world);
/*     */           }
/* 464 */           TheBrokenScript.queueServerWork(1000, () -> {
/*     */                 if (world instanceof ServerLevel) {
/*     */                   ServerLevel lv = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */                   
/*     */                   lv = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */                   
/*     */                   lv.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, lv, 4, "", (Component)Component.literal(""), lv.getServer(), null)).withSuppressedOutput(), "stopsound @a");
/*     */                 } 
/*     */ 
/*     */ 
/*     */                 
/*     */                 if (world instanceof ServerLevel) {
/*     */                   ServerLevel lv = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */                   
/*     */                   TimeOfDay.MIDNIGHT.set(lv);
/*     */                 } 
/*     */               });
/*     */ 
/*     */           
/* 489 */           TheBrokenScript.queueServerWork(1200, () -> {
/*     */                 if (world instanceof ServerLevel) {
/*     */                   ServerLevel lv = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT_DISGUISED_AS_CREEPER.get()).spawn(lv, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */                   
/*     */                   if (entityToSpawn != null) {
/*     */                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */                   }
/*     */                 } 
/*     */               });
/*     */         } else {
/* 506 */           if (!entity.level().isClientSide()) {
/* 507 */             entity.discard();
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           LivingEntity _entity;
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           Entity entity3;
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 524 */           if (entity3 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 525 */             !(_entity = (LivingEntity)entity3).level().isClientSide()) {
/* 526 */             _entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 5, 1, false, false));
/*     */           }
/* 528 */           if (world instanceof Level) { Level _level = (Level)world;
/* 529 */             if (!_level.isClientSide()) {
/* 530 */               _level.playSound(null, 
/*     */                   
/* 532 */                   BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 533 */                   .get(TBSConstants.id("falsesubwooferlullaby")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */             
/*     */             }
/*     */             else {
/*     */ 
/*     */               
/* 539 */               _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                   
/* 543 */                   .get(TBSConstants.id("falsesubwooferlullaby")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */             }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 551 */           TheBrokenScript.queueServerWork(1000, () -> {
/*     */                 if (world instanceof ServerLevel) {
/*     */                   ServerLevel _level = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   _level.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", (Component)Component.literal(""), _level.getServer(), null)).withSuppressedOutput(), "stopsound @a");
/*     */                 } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*     */                 if (world instanceof ServerLevel) {
/*     */                   TimeOfDay.MIDNIGHT.set(world);
/*     */                 }
/*     */               });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 577 */           TheBrokenScript.queueServerWork(1200, () -> {
/*     */                 if (world instanceof ServerLevel) {
/*     */                   ServerLevel _level = (ServerLevel)world;
/*     */                   Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */                   if (entityToSpawn != null)
/*     */                     entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F); 
/*     */                 } 
/*     */               });
/*     */         }  
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\HetzerOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */