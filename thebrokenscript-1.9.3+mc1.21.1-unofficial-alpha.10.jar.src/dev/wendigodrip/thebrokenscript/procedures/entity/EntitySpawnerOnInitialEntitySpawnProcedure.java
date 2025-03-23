/*     */ package dev.wendigodrip.thebrokenscript.procedures.entity;
/*     */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/entity/EntitySpawnerOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class EntitySpawnerOnInitialEntitySpawnProcedure {
/*     */   @JvmStatic
/*     */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/*  18 */     Intrinsics.checkNotNullParameter(world, "world"); if (entity == null) {
/*     */       return;
/*     */     }
/*     */     
/*  22 */     double randomentity = 0.0D;
/*     */ 
/*     */     
/*  25 */     Intrinsics.checkNotNull(TBSConfigs.COMMON); if (world.dimensionType().moonPhase(world.dayTime()) != 1 && TBSConfigs.COMMON != null && !TBSConfigs.COMMON.disableSpawningEntities)
/*     */     {
/*  27 */       if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
/*  28 */         if (Math.random() < 0.95D) {
/*  29 */           if (!entity.level().isClientSide()) {
/*  30 */             entity.discard();
/*     */           }
/*  32 */         } else if (!MapVariables.Companion.get(world).getHasSpawnedEntity()) {
/*  33 */           Entity entityToSpawn = null;
/*  34 */           ServerLevel _level = null;
/*  35 */           MapVariables.Companion.get(world).setHasSpawnedEntity(true);
/*  36 */           MapVariables.Companion.get(world).syncData(world);
/*  37 */           randomentity = Mth.nextInt(RandomSource.create(), 1, 12);
/*  38 */           if (((randomentity == 1.0D)) && world instanceof ServerLevel) {
/*  39 */             _level = (ServerLevel)world;
/*  40 */             Intrinsics.checkNotNull(TBSEntities.NULL_FLYING.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.NULL_FLYING.get()).spawn(
/*  41 */                 _level, 
/*  42 */                 BlockPos.containing(x, y, z), 
/*  43 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/*  45 */             if (entityToSpawn != null) {
/*  46 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/*  49 */           if (((randomentity == 2.0D)) && world instanceof ServerLevel) {
/*  50 */             _level = (ServerLevel)world;
/*  51 */             Intrinsics.checkNotNull(TBSEntities.NULL_WATCHING.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.NULL_WATCHING.get()).spawn(
/*  52 */                 _level, 
/*  53 */                 BlockPos.containing(
/*  54 */                   x, 
/*  55 */                   y, 
/*  56 */                   z), 
/*     */                 
/*  58 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/*  60 */             if (entityToSpawn != null) {
/*  61 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/*  64 */           if (((randomentity == 2.0D)) && world instanceof ServerLevel) {
/*  65 */             _level = (ServerLevel)world;
/*  66 */             Intrinsics.checkNotNull(TBSEntities.SILUET.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.SILUET.get()).spawn(
/*  67 */                 _level, 
/*  68 */                 BlockPos.containing(x, y, z), 
/*  69 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/*  71 */             if (entityToSpawn != null) {
/*  72 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/*  75 */           if (((randomentity == 3.0D)) && world instanceof ServerLevel) {
/*  76 */             _level = (ServerLevel)world;
/*  77 */             Intrinsics.checkNotNull(TBSEntities.SILUET_STARE.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.SILUET_STARE.get()).spawn(
/*  78 */                 _level, 
/*  79 */                 BlockPos.containing(
/*  80 */                   x, 
/*  81 */                   y, 
/*  82 */                   z), 
/*     */                 
/*  84 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/*  86 */             if (entityToSpawn != null) {
/*  87 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/*  90 */           if (((randomentity == 4.0D)) && world instanceof ServerLevel) {
/*  91 */             _level = (ServerLevel)world;
/*  92 */             Intrinsics.checkNotNull(TBSEntities.DECEIVER.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.DECEIVER.get()).spawn(
/*  93 */                 _level, 
/*  94 */                 BlockPos.containing(x, y, z), 
/*  95 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/*  97 */             if (entityToSpawn != null) {
/*  98 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 101 */           if (((randomentity == 5.0D)) && world instanceof ServerLevel) {
/* 102 */             _level = (ServerLevel)world;
/* 103 */             Intrinsics.checkNotNull(TBSEntities.FOLLOW.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.FOLLOW.get()).spawn(
/* 104 */                 _level, 
/* 105 */                 BlockPos.containing(x, y, z), 
/* 106 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/* 108 */             if (entityToSpawn != null) {
/* 109 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 112 */           if (((randomentity == 6.0D)) && world instanceof ServerLevel) {
/* 113 */             _level = (ServerLevel)world;
/* 114 */             Intrinsics.checkNotNull(TBSEntities.HE.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.HE.get()).spawn(
/* 115 */                 _level, 
/* 116 */                 BlockPos.containing(x, y, z), 
/* 117 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/* 119 */             if (entityToSpawn != null) {
/* 120 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 123 */           if (((randomentity == 7.0D)) && world instanceof ServerLevel) {
/* 124 */             _level = (ServerLevel)world;
/* 125 */             Intrinsics.checkNotNull(TBSEntities.FARAWAY.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.FARAWAY.get()).spawn(
/* 126 */                 _level, 
/* 127 */                 BlockPos.containing(x, y, z), 
/* 128 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/* 130 */             if (entityToSpawn != null) {
/* 131 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 134 */           if (((randomentity == 8.0D)) && world instanceof ServerLevel) {
/* 135 */             _level = (ServerLevel)world;
/* 136 */             Intrinsics.checkNotNull(TBSEntities.NOTHINGISWATCHING.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.NOTHINGISWATCHING.get()).spawn(
/* 137 */                 _level, 
/* 138 */                 BlockPos.containing(
/* 139 */                   x, 
/* 140 */                   y, 
/* 141 */                   z), 
/*     */                 
/* 143 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/* 145 */             if (entityToSpawn != null) {
/* 146 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 149 */           if (((randomentity == 9.0D)) && world instanceof ServerLevel) {
/* 150 */             _level = (ServerLevel)world;
/* 151 */             Intrinsics.checkNotNull(TBSEntities.CIRCUIT_DISGUISED_AS_CREEPER.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.CIRCUIT_DISGUISED_AS_CREEPER.get()).spawn(
/* 152 */                 _level, 
/* 153 */                 BlockPos.containing(
/* 154 */                   x, 
/* 155 */                   y, 
/* 156 */                   z), 
/*     */                 
/* 158 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/* 160 */             if (entityToSpawn != null) {
/* 161 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 164 */           if (((randomentity == 10.0D)) && world instanceof ServerLevel) {
/* 165 */             _level = (ServerLevel)world;
/* 166 */             Intrinsics.checkNotNull(TBSEntities.PIG_CIRCUIT.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.PIG_CIRCUIT.get()).spawn(
/* 167 */                 _level, 
/* 168 */                 BlockPos.containing(x, y, z), 
/* 169 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/* 171 */             if (entityToSpawn != null) {
/* 172 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 175 */           if (((randomentity == 11.0D)) && world instanceof ServerLevel) {
/* 176 */             _level = (ServerLevel)world;
/* 177 */             Intrinsics.checkNotNull(TBSEntities.HETZER.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.HETZER.get()).spawn(
/* 178 */                 _level, 
/* 179 */                 BlockPos.containing(x, y, z), 
/* 180 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/* 182 */             if (entityToSpawn != null) {
/* 183 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 186 */           if (((randomentity == 12.0D)) && ((MapVariables.Companion.get(world).getMoonPhase() == 2.0D)) && 
/* 187 */             world instanceof ServerLevel) {
/*     */             
/* 189 */             _level = (ServerLevel)world;
/* 190 */             Intrinsics.checkNotNull(TBSEntities.THE_BROKEN_END_OVERHAUL_STALK.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.THE_BROKEN_END_OVERHAUL_STALK.get()).spawn(
/* 191 */                 _level, 
/* 192 */                 BlockPos.containing(
/* 193 */                   x, 
/* 194 */                   y, 
/* 195 */                   z), 
/*     */                 
/* 197 */                 MobSpawnType.MOB_SUMMONED);
/*     */             
/* 199 */             if (entityToSpawn != null) {
/* 200 */               entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 203 */           if (!entity.level().isClientSide()) {
/* 204 */             entity.discard();
/*     */           }
/* 206 */         } else if (!entity.level().isClientSide()) {
/* 207 */           entity.discard();
/*     */         } 
/* 209 */       } else if (!entity.level().isClientSide()) {
/* 210 */         entity.discard();
/*     */       }  } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final EntitySpawnerOnInitialEntitySpawnProcedure INSTANCE = new EntitySpawnerOnInitialEntitySpawnProcedure();
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\entity\EntitySpawnerOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */