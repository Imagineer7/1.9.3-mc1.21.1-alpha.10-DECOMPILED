/*    */ package dev.wendigodrip.thebrokenscript.entity;
/*    */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.PathfinderMob;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.entity.ai.goal.Goal;
/*    */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*    */ import net.minecraft.world.level.Level;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\013\n\000\n\002\020\006\n\002\b\006\030\000 \0222\0020\001:\001\022B\037\022\016\020\002\032\n\022\006\022\004\030\0010\0000\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\b\032\0020\tH\024J\020\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\b\020\021\032\0020\tH\026R\021\020\016\032\0020\r8F¢\006\006\032\004\b\017\020\020¨\006\023"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/BanEntity;", "Lnet/minecraft/world/entity/monster/Monster;", "type", "Lnet/minecraft/world/entity/EntityType;", "world", "Lnet/minecraft/world/level/Level;", "<init>", "(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", "registerGoals", "", "removeWhenFarAway", "", "distanceToClosestPlayer", "", "myRidingOffset", "getMyRidingOffset", "()D", "baseTick", "Companion", "thebrokenscript"})
/*    */ public final class BanEntity extends Monster {
/*    */   public BanEntity(@NotNull EntityType type, @NotNull Level world) {
/* 20 */     super(type, world);
/*    */     
/* 22 */     if (getAttribute(Attributes.STEP_HEIGHT) != null) { getAttribute(Attributes.STEP_HEIGHT).setBaseValue(0.6D); } else { getAttribute(Attributes.STEP_HEIGHT); }
/*    */     
/* 24 */     this.xpReward = 0;
/* 25 */     setNoAi(false);
/* 26 */     setPersistenceRequired();
/*    */   } @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   protected void registerGoals() {
/* 30 */     super.registerGoals();
/*    */     
/* 32 */     this.goalSelector.addGoal(
/* 33 */         1, (Goal)new BanEntity$registerGoals$1(this));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     this.goalSelector.addGoal(2, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 40 */     this.targetSelector.addGoal(3, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/* 41 */     this.goalSelector.addGoal(4, (Goal)new RandomLookAroundGoal((Mob)this));
/* 42 */     this.goalSelector.addGoal(5, (Goal)new FloatGoal((Mob)this));
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\016\020\002\032\0020\0032\006\020\004\032\0020\005¨\006\006"}, d2 = {"dev/wendigodrip/thebrokenscript/entity/BanEntity$registerGoals$1", "Lnet/minecraft/world/entity/ai/goal/MeleeAttackGoal;", "getAttackReachSqr", "", "entity", "Lnet/minecraft/world/entity/LivingEntity;", "thebrokenscript"}) public static final class BanEntity$registerGoals$1 extends MeleeAttackGoal {
/*    */     BanEntity$registerGoals$1(BanEntity $receiver) { super((PathfinderMob)$receiver, 1.2D, false); } public final double getAttackReachSqr(LivingEntity entity) { Intrinsics.checkNotNullParameter(entity, "entity");
/*    */       return (Mth.square(this.mob.getBbWidth()) + entity.getBbWidth()); } }
/* 46 */   public boolean removeWhenFarAway(double distanceToClosestPlayer) { return false; }
/*    */ 
/*    */   
/*    */   public final double getMyRidingOffset() {
/* 50 */     return -0.35D;
/*    */   }
/*    */   public void baseTick() {
/* 53 */     super.baseTick();
/*    */     
/* 55 */     Level level = level();
/*    */     
/* 57 */     if (!((TBSConfigs.COMMON != null) ? ((TBSConfigs.COMMON.getDisableBanning() == true) ? 1 : 0) : 0)) {
/* 58 */       if (level instanceof ServerLevel) {
/* 59 */         for (ServerPlayer player : ((ServerLevel)level).players()) {
/* 60 */           player.connection.disconnect((Component)Component.literal("You are not whitelisted on this server."));
/*    */         }
/*    */       }
/* 63 */     } else if (!level.isClientSide()) {
/* 64 */       discard();
/*    */     } 
/*    */   }
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\006\020\006\032\0020\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/BanEntity$Companion;", "", "<init>", "()V", "init", "", "createAttributes", "Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", "thebrokenscript"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     public final void init() {}
/*    */     
/*    */     @NotNull
/*    */     public final AttributeSupplier.Builder createAttributes() {
/* 74 */       Intrinsics.checkNotNullExpressionValue(Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3D).add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.ARMOR, 0.0D).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.FOLLOW_RANGE, 16.0D), "add(...)"); return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3D).add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.ARMOR, 0.0D).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.FOLLOW_RANGE, 16.0D);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\BanEntity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */