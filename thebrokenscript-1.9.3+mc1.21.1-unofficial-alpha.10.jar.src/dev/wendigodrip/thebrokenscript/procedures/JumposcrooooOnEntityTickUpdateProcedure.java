/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class JumposcrooooOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, Entity entity) {
/*  9 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 12 */     TheBrokenScript.queueServerWork(20, () -> {
/*    */           if (!entity.level().isClientSide())
/*    */             entity.discard(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\JumposcrooooOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */