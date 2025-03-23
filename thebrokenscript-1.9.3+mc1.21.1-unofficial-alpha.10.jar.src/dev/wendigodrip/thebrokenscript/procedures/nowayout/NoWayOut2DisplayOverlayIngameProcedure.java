/*   */ package dev.wendigodrip.thebrokenscript.procedures.nowayout;
/*   */ 
/*   */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*   */ import net.minecraft.world.level.LevelAccessor;
/*   */ 
/*   */ public class NoWayOut2DisplayOverlayIngameProcedure {
/*   */   public static boolean execute(LevelAccessor world) {
/* 8 */     return (MapVariables.get(world).getNoWayOutFrame() == 2.0D);
/*   */   }
/*   */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nowayout\NoWayOut2DisplayOverlayIngameProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */