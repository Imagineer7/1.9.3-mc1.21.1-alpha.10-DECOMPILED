/*    */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.OutOfCaveCheckEntity;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J0\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\006\020\f\032\0020\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitStalkOnEntityTickUpdateProcedure;", "", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class CircuitStalkOnEntityTickUpdateProcedure
/*    */ {
/*    */   @NotNull
/*    */   public static final CircuitStalkOnEntityTickUpdateProcedure INSTANCE = new CircuitStalkOnEntityTickUpdateProcedure();
/*    */   
/*    */   @JvmStatic
/*    */   public static final void execute(@NotNull Level level, double x, double y, double z, @NotNull Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'level'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #7
/*    */     //   8: ldc 'entity'
/*    */     //   10: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   13: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   16: aload_0
/*    */     //   17: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   20: ldc net/minecraft/world/entity/player/Player
/*    */     //   22: new net/minecraft/world/phys/Vec3
/*    */     //   25: dup
/*    */     //   26: dload_1
/*    */     //   27: dload_3
/*    */     //   28: dload #5
/*    */     //   30: invokespecial <init> : (DDD)V
/*    */     //   33: ldc2_w 10.0
/*    */     //   36: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   39: checkcast java/util/Collection
/*    */     //   42: invokeinterface isEmpty : ()Z
/*    */     //   47: ifne -> 54
/*    */     //   50: iconst_1
/*    */     //   51: goto -> 55
/*    */     //   54: iconst_0
/*    */     //   55: ifeq -> 556
/*    */     //   58: invokestatic random : ()D
/*    */     //   61: ldc2_w 0.5
/*    */     //   64: dcmpg
/*    */     //   65: ifge -> 253
/*    */     //   68: aload #7
/*    */     //   70: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   73: invokevirtual isClientSide : ()Z
/*    */     //   76: ifne -> 84
/*    */     //   79: aload #7
/*    */     //   81: invokevirtual discard : ()V
/*    */     //   84: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   87: aload_0
/*    */     //   88: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   91: ldc net/minecraft/world/entity/player/Player
/*    */     //   93: new net/minecraft/world/phys/Vec3
/*    */     //   96: dup
/*    */     //   97: dload_1
/*    */     //   98: dload_3
/*    */     //   99: dload #5
/*    */     //   101: invokespecial <init> : (DDD)V
/*    */     //   104: ldc2_w 2100.0
/*    */     //   107: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
/*    */     //   110: checkcast net/minecraft/world/entity/player/Player
/*    */     //   113: astore #8
/*    */     //   115: aload #8
/*    */     //   117: ifnull -> 151
/*    */     //   120: aload #8
/*    */     //   122: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   125: invokevirtual isClientSide : ()Z
/*    */     //   128: ifne -> 151
/*    */     //   131: aload #8
/*    */     //   133: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   136: dup
/*    */     //   137: getstatic net/minecraft/world/effect/MobEffects.BLINDNESS : Lnet/minecraft/core/Holder;
/*    */     //   140: sipush #500
/*    */     //   143: iconst_1
/*    */     //   144: invokespecial <init> : (Lnet/minecraft/core/Holder;II)V
/*    */     //   147: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   150: pop
/*    */     //   151: getstatic dev/wendigodrip/thebrokenscript/util/WorldExt.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/WorldExt;
/*    */     //   154: aload_0
/*    */     //   155: new net/minecraft/world/phys/Vec3
/*    */     //   158: dup
/*    */     //   159: dload_1
/*    */     //   160: dload_3
/*    */     //   161: dload #5
/*    */     //   163: invokespecial <init> : (DDD)V
/*    */     //   166: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*    */     //   169: invokevirtual value : ()Ljava/lang/Object;
/*    */     //   172: dup
/*    */     //   173: ldc 'value(...)'
/*    */     //   175: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   178: checkcast net/minecraft/sounds/SoundEvent
/*    */     //   181: ldc 555.0
/*    */     //   183: fconst_0
/*    */     //   184: aconst_null
/*    */     //   185: bipush #16
/*    */     //   187: aconst_null
/*    */     //   188: invokestatic tryPlaySound$default : (Ldev/wendigodrip/thebrokenscript/util/WorldExt;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/sounds/SoundEvent;FFLnet/minecraft/sounds/SoundSource;ILjava/lang/Object;)V
/*    */     //   191: getstatic dev/wendigodrip/thebrokenscript/util/WorldExt.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/WorldExt;
/*    */     //   194: aload_0
/*    */     //   195: new net/minecraft/world/phys/Vec3
/*    */     //   198: dup
/*    */     //   199: dload_1
/*    */     //   200: dload_3
/*    */     //   201: dload #5
/*    */     //   203: invokespecial <init> : (DDD)V
/*    */     //   206: getstatic dev/wendigodrip/thebrokenscript/registry/TBSSounds.INSTANCE : Ldev/wendigodrip/thebrokenscript/registry/TBSSounds;
/*    */     //   209: invokevirtual getCIRCUIT_MINIGAME_SPEECH_AND_COUNTING : ()Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   212: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   215: dup
/*    */     //   216: ldc 'get(...)'
/*    */     //   218: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   221: checkcast net/minecraft/sounds/SoundEvent
/*    */     //   224: ldc 555.0
/*    */     //   226: fconst_1
/*    */     //   227: aconst_null
/*    */     //   228: bipush #16
/*    */     //   230: aconst_null
/*    */     //   231: invokestatic tryPlaySound$default : (Ldev/wendigodrip/thebrokenscript/util/WorldExt;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/sounds/SoundEvent;FFLnet/minecraft/sounds/SoundSource;ILjava/lang/Object;)V
/*    */     //   234: sipush #1800
/*    */     //   237: aload_0
/*    */     //   238: dload_1
/*    */     //   239: dload_3
/*    */     //   240: dload #5
/*    */     //   242: <illegal opcode> run : (Lnet/minecraft/world/level/Level;DDD)Ljava/lang/Runnable;
/*    */     //   247: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   250: goto -> 556
/*    */     //   253: invokestatic random : ()D
/*    */     //   256: ldc2_w 0.7
/*    */     //   259: dcmpg
/*    */     //   260: ifge -> 411
/*    */     //   263: aload #7
/*    */     //   265: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   268: invokevirtual isClientSide : ()Z
/*    */     //   271: ifne -> 279
/*    */     //   274: aload #7
/*    */     //   276: invokevirtual discard : ()V
/*    */     //   279: aload_0
/*    */     //   280: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   283: ifeq -> 342
/*    */     //   286: getstatic dev/wendigodrip/thebrokenscript/registry/TBSEntities.CIRCUIT : Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   289: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   292: checkcast net/minecraft/world/entity/EntityType
/*    */     //   295: aload_0
/*    */     //   296: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   299: dload_1
/*    */     //   300: dload_3
/*    */     //   301: dload #5
/*    */     //   303: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   306: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   309: invokevirtual spawn : (Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/MobSpawnType;)Lnet/minecraft/world/entity/Entity;
/*    */     //   312: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitEntity
/*    */     //   315: astore #8
/*    */     //   317: aload #8
/*    */     //   319: ifnull -> 342
/*    */     //   322: aload #8
/*    */     //   324: aload_0
/*    */     //   325: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   328: invokevirtual getRandom : ()Lnet/minecraft/util/RandomSource;
/*    */     //   331: invokeinterface nextFloat : ()F
/*    */     //   336: ldc 360.0
/*    */     //   338: fmul
/*    */     //   339: invokevirtual setYRot : (F)V
/*    */     //   342: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   345: aload_0
/*    */     //   346: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   349: ldc net/minecraft/world/entity/player/Player
/*    */     //   351: new net/minecraft/world/phys/Vec3
/*    */     //   354: dup
/*    */     //   355: dload_1
/*    */     //   356: dload_3
/*    */     //   357: dload #5
/*    */     //   359: invokespecial <init> : (DDD)V
/*    */     //   362: ldc2_w 2100.0
/*    */     //   365: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
/*    */     //   368: checkcast net/minecraft/world/entity/player/Player
/*    */     //   371: astore #8
/*    */     //   373: aload #8
/*    */     //   375: ifnull -> 556
/*    */     //   378: aload #8
/*    */     //   380: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   383: invokevirtual isClientSide : ()Z
/*    */     //   386: ifne -> 556
/*    */     //   389: aload #8
/*    */     //   391: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   394: dup
/*    */     //   395: getstatic net/minecraft/world/effect/MobEffects.DARKNESS : Lnet/minecraft/core/Holder;
/*    */     //   398: bipush #60
/*    */     //   400: iconst_1
/*    */     //   401: invokespecial <init> : (Lnet/minecraft/core/Holder;II)V
/*    */     //   404: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   407: pop
/*    */     //   408: goto -> 556
/*    */     //   411: aload #7
/*    */     //   413: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   416: invokevirtual isClientSide : ()Z
/*    */     //   419: ifne -> 427
/*    */     //   422: aload #7
/*    */     //   424: invokevirtual discard : ()V
/*    */     //   427: aload_0
/*    */     //   428: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   431: ifeq -> 490
/*    */     //   434: getstatic dev/wendigodrip/thebrokenscript/registry/TBSEntities.CURVED : Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   437: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   440: checkcast net/minecraft/world/entity/EntityType
/*    */     //   443: aload_0
/*    */     //   444: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   447: dload_1
/*    */     //   448: dload_3
/*    */     //   449: dload #5
/*    */     //   451: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   454: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   457: invokevirtual spawn : (Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/MobSpawnType;)Lnet/minecraft/world/entity/Entity;
/*    */     //   460: checkcast dev/wendigodrip/thebrokenscript/entity/CurvedEntity
/*    */     //   463: astore #8
/*    */     //   465: aload #8
/*    */     //   467: ifnull -> 490
/*    */     //   470: aload #8
/*    */     //   472: aload_0
/*    */     //   473: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   476: invokevirtual getRandom : ()Lnet/minecraft/util/RandomSource;
/*    */     //   479: invokeinterface nextFloat : ()F
/*    */     //   484: ldc 360.0
/*    */     //   486: fmul
/*    */     //   487: invokevirtual setYRot : (F)V
/*    */     //   490: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   493: aload_0
/*    */     //   494: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   497: ldc net/minecraft/world/entity/player/Player
/*    */     //   499: new net/minecraft/world/phys/Vec3
/*    */     //   502: dup
/*    */     //   503: dload_1
/*    */     //   504: dload_3
/*    */     //   505: dload #5
/*    */     //   507: invokespecial <init> : (DDD)V
/*    */     //   510: ldc2_w 2100.0
/*    */     //   513: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
/*    */     //   516: checkcast net/minecraft/world/entity/player/Player
/*    */     //   519: astore #8
/*    */     //   521: aload #8
/*    */     //   523: ifnull -> 556
/*    */     //   526: aload #8
/*    */     //   528: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   531: invokevirtual isClientSide : ()Z
/*    */     //   534: ifne -> 556
/*    */     //   537: aload #8
/*    */     //   539: new net/minecraft/world/effect/MobEffectInstance
/*    */     //   542: dup
/*    */     //   543: getstatic net/minecraft/world/effect/MobEffects.DARKNESS : Lnet/minecraft/core/Holder;
/*    */     //   546: bipush #60
/*    */     //   548: iconst_1
/*    */     //   549: invokespecial <init> : (Lnet/minecraft/core/Holder;II)V
/*    */     //   552: invokevirtual addEffect : (Lnet/minecraft/world/effect/MobEffectInstance;)Z
/*    */     //   555: pop
/*    */     //   556: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   559: aload_0
/*    */     //   560: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   563: ldc net/minecraft/world/entity/player/Player
/*    */     //   565: new net/minecraft/world/phys/Vec3
/*    */     //   568: dup
/*    */     //   569: dload_1
/*    */     //   570: dload_3
/*    */     //   571: dload #5
/*    */     //   573: invokespecial <init> : (DDD)V
/*    */     //   576: ldc2_w 2000.0
/*    */     //   579: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   582: checkcast java/util/Collection
/*    */     //   585: invokeinterface isEmpty : ()Z
/*    */     //   590: ifne -> 597
/*    */     //   593: iconst_1
/*    */     //   594: goto -> 598
/*    */     //   597: iconst_0
/*    */     //   598: ifeq -> 1040
/*    */     //   601: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   604: aload_0
/*    */     //   605: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   608: ldc net/minecraft/world/entity/player/Player
/*    */     //   610: new net/minecraft/world/phys/Vec3
/*    */     //   613: dup
/*    */     //   614: dload_1
/*    */     //   615: dload_3
/*    */     //   616: dload #5
/*    */     //   618: invokespecial <init> : (DDD)V
/*    */     //   621: ldc2_w 2100.0
/*    */     //   624: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
/*    */     //   627: dup
/*    */     //   628: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   631: checkcast net/minecraft/world/entity/player/Player
/*    */     //   634: astore #8
/*    */     //   636: aload #7
/*    */     //   638: instanceof net/minecraft/world/entity/Mob
/*    */     //   641: ifeq -> 657
/*    */     //   644: aload #7
/*    */     //   646: checkcast net/minecraft/world/entity/Mob
/*    */     //   649: aload #8
/*    */     //   651: checkcast net/minecraft/world/entity/LivingEntity
/*    */     //   654: invokevirtual setTarget : (Lnet/minecraft/world/entity/LivingEntity;)V
/*    */     //   657: aload #7
/*    */     //   659: instanceof dev/wendigodrip/thebrokenscript/entity/CircuitStareEntity
/*    */     //   662: ifeq -> 681
/*    */     //   665: aload #7
/*    */     //   667: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitStareEntity
/*    */     //   670: getstatic net/minecraft/commands/arguments/EntityAnchorArgument$Anchor.EYES : Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;
/*    */     //   673: aload #8
/*    */     //   675: invokevirtual position : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   678: invokevirtual lookAt : (Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/phys/Vec3;)V
/*    */     //   681: aload #7
/*    */     //   683: instanceof dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity
/*    */     //   686: ifeq -> 1040
/*    */     //   689: aload #7
/*    */     //   691: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity
/*    */     //   694: getstatic net/minecraft/commands/arguments/EntityAnchorArgument$Anchor.EYES : Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;
/*    */     //   697: aload #8
/*    */     //   699: invokevirtual position : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   702: invokevirtual lookAt : (Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/phys/Vec3;)V
/*    */     //   705: aload #7
/*    */     //   707: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity
/*    */     //   710: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   713: ldc 'distance'
/*    */     //   715: aload #7
/*    */     //   717: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity
/*    */     //   720: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   723: ldc 'distance'
/*    */     //   725: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   728: dconst_1
/*    */     //   729: dadd
/*    */     //   730: invokevirtual putDouble : (Ljava/lang/String;D)V
/*    */     //   733: aload #7
/*    */     //   735: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity
/*    */     //   738: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   741: ldc 'distance'
/*    */     //   743: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   746: ldc2_w 145.0
/*    */     //   749: dcmpl
/*    */     //   750: ifle -> 767
/*    */     //   753: aload #7
/*    */     //   755: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity
/*    */     //   758: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   761: ldc 'distance'
/*    */     //   763: dconst_0
/*    */     //   764: invokevirtual putDouble : (Ljava/lang/String;D)V
/*    */     //   767: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   770: aload_0
/*    */     //   771: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   774: ldc net/minecraft/world/entity/player/Player
/*    */     //   776: new net/minecraft/world/phys/Vec3
/*    */     //   779: dup
/*    */     //   780: dload_1
/*    */     //   781: dload_3
/*    */     //   782: dload #5
/*    */     //   784: invokespecial <init> : (DDD)V
/*    */     //   787: ldc2_w 150.0
/*    */     //   790: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   793: checkcast java/util/Collection
/*    */     //   796: invokeinterface isEmpty : ()Z
/*    */     //   801: ifne -> 808
/*    */     //   804: iconst_1
/*    */     //   805: goto -> 809
/*    */     //   808: iconst_0
/*    */     //   809: ifeq -> 1040
/*    */     //   812: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   815: aload_0
/*    */     //   816: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   819: ldc net/minecraft/world/entity/player/Player
/*    */     //   821: new net/minecraft/world/phys/Vec3
/*    */     //   824: dup
/*    */     //   825: dload_1
/*    */     //   826: dload_3
/*    */     //   827: dload #5
/*    */     //   829: invokespecial <init> : (DDD)V
/*    */     //   832: ldc2_w 150.0
/*    */     //   835: invokevirtual findClosestEntityInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;
/*    */     //   838: dup
/*    */     //   839: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   842: checkcast net/minecraft/world/entity/player/Player
/*    */     //   845: astore #9
/*    */     //   847: aload #9
/*    */     //   849: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   852: new net/minecraft/world/level/ClipContext
/*    */     //   855: dup
/*    */     //   856: aload #9
/*    */     //   858: fconst_1
/*    */     //   859: invokevirtual getEyePosition : (F)Lnet/minecraft/world/phys/Vec3;
/*    */     //   862: aload #9
/*    */     //   864: fconst_1
/*    */     //   865: invokevirtual getEyePosition : (F)Lnet/minecraft/world/phys/Vec3;
/*    */     //   868: aload #9
/*    */     //   870: fconst_1
/*    */     //   871: invokevirtual getViewVector : (F)Lnet/minecraft/world/phys/Vec3;
/*    */     //   874: aload #7
/*    */     //   876: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity
/*    */     //   879: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*    */     //   882: ldc 'distance'
/*    */     //   884: invokevirtual getDouble : (Ljava/lang/String;)D
/*    */     //   887: invokevirtual scale : (D)Lnet/minecraft/world/phys/Vec3;
/*    */     //   890: invokevirtual add : (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
/*    */     //   893: getstatic net/minecraft/world/level/ClipContext$Block.OUTLINE : Lnet/minecraft/world/level/ClipContext$Block;
/*    */     //   896: getstatic net/minecraft/world/level/ClipContext$Fluid.NONE : Lnet/minecraft/world/level/ClipContext$Fluid;
/*    */     //   899: aload #9
/*    */     //   901: checkcast net/minecraft/world/entity/Entity
/*    */     //   904: invokespecial <init> : (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/ClipContext$Block;Lnet/minecraft/world/level/ClipContext$Fluid;Lnet/minecraft/world/entity/Entity;)V
/*    */     //   907: invokevirtual clip : (Lnet/minecraft/world/level/ClipContext;)Lnet/minecraft/world/phys/BlockHitResult;
/*    */     //   910: astore #10
/*    */     //   912: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   915: aload_0
/*    */     //   916: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   919: ldc dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity
/*    */     //   921: aload #10
/*    */     //   923: invokevirtual getBlockPos : ()Lnet/minecraft/core/BlockPos;
/*    */     //   926: invokevirtual getCenter : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   929: dup
/*    */     //   930: ldc_w 'getCenter(...)'
/*    */     //   933: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   936: ldc2_w 3.0
/*    */     //   939: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   942: checkcast java/util/Collection
/*    */     //   945: invokeinterface isEmpty : ()Z
/*    */     //   950: ifne -> 957
/*    */     //   953: iconst_1
/*    */     //   954: goto -> 958
/*    */     //   957: iconst_0
/*    */     //   958: ifeq -> 1040
/*    */     //   961: aload #7
/*    */     //   963: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   966: invokevirtual isClientSide : ()Z
/*    */     //   969: ifne -> 977
/*    */     //   972: aload #7
/*    */     //   974: invokevirtual discard : ()V
/*    */     //   977: aload_0
/*    */     //   978: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   981: ifeq -> 1040
/*    */     //   984: getstatic dev/wendigodrip/thebrokenscript/registry/TBSEntities.CIRCUIT_MINESHAFT_FLEE : Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   987: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   990: checkcast net/minecraft/world/entity/EntityType
/*    */     //   993: aload_0
/*    */     //   994: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   997: dload_1
/*    */     //   998: dload_3
/*    */     //   999: dload #5
/*    */     //   1001: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   1004: getstatic net/minecraft/world/entity/MobSpawnType.MOB_SUMMONED : Lnet/minecraft/world/entity/MobSpawnType;
/*    */     //   1007: invokevirtual spawn : (Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/MobSpawnType;)Lnet/minecraft/world/entity/Entity;
/*    */     //   1010: checkcast dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftFleeEntity
/*    */     //   1013: astore #11
/*    */     //   1015: aload #11
/*    */     //   1017: ifnull -> 1040
/*    */     //   1020: aload #11
/*    */     //   1022: aload_0
/*    */     //   1023: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   1026: invokevirtual getRandom : ()Lnet/minecraft/util/RandomSource;
/*    */     //   1029: invokeinterface nextFloat : ()F
/*    */     //   1034: ldc 360.0
/*    */     //   1036: fmul
/*    */     //   1037: invokevirtual setYRot : (F)V
/*    */     //   1040: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 13
/*    */     //   #28	-> 55
/*    */     //   #29	-> 58
/*    */     //   #30	-> 68
/*    */     //   #31	-> 79
/*    */     //   #34	-> 84
/*    */     //   #36	-> 115
/*    */     //   #37	-> 131
/*    */     //   #40	-> 151
/*    */     //   #41	-> 191
/*    */     //   #44	-> 234
/*    */     //   #45	-> 237
/*    */     //   #43	-> 237
/*    */     //   #52	-> 253
/*    */     //   #53	-> 263
/*    */     //   #54	-> 274
/*    */     //   #56	-> 279
/*    */     //   #58	-> 286
/*    */     //   #57	-> 286
/*    */     //   #58	-> 295
/*    */     //   #57	-> 322
/*    */     //   #59	-> 324
/*    */     //   #58	-> 339
/*    */     //   #62	-> 342
/*    */     //   #64	-> 373
/*    */     //   #65	-> 389
/*    */     //   #68	-> 411
/*    */     //   #69	-> 422
/*    */     //   #72	-> 427
/*    */     //   #74	-> 434
/*    */     //   #73	-> 434
/*    */     //   #74	-> 443
/*    */     //   #73	-> 470
/*    */     //   #75	-> 472
/*    */     //   #74	-> 487
/*    */     //   #78	-> 490
/*    */     //   #80	-> 521
/*    */     //   #81	-> 537
/*    */     //   #86	-> 556
/*    */     //   #86	-> 598
/*    */     //   #87	-> 601
/*    */     //   #89	-> 636
/*    */     //   #90	-> 644
/*    */     //   #93	-> 657
/*    */     //   #94	-> 665
/*    */     //   #97	-> 681
/*    */     //   #98	-> 689
/*    */     //   #99	-> 705
/*    */     //   #101	-> 733
/*    */     //   #102	-> 753
/*    */     //   #105	-> 767
/*    */     //   #105	-> 809
/*    */     //   #106	-> 812
/*    */     //   #108	-> 847
/*    */     //   #109	-> 852
/*    */     //   #110	-> 856
/*    */     //   #111	-> 868
/*    */     //   #112	-> 874
/*    */     //   #113	-> 882
/*    */     //   #112	-> 884
/*    */     //   #111	-> 887
/*    */     //   #110	-> 890
/*    */     //   #116	-> 893
/*    */     //   #109	-> 904
/*    */     //   #108	-> 907
/*    */     //   #120	-> 912
/*    */     //   #121	-> 945
/*    */     //   #121	-> 958
/*    */     //   #123	-> 961
/*    */     //   #124	-> 972
/*    */     //   #127	-> 977
/*    */     //   #129	-> 984
/*    */     //   #128	-> 984
/*    */     //   #129	-> 993
/*    */     //   #128	-> 1020
/*    */     //   #130	-> 1022
/*    */     //   #129	-> 1037
/*    */     //   #136	-> 1040
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   115	135	8	player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   373	35	8	player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   521	35	8	player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   847	193	9	closestPlayer	Lnet/minecraft/world/entity/player/Player;
/*    */     //   912	128	10	rayCast	Lnet/minecraft/world/phys/BlockHitResult;
/*    */     //   636	404	8	player	Lnet/minecraft/world/entity/player/Player;
/*    */     //   0	1041	0	level	Lnet/minecraft/world/level/Level;
/*    */     //   0	1041	1	x	D
/*    */     //   0	1041	3	y	D
/*    */     //   0	1041	5	z	D
/*    */     //   0	1041	7	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$0(Level $level, double $x, double $y, double $z) {
/* 46 */     if ($level instanceof ServerLevel) {
/*    */       
/* 48 */       OutOfCaveCheckEntity outOfCaveCheckEntity = (OutOfCaveCheckEntity)((EntityType)TBSEntities.OUT_OF_CAVE_CHECK.get()).spawn((ServerLevel)$level, BlockPos.containing($x, $y, $z), MobSpawnType.MOB_SUMMONED); if (outOfCaveCheckEntity != null) outOfCaveCheckEntity.setYRot((
/* 49 */             (ServerLevel)$level).getRandom().nextFloat() * 360.0F); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitStalkOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */