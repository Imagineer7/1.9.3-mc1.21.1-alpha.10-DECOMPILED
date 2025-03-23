/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NullIsHereOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  33 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  36 */     double randomtitle = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  46 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 999.0D, 999.0D, 999.0D), e -> true).isEmpty()) {
/*     */ 
/*     */ 
/*     */       
/*  50 */       if (entity instanceof Mob) {
/*  51 */         Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  66 */         Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*  67 */         if (entity2 instanceof LivingEntity) { LivingEntity _ent2 = (LivingEntity)entity2;
/*  68 */           _entity.setTarget(_ent2); }
/*     */       
/*     */       } 
/*  71 */       if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
/*  72 */         Entity _ent = entity;
/*  73 */         _ent.teleportTo(x, y + 1.0D, z);
/*  74 */         if (_ent instanceof ServerPlayer) {
/*  75 */           ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*  76 */           _serverPlayer.connection.teleport(x, y + 1.0D, z, _ent.getYRot(), _ent.getXRot());
/*     */         } 
/*     */       } 
/*  79 */       if (world instanceof ServerLevel) {
/*  80 */         ServerLevel serverLevel = (ServerLevel)world;
/*  81 */         serverLevel.getServer()
/*  82 */           .getCommands()
/*  83 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  91 */               (Component)Component.literal(""), serverLevel
/*  92 */               .getServer(), null))
/*     */             
/*  94 */             .withSuppressedOutput(), "gamemode survival @a");
/*     */       } 
/*     */       
/*  97 */       entity.getPersistentData().putDouble("timer", entity.getPersistentData().getDouble("timer") + 1.0D);
/*  98 */       if (entity.getPersistentData().getDouble("timer") == 15.0D) {
/*  99 */         entity.getPersistentData().putDouble("timer", 0.0D);
/* 100 */         Entity _ent = entity;
/* 101 */         _ent.teleportTo(entity
/* 102 */             .level()
/* 103 */             .clip(new ClipContext(entity
/* 104 */                 .getEyePosition(1.0F), entity
/* 105 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 110 */             .getBlockPos()
/* 111 */             .getX(), y, entity
/*     */             
/* 113 */             .level()
/* 114 */             .clip(new ClipContext(entity
/* 115 */                 .getEyePosition(1.0F), entity
/* 116 */                 .getEyePosition(1.0F)
/* 117 */                 .add(entity.getViewVector(1.0F).scale(10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 122 */             .getBlockPos()
/* 123 */             .getZ());
/*     */         
/* 125 */         if (_ent instanceof ServerPlayer) {
/* 126 */           ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 127 */           _serverPlayer.connection.teleport(entity
/* 128 */               .level()
/* 129 */               .clip(new ClipContext(entity
/* 130 */                   .getEyePosition(1.0F), entity
/* 131 */                   .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 136 */               .getBlockPos()
/* 137 */               .getX(), y, entity
/*     */               
/* 139 */               .level()
/* 140 */               .clip(new ClipContext(entity
/* 141 */                   .getEyePosition(1.0F), entity
/* 142 */                   .getEyePosition(1.0F)
/* 143 */                   .add(entity.getViewVector(1.0F).scale(10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 148 */               .getBlockPos()
/* 149 */               .getZ(), _ent
/* 150 */               .getYRot(), _ent
/* 151 */               .getXRot());
/*     */         } 
/*     */         Mob _entity;
/* 154 */         if (entity instanceof LivingEntity && !(_entity = (Mob)entity).level().isClientSide()) {
/* 155 */           _entity.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, 10, 1, false, false));
/*     */         }
/*     */       } 
/* 158 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/* 160 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 162 */               AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 169 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 172 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 178 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 180 */               AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 187 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 190 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 196 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + 1.0D, ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 198 */               AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 205 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 208 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 214 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*     */ 
/*     */       
/* 217 */       if (Math.random() < 0.1D) {
/* 218 */         Entity _ent = entity;
/* 219 */         _ent.teleportTo(x, ((Player)world
/* 220 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 222 */               AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 229 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 232 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 234 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), z);
/*     */         
/* 236 */         if (_ent instanceof ServerPlayer) {
/* 237 */           ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 238 */           _serverPlayer.connection.teleport(x, ((Player)world
/* 239 */               .getEntitiesOfClass(Player.class, 
/*     */                 
/* 241 */                 AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 248 */               .stream().sorted((new Object()
/*     */                 {
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 251 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/* 257 */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), z, _ent.getYRot(), _ent.getXRot());
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 262 */     if (Math.random() < 0.5D) {
/* 263 */       randomtitle = Mth.nextInt(RandomSource.create(), 1, 16);
/* 264 */       if (randomtitle == 1.0D && world instanceof ServerLevel) {
/* 265 */         ServerLevel serverLevel = (ServerLevel)world;
/* 266 */         serverLevel.getServer()
/* 267 */           .getCommands()
/* 268 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 276 */               (Component)Component.literal(""), serverLevel
/* 277 */               .getServer(), null))
/*     */             
/* 279 */             .withSuppressedOutput(), "title @a title {\"text\":\"You know nothing\",\"color\":\"white\"}");
/*     */       } 
/*     */ 
/*     */       
/* 283 */       if (randomtitle == 2.0D && world instanceof ServerLevel) {
/* 284 */         ServerLevel serverLevel = (ServerLevel)world;
/* 285 */         serverLevel.getServer()
/* 286 */           .getCommands()
/* 287 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 295 */               (Component)Component.literal(""), serverLevel
/* 296 */               .getServer(), null))
/*     */             
/* 298 */             .withSuppressedOutput(), "title @a title {\"text\":\"Worship me\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 301 */       if (randomtitle == 3.0D && world instanceof ServerLevel) {
/* 302 */         ServerLevel serverLevel = (ServerLevel)world;
/* 303 */         serverLevel.getServer()
/* 304 */           .getCommands()
/* 305 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 313 */               (Component)Component.literal(""), serverLevel
/* 314 */               .getServer(), null))
/*     */             
/* 316 */             .withSuppressedOutput(), "title @a title {\"text\":\"Follow me\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 319 */       if (randomtitle == 4.0D && world instanceof ServerLevel) {
/* 320 */         ServerLevel serverLevel = (ServerLevel)world;
/* 321 */         serverLevel.getServer()
/* 322 */           .getCommands()
/* 323 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 331 */               (Component)Component.literal(""), serverLevel
/* 332 */               .getServer(), null))
/*     */             
/* 334 */             .withSuppressedOutput(), "title @a title {\"text\":\"Join us\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 337 */       if (randomtitle == 5.0D && world instanceof ServerLevel) {
/* 338 */         ServerLevel serverLevel = (ServerLevel)world;
/* 339 */         serverLevel.getServer()
/* 340 */           .getCommands()
/* 341 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 349 */               (Component)Component.literal(""), serverLevel
/* 350 */               .getServer(), null))
/*     */             
/* 352 */             .withSuppressedOutput(), "title @a title {\"text\":\"Corrupted\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 355 */       if (randomtitle == 6.0D && world instanceof ServerLevel) {
/* 356 */         ServerLevel serverLevel = (ServerLevel)world;
/* 357 */         serverLevel.getServer()
/* 358 */           .getCommands()
/* 359 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 367 */               (Component)Component.literal(""), serverLevel
/* 368 */               .getServer(), null))
/*     */             
/* 370 */             .withSuppressedOutput(), "title @a title {\"text\":\"Go away\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 373 */       if (randomtitle == 7.0D && world instanceof ServerLevel) {
/* 374 */         ServerLevel serverLevel = (ServerLevel)world;
/* 375 */         serverLevel.getServer()
/* 376 */           .getCommands()
/* 377 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 385 */               (Component)Component.literal(""), serverLevel
/* 386 */               .getServer(), null))
/*     */             
/* 388 */             .withSuppressedOutput(), "title @a title {\"text\":\"Null\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 391 */       if (randomtitle == 8.0D && world instanceof ServerLevel) {
/* 392 */         ServerLevel serverLevel = (ServerLevel)world;
/* 393 */         serverLevel.getServer()
/* 394 */           .getCommands()
/* 395 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 403 */               (Component)Component.literal(""), serverLevel
/* 404 */               .getServer(), null))
/*     */             
/* 406 */             .withSuppressedOutput(), "title @a title {\"text\":\"We can hear you\",\"color\":\"white\"}");
/*     */       } 
/*     */ 
/*     */       
/* 410 */       if (randomtitle == 9.0D && world instanceof ServerLevel) {
/* 411 */         ServerLevel serverLevel = (ServerLevel)world;
/* 412 */         serverLevel.getServer()
/* 413 */           .getCommands()
/* 414 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 422 */               (Component)Component.literal(""), serverLevel
/* 423 */               .getServer(), null))
/*     */             
/* 425 */             .withSuppressedOutput(), "title @a title {\"text\":\"Can you see me?\",\"color\":\"white\"}");
/*     */       } 
/*     */ 
/*     */       
/* 429 */       if (randomtitle == 10.0D && world instanceof ServerLevel) {
/* 430 */         ServerLevel serverLevel = (ServerLevel)world;
/* 431 */         serverLevel.getServer()
/* 432 */           .getCommands()
/* 433 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 441 */               (Component)Component.literal(""), serverLevel
/* 442 */               .getServer(), null))
/*     */             
/* 444 */             .withSuppressedOutput(), "title @a title {\"text\":\"0\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 447 */       if (randomtitle == 11.0D && world instanceof ServerLevel) {
/* 448 */         ServerLevel serverLevel = (ServerLevel)world;
/* 449 */         serverLevel.getServer()
/* 450 */           .getCommands()
/* 451 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 459 */               (Component)Component.literal(""), serverLevel
/* 460 */               .getServer(), null))
/*     */             
/* 462 */             .withSuppressedOutput(), "title @a title {\"text\":\"Behind you\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 465 */       if (randomtitle == 12.0D && world instanceof ServerLevel) {
/* 466 */         ServerLevel serverLevel = (ServerLevel)world;
/* 467 */         serverLevel.getServer()
/* 468 */           .getCommands()
/* 469 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 477 */               (Component)Component.literal(""), serverLevel
/* 478 */               .getServer(), null))
/*     */             
/* 480 */             .withSuppressedOutput(), "title @a title {\"text\":\"Help me\",\"color\":\"white\"}");
/*     */       } 
/*     */       
/* 483 */       if (randomtitle == 13.0D && world instanceof ServerLevel) {
/* 484 */         ServerLevel serverLevel = (ServerLevel)world;
/* 485 */         serverLevel.getServer()
/* 486 */           .getCommands()
/* 487 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 495 */               (Component)Component.literal(""), serverLevel
/* 496 */               .getServer(), null))
/*     */             
/* 498 */             .withSuppressedOutput(), "title @a title {\"text\":\"Nothing can be changed\",\"color\":\"white\"}");
/*     */       } 
/*     */ 
/*     */       
/* 502 */       if (randomtitle == 14.0D && world instanceof ServerLevel) {
/* 503 */         ServerLevel serverLevel = (ServerLevel)world;
/* 504 */         serverLevel.getServer()
/* 505 */           .getCommands()
/* 506 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 514 */               (Component)Component.literal(""), serverLevel
/* 515 */               .getServer(), null))
/*     */             
/* 517 */             .withSuppressedOutput(), "title @a title {\"text\":\"Nothing can be changed\",\"color\":\"white\"}");
/*     */       } 
/*     */ 
/*     */       
/* 521 */       if (randomtitle == 15.0D && world instanceof ServerLevel) {
/* 522 */         ServerLevel serverLevel = (ServerLevel)world;
/* 523 */         serverLevel.getServer()
/* 524 */           .getCommands()
/* 525 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 533 */               (Component)Component.literal(""), serverLevel
/* 534 */               .getServer(), null))
/*     */             
/* 536 */             .withSuppressedOutput(), "title @a title {\"text\":\"Close your eyes\",\"color\":\"white\"}");
/*     */       } 
/*     */ 
/*     */       
/* 540 */       if (randomtitle == 16.0D && world instanceof ServerLevel) {
/* 541 */         ServerLevel serverLevel = (ServerLevel)world;
/* 542 */         serverLevel.getServer()
/* 543 */           .getCommands()
/* 544 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 552 */               (Component)Component.literal(""), serverLevel
/* 553 */               .getServer(), null))
/*     */             
/* 555 */             .withSuppressedOutput(), "title @a title {\"text\":\"One of us\",\"color\":\"white\"}");
/*     */       } 
/*     */     } 
/*     */     
/* 559 */     if (world instanceof Level) {
/* 560 */       Level _level = (Level)world;
/* 561 */       if (!_level.isClientSide()) {
/* 562 */         _level.playSound(null, 
/*     */             
/* 564 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 565 */             .get(TBSConstants.id("nullishereloop")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/* 571 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */             
/* 575 */             .get(TBSConstants.id("nullishereloop")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullIsHereOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */