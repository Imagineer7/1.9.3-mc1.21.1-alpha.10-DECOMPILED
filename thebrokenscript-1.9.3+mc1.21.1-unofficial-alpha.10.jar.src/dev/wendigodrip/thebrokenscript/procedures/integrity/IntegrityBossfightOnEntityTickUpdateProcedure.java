/*     */ package dev.wendigodrip.thebrokenscript.procedures.integrity;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSBlocks;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.entity.vehicle.Boat;
/*     */ import net.minecraft.world.entity.vehicle.ChestBoat;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class IntegrityBossfightOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  35 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  38 */     boolean found = false;
/*  39 */     double attacktype = 0.0D;
/*  40 */     double sx = 0.0D;
/*  41 */     double sy = 0.0D;
/*  42 */     double sz = 0.0D;
/*  43 */     if (Math.random() < 0.5D) {
/*  44 */       world.setBlock(
/*  45 */           BlockPos.containing(x + 
/*     */             
/*  47 */             Mth.nextInt(
/*  48 */               RandomSource.create(), 0, 5), y + 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  53 */             Mth.nextInt(
/*  54 */               RandomSource.create(), 0, 5), z + 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  59 */             Mth.nextInt(
/*  60 */               RandomSource.create(), 0, 5)), Blocks.AIR
/*     */ 
/*     */ 
/*     */           
/*  64 */           .defaultBlockState(), 3);
/*     */     } else {
/*     */       
/*  67 */       world.setBlock(
/*  68 */           BlockPos.containing(x - 
/*     */             
/*  70 */             Mth.nextInt(
/*  71 */               RandomSource.create(), 0, 5), y + 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  76 */             Mth.nextInt(
/*  77 */               RandomSource.create(), 0, 5), z - 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  82 */             Mth.nextInt(
/*  83 */               RandomSource.create(), 0, 5)), Blocks.AIR
/*     */ 
/*     */ 
/*     */           
/*  87 */           .defaultBlockState(), 3);
/*     */     } 
/*     */     
/*  90 */     if (world instanceof Level) {
/*  91 */       Level _level = (Level)world;
/*  92 */       if (!_level.isClientSide()) {
/*  93 */         _level.playSound(null, 
/*     */             
/*  95 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  96 */             .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 102 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */             
/* 106 */             .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 114 */     if (world instanceof ServerLevel) {
/* 115 */       ServerLevel serverLevel = (ServerLevel)world;
/* 116 */       serverLevel.getServer()
/* 117 */         .getCommands()
/* 118 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 126 */             (Component)Component.literal(""), serverLevel
/* 127 */             .getServer(), null))
/*     */           
/* 129 */           .withSuppressedOutput(), "gamemode survival @a");
/*     */     } 
/*     */     
/* 132 */     entity.getPersistentData().putDouble("attacktimer", entity.getPersistentData().getDouble("attacktimer") + 1.0D);
/* 133 */     entity.getPersistentData().putDouble("soundloop", entity.getPersistentData().getDouble("soundloop") + 1.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 143 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() && entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 158 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 159 */       if (entity2 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity2;
/* 160 */         _entity.setTarget(_ent); }
/*     */        }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 172 */     if (!world.getEntitiesOfClass(IronGolem.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty())
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 186 */       if (!((IronGolem)world.getEntitiesOfClass(IronGolem.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide()) {
/* 187 */         ((IronGolem)world.getEntitiesOfClass(IronGolem.class, 
/*     */             
/* 189 */             AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 196 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 199 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 201 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
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
/* 212 */     if (!world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty())
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 226 */       if (!((Boat)world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide()) {
/* 227 */         ((Boat)world.getEntitiesOfClass(Boat.class, 
/*     */             
/* 229 */             AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 236 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 239 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 241 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
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
/* 252 */     if (!world.getEntitiesOfClass(ChestBoat.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty())
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 266 */       if (!((ChestBoat)world.getEntitiesOfClass(ChestBoat.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
/* 267 */         ((ChestBoat)world.getEntitiesOfClass(ChestBoat.class, 
/*     */             
/* 269 */             AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 276 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 279 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 281 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard(); 
/*     */     }
/* 283 */     if (entity.getPersistentData().getDouble("soundloop") > 660.0D) {
/* 284 */       entity.getPersistentData().putDouble("soundloop", 0.0D);
/* 285 */       if (world instanceof Level) {
/* 286 */         Level _level = (Level)world;
/* 287 */         if (!_level.isClientSide()) {
/* 288 */           _level.playSound(null, 
/*     */               
/* 290 */               BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 291 */               .get(TBSConstants.id("thebrokenend_chase")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 297 */           _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */               
/* 301 */               .get(TBSConstants.id("thebrokenend_chase")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 310 */     if (entity.getPersistentData().getDouble("attacktimer") > 200.0D) {
/*     */ 
/*     */       
/* 313 */       entity.getPersistentData().putDouble("attacktimer", 0.0D);
/* 314 */       attacktype = Mth.nextInt(RandomSource.create(), 1, 6);
/* 315 */       if (attacktype == 1.0D)
/* 316 */         for (int index0 = 0; index0 < 15; index0++) {
/* 317 */           if (Math.random() < 0.5D) {
/* 318 */             if (world instanceof ServerLevel) {
/* 319 */               ServerLevel _level2 = (ServerLevel)world;
/* 320 */               Entity entityToSpawn = ((EntityType)TBSEntities.MISSILE.get()).spawn(_level2, 
/*     */                   
/* 322 */                   BlockPos.containing(x + 
/*     */                     
/* 324 */                     Mth.nextInt(
/* 325 */                       RandomSource.create(), 0, 35), 200.0D, z + 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/* 331 */                     Mth.nextInt(
/* 332 */                       RandomSource.create(), 0, 35)), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 339 */               if (entityToSpawn != null) {
/* 340 */                 entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */               }
/*     */             } 
/* 343 */           } else if (world instanceof ServerLevel) {
/* 344 */             ServerLevel _level2 = (ServerLevel)world;
/* 345 */             Entity entityToSpawn = ((EntityType)TBSEntities.MISSILE.get()).spawn(_level2, 
/*     */                 
/* 347 */                 BlockPos.containing(x - 
/*     */                   
/* 349 */                   Mth.nextInt(
/* 350 */                     RandomSource.create(), 0, 35), 200.0D, z - 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 356 */                   Mth.nextInt(
/* 357 */                     RandomSource.create(), 0, 35)), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 364 */             if (entityToSpawn != null)
/* 365 */               entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F); 
/*     */           } 
/*     */         }  
/* 368 */       if (attacktype == 2.0D) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 374 */         if (world instanceof Level) { Level _level3 = (Level)world;
/* 375 */           if (!_level3.isClientSide()) {
/* 376 */             _level3.playSound(null, 
/*     */                 
/* 378 */                 BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 379 */                 .get(TBSConstants.id("youknownothing")), SoundSource.NEUTRAL, 55.0F, 1.0F);
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */             
/* 385 */             _level3.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                 
/* 389 */                 .get(TBSConstants.id("youknownothing")), SoundSource.NEUTRAL, 55.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */ 
/*     */         
/*     */         LivingEntity _entity5;
/*     */ 
/*     */         
/* 397 */         if (entity instanceof LivingEntity && !(_entity5 = (LivingEntity)entity).level().isClientSide())
/* 398 */           _entity5.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 3, false, false)); 
/*     */         LivingEntity _entity4;
/* 400 */         if (entity instanceof LivingEntity && !(_entity4 = (LivingEntity)entity).level().isClientSide())
/* 401 */           _entity4.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 1, false, false)); 
/*     */         LivingEntity _entity3;
/* 403 */         if (entity instanceof LivingEntity && !(_entity3 = (LivingEntity)entity).level().isClientSide())
/* 404 */           _entity3.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 200, 100, false, false)); 
/*     */         LivingEntity _entity2;
/* 406 */         if (entity instanceof LivingEntity && !(_entity2 = (LivingEntity)entity).level().isClientSide())
/* 407 */           _entity2.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1, false, false)); 
/*     */         LivingEntity _entity;
/* 409 */         if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).level().isClientSide()) {
/* 410 */           _entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 200, 1, false, false));
/*     */         }
/*     */       } 
/* 413 */       if (attacktype == 3.0D) {
/*     */ 
/*     */ 
/*     */         
/* 417 */         if (world instanceof Level) { Level _level4 = (Level)world;
/* 418 */           if (!_level4.isClientSide()) {
/* 419 */             _level4.playSound(null, 
/*     */                 
/* 421 */                 BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 422 */                 .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 55.0F, 1.0F);
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */             
/* 428 */             _level4.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                 
/* 432 */                 .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 55.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         LivingEntity _entity7;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         Entity ent;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 457 */         if (ent = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 458 */           !(_entity7 = (LivingEntity)ent).level().isClientSide()) {
/* 459 */           _entity7.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 200, 1, false, false));
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         LivingEntity _entity6;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 476 */         if (ent = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 477 */           !(_entity6 = (LivingEntity)ent).level().isClientSide()) {
/* 478 */           _entity6.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200, 1, false, false));
/*     */         }
/*     */ 
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
/*     */ 
/*     */         
/* 495 */         if (ent = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 496 */           !(_entity = (LivingEntity)ent).level().isClientSide()) {
/* 497 */           _entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200, 1, false, false));
/*     */         }
/*     */       } 
/* 500 */       if (attacktype == 4.0D) {
/* 501 */         if (world instanceof Level) { Level _level5 = (Level)world;
/* 502 */           if (!_level5.isClientSide()) {
/* 503 */             _level5.playSound(null, 
/*     */                 
/* 505 */                 BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 506 */                 .get(TBSConstants.id("heartbeat")), SoundSource.NEUTRAL, 55.0F, 1.0F);
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */             
/* 512 */             _level5.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                 
/* 516 */                 .get(TBSConstants.id("heartbeat")), SoundSource.NEUTRAL, 55.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 524 */         if (world instanceof ServerLevel) { ServerLevel _level6 = (ServerLevel)world;
/* 525 */           _level6.setDayTime(Mth.nextInt(RandomSource.create(), 1, 18000)); }
/*     */       
/*     */       } 
/* 528 */       if (attacktype == 5.0D) {
/* 529 */         for (int index1 = 0; index1 < 45; index1++) {
/* 530 */           if (Math.random() < 0.5D) {
/* 531 */             world.setBlock(
/* 532 */                 BlockPos.containing(x + 
/*     */                   
/* 534 */                   Mth.nextInt(
/* 535 */                     RandomSource.create(), 0, 35), y + 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 540 */                   Mth.nextInt(
/* 541 */                     RandomSource.create(), 1, 10), z + 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 546 */                   Mth.nextInt(
/* 547 */                     RandomSource.create(), 0, 35)), ((Block)TBSBlocks.DISRUPTION
/*     */ 
/*     */ 
/*     */                 
/* 551 */                 .get()).defaultBlockState(), 3);
/*     */           }
/*     */           else {
/*     */             
/* 555 */             world.setBlock(
/* 556 */                 BlockPos.containing(x - 
/*     */                   
/* 558 */                   Mth.nextInt(
/* 559 */                     RandomSource.create(), 0, 35), y + 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 564 */                   Mth.nextInt(
/* 565 */                     RandomSource.create(), 1, 10), z - 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/* 570 */                   Mth.nextInt(
/* 571 */                     RandomSource.create(), 0, 35)), ((Block)TBSBlocks.DISRUPTION
/*     */ 
/*     */ 
/*     */                 
/* 575 */                 .get()).defaultBlockState(), 3);
/*     */           } 
/*     */         } 
/*     */       }
/* 579 */       if (attacktype == 6.0D)
/* 580 */         for (int index2 = 0; index2 < 200; index2++) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 595 */           Entity entityToSpawn = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 596 */           if (entityToSpawn instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entityToSpawn;
/* 597 */             _entity.setHealth(Mth.nextInt(RandomSource.create(), 1, 20)); }
/*     */         
/*     */         }  
/*     */     } 
/* 601 */     sx = -3.0D;
/* 602 */     found = false;
/* 603 */     for (int index3 = 0; index3 < 6; index3++) {
/* 604 */       sy = -3.0D;
/* 605 */       for (int index4 = 0; index4 < 6; index4++) {
/* 606 */         sz = -3.0D;
/* 607 */         for (int index5 = 0; index5 < 6; index5++) {
/* 608 */           if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))
/*     */ 
/*     */ 
/*     */             
/* 612 */             .getBlock() == Blocks.WATER || world
/* 613 */             .getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))
/*     */ 
/*     */ 
/*     */             
/* 617 */             .getBlock() == Blocks.WATER) {
/* 618 */             found = true;
/*     */           }
/* 620 */           sz++;
/*     */         } 
/* 622 */         sy++;
/*     */       } 
/* 624 */       sx++;
/*     */     } 
/* 626 */     if (found)
/* 627 */       world.setBlock(
/* 628 */           BlockPos.containing(sx, sy, sz), Blocks.GRASS_BLOCK
/* 629 */           .defaultBlockState(), 3); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\integrity\IntegrityBossfightOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */