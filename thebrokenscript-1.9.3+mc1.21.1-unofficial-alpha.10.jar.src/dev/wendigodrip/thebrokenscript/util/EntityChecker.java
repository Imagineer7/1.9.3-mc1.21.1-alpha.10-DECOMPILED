/*    */ package dev.wendigodrip.thebrokenscript.util;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class EntityChecker
/*    */ {
/*    */   public static boolean isCustomEntityNearby(@Nullable Player player, Class<? extends Entity> entity) {
/* 12 */     Level level = (player == null) ? null : player.level();
/*    */     
/* 14 */     if (level == null) {
/* 15 */       return false;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 24 */     AABB boundingBox = new AABB(player.getX() - 1000.0D, player.getY() - 1000.0D, player.getZ() - 1000.0D, player.getX() + 1000.0D, player.getY() + 1000.0D, player.getZ() + 1000.0D);
/*    */ 
/*    */     
/* 27 */     return !level.getEntitiesOfClass(entity, boundingBox).isEmpty();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscrip\\util\EntityChecker.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */