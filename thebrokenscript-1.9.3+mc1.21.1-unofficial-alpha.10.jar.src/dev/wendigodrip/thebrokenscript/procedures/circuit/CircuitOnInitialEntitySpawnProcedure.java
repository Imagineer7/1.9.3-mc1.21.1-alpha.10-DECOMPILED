/*     */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class CircuitOnInitialEntitySpawnProcedure
/*     */ {
/*     */   @NotNull
/*     */   public static final CircuitOnInitialEntitySpawnProcedure INSTANCE = new CircuitOnInitialEntitySpawnProcedure();
/*     */   
/*     */   @JvmStatic
/*     */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'world'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aconst_null
/*     */     //   7: astore #8
/*     */     //   9: aload #7
/*     */     //   11: ifnonnull -> 15
/*     */     //   14: return
/*     */     //   15: aload_0
/*     */     //   16: instanceof net/minecraft/world/level/Level
/*     */     //   19: ifeq -> 106
/*     */     //   22: aload_0
/*     */     //   23: checkcast net/minecraft/world/level/Level
/*     */     //   26: astore #8
/*     */     //   28: aload #8
/*     */     //   30: invokevirtual isClientSide : ()Z
/*     */     //   33: ifne -> 74
/*     */     //   36: aload #8
/*     */     //   38: aconst_null
/*     */     //   39: dload_1
/*     */     //   40: dload_3
/*     */     //   41: dload #5
/*     */     //   43: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   46: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   49: ldc 'circuit_jumpscare'
/*     */     //   51: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   54: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   59: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   62: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   65: ldc 555.0
/*     */     //   67: fconst_1
/*     */     //   68: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   71: goto -> 106
/*     */     //   74: aload #8
/*     */     //   76: dload_1
/*     */     //   77: dload_3
/*     */     //   78: dload #5
/*     */     //   80: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   83: ldc 'circuit_jumpscare'
/*     */     //   85: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   88: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   93: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   96: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   99: ldc 555.0
/*     */     //   101: fconst_1
/*     */     //   102: iconst_0
/*     */     //   103: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   106: aload_0
/*     */     //   107: instanceof net/minecraft/world/level/Level
/*     */     //   110: ifeq -> 197
/*     */     //   113: aload_0
/*     */     //   114: checkcast net/minecraft/world/level/Level
/*     */     //   117: astore #8
/*     */     //   119: aload #8
/*     */     //   121: invokevirtual isClientSide : ()Z
/*     */     //   124: ifne -> 165
/*     */     //   127: aload #8
/*     */     //   129: aconst_null
/*     */     //   130: dload_1
/*     */     //   131: dload_3
/*     */     //   132: dload #5
/*     */     //   134: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   137: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   140: ldc 'nulljumpscareloud'
/*     */     //   142: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   145: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   150: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   153: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   156: ldc 555.0
/*     */     //   158: fconst_1
/*     */     //   159: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   162: goto -> 197
/*     */     //   165: aload #8
/*     */     //   167: dload_1
/*     */     //   168: dload_3
/*     */     //   169: dload #5
/*     */     //   171: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   174: ldc 'nulljumpscareloud'
/*     */     //   176: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   179: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   184: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   187: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   190: ldc 555.0
/*     */     //   192: fconst_1
/*     */     //   193: iconst_0
/*     */     //   194: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   197: aload_0
/*     */     //   198: instanceof net/minecraft/world/level/Level
/*     */     //   201: ifeq -> 286
/*     */     //   204: aload_0
/*     */     //   205: checkcast net/minecraft/world/level/Level
/*     */     //   208: astore #8
/*     */     //   210: aload #8
/*     */     //   212: invokevirtual isClientSide : ()Z
/*     */     //   215: ifne -> 255
/*     */     //   218: aload #8
/*     */     //   220: aconst_null
/*     */     //   221: dload_1
/*     */     //   222: dload_3
/*     */     //   223: dload #5
/*     */     //   225: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   228: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   231: ldc 'nullchase'
/*     */     //   233: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   236: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   241: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   244: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   247: fconst_1
/*     */     //   248: fconst_1
/*     */     //   249: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   252: goto -> 286
/*     */     //   255: aload #8
/*     */     //   257: dload_1
/*     */     //   258: dload_3
/*     */     //   259: dload #5
/*     */     //   261: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   264: ldc 'nullchase'
/*     */     //   266: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   269: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   274: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   277: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   280: fconst_1
/*     */     //   281: fconst_1
/*     */     //   282: iconst_0
/*     */     //   283: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   286: sipush #400
/*     */     //   289: aload #7
/*     */     //   291: aload_0
/*     */     //   292: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/LevelAccessor;)Ljava/lang/Runnable;
/*     */     //   297: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   300: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #16	-> 6
/*     */     //   #17	-> 9
/*     */     //   #18	-> 14
/*     */     //   #20	-> 15
/*     */     //   #21	-> 22
/*     */     //   #22	-> 28
/*     */     //   #23	-> 36
/*     */     //   #24	-> 38
/*     */     //   #25	-> 39
/*     */     //   #26	-> 46
/*     */     //   #27	-> 62
/*     */     //   #28	-> 65
/*     */     //   #29	-> 67
/*     */     //   #23	-> 68
/*     */     //   #32	-> 74
/*     */     //   #33	-> 76
/*     */     //   #34	-> 77
/*     */     //   #35	-> 78
/*     */     //   #36	-> 80
/*     */     //   #37	-> 96
/*     */     //   #38	-> 99
/*     */     //   #39	-> 101
/*     */     //   #40	-> 102
/*     */     //   #32	-> 103
/*     */     //   #44	-> 106
/*     */     //   #45	-> 113
/*     */     //   #46	-> 119
/*     */     //   #47	-> 127
/*     */     //   #48	-> 129
/*     */     //   #49	-> 130
/*     */     //   #50	-> 137
/*     */     //   #51	-> 153
/*     */     //   #52	-> 156
/*     */     //   #53	-> 158
/*     */     //   #47	-> 159
/*     */     //   #56	-> 165
/*     */     //   #57	-> 167
/*     */     //   #58	-> 168
/*     */     //   #59	-> 169
/*     */     //   #60	-> 171
/*     */     //   #61	-> 187
/*     */     //   #62	-> 190
/*     */     //   #63	-> 192
/*     */     //   #64	-> 193
/*     */     //   #56	-> 194
/*     */     //   #68	-> 197
/*     */     //   #69	-> 204
/*     */     //   #70	-> 210
/*     */     //   #71	-> 218
/*     */     //   #72	-> 220
/*     */     //   #73	-> 221
/*     */     //   #74	-> 228
/*     */     //   #75	-> 244
/*     */     //   #76	-> 247
/*     */     //   #77	-> 248
/*     */     //   #71	-> 249
/*     */     //   #80	-> 255
/*     */     //   #81	-> 257
/*     */     //   #82	-> 258
/*     */     //   #83	-> 259
/*     */     //   #84	-> 261
/*     */     //   #85	-> 277
/*     */     //   #86	-> 280
/*     */     //   #87	-> 281
/*     */     //   #88	-> 282
/*     */     //   #80	-> 283
/*     */     //   #93	-> 286
/*     */     //   #94	-> 289
/*     */     //   #92	-> 289
/*     */     //   #103	-> 300
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   9	292	8	_level	Lnet/minecraft/world/level/Level;
/*     */     //   0	301	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	301	1	x	D
/*     */     //   0	301	3	y	D
/*     */     //   0	301	5	z	D
/*     */     //   0	301	7	entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$0(Entity $entity, LevelAccessor $world) {
/*  95 */     if (!$entity.level().isClientSide()) {
/*  96 */       $entity.discard();
/*     */     }
/*  98 */     MapVariables.Companion.get($world).setHasCircuitSpawned(false);
/*  99 */     MapVariables.Companion.get($world).syncData($world);
/* 100 */     MapVariables.Companion.get($world).setNoWayOutFrame(0.0D);
/* 101 */     MapVariables.Companion.get($world).syncData($world);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */