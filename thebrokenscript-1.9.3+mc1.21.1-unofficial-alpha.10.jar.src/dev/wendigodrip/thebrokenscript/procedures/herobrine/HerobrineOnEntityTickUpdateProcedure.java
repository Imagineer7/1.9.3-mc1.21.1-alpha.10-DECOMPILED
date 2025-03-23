package dev.wendigodrip.thebrokenscript.procedures.herobrine;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/herobrine/HerobrineOnEntityTickUpdateProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
@SourceDebugExtension({"SMAP\nHerobrineOnEntityTickUpdateProcedure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HerobrineOnEntityTickUpdateProcedure.kt\ndev/wendigodrip/thebrokenscript/procedures/herobrine/HerobrineOnEntityTickUpdateProcedure\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,38:1\n2318#2,14:39\n*S KotlinDebug\n*F\n+ 1 HerobrineOnEntityTickUpdateProcedure.kt\ndev/wendigodrip/thebrokenscript/procedures/herobrine/HerobrineOnEntityTickUpdateProcedure\n*L\n22#1:39,14\n*E\n"})
public final class HerobrineOnEntityTickUpdateProcedure {
  @NotNull
  public static final HerobrineOnEntityTickUpdateProcedure INSTANCE = new HerobrineOnEntityTickUpdateProcedure();
  
  @JvmStatic
  public static final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
    // Byte code:
    //   0: aload_0
    //   1: ldc 'world'
    //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload #7
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload_0
    //   13: ldc net/minecraft/world/entity/player/Player
    //   15: new net/minecraft/world/phys/Vec3
    //   18: dup
    //   19: dload_1
    //   20: dload_3
    //   21: dload #5
    //   23: invokespecial <init> : (DDD)V
    //   26: ldc2_w 4000.0
    //   29: ldc2_w 4000.0
    //   32: ldc2_w 4000.0
    //   35: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
    //   38: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;)Ljava/util/List;
    //   43: astore #8
    //   45: aload #8
    //   47: invokestatic checkNotNull : (Ljava/lang/Object;)V
    //   50: aload #8
    //   52: checkcast java/util/Collection
    //   55: invokeinterface isEmpty : ()Z
    //   60: ifne -> 67
    //   63: iconst_1
    //   64: goto -> 68
    //   67: iconst_0
    //   68: ifeq -> 250
    //   71: aload #8
    //   73: checkcast java/lang/Iterable
    //   76: astore #10
    //   78: iconst_0
    //   79: istore #11
    //   81: aload #10
    //   83: invokeinterface iterator : ()Ljava/util/Iterator;
    //   88: astore #12
    //   90: aload #12
    //   92: invokeinterface hasNext : ()Z
    //   97: ifne -> 108
    //   100: new java/util/NoSuchElementException
    //   103: dup
    //   104: invokespecial <init> : ()V
    //   107: athrow
    //   108: aload #12
    //   110: invokeinterface next : ()Ljava/lang/Object;
    //   115: astore #13
    //   117: aload #12
    //   119: invokeinterface hasNext : ()Z
    //   124: ifne -> 132
    //   127: aload #13
    //   129: goto -> 213
    //   132: aload #13
    //   134: checkcast net/minecraft/world/entity/player/Player
    //   137: astore #14
    //   139: iconst_0
    //   140: istore #15
    //   142: aload #14
    //   144: dload_1
    //   145: dload_3
    //   146: dload #5
    //   148: invokevirtual distanceToSqr : (DDD)D
    //   151: dstore #16
    //   153: aload #12
    //   155: invokeinterface next : ()Ljava/lang/Object;
    //   160: astore #18
    //   162: aload #18
    //   164: checkcast net/minecraft/world/entity/player/Player
    //   167: astore #14
    //   169: iconst_0
    //   170: istore #15
    //   172: aload #14
    //   174: dload_1
    //   175: dload_3
    //   176: dload #5
    //   178: invokevirtual distanceToSqr : (DDD)D
    //   181: dstore #19
    //   183: dload #16
    //   185: dload #19
    //   187: invokestatic compare : (DD)I
    //   190: ifle -> 201
    //   193: aload #18
    //   195: astore #13
    //   197: dload #19
    //   199: dstore #16
    //   201: aload #12
    //   203: invokeinterface hasNext : ()Z
    //   208: ifne -> 153
    //   211: aload #13
    //   213: checkcast net/minecraft/world/entity/player/Player
    //   216: astore #9
    //   218: aload #7
    //   220: getstatic net/minecraft/commands/arguments/EntityAnchorArgument$Anchor.EYES : Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;
    //   223: new net/minecraft/world/phys/Vec3
    //   226: dup
    //   227: aload #9
    //   229: invokevirtual getX : ()D
    //   232: aload #9
    //   234: invokevirtual getY : ()D
    //   237: dconst_1
    //   238: dadd
    //   239: aload #9
    //   241: invokevirtual getZ : ()D
    //   244: invokespecial <init> : (DDD)V
    //   247: invokevirtual lookAt : (Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/phys/Vec3;)V
    //   250: aload_0
    //   251: ldc net/minecraft/world/entity/player/Player
    //   253: new net/minecraft/world/phys/Vec3
    //   256: dup
    //   257: dload_1
    //   258: dload_3
    //   259: dload #5
    //   261: invokespecial <init> : (DDD)V
    //   264: ldc2_w 100.0
    //   267: ldc2_w 100.0
    //   270: ldc2_w 100.0
    //   273: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
    //   276: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;)Ljava/util/List;
    //   281: dup
    //   282: ldc 'getEntitiesOfClass(...)'
    //   284: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
    //   287: checkcast java/util/Collection
    //   290: invokeinterface isEmpty : ()Z
    //   295: ifne -> 302
    //   298: iconst_1
    //   299: goto -> 303
    //   302: iconst_0
    //   303: ifeq -> 322
    //   306: aload #7
    //   308: invokevirtual level : ()Lnet/minecraft/world/level/Level;
    //   311: invokevirtual isClientSide : ()Z
    //   314: ifne -> 322
    //   317: aload #7
    //   319: invokevirtual discard : ()V
    //   322: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #13	-> 6
    //   #14	-> 11
    //   #17	-> 12
    //   #18	-> 13
    //   #17	-> 38
    //   #21	-> 45
    //   #21	-> 68
    //   #22	-> 71
    //   #39	-> 81
    //   #40	-> 90
    //   #41	-> 108
    //   #42	-> 117
    //   #43	-> 132
    //   #22	-> 142
    //   #43	-> 151
    //   #45	-> 153
    //   #46	-> 162
    //   #22	-> 172
    //   #46	-> 181
    //   #47	-> 183
    //   #48	-> 193
    //   #49	-> 197
    //   #51	-> 201
    //   #52	-> 211
    //   #22	-> 213
    //   #24	-> 218
    //   #25	-> 220
    //   #26	-> 227
    //   #25	-> 244
    //   #24	-> 247
    //   #31	-> 250
    //   #32	-> 290
    //   #32	-> 303
    //   #34	-> 317
    //   #36	-> 322
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   142	9	15	$i$a$-minByOrThrow-HerobrineOnEntityTickUpdateProcedure$execute$nearest$1	I
    //   139	12	14	it	Lnet/minecraft/world/entity/player/Player;
    //   172	9	15	$i$a$-minByOrThrow-HerobrineOnEntityTickUpdateProcedure$execute$nearest$1	I
    //   169	12	14	it	Lnet/minecraft/world/entity/player/Player;
    //   162	39	18	e$iv	Ljava/lang/Object;
    //   183	18	19	v$iv	D
    //   81	132	11	$i$f$minByOrThrow	I
    //   90	123	12	iterator$iv	Ljava/util/Iterator;
    //   117	96	13	minElem$iv	Ljava/lang/Object;
    //   153	60	16	minValue$iv	D
    //   78	135	10	$this$minBy$iv	Ljava/lang/Iterable;
    //   218	32	9	nearest	Lnet/minecraft/world/entity/player/Player;
    //   45	278	8	players	Ljava/util/List;
    //   0	323	0	world	Lnet/minecraft/world/level/LevelAccessor;
    //   0	323	1	x	D
    //   0	323	3	y	D
    //   0	323	5	z	D
    //   0	323	7	entity	Lnet/minecraft/world/entity/Entity;
  }
}


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\herobrine\HerobrineOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */