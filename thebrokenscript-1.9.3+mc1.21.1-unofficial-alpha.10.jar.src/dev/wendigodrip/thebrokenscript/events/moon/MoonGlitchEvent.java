/*    */ package dev.wendigodrip.thebrokenscript.events.moon;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/moon/MoonGlitchEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class MoonGlitchEvent extends BaseEvent {
/*    */   public MoonGlitchEvent() {
/* 10 */     super("moon_glitch", 1);
/*    */   }
/* 12 */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getMOONGLITCH().get(), "get(...)"); BaseEvent.playSound$default(this, pos, (SoundEvent)TBSSounds.INSTANCE.getMOONGLITCH().get(), 555.0F, 1.0F, false, 16, null);
/*    */ 
/*    */     
/* 15 */     EventState.moonGlitchActive = true;
/*    */     
/* 17 */     doWork(6000, MoonGlitchEvent::execute$lambda$0); } private static final Unit execute$lambda$0() {
/* 18 */     EventState.moonGlitchActive = false;
/* 19 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\moon\MoonGlitchEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */