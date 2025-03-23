/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\007J\006\020\b\032\0020\005J\022\020\b\032\0020\0052\b\020\006\032\004\030\0010\tH\002¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/LoudProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class LoudProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@Nullable PlayerTickEvent.Post event) {
/* 12 */     execute((Event)event);
/*    */   } @NotNull
/*    */   public static final LoudProcedure INSTANCE = new LoudProcedure();
/*    */   public final void execute() {
/* 16 */     execute(null);
/*    */   }
/*    */   
/*    */   private final void execute(Event event) {}
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\LoudProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */