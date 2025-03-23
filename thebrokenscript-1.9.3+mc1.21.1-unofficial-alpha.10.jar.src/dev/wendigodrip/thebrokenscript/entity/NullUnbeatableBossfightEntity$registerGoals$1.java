/*    */ package dev.wendigodrip.thebrokenscript.entity;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.PathfinderMob;
/*    */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\006\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\b\020\004\032\004\030\0010\005¨\006\006"}, d2 = {"dev/wendigodrip/thebrokenscript/entity/NullUnbeatableBossfightEntity$registerGoals$1", "Lnet/minecraft/world/entity/ai/goal/MeleeAttackGoal;", "getAttackReachSqr", "", "entity", "Lnet/minecraft/world/entity/LivingEntity;", "thebrokenscript"})
/*    */ public final class NullUnbeatableBossfightEntity$registerGoals$1
/*    */   extends MeleeAttackGoal
/*    */ {
/*    */   NullUnbeatableBossfightEntity$registerGoals$1(NullUnbeatableBossfightEntity $receiver) {
/* 57 */     super((PathfinderMob)$receiver, 1.2D, false);
/*    */   } public final double getAttackReachSqr(LivingEntity entity) {
/* 59 */     return 16.0D;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\NullUnbeatableBossfightEntity$registerGoals$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */