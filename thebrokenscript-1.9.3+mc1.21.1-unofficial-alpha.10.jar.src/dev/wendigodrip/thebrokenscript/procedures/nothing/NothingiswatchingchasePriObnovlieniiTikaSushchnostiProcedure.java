/*     */ package dev.wendigodrip.thebrokenscript.procedures.nothing;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.allay.Allay;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NothingiswatchingchasePriObnovlieniiTikaSushchnostiProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  37 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  40 */     double breakblockYcoord = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  50 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 510.0D, 510.0D, 510.0D), e -> true).isEmpty()) {
/*  51 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/*  53 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  55 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  62 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  65 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  71 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/*  73 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  80 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  83 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  89 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/*  91 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  98 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 101 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 107 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*     */ 
/*     */       
/* 110 */       ((Player)world.getEntitiesOfClass(Player.class, 
/*     */           
/* 112 */           AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 119 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 122 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/* 124 */           }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 125 */         .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/* 126 */       if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 141 */         Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 142 */         if (entity2 instanceof LivingEntity) { LivingEntity _ent2 = (LivingEntity)entity2;
/* 143 */           _entity.setTarget(_ent2); }
/*     */          }
/*     */     
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 151 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 5.0D, 5.0D, 5.0D), e -> true).isEmpty()) {
/* 152 */       ((Player)world.getEntitiesOfClass(Player.class, 
/*     */           
/* 154 */           AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 161 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 164 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/* 166 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).hurt(new DamageSource((Holder)world
/* 167 */             .registryAccess()
/* 168 */             .registryOrThrow(Registries.DAMAGE_TYPE)
/* 169 */             .getHolderOrThrow(DamageTypes.GENERIC)), 500.0F);
/*     */       
/* 171 */       if (!entity.level().isClientSide()) {
/* 172 */         entity.discard();
/*     */       }
/* 174 */       if (world instanceof Level) { Level lv = (Level)world;
/* 175 */         if (!lv.isClientSide()) {
/* 176 */           lv.playSound(null, 
/*     */               
/* 178 */               BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 179 */               .get(TBSConstants.id("nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 185 */           lv.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */               
/* 189 */               .get(TBSConstants.id("nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */         }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 197 */       TheBrokenScript.queueServerWork(20, () -> {
/*     */             Allay closest = world.getEntitiesOfClass(Allay.class, AABB.ofSize(new Vec3(x, y, z), 31.0D, 31.0D, 31.0D), ()).stream().sorted((new Object()
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                   {
/* 210 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/*     */                 }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*     */             if (closest != null && !closest.level().isClientSide()) {
/*     */               ((Allay)world.getEntitiesOfClass(Allay.class, AABB.ofSize(new Vec3(x, y, z), 31.0D, 31.0D, 31.0D), ()).stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                     {
/* 227 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/*     */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
/*     */             }
/*     */           });
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 238 */     if (Math.random() < 1.0E-4D) {
/* 239 */       Entity _ent = entity;
/* 240 */       _ent.teleportTo(((Player)world
/* 241 */           .getEntitiesOfClass(Player.class, 
/*     */             
/* 243 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 250 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 253 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 255 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + 
/* 256 */           Mth.nextInt(RandomSource.create(), 2, 3), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 258 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 270 */           .stream()
/* 271 */           .sorted((new Object()
/*     */             {
/*     */ 
/*     */ 
/*     */               
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */               {
/* 278 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 285 */             }).compareDistOf(x, y, z))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 290 */           .findFirst()
/* 291 */           .orElse(null))
/* 292 */           .getY() + 5.0D, ((Player)world
/* 293 */           .getEntitiesOfClass(Player.class, 
/*     */             
/* 295 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 302 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 305 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 307 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ());
/*     */       
/* 309 */       if (_ent instanceof ServerPlayer) {
/* 310 */         ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 311 */         _serverPlayer.connection.teleport(((Player)world
/* 312 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 314 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 321 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 324 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 326 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + 
/* 327 */             Mth.nextInt(RandomSource.create(), 2, 3), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 329 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 341 */             .stream()
/* 342 */             .sorted((new Object()
/*     */               {
/*     */ 
/*     */ 
/*     */                 
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                 {
/* 349 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 356 */               }).compareDistOf(x, y, z))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 361 */             .findFirst()
/* 362 */             .orElse(null))
/* 363 */             .getY() + 5.0D, ((Player)world
/* 364 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 366 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 373 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 376 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 378 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ(), _ent.getYRot(), _ent.getXRot());
/*     */       } 
/*     */     } 
/*     */     
/* 382 */     if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).getBlock() == Blocks.WATER) {
/*     */       
/* 384 */       Entity _ent = entity;
/* 385 */       _ent.teleportTo(entity
/* 386 */           .level()
/* 387 */           .clip(new ClipContext(entity
/* 388 */               .getEyePosition(1.0F), entity
/* 389 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 394 */           .getBlockPos()
/* 395 */           .getX(), entity
/* 396 */           .level()
/* 397 */           .clip(new ClipContext(entity
/* 398 */               .getEyePosition(1.0F), entity
/* 399 */               .getEyePosition(1.0F)
/* 400 */               .add(entity.getViewVector(1.0F).scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 405 */           .getBlockPos()
/* 406 */           .getY(), entity
/* 407 */           .level()
/* 408 */           .clip(new ClipContext(entity
/* 409 */               .getEyePosition(1.0F), entity
/* 410 */               .getEyePosition(1.0F)
/* 411 */               .add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 416 */           .getBlockPos()
/* 417 */           .getZ());
/*     */       
/* 419 */       if (_ent instanceof ServerPlayer) {
/* 420 */         ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 421 */         _serverPlayer.connection.teleport(entity
/* 422 */             .level()
/* 423 */             .clip(new ClipContext(entity
/* 424 */                 .getEyePosition(1.0F), entity
/* 425 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 430 */             .getBlockPos()
/* 431 */             .getX(), entity
/* 432 */             .level()
/* 433 */             .clip(new ClipContext(entity
/* 434 */                 .getEyePosition(1.0F), entity
/* 435 */                 .getEyePosition(1.0F)
/* 436 */                 .add(entity.getViewVector(1.0F)
/* 437 */                   .scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 442 */             .getBlockPos()
/* 443 */             .getY(), entity
/* 444 */             .level()
/* 445 */             .clip(new ClipContext(entity
/* 446 */                 .getEyePosition(1.0F), entity
/* 447 */                 .getEyePosition(1.0F)
/* 448 */                 .add(entity.getViewVector(1.0F)
/* 449 */                   .scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 454 */             .getBlockPos()
/* 455 */             .getZ(), _ent
/* 456 */             .getYRot(), _ent
/* 457 */             .getXRot());
/*     */       } 
/*     */     } 
/*     */     
/* 461 */     if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).getBlock() == Blocks.WATER) {
/*     */       
/* 463 */       Entity _ent = entity;
/* 464 */       _ent.teleportTo(entity
/* 465 */           .level()
/* 466 */           .clip(new ClipContext(entity
/* 467 */               .getEyePosition(1.0F), entity
/* 468 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 473 */           .getBlockPos()
/* 474 */           .getX(), entity
/* 475 */           .level()
/* 476 */           .clip(new ClipContext(entity
/* 477 */               .getEyePosition(1.0F), entity
/* 478 */               .getEyePosition(1.0F)
/* 479 */               .add(entity.getViewVector(1.0F).scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 484 */           .getBlockPos()
/* 485 */           .getY(), entity
/* 486 */           .level()
/* 487 */           .clip(new ClipContext(entity
/* 488 */               .getEyePosition(1.0F), entity
/* 489 */               .getEyePosition(1.0F)
/* 490 */               .add(entity.getViewVector(1.0F).scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 495 */           .getBlockPos()
/* 496 */           .getZ());
/*     */       
/* 498 */       if (_ent instanceof ServerPlayer) {
/* 499 */         ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 500 */         _serverPlayer.connection.teleport(entity
/* 501 */             .level()
/* 502 */             .clip(new ClipContext(entity
/* 503 */                 .getEyePosition(1.0F), entity
/* 504 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 509 */             .getBlockPos()
/* 510 */             .getX(), entity
/* 511 */             .level()
/* 512 */             .clip(new ClipContext(entity
/* 513 */                 .getEyePosition(1.0F), entity
/* 514 */                 .getEyePosition(1.0F)
/* 515 */                 .add(entity.getViewVector(1.0F)
/* 516 */                   .scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 521 */             .getBlockPos()
/* 522 */             .getY(), entity
/* 523 */             .level()
/* 524 */             .clip(new ClipContext(entity
/* 525 */                 .getEyePosition(1.0F), entity
/* 526 */                 .getEyePosition(1.0F)
/* 527 */                 .add(entity.getViewVector(1.0F)
/* 528 */                   .scale(0.05D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 533 */             .getBlockPos()
/* 534 */             .getZ(), _ent
/* 535 */             .getYRot(), _ent
/* 536 */             .getXRot());
/*     */       } 
/*     */     } 
/*     */     
/* 540 */     if (Math.random() < 0.1D) {
/*     */       
/* 542 */       if (world instanceof ServerLevel) {
/* 543 */         ServerLevel _level = (ServerLevel)world;
/* 544 */         Entity entityToSpawn = ((EntityType)TBSEntities.JUMPOSCOROOO.get()).spawn(_level, 
/*     */             
/* 546 */             BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 553 */         if (entityToSpawn != null);
/*     */       } 
/*     */ 
/*     */       
/* 557 */       if (world instanceof ServerLevel) {
/* 558 */         ServerLevel _level = (ServerLevel)world;
/* 559 */         Entity entityToSpawn = ((EntityType)TBSEntities.WRONG_OVERLAY.get()).spawn(_level, 
/*     */             
/* 561 */             BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 568 */         if (entityToSpawn != null);
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 573 */     if (world.getBlockState(BlockPos.containing(x + 1.0D, 
/*     */           
/* 575 */           breakblockYcoord = Mth.nextInt(
/* 576 */             RandomSource.create(), 1, 5) + y, z))
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 581 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 582 */       BlockPos _pos = BlockPos.containing(x + 1.0D, breakblockYcoord, z);
/* 583 */       Block.dropResources(world
/* 584 */           .getBlockState(_pos), world, 
/*     */           
/* 586 */           BlockPos.containing(x + 1.0D, breakblockYcoord, z), null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 593 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 595 */     if (world.getBlockState(BlockPos.containing(x - 1.0D, breakblockYcoord, z))
/* 596 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 597 */       BlockPos _pos = BlockPos.containing(x - 1.0D, breakblockYcoord, z);
/* 598 */       Block.dropResources(world
/* 599 */           .getBlockState(_pos), world, 
/*     */           
/* 601 */           BlockPos.containing(x - 1.0D, breakblockYcoord, z), null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 608 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 610 */     if (world.getBlockState(BlockPos.containing(x, breakblockYcoord, z + 1.0D))
/* 611 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 612 */       BlockPos _pos = BlockPos.containing(x, breakblockYcoord, z + 1.0D);
/* 613 */       Block.dropResources(world
/* 614 */           .getBlockState(_pos), world, 
/*     */           
/* 616 */           BlockPos.containing(x, breakblockYcoord, z + 1.0D), null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 623 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 625 */     if (world.getBlockState(BlockPos.containing(x, breakblockYcoord, z - 1.0D))
/* 626 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 627 */       BlockPos _pos = BlockPos.containing(x, breakblockYcoord, z - 1.0D);
/* 628 */       Block.dropResources(world
/* 629 */           .getBlockState(_pos), world, 
/*     */           
/* 631 */           BlockPos.containing(x, breakblockYcoord, z - 1.0D), null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 638 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 640 */     if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z))
/* 641 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 642 */       BlockPos _pos = BlockPos.containing(x, y - 1.0D, z);
/* 643 */       Block.dropResources(world
/* 644 */           .getBlockState(_pos), world, 
/*     */           
/* 646 */           BlockPos.containing(x, y - 1.0D, z), null);
/*     */ 
/*     */       
/* 649 */       world.destroyBlock(_pos, false);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nothing\NothingiswatchingchasePriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */