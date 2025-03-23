/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ public class PhantomPlayerOnInitialEntitySpawnProcedure {
/*    */   public static void execute(double x, double z, Entity entity) {
/*  8 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 11 */     Entity _ent = entity;
/* 12 */     _ent.teleportTo(x, 100.0D, z);
/* 13 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 14 */       _serverPlayer.connection.teleport(x, 100.0D, z, _ent.getYRot(), _ent.getXRot()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\PhantomPlayerOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */