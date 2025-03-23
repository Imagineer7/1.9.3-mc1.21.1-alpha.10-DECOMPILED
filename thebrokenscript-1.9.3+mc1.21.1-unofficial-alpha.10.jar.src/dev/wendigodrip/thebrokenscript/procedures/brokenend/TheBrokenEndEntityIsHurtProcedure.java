/*    */ package dev.wendigodrip.thebrokenscript.procedures.brokenend;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TheBrokenEndEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, Entity sourceentity) {
/* 11 */     if (sourceentity == null) {
/*    */       return;
/*    */     }
/* 14 */     sourceentity.hurt(new DamageSource((Holder)world
/* 15 */           .registryAccess()
/* 16 */           .registryOrThrow(Registries.DAMAGE_TYPE)
/* 17 */           .getHolderOrThrow(DamageTypes.PLAYER_ATTACK)), 10.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\brokenend\TheBrokenEndEntityIsHurtProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */