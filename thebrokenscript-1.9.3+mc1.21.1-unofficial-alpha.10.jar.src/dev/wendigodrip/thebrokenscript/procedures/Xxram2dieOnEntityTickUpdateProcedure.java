/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
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
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Xxram2dieOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  29 */     if (entity == null)
/*     */       return; 
/*     */     Level _lvl0;
/*  32 */     if (world instanceof Level && (_lvl0 = (Level)world).isDay() && !entity.level().isClientSide()) {
/*  33 */       entity.discard();
/*     */     }
/*  35 */     if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
/*  36 */       Entity _ent = entity;
/*  37 */       _ent.teleportTo(x, y + 1.0D, z);
/*  38 */       if (_ent instanceof ServerPlayer) { ServerPlayer sp = (ServerPlayer)_ent;
/*  39 */         sp = (ServerPlayer)_ent;
/*  40 */         sp.connection.teleport(x, y + 1.0D, z, _ent.getYRot(), _ent.getXRot()); }
/*     */     
/*     */     } 
/*     */     
/*  44 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/*  45 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/*  47 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  49 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*     */ 
/*     */             
/*  52 */             .stream()
/*  53 */             .sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  56 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  62 */               }).compareDistOf(x, y, z))
/*  63 */             .findFirst()
/*  64 */             .orElse(null))
/*  65 */             .getX(), ((Player)world
/*  66 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  68 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*     */ 
/*     */             
/*  71 */             .stream()
/*  72 */             .sorted((new Object()
/*     */               {
/*     */ 
/*     */ 
/*     */                 
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                 {
/*  79 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  85 */               }).compareDistOf(x, y, z))
/*  86 */             .findFirst()
/*  87 */             .orElse(null))
/*  88 */             .getY() + 1.0D, ((Player)world
/*  89 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  91 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*     */ 
/*     */             
/*  94 */             .stream()
/*  95 */             .sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  98 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 104 */               }).compareDistOf(x, y, z))
/* 105 */             .findFirst()
/* 106 */             .orElse(null))
/* 107 */             .getZ()));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 112 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/*     */       
/* 114 */       Entity _ent = entity;
/* 115 */       _ent.teleportTo(((Player)world
/* 116 */           .getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/* 117 */           .stream()
/* 118 */           .sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 121 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 123 */             }).compareDistOf(x, y, z))
/* 124 */           .findFirst()
/* 125 */           .orElse(null))
/* 126 */           .level()
/* 127 */           .clip(new ClipContext(((Player)world
/* 128 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 130 */                 AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */               
/* 133 */               .stream()
/* 134 */               .sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 137 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 143 */                 }).compareDistOf(x, y, z))
/* 144 */               .findFirst()
/* 145 */               .orElse(null))
/* 146 */               .getEyePosition(1.0F), ((Player)world
/* 147 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 149 */                 AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */               
/* 152 */               .stream()
/* 153 */               .sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 156 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 162 */                 }).compareDistOf(x, y, z))
/* 163 */               .findFirst()
/* 164 */               .orElse(null))
/* 165 */               .getEyePosition(1.0F)
/* 166 */               .add(((Player)world.getEntitiesOfClass(Player.class, 
/*     */                   
/* 168 */                   AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */                 
/* 171 */                 .stream()
/* 172 */                 .sorted((new Object()
/*     */                   {
/*     */ 
/*     */ 
/*     */                     
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                     {
/* 179 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 185 */                   }).compareDistOf(x, y, z))
/* 186 */                 .findFirst()
/* 187 */                 .orElse(null))
/* 188 */                 .getViewVector(1.0F)
/* 189 */                 .scale(-42.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/*     */ 
/*     */               
/* 192 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 194 */                 AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */               
/* 197 */               .stream()
/* 198 */               .sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 201 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 207 */                 }).compareDistOf(x, y, z))
/* 208 */               .findFirst()
/* 209 */               .orElse(null)))
/*     */           
/* 211 */           .getBlockPos()
/* 212 */           .getX(), y, ((Player)world
/*     */           
/* 214 */           .getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/* 215 */           .stream()
/* 216 */           .sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 219 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 221 */             }).compareDistOf(x, y, z))
/* 222 */           .findFirst()
/* 223 */           .orElse(null))
/* 224 */           .level()
/* 225 */           .clip(new ClipContext(((Player)world
/* 226 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 228 */                 AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */               
/* 231 */               .stream()
/* 232 */               .sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 235 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 241 */                 }).compareDistOf(x, y, z))
/* 242 */               .findFirst()
/* 243 */               .orElse(null))
/* 244 */               .getEyePosition(1.0F), ((Player)world
/* 245 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 247 */                 AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */               
/* 250 */               .stream()
/* 251 */               .sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 254 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 260 */                 }).compareDistOf(x, y, z))
/* 261 */               .findFirst()
/* 262 */               .orElse(null))
/* 263 */               .getEyePosition(1.0F)
/* 264 */               .add(((Player)world.getEntitiesOfClass(Player.class, 
/*     */                   
/* 266 */                   AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */                 
/* 269 */                 .stream()
/* 270 */                 .sorted((new Object()
/*     */                   {
/*     */ 
/*     */ 
/*     */                     
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                     {
/* 277 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 283 */                   }).compareDistOf(x, y, z))
/* 284 */                 .findFirst()
/* 285 */                 .orElse(null))
/* 286 */                 .getViewVector(1.0F)
/* 287 */                 .scale(-42.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/*     */ 
/*     */               
/* 290 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 292 */                 AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */               
/* 295 */               .stream()
/* 296 */               .sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 299 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 305 */                 }).compareDistOf(x, y, z))
/* 306 */               .findFirst()
/* 307 */               .orElse(null)))
/*     */           
/* 309 */           .getBlockPos()
/* 310 */           .getZ());
/*     */       
/* 312 */       if (_ent instanceof ServerPlayer) { ServerPlayer sp = (ServerPlayer)_ent;
/* 313 */         sp = (ServerPlayer)_ent;
/* 314 */         sp.connection.teleport(((Player)world
/* 315 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 317 */               AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */             
/* 320 */             .stream()
/* 321 */             .sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 324 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 326 */               }).compareDistOf(x, y, z))
/* 327 */             .findFirst()
/* 328 */             .orElse(null))
/* 329 */             .level()
/* 330 */             .clip(new ClipContext(((Player)world
/* 331 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 333 */                   AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */                 
/* 335 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 338 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 344 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F), ((Player)world
/* 345 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 347 */                   AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */                 
/* 350 */                 .stream()
/* 351 */                 .sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 354 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 360 */                   }).compareDistOf(x, y, z))
/* 361 */                 .findFirst()
/* 362 */                 .orElse(null))
/* 363 */                 .getEyePosition(1.0F)
/* 364 */                 .add(((Player)world.getEntitiesOfClass(Player.class, 
/*     */                     
/* 366 */                     AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */                   
/* 369 */                   .stream()
/* 370 */                   .sorted((new Object()
/*     */                     {
/*     */ 
/*     */ 
/*     */                       
/*     */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                       {
/* 377 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                       }
/* 383 */                     }).compareDistOf(x, y, z))
/* 384 */                   .findFirst()
/* 385 */                   .orElse(null))
/* 386 */                   .getViewVector(1.0F)
/* 387 */                   .scale(-42.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/*     */ 
/*     */                 
/* 390 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 392 */                   AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */                 
/* 394 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 397 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 403 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)))
/*     */             
/* 405 */             .getBlockPos()
/* 406 */             .getX(), y, ((Player)world
/*     */             
/* 408 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 410 */               AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */             
/* 413 */             .stream()
/* 414 */             .sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 417 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 419 */               }).compareDistOf(x, y, z))
/* 420 */             .findFirst()
/* 421 */             .orElse(null))
/* 422 */             .level()
/* 423 */             .clip(new ClipContext(((Player)world
/* 424 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 426 */                   AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */                 
/* 428 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 431 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 437 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F), ((Player)world
/* 438 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 440 */                   AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */                 
/* 443 */                 .stream()
/* 444 */                 .sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 447 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 453 */                   }).compareDistOf(x, y, z))
/* 454 */                 .findFirst()
/* 455 */                 .orElse(null))
/* 456 */                 .getEyePosition(1.0F)
/* 457 */                 .add(((Player)world.getEntitiesOfClass(Player.class, 
/*     */                     
/* 459 */                     AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */ 
/*     */                   
/* 462 */                   .stream()
/* 463 */                   .sorted((new Object()
/*     */                     {
/*     */ 
/*     */ 
/*     */                       
/*     */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                       {
/* 470 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                       }
/* 476 */                     }).compareDistOf(x, y, z))
/* 477 */                   .findFirst()
/* 478 */                   .orElse(null))
/* 479 */                   .getViewVector(1.0F)
/* 480 */                   .scale(-42.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/*     */ 
/*     */                 
/* 483 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 485 */                   AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true)
/*     */                 
/* 487 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 490 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 496 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)))
/*     */             
/* 498 */             .getBlockPos()
/* 499 */             .getZ(), _ent
/* 500 */             .getYRot(), _ent
/* 501 */             .getXRot()); }
/*     */       
/*     */       LivingEntity _entity;
/* 504 */       if (entity instanceof LivingEntity && !(_entity = (LivingEntity)entity).level().isClientSide()) {
/* 505 */         _entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10, 3, false, false));
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       Player _serverPlayer, player1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 521 */       if (_serverPlayer = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 522 */         !(player1 = _serverPlayer).level().isClientSide()) {
/* 523 */         player1.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 10, 1, false, false));
/*     */       }
/* 525 */       entity.getPersistentData().putDouble("Anger", entity.getPersistentData().getDouble("Anger") + 1.0D);
/* 526 */       if (entity.getPersistentData().getDouble("Anger") != 3.0D)
/* 527 */         if (Math.random() < 0.7D) {
/* 528 */           if (!entity.level().isClientSide()) {
/* 529 */             entity.discard();
/*     */           }
/* 531 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 532 */             Entity entityToSpawn = ((EntityType)TBSEntities.NULLL.get()).spawn(_level, 
/*     */                 
/* 534 */                 BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 541 */             if (entityToSpawn != null) {
/* 542 */               entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */             } }
/*     */         
/*     */         } else {
/* 546 */           if (!entity.level().isClientSide()) {
/* 547 */             entity.discard();
/*     */           }
/* 549 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world; if (TBSConfigs.COMMON != null && 
/*     */               
/* 551 */               !TBSConfigs.COMMON.getDisableBanning()) {
/* 552 */               Entity entityToSpawn = ((EntityType)TBSEntities.BAN.get()).spawn(_level, 
/*     */                   
/* 554 */                   BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */               
/* 557 */               if (entityToSpawn != null)
/* 558 */                 entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F); 
/*     */             }  }
/*     */         
/*     */         }  
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\Xxram2dieOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */