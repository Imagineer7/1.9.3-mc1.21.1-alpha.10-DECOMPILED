/*     */ package dev.wendigodrip.thebrokenscript.entity;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.syncher.EntityDataAccessor;
/*     */ import net.minecraft.network.syncher.EntityDataSerializers;
/*     */ import net.minecraft.network.syncher.SynchedEntityData;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.Pose;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import software.bernie.geckolib.animatable.GeoAnimatable;
/*     */ import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
/*     */ import software.bernie.geckolib.animation.AnimatableManager;
/*     */ import software.bernie.geckolib.animation.AnimationController;
/*     */ import software.bernie.geckolib.animation.AnimationState;
/*     */ import software.bernie.geckolib.animation.PlayState;
/*     */ import software.bernie.geckolib.animation.RawAnimation;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000¸\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\b\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\006\n\002\b\002\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\003\030\000 X2\0020\0012\0020\002:\001XB\035\022\f\020\003\032\b\022\004\022\0020\0000\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\020\020\024\032\0020\0252\006\020\026\032\0020\027H\024J\020\020\033\032\0020\0342\006\020\005\032\0020\006H\024J\b\020\035\032\0020\025H\024J\020\020\036\032\0020\0372\006\020 \032\0020!H\026J \020\"\032\0020\0372\006\020#\032\0020$2\006\020%\032\0020$2\006\020&\032\0020'H\026J\030\020(\032\0020\0372\006\020&\032\0020'2\006\020)\032\0020$H\026J,\020*\032\004\030\0010+2\006\020\005\032\0020,2\006\020-\032\0020.2\006\020/\032\002002\b\0201\032\004\030\0010+H\026J\020\0202\032\0020\0252\006\0203\032\00204H\026J\020\0205\032\0020\0252\006\0203\032\00204H\026J\b\0206\032\0020\025H\026J\020\0207\032\002082\006\0209\032\0020:H\026J\b\020;\032\0020\037H\026J\020\020<\032\0020\0252\006\020=\032\0020>H\024J\b\020?\032\0020\025H\024J(\020@\032\0020\0252\006\020A\032\0020!2\006\020B\032\0020\0372\006\020C\032\0020D2\006\020E\032\0020FH\024J\020\020G\032\0020\0252\006\020H\032\0020\037H\026J\b\020I\032\0020\025H\026J\024\020J\032\0020K2\n\020L\032\006\022\002\b\0030MH\002J\024\020N\032\0020K2\n\020L\032\006\022\002\b\0030MH\002J\b\020O\032\0020\025H\024J\016\020R\032\0020\0252\006\020S\032\0020\fJ\020\020T\032\0020\0252\006\020U\032\0020VH\026J\b\020W\032\0020\nH\026R\016\020\t\032\0020\nX\004¢\006\002\n\000R\032\020\013\032\0020\fX\016¢\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\032\020\021\032\0020\fX\016¢\006\016\n\000\032\004\b\022\020\016\"\004\b\023\020\020R$\020\030\032\0020\f2\006\020\030\032\0020\f8F@FX\016¢\006\f\032\004\b\031\020\016\"\004\b\032\020\020R\021\020P\032\0020\f8F¢\006\006\032\004\bQ\020\016¨\006Y"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/TheObliterationEntity;", "Ldev/wendigodrip/thebrokenscript/entity/base/UwuableMonster;", "Lsoftware/bernie/geckolib/animatable/GeoEntity;", "type", "Lnet/minecraft/world/entity/EntityType;", "world", "Lnet/minecraft/world/level/Level;", "<init>", "(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", "cache", "Lsoftware/bernie/geckolib/animatable/instance/AnimatableInstanceCache;", "animationprocedure", "", "getAnimationprocedure", "()Ljava/lang/String;", "setAnimationprocedure", "(Ljava/lang/String;)V", "prevAnim", "getPrevAnim", "setPrevAnim", "defineSynchedData", "", "builder", "Lnet/minecraft/network/syncher/SynchedEntityData$Builder;", "texture", "getTexture", "setTexture", "createNavigation", "Lnet/minecraft/world/entity/ai/navigation/PathNavigation;", "registerGoals", "removeWhenFarAway", "", "distanceToClosestPlayer", "", "causeFallDamage", "l", "", "d", "source", "Lnet/minecraft/world/damagesource/DamageSource;", "hurt", "amount", "finalizeSpawn", "Lnet/minecraft/world/entity/SpawnGroupData;", "Lnet/minecraft/world/level/ServerLevelAccessor;", "difficulty", "Lnet/minecraft/world/DifficultyInstance;", "reason", "Lnet/minecraft/world/entity/MobSpawnType;", "livingdata", "addAdditionalSaveData", "compound", "Lnet/minecraft/nbt/CompoundTag;", "readAdditionalSaveData", "baseTick", "getDefaultDimensions", "Lnet/minecraft/world/entity/EntityDimensions;", "pose", "Lnet/minecraft/world/entity/Pose;", "isPushable", "doPush", "entityIn", "Lnet/minecraft/world/entity/Entity;", "pushEntities", "checkFallDamage", "y", "onGroundIn", "state", "Lnet/minecraft/world/level/block/state/BlockState;", "pos", "Lnet/minecraft/core/BlockPos;", "setNoGravity", "ignored", "aiStep", "movementPredicate", "Lsoftware/bernie/geckolib/animation/PlayState;", "event", "Lsoftware/bernie/geckolib/animation/AnimationState;", "procedurePredicate", "tickDeath", "syncedAnimation", "getSyncedAnimation", "setAnimation", "animation", "registerControllers", "data", "Lsoftware/bernie/geckolib/animation/AnimatableManager$ControllerRegistrar;", "getAnimatableInstanceCache", "Companion", "thebrokenscript"})
/*     */ public final class TheObliterationEntity extends UwuableMonster implements GeoEntity {
/*  42 */   public TheObliterationEntity(@NotNull EntityType type, @NotNull Level world) { super(type, world);
/*  43 */     Intrinsics.checkNotNullExpressionValue(GeckoLibUtil.createInstanceCache((GeoAnimatable)this), "createInstanceCache(...)"); this.cache = GeckoLibUtil.createInstanceCache((GeoAnimatable)this);
/*  44 */     this.animationprocedure = "empty";
/*  45 */     this.prevAnim = "empty";
/*     */ 
/*     */     
/*  48 */     this.xpReward = 0;
/*  49 */     setNoAi(false);
/*  50 */     Intrinsics.checkNotNull(getAttribute(Attributes.STEP_HEIGHT)); getAttribute(Attributes.STEP_HEIGHT).setBaseValue(
/*  51 */         0.6D);
/*  52 */     setPersistenceRequired();
/*  53 */     this.moveControl = (MoveControl)new FlyingMoveControl((Mob)this, 10, true); } @NotNull public final String getAnimationprocedure() { return this.animationprocedure; }
/*     */   public final void setAnimationprocedure(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.animationprocedure = <set-?>; }
/*     */   @NotNull public final String getPrevAnim() { return this.prevAnim; }
/*     */   public final void setPrevAnim(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.prevAnim = <set-?>; }
/*  57 */   protected void defineSynchedData(@NotNull SynchedEntityData.Builder builder) { Intrinsics.checkNotNullParameter(builder, "builder"); super.defineSynchedData(builder);
/*  58 */     builder.define(SHOOT, Boolean.valueOf(false));
/*  59 */     builder.define(ANIMATION, "undefined");
/*  60 */     builder.define(TEXTURE, "null"); }
/*     */   
/*     */   @NotNull
/*     */   public final String getTexture() {
/*  64 */     Intrinsics.checkNotNullExpressionValue(this.entityData.get(TEXTURE), "get(...)"); return (String)this.entityData.get(TEXTURE);
/*     */   } public final void setTexture(@NotNull String texture) {
/*  66 */     Intrinsics.checkNotNullParameter(texture, "texture"); this.entityData.set(TEXTURE, texture);
/*     */   }
/*     */   @NotNull
/*     */   protected PathNavigation createNavigation(@NotNull Level world) {
/*  70 */     Intrinsics.checkNotNullParameter(world, "world"); return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */   
/*     */   protected void registerGoals() {
/*  74 */     super.registerGoals();
/*  75 */     this.goalSelector.addGoal(
/*  76 */         1, (Goal)new TheObliterationEntity$registerGoals$1());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  86 */     this.goalSelector.addGoal(
/*  87 */         2, (Goal)new TheObliterationEntity$registerGoals$2(this));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     this.goalSelector.addGoal(3, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  94 */     this.targetSelector.addGoal(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  95 */     this.goalSelector.addGoal(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  96 */     this.goalSelector.addGoal(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\n\020\002\032\004\030\0010\003H\024¨\006\004"}, d2 = {"dev/wendigodrip/thebrokenscript/entity/TheObliterationEntity$registerGoals$1", "Lnet/minecraft/world/entity/ai/goal/RandomStrollGoal;", "getPosition", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"}) public static final class TheObliterationEntity$registerGoals$1 extends RandomStrollGoal {
/*     */     TheObliterationEntity$registerGoals$1() { super((PathfinderMob)$receiver, 0.8D, 20); } protected Vec3 getPosition() { RandomSource random = TheObliterationEntity.this.getRandom(); double dir_x = TheObliterationEntity.this.getX() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F); double dir_y = TheObliterationEntity.this.getY() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F); double dir_z = TheObliterationEntity.this.getZ() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 100 */       return new Vec3(dir_x, dir_y, dir_z); } } public boolean removeWhenFarAway(double distanceToClosestPlayer) { return false; }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\016\020\002\032\0020\0032\006\020\004\032\0020\005¨\006\006"}, d2 = {"dev/wendigodrip/thebrokenscript/entity/TheObliterationEntity$registerGoals$2", "Lnet/minecraft/world/entity/ai/goal/MeleeAttackGoal;", "getAttackReachSqr", "", "entity", "Lnet/minecraft/world/entity/LivingEntity;", "thebrokenscript"}) public static final class TheObliterationEntity$registerGoals$2 extends MeleeAttackGoal {
/*     */     TheObliterationEntity$registerGoals$2(TheObliterationEntity $receiver) { super((PathfinderMob)$receiver, 1.2D, false); }
/*     */     public final double getAttackReachSqr(LivingEntity entity) { Intrinsics.checkNotNullParameter(entity, "entity");
/* 104 */       return (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()); } } public boolean causeFallDamage(float l, float d, @NotNull DamageSource source) { Intrinsics.checkNotNullParameter(source, "source"); return false; }
/*     */ 
/*     */   
/*     */   public boolean hurt(@NotNull DamageSource source, float amount) {
/* 108 */     Intrinsics.checkNotNullParameter(source, "source"); if (source.is(DamageTypes.IN_FIRE)) {
/* 109 */       return false;
/*     */     }
/* 111 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.AbstractArrow) {
/* 112 */       return false;
/*     */     }
/* 114 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.player.Player) {
/* 115 */       return false;
/*     */     }
/* 117 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud) {
/* 118 */       return false;
/*     */     }
/* 120 */     if (source.is(DamageTypes.FALL)) {
/* 121 */       return false;
/*     */     }
/* 123 */     if (source.is(DamageTypes.CACTUS)) {
/* 124 */       return false;
/*     */     }
/* 126 */     if (source.is(DamageTypes.DROWN)) {
/* 127 */       return false;
/*     */     }
/* 129 */     if (source.is(DamageTypes.LIGHTNING_BOLT)) {
/* 130 */       return false;
/*     */     }
/* 132 */     if (source.is(DamageTypes.EXPLOSION)) {
/* 133 */       return false;
/*     */     }
/* 135 */     if (source.is(DamageTypes.TRIDENT)) {
/* 136 */       return false;
/*     */     }
/* 138 */     if (source.is(DamageTypes.FALLING_ANVIL)) {
/* 139 */       return false;
/*     */     }
/* 141 */     if (source.is(DamageTypes.DRAGON_BREATH)) {
/* 142 */       return false;
/*     */     }
/* 144 */     if (source.is(DamageTypes.WITHER)) {
/* 145 */       return false;
/*     */     }
/* 147 */     if (source.is(DamageTypes.WITHER_SKULL)) {
/* 148 */       return false;
/*     */     }
/* 150 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor world, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
/* 159 */     Intrinsics.checkNotNullParameter(world, "world"); Intrinsics.checkNotNullParameter(difficulty, "difficulty"); Intrinsics.checkNotNullParameter(reason, "reason"); SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
/* 160 */     TheObliterationOnInitialEntitySpawnProcedure.execute(
/* 161 */         (LevelAccessor)world, 
/* 162 */         getX(), 
/* 163 */         getY(), 
/* 164 */         getZ());
/*     */     
/* 166 */     return retval;
/*     */   }
/*     */   
/*     */   public void addAdditionalSaveData(@NotNull CompoundTag compound) {
/* 170 */     Intrinsics.checkNotNullParameter(compound, "compound"); super.addAdditionalSaveData(compound);
/* 171 */     compound.putString("Texture", getTexture());
/*     */   }
/*     */   
/*     */   public void readAdditionalSaveData(@NotNull CompoundTag compound) {
/* 175 */     Intrinsics.checkNotNullParameter(compound, "compound"); super.readAdditionalSaveData(compound);
/* 176 */     if (compound.contains("Texture")) {
/* 177 */       setTexture(compound.getString("Texture"));
/*     */     }
/*     */   }
/*     */   
/*     */   public void baseTick() {
/* 182 */     super.baseTick();
/*     */     
/* 184 */     Intrinsics.checkNotNullExpressionValue(level(), "level(...)"); TheObliterationOnEntityTickUpdateProcedure.INSTANCE.execute(level(), 
/* 185 */         getX(), 
/* 186 */         getY(), 
/* 187 */         getZ(), 
/* 188 */         (Entity)this);
/*     */     
/* 190 */     refreshDimensions();
/*     */   }
/*     */   @NotNull
/*     */   public EntityDimensions getDefaultDimensions(@NotNull Pose pose) {
/* 194 */     Intrinsics.checkNotNullParameter(pose, "pose"); Intrinsics.checkNotNullExpressionValue(super.getDefaultDimensions(pose).scale(1.0F), "scale(...)"); return super.getDefaultDimensions(pose).scale(1.0F);
/*     */   }
/*     */   
/*     */   public boolean isPushable() {
/* 198 */     return false;
/*     */   }
/*     */   
/*     */   protected void doPush(@NotNull Entity entityIn) {
/* 202 */     Intrinsics.checkNotNullParameter(entityIn, "entityIn");
/*     */   }
/*     */   
/*     */   protected void pushEntities() {}
/*     */   
/*     */   protected void checkFallDamage(double y, boolean onGroundIn, @NotNull BlockState state, @NotNull BlockPos pos) {
/* 208 */     Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(pos, "pos");
/*     */   }
/*     */   public void setNoGravity(boolean ignored) {
/* 211 */     super.setNoGravity(true);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 215 */     super.aiStep();
/* 216 */     setNoGravity(true);
/*     */   }
/*     */   
/*     */   private final PlayState movementPredicate(AnimationState event) {
/* 220 */     if (Intrinsics.areEqual(this.animationprocedure, "empty")) {
/* 221 */       Intrinsics.checkNotNullExpressionValue(event.setAndContinue(RawAnimation.begin().thenLoop("idle")), "setAndContinue(...)"); return event.setAndContinue(RawAnimation.begin().thenLoop("idle"));
/*     */     } 
/* 223 */     return PlayState.STOP;
/*     */   }
/*     */   
/*     */   private final PlayState procedurePredicate(AnimationState event) {
/* 227 */     if ((!Intrinsics.areEqual(this.animationprocedure, "empty") && 
/* 228 */       event.getController().getAnimationState() == AnimationController.State.STOPPED) || (
/* 229 */       !Intrinsics.areEqual(this.animationprocedure, this.prevAnim) && !Intrinsics.areEqual(this.animationprocedure, "empty"))) {
/*     */       
/* 231 */       if (!Intrinsics.areEqual(this.animationprocedure, this.prevAnim)) {
/* 232 */         event.getController().forceAnimationReset();
/*     */       }
/* 234 */       event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
/* 235 */       if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
/* 236 */         this.animationprocedure = "empty";
/* 237 */         event.getController().forceAnimationReset();
/*     */       } 
/* 239 */     } else if (Intrinsics.areEqual(this.animationprocedure, "empty")) {
/* 240 */       this.prevAnim = "empty";
/* 241 */       return PlayState.STOP;
/*     */     } 
/* 243 */     this.prevAnim = this.animationprocedure;
/* 244 */     return PlayState.CONTINUE;
/*     */   }
/*     */   
/*     */   protected void tickDeath() {
/* 248 */     this.deathTime++;
/* 249 */     if (this.deathTime == 20) {
/* 250 */       remove(Entity.RemovalReason.KILLED);
/* 251 */       dropExperience((Entity)this);
/*     */     } 
/*     */   }
/*     */   @NotNull
/*     */   public final String getSyncedAnimation() {
/* 256 */     Intrinsics.checkNotNullExpressionValue(this.entityData.get(ANIMATION), "get(...)"); return (String)this.entityData.get(ANIMATION);
/*     */   }
/*     */   public final void setAnimation(@NotNull String animation) {
/* 259 */     Intrinsics.checkNotNullParameter(animation, "animation"); this.entityData.set(ANIMATION, animation);
/*     */   }
/*     */   
/*     */   public void registerControllers(@NotNull AnimatableManager.ControllerRegistrar data) {
/* 263 */     Intrinsics.checkNotNullParameter(data, "data");
/* 264 */     AnimationController[] arrayOfAnimationController = new AnimationController[1]; arrayOfAnimationController[0] = 
/* 265 */       new AnimationController(
/* 266 */         (GeoAnimatable)this, 
/* 267 */         "movement", 
/* 268 */         4, this::registerControllers$lambda$0);
/*     */ 
/*     */ 
/*     */     
/*     */     data.add(arrayOfAnimationController);
/*     */ 
/*     */ 
/*     */     
/* 276 */     arrayOfAnimationController = new AnimationController[1]; arrayOfAnimationController[0] = 
/* 277 */       new AnimationController(
/* 278 */         (GeoAnimatable)this, 
/* 279 */         "procedure", 
/* 280 */         4, this::registerControllers$lambda$1); data.add(arrayOfAnimationController);
/*     */   } private static final PlayState registerControllers$lambda$0(TheObliterationEntity this$0, AnimationState<?> event) { Intrinsics.checkNotNullParameter(event, "event");
/* 282 */     return this$0.movementPredicate(event); } private static final PlayState registerControllers$lambda$1(TheObliterationEntity this$0, AnimationState<?> event) { Intrinsics.checkNotNullParameter(event, "event"); return this$0.procedurePredicate(
/* 283 */         event); }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public AnimatableInstanceCache getAnimatableInstanceCache() {
/* 290 */     return this.cache;
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\016\032\0020\017J\006\020\020\032\0020\021R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\n0\005¢\006\b\n\000\032\004\b\013\020\bR\027\020\f\032\b\022\004\022\0020\n0\005¢\006\b\n\000\032\004\b\r\020\b¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/TheObliterationEntity$Companion;", "", "<init>", "()V", "SHOOT", "Lnet/minecraft/network/syncher/EntityDataAccessor;", "", "getSHOOT", "()Lnet/minecraft/network/syncher/EntityDataAccessor;", "ANIMATION", "", "getANIMATION", "TEXTURE", "getTEXTURE", "init", "", "createAttributes", "Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", "thebrokenscript"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final EntityDataAccessor<Boolean> getSHOOT() {
/* 294 */       return TheObliterationEntity.SHOOT;
/*     */     }
/*     */     @NotNull
/*     */     public final EntityDataAccessor<String> getANIMATION() {
/* 298 */       return TheObliterationEntity.ANIMATION;
/*     */     }
/*     */     @NotNull
/*     */     public final EntityDataAccessor<String> getTEXTURE() {
/* 302 */       return TheObliterationEntity.TEXTURE;
/*     */     }
/*     */ 
/*     */     
/*     */     public final void init() {}
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final AttributeSupplier.Builder createAttributes() {
/* 311 */       AttributeSupplier.Builder builder = Monster.createMobAttributes();
/* 312 */       builder = builder.add(Attributes.MOVEMENT_SPEED, 1.0D);
/* 313 */       builder = builder.add(Attributes.MAX_HEALTH, 910.0D);
/* 314 */       builder = builder.add(Attributes.ARMOR, 0.0D);
/* 315 */       builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 316 */       builder = builder.add(Attributes.FOLLOW_RANGE, 1000.0D);
/* 317 */       builder = builder.add(Attributes.FLYING_SPEED, 1.0D);
/* 318 */       AttributeSupplier.Builder builder1 = builder; Intrinsics.checkNotNull(builder1); return builder1;
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final AnimatableInstanceCache cache;
/*     */   @NotNull
/*     */   private String animationprocedure;
/*     */   @NotNull
/*     */   private String prevAnim;
/*     */   @NotNull
/*     */   private static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(TheObliterationEntity.class, EntityDataSerializers.BOOLEAN);
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(SynchedEntityData.defineId(TheObliterationEntity.class, EntityDataSerializers.BOOLEAN), "defineId(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(TheObliterationEntity.class, EntityDataSerializers.STRING);
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(SynchedEntityData.defineId(TheObliterationEntity.class, EntityDataSerializers.STRING), "defineId(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(TheObliterationEntity.class, EntityDataSerializers.STRING);
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(SynchedEntityData.defineId(TheObliterationEntity.class, EntityDataSerializers.STRING), "defineId(...)");
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\TheObliterationEntity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */