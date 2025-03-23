/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import java.util.Comparator;
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
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ExitOnTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 29 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 2.0D, 2.0D, 2.0D), e -> true).isEmpty()) {
/*    */       ServerPlayer _player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       Entity entity;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 44 */       if (entity = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof ServerPlayer && 
/* 45 */         !(_player = (ServerPlayer)entity).level().isClientSide()) {
/* 46 */         ResourceKey destinationType = Level.OVERWORLD;
/* 47 */         if (_player.level().dimension() == destinationType) {
/*    */           return;
/*    */         }
/* 50 */         ServerLevel nextLevel = _player.server.getLevel(destinationType);
/* 51 */         if (nextLevel != null) {
/* 52 */           _player.connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/*    */ 
/*    */ 
/*    */           
/* 56 */           _player.teleportTo(nextLevel, _player
/*    */               
/* 58 */               .getX(), _player
/* 59 */               .getY(), _player
/* 60 */               .getZ(), _player
/* 61 */               .getYRot(), _player
/* 62 */               .getXRot());
/*    */           
/* 64 */           _player.connection.send((Packet)new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
/* 65 */           for (MobEffectInstance _effectinstance : _player.getActiveEffects()) {
/* 66 */             _player.connection.send((Packet)new ClientboundUpdateMobEffectPacket(_player
/* 67 */                   .getId(), _effectinstance, false));
/*    */           }
/*    */ 
/*    */ 
/*    */           
/* 72 */           _player.connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\ExitOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */