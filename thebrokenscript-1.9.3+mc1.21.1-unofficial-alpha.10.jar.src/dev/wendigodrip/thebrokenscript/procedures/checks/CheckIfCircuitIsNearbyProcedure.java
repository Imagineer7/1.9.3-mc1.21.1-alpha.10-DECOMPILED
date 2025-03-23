/*    */ package dev.wendigodrip.thebrokenscript.procedures.checks;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J(\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\017"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/checks/CheckIfCircuitIsNearbyProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "thebrokenscript"})
/*    */ public final class CheckIfCircuitIsNearbyProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 16 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((LevelAccessor)event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
/*    */   } @NotNull
/*    */   public static final CheckIfCircuitIsNearbyProcedure INSTANCE = new CheckIfCircuitIsNearbyProcedure();
/*    */   private final void execute(LevelAccessor world, double x, double y, double z) {
/* 20 */     if (EntityFinder.INSTANCE.findEntitiesInRange(world, CircuitEntity.class, new Vec3(x, y, z), 1000.0D).isEmpty()) {
/* 21 */       MapVariables.Companion.get(world).setNoWayOutFrame(0.0D);
/* 22 */       MapVariables.Companion.get(world).syncData(world);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\checks\CheckIfCircuitIsNearbyProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */