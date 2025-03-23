/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSDataAttachments;
/*    */ import dev.wendigodrip.thebrokenscript.vars.PlayerVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class Corrupt1DisplayOverlayIngameProcedure {
/*    */   public static boolean execute(Entity entity) {
/*  9 */     if (entity == null) {
/* 10 */       return false;
/*    */     }
/*    */     
/* 13 */     PlayerVariables cap = (PlayerVariables)entity.getData(TBSDataAttachments.PLAYER_VARIABLES);
/*    */     
/* 15 */     return (cap.corrupted == 1.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\Corrupt1DisplayOverlayIngameProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */