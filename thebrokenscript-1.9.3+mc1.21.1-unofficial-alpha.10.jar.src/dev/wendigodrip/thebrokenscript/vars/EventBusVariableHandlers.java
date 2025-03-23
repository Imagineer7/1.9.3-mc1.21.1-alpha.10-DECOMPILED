/*    */ package dev.wendigodrip.thebrokenscript.vars;
/*    */ import dev.wendigodrip.thebrokenscript.network.SavedDataSyncMessage;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSDataAttachments;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.entity.player.PlayerEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\020\020\b\032\0020\0052\006\020\006\032\0020\tH\007J\020\020\n\032\0020\0052\006\020\006\032\0020\013H\007J\020\020\f\032\0020\0052\006\020\006\032\0020\rH\007J\020\020\016\032\0020\0052\006\020\006\032\0020\007H\007J\020\020\017\032\0020\0052\006\020\006\032\0020\013H\007¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/vars/EventBusVariableHandlers;", "", "<init>", "()V", "onPlayerLoggedInSyncPlayerVariables", "", "event", "Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$PlayerLoggedInEvent;", "onPlayerRespawnedSyncPlayerVariables", "Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$PlayerRespawnEvent;", "onPlayerChangedDimensionSyncPlayerVariables", "Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$PlayerChangedDimensionEvent;", "clonePlayer", "Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$Clone;", "onPlayerLoggedIn", "onPlayerChangedDimension", "thebrokenscript"})
/*    */ public final class EventBusVariableHandlers {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerLoggedInSyncPlayerVariables(@NotNull PlayerEvent.PlayerLoggedInEvent event) {
/* 16 */     Intrinsics.checkNotNullParameter(event, "event"); if (!event.getEntity().level().isClientSide()) {
/* 17 */       PlayerVariables vars = (PlayerVariables)event.getEntity().getData(TBSDataAttachments.PLAYER_VARIABLES);
/* 18 */       vars.syncPlayerVariables((Entity)event.getEntity());
/*    */     } 
/*    */   } @NotNull
/*    */   public static final EventBusVariableHandlers INSTANCE = new EventBusVariableHandlers();
/*    */   @SubscribeEvent
/*    */   public final void onPlayerRespawnedSyncPlayerVariables(@NotNull PlayerEvent.PlayerRespawnEvent event) {
/* 24 */     Intrinsics.checkNotNullParameter(event, "event"); if (!event.getEntity().level().isClientSide()) {
/* 25 */       PlayerVariables vars = (PlayerVariables)event.getEntity().getData(TBSDataAttachments.PLAYER_VARIABLES);
/* 26 */       vars.syncPlayerVariables((Entity)event.getEntity());
/*    */     } 
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public final void onPlayerChangedDimensionSyncPlayerVariables(@NotNull PlayerEvent.PlayerChangedDimensionEvent event) {
/* 32 */     Intrinsics.checkNotNullParameter(event, "event"); if (!event.getEntity().level().isClientSide()) {
/* 33 */       PlayerVariables vars = (PlayerVariables)event.getEntity().getData(TBSDataAttachments.PLAYER_VARIABLES);
/* 34 */       vars.syncPlayerVariables((Entity)event.getEntity());
/*    */     } 
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public final void clonePlayer(@NotNull PlayerEvent.Clone event) {
/* 40 */     Intrinsics.checkNotNullParameter(event, "event"); event.getOriginal().revive();
/* 41 */     PlayerVariables original = (PlayerVariables)event.getOriginal().getData(TBSDataAttachments.PLAYER_VARIABLES);
/* 42 */     PlayerVariables clone = (PlayerVariables)event.getEntity().getData(TBSDataAttachments.PLAYER_VARIABLES);
/* 43 */     clone.filecreated = original.filecreated;
/* 44 */     clone.corrupted = original.corrupted;
/* 45 */     clone.is_player_an_entity = original.is_player_an_entity;
/* 46 */     if (!event.isWasDeath()) {
/* 47 */       clone.screendamage = original.screendamage;
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public final void onPlayerLoggedIn(@NotNull PlayerEvent.PlayerLoggedInEvent event) {
/* 53 */     Intrinsics.checkNotNullParameter(event, "event"); if (!event.getEntity().level().isClientSide()) {
/* 54 */       Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); MapVariables mapdata = MapVariables.Companion.get((LevelAccessor)event.getEntity().level());
/* 55 */       WorldVariables worlddata = WorldVariables.get((LevelAccessor)event.getEntity().level());
/*    */       
/* 57 */       if (mapdata != null) {
/*    */         
/* 59 */         Intrinsics.checkNotNull(event.getEntity(), "null cannot be cast to non-null type net.minecraft.server.level.ServerPlayer"); PacketDistributor.sendToPlayer((ServerPlayer)event.getEntity(), (CustomPacketPayload)new SavedDataSyncMessage(0, mapdata), new CustomPacketPayload[0]);
/*    */       } 
/*    */ 
/*    */       
/* 63 */       if (worlddata != null) {
/*    */         
/* 65 */         Intrinsics.checkNotNull(event.getEntity(), "null cannot be cast to non-null type net.minecraft.server.level.ServerPlayer"); PacketDistributor.sendToPlayer((ServerPlayer)event.getEntity(), (CustomPacketPayload)new SavedDataSyncMessage(1, worlddata), new CustomPacketPayload[0]);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   @SubscribeEvent
/*    */   public final void onPlayerChangedDimension(@NotNull PlayerEvent.PlayerChangedDimensionEvent event) {
/* 73 */     Intrinsics.checkNotNullParameter(event, "event"); if (!event.getEntity().level().isClientSide()) {
/* 74 */       WorldVariables worldData; if (WorldVariables.get((LevelAccessor)event.getEntity().level()) == null) { WorldVariables.get((LevelAccessor)event.getEntity().level());
/*    */         return; }
/*    */       
/* 77 */       Intrinsics.checkNotNull(event.getEntity(), "null cannot be cast to non-null type net.minecraft.server.level.ServerPlayer"); PacketDistributor.sendToPlayer((ServerPlayer)event.getEntity(), (CustomPacketPayload)new SavedDataSyncMessage(1, worldData), new CustomPacketPayload[0]);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\vars\EventBusVariableHandlers.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */