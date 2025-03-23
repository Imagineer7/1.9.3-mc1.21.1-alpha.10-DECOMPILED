/*   */ package dev.wendigodrip.thebrokenscript.procedures;
/*   */ import net.minecraft.world.level.LevelAccessor;
/*   */ import org.jetbrains.annotations.NotNull;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/Overlay1DisplayOverlayIngameProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "thebrokenscript"})
/*   */ public final class Overlay1DisplayOverlayIngameProcedure {
/*   */   public final boolean execute(@NotNull LevelAccessor world) {
/* 8 */     Intrinsics.checkNotNullParameter(world, "world"); return MapVariables.Companion.get(world).getShowvhs();
/*   */   }
/*   */   
/*   */   @NotNull
/*   */   public static final Overlay1DisplayOverlayIngameProcedure INSTANCE = new Overlay1DisplayOverlayIngameProcedure();
/*   */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\Overlay1DisplayOverlayIngameProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */