/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class ItBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(Entity entity) {
/* 18 */     if (entity == null)
/*    */       return; 
/*    */     ServerPlayer _player;
/* 21 */     if (Math.random() < 0.7D && entity instanceof ServerPlayer && 
/*    */       
/* 23 */       !(_player = (ServerPlayer)entity).level().isClientSide()) {
/* 24 */       ResourceKey destinationType = Level.OVERWORLD;
/* 25 */       if (_player.level().dimension() == destinationType) {
/*    */         return;
/*    */       }
/* 28 */       ServerLevel nextLevel = _player.server.getLevel(destinationType);
/* 29 */       if (nextLevel != null) {
/* 30 */         _player.connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/*    */ 
/*    */ 
/*    */         
/* 34 */         _player.teleportTo(nextLevel, _player
/*    */             
/* 36 */             .getX(), _player
/* 37 */             .getY(), _player
/* 38 */             .getZ(), _player
/* 39 */             .getYRot(), _player
/* 40 */             .getXRot());
/*    */         
/* 42 */         _player.connection.send((Packet)new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
/* 43 */         for (MobEffectInstance _effectinstance : _player.getActiveEffects()) {
/* 44 */           _player.connection.send((Packet)new ClientboundUpdateMobEffectPacket(_player
/* 45 */                 .getId(), _effectinstance, false));
/*    */         }
/*    */ 
/*    */ 
/*    */         
/* 50 */         _player.connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\ItBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */