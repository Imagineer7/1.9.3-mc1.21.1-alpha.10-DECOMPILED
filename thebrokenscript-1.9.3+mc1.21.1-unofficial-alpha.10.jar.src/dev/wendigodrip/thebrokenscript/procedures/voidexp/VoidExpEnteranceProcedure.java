/*    */ package dev.wendigodrip.thebrokenscript.procedures.voidexp;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\006\n\000\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\030\020\b\032\0020\0052\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fJ$\020\b\032\0020\0052\b\020\006\032\004\030\0010\r2\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\002¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/voidexp/VoidExpEnteranceProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "y", "", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class VoidExpEnteranceProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 27 */     Intrinsics.checkNotNullParameter(event, "event"); execute((Event)event, event.getEntity().getY(), (Entity)event.getEntity());
/*    */   } @NotNull
/*    */   public static final VoidExpEnteranceProcedure INSTANCE = new VoidExpEnteranceProcedure();
/*    */   public final void execute(double y, @Nullable Entity entity) {
/* 31 */     execute(null, y, entity);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, double y, Entity entity) {
/* 35 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 38 */     if ((y == -80.0D)) {
/* 39 */       if (entity instanceof Player && !((Player)entity).level().isClientSide()) {
/* 40 */         ((Player)entity).displayClientMessage((Component)Component.literal("ERR.INTEGRITY"), true);
/*    */       }
/* 42 */       if (entity instanceof LivingEntity && !((LivingEntity)entity).level().isClientSide()) {
/* 43 */         ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 40, 1, false, false));
/*    */       }
/* 45 */       if (entity instanceof ServerPlayer && !((ServerPlayer)entity).level().isClientSide()) {
/* 46 */         ResourceKey destinationType = ResourceKey.create(
/* 47 */             Registries.DIMENSION, 
/* 48 */             TBSConstants.id("day_b"));
/*    */ 
/*    */         
/* 51 */         if (((ServerPlayer)entity).level().dimension() == destinationType) {
/*    */           return;
/*    */         }
/*    */         
/* 55 */         Intrinsics.checkNotNull(((ServerPlayer)entity).getServer()); ServerLevel nextLevel = ((ServerPlayer)entity).getServer().getLevel(destinationType);
/*    */         
/* 57 */         if (nextLevel != null) {
/* 58 */           ((ServerPlayer)entity).connection.send(
/* 59 */               (Packet)new ClientboundGameEventPacket(
/* 60 */                 ClientboundGameEventPacket.WIN_GAME, 
/* 61 */                 0.0F));
/*    */ 
/*    */ 
/*    */           
/* 65 */           ((ServerPlayer)entity).teleportTo(
/* 66 */               nextLevel, (
/* 67 */               (ServerPlayer)entity).getX(), (
/* 68 */               (ServerPlayer)entity).getY(), (
/* 69 */               (ServerPlayer)entity).getZ(), (
/* 70 */               (ServerPlayer)entity).getYRot(), (
/* 71 */               (ServerPlayer)entity).getXRot());
/*    */ 
/*    */           
/* 74 */           ((ServerPlayer)entity).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((ServerPlayer)entity).getAbilities()));
/*    */           
/* 76 */           for (MobEffectInstance effect : ((ServerPlayer)entity).getActiveEffects()) {
/* 77 */             ((ServerPlayer)entity).connection.send(
/* 78 */                 (Packet)new ClientboundUpdateMobEffectPacket((
/* 79 */                   (ServerPlayer)entity).getId(), 
/* 80 */                   effect, 
/* 81 */                   false));
/*    */           }
/*    */ 
/*    */ 
/*    */           
/* 86 */           ((ServerPlayer)entity).connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\voidexp\VoidExpEnteranceProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */