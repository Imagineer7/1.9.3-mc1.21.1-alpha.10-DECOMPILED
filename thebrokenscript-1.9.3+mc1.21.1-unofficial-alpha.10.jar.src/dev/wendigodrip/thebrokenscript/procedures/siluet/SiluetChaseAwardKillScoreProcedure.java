package dev.wendigodrip.thebrokenscript.procedures.siluet;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import net.minecraft.world.level.LevelAccessor;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\tH\007¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/siluet/SiluetChaseAwardKillScoreProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "thebrokenscript"})
public final class SiluetChaseAwardKillScoreProcedure {
  @NotNull
  public static final SiluetChaseAwardKillScoreProcedure INSTANCE = new SiluetChaseAwardKillScoreProcedure();
  
  @JvmStatic
  public static final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'world'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
    //   9: aload_0
    //   10: ldc dev/wendigodrip/thebrokenscript/entity/SiluetChaseEntity
    //   12: new net/minecraft/world/phys/Vec3
    //   15: dup
    //   16: dload_1
    //   17: dload_3
    //   18: dload #5
    //   20: invokespecial <init> : (DDD)V
    //   23: ldc2_w 4.0
    //   26: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
    //   29: checkcast dev/wendigodrip/thebrokenscript/entity/SiluetChaseEntity
    //   32: astore #7
    //   34: aload #7
    //   36: ifnull -> 68
    //   39: aload #7
    //   41: invokevirtual level : ()Lnet/minecraft/world/level/Level;
    //   44: astore #8
    //   46: aload #8
    //   48: ifnull -> 68
    //   51: aload #8
    //   53: invokevirtual isClientSide : ()Z
    //   56: iconst_1
    //   57: if_icmpne -> 64
    //   60: iconst_1
    //   61: goto -> 69
    //   64: iconst_0
    //   65: goto -> 69
    //   68: iconst_0
    //   69: ifne -> 109
    //   72: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
    //   75: aload_0
    //   76: ldc dev/wendigodrip/thebrokenscript/entity/SiluetChaseEntity
    //   78: new net/minecraft/world/phys/Vec3
    //   81: dup
    //   82: dload_1
    //   83: dload_3
    //   84: dload #5
    //   86: invokespecial <init> : (DDD)V
    //   89: ldc2_w 4.0
    //   92: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
    //   95: checkcast dev/wendigodrip/thebrokenscript/entity/SiluetChaseEntity
    //   98: dup
    //   99: ifnull -> 108
    //   102: invokevirtual discard : ()V
    //   105: goto -> 109
    //   108: pop
    //   109: bipush #20
    //   111: aload_0
    //   112: dload_1
    //   113: dload_3
    //   114: dload #5
    //   116: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
    //   121: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
    //   124: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #13	-> 6
    //   #14	-> 6
    //   #13	-> 6
    //   #14	-> 46
    //   #13	-> 51
    //   #14	-> 53
    //   #13	-> 57
    //   #16	-> 72
    //   #19	-> 109
    //   #26	-> 124
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	125	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	125	1	x	D
    //   0	125	3	y	D
    //   0	125	5	z	D
  }
  
  private static final void execute$lambda$0(LevelAccessor $world, double $x, double $y, double $z) {
    // Byte code:
    //   0: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
    //   3: aload_0
    //   4: ldc dev/wendigodrip/thebrokenscript/entity/StrikeEntity
    //   6: new net/minecraft/world/phys/Vec3
    //   9: dup
    //   10: dload_1
    //   11: dload_3
    //   12: dload #5
    //   14: invokespecial <init> : (DDD)V
    //   17: ldc2_w 4.0
    //   20: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
    //   23: checkcast dev/wendigodrip/thebrokenscript/entity/StrikeEntity
    //   26: astore #7
    //   28: aload #7
    //   30: ifnull -> 62
    //   33: aload #7
    //   35: invokevirtual level : ()Lnet/minecraft/world/level/Level;
    //   38: astore #8
    //   40: aload #8
    //   42: ifnull -> 62
    //   45: aload #8
    //   47: invokevirtual isClientSide : ()Z
    //   50: iconst_1
    //   51: if_icmpne -> 58
    //   54: iconst_1
    //   55: goto -> 63
    //   58: iconst_0
    //   59: goto -> 63
    //   62: iconst_0
    //   63: ifne -> 103
    //   66: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
    //   69: aload_0
    //   70: ldc dev/wendigodrip/thebrokenscript/entity/StrikeEntity
    //   72: new net/minecraft/world/phys/Vec3
    //   75: dup
    //   76: dload_1
    //   77: dload_3
    //   78: dload #5
    //   80: invokespecial <init> : (DDD)V
    //   83: ldc2_w 4.0
    //   86: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
    //   89: checkcast dev/wendigodrip/thebrokenscript/entity/StrikeEntity
    //   92: dup
    //   93: ifnull -> 102
    //   96: invokevirtual discard : ()V
    //   99: goto -> 103
    //   102: pop
    //   103: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #20	-> 0
    //   #21	-> 0
    //   #20	-> 0
    //   #21	-> 40
    //   #20	-> 45
    //   #21	-> 47
    //   #20	-> 51
    //   #23	-> 66
    //   #25	-> 103
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	104	0	$world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	104	1	$x	D
    //   0	104	3	$y	D
    //   0	104	5	$z	D
  }
}


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\siluet\SiluetChaseAwardKillScoreProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */