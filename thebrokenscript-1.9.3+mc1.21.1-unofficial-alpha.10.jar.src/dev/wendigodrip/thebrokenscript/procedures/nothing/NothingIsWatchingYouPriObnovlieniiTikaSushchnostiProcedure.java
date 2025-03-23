/*    */ package dev.wendigodrip.thebrokenscript.procedures.nothing;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class NothingIsWatchingYouPriObnovlieniiTikaSushchnostiProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null) {
/*    */       return;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), e -> true).isEmpty()) {
/*    */ 
/*    */       
/* 31 */       if (!entity.level().isClientSide()) {
/* 32 */         entity.discard();
/*    */       }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       LivingEntity _entity;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       Entity entity2;
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 49 */       if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 12.0D, 12.0D, 12.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 50 */         !(_entity = (LivingEntity)entity2).level().isClientSide())
/* 51 */         _entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 60, 1, false, false)); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nothing\NothingIsWatchingYouPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */