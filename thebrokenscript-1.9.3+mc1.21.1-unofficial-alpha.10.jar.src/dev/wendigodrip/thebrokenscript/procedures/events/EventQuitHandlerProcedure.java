/*    */ package dev.wendigodrip.thebrokenscript.procedures.events;
/*    */ import dev.wendigodrip.thebrokenscript.vars.PlayerVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.ServerChatEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\020\020\b\032\0020\0052\b\020\t\032\004\030\0010\nJ\034\020\b\032\0020\0052\b\020\006\032\004\030\0010\0132\b\020\t\032\004\030\0010\nH\002¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/events/EventQuitHandlerProcedure;", "", "<init>", "()V", "onChat", "", "event", "Lnet/neoforged/neoforge/event/ServerChatEvent;", "execute", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class EventQuitHandlerProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onChat(@NotNull ServerChatEvent event) {
/* 14 */     Intrinsics.checkNotNullParameter(event, "event"); execute((Event)event, (Entity)event.getPlayer());
/*    */   } @NotNull
/*    */   public static final EventQuitHandlerProcedure INSTANCE = new EventQuitHandlerProcedure();
/*    */   public final void execute(@Nullable Entity entity) {
/* 18 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, Entity entity) {
/* 22 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 25 */     boolean _setval = true;
/* 26 */     PlayerVariables vars = (PlayerVariables)entity.getData(TBSDataAttachments.PLAYER_VARIABLES);
/* 27 */     vars.is_player_an_entity = _setval;
/* 28 */     vars.syncPlayerVariables(entity);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\events\EventQuitHandlerProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */