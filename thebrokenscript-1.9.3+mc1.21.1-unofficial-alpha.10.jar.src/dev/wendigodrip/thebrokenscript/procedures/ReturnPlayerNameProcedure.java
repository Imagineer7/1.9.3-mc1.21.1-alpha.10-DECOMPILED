/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\022\020\b\032\0020\t2\b\020\n\032\004\030\0010\013H\007J\034\020\b\032\0020\t2\b\020\006\032\004\030\0010\f2\b\020\n\032\004\030\0010\013H\002¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/ReturnPlayerNameProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class ReturnPlayerNameProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 13 */     Intrinsics.checkNotNullParameter(event, "event"); execute((Event)event, (Entity)event.getEntity());
/*    */   } @NotNull
/*    */   public static final ReturnPlayerNameProcedure INSTANCE = new ReturnPlayerNameProcedure(); @JvmStatic
/*    */   @NotNull
/*    */   public static final String execute(@Nullable Entity entity) {
/* 18 */     return INSTANCE.execute(null, entity);
/*    */   }
/*    */   
/*    */   private final String execute(Event event, Entity entity) {
/* 22 */     if (entity == null) {
/* 23 */       return "";
/*    */     }
/* 25 */     Intrinsics.checkNotNull(entity.getDisplayName()); Intrinsics.checkNotNullExpressionValue(entity.getDisplayName().getString(), "getString(...)"); return entity.getDisplayName().getString();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\ReturnPlayerNameProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */