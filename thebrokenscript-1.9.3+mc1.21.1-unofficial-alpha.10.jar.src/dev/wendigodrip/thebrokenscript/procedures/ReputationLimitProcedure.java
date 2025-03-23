/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.neoforge.event.tick.LevelTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\016\020\b\032\0020\0052\006\020\t\032\0020\nJ\032\020\b\032\0020\0052\b\020\006\032\004\030\0010\0132\006\020\t\032\0020\nH\002¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/ReputationLimitProcedure;", "", "<init>", "()V", "onWorldTick", "", "event", "Lnet/neoforged/neoforge/event/tick/LevelTickEvent$Post;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class ReputationLimitProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onWorldTick(@NotNull LevelTickEvent.Post event) {
/* 14 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getLevel(), "getLevel(...)"); execute((Event)event, (LevelAccessor)event.getLevel());
/*    */   } @NotNull
/*    */   public static final ReputationLimitProcedure INSTANCE = new ReputationLimitProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world) {
/* 18 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world) {
/* 22 */     if (MapVariables.Companion.get(world).getEntityReputation() < 0.0D) {
/* 23 */       MapVariables.Companion.get(world).setEntityReputation(0.0D);
/* 24 */       MapVariables.Companion.get(world).syncData(world);
/*    */     } 
/* 26 */     if (MapVariables.Companion.get(world).getEntityReputation() > 2.0D) {
/* 27 */       MapVariables.Companion.get(world).setEntityReputation(2.0D);
/* 28 */       MapVariables.Companion.get(world).syncData(world);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\ReputationLimitProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */