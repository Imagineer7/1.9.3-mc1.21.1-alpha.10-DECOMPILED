/*    */ package dev.wendigodrip.thebrokenscript.events.nullent.interfaces;
/*    */ import dev.wendigodrip.thebrokenscript.events.BaseEvent;
/*    */ import net.minecraft.world.level.Level;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/nullent/interfaces/NullInterfaceTriggerEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "executor", "Ldev/wendigodrip/thebrokenscript/engine/EventExecutor;", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class NullInterfaceTriggerEvent extends BaseEvent {
/*    */   public NullInterfaceTriggerEvent() {
/*  9 */     super("null_interface", 1);
/*    */ 
/*    */     
/* 12 */     BaseEvent[] arrayOfBaseEvent = new BaseEvent[3]; arrayOfBaseEvent[0] = new NullInterface1Event(); arrayOfBaseEvent[1] = new NullInterface2Event(); arrayOfBaseEvent[2] = new NullInterface3Event(); this.executor = new EventExecutor(CollectionsKt.listOf((Object[])arrayOfBaseEvent));
/*    */   }
/*    */   @NotNull
/*    */   private final EventExecutor executor;
/*    */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 17 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); if (this.executor.pickRandom() != null) { this.executor.pickRandom().run(level, entity); } else { this.executor.pickRandom(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\nullent\interfaces\NullInterfaceTriggerEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */