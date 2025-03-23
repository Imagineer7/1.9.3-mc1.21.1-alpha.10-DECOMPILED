/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSParticleTypes;
/*     */ import dev.wendigodrip.thebrokenscript.util.TimeOfDay;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NulllPriObnovlieniiTikaSushchnostiProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  41 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  44 */     if (world instanceof ServerLevel) {
/*  45 */       ServerLevel _level = (ServerLevel)world;
/*  46 */       _level.sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE
/*  47 */           .get(), x, y, z, 2, 2.0D, 3.0D, 2.0D, 0.0D);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  67 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty()) {
/*  68 */       ((Player)world.getEntitiesOfClass(Player.class, 
/*     */           
/*  70 */           AABB.ofSize(new Vec3(x, y, z), 210.0D, 210.0D, 210.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  77 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  80 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/*  82 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).hurt(new DamageSource((Holder)world
/*  83 */             .registryAccess()
/*  84 */             .registryOrThrow(Registries.DAMAGE_TYPE)
/*  85 */             .getHolderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 0.2F);
/*     */       
/*  87 */       ((Player)world.getEntitiesOfClass(Player.class, 
/*     */           
/*  89 */           AABB.ofSize(new Vec3(x, y, z), 210.0D, 210.0D, 210.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  96 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  99 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/* 101 */           }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 102 */         .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/*     */     } 
/* 104 */     if (world.getEntitiesOfClass(Player.class, 
/*     */         
/* 106 */         AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 113 */       .isEmpty())
/* 114 */     { if (!entity.level().isClientSide()) {
/* 115 */         entity.discard();
/*     */       } }
/* 117 */     else if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 132 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 133 */       if (entity2 instanceof LivingEntity) { LivingEntity _ent2 = (LivingEntity)entity2;
/* 134 */         _entity.setTarget(_ent2); }
/*     */        }
/*     */     
/* 137 */     if (Math.random() < 0.01D && world instanceof ServerLevel) {
/* 138 */       TimeOfDay.MIDNIGHT.set(world);
/*     */     }
/* 140 */     if (Math.random() < 0.01D && world instanceof ServerLevel) {
/* 141 */       TimeOfDay.DAY.set(world);
/*     */     }
/* 143 */     if (Math.random() < 0.1D) {
/* 144 */       if (Math.random() < 0.5D) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 159 */         Entity _ent = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 160 */         _ent.teleportTo(((Player)world
/* 161 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 163 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 170 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 173 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 175 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + 
/* 176 */             Mth.nextInt(RandomSource.create(), 0, 0), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 178 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 190 */             .stream()
/* 191 */             .sorted((new Object()
/*     */               {
/*     */ 
/*     */ 
/*     */                 
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                 {
/* 198 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 205 */               }).compareDistOf(x, y, z))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 210 */             .findFirst()
/* 211 */             .orElse(null))
/* 212 */             .getY() + 
/* 213 */             Mth.nextInt(
/* 214 */               RandomSource.create(), 0, 0), ((Player)world
/*     */ 
/*     */             
/* 217 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 219 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 231 */             .stream()
/* 232 */             .sorted((new Object()
/*     */               {
/*     */ 
/*     */ 
/*     */                 
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                 {
/* 239 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 246 */               }).compareDistOf(x, y, z))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 251 */             .findFirst()
/* 252 */             .orElse(null))
/* 253 */             .getZ() + 
/* 254 */             Mth.nextInt(
/* 255 */               RandomSource.create(), 0, 0));
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 260 */         if (_ent instanceof ServerPlayer) {
/* 261 */           ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 262 */           _serverPlayer.connection.teleport(((Player)world
/* 263 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 265 */                 AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 272 */               .stream().sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 275 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 281 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX() + 
/* 282 */               Mth.nextInt(RandomSource.create(), 0, 0), ((Player)world
/* 283 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 285 */                 AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 297 */               .stream()
/* 298 */               .sorted((new Object()
/*     */                 {
/*     */ 
/*     */ 
/*     */                   
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                   {
/* 305 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 311 */                 }).compareDistOf(x, y, z))
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 316 */               .findFirst()
/* 317 */               .orElse(null)).getY() + 
/* 318 */               Mth.nextInt(
/* 319 */                 RandomSource.create(), 0, 0), ((Player)world
/*     */ 
/*     */ 
/*     */               
/* 323 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 325 */                 AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 332 */               .stream().sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 335 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 341 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() + 
/* 342 */               Mth.nextInt(RandomSource.create(), 0, 0), _ent
/* 343 */               .getYRot(), _ent
/* 344 */               .getXRot());
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 362 */         Entity _ent = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 363 */         _ent.teleportTo(((Player)world
/* 364 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 366 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
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
/* 378 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX() - 
/* 379 */             Mth.nextInt(RandomSource.create(), 0, 0), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 381 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 388 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 391 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 393 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 395 */               AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 402 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 405 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 411 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() - 
/* 412 */             Mth.nextInt(
/* 413 */               RandomSource.create(), 0, 0));
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 418 */         if (_ent instanceof ServerPlayer) {
/* 419 */           ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 420 */           _serverPlayer.connection.teleport(((Player)world
/* 421 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 423 */                 AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 430 */               .stream().sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 433 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 439 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX() - 
/* 440 */               Mth.nextInt(RandomSource.create(), 0, 0), ((Player)world
/* 441 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 443 */                 AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 450 */               .stream().sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 453 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 459 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world
/* 460 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 462 */                 AABB.ofSize(new Vec3(x, y, z), 520.0D, 520.0D, 520.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 469 */               .stream().sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 472 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 478 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ() - 
/* 479 */               Mth.nextInt(RandomSource.create(), 0, 0), _ent
/* 480 */               .getYRot(), _ent
/* 481 */               .getXRot());
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 486 */     if (TBSConfigs.COMMON != null && !TBSConfigs.COMMON.disableBlockBreaking) {
/*     */       
/* 488 */       if (world.getBlockState(BlockPos.containing(x + 1.0D, y, z))
/* 489 */         .is(BlockTags.create(TBSConstants.id("nullbreakablefixed")))) {
/* 490 */         BlockPos _pos = BlockPos.containing(x + 1.0D, y, z);
/* 491 */         Block.dropResources(world
/* 492 */             .getBlockState(_pos), world, 
/*     */             
/* 494 */             BlockPos.containing(x + 1.0D, y, z), null);
/*     */ 
/*     */         
/* 497 */         world.destroyBlock(_pos, false);
/*     */       } 
/* 499 */       if (world.getBlockState(BlockPos.containing(x - 1.0D, y, z))
/* 500 */         .is(BlockTags.create(TBSConstants.id("nullbreakablefixed")))) {
/* 501 */         BlockPos _pos = BlockPos.containing(x - 1.0D, y, z);
/* 502 */         Block.dropResources(world
/* 503 */             .getBlockState(_pos), world, 
/*     */             
/* 505 */             BlockPos.containing(x - 1.0D, y, z), null);
/*     */ 
/*     */         
/* 508 */         world.destroyBlock(_pos, false);
/*     */       } 
/* 510 */       if (world.getBlockState(BlockPos.containing(x, y, z + 1.0D))
/* 511 */         .is(BlockTags.create(TBSConstants.id("nullbreakablefixed")))) {
/* 512 */         BlockPos _pos = BlockPos.containing(x, y, z + 1.0D);
/* 513 */         Block.dropResources(world
/* 514 */             .getBlockState(_pos), world, 
/*     */             
/* 516 */             BlockPos.containing(x, y, z + 1.0D), null);
/*     */ 
/*     */         
/* 519 */         world.destroyBlock(_pos, false);
/*     */       } 
/* 521 */       if (world.getBlockState(BlockPos.containing(x, y, z - 1.0D))
/* 522 */         .is(BlockTags.create(TBSConstants.id("nullbreakablefixed")))) {
/* 523 */         BlockPos _pos = BlockPos.containing(x, y, z - 1.0D);
/* 524 */         Block.dropResources(world
/* 525 */             .getBlockState(_pos), world, 
/*     */             
/* 527 */             BlockPos.containing(x, y, z - 1.0D), null);
/*     */ 
/*     */         
/* 530 */         world.destroyBlock(_pos, false);
/*     */       } 
/* 532 */       if (world.getBlockState(BlockPos.containing(x + 1.0D, y + 1.0D, z))
/* 533 */         .is(BlockTags.create(TBSConstants.id("nullbreakablefixed")))) {
/* 534 */         BlockPos _pos = BlockPos.containing(x + 1.0D, y + 1.0D, z);
/* 535 */         Block.dropResources(world
/* 536 */             .getBlockState(_pos), world, 
/*     */             
/* 538 */             BlockPos.containing(x + 1.0D, y + 1.0D, z), null);
/*     */ 
/*     */         
/* 541 */         world.destroyBlock(_pos, false);
/*     */       } 
/* 543 */       if (world.getBlockState(BlockPos.containing(x - 1.0D, y + 1.0D, z))
/* 544 */         .is(BlockTags.create(TBSConstants.id("nullbreakablefixed")))) {
/* 545 */         BlockPos _pos = BlockPos.containing(x + 1.0D, y + 1.0D, z);
/* 546 */         Block.dropResources(world
/* 547 */             .getBlockState(_pos), world, 
/*     */             
/* 549 */             BlockPos.containing(x + 1.0D, y + 1.0D, z), null);
/*     */ 
/*     */         
/* 552 */         world.destroyBlock(_pos, false);
/*     */       } 
/* 554 */       if (world.getBlockState(BlockPos.containing(x, y + 1.0D, z + 1.0D))
/* 555 */         .is(BlockTags.create(TBSConstants.id("nullbreakablefixed")))) {
/* 556 */         BlockPos _pos = BlockPos.containing(x, y + 1.0D, z + 1.0D);
/* 557 */         Block.dropResources(world
/* 558 */             .getBlockState(_pos), world, 
/*     */             
/* 560 */             BlockPos.containing(x, y + 1.0D, z + 1.0D), null);
/*     */ 
/*     */         
/* 563 */         world.destroyBlock(_pos, false);
/*     */       } 
/* 565 */       if (world.getBlockState(BlockPos.containing(x, y + 1.0D, z - 1.0D))
/* 566 */         .is(BlockTags.create(TBSConstants.id("nullbreakablefixed")))) {
/* 567 */         BlockPos _pos = BlockPos.containing(x, y + 1.0D, z - 1.0D);
/* 568 */         Block.dropResources(world
/* 569 */             .getBlockState(_pos), world, 
/*     */             
/* 571 */             BlockPos.containing(x, y + 1.0D, z - 1.0D), null);
/*     */ 
/*     */         
/* 574 */         world.destroyBlock(_pos, false);
/*     */       } 
/*     */     } 
/* 577 */     if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).getBlock() == Blocks.WATER || world
/*     */       
/* 579 */       .getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.WATER) {
/* 580 */       Entity _ent = entity;
/* 581 */       _ent.teleportTo(entity
/* 582 */           .level()
/* 583 */           .clip(new ClipContext(entity
/* 584 */               .getEyePosition(1.0F), entity
/* 585 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 590 */           .getBlockPos()
/* 591 */           .getX(), entity
/* 592 */           .level()
/* 593 */           .clip(new ClipContext(entity
/* 594 */               .getEyePosition(1.0F), entity
/* 595 */               .getEyePosition(1.0F)
/* 596 */               .add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 601 */           .getBlockPos()
/* 602 */           .getY(), entity
/* 603 */           .level()
/* 604 */           .clip(new ClipContext(entity
/* 605 */               .getEyePosition(1.0F), entity
/* 606 */               .getEyePosition(1.0F)
/* 607 */               .add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 612 */           .getBlockPos()
/* 613 */           .getZ());
/*     */       
/* 615 */       if (_ent instanceof ServerPlayer) {
/* 616 */         ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 617 */         _serverPlayer.connection.teleport(entity
/* 618 */             .level()
/* 619 */             .clip(new ClipContext(entity
/* 620 */                 .getEyePosition(1.0F), entity
/* 621 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 626 */             .getBlockPos()
/* 627 */             .getX(), entity
/* 628 */             .level()
/* 629 */             .clip(new ClipContext(entity
/* 630 */                 .getEyePosition(1.0F), entity
/* 631 */                 .getEyePosition(1.0F)
/* 632 */                 .add(entity.getViewVector(1.0F)
/* 633 */                   .scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 638 */             .getBlockPos()
/* 639 */             .getY(), entity
/* 640 */             .level()
/* 641 */             .clip(new ClipContext(entity
/* 642 */                 .getEyePosition(1.0F), entity
/* 643 */                 .getEyePosition(1.0F)
/* 644 */                 .add(entity.getViewVector(1.0F)
/* 645 */                   .scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 650 */             .getBlockPos()
/* 651 */             .getZ(), _ent
/* 652 */             .getYRot(), _ent
/* 653 */             .getXRot());
/*     */       } 
/*     */     } 
/*     */     
/* 657 */     if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).getBlock() == Blocks.WATER || world
/*     */       
/* 659 */       .getBlockState(BlockPos.containing(x, y, z)).getBlock() == Blocks.WATER) {
/* 660 */       Entity _ent = entity;
/* 661 */       _ent.teleportTo(entity
/* 662 */           .level()
/* 663 */           .clip(new ClipContext(entity
/* 664 */               .getEyePosition(1.0F), entity
/* 665 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 670 */           .getBlockPos()
/* 671 */           .getX(), entity
/* 672 */           .level()
/* 673 */           .clip(new ClipContext(entity
/* 674 */               .getEyePosition(1.0F), entity
/* 675 */               .getEyePosition(1.0F)
/* 676 */               .add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 681 */           .getBlockPos()
/* 682 */           .getY(), entity
/* 683 */           .level()
/* 684 */           .clip(new ClipContext(entity
/* 685 */               .getEyePosition(1.0F), entity
/* 686 */               .getEyePosition(1.0F)
/* 687 */               .add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 692 */           .getBlockPos()
/* 693 */           .getZ());
/*     */       
/* 695 */       if (_ent instanceof ServerPlayer) {
/* 696 */         ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 697 */         _serverPlayer.connection.teleport(entity
/* 698 */             .level()
/* 699 */             .clip(new ClipContext(entity
/* 700 */                 .getEyePosition(1.0F), entity
/* 701 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 706 */             .getBlockPos()
/* 707 */             .getX(), entity
/* 708 */             .level()
/* 709 */             .clip(new ClipContext(entity
/* 710 */                 .getEyePosition(1.0F), entity
/* 711 */                 .getEyePosition(1.0F)
/* 712 */                 .add(entity.getViewVector(1.0F)
/* 713 */                   .scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 718 */             .getBlockPos()
/* 719 */             .getY(), entity
/* 720 */             .level()
/* 721 */             .clip(new ClipContext(entity
/* 722 */                 .getEyePosition(1.0F), entity
/* 723 */                 .getEyePosition(1.0F)
/* 724 */                 .add(entity.getViewVector(1.0F)
/* 725 */                   .scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 730 */             .getBlockPos()
/* 731 */             .getZ(), _ent
/* 732 */             .getYRot(), _ent
/* 733 */             .getXRot());
/*     */       } 
/*     */     } 
/*     */     
/* 737 */     if (TBSConfigs.COMMON != null && !TBSConfigs.COMMON.disableBlockBreaking && 
/* 738 */       Math.random() < 0.5D) {
/* 739 */       if (Math.random() < 0.5D) {
/* 740 */         world.setBlock(
/* 741 */             BlockPos.containing(x + 
/*     */               
/* 743 */               Mth.nextInt(
/* 744 */                 RandomSource.create(), 0, 2), y + 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 749 */               Mth.nextInt(
/* 750 */                 RandomSource.create(), 0, 3), z + 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 755 */               Mth.nextInt(
/* 756 */                 RandomSource.create(), 0, 2)), Blocks.AIR
/*     */ 
/*     */ 
/*     */             
/* 760 */             .defaultBlockState(), 3);
/*     */       } else {
/*     */         
/* 763 */         world.setBlock(
/* 764 */             BlockPos.containing(x - 
/*     */               
/* 766 */               Mth.nextInt(
/* 767 */                 RandomSource.create(), 0, 2), y + 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 772 */               Mth.nextInt(
/* 773 */                 RandomSource.create(), 0, 3), z - 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 778 */               Mth.nextInt(
/* 779 */                 RandomSource.create(), 0, 2)), Blocks.AIR
/*     */ 
/*     */ 
/*     */             
/* 783 */             .defaultBlockState(), 3);
/*     */       } 
/*     */     }
/*     */     
/* 787 */     int horizontalRadiusSquare = 2;
/* 788 */     int verticalRadiusSquare = 2, yIterationsSquare = verticalRadiusSquare;
/* 789 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 790 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 791 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/* 792 */           if (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))
/*     */ 
/*     */ 
/*     */             
/* 796 */             .getBlock() == Blocks.WATER) {
/* 797 */             world.setBlock(
/* 798 */                 BlockPos.containing(x + xi, y + i, z + zi), Blocks.MOSSY_COBBLESTONE
/*     */ 
/*     */ 
/*     */                 
/* 802 */                 .defaultBlockState(), 3);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/* 807 */     if (world instanceof ServerLevel) { ServerLevel _level2 = (ServerLevel)world;
/* 808 */       _level2.getServer()
/* 809 */         .getCommands()
/* 810 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level2, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 818 */             (Component)Component.literal(""), _level2
/* 819 */             .getServer(), null))
/*     */           
/* 821 */           .withSuppressedOutput(), "gamemode survival @a"); }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NulllPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */