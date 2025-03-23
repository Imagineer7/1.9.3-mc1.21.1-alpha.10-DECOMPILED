/*    */ package dev.wendigodrip.thebrokenscript.procedures.jframe;
/*    */ import dev.wendigodrip.thebrokenscript.entity.Jframe4entityEntity;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J(\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\rH\007J2\020\b\032\0020\t2\b\020\006\032\004\030\0010\0202\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\rH\002¨\006\021"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/jframe/Jframe4UsloviiePokazaNalozhieniiaProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class Jframe4UsloviiePokazaNalozhieniiaProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 16 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     
/* 18 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), 
/* 19 */         event.getEntity().getX(), 
/* 20 */         event.getEntity().getY(), 
/* 21 */         event.getEntity().getZ());
/*    */   }
/*    */   @NotNull
/*    */   public static final Jframe4UsloviiePokazaNalozhieniiaProcedure INSTANCE = new Jframe4UsloviiePokazaNalozhieniiaProcedure();
/*    */   @JvmStatic
/*    */   public static final boolean execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 27 */     Intrinsics.checkNotNullParameter(world, "world"); return INSTANCE.execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private final boolean execute(Event event, LevelAccessor world, double x, double y, double z) {
/* 31 */     return 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 39 */       !world.getEntitiesOfClass(Jframe4entityEntity.class, AABB.ofSize(new Vec3(x, y, z), 300.0D, 300.0D, 300.0D), Jframe4UsloviiePokazaNalozhieniiaProcedure::execute$lambda$0::execute$lambda$1).isEmpty(); } private static final boolean execute$lambda$0(Jframe4entityEntity e) { return true; } private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\jframe\Jframe4UsloviiePokazaNalozhieniiaProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */