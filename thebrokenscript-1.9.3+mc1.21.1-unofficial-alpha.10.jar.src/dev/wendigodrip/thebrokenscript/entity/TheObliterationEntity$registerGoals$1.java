/*    */ package dev.wendigodrip.thebrokenscript.entity;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.PathfinderMob;
/*    */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*    */ import net.minecraft.world.phys.Vec3;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\n\020\002\032\004\030\0010\003H\024¨\006\004"}, d2 = {"dev/wendigodrip/thebrokenscript/entity/TheObliterationEntity$registerGoals$1", "Lnet/minecraft/world/entity/ai/goal/RandomStrollGoal;", "getPosition", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class TheObliterationEntity$registerGoals$1
/*    */   extends RandomStrollGoal
/*    */ {
/*    */   TheObliterationEntity$registerGoals$1() {
/* 76 */     super((PathfinderMob)$receiver, 0.8D, 20);
/*    */   } protected Vec3 getPosition() {
/* 78 */     RandomSource random = TheObliterationEntity.this.getRandom();
/* 79 */     double dir_x = TheObliterationEntity.this.getX() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 80 */     double dir_y = TheObliterationEntity.this.getY() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 81 */     double dir_z = TheObliterationEntity.this.getZ() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 82 */     return new Vec3(dir_x, dir_y, dir_z);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\TheObliterationEntity$registerGoals$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */