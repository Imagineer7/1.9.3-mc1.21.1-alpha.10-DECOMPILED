/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.entity.WrongOverlayEntity;
/*    */ import dev.wendigodrip.thebrokenscript.util.EntityFinder;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J(\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\rH\007J2\020\b\032\0020\t2\b\020\006\032\004\030\0010\0202\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\rH\002¨\006\021"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/CheckForScareEntityProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class CheckForScareEntityProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 17 */     Intrinsics.checkNotNullParameter(event, "event");
/* 18 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
/*    */   }
/*    */   @NotNull
/*    */   public static final CheckForScareEntityProcedure INSTANCE = new CheckForScareEntityProcedure();
/*    */   @JvmStatic
/*    */   public static final boolean execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 24 */     Intrinsics.checkNotNullParameter(world, "world"); return INSTANCE.execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private final boolean execute(Event event, LevelAccessor world, double x, double y, double z) {
/* 28 */     return 
/* 29 */       ((!EntityFinder.INSTANCE.findEntitiesInRange(world, NullScareEntity.class, new Vec3(x, y, z), 500.0D).isEmpty()) || (
/* 30 */       !EntityFinder.INSTANCE.findEntitiesInRange(world, WrongOverlayEntity.class, new Vec3(x, y, z), 500.0D).isEmpty()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\CheckForScareEntityProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */