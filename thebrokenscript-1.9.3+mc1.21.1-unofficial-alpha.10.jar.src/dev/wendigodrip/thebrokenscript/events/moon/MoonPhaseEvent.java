/*    */ package dev.wendigodrip.thebrokenscript.events.moon;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/moon/MoonPhaseEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class MoonPhaseEvent extends BaseEvent {
/*    */   public MoonPhaseEvent() {
/*  9 */     super("moon_phase", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 11 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); MapVariables vars = MapVariables.Companion.get((LevelAccessor)level);
/*    */     
/* 13 */     if (level.dimensionType().moonPhase(level.dayTime()) == 1) {
/* 14 */       vars.setMoonPhase(vars.getMoonPhase() + 1.0D);
/* 15 */       vars.syncData((LevelAccessor)level);
/*    */     } 
/*    */     
/* 18 */     if (level.dimensionType().moonPhase(level.dayTime()) == 8) {
/* 19 */       vars.setMoonPhase(vars.getMoonPhase() + 1.0D);
/* 20 */       vars.syncData((LevelAccessor)level);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\moon\MoonPhaseEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */