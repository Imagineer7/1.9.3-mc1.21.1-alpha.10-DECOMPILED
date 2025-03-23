/*    */ package dev.wendigodrip.thebrokenscript.util;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.Position;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\007\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J8\020\004\032\0020\005*\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\f2\b\b\002\020\016\032\0020\017J8\020\020\032\0020\005*\0020\0212\006\020\007\032\0020\b2\006\020\t\032\0020\n2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\f2\b\b\002\020\016\032\0020\017¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/util/WorldExt;", "", "<init>", "()V", "playSound", "", "Lnet/minecraft/world/level/LevelAccessor;", "pos", "Lnet/minecraft/world/phys/Vec3;", "sound", "Lnet/minecraft/sounds/SoundEvent;", "volume", "", "pitch", "source", "Lnet/minecraft/sounds/SoundSource;", "tryPlaySound", "Lnet/minecraft/world/level/Level;", "thebrokenscript"})
/*    */ public final class WorldExt {
/*    */   public final void playSound(@NotNull LevelAccessor $this$playSound, @NotNull Vec3 pos, @NotNull SoundEvent sound, float volume, float pitch, @NotNull SoundSource source) {
/* 14 */     Intrinsics.checkNotNullParameter($this$playSound, "<this>"); Intrinsics.checkNotNullParameter(pos, "pos"); Intrinsics.checkNotNullParameter(sound, "sound"); Intrinsics.checkNotNullParameter(source, "source"); if ($this$playSound instanceof Level)
/* 15 */       tryPlaySound((Level)$this$playSound, pos, sound, volume, pitch, source); 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final WorldExt INSTANCE = new WorldExt();
/*    */   
/*    */   public final void tryPlaySound(@NotNull Level $this$tryPlaySound, @NotNull Vec3 pos, @NotNull SoundEvent sound, float volume, float pitch, @NotNull SoundSource source) {
/* 22 */     Intrinsics.checkNotNullParameter($this$tryPlaySound, "<this>"); Intrinsics.checkNotNullParameter(pos, "pos"); Intrinsics.checkNotNullParameter(sound, "sound"); Intrinsics.checkNotNullParameter(source, "source"); if (!$this$tryPlaySound.isClientSide()) {
/* 23 */       $this$tryPlaySound.playSound(null, BlockPos.containing((Position)pos), sound, source, volume, pitch);
/*    */     } else {
/* 25 */       $this$tryPlaySound.playLocalSound(pos.x, pos.y, pos.z, sound, source, volume, pitch, false);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscrip\\util\WorldExt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */