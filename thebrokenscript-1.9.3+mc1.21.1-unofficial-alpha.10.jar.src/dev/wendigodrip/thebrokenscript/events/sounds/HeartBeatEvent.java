/*    */ package dev.wendigodrip.thebrokenscript.events.sounds;
/*    */ import dev.wendigodrip.thebrokenscript.events.BaseEvent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/sounds/HeartBeatEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class HeartBeatEvent extends BaseEvent {
/*    */   public HeartBeatEvent() {
/* 11 */     super("heartbeat", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 13 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); onServer(new HeartBeatEvent$execute$1(TimeOfDay.NIGHT));
/*    */     
/* 15 */     if (Math.random() < 0.5D) {
/* 16 */       Intrinsics.checkNotNullExpressionValue(SoundEvents.AMBIENT_CAVE.value(), "value(...)"); BaseEvent.playSound$default(this, pos, (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), 1.0F, 0.0F, false, 16, null);
/* 17 */       Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getHEARTBEAT().value(), "value(...)"); BaseEvent.playSound$default(this, pos, (SoundEvent)TBSSounds.INSTANCE.getHEARTBEAT().value(), 1.0F, 1.0F, false, 16, null);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\sounds\HeartBeatEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */