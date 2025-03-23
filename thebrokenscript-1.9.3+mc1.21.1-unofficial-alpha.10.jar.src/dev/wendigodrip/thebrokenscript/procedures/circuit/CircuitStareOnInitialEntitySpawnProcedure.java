/*     */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*     */ import java.util.Comparator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitStareOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class CircuitStareOnInitialEntitySpawnProcedure
/*     */ {
/*     */   @NotNull
/*     */   public static final CircuitStareOnInitialEntitySpawnProcedure INSTANCE = new CircuitStareOnInitialEntitySpawnProcedure();
/*     */   
/*     */   @JvmStatic
/*     */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'world'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #7
/*     */     //   8: ifnonnull -> 12
/*     */     //   11: return
/*     */     //   12: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   15: aload_0
/*     */     //   16: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   19: invokevirtual getHasCircuitSpawned : ()Z
/*     */     //   22: ifeq -> 44
/*     */     //   25: aload #7
/*     */     //   27: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   30: invokevirtual isClientSide : ()Z
/*     */     //   33: ifne -> 514
/*     */     //   36: aload #7
/*     */     //   38: invokevirtual discard : ()V
/*     */     //   41: goto -> 514
/*     */     //   44: aload_0
/*     */     //   45: dload_1
/*     */     //   46: dload_3
/*     */     //   47: dload #5
/*     */     //   49: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   52: invokeinterface getBiome : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Holder;
/*     */     //   57: ldc 'null_biome'
/*     */     //   59: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   62: invokeinterface is : (Lnet/minecraft/resources/ResourceLocation;)Z
/*     */     //   67: ifne -> 96
/*     */     //   70: aload_0
/*     */     //   71: dload_1
/*     */     //   72: dload_3
/*     */     //   73: dload #5
/*     */     //   75: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   78: invokeinterface getBiome : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Holder;
/*     */     //   83: ldc 'deep_dark'
/*     */     //   85: invokestatic parse : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   88: invokeinterface is : (Lnet/minecraft/resources/ResourceLocation;)Z
/*     */     //   93: ifeq -> 115
/*     */     //   96: aload #7
/*     */     //   98: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   101: invokevirtual isClientSide : ()Z
/*     */     //   104: ifne -> 514
/*     */     //   107: aload #7
/*     */     //   109: invokevirtual discard : ()V
/*     */     //   112: goto -> 514
/*     */     //   115: aload_0
/*     */     //   116: dload_1
/*     */     //   117: dload_3
/*     */     //   118: dload #5
/*     */     //   120: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   123: invokeinterface canSeeSkyFromBelowWater : (Lnet/minecraft/core/BlockPos;)Z
/*     */     //   128: ifeq -> 150
/*     */     //   131: aload #7
/*     */     //   133: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   136: invokevirtual isClientSide : ()Z
/*     */     //   139: ifne -> 514
/*     */     //   142: aload #7
/*     */     //   144: invokevirtual discard : ()V
/*     */     //   147: goto -> 514
/*     */     //   150: dload_3
/*     */     //   151: ldc2_w 30.0
/*     */     //   154: dcmpl
/*     */     //   155: ifle -> 177
/*     */     //   158: aload #7
/*     */     //   160: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   163: invokevirtual isClientSide : ()Z
/*     */     //   166: ifne -> 514
/*     */     //   169: aload #7
/*     */     //   171: invokevirtual discard : ()V
/*     */     //   174: goto -> 514
/*     */     //   177: new net/minecraft/world/phys/Vec3
/*     */     //   180: dup
/*     */     //   181: dload_1
/*     */     //   182: dload_3
/*     */     //   183: dload #5
/*     */     //   185: invokespecial <init> : (DDD)V
/*     */     //   188: astore #8
/*     */     //   190: new dev/wendigodrip/thebrokenscript/procedures/circuit/CircuitStareOnInitialEntitySpawnProcedure$execute$v1$1
/*     */     //   193: dup
/*     */     //   194: invokespecial <init> : ()V
/*     */     //   197: astore #9
/*     */     //   199: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*     */     //   202: aload_0
/*     */     //   203: ldc net/minecraft/world/entity/player/Player
/*     */     //   205: aload #8
/*     */     //   207: ldc2_w 10000.0
/*     */     //   210: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
/*     */     //   213: checkcast net/minecraft/world/entity/player/Player
/*     */     //   216: dup
/*     */     //   217: ifnull -> 226
/*     */     //   220: invokevirtual getY : ()D
/*     */     //   223: goto -> 228
/*     */     //   226: pop
/*     */     //   227: dconst_0
/*     */     //   228: ldc2_w 40.0
/*     */     //   231: dcmpl
/*     */     //   232: ifle -> 254
/*     */     //   235: aload #7
/*     */     //   237: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   240: invokevirtual isClientSide : ()Z
/*     */     //   243: ifne -> 514
/*     */     //   246: aload #7
/*     */     //   248: invokevirtual discard : ()V
/*     */     //   251: goto -> 514
/*     */     //   254: invokestatic random : ()D
/*     */     //   257: ldc2_w 0.01
/*     */     //   260: dcmpg
/*     */     //   261: ifge -> 498
/*     */     //   264: invokestatic random : ()D
/*     */     //   267: ldc2_w 0.7
/*     */     //   270: dcmpg
/*     */     //   271: ifge -> 368
/*     */     //   274: aload_0
/*     */     //   275: instanceof net/minecraft/world/level/Level
/*     */     //   278: ifeq -> 459
/*     */     //   281: aload_0
/*     */     //   282: checkcast net/minecraft/world/level/Level
/*     */     //   285: invokevirtual isClientSide : ()Z
/*     */     //   288: ifne -> 331
/*     */     //   291: aload_0
/*     */     //   292: checkcast net/minecraft/world/level/Level
/*     */     //   295: aconst_null
/*     */     //   296: dload_1
/*     */     //   297: dload_3
/*     */     //   298: dload #5
/*     */     //   300: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   303: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   306: ldc 'falsecalm2'
/*     */     //   308: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   311: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   316: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   319: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   322: ldc 555.0
/*     */     //   324: fconst_1
/*     */     //   325: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   328: goto -> 459
/*     */     //   331: aload_0
/*     */     //   332: checkcast net/minecraft/world/level/Level
/*     */     //   335: dload_1
/*     */     //   336: dload_3
/*     */     //   337: dload #5
/*     */     //   339: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   342: ldc 'falsecalm2'
/*     */     //   344: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   347: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   352: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   355: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   358: ldc 555.0
/*     */     //   360: fconst_1
/*     */     //   361: iconst_0
/*     */     //   362: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   365: goto -> 459
/*     */     //   368: aload_0
/*     */     //   369: instanceof net/minecraft/world/level/Level
/*     */     //   372: ifeq -> 459
/*     */     //   375: aload_0
/*     */     //   376: checkcast net/minecraft/world/level/Level
/*     */     //   379: invokevirtual isClientSide : ()Z
/*     */     //   382: ifne -> 425
/*     */     //   385: aload_0
/*     */     //   386: checkcast net/minecraft/world/level/Level
/*     */     //   389: aconst_null
/*     */     //   390: dload_1
/*     */     //   391: dload_3
/*     */     //   392: dload #5
/*     */     //   394: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   397: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   400: ldc 'integritywatching'
/*     */     //   402: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   405: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   410: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   413: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   416: ldc 555.0
/*     */     //   418: fconst_1
/*     */     //   419: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   422: goto -> 459
/*     */     //   425: aload_0
/*     */     //   426: checkcast net/minecraft/world/level/Level
/*     */     //   429: dload_1
/*     */     //   430: dload_3
/*     */     //   431: dload #5
/*     */     //   433: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   436: ldc 'integritywatching'
/*     */     //   438: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   441: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   446: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   449: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   452: ldc 555.0
/*     */     //   454: fconst_1
/*     */     //   455: iconst_0
/*     */     //   456: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   459: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   462: aload_0
/*     */     //   463: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   466: iconst_1
/*     */     //   467: invokevirtual setHasCircuitSpawned : (Z)V
/*     */     //   470: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   473: aload_0
/*     */     //   474: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   477: aload_0
/*     */     //   478: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   481: sipush #18000
/*     */     //   484: aload #7
/*     */     //   486: aload_0
/*     */     //   487: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/LevelAccessor;)Ljava/lang/Runnable;
/*     */     //   492: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   495: goto -> 514
/*     */     //   498: aload #7
/*     */     //   500: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   503: invokevirtual isClientSide : ()Z
/*     */     //   506: ifne -> 514
/*     */     //   509: aload #7
/*     */     //   511: invokevirtual discard : ()V
/*     */     //   514: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #20	-> 6
/*     */     //   #21	-> 11
/*     */     //   #23	-> 12
/*     */     //   #24	-> 25
/*     */     //   #25	-> 36
/*     */     //   #27	-> 44
/*     */     //   #28	-> 57
/*     */     //   #29	-> 83
/*     */     //   #31	-> 96
/*     */     //   #32	-> 107
/*     */     //   #34	-> 115
/*     */     //   #35	-> 131
/*     */     //   #36	-> 142
/*     */     //   #38	-> 150
/*     */     //   #39	-> 158
/*     */     //   #40	-> 169
/*     */     //   #43	-> 177
/*     */     //   #44	-> 190
/*     */     //   #53	-> 199
/*     */     //   #54	-> 235
/*     */     //   #55	-> 246
/*     */     //   #57	-> 254
/*     */     //   #58	-> 264
/*     */     //   #59	-> 274
/*     */     //   #60	-> 281
/*     */     //   #61	-> 291
/*     */     //   #62	-> 295
/*     */     //   #63	-> 296
/*     */     //   #64	-> 303
/*     */     //   #65	-> 319
/*     */     //   #66	-> 322
/*     */     //   #67	-> 324
/*     */     //   #61	-> 325
/*     */     //   #70	-> 331
/*     */     //   #71	-> 335
/*     */     //   #72	-> 336
/*     */     //   #73	-> 337
/*     */     //   #74	-> 339
/*     */     //   #75	-> 355
/*     */     //   #76	-> 358
/*     */     //   #77	-> 360
/*     */     //   #78	-> 361
/*     */     //   #70	-> 362
/*     */     //   #82	-> 368
/*     */     //   #83	-> 375
/*     */     //   #84	-> 385
/*     */     //   #85	-> 389
/*     */     //   #86	-> 390
/*     */     //   #87	-> 397
/*     */     //   #88	-> 413
/*     */     //   #89	-> 416
/*     */     //   #90	-> 418
/*     */     //   #84	-> 419
/*     */     //   #93	-> 425
/*     */     //   #94	-> 429
/*     */     //   #95	-> 430
/*     */     //   #96	-> 431
/*     */     //   #97	-> 433
/*     */     //   #98	-> 449
/*     */     //   #99	-> 452
/*     */     //   #100	-> 454
/*     */     //   #101	-> 455
/*     */     //   #93	-> 456
/*     */     //   #105	-> 459
/*     */     //   #106	-> 470
/*     */     //   #108	-> 481
/*     */     //   #109	-> 484
/*     */     //   #107	-> 484
/*     */     //   #116	-> 498
/*     */     //   #117	-> 509
/*     */     //   #120	-> 514
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   190	324	8	vec3	Lnet/minecraft/world/phys/Vec3;
/*     */     //   199	315	9	v1	Ljava/lang/Object;
/*     */     //   0	515	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	515	1	x	D
/*     */     //   0	515	3	y	D
/*     */     //   0	515	5	z	D
/*     */     //   0	515	7	entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J.\020\002\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/circuit/CircuitStareOnInitialEntitySpawnProcedure$execute$v1$1", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class CircuitStareOnInitialEntitySpawnProcedure$execute$v1$1
/*     */   {
/*     */     public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*     */       // Byte code:
/*     */       //   0: dload_1
/*     */       //   1: dload_3
/*     */       //   2: dload #5
/*     */       //   4: <illegal opcode> invoke : (DDD)Lkotlin/jvm/functions/Function1;
/*     */       //   9: <illegal opcode> applyAsDouble : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/ToDoubleFunction;
/*     */       //   14: invokestatic comparingDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
/*     */       //   17: dup
/*     */       //   18: ldc 'comparingDouble(...)'
/*     */       //   20: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   23: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #46	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitStareOnInitialEntitySpawnProcedure$execute$v1$1;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D
/*     */     }
/*     */     
/*     */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) {
/*  46 */       return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/*  47 */       Intrinsics.checkNotNullParameter(_entcnd, "_entcnd"); return _entcnd.distanceToSqr(
/*  48 */           $_x, $_y, $_z);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$0(Entity $entity, LevelAccessor $world) {
/* 110 */     if (!$entity.level().isClientSide()) {
/* 111 */       $entity.discard();
/*     */     }
/* 113 */     MapVariables.Companion.get($world).setHasCircuitSpawned(false);
/* 114 */     MapVariables.Companion.get($world).syncData($world);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitStareOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */