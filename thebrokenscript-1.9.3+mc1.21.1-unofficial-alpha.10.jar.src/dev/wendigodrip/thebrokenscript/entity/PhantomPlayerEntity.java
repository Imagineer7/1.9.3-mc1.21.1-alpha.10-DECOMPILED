/*     */ package dev.wendigodrip.thebrokenscript.entity;
/*     */ import dev.wendigodrip.thebrokenscript.procedures.PhantomPlayerOnEntityTickUpdateProcedure;
/*     */ import dev.wendigodrip.thebrokenscript.procedures.PhantomPlayerOnInitialEntitySpawnProcedure;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.syncher.EntityDataSerializers;
/*     */ import net.minecraft.network.syncher.SynchedEntityData;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobCategory;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ 
/*     */ public class PhantomPlayerEntity extends Monster {
/*  29 */   public static final EntityDataAccessor<Integer> DATA_AngerMeter = SynchedEntityData.defineId(PhantomPlayerEntity.class, EntityDataSerializers.INT);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public PhantomPlayerEntity(EntityType<PhantomPlayerEntity> type, Level world) {
/*  39 */     super(type, world);
/*  40 */     getAttribute(Attributes.STEP_HEIGHT).setBaseValue(0.6000000238418579D);
/*  41 */     this.xpReward = 0;
/*  42 */     setNoAi(true);
/*  43 */     setCustomName((Component)Component.literal("__blackout__"));
/*  44 */     setCustomNameVisible(true);
/*  45 */     setPersistenceRequired();
/*  46 */     this.moveControl = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/*  53 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/*  54 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/*  55 */     builder = builder.add(Attributes.MAX_HEALTH, 10.0D);
/*  56 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/*  57 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/*  58 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/*  59 */     builder = builder.add(Attributes.FLYING_SPEED, 0.3D);
/*  60 */     return builder;
/*     */   }
/*     */   
/*     */   protected void defineSynchedData(SynchedEntityData.Builder builder) {
/*  64 */     super.defineSynchedData(builder);
/*  65 */     builder.define(DATA_AngerMeter, Integer.valueOf(0));
/*     */   }
/*     */   
/*     */   protected PathNavigation createNavigation(Level world) {
/*  69 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public MobCategory getClassification(boolean forSpawnCount) {
/*  74 */     return MobCategory.MISC;
/*     */   }
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  78 */     return false;
/*     */   }
/*     */   
/*     */   public double getMyRidingOffset() {
/*  82 */     return -0.35D;
/*     */   }
/*     */   
/*     */   public boolean causeFallDamage(float l, float d, DamageSource source) {
/*  86 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata) {
/*  95 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata);
/*  96 */     PhantomPlayerOnInitialEntitySpawnProcedure.execute(getX(), getZ(), (Entity)this);
/*  97 */     return retval;
/*     */   }
/*     */   
/*     */   public void addAdditionalSaveData(CompoundTag compound) {
/* 101 */     super.addAdditionalSaveData(compound);
/* 102 */     compound.putInt("DataAngerMeter", ((Integer)this.entityData.get(DATA_AngerMeter)).intValue());
/*     */   }
/*     */   
/*     */   public void readAdditionalSaveData(CompoundTag compound) {
/* 106 */     super.readAdditionalSaveData(compound);
/* 107 */     if (compound.contains("DataAngerMeter")) {
/* 108 */       this.entityData.set(DATA_AngerMeter, Integer.valueOf(compound.getInt("DataAngerMeter")));
/*     */     }
/*     */   }
/*     */   
/*     */   public void baseTick() {
/* 113 */     super.baseTick();
/* 114 */     PhantomPlayerOnEntityTickUpdateProcedure.execute((LevelAccessor)
/* 115 */         level(), 
/* 116 */         getX(), 
/* 117 */         getY(), 
/* 118 */         getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isPushedByFluid() {
/* 124 */     double x = getX();
/* 125 */     double y = getY();
/* 126 */     double z = getZ();
/* 127 */     Level world = level();
/* 128 */     PhantomPlayerEntity entity = this;
/* 129 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */   
/*     */   public void setNoGravity(boolean ignored) {
/* 136 */     super.setNoGravity(true);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 140 */     super.aiStep();
/* 141 */     setNoGravity(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\PhantomPlayerEntity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */