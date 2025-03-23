/*    */ package dev.wendigodrip.thebrokenscript.util;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\020\n\000\n\002\020\t\n\002\b\t\n\002\020\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\b\002\030\000 \0212\b\022\004\022\0020\0000\001:\001\021B\021\b\002\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\016\020\f\032\0020\r2\006\020\016\032\0020\017J\016\020\f\032\0020\r2\006\020\016\032\0020\020R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/util/TimeOfDay;", "", "time", "", "<init>", "(Ljava/lang/String;IJ)V", "getTime", "()J", "DAY", "NOON", "NIGHT", "MIDNIGHT", "set", "", "level", "Lnet/minecraft/world/level/LevelAccessor;", "Lnet/minecraft/server/level/ServerLevel;", "Companion", "thebrokenscript"})
/*    */ public enum TimeOfDay {
/*  7 */   DAY(1000L), NOON(6000L), NIGHT(13000L), MIDNIGHT(18000L); @NotNull public static final Companion Companion; private final long time; static { Companion = new Companion(null); }
/*    */   private static final int TICKS_PER_DAY = 24000;
/*    */   TimeOfDay(long time) { this.time = time; } public final long getTime() { return this.time; } public final void set(@NotNull LevelAccessor level) {
/* 10 */     Intrinsics.checkNotNullParameter(level, "level"); if (level instanceof ServerLevel) set((ServerLevel)level); 
/*    */   }
/*    */   
/*    */   public final void set(@NotNull ServerLevel level) {
/* 14 */     Intrinsics.checkNotNullParameter(level, "level"); Companion.set(level, this);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013J\026\020\006\032\0020\0072\006\020\b\032\0020\f2\006\020\n\032\0020\013R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/util/TimeOfDay$Companion;", "", "<init>", "()V", "TICKS_PER_DAY", "", "set", "", "level", "Lnet/minecraft/world/level/LevelAccessor;", "target", "Ldev/wendigodrip/thebrokenscript/util/TimeOfDay;", "Lnet/minecraft/server/level/ServerLevel;", "thebrokenscript"})
/*    */   public static final class Companion { private Companion() {}
/*    */     
/*    */     public final void set(@NotNull LevelAccessor level, @NotNull TimeOfDay target) {
/* 21 */       Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(target, "target"); if (level instanceof ServerLevel) set((ServerLevel)level, target); 
/*    */     }
/*    */     
/*    */     public final void set(@NotNull ServerLevel level, @NotNull TimeOfDay target) {
/* 25 */       Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(target, "target"); long currentTime = level.getDayTime();
/* 26 */       long currentTimeInDay = currentTime % 24000L;
/*    */       
/* 28 */       if (currentTimeInDay > target.getTime()) {
/* 29 */         long needed = 24000L - currentTimeInDay + target.getTime();
/*    */         
/* 31 */         level.setDayTime(level.getDayTime() + needed);
/* 32 */       } else if (target.getTime() > currentTimeInDay) {
/* 33 */         level.setDayTime(level.getDayTime() + target.getTime() - currentTimeInDay);
/*    */       } 
/*    */     } } @NotNull
/*    */   public static EnumEntries<TimeOfDay> getEntries() {
/* 37 */     return $ENTRIES;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscrip\\util\TimeOfDay.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */