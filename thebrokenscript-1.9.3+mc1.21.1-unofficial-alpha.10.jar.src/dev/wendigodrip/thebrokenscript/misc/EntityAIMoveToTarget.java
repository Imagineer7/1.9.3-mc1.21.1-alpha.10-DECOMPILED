/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\006\n\002\b\002\n\002\020\013\n\000\n\002\020\002\n\002\b\005\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\020\032\0020\021H\026J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\023H\026J\b\020\025\032\0020\023H\002J\b\020\026\032\0020\023H\002J\b\020\027\032\0020\023H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\020\020\b\032\004\030\0010\tX\016¢\006\002\n\000R\016\020\n\032\0020\013X\016¢\006\002\n\000R\016\020\f\032\0020\013X\016¢\006\002\n\000R\016\020\r\032\0020\016X\016¢\006\002\n\000R\016\020\017\032\0020\016X\016¢\006\002\n\000¨\006\030"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/EntityAIMoveToTarget;", "Lnet/minecraft/world/entity/ai/goal/Goal;", "entity", "Lnet/minecraft/world/entity/Mob;", "<init>", "(Lnet/minecraft/world/entity/Mob;)V", "level", "Lnet/minecraft/world/level/Level;", "target", "Lnet/minecraft/world/entity/LivingEntity;", "breakCooldown", "", "stuckTime", "lastX", "", "lastZ", "canUse", "", "start", "", "tick", "faceTarget", "handleObstacles", "checkIfStuck", "thebrokenscript"})
/*    */ public final class EntityAIMoveToTarget extends Goal {
/*    */   @NotNull
/*    */   private final Mob entity;
/*    */   @NotNull
/*    */   private final Level level;
/*    */   @Nullable
/*    */   private LivingEntity target;
/*    */   
/*    */   public EntityAIMoveToTarget(@NotNull Mob entity) {
/* 12 */     this.entity = entity;
/* 13 */     Intrinsics.checkNotNullExpressionValue(this.entity.level(), "level(...)"); this.level = this.entity.level();
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     setFlags(EnumSet.of((Enum)Goal.Flag.MOVE, (Enum)Goal.Flag.LOOK));
/*    */   }
/*    */   private int breakCooldown; private int stuckTime; private double lastX; private double lastZ;
/*    */   public boolean canUse() {
/* 25 */     this.target = this.entity.getTarget();
/* 26 */     Intrinsics.checkNotNull(this.target); return (this.target != null && this.target.isAlive());
/*    */   }
/*    */   
/*    */   public void start() {
/* 30 */     this.lastX = this.entity.getX();
/* 31 */     this.lastZ = this.entity.getZ();
/*    */   }
/*    */   
/*    */   public void tick() {
/* 35 */     if (this.target == null) {
/*    */       return;
/*    */     }
/* 38 */     faceTarget();
/* 39 */     this.entity.getNavigation().moveTo((Entity)this.target, 1.0D);
/* 40 */     handleObstacles();
/* 41 */     checkIfStuck();
/*    */   }
/*    */   
/*    */   private final void faceTarget() {
/* 45 */     Intrinsics.checkNotNull(this.target); double dx = this.target.getX() - this.entity.getX();
/* 46 */     Intrinsics.checkNotNull(this.target); double dz = this.target.getZ() - this.entity.getZ();
/* 47 */     float targetYaw = (float)(Mth.atan2(dz, dx) * 57.29577951308232D) - 90.0F;
/* 48 */     this.entity.setYRot(targetYaw);
/* 49 */     this.entity.yBodyRot = targetYaw;
/*    */   }
/*    */   
/*    */   private final void handleObstacles() {
/* 53 */     BlockPos above = this.entity.blockPosition().above();
/* 54 */     BlockState block = this.level.getBlockState(above);
/* 55 */     if (!block.isAir() && block.getDestroySpeed((BlockGetter)this.level, above) >= 0.0F) {
/* 56 */       if (this.breakCooldown <= 0) {
/* 57 */         this.level.destroyBlock(above, true);
/* 58 */         this.breakCooldown = 5;
/*    */       } else {
/* 60 */         this.breakCooldown--;
/*    */       } 
/*    */     }
/* 63 */     BlockPos below = this.entity.blockPosition().below();
/* 64 */     BlockPos twoBelow = below.below();
/* 65 */     if (this.level.getBlockState(below).isAir() && !this.level.getBlockState(twoBelow).isAir()) {
/* 66 */       this.level.setBlock(below, Blocks.DIRT.defaultBlockState(), 3);
/*    */     }
/*    */   }
/*    */   
/*    */   private final void checkIfStuck() {
/* 71 */     double deltaX = Math.abs(this.entity.getX() - this.lastX);
/* 72 */     double deltaZ = Math.abs(this.entity.getZ() - this.lastZ);
/* 73 */     this.stuckTime++; this.stuckTime = (deltaX < 0.05D && deltaZ < 0.05D) ? this.stuckTime : 0;
/* 74 */     this.lastX = this.entity.getX();
/* 75 */     this.lastZ = this.entity.getZ();
/* 76 */     if (this.stuckTime > 15) {
/* 77 */       BlockPos front = this.entity.blockPosition().relative(this.entity.getDirection());
/* 78 */       BlockState frontBlock = this.level.getBlockState(front);
/* 79 */       if (!frontBlock.isAir() && frontBlock.getDestroySpeed((BlockGetter)this.level, front) >= 0.0F) {
/* 80 */         this.level.destroyBlock(front, true);
/*    */       }
/* 82 */       this.stuckTime = 0;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\EntityAIMoveToTarget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */