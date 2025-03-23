/*    */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class CircuitDisguisedAsCreeperEntityIsHurtProcedure {
/*    */   public static void execute(Entity entity) {
/*  7 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 10 */     if (!entity.level().isClientSide())
/* 11 */       entity.discard(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitDisguisedAsCreeperEntityIsHurtProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */