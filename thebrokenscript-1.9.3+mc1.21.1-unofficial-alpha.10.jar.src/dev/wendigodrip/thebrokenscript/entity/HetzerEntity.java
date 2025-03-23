/*     */ package dev.wendigodrip.thebrokenscript.entity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.anim.AnimatedMonster;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.syncher.EntityDataAccessor;
/*     */ import net.minecraft.network.syncher.EntityDataSerializers;
/*     */ import net.minecraft.network.syncher.SynchedEntityData;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.Pose;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import software.bernie.geckolib.animatable.GeoAnimatable;
/*     */ import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
/*     */ import software.bernie.geckolib.animation.AnimatableManager;
/*     */ import software.bernie.geckolib.animation.AnimationController;
/*     */ import software.bernie.geckolib.animation.AnimationState;
/*     */ import software.bernie.geckolib.animation.PlayState;
/*     */ import software.bernie.geckolib.animation.RawAnimation;
/*     */ import software.bernie.geckolib.util.GeckoLibUtil;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\001\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\006\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\030\000 >2\0020\0012\0020\002:\001>B\035\022\f\020\003\032\b\022\004\022\0020\0000\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\020\020\013\032\0020\f2\006\020\r\032\0020\016H\024J\020\020\025\032\0020\0262\006\020\005\032\0020\006H\024J\b\020\027\032\0020\fH\024J \020\030\032\0020\0312\006\020\032\032\0020\0332\006\020\034\032\0020\0332\006\020\035\032\0020\036H\026J\030\020\037\032\0020\0312\006\020\035\032\0020\0362\006\020 \032\0020\033H\026J\020\020!\032\0020\f2\006\020\"\032\0020#H\026J\020\020$\032\0020\f2\006\020\"\032\0020#H\026J\b\020%\032\0020\fH\026J\020\020&\032\0020'2\006\020(\032\0020)H\026J(\020*\032\0020\f2\006\020+\032\0020,2\006\020-\032\0020\0312\006\020.\032\0020/2\006\0200\032\00201H\024J\020\0202\032\0020\f2\006\0203\032\0020\031H\026J\b\0204\032\0020\fH\026J\024\0205\032\002062\n\0207\032\006\022\002\b\00308H\002J\b\0209\032\0020\fH\024J\020\020:\032\0020\f2\006\020;\032\0020<H\026J\b\020=\032\0020\nH\026R\016\020\t\032\0020\nX\004¢\006\002\n\000R$\020\017\032\0020\0202\006\020\017\032\0020\0208F@FX\016¢\006\f\032\004\b\021\020\022\"\004\b\023\020\024¨\006?"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/HetzerEntity;", "Ldev/wendigodrip/thebrokenscript/entity/anim/AnimatedMonster;", "Lsoftware/bernie/geckolib/animatable/GeoEntity;", "type", "Lnet/minecraft/world/entity/EntityType;", "world", "Lnet/minecraft/world/level/Level;", "<init>", "(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", "cache", "Lsoftware/bernie/geckolib/animatable/instance/AnimatableInstanceCache;", "defineSynchedData", "", "builder", "Lnet/minecraft/network/syncher/SynchedEntityData$Builder;", "texture", "", "getTexture", "()Ljava/lang/String;", "setTexture", "(Ljava/lang/String;)V", "createNavigation", "Lnet/minecraft/world/entity/ai/navigation/PathNavigation;", "registerGoals", "causeFallDamage", "", "l", "", "d", "source", "Lnet/minecraft/world/damagesource/DamageSource;", "hurt", "amount", "addAdditionalSaveData", "compound", "Lnet/minecraft/nbt/CompoundTag;", "readAdditionalSaveData", "baseTick", "getDefaultDimensions", "Lnet/minecraft/world/entity/EntityDimensions;", "pose", "Lnet/minecraft/world/entity/Pose;", "checkFallDamage", "y", "", "onGroundIn", "state", "Lnet/minecraft/world/level/block/state/BlockState;", "pos", "Lnet/minecraft/core/BlockPos;", "setNoGravity", "ignored", "aiStep", "movementPredicate", "Lsoftware/bernie/geckolib/animation/PlayState;", "event", "Lsoftware/bernie/geckolib/animation/AnimationState;", "tickDeath", "registerControllers", "data", "Lsoftware/bernie/geckolib/animation/AnimatableManager$ControllerRegistrar;", "getAnimatableInstanceCache", "Companion", "thebrokenscript"})
/*     */ @SourceDebugExtension({"SMAP\nHetzerEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HetzerEntity.kt\ndev/wendigodrip/thebrokenscript/entity/HetzerEntity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,205:1\n1755#2,3:206\n*S KotlinDebug\n*F\n+ 1 HetzerEntity.kt\ndev/wendigodrip/thebrokenscript/entity/HetzerEntity\n*L\n103#1:206,3\n*E\n"})
/*     */ public final class HetzerEntity extends AnimatedMonster implements GeoEntity {
/*     */   public HetzerEntity(@NotNull EntityType type, @NotNull Level world) {
/*  37 */     super(type, world);
/*  38 */     Intrinsics.checkNotNullExpressionValue(GeckoLibUtil.createInstanceCache((GeoAnimatable)this), "createInstanceCache(...)"); this.cache = GeckoLibUtil.createInstanceCache((GeoAnimatable)this);
/*     */ 
/*     */     
/*  41 */     this.xpReward = 0;
/*  42 */     setNoAi(false);
/*     */     
/*  44 */     if (getAttribute(Attributes.STEP_HEIGHT) != null) { getAttribute(Attributes.STEP_HEIGHT).setBaseValue(0.6D); } else { getAttribute(Attributes.STEP_HEIGHT); }
/*     */     
/*  46 */     this.moveControl = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */   
/*     */   protected void defineSynchedData(@NotNull SynchedEntityData.Builder builder) {
/*  50 */     Intrinsics.checkNotNullParameter(builder, "builder"); super.defineSynchedData(builder);
/*     */     
/*  52 */     builder.define(SHOOT, Boolean.valueOf(false)).define(AnimatedMonster.Companion.getANIMATION(), "undefined").define(TEXTURE, "hetzerfixed")
/*  53 */       .define(ANGER_METER, Integer.valueOf(0)).define(IS_LOOKED_AT, Boolean.valueOf(false));
/*     */   }
/*     */   @NotNull
/*     */   public final String getTexture() {
/*  57 */     Intrinsics.checkNotNullExpressionValue(this.entityData.get(TEXTURE), "get(...)"); return (String)this.entityData.get(TEXTURE);
/*     */   } public final void setTexture(@NotNull String texture) {
/*  59 */     Intrinsics.checkNotNullParameter(texture, "texture"); this.entityData.set(TEXTURE, texture);
/*     */   }
/*     */   @NotNull
/*     */   protected PathNavigation createNavigation(@NotNull Level world) {
/*  63 */     Intrinsics.checkNotNullParameter(world, "world"); return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */   
/*     */   protected void registerGoals() {
/*  67 */     super.registerGoals();
/*  68 */     this.goalSelector.addGoal(
/*  69 */         1, (Goal)new HetzerEntity$registerGoals$1(this));
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  74 */     this.goalSelector.addGoal(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/*  75 */     this.targetSelector.addGoal(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  76 */     this.goalSelector.addGoal(4, (Goal)new RandomLookAroundGoal((Mob)this));
/*  77 */     this.goalSelector.addGoal(5, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\016\020\002\032\0020\0032\006\020\004\032\0020\005¨\006\006"}, d2 = {"dev/wendigodrip/thebrokenscript/entity/HetzerEntity$registerGoals$1", "Lnet/minecraft/world/entity/ai/goal/MeleeAttackGoal;", "getAttackReachSqr", "", "entity", "Lnet/minecraft/world/entity/LivingEntity;", "thebrokenscript"}) public static final class HetzerEntity$registerGoals$1 extends MeleeAttackGoal {
/*     */     HetzerEntity$registerGoals$1(HetzerEntity $receiver) { super((PathfinderMob)$receiver, 1.2D, false); } public final double getAttackReachSqr(LivingEntity entity) { Intrinsics.checkNotNullParameter(entity, "entity");
/*  81 */       return (this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth()); } } public boolean causeFallDamage(float l, float d, @NotNull DamageSource source) { Intrinsics.checkNotNullParameter(source, "source"); return false; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean hurt(@NotNull DamageSource source, float amount) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'source'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: invokevirtual getDirectEntity : ()Lnet/minecraft/world/entity/Entity;
/*     */     //   10: instanceof net/minecraft/world/entity/projectile/AbstractArrow
/*     */     //   13: ifne -> 46
/*     */     //   16: aload_1
/*     */     //   17: invokevirtual getDirectEntity : ()Lnet/minecraft/world/entity/Entity;
/*     */     //   20: instanceof net/minecraft/world/entity/player/Player
/*     */     //   23: ifne -> 46
/*     */     //   26: aload_1
/*     */     //   27: invokevirtual getDirectEntity : ()Lnet/minecraft/world/entity/Entity;
/*     */     //   30: instanceof net/minecraft/world/entity/projectile/ThrownPotion
/*     */     //   33: ifne -> 46
/*     */     //   36: aload_1
/*     */     //   37: invokevirtual getDirectEntity : ()Lnet/minecraft/world/entity/Entity;
/*     */     //   40: instanceof net/minecraft/world/entity/AreaEffectCloud
/*     */     //   43: ifeq -> 48
/*     */     //   46: iconst_0
/*     */     //   47: ireturn
/*     */     //   48: bipush #11
/*     */     //   50: anewarray net/minecraft/resources/ResourceKey
/*     */     //   53: astore #4
/*     */     //   55: aload #4
/*     */     //   57: iconst_0
/*     */     //   58: getstatic net/minecraft/world/damagesource/DamageTypes.FALL : Lnet/minecraft/resources/ResourceKey;
/*     */     //   61: aastore
/*     */     //   62: aload #4
/*     */     //   64: iconst_1
/*     */     //   65: getstatic net/minecraft/world/damagesource/DamageTypes.CACTUS : Lnet/minecraft/resources/ResourceKey;
/*     */     //   68: aastore
/*     */     //   69: aload #4
/*     */     //   71: iconst_2
/*     */     //   72: getstatic net/minecraft/world/damagesource/DamageTypes.DROWN : Lnet/minecraft/resources/ResourceKey;
/*     */     //   75: aastore
/*     */     //   76: aload #4
/*     */     //   78: iconst_3
/*     */     //   79: getstatic net/minecraft/world/damagesource/DamageTypes.LIGHTNING_BOLT : Lnet/minecraft/resources/ResourceKey;
/*     */     //   82: aastore
/*     */     //   83: aload #4
/*     */     //   85: iconst_4
/*     */     //   86: getstatic net/minecraft/world/damagesource/DamageTypes.EXPLOSION : Lnet/minecraft/resources/ResourceKey;
/*     */     //   89: aastore
/*     */     //   90: aload #4
/*     */     //   92: iconst_5
/*     */     //   93: getstatic net/minecraft/world/damagesource/DamageTypes.TRIDENT : Lnet/minecraft/resources/ResourceKey;
/*     */     //   96: aastore
/*     */     //   97: aload #4
/*     */     //   99: bipush #6
/*     */     //   101: getstatic net/minecraft/world/damagesource/DamageTypes.FALLING_ANVIL : Lnet/minecraft/resources/ResourceKey;
/*     */     //   104: aastore
/*     */     //   105: aload #4
/*     */     //   107: bipush #7
/*     */     //   109: getstatic net/minecraft/world/damagesource/DamageTypes.DRAGON_BREATH : Lnet/minecraft/resources/ResourceKey;
/*     */     //   112: aastore
/*     */     //   113: aload #4
/*     */     //   115: bipush #8
/*     */     //   117: getstatic net/minecraft/world/damagesource/DamageTypes.WITHER : Lnet/minecraft/resources/ResourceKey;
/*     */     //   120: aastore
/*     */     //   121: aload #4
/*     */     //   123: bipush #9
/*     */     //   125: getstatic net/minecraft/world/damagesource/DamageTypes.WITHER_SKULL : Lnet/minecraft/resources/ResourceKey;
/*     */     //   128: aastore
/*     */     //   129: aload #4
/*     */     //   131: bipush #10
/*     */     //   133: getstatic net/minecraft/world/damagesource/DamageTypes.IN_FIRE : Lnet/minecraft/resources/ResourceKey;
/*     */     //   136: aastore
/*     */     //   137: aload #4
/*     */     //   139: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   142: astore_3
/*     */     //   143: aload_3
/*     */     //   144: checkcast java/lang/Iterable
/*     */     //   147: astore #4
/*     */     //   149: iconst_0
/*     */     //   150: istore #5
/*     */     //   152: aload #4
/*     */     //   154: instanceof java/util/Collection
/*     */     //   157: ifeq -> 177
/*     */     //   160: aload #4
/*     */     //   162: checkcast java/util/Collection
/*     */     //   165: invokeinterface isEmpty : ()Z
/*     */     //   170: ifeq -> 177
/*     */     //   173: iconst_0
/*     */     //   174: goto -> 229
/*     */     //   177: aload #4
/*     */     //   179: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   184: astore #6
/*     */     //   186: aload #6
/*     */     //   188: invokeinterface hasNext : ()Z
/*     */     //   193: ifeq -> 228
/*     */     //   196: aload #6
/*     */     //   198: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   203: astore #7
/*     */     //   205: aload #7
/*     */     //   207: checkcast net/minecraft/resources/ResourceKey
/*     */     //   210: astore #8
/*     */     //   212: iconst_0
/*     */     //   213: istore #9
/*     */     //   215: aload_1
/*     */     //   216: aload #8
/*     */     //   218: invokevirtual is : (Lnet/minecraft/resources/ResourceKey;)Z
/*     */     //   221: ifeq -> 186
/*     */     //   224: iconst_1
/*     */     //   225: goto -> 229
/*     */     //   228: iconst_0
/*     */     //   229: ifeq -> 234
/*     */     //   232: iconst_0
/*     */     //   233: ireturn
/*     */     //   234: aload_0
/*     */     //   235: aload_1
/*     */     //   236: fload_2
/*     */     //   237: invokespecial hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
/*     */     //   240: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #85	-> 6
/*     */     //   #86	-> 46
/*     */     //   #90	-> 48
/*     */     //   #91	-> 65
/*     */     //   #90	-> 69
/*     */     //   #92	-> 72
/*     */     //   #90	-> 76
/*     */     //   #93	-> 79
/*     */     //   #90	-> 83
/*     */     //   #94	-> 86
/*     */     //   #90	-> 90
/*     */     //   #95	-> 93
/*     */     //   #90	-> 97
/*     */     //   #96	-> 101
/*     */     //   #90	-> 105
/*     */     //   #97	-> 109
/*     */     //   #90	-> 113
/*     */     //   #98	-> 117
/*     */     //   #90	-> 121
/*     */     //   #99	-> 125
/*     */     //   #90	-> 129
/*     */     //   #100	-> 133
/*     */     //   #90	-> 137
/*     */     //   #89	-> 139
/*     */     //   #103	-> 143
/*     */     //   #206	-> 152
/*     */     //   #207	-> 177
/*     */     //   #103	-> 215
/*     */     //   #207	-> 221
/*     */     //   #208	-> 228
/*     */     //   #103	-> 229
/*     */     //   #104	-> 232
/*     */     //   #107	-> 235
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   215	6	9	$i$a$-any-HetzerEntity$hurt$1	I
/*     */     //   212	9	8	it	Lnet/minecraft/resources/ResourceKey;
/*     */     //   205	23	7	element$iv	Ljava/lang/Object;
/*     */     //   152	77	5	$i$f$any	I
/*     */     //   149	80	4	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   143	98	3	ignoredDamageTypes	Ljava/util/List;
/*     */     //   0	241	0	this	Ldev/wendigodrip/thebrokenscript/entity/HetzerEntity;
/*     */     //   0	241	1	source	Lnet/minecraft/world/damagesource/DamageSource;
/*     */     //   0	241	2	amount	F
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void addAdditionalSaveData(@NotNull CompoundTag compound) {
/* 111 */     Intrinsics.checkNotNullParameter(compound, "compound"); super.addAdditionalSaveData(compound);
/* 112 */     compound.putString("Texture", getTexture());
/* 113 */     Intrinsics.checkNotNullExpressionValue(this.entityData.get(ANGER_METER), "get(...)"); compound.putInt("Dataangermeter", ((Number)this.entityData.get(ANGER_METER)).intValue());
/* 114 */     Intrinsics.checkNotNullExpressionValue(this.entityData.get(IS_LOOKED_AT), "get(...)"); compound.putBoolean("Dataislookedat", ((Boolean)this.entityData.get(IS_LOOKED_AT)).booleanValue());
/*     */   }
/*     */   
/*     */   public void readAdditionalSaveData(@NotNull CompoundTag compound) {
/* 118 */     Intrinsics.checkNotNullParameter(compound, "compound"); super.readAdditionalSaveData(compound);
/* 119 */     if (compound.contains("Texture")) {
/* 120 */       setTexture(compound.getString("Texture"));
/*     */     }
/* 122 */     if (compound.contains("Dataangermeter")) {
/* 123 */       this.entityData.set(ANGER_METER, Integer.valueOf(compound.getInt("Dataangermeter")));
/*     */     }
/* 125 */     if (compound.contains("Dataislookedat")) {
/* 126 */       this.entityData.set(IS_LOOKED_AT, Boolean.valueOf(compound.getBoolean("Dataislookedat")));
/*     */     }
/*     */   }
/*     */   
/*     */   public void baseTick() {
/* 131 */     super.baseTick();
/* 132 */     HetzerOnEntityTickUpdateProcedure.execute(
/* 133 */         (LevelAccessor)level(), getX(), getY(), getZ(), (Entity)this);
/*     */     
/* 135 */     refreshDimensions();
/*     */   }
/*     */   @NotNull
/*     */   public EntityDimensions getDefaultDimensions(@NotNull Pose pose) {
/* 139 */     Intrinsics.checkNotNullParameter(pose, "pose"); Intrinsics.checkNotNullExpressionValue(super.getDefaultDimensions(pose).scale(1.0F), "scale(...)"); return super.getDefaultDimensions(pose).scale(1.0F);
/*     */   }
/*     */   
/*     */   protected void checkFallDamage(double y, boolean onGroundIn, @NotNull BlockState state, @NotNull BlockPos pos) {
/* 143 */     Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(pos, "pos");
/*     */   }
/*     */   public void setNoGravity(boolean ignored) {
/* 146 */     super.setNoGravity(true);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 150 */     super.aiStep();
/*     */     
/* 152 */     setNoGravity(true);
/*     */   }
/*     */   
/*     */   private final PlayState movementPredicate(AnimationState event) {
/* 156 */     if (Intrinsics.areEqual(getAnimationprocedure(), "empty")) {
/* 157 */       Intrinsics.checkNotNullExpressionValue(event.setAndContinue(RawAnimation.begin().thenLoop("idle1")), "setAndContinue(...)"); return event.setAndContinue(RawAnimation.begin().thenLoop("idle1"));
/*     */     } 
/* 159 */     return PlayState.STOP;
/*     */   }
/*     */   
/*     */   protected void tickDeath() {
/* 163 */     this.deathTime++;
/* 164 */     if (this.deathTime == 20) {
/* 165 */       remove(Entity.RemovalReason.KILLED);
/* 166 */       dropExperience((Entity)this);
/*     */     } 
/*     */   }
/*     */   
/*     */   public void registerControllers(@NotNull AnimatableManager.ControllerRegistrar data) {
/* 171 */     Intrinsics.checkNotNullParameter(data, "data");
/* 172 */     AnimationController[] arrayOfAnimationController = new AnimationController[2]; arrayOfAnimationController[0] = new AnimationController((GeoAnimatable)this, "movement", 4, this::movementPredicate); arrayOfAnimationController[1] = 
/* 173 */       new AnimationController((GeoAnimatable)this, "procedure", 4, this::procedurePredicate);
/*     */     data.add(arrayOfAnimationController);
/*     */   }
/*     */   @NotNull
/*     */   public AnimatableInstanceCache getAnimatableInstanceCache() {
/* 178 */     return this.cache;
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\021\032\0020\022R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\n0\005¢\006\b\n\000\032\004\b\013\020\bR\027\020\f\032\b\022\004\022\0020\r0\005¢\006\b\n\000\032\004\b\016\020\bR\027\020\017\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\b¨\006\023"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/HetzerEntity$Companion;", "", "<init>", "()V", "SHOOT", "Lnet/minecraft/network/syncher/EntityDataAccessor;", "", "getSHOOT", "()Lnet/minecraft/network/syncher/EntityDataAccessor;", "TEXTURE", "", "getTEXTURE", "ANGER_METER", "", "getANGER_METER", "IS_LOOKED_AT", "getIS_LOOKED_AT", "createAttributes", "Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", "thebrokenscript"})
/*     */   public static final class Companion { private Companion() {} @NotNull
/*     */     public final EntityDataAccessor<Boolean> getSHOOT() {
/* 182 */       return HetzerEntity.SHOOT;
/*     */     }
/*     */     @NotNull
/*     */     public final EntityDataAccessor<String> getTEXTURE() {
/* 186 */       return HetzerEntity.TEXTURE;
/*     */     }
/*     */     @NotNull
/*     */     public final EntityDataAccessor<Integer> getANGER_METER() {
/* 190 */       return HetzerEntity.ANGER_METER;
/*     */     }
/*     */     @NotNull
/*     */     public final EntityDataAccessor<Boolean> getIS_LOOKED_AT() {
/* 194 */       return HetzerEntity.IS_LOOKED_AT;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final AttributeSupplier.Builder createAttributes() {
/* 201 */       Intrinsics.checkNotNullExpressionValue(Monster.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.0D).add(Attributes.MAX_HEALTH, 900.0D).add(Attributes.ARMOR, 50.0D).add(Attributes.ATTACK_DAMAGE, 13.0D).add(Attributes.FOLLOW_RANGE, 1916.0D).add(Attributes.KNOCKBACK_RESISTANCE, 50.0D).add(Attributes.FLYING_SPEED, 0.0D), "add(...)"); return Monster.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.0D).add(Attributes.MAX_HEALTH, 900.0D).add(Attributes.ARMOR, 50.0D).add(Attributes.ATTACK_DAMAGE, 13.0D).add(Attributes.FOLLOW_RANGE, 1916.0D).add(Attributes.KNOCKBACK_RESISTANCE, 50.0D).add(Attributes.FLYING_SPEED, 0.0D);
/*     */     } }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final AnimatableInstanceCache cache;
/*     */   @NotNull
/*     */   private static final EntityDataAccessor<Boolean> SHOOT = SynchedEntityData.defineId(HetzerEntity.class, EntityDataSerializers.BOOLEAN);
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(SynchedEntityData.defineId(HetzerEntity.class, EntityDataSerializers.BOOLEAN), "defineId(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EntityDataAccessor<String> TEXTURE = SynchedEntityData.defineId(HetzerEntity.class, EntityDataSerializers.STRING);
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(SynchedEntityData.defineId(HetzerEntity.class, EntityDataSerializers.STRING), "defineId(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EntityDataAccessor<Integer> ANGER_METER = SynchedEntityData.defineId(HetzerEntity.class, EntityDataSerializers.INT);
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(SynchedEntityData.defineId(HetzerEntity.class, EntityDataSerializers.INT), "defineId(...)");
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final EntityDataAccessor<Boolean> IS_LOOKED_AT = SynchedEntityData.defineId(HetzerEntity.class, EntityDataSerializers.BOOLEAN);
/*     */   
/*     */   static {
/*     */     Intrinsics.checkNotNullExpressionValue(SynchedEntityData.defineId(HetzerEntity.class, EntityDataSerializers.BOOLEAN), "defineId(...)");
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\HetzerEntity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */