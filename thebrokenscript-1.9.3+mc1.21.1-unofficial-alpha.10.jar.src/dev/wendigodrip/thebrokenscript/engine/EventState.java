package dev.wendigodrip.thebrokenscript.engine;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\013\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\022\020\006\032\0020\0078\006@\006X\016¢\006\002\n\000¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/engine/EventState;", "", "<init>", "()V", "MOON_GLITCH_DURATION_SECS", "", "moonGlitchActive", "", "thebrokenscript"})
public final class EventState {
  @NotNull
  public static final EventState INSTANCE = new EventState();
  
  public static final int MOON_GLITCH_DURATION_SECS = 300;
  
  @JvmField
  public static boolean moonGlitchActive;
}


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\engine\EventState.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */