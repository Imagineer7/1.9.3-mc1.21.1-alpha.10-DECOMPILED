/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.entity.player.PlayerEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J0\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020J<\020\b\032\0020\0052\b\020\006\032\004\030\0010\0212\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020H\002¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/PlayerJoinsMoonGlitchProcedure;", "", "<init>", "()V", "onPlayerLoggedIn", "", "event", "Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$PlayerLoggedInEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class PlayerJoinsMoonGlitchProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerLoggedIn(@NotNull PlayerEvent.PlayerLoggedInEvent event) {
/* 22 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     
/* 24 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), 
/* 25 */         event.getEntity().getX(), 
/* 26 */         event.getEntity().getY(), 
/* 27 */         event.getEntity().getZ(), 
/* 28 */         (Entity)event.getEntity());
/*    */   }
/*    */   @NotNull
/*    */   public static final PlayerJoinsMoonGlitchProcedure INSTANCE = new PlayerJoinsMoonGlitchProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/* 33 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z, entity);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 44 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 47 */     TheBrokenScript.queueServerWork(
/* 48 */         12000, 
/* 49 */         PlayerJoinsMoonGlitchProcedure::execute$lambda$0);
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$0() {}
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\PlayerJoinsMoonGlitchProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */