/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*     */ import java.util.Comparator;
/*     */ import kotlin.Metadata;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J0\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\r¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/VoiddOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class VoiddOnInitialEntitySpawnProcedure
/*     */ {
/*     */   @NotNull
/*     */   public static final VoiddOnInitialEntitySpawnProcedure INSTANCE = new VoiddOnInitialEntitySpawnProcedure();
/*     */   
/*     */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'world'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload #8
/*     */     //   8: ifnonnull -> 12
/*     */     //   11: return
/*     */     //   12: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   15: aload_1
/*     */     //   16: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   19: invokevirtual getHasVoidSpawned : ()Z
/*     */     //   22: ifne -> 534
/*     */     //   25: aload_1
/*     */     //   26: dload_2
/*     */     //   27: dload #4
/*     */     //   29: dload #6
/*     */     //   31: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   34: invokeinterface canSeeSkyFromBelowWater : (Lnet/minecraft/core/BlockPos;)Z
/*     */     //   39: ifeq -> 61
/*     */     //   42: aload #8
/*     */     //   44: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   47: invokevirtual isClientSide : ()Z
/*     */     //   50: ifne -> 550
/*     */     //   53: aload #8
/*     */     //   55: invokevirtual discard : ()V
/*     */     //   58: goto -> 550
/*     */     //   61: aload_1
/*     */     //   62: dload_2
/*     */     //   63: dload #4
/*     */     //   65: dload #6
/*     */     //   67: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   70: invokeinterface getBiome : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Holder;
/*     */     //   75: ldc 'null_biome'
/*     */     //   77: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   80: invokeinterface is : (Lnet/minecraft/resources/ResourceLocation;)Z
/*     */     //   85: ifeq -> 107
/*     */     //   88: aload #8
/*     */     //   90: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   93: invokevirtual isClientSide : ()Z
/*     */     //   96: ifne -> 550
/*     */     //   99: aload #8
/*     */     //   101: invokevirtual discard : ()V
/*     */     //   104: goto -> 550
/*     */     //   107: aload_1
/*     */     //   108: dload_2
/*     */     //   109: dload #4
/*     */     //   111: dload #6
/*     */     //   113: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   116: invokeinterface canSeeSkyFromBelowWater : (Lnet/minecraft/core/BlockPos;)Z
/*     */     //   121: ifeq -> 143
/*     */     //   124: aload #8
/*     */     //   126: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   129: invokevirtual isClientSide : ()Z
/*     */     //   132: ifne -> 550
/*     */     //   135: aload #8
/*     */     //   137: invokevirtual discard : ()V
/*     */     //   140: goto -> 550
/*     */     //   143: dload #4
/*     */     //   145: ldc2_w 30.0
/*     */     //   148: dcmpl
/*     */     //   149: ifle -> 171
/*     */     //   152: aload #8
/*     */     //   154: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   157: invokevirtual isClientSide : ()Z
/*     */     //   160: ifne -> 550
/*     */     //   163: aload #8
/*     */     //   165: invokevirtual discard : ()V
/*     */     //   168: goto -> 550
/*     */     //   171: new net/minecraft/world/phys/Vec3
/*     */     //   174: dup
/*     */     //   175: dload_2
/*     */     //   176: dload #4
/*     */     //   178: dload #6
/*     */     //   180: invokespecial <init> : (DDD)V
/*     */     //   183: astore #9
/*     */     //   185: new dev/wendigodrip/thebrokenscript/procedures/VoiddOnInitialEntitySpawnProcedure$execute$v1$1
/*     */     //   188: dup
/*     */     //   189: invokespecial <init> : ()V
/*     */     //   192: astore #10
/*     */     //   194: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*     */     //   197: aload_1
/*     */     //   198: ldc net/minecraft/world/entity/player/Player
/*     */     //   200: aload #9
/*     */     //   202: ldc2_w 10000.0
/*     */     //   205: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
/*     */     //   208: checkcast net/minecraft/world/entity/player/Player
/*     */     //   211: dup
/*     */     //   212: ifnull -> 221
/*     */     //   215: invokevirtual getY : ()D
/*     */     //   218: goto -> 223
/*     */     //   221: pop
/*     */     //   222: dconst_0
/*     */     //   223: ldc2_w 40.0
/*     */     //   226: dcmpl
/*     */     //   227: ifle -> 249
/*     */     //   230: aload #8
/*     */     //   232: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   235: invokevirtual isClientSide : ()Z
/*     */     //   238: ifne -> 550
/*     */     //   241: aload #8
/*     */     //   243: invokevirtual discard : ()V
/*     */     //   246: goto -> 550
/*     */     //   249: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   252: aload_1
/*     */     //   253: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   256: invokevirtual getHasVoidSpawned : ()Z
/*     */     //   259: ifeq -> 281
/*     */     //   262: aload #8
/*     */     //   264: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   267: invokevirtual isClientSide : ()Z
/*     */     //   270: ifne -> 550
/*     */     //   273: aload #8
/*     */     //   275: invokevirtual discard : ()V
/*     */     //   278: goto -> 550
/*     */     //   281: invokestatic random : ()D
/*     */     //   284: ldc2_w 0.05
/*     */     //   287: dcmpg
/*     */     //   288: ifge -> 515
/*     */     //   291: aconst_null
/*     */     //   292: astore #11
/*     */     //   294: aload_1
/*     */     //   295: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   298: ifeq -> 367
/*     */     //   301: aload_1
/*     */     //   302: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   305: astore #11
/*     */     //   307: aload #11
/*     */     //   309: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   312: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   315: new net/minecraft/commands/CommandSourceStack
/*     */     //   318: dup
/*     */     //   319: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   322: new net/minecraft/world/phys/Vec3
/*     */     //   325: dup
/*     */     //   326: dload_2
/*     */     //   327: dload #4
/*     */     //   329: dload #6
/*     */     //   331: invokespecial <init> : (DDD)V
/*     */     //   334: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   337: aload #11
/*     */     //   339: iconst_4
/*     */     //   340: ldc ''
/*     */     //   342: ldc ''
/*     */     //   344: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   347: checkcast net/minecraft/network/chat/Component
/*     */     //   350: aload #11
/*     */     //   352: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   355: aconst_null
/*     */     //   356: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   359: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   362: ldc 'stopsound @a'
/*     */     //   364: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   367: aload_1
/*     */     //   368: instanceof net/minecraft/world/level/Level
/*     */     //   371: ifeq -> 476
/*     */     //   374: aload_1
/*     */     //   375: checkcast net/minecraft/world/level/Level
/*     */     //   378: invokevirtual isClientSide : ()Z
/*     */     //   381: ifne -> 433
/*     */     //   384: aload_1
/*     */     //   385: checkcast net/minecraft/world/level/Level
/*     */     //   388: aconst_null
/*     */     //   389: dload_2
/*     */     //   390: dload #4
/*     */     //   392: dload #6
/*     */     //   394: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   397: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   400: ldc 'falsecalm2'
/*     */     //   402: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   405: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   410: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   413: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   416: ldc 555.0
/*     */     //   418: invokestatic create : ()Lnet/minecraft/util/RandomSource;
/*     */     //   421: iconst_0
/*     */     //   422: iconst_1
/*     */     //   423: invokestatic nextInt : (Lnet/minecraft/util/RandomSource;II)I
/*     */     //   426: i2f
/*     */     //   427: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   430: goto -> 476
/*     */     //   433: aload_1
/*     */     //   434: checkcast net/minecraft/world/level/Level
/*     */     //   437: dload_2
/*     */     //   438: dload #4
/*     */     //   440: dload #6
/*     */     //   442: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   445: ldc 'falsecalm2'
/*     */     //   447: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   450: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   455: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   458: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   461: ldc 555.0
/*     */     //   463: invokestatic create : ()Lnet/minecraft/util/RandomSource;
/*     */     //   466: iconst_0
/*     */     //   467: iconst_1
/*     */     //   468: invokestatic nextInt : (Lnet/minecraft/util/RandomSource;II)I
/*     */     //   471: i2f
/*     */     //   472: iconst_0
/*     */     //   473: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   476: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   479: aload_1
/*     */     //   480: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   483: iconst_1
/*     */     //   484: invokevirtual setHasVoidSpawned : (Z)V
/*     */     //   487: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   490: aload_1
/*     */     //   491: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   494: aload_1
/*     */     //   495: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   498: sipush #18000
/*     */     //   501: aload #8
/*     */     //   503: aload_1
/*     */     //   504: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/LevelAccessor;)Ljava/lang/Runnable;
/*     */     //   509: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   512: goto -> 550
/*     */     //   515: aload #8
/*     */     //   517: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   520: invokevirtual isClientSide : ()Z
/*     */     //   523: ifne -> 550
/*     */     //   526: aload #8
/*     */     //   528: invokevirtual discard : ()V
/*     */     //   531: goto -> 550
/*     */     //   534: aload #8
/*     */     //   536: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   539: invokevirtual isClientSide : ()Z
/*     */     //   542: ifne -> 550
/*     */     //   545: aload #8
/*     */     //   547: invokevirtual discard : ()V
/*     */     //   550: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #25	-> 6
/*     */     //   #26	-> 11
/*     */     //   #28	-> 12
/*     */     //   #29	-> 25
/*     */     //   #30	-> 42
/*     */     //   #31	-> 53
/*     */     //   #33	-> 61
/*     */     //   #34	-> 88
/*     */     //   #35	-> 99
/*     */     //   #37	-> 107
/*     */     //   #38	-> 124
/*     */     //   #39	-> 135
/*     */     //   #41	-> 143
/*     */     //   #42	-> 152
/*     */     //   #43	-> 163
/*     */     //   #46	-> 171
/*     */     //   #47	-> 185
/*     */     //   #56	-> 194
/*     */     //   #57	-> 230
/*     */     //   #58	-> 241
/*     */     //   #60	-> 249
/*     */     //   #61	-> 262
/*     */     //   #62	-> 273
/*     */     //   #64	-> 281
/*     */     //   #65	-> 291
/*     */     //   #66	-> 294
/*     */     //   #67	-> 301
/*     */     //   #68	-> 307
/*     */     //   #69	-> 315
/*     */     //   #70	-> 319
/*     */     //   #71	-> 322
/*     */     //   #72	-> 334
/*     */     //   #73	-> 337
/*     */     //   #74	-> 339
/*     */     //   #75	-> 340
/*     */     //   #76	-> 342
/*     */     //   #77	-> 350
/*     */     //   #78	-> 355
/*     */     //   #69	-> 356
/*     */     //   #79	-> 359
/*     */     //   #68	-> 364
/*     */     //   #82	-> 367
/*     */     //   #83	-> 374
/*     */     //   #84	-> 384
/*     */     //   #85	-> 388
/*     */     //   #86	-> 389
/*     */     //   #87	-> 397
/*     */     //   #88	-> 413
/*     */     //   #89	-> 416
/*     */     //   #90	-> 418
/*     */     //   #84	-> 427
/*     */     //   #93	-> 433
/*     */     //   #94	-> 437
/*     */     //   #95	-> 438
/*     */     //   #96	-> 440
/*     */     //   #97	-> 442
/*     */     //   #98	-> 458
/*     */     //   #99	-> 461
/*     */     //   #102	-> 463
/*     */     //   #101	-> 463
/*     */     //   #100	-> 468
/*     */     //   #102	-> 471
/*     */     //   #103	-> 472
/*     */     //   #93	-> 473
/*     */     //   #107	-> 476
/*     */     //   #108	-> 487
/*     */     //   #110	-> 498
/*     */     //   #111	-> 501
/*     */     //   #109	-> 501
/*     */     //   #118	-> 515
/*     */     //   #119	-> 526
/*     */     //   #122	-> 534
/*     */     //   #123	-> 545
/*     */     //   #125	-> 550
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   294	218	11	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   185	346	9	vec3	Lnet/minecraft/world/phys/Vec3;
/*     */     //   194	337	10	v1	Ljava/lang/Object;
/*     */     //   0	551	0	this	Ldev/wendigodrip/thebrokenscript/procedures/VoiddOnInitialEntitySpawnProcedure;
/*     */     //   0	551	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	551	2	x	D
/*     */     //   0	551	4	y	D
/*     */     //   0	551	6	z	D
/*     */     //   0	551	8	entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J.\020\002\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/VoiddOnInitialEntitySpawnProcedure$execute$v1$1", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class VoiddOnInitialEntitySpawnProcedure$execute$v1$1
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
/*     */       //   #49	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/VoiddOnInitialEntitySpawnProcedure$execute$v1$1;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D
/*     */     }
/*     */     
/*     */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) {
/*  49 */       return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/*  50 */       Intrinsics.checkNotNullParameter(_entcnd, "_entcnd"); return _entcnd.distanceToSqr(
/*  51 */           $_x, $_y, $_z);
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
/*     */   private static final void execute$lambda$0(Entity $entity, LevelAccessor $world) {
/* 112 */     if (!$entity.level().isClientSide()) {
/* 113 */       $entity.discard();
/*     */     }
/* 115 */     MapVariables.Companion.get($world).setHasVoidSpawned(false);
/* 116 */     MapVariables.Companion.get($world).syncData($world);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\VoiddOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */