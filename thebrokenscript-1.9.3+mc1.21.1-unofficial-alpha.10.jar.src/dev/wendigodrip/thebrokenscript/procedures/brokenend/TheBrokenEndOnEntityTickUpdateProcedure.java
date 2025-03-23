/*     */ package dev.wendigodrip.thebrokenscript.procedures.brokenend;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import dev.wendigodrip.thebrokenscript.util.TimeOfDay;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
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
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class TheBrokenEndOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  46 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  49 */     double heights = 0.0D;
/*  50 */     if (world instanceof ServerLevel) {
/*  51 */       ServerLevel _level = (ServerLevel)world;
/*  52 */       _level.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  60 */             (Component)Component.literal(""), _level
/*  61 */             .getServer(), null))
/*     */           
/*  63 */           .withSuppressedOutput(), "gamemode survival @a");
/*     */     } 
/*     */     
/*  66 */     heights = y + Mth.nextInt(RandomSource.create(), 1, 8);
/*  67 */     entity.getPersistentData().putDouble("a", entity.getPersistentData().getDouble("a") + 1.0D);
/*     */     
/*  69 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1450.0D, 1450.0D, 1450.0D), e -> true).isEmpty() && entity instanceof Mob) { Mob mob = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  83 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1500.0D, 1500.0D, 1500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*  84 */       if (entity2 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity2;
/*  85 */         mob.setTarget(_ent); }
/*     */        }
/*     */     
/*  88 */     if (world.getBlockState(BlockPos.containing(x + 1.0D, heights, z))
/*  89 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/*  90 */       BlockPos _pos = BlockPos.containing(x + 1.0D, heights, z);
/*  91 */       Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 1.0D, heights, z), null);
/*  92 */       world.destroyBlock(_pos, false);
/*     */     } 
/*  94 */     if (world.getBlockState(BlockPos.containing(x - 1.0D, heights, z))
/*  95 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/*  96 */       BlockPos _pos = BlockPos.containing(x - 1.0D, heights, z);
/*  97 */       Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x - 1.0D, heights, z), null);
/*  98 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 100 */     if (world.getBlockState(BlockPos.containing(x, heights, z + 1.0D))
/* 101 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 102 */       BlockPos _pos = BlockPos.containing(x, heights, z + 1.0D);
/* 103 */       Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, heights, z + 1.0D), null);
/* 104 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 106 */     if (world.getBlockState(BlockPos.containing(x, heights, z - 1.0D))
/* 107 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 108 */       BlockPos _pos = BlockPos.containing(x, heights, z - 1.0D);
/* 109 */       Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, heights, z - 1.0D), null);
/* 110 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 112 */     if (entity.getPersistentData().getDouble("a") > 100.0D) {
/* 113 */       entity.getPersistentData().putDouble("a", 0.0D);
/* 114 */       if (world instanceof Level) { Level lv = (Level)world;
/* 115 */         if (!lv.isClientSide()) {
/* 116 */           lv.playSound(null, 
/*     */               
/* 118 */               BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 119 */               .get(TBSConstants.id("theendisnear")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 125 */           lv.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */               
/* 129 */               .get(TBSConstants.id("theendisnear")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */         }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 137 */       if (Math.random() < 0.7D) {
/* 138 */         ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 140 */             AABB.ofSize(new Vec3(x, y, z), 1500.0D, 1500.0D, 1500.0D), e -> true)
/*     */ 
/*     */           
/* 143 */           .stream()
/* 144 */           .sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 147 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 149 */             }).compareDistOf(x, y, z))
/* 150 */           .findFirst()
/* 151 */           .orElse(null))
/* 152 */           .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 5.0D, z));
/*     */       }
/* 154 */       if (Math.random() < 0.7D) {
/* 155 */         if (world instanceof ServerLevel) {
/* 156 */           TimeOfDay.MIDNIGHT.set(world);
/*     */         }
/* 158 */         if (world instanceof ServerLevel) {
/* 159 */           ServerLevel _level = (ServerLevel)world;
/* 160 */           Entity entityToSpawn = ((EntityType)TBSEntities.JFRAME_1ENTITY.get()).spawn(_level, 
/*     */               
/* 162 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */           
/* 165 */           if (entityToSpawn != null) {
/* 166 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           }
/*     */         } 
/*     */       } 
/* 170 */       if (Math.random() < 0.7D) {
/* 171 */         if (world instanceof ServerLevel) {
/* 172 */           TimeOfDay.DAY.set(world);
/*     */         }
/* 174 */         if (world instanceof ServerLevel) {
/* 175 */           ServerLevel _level = (ServerLevel)world;
/* 176 */           Entity entityToSpawn = ((EntityType)TBSEntities.JFRAME_2ENTITY.get()).spawn(_level, 
/*     */               
/* 178 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */           
/* 181 */           if (entityToSpawn != null) {
/* 182 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           }
/*     */         } 
/*     */       } 
/* 186 */       if (Math.random() < 0.7D) {
/* 187 */         if (world instanceof ServerLevel) {
/* 188 */           TimeOfDay.DAY.set(world);
/*     */         }
/* 190 */         if (world instanceof ServerLevel) {
/* 191 */           ServerLevel _level = (ServerLevel)world;
/* 192 */           Entity entityToSpawn = ((EntityType)TBSEntities.WE_CAN_HEAR_U_OVERLAY.get()).spawn(_level, 
/*     */               
/* 194 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 201 */           if (entityToSpawn != null) {
/* 202 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           }
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 208 */     if (!world.getEntitiesOfClass(IronGolem.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 209 */       ((IronGolem)world.getEntitiesOfClass(IronGolem.class, AABB.ofSize(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true)
/* 210 */         .stream()
/* 211 */         .sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 214 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/* 216 */           }).compareDistOf(x, y, z))
/* 217 */         .findFirst()
/* 218 */         .orElse(null))
/* 219 */         .hurt(new DamageSource((Holder)world
/* 220 */             .registryAccess()
/* 221 */             .registryOrThrow(Registries.DAMAGE_TYPE)
/* 222 */             .getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 30.0F);
/*     */     }
/*     */ 
/*     */     
/* 226 */     if (!world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 227 */       ((Boat)world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 30.0D, 30.0D, 30.0D), e -> true)
/* 228 */         .stream()
/* 229 */         .sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 232 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/* 234 */           }).compareDistOf(x, y, z))
/* 235 */         .findFirst()
/* 236 */         .orElse(null))
/* 237 */         .hurt(new DamageSource((Holder)world
/* 238 */             .registryAccess()
/* 239 */             .registryOrThrow(Registries.DAMAGE_TYPE)
/* 240 */             .getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 30.0F);
/*     */     }
/*     */     
/* 243 */     entity.getPersistentData()
/* 244 */       .putDouble("interferences", entity.getPersistentData().getDouble("interferences") + 1.0D);
/* 245 */     if (entity.getPersistentData().getDouble("interferences") == 3.0D && world instanceof ServerLevel) {
/* 246 */       ServerLevel _level = (ServerLevel)world;
/* 247 */       Entity entityToSpawn = ((EntityType)TBSEntities.DOTSFRAME_1.get()).spawn(_level, 
/*     */           
/* 249 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */       
/* 252 */       if (entityToSpawn != null) {
/* 253 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/* 256 */     if (entity.getPersistentData().getDouble("interferences") == 6.0D && world instanceof ServerLevel) {
/* 257 */       ServerLevel _level = (ServerLevel)world;
/* 258 */       Entity entityToSpawn = ((EntityType)TBSEntities.DOTSFRAME_2.get()).spawn(_level, 
/*     */           
/* 260 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */       
/* 263 */       if (entityToSpawn != null) {
/* 264 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/* 267 */     if (entity.getPersistentData().getDouble("interferences") == 9.0D && world instanceof ServerLevel) {
/* 268 */       ServerLevel _level = (ServerLevel)world;
/* 269 */       Entity entityToSpawn = ((EntityType)TBSEntities.DOTSFRAME_3.get()).spawn(_level, 
/*     */           
/* 271 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */       
/* 274 */       if (entityToSpawn != null) {
/* 275 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/* 278 */     if (entity.getPersistentData().getDouble("interferences") == 12.0D) {
/* 279 */       if (world instanceof ServerLevel) {
/* 280 */         ServerLevel _level = (ServerLevel)world;
/* 281 */         Entity entityToSpawn = ((EntityType)TBSEntities.DOTSFRAME_4.get()).spawn(_level, 
/*     */             
/* 283 */             BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */         
/* 286 */         if (entityToSpawn != null) {
/* 287 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */         }
/*     */       } 
/* 290 */       entity.getPersistentData().putDouble("interferences", 0.0D);
/*     */     } 
/* 292 */     if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
/* 293 */       Entity _ent = entity;
/* 294 */       _ent.teleportTo(x, y + 1.0D, z);
/* 295 */       if (_ent instanceof ServerPlayer) {
/* 296 */         ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 297 */         _serverPlayer.connection.teleport(x, y + 1.0D, z, _ent.getYRot(), _ent.getXRot());
/*     */       } 
/*     */     } 
/*     */     
/* 301 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty()) {
/* 302 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/* 304 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 306 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*     */ 
/*     */             
/* 309 */             .stream()
/* 310 */             .sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 313 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 319 */               }).compareDistOf(x, y, z))
/* 320 */             .findFirst()
/* 321 */             .orElse(null))
/* 322 */             .getX(), ((Player)world
/* 323 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 325 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*     */ 
/*     */             
/* 328 */             .stream()
/* 329 */             .sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 332 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 338 */               }).compareDistOf(x, y, z))
/* 339 */             .findFirst()
/* 340 */             .orElse(null))
/* 341 */             .getY() + 1.0D, ((Player)world
/* 342 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 344 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*     */ 
/*     */             
/* 347 */             .stream()
/* 348 */             .sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 351 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 357 */               }).compareDistOf(x, y, z))
/* 358 */             .findFirst()
/* 359 */             .orElse(null))
/* 360 */             .getZ()));
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 365 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 379 */       Player pl = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 380 */       if (pl != null && !pl.level().isClientSide()) {
/* 381 */         pl.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 10, 1, false, false));
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
/* 397 */       if ((pl = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)) != null && 
/* 398 */         !pl.level().isClientSide()) {
/* 399 */         pl.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 10, 1, false, false));
/*     */       }
/*     */     } 
/* 402 */     int horizontalRadiusSquare = 9;
/* 403 */     int verticalRadiusSquare = 9, yIterationsSquare = verticalRadiusSquare;
/* 404 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 405 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 406 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/* 407 */           if (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))
/* 408 */             .is(BlockTags.create(ResourceLocation.parse("minecraft:water"))))
/* 409 */             world.setBlock(
/* 410 */                 BlockPos.containing(x + xi, y + i, z + zi), Blocks.COBBLESTONE
/* 411 */                 .defaultBlockState(), 3); 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\brokenend\TheBrokenEndOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */