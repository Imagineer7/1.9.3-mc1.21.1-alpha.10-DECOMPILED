/*    */ package dev.wendigodrip.thebrokenscript.util;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013J\026\020\006\032\0020\0072\006\020\b\032\0020\f2\006\020\n\032\0020\013R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/util/TimeOfDay$Companion;", "", "<init>", "()V", "TICKS_PER_DAY", "", "set", "", "level", "Lnet/minecraft/world/level/LevelAccessor;", "target", "Ldev/wendigodrip/thebrokenscript/util/TimeOfDay;", "Lnet/minecraft/server/level/ServerLevel;", "thebrokenscript"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   public final void set(@NotNull LevelAccessor level, @NotNull TimeOfDay target) {
/* 21 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(target, "target"); if (level instanceof ServerLevel) set((ServerLevel)level, target); 
/*    */   }
/*    */   
/*    */   public final void set(@NotNull ServerLevel level, @NotNull TimeOfDay target) {
/* 25 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(target, "target"); long currentTime = level.getDayTime();
/* 26 */     long currentTimeInDay = currentTime % 24000L;
/*    */     
/* 28 */     if (currentTimeInDay > target.getTime()) {
/* 29 */       long needed = 24000L - currentTimeInDay + target.getTime();
/*    */       
/* 31 */       level.setDayTime(level.getDayTime() + needed);
/* 32 */     } else if (target.getTime() > currentTimeInDay) {
/* 33 */       level.setDayTime(level.getDayTime() + target.getTime() - currentTimeInDay);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscrip\\util\TimeOfDay$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */