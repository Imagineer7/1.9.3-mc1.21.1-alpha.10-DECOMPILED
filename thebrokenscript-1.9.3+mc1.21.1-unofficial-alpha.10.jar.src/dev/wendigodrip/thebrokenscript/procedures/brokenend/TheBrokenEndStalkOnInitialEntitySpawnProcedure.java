/*     */ package dev.wendigodrip.thebrokenscript.procedures.brokenend;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Level;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndStalkOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class TheBrokenEndStalkOnInitialEntitySpawnProcedure
/*     */ {
/*     */   @NotNull
/*     */   public static final TheBrokenEndStalkOnInitialEntitySpawnProcedure INSTANCE = new TheBrokenEndStalkOnInitialEntitySpawnProcedure();
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
/*     */     //   12: aload_0
/*     */     //   13: dload_1
/*     */     //   14: dload_3
/*     */     //   15: dload #5
/*     */     //   17: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   20: invokeinterface canSeeSkyFromBelowWater : (Lnet/minecraft/core/BlockPos;)Z
/*     */     //   25: ifeq -> 342
/*     */     //   28: aload_0
/*     */     //   29: invokeinterface dimensionType : ()Lnet/minecraft/world/level/dimension/DimensionType;
/*     */     //   34: aload_0
/*     */     //   35: invokeinterface dayTime : ()J
/*     */     //   40: invokevirtual moonPhase : (J)I
/*     */     //   43: iconst_4
/*     */     //   44: if_icmpgt -> 66
/*     */     //   47: aload_0
/*     */     //   48: invokeinterface dimensionType : ()Lnet/minecraft/world/level/dimension/DimensionType;
/*     */     //   53: aload_0
/*     */     //   54: invokeinterface dayTime : ()J
/*     */     //   59: invokevirtual moonPhase : (J)I
/*     */     //   62: iconst_4
/*     */     //   63: if_icmpne -> 232
/*     */     //   66: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   69: aload_0
/*     */     //   70: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   73: invokevirtual getHasTheBrokenEndSpawned : ()Z
/*     */     //   76: ifeq -> 98
/*     */     //   79: aload #7
/*     */     //   81: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   84: invokevirtual isClientSide : ()Z
/*     */     //   87: ifne -> 358
/*     */     //   90: aload #7
/*     */     //   92: invokevirtual discard : ()V
/*     */     //   95: goto -> 358
/*     */     //   98: aload_0
/*     */     //   99: instanceof net/minecraft/world/level/Level
/*     */     //   102: ifeq -> 189
/*     */     //   105: aload_0
/*     */     //   106: checkcast net/minecraft/world/level/Level
/*     */     //   109: invokevirtual isClientSide : ()Z
/*     */     //   112: ifne -> 155
/*     */     //   115: aload_0
/*     */     //   116: checkcast net/minecraft/world/level/Level
/*     */     //   119: aconst_null
/*     */     //   120: dload_1
/*     */     //   121: dload_3
/*     */     //   122: dload #5
/*     */     //   124: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   127: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   130: ldc 'trevoga'
/*     */     //   132: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   135: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   140: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   143: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   146: ldc 555.0
/*     */     //   148: fconst_0
/*     */     //   149: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   152: goto -> 189
/*     */     //   155: aload_0
/*     */     //   156: checkcast net/minecraft/world/level/Level
/*     */     //   159: dload_1
/*     */     //   160: dload_3
/*     */     //   161: dload #5
/*     */     //   163: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   166: ldc 'trevoga'
/*     */     //   168: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   171: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   176: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   179: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   182: ldc 555.0
/*     */     //   184: fconst_0
/*     */     //   185: iconst_0
/*     */     //   186: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   189: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   192: aload_0
/*     */     //   193: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   196: iconst_1
/*     */     //   197: invokevirtual setHasTheBrokenEndSpawned : (Z)V
/*     */     //   200: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   203: aload_0
/*     */     //   204: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   207: aload_0
/*     */     //   208: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   211: sipush #18000
/*     */     //   214: aload #7
/*     */     //   216: aload_0
/*     */     //   217: dload_1
/*     */     //   218: dload_3
/*     */     //   219: dload #5
/*     */     //   221: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   226: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   229: goto -> 358
/*     */     //   232: aload #7
/*     */     //   234: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   237: invokevirtual isClientSide : ()Z
/*     */     //   240: ifne -> 248
/*     */     //   243: aload #7
/*     */     //   245: invokevirtual discard : ()V
/*     */     //   248: aload_0
/*     */     //   249: instanceof net/minecraft/world/level/Level
/*     */     //   252: ifeq -> 358
/*     */     //   255: aload_0
/*     */     //   256: checkcast net/minecraft/world/level/Level
/*     */     //   259: invokevirtual isClientSide : ()Z
/*     */     //   262: ifne -> 305
/*     */     //   265: aload_0
/*     */     //   266: checkcast net/minecraft/world/level/Level
/*     */     //   269: aconst_null
/*     */     //   270: dload_1
/*     */     //   271: dload_3
/*     */     //   272: dload #5
/*     */     //   274: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   277: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   280: ldc 'ambient.cave'
/*     */     //   282: invokestatic parse : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   285: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   290: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   293: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   296: ldc 555.0
/*     */     //   298: fconst_0
/*     */     //   299: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   302: goto -> 358
/*     */     //   305: aload_0
/*     */     //   306: checkcast net/minecraft/world/level/Level
/*     */     //   309: dload_1
/*     */     //   310: dload_3
/*     */     //   311: dload #5
/*     */     //   313: getstatic net/minecraft/core/registries/BuiltInRegistries.SOUND_EVENT : Lnet/minecraft/core/Registry;
/*     */     //   316: ldc 'ambient.cave'
/*     */     //   318: invokestatic parse : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   321: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   326: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   329: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   332: ldc 555.0
/*     */     //   334: fconst_0
/*     */     //   335: iconst_0
/*     */     //   336: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   339: goto -> 358
/*     */     //   342: aload #7
/*     */     //   344: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   347: invokevirtual isClientSide : ()Z
/*     */     //   350: ifne -> 358
/*     */     //   353: aload #7
/*     */     //   355: invokevirtual discard : ()V
/*     */     //   358: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #21	-> 6
/*     */     //   #22	-> 11
/*     */     //   #24	-> 12
/*     */     //   #25	-> 28
/*     */     //   #26	-> 47
/*     */     //   #28	-> 66
/*     */     //   #29	-> 79
/*     */     //   #30	-> 90
/*     */     //   #33	-> 98
/*     */     //   #34	-> 105
/*     */     //   #35	-> 115
/*     */     //   #36	-> 119
/*     */     //   #37	-> 120
/*     */     //   #38	-> 127
/*     */     //   #39	-> 143
/*     */     //   #40	-> 146
/*     */     //   #41	-> 148
/*     */     //   #35	-> 149
/*     */     //   #44	-> 155
/*     */     //   #45	-> 159
/*     */     //   #46	-> 160
/*     */     //   #47	-> 161
/*     */     //   #48	-> 163
/*     */     //   #49	-> 179
/*     */     //   #50	-> 182
/*     */     //   #51	-> 184
/*     */     //   #52	-> 185
/*     */     //   #44	-> 186
/*     */     //   #56	-> 189
/*     */     //   #57	-> 200
/*     */     //   #59	-> 211
/*     */     //   #60	-> 214
/*     */     //   #58	-> 214
/*     */     //   #108	-> 232
/*     */     //   #109	-> 243
/*     */     //   #111	-> 248
/*     */     //   #112	-> 255
/*     */     //   #113	-> 265
/*     */     //   #114	-> 269
/*     */     //   #115	-> 270
/*     */     //   #116	-> 277
/*     */     //   #117	-> 293
/*     */     //   #118	-> 296
/*     */     //   #119	-> 298
/*     */     //   #113	-> 299
/*     */     //   #122	-> 305
/*     */     //   #123	-> 309
/*     */     //   #124	-> 310
/*     */     //   #125	-> 311
/*     */     //   #126	-> 313
/*     */     //   #127	-> 329
/*     */     //   #128	-> 332
/*     */     //   #129	-> 334
/*     */     //   #130	-> 335
/*     */     //   #122	-> 336
/*     */     //   #135	-> 342
/*     */     //   #136	-> 353
/*     */     //   #138	-> 358
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	359	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	359	1	x	D
/*     */     //   0	359	3	y	D
/*     */     //   0	359	5	z	D
/*     */     //   0	359	7	entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$0(Entity $entity, LevelAccessor $world, double $x, double $y, double $z) {
/*  61 */     Level _level = null;
/*  62 */     if (!$entity.level().isClientSide()) {
/*  63 */       $entity.discard();
/*     */     }
/*  65 */     if ($world instanceof Level) {
/*  66 */       _level = (Level)$world;
/*  67 */       if (!_level.isClientSide()) {
/*  68 */         _level.playSound(
/*  69 */             null, 
/*  70 */             BlockPos.containing($x, $y, $z), 
/*  71 */             (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse(
/*  72 */                 "block.bell.resonate")), 
/*     */             
/*  74 */             SoundSource.NEUTRAL, 
/*  75 */             555.0F, 
/*  76 */             0.0F);
/*     */       } else {
/*     */         
/*  79 */         _level.playLocalSound(
/*  80 */             $x, 
/*  81 */             $y, 
/*  82 */             $z, 
/*  83 */             (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse(
/*  84 */                 "block.bell.resonate")), 
/*     */             
/*  86 */             SoundSource.NEUTRAL, 
/*  87 */             555.0F, 
/*  88 */             0.0F, 
/*  89 */             false);
/*     */       } 
/*     */     } 
/*     */     
/*  93 */     if (Math.random() < 0.1D && $world instanceof ServerLevel) {
/*  94 */       _level = (Level)$world;
/*     */       
/*  96 */       Intrinsics.checkNotNull(TBSEntities.THE_BROKEN_END.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.THE_BROKEN_END.get()).spawn(
/*  97 */           (ServerLevel)_level, 
/*  98 */           BlockPos.containing($x, $y, $z), 
/*  99 */           MobSpawnType.MOB_SUMMONED);
/*     */       
/* 101 */       if (entityToSpawn != null)
/* 102 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\brokenend\TheBrokenEndStalkOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */