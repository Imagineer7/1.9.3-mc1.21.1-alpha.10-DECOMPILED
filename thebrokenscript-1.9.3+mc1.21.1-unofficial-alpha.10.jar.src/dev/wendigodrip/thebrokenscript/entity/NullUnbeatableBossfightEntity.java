/*     */ package dev.wendigodrip.thebrokenscript.entity;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.server.level.ServerBossEvent;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\020\006\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\002\b\b\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\005\030\000 G2\0020\001:\001GB\037\022\016\020\002\032\n\022\006\022\004\030\0010\0000\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\n\032\0020\0132\006\020\004\032\0020\005H\024J\b\020\f\032\0020\rH\024J\020\020\016\032\0020\0172\006\020\020\032\0020\021H\026J \020\025\032\0020\r2\006\020\026\032\0020\0272\006\020\030\032\0020\0312\006\020\032\032\0020\017H\024J \020\033\032\0020\0172\006\020\034\032\0020\0352\006\020\036\032\0020\0352\006\020\037\032\0020\031H\026J\030\020 \032\0020\0172\006\020!\032\0020\0312\006\020\"\032\0020\035H\026J\006\020#\032\0020\017J\b\020$\032\0020\017H\026J,\020%\032\004\030\0010&2\006\020\004\032\0020'2\006\020(\032\0020)2\006\020*\032\0020+2\b\020,\032\004\030\0010&H\026J \020-\032\0020\r2\006\020.\032\0020/2\006\0200\032\002012\006\020\030\032\0020\031H\026J\b\0202\032\0020\rH\026J\b\0203\032\0020\017H\026J\020\0204\032\0020\r2\006\0205\032\0020/H\024J\b\0206\032\0020\rH\024J\006\0207\032\0020\017J\020\0208\032\0020\r2\006\0209\032\0020:H\026J\020\020;\032\0020\r2\006\0209\032\0020:H\026J\b\020<\032\0020\rH\026J(\020=\032\0020\r2\006\020>\032\0020\0212\006\020?\032\0020\0172\006\020@\032\0020A2\006\020B\032\0020CH\024J\020\020D\032\0020\r2\006\020E\032\0020\017H\026J\b\020F\032\0020\rH\026R\016\020\b\032\0020\tX\004¢\006\002\n\000R\021\020\022\032\0020\0218F¢\006\006\032\004\b\023\020\024¨\006H"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/NullUnbeatableBossfightEntity;", "Lnet/minecraft/world/entity/monster/Monster;", "type", "Lnet/minecraft/world/entity/EntityType;", "world", "Lnet/minecraft/world/level/Level;", "<init>", "(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", "bossInfo", "Lnet/minecraft/server/level/ServerBossEvent;", "createNavigation", "Lnet/minecraft/world/entity/ai/navigation/PathNavigation;", "registerGoals", "", "removeWhenFarAway", "", "distanceToClosestPlayer", "", "myRidingOffset", "getMyRidingOffset", "()D", "dropCustomDeathLoot", "level", "Lnet/minecraft/server/level/ServerLevel;", "damageSource", "Lnet/minecraft/world/damagesource/DamageSource;", "recentlyHit", "causeFallDamage", "l", "", "d", "source", "hurt", "damagesource", "amount", "ignoreExplosion", "fireImmune", "finalizeSpawn", "Lnet/minecraft/world/entity/SpawnGroupData;", "Lnet/minecraft/world/level/ServerLevelAccessor;", "difficulty", "Lnet/minecraft/world/DifficultyInstance;", "reason", "Lnet/minecraft/world/entity/MobSpawnType;", "livingdata", "awardKillScore", "entity", "Lnet/minecraft/world/entity/Entity;", "score", "", "baseTick", "isPushable", "doPush", "entityIn", "pushEntities", "canChangeDimensions", "startSeenByPlayer", "player", "Lnet/minecraft/server/level/ServerPlayer;", "stopSeenByPlayer", "customServerAiStep", "checkFallDamage", "y", "onGroundIn", "state", "Lnet/minecraft/world/level/block/state/BlockState;", "pos", "Lnet/minecraft/core/BlockPos;", "setNoGravity", "ignored", "aiStep", "Companion", "thebrokenscript"})
/*     */ public final class NullUnbeatableBossfightEntity extends Monster {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   
/*     */   public NullUnbeatableBossfightEntity(@NotNull EntityType type, @NotNull Level world) {
/*  33 */     super(type, world);
/*  34 */     this.bossInfo = new ServerBossEvent(
/*  35 */         getDisplayName(), 
/*  36 */         BossEvent.BossBarColor.WHITE, 
/*  37 */         BossEvent.BossBarOverlay.PROGRESS);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  42 */     Intrinsics.checkNotNull(getAttribute(Attributes.STEP_HEIGHT)); getAttribute(Attributes.STEP_HEIGHT).setBaseValue(
/*  43 */         0.6D);
/*  44 */     this.xpReward = 0;
/*  45 */     setNoAi(false);
/*  46 */     setPersistenceRequired();
/*  47 */     this.moveControl = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   } @NotNull
/*     */   private final ServerBossEvent bossInfo; @NotNull
/*     */   protected PathNavigation createNavigation(@NotNull Level world) {
/*  51 */     Intrinsics.checkNotNullParameter(world, "world"); return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */   
/*     */   protected void registerGoals() {
/*  55 */     super.registerGoals();
/*  56 */     this.goalSelector.addGoal(
/*  57 */         1, (Goal)new NullUnbeatableBossfightEntity$registerGoals$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  63 */     this.goalSelector.addGoal(
/*  64 */         2, (Goal)new NullUnbeatableBossfightEntity$registerGoals$2(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  70 */     this.goalSelector.addGoal(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  71 */     this.targetSelector.addGoal(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  72 */     this.goalSelector.addGoal(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  73 */     this.goalSelector.addGoal(6, (Goal)new FloatGoal((Mob)this));
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\b\020\004\032\004\030\0010\005¨\006\006"}, d2 = {"dev/wendigodrip/thebrokenscript/entity/NullUnbeatableBossfightEntity$registerGoals$1", "Lnet/minecraft/world/entity/ai/goal/MeleeAttackGoal;", "getAttackReachSqr", "", "entity", "Lnet/minecraft/world/entity/LivingEntity;", "thebrokenscript"}) public static final class NullUnbeatableBossfightEntity$registerGoals$1 extends MeleeAttackGoal {
/*     */     NullUnbeatableBossfightEntity$registerGoals$1(NullUnbeatableBossfightEntity $receiver) { super((PathfinderMob)$receiver, 1.2D, false); } public final double getAttackReachSqr(LivingEntity entity) { return 16.0D; } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\016\020\002\032\0020\0032\006\020\004\032\0020\005¨\006\006"}, d2 = {"dev/wendigodrip/thebrokenscript/entity/NullUnbeatableBossfightEntity$registerGoals$2", "Lnet/minecraft/world/entity/ai/goal/MeleeAttackGoal;", "getAttackReachSqr", "", "entity", "Lnet/minecraft/world/entity/LivingEntity;", "thebrokenscript"}) public static final class NullUnbeatableBossfightEntity$registerGoals$2 extends MeleeAttackGoal {
/*     */     NullUnbeatableBossfightEntity$registerGoals$2(NullUnbeatableBossfightEntity $receiver) { super((PathfinderMob)$receiver, 1.2D, false); } public final double getAttackReachSqr(LivingEntity entity) { Intrinsics.checkNotNullParameter(entity, "entity"); return (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()); } }
/*  77 */   public boolean removeWhenFarAway(double distanceToClosestPlayer) { return false; }
/*     */ 
/*     */   
/*     */   public final double getMyRidingOffset() {
/*  81 */     return -0.35D;
/*     */   }
/*     */   protected void dropCustomDeathLoot(@NotNull ServerLevel level, @NotNull DamageSource damageSource, boolean recentlyHit) {
/*  84 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(damageSource, "damageSource"); super.dropCustomDeathLoot(level, damageSource, recentlyHit);
/*  85 */     spawnAtLocation(new ItemStack((ItemLike)TBSBlocks.FIELD_GENERATOR.get()));
/*     */   }
/*     */   
/*     */   public boolean causeFallDamage(float l, float d, @NotNull DamageSource source) {
/*  89 */     Intrinsics.checkNotNullParameter(source, "source"); return false;
/*     */   }
/*     */   
/*     */   public boolean hurt(@NotNull DamageSource damagesource, float amount) {
/*  93 */     Intrinsics.checkNotNullParameter(damagesource, "damagesource"); if (damagesource.is(DamageTypes.IN_FIRE)) {
/*  94 */       return false;
/*     */     }
/*  96 */     if (damagesource.is(DamageTypes.FALL)) {
/*  97 */       return false;
/*     */     }
/*  99 */     if (damagesource.is(DamageTypes.CACTUS)) {
/* 100 */       return false;
/*     */     }
/* 102 */     if (damagesource.is(DamageTypes.DROWN)) {
/* 103 */       return false;
/*     */     }
/* 105 */     if (damagesource.is(DamageTypes.LIGHTNING_BOLT)) {
/* 106 */       return false;
/*     */     }
/* 108 */     if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION)) {
/* 109 */       return false;
/*     */     }
/* 111 */     if (damagesource.is(DamageTypes.TRIDENT)) {
/* 112 */       return false;
/*     */     }
/* 114 */     if (damagesource.is(DamageTypes.FALLING_ANVIL)) {
/* 115 */       return false;
/*     */     }
/* 117 */     if (damagesource.is(DamageTypes.DRAGON_BREATH)) {
/* 118 */       return false;
/*     */     }
/* 120 */     if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL)) {
/* 121 */       return false;
/*     */     }
/* 123 */     return super.hurt(damagesource, amount);
/*     */   }
/*     */   
/*     */   public final boolean ignoreExplosion() {
/* 127 */     return true;
/*     */   }
/*     */   
/*     */   public boolean fireImmune() {
/* 131 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor world, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
/* 140 */     Intrinsics.checkNotNullParameter(world, "world"); Intrinsics.checkNotNullParameter(difficulty, "difficulty"); Intrinsics.checkNotNullParameter(reason, "reason"); SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
/* 141 */     NullIsHereOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, (Entity)this);
/* 142 */     return retval;
/*     */   }
/*     */   
/*     */   public void awardKillScore(@NotNull Entity entity, int score, @NotNull DamageSource damageSource) {
/* 146 */     Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(damageSource, "damageSource"); super.awardKillScore(entity, score, damageSource);
/* 147 */     NullIsHereThisEntityKillsAnotherOneProcedure.execute(
/* 148 */         (LevelAccessor)level(), 
/* 149 */         getX(), 
/* 150 */         getY(), 
/* 151 */         getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void baseTick() {
/* 156 */     super.baseTick();
/* 157 */     NullIsHereOnEntityTickUpdateProcedure.execute(
/* 158 */         (LevelAccessor)level(), 
/* 159 */         getX(), 
/* 160 */         getY(), 
/* 161 */         getZ(), 
/* 162 */         (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean isPushable() {
/* 167 */     return false;
/*     */   }
/*     */   
/*     */   protected void doPush(@NotNull Entity entityIn) {
/* 171 */     Intrinsics.checkNotNullParameter(entityIn, "entityIn");
/*     */   }
/*     */   
/*     */   protected void pushEntities() {}
/*     */   
/*     */   public final boolean canChangeDimensions() {
/* 177 */     return false;
/*     */   }
/*     */   
/*     */   public void startSeenByPlayer(@NotNull ServerPlayer player) {
/* 181 */     Intrinsics.checkNotNullParameter(player, "player"); super.startSeenByPlayer(player);
/* 182 */     this.bossInfo.addPlayer(player);
/*     */   }
/*     */   
/*     */   public void stopSeenByPlayer(@NotNull ServerPlayer player) {
/* 186 */     Intrinsics.checkNotNullParameter(player, "player"); super.stopSeenByPlayer(player);
/* 187 */     this.bossInfo.removePlayer(player);
/*     */   }
/*     */   
/*     */   public void customServerAiStep() {
/* 191 */     super.customServerAiStep();
/* 192 */     this.bossInfo.setProgress(getHealth() / getMaxHealth());
/*     */   }
/*     */   
/*     */   protected void checkFallDamage(double y, boolean onGroundIn, @NotNull BlockState state, @NotNull BlockPos pos) {
/* 196 */     Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(pos, "pos");
/*     */   }
/*     */   public void setNoGravity(boolean ignored) {
/* 199 */     super.setNoGravity(true);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 203 */     super.aiStep();
/* 204 */     setNoGravity(true);
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\006\020\006\032\0020\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/NullUnbeatableBossfightEntity$Companion;", "", "<init>", "()V", "init", "", "createAttributes", "Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", "thebrokenscript"})
/*     */   public static final class Companion { private Companion() {}
/*     */     public final void init() {}
/*     */     
/*     */     @NotNull
/*     */     public final AttributeSupplier.Builder createAttributes() {
/* 212 */       AttributeSupplier.Builder builder = Monster.createMobAttributes();
/* 213 */       builder = builder.add(Attributes.MOVEMENT_SPEED, 0.0D);
/* 214 */       builder = builder.add(Attributes.MAX_HEALTH, 910.0D);
/* 215 */       builder = builder.add(Attributes.ARMOR, 0.0D);
/* 216 */       builder = builder.add(Attributes.ATTACK_DAMAGE, 313.0D);
/* 217 */       builder = builder.add(Attributes.FOLLOW_RANGE, 916.0D);
/* 218 */       builder = builder.add(Attributes.FLYING_SPEED, 0.0D);
/* 219 */       AttributeSupplier.Builder builder1 = builder; Intrinsics.checkNotNull(builder1); return builder1;
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\NullUnbeatableBossfightEntity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */