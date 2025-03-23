/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.neoforge.event.entity.player.CanContinueSleepingEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J&\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fJ2\020\b\032\0020\0052\b\020\006\032\004\030\0010\0172\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/SleepProcedure;", "", "<init>", "()V", "onPlayerInBed", "", "event", "Lnet/neoforged/neoforge/event/entity/player/CanContinueSleepingEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class SleepProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerInBed(@NotNull CanContinueSleepingEvent event) {
/* 14 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     
/* 16 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), 
/* 17 */         event.getEntity().getX(), 
/* 18 */         event.getEntity().getY(), 
/* 19 */         event.getEntity().getZ());
/*    */   }
/*    */   @NotNull
/*    */   public static final SleepProcedure INSTANCE = new SleepProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 24 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z) {
/* 28 */     MapVariables.Companion.get(world).setHomeX(x);
/* 29 */     MapVariables.Companion.get(world).syncData(world);
/* 30 */     MapVariables.Companion.get(world).setHomeY(y);
/* 31 */     MapVariables.Companion.get(world).syncData(world);
/* 32 */     MapVariables.Companion.get(world).setHomeZ(z);
/* 33 */     MapVariables.Companion.get(world).syncData(world);
/* 34 */     MapVariables.Companion.get(world).setHasCircuitSpawned(false);
/* 35 */     MapVariables.Companion.get(world).syncData(world);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\SleepProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */