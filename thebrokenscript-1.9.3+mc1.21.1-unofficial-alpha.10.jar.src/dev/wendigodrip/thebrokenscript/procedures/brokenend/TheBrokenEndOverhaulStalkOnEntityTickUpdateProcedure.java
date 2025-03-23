/*     */ package dev.wendigodrip.thebrokenscript.procedures.brokenend;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndOverhaulStalkEntity;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure
/*     */ {
/*     */   @NotNull
/*     */   public static final TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure INSTANCE = new TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure();
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
/*     */     //   12: aload #7
/*     */     //   14: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*     */     //   17: ldc 'distance'
/*     */     //   19: aload #7
/*     */     //   21: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*     */     //   24: ldc 'distance'
/*     */     //   26: invokevirtual getDouble : (Ljava/lang/String;)D
/*     */     //   29: ldc2_w 2.0
/*     */     //   32: dadd
/*     */     //   33: invokevirtual putDouble : (Ljava/lang/String;D)V
/*     */     //   36: aload #7
/*     */     //   38: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*     */     //   41: ldc 'distance'
/*     */     //   43: invokevirtual getDouble : (Ljava/lang/String;)D
/*     */     //   46: ldc2_w 700.0
/*     */     //   49: dcmpl
/*     */     //   50: ifle -> 64
/*     */     //   53: aload #7
/*     */     //   55: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*     */     //   58: ldc 'distance'
/*     */     //   60: dconst_0
/*     */     //   61: invokevirtual putDouble : (Ljava/lang/String;D)V
/*     */     //   64: aload_0
/*     */     //   65: ldc net/minecraft/world/entity/player/Player
/*     */     //   67: new net/minecraft/world/phys/Vec3
/*     */     //   70: dup
/*     */     //   71: dload_1
/*     */     //   72: dload_3
/*     */     //   73: dload #5
/*     */     //   75: invokespecial <init> : (DDD)V
/*     */     //   78: ldc2_w 500.0
/*     */     //   81: ldc2_w 500.0
/*     */     //   84: ldc2_w 500.0
/*     */     //   87: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   90: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   95: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   100: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   105: invokeinterface isEmpty : ()Z
/*     */     //   110: ifne -> 1640
/*     */     //   113: aload_0
/*     */     //   114: ldc dev/wendigodrip/thebrokenscript/entity/TheBrokenEndOverhaulStalkEntity
/*     */     //   116: new net/minecraft/world/phys/Vec3
/*     */     //   119: dup
/*     */     //   120: aload_0
/*     */     //   121: ldc net/minecraft/world/entity/player/Player
/*     */     //   123: new net/minecraft/world/phys/Vec3
/*     */     //   126: dup
/*     */     //   127: dload_1
/*     */     //   128: dload_3
/*     */     //   129: dload #5
/*     */     //   131: invokespecial <init> : (DDD)V
/*     */     //   134: ldc2_w 150.0
/*     */     //   137: ldc2_w 150.0
/*     */     //   140: ldc2_w 150.0
/*     */     //   143: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   146: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   151: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   156: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   161: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   166: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$3
/*     */     //   169: dup
/*     */     //   170: invokespecial <init> : ()V
/*     */     //   173: dload_1
/*     */     //   174: dload_3
/*     */     //   175: dload #5
/*     */     //   177: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   180: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   185: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   190: aconst_null
/*     */     //   191: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   194: checkcast net/minecraft/world/entity/player/Player
/*     */     //   197: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   200: new net/minecraft/world/level/ClipContext
/*     */     //   203: dup
/*     */     //   204: aload_0
/*     */     //   205: ldc net/minecraft/world/entity/player/Player
/*     */     //   207: new net/minecraft/world/phys/Vec3
/*     */     //   210: dup
/*     */     //   211: dload_1
/*     */     //   212: dload_3
/*     */     //   213: dload #5
/*     */     //   215: invokespecial <init> : (DDD)V
/*     */     //   218: ldc2_w 150.0
/*     */     //   221: ldc2_w 150.0
/*     */     //   224: ldc2_w 150.0
/*     */     //   227: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   230: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   235: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   240: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   245: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   250: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$5
/*     */     //   253: dup
/*     */     //   254: invokespecial <init> : ()V
/*     */     //   257: dload_1
/*     */     //   258: dload_3
/*     */     //   259: dload #5
/*     */     //   261: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   264: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   269: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   274: aconst_null
/*     */     //   275: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   278: checkcast net/minecraft/world/entity/player/Player
/*     */     //   281: fconst_1
/*     */     //   282: invokevirtual getEyePosition : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   285: aload_0
/*     */     //   286: ldc net/minecraft/world/entity/player/Player
/*     */     //   288: new net/minecraft/world/phys/Vec3
/*     */     //   291: dup
/*     */     //   292: dload_1
/*     */     //   293: dload_3
/*     */     //   294: dload #5
/*     */     //   296: invokespecial <init> : (DDD)V
/*     */     //   299: ldc2_w 150.0
/*     */     //   302: ldc2_w 150.0
/*     */     //   305: ldc2_w 150.0
/*     */     //   308: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   311: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   316: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   321: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   326: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   331: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$7
/*     */     //   334: dup
/*     */     //   335: invokespecial <init> : ()V
/*     */     //   338: dload_1
/*     */     //   339: dload_3
/*     */     //   340: dload #5
/*     */     //   342: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   345: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   350: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   355: aconst_null
/*     */     //   356: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   359: checkcast net/minecraft/world/entity/player/Player
/*     */     //   362: fconst_1
/*     */     //   363: invokevirtual getEyePosition : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   366: aload_0
/*     */     //   367: ldc net/minecraft/world/entity/player/Player
/*     */     //   369: new net/minecraft/world/phys/Vec3
/*     */     //   372: dup
/*     */     //   373: dload_1
/*     */     //   374: dload_3
/*     */     //   375: dload #5
/*     */     //   377: invokespecial <init> : (DDD)V
/*     */     //   380: ldc2_w 150.0
/*     */     //   383: ldc2_w 150.0
/*     */     //   386: ldc2_w 150.0
/*     */     //   389: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   392: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   397: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   402: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   407: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   412: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$9
/*     */     //   415: dup
/*     */     //   416: invokespecial <init> : ()V
/*     */     //   419: dload_1
/*     */     //   420: dload_3
/*     */     //   421: dload #5
/*     */     //   423: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   426: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   431: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   436: aconst_null
/*     */     //   437: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   440: checkcast net/minecraft/world/entity/player/Player
/*     */     //   443: fconst_1
/*     */     //   444: invokevirtual getViewVector : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   447: aload #7
/*     */     //   449: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*     */     //   452: ldc 'distance'
/*     */     //   454: invokevirtual getDouble : (Ljava/lang/String;)D
/*     */     //   457: invokevirtual scale : (D)Lnet/minecraft/world/phys/Vec3;
/*     */     //   460: invokevirtual add : (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
/*     */     //   463: getstatic net/minecraft/world/level/ClipContext$Block.OUTLINE : Lnet/minecraft/world/level/ClipContext$Block;
/*     */     //   466: getstatic net/minecraft/world/level/ClipContext$Fluid.NONE : Lnet/minecraft/world/level/ClipContext$Fluid;
/*     */     //   469: aload_0
/*     */     //   470: ldc net/minecraft/world/entity/player/Player
/*     */     //   472: new net/minecraft/world/phys/Vec3
/*     */     //   475: dup
/*     */     //   476: dload_1
/*     */     //   477: dload_3
/*     */     //   478: dload #5
/*     */     //   480: invokespecial <init> : (DDD)V
/*     */     //   483: ldc2_w 150.0
/*     */     //   486: ldc2_w 150.0
/*     */     //   489: ldc2_w 150.0
/*     */     //   492: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   495: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   500: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   505: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   510: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   515: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$11
/*     */     //   518: dup
/*     */     //   519: invokespecial <init> : ()V
/*     */     //   522: dload_1
/*     */     //   523: dload_3
/*     */     //   524: dload #5
/*     */     //   526: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   529: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   534: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   539: aconst_null
/*     */     //   540: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   543: checkcast net/minecraft/world/entity/Entity
/*     */     //   546: invokespecial <init> : (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/ClipContext$Block;Lnet/minecraft/world/level/ClipContext$Fluid;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   549: invokevirtual clip : (Lnet/minecraft/world/level/ClipContext;)Lnet/minecraft/world/phys/BlockHitResult;
/*     */     //   552: invokevirtual getBlockPos : ()Lnet/minecraft/core/BlockPos;
/*     */     //   555: invokevirtual getX : ()I
/*     */     //   558: i2d
/*     */     //   559: aload_0
/*     */     //   560: ldc net/minecraft/world/entity/player/Player
/*     */     //   562: new net/minecraft/world/phys/Vec3
/*     */     //   565: dup
/*     */     //   566: dload_1
/*     */     //   567: dload_3
/*     */     //   568: dload #5
/*     */     //   570: invokespecial <init> : (DDD)V
/*     */     //   573: ldc2_w 150.0
/*     */     //   576: ldc2_w 150.0
/*     */     //   579: ldc2_w 150.0
/*     */     //   582: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   585: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   590: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   595: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   600: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   605: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$13
/*     */     //   608: dup
/*     */     //   609: invokespecial <init> : ()V
/*     */     //   612: dload_1
/*     */     //   613: dload_3
/*     */     //   614: dload #5
/*     */     //   616: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   619: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   624: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   629: aconst_null
/*     */     //   630: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   633: checkcast net/minecraft/world/entity/player/Player
/*     */     //   636: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   639: new net/minecraft/world/level/ClipContext
/*     */     //   642: dup
/*     */     //   643: aload_0
/*     */     //   644: ldc net/minecraft/world/entity/player/Player
/*     */     //   646: new net/minecraft/world/phys/Vec3
/*     */     //   649: dup
/*     */     //   650: dload_1
/*     */     //   651: dload_3
/*     */     //   652: dload #5
/*     */     //   654: invokespecial <init> : (DDD)V
/*     */     //   657: ldc2_w 150.0
/*     */     //   660: ldc2_w 150.0
/*     */     //   663: ldc2_w 150.0
/*     */     //   666: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   669: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   674: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   679: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   684: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   689: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$15
/*     */     //   692: dup
/*     */     //   693: invokespecial <init> : ()V
/*     */     //   696: dload_1
/*     */     //   697: dload_3
/*     */     //   698: dload #5
/*     */     //   700: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   703: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   708: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   713: aconst_null
/*     */     //   714: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   717: checkcast net/minecraft/world/entity/player/Player
/*     */     //   720: fconst_1
/*     */     //   721: invokevirtual getEyePosition : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   724: aload_0
/*     */     //   725: ldc net/minecraft/world/entity/player/Player
/*     */     //   727: new net/minecraft/world/phys/Vec3
/*     */     //   730: dup
/*     */     //   731: dload_1
/*     */     //   732: dload_3
/*     */     //   733: dload #5
/*     */     //   735: invokespecial <init> : (DDD)V
/*     */     //   738: ldc2_w 150.0
/*     */     //   741: ldc2_w 150.0
/*     */     //   744: ldc2_w 150.0
/*     */     //   747: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   750: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   755: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   760: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   765: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   770: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$17
/*     */     //   773: dup
/*     */     //   774: invokespecial <init> : ()V
/*     */     //   777: dload_1
/*     */     //   778: dload_3
/*     */     //   779: dload #5
/*     */     //   781: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   784: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   789: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   794: aconst_null
/*     */     //   795: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   798: checkcast net/minecraft/world/entity/player/Player
/*     */     //   801: fconst_1
/*     */     //   802: invokevirtual getEyePosition : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   805: aload_0
/*     */     //   806: ldc net/minecraft/world/entity/player/Player
/*     */     //   808: new net/minecraft/world/phys/Vec3
/*     */     //   811: dup
/*     */     //   812: dload_1
/*     */     //   813: dload_3
/*     */     //   814: dload #5
/*     */     //   816: invokespecial <init> : (DDD)V
/*     */     //   819: ldc2_w 150.0
/*     */     //   822: ldc2_w 150.0
/*     */     //   825: ldc2_w 150.0
/*     */     //   828: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   831: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   836: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   841: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   846: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   851: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$19
/*     */     //   854: dup
/*     */     //   855: invokespecial <init> : ()V
/*     */     //   858: dload_1
/*     */     //   859: dload_3
/*     */     //   860: dload #5
/*     */     //   862: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   865: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   870: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   875: aconst_null
/*     */     //   876: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   879: checkcast net/minecraft/world/entity/player/Player
/*     */     //   882: fconst_1
/*     */     //   883: invokevirtual getViewVector : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   886: aload #7
/*     */     //   888: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*     */     //   891: ldc 'distance'
/*     */     //   893: invokevirtual getDouble : (Ljava/lang/String;)D
/*     */     //   896: invokevirtual scale : (D)Lnet/minecraft/world/phys/Vec3;
/*     */     //   899: invokevirtual add : (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
/*     */     //   902: getstatic net/minecraft/world/level/ClipContext$Block.OUTLINE : Lnet/minecraft/world/level/ClipContext$Block;
/*     */     //   905: getstatic net/minecraft/world/level/ClipContext$Fluid.NONE : Lnet/minecraft/world/level/ClipContext$Fluid;
/*     */     //   908: aload_0
/*     */     //   909: ldc net/minecraft/world/entity/player/Player
/*     */     //   911: new net/minecraft/world/phys/Vec3
/*     */     //   914: dup
/*     */     //   915: dload_1
/*     */     //   916: dload_3
/*     */     //   917: dload #5
/*     */     //   919: invokespecial <init> : (DDD)V
/*     */     //   922: ldc2_w 150.0
/*     */     //   925: ldc2_w 150.0
/*     */     //   928: ldc2_w 150.0
/*     */     //   931: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   934: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   939: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   944: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   949: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   954: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$21
/*     */     //   957: dup
/*     */     //   958: invokespecial <init> : ()V
/*     */     //   961: dload_1
/*     */     //   962: dload_3
/*     */     //   963: dload #5
/*     */     //   965: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   968: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   973: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   978: aconst_null
/*     */     //   979: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   982: checkcast net/minecraft/world/entity/Entity
/*     */     //   985: invokespecial <init> : (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/ClipContext$Block;Lnet/minecraft/world/level/ClipContext$Fluid;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   988: invokevirtual clip : (Lnet/minecraft/world/level/ClipContext;)Lnet/minecraft/world/phys/BlockHitResult;
/*     */     //   991: invokevirtual getBlockPos : ()Lnet/minecraft/core/BlockPos;
/*     */     //   994: invokevirtual getY : ()I
/*     */     //   997: i2d
/*     */     //   998: aload_0
/*     */     //   999: ldc net/minecraft/world/entity/player/Player
/*     */     //   1001: new net/minecraft/world/phys/Vec3
/*     */     //   1004: dup
/*     */     //   1005: dload_1
/*     */     //   1006: dload_3
/*     */     //   1007: dload #5
/*     */     //   1009: invokespecial <init> : (DDD)V
/*     */     //   1012: ldc2_w 150.0
/*     */     //   1015: ldc2_w 150.0
/*     */     //   1018: ldc2_w 150.0
/*     */     //   1021: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   1024: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1029: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   1034: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   1039: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   1044: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$23
/*     */     //   1047: dup
/*     */     //   1048: invokespecial <init> : ()V
/*     */     //   1051: dload_1
/*     */     //   1052: dload_3
/*     */     //   1053: dload #5
/*     */     //   1055: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   1058: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   1063: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   1068: aconst_null
/*     */     //   1069: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1072: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1075: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   1078: new net/minecraft/world/level/ClipContext
/*     */     //   1081: dup
/*     */     //   1082: aload_0
/*     */     //   1083: ldc net/minecraft/world/entity/player/Player
/*     */     //   1085: new net/minecraft/world/phys/Vec3
/*     */     //   1088: dup
/*     */     //   1089: dload_1
/*     */     //   1090: dload_3
/*     */     //   1091: dload #5
/*     */     //   1093: invokespecial <init> : (DDD)V
/*     */     //   1096: ldc2_w 150.0
/*     */     //   1099: ldc2_w 150.0
/*     */     //   1102: ldc2_w 150.0
/*     */     //   1105: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   1108: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1113: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   1118: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   1123: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   1128: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$25
/*     */     //   1131: dup
/*     */     //   1132: invokespecial <init> : ()V
/*     */     //   1135: dload_1
/*     */     //   1136: dload_3
/*     */     //   1137: dload #5
/*     */     //   1139: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   1142: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   1147: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   1152: aconst_null
/*     */     //   1153: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1156: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1159: fconst_1
/*     */     //   1160: invokevirtual getEyePosition : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   1163: aload_0
/*     */     //   1164: ldc net/minecraft/world/entity/player/Player
/*     */     //   1166: new net/minecraft/world/phys/Vec3
/*     */     //   1169: dup
/*     */     //   1170: dload_1
/*     */     //   1171: dload_3
/*     */     //   1172: dload #5
/*     */     //   1174: invokespecial <init> : (DDD)V
/*     */     //   1177: ldc2_w 150.0
/*     */     //   1180: ldc2_w 150.0
/*     */     //   1183: ldc2_w 150.0
/*     */     //   1186: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   1189: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1194: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   1199: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   1204: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   1209: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$27
/*     */     //   1212: dup
/*     */     //   1213: invokespecial <init> : ()V
/*     */     //   1216: dload_1
/*     */     //   1217: dload_3
/*     */     //   1218: dload #5
/*     */     //   1220: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   1223: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   1228: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   1233: aconst_null
/*     */     //   1234: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1237: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1240: fconst_1
/*     */     //   1241: invokevirtual getEyePosition : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   1244: aload_0
/*     */     //   1245: ldc net/minecraft/world/entity/player/Player
/*     */     //   1247: new net/minecraft/world/phys/Vec3
/*     */     //   1250: dup
/*     */     //   1251: dload_1
/*     */     //   1252: dload_3
/*     */     //   1253: dload #5
/*     */     //   1255: invokespecial <init> : (DDD)V
/*     */     //   1258: ldc2_w 150.0
/*     */     //   1261: ldc2_w 150.0
/*     */     //   1264: ldc2_w 150.0
/*     */     //   1267: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   1270: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1275: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   1280: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   1285: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   1290: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$29
/*     */     //   1293: dup
/*     */     //   1294: invokespecial <init> : ()V
/*     */     //   1297: dload_1
/*     */     //   1298: dload_3
/*     */     //   1299: dload #5
/*     */     //   1301: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   1304: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   1309: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   1314: aconst_null
/*     */     //   1315: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1318: checkcast net/minecraft/world/entity/player/Player
/*     */     //   1321: fconst_1
/*     */     //   1322: invokevirtual getViewVector : (F)Lnet/minecraft/world/phys/Vec3;
/*     */     //   1325: aload #7
/*     */     //   1327: invokevirtual getPersistentData : ()Lnet/minecraft/nbt/CompoundTag;
/*     */     //   1330: ldc 'distance'
/*     */     //   1332: invokevirtual getDouble : (Ljava/lang/String;)D
/*     */     //   1335: invokevirtual scale : (D)Lnet/minecraft/world/phys/Vec3;
/*     */     //   1338: invokevirtual add : (Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;
/*     */     //   1341: getstatic net/minecraft/world/level/ClipContext$Block.OUTLINE : Lnet/minecraft/world/level/ClipContext$Block;
/*     */     //   1344: getstatic net/minecraft/world/level/ClipContext$Fluid.NONE : Lnet/minecraft/world/level/ClipContext$Fluid;
/*     */     //   1347: aload_0
/*     */     //   1348: ldc net/minecraft/world/entity/player/Player
/*     */     //   1350: new net/minecraft/world/phys/Vec3
/*     */     //   1353: dup
/*     */     //   1354: dload_1
/*     */     //   1355: dload_3
/*     */     //   1356: dload #5
/*     */     //   1358: invokespecial <init> : (DDD)V
/*     */     //   1361: ldc2_w 150.0
/*     */     //   1364: ldc2_w 150.0
/*     */     //   1367: ldc2_w 150.0
/*     */     //   1370: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   1373: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1378: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   1383: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   1388: invokeinterface stream : ()Ljava/util/stream/Stream;
/*     */     //   1393: new dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$31
/*     */     //   1396: dup
/*     */     //   1397: invokespecial <init> : ()V
/*     */     //   1400: dload_1
/*     */     //   1401: dload_3
/*     */     //   1402: dload #5
/*     */     //   1404: invokevirtual compareDistOf : (DDD)Ljava/util/Comparator;
/*     */     //   1407: invokeinterface sorted : (Ljava/util/Comparator;)Ljava/util/stream/Stream;
/*     */     //   1412: invokeinterface findFirst : ()Ljava/util/Optional;
/*     */     //   1417: aconst_null
/*     */     //   1418: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   1421: checkcast net/minecraft/world/entity/Entity
/*     */     //   1424: invokespecial <init> : (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/ClipContext$Block;Lnet/minecraft/world/level/ClipContext$Fluid;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   1427: invokevirtual clip : (Lnet/minecraft/world/level/ClipContext;)Lnet/minecraft/world/phys/BlockHitResult;
/*     */     //   1430: invokevirtual getBlockPos : ()Lnet/minecraft/core/BlockPos;
/*     */     //   1433: invokevirtual getZ : ()I
/*     */     //   1436: i2d
/*     */     //   1437: invokespecial <init> : (DDD)V
/*     */     //   1440: ldc2_w 3.0
/*     */     //   1443: ldc2_w 3.0
/*     */     //   1446: ldc2_w 3.0
/*     */     //   1449: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*     */     //   1452: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1457: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*     */     //   1462: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*     */     //   1467: invokeinterface isEmpty : ()Z
/*     */     //   1472: ifne -> 1640
/*     */     //   1475: invokestatic random : ()D
/*     */     //   1478: ldc2_w 0.7
/*     */     //   1481: dcmpg
/*     */     //   1482: ifge -> 1595
/*     */     //   1485: aload #7
/*     */     //   1487: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   1490: invokevirtual isClientSide : ()Z
/*     */     //   1493: ifne -> 1501
/*     */     //   1496: aload #7
/*     */     //   1498: invokevirtual discard : ()V
/*     */     //   1501: aload_0
/*     */     //   1502: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   1505: ifeq -> 1576
/*     */     //   1508: aload_0
/*     */     //   1509: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1512: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   1515: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   1518: new net/minecraft/commands/CommandSourceStack
/*     */     //   1521: dup
/*     */     //   1522: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   1525: new net/minecraft/world/phys/Vec3
/*     */     //   1528: dup
/*     */     //   1529: dload_1
/*     */     //   1530: dload_3
/*     */     //   1531: dload #5
/*     */     //   1533: invokespecial <init> : (DDD)V
/*     */     //   1536: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   1539: aload_0
/*     */     //   1540: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1543: iconst_4
/*     */     //   1544: ldc_w ''
/*     */     //   1547: ldc_w ''
/*     */     //   1550: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   1553: checkcast net/minecraft/network/chat/Component
/*     */     //   1556: aload_0
/*     */     //   1557: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   1560: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   1563: aconst_null
/*     */     //   1564: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   1567: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   1570: ldc_w 'stopsound @a'
/*     */     //   1573: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   1576: sipush #500
/*     */     //   1579: aload_0
/*     */     //   1580: dload_1
/*     */     //   1581: dload_3
/*     */     //   1582: dload #5
/*     */     //   1584: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   1589: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   1592: goto -> 1640
/*     */     //   1595: aload #7
/*     */     //   1597: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   1600: invokevirtual isClientSide : ()Z
/*     */     //   1603: ifne -> 1611
/*     */     //   1606: aload #7
/*     */     //   1608: invokevirtual discard : ()V
/*     */     //   1611: aload_0
/*     */     //   1612: dload_1
/*     */     //   1613: dload_3
/*     */     //   1614: dconst_1
/*     */     //   1615: dsub
/*     */     //   1616: dload #5
/*     */     //   1618: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   1621: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.PHYSICAL_STACKTRACE : Lnet/neoforged/neoforge/registries/DeferredHolder;
/*     */     //   1624: invokevirtual get : ()Ljava/lang/Object;
/*     */     //   1627: checkcast net/minecraft/world/level/block/Block
/*     */     //   1630: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*     */     //   1633: iconst_3
/*     */     //   1634: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*     */     //   1639: pop
/*     */     //   1640: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #25	-> 6
/*     */     //   #26	-> 11
/*     */     //   #28	-> 12
/*     */     //   #29	-> 36
/*     */     //   #30	-> 53
/*     */     //   #32	-> 64
/*     */     //   #33	-> 65
/*     */     //   #35	-> 67
/*     */     //   #36	-> 78
/*     */     //   #37	-> 81
/*     */     //   #38	-> 84
/*     */     //   #34	-> 87
/*     */     //   #40	-> 95
/*     */     //   #32	-> 100
/*     */     //   #40	-> 105
/*     */     //   #32	-> 110
/*     */     //   #40	-> 113
/*     */     //   #41	-> 114
/*     */     //   #42	-> 116
/*     */     //   #160	-> 120
/*     */     //   #43	-> 120
/*     */     //   #44	-> 121
/*     */     //   #46	-> 123
/*     */     //   #47	-> 134
/*     */     //   #48	-> 137
/*     */     //   #49	-> 140
/*     */     //   #45	-> 143
/*     */     //   #51	-> 151
/*     */     //   #43	-> 156
/*     */     //   #51	-> 161
/*     */     //   #61	-> 173
/*     */     //   #51	-> 180
/*     */     //   #61	-> 185
/*     */     //   #62	-> 200
/*     */     //   #63	-> 204
/*     */     //   #64	-> 205
/*     */     //   #66	-> 207
/*     */     //   #67	-> 218
/*     */     //   #68	-> 221
/*     */     //   #69	-> 224
/*     */     //   #65	-> 227
/*     */     //   #71	-> 235
/*     */     //   #63	-> 240
/*     */     //   #71	-> 245
/*     */     //   #81	-> 257
/*     */     //   #71	-> 264
/*     */     //   #81	-> 269
/*     */     //   #82	-> 285
/*     */     //   #83	-> 286
/*     */     //   #85	-> 288
/*     */     //   #86	-> 299
/*     */     //   #87	-> 302
/*     */     //   #88	-> 305
/*     */     //   #84	-> 308
/*     */     //   #90	-> 316
/*     */     //   #82	-> 321
/*     */     //   #90	-> 326
/*     */     //   #100	-> 338
/*     */     //   #90	-> 345
/*     */     //   #100	-> 350
/*     */     //   #101	-> 362
/*     */     //   #102	-> 366
/*     */     //   #103	-> 367
/*     */     //   #105	-> 369
/*     */     //   #106	-> 373
/*     */     //   #107	-> 374
/*     */     //   #108	-> 375
/*     */     //   #105	-> 377
/*     */     //   #110	-> 380
/*     */     //   #111	-> 383
/*     */     //   #112	-> 386
/*     */     //   #104	-> 389
/*     */     //   #114	-> 397
/*     */     //   #102	-> 402
/*     */     //   #115	-> 407
/*     */     //   #116	-> 412
/*     */     //   #130	-> 419
/*     */     //   #116	-> 426
/*     */     //   #131	-> 431
/*     */     //   #132	-> 436
/*     */     //   #134	-> 447
/*     */     //   #135	-> 452
/*     */     //   #133	-> 457
/*     */     //   #101	-> 460
/*     */     //   #138	-> 463
/*     */     //   #139	-> 466
/*     */     //   #140	-> 469
/*     */     //   #141	-> 470
/*     */     //   #143	-> 472
/*     */     //   #144	-> 483
/*     */     //   #145	-> 486
/*     */     //   #146	-> 489
/*     */     //   #142	-> 492
/*     */     //   #148	-> 500
/*     */     //   #140	-> 505
/*     */     //   #148	-> 510
/*     */     //   #158	-> 522
/*     */     //   #148	-> 529
/*     */     //   #158	-> 534
/*     */     //   #62	-> 546
/*     */     //   #61	-> 549
/*     */     //   #160	-> 552
/*     */     //   #274	-> 559
/*     */     //   #160	-> 559
/*     */     //   #161	-> 560
/*     */     //   #163	-> 562
/*     */     //   #164	-> 573
/*     */     //   #165	-> 576
/*     */     //   #166	-> 579
/*     */     //   #162	-> 582
/*     */     //   #168	-> 590
/*     */     //   #160	-> 595
/*     */     //   #168	-> 600
/*     */     //   #178	-> 612
/*     */     //   #168	-> 619
/*     */     //   #178	-> 624
/*     */     //   #179	-> 639
/*     */     //   #180	-> 643
/*     */     //   #181	-> 644
/*     */     //   #183	-> 646
/*     */     //   #184	-> 657
/*     */     //   #185	-> 660
/*     */     //   #186	-> 663
/*     */     //   #182	-> 666
/*     */     //   #188	-> 674
/*     */     //   #180	-> 679
/*     */     //   #188	-> 684
/*     */     //   #198	-> 696
/*     */     //   #188	-> 703
/*     */     //   #198	-> 708
/*     */     //   #199	-> 724
/*     */     //   #200	-> 725
/*     */     //   #202	-> 727
/*     */     //   #203	-> 738
/*     */     //   #204	-> 741
/*     */     //   #205	-> 744
/*     */     //   #201	-> 747
/*     */     //   #207	-> 755
/*     */     //   #199	-> 760
/*     */     //   #207	-> 765
/*     */     //   #217	-> 777
/*     */     //   #207	-> 784
/*     */     //   #217	-> 789
/*     */     //   #218	-> 801
/*     */     //   #219	-> 805
/*     */     //   #220	-> 806
/*     */     //   #222	-> 808
/*     */     //   #223	-> 812
/*     */     //   #224	-> 813
/*     */     //   #225	-> 814
/*     */     //   #222	-> 816
/*     */     //   #227	-> 819
/*     */     //   #228	-> 822
/*     */     //   #229	-> 825
/*     */     //   #221	-> 828
/*     */     //   #231	-> 836
/*     */     //   #219	-> 841
/*     */     //   #231	-> 846
/*     */     //   #245	-> 858
/*     */     //   #231	-> 865
/*     */     //   #245	-> 870
/*     */     //   #246	-> 882
/*     */     //   #248	-> 886
/*     */     //   #249	-> 891
/*     */     //   #247	-> 896
/*     */     //   #218	-> 899
/*     */     //   #252	-> 902
/*     */     //   #253	-> 905
/*     */     //   #254	-> 908
/*     */     //   #255	-> 909
/*     */     //   #257	-> 911
/*     */     //   #258	-> 922
/*     */     //   #259	-> 925
/*     */     //   #260	-> 928
/*     */     //   #256	-> 931
/*     */     //   #262	-> 939
/*     */     //   #254	-> 944
/*     */     //   #262	-> 949
/*     */     //   #272	-> 961
/*     */     //   #262	-> 968
/*     */     //   #272	-> 973
/*     */     //   #179	-> 985
/*     */     //   #178	-> 988
/*     */     //   #274	-> 991
/*     */     //   #388	-> 998
/*     */     //   #274	-> 998
/*     */     //   #275	-> 999
/*     */     //   #277	-> 1001
/*     */     //   #278	-> 1012
/*     */     //   #279	-> 1015
/*     */     //   #280	-> 1018
/*     */     //   #276	-> 1021
/*     */     //   #282	-> 1029
/*     */     //   #274	-> 1034
/*     */     //   #282	-> 1039
/*     */     //   #292	-> 1051
/*     */     //   #282	-> 1058
/*     */     //   #292	-> 1063
/*     */     //   #293	-> 1078
/*     */     //   #294	-> 1082
/*     */     //   #295	-> 1083
/*     */     //   #297	-> 1085
/*     */     //   #298	-> 1096
/*     */     //   #299	-> 1099
/*     */     //   #300	-> 1102
/*     */     //   #296	-> 1105
/*     */     //   #302	-> 1113
/*     */     //   #294	-> 1118
/*     */     //   #302	-> 1123
/*     */     //   #312	-> 1135
/*     */     //   #302	-> 1142
/*     */     //   #312	-> 1147
/*     */     //   #313	-> 1163
/*     */     //   #314	-> 1164
/*     */     //   #316	-> 1166
/*     */     //   #317	-> 1177
/*     */     //   #318	-> 1180
/*     */     //   #319	-> 1183
/*     */     //   #315	-> 1186
/*     */     //   #321	-> 1194
/*     */     //   #313	-> 1199
/*     */     //   #321	-> 1204
/*     */     //   #331	-> 1216
/*     */     //   #321	-> 1223
/*     */     //   #331	-> 1228
/*     */     //   #332	-> 1240
/*     */     //   #333	-> 1244
/*     */     //   #334	-> 1245
/*     */     //   #336	-> 1247
/*     */     //   #337	-> 1251
/*     */     //   #338	-> 1252
/*     */     //   #339	-> 1253
/*     */     //   #336	-> 1255
/*     */     //   #341	-> 1258
/*     */     //   #342	-> 1261
/*     */     //   #343	-> 1264
/*     */     //   #335	-> 1267
/*     */     //   #345	-> 1275
/*     */     //   #333	-> 1280
/*     */     //   #345	-> 1285
/*     */     //   #359	-> 1297
/*     */     //   #345	-> 1304
/*     */     //   #359	-> 1309
/*     */     //   #360	-> 1321
/*     */     //   #362	-> 1325
/*     */     //   #363	-> 1330
/*     */     //   #361	-> 1335
/*     */     //   #332	-> 1338
/*     */     //   #366	-> 1341
/*     */     //   #367	-> 1344
/*     */     //   #368	-> 1347
/*     */     //   #369	-> 1348
/*     */     //   #371	-> 1350
/*     */     //   #372	-> 1361
/*     */     //   #373	-> 1364
/*     */     //   #374	-> 1367
/*     */     //   #370	-> 1370
/*     */     //   #376	-> 1378
/*     */     //   #368	-> 1383
/*     */     //   #376	-> 1388
/*     */     //   #386	-> 1400
/*     */     //   #376	-> 1407
/*     */     //   #386	-> 1412
/*     */     //   #293	-> 1424
/*     */     //   #292	-> 1427
/*     */     //   #388	-> 1430
/*     */     //   #42	-> 1437
/*     */     //   #389	-> 1440
/*     */     //   #41	-> 1449
/*     */     //   #391	-> 1457
/*     */     //   #40	-> 1462
/*     */     //   #391	-> 1467
/*     */     //   #40	-> 1472
/*     */     //   #393	-> 1475
/*     */     //   #394	-> 1485
/*     */     //   #395	-> 1496
/*     */     //   #397	-> 1501
/*     */     //   #398	-> 1508
/*     */     //   #399	-> 1515
/*     */     //   #401	-> 1518
/*     */     //   #402	-> 1522
/*     */     //   #403	-> 1525
/*     */     //   #404	-> 1536
/*     */     //   #405	-> 1539
/*     */     //   #406	-> 1543
/*     */     //   #407	-> 1544
/*     */     //   #408	-> 1547
/*     */     //   #409	-> 1556
/*     */     //   #410	-> 1563
/*     */     //   #401	-> 1564
/*     */     //   #411	-> 1567
/*     */     //   #400	-> 1573
/*     */     //   #415	-> 1576
/*     */     //   #416	-> 1579
/*     */     //   #414	-> 1579
/*     */     //   #430	-> 1595
/*     */     //   #431	-> 1606
/*     */     //   #433	-> 1611
/*     */     //   #434	-> 1612
/*     */     //   #435	-> 1621
/*     */     //   #436	-> 1633
/*     */     //   #433	-> 1634
/*     */     //   #440	-> 1640
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	1641	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	1641	1	x	D
/*     */     //   0	1641	3	y	D
/*     */     //   0	1641	5	z	D
/*     */     //   0	1641	7	entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$0(Player e) {
/*  40 */     return true; } private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final boolean execute$lambda$2(Player e)
/*     */   {
/*  51 */     return true; } private static final boolean execute$lambda$3(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$3", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$3 {
/*  53 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); }
/*     */     public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #53	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$3;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*  54 */       //   0	24	5	_z	D } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) { Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/*  55 */           $_x, 
/*  56 */           $_y, 
/*  57 */           $_z); }
/*     */   
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
/*     */   private static final boolean execute$lambda$4(Player e)
/*     */   {
/*  71 */     return true; } private static final boolean execute$lambda$5(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$5", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$5 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #73	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$5;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/*  73 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/*  74 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/*  75 */           $_x, 
/*  76 */           $_y, 
/*  77 */           $_z);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final boolean execute$lambda$6(Player e)
/*     */   {
/*  90 */     return true; } private static final boolean execute$lambda$7(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$7", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$7 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #92	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$7;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/*  92 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/*  93 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/*  94 */           $_x, 
/*  95 */           $_y, 
/*  96 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$8(Player e)
/*     */   {
/* 114 */     return true; } private static final boolean execute$lambda$9(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$9", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$9 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
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
/*     */       //   #122	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$9;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D
/*     */     }
/*     */     
/* 122 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 123 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 124 */           $_x, 
/* 125 */           $_y, 
/* 126 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$10(Player e)
/*     */   {
/* 148 */     return true; } private static final boolean execute$lambda$11(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$11", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$11 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #150	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$11;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 150 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 151 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 152 */           $_x, 
/* 153 */           $_y, 
/* 154 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$12(Player e)
/*     */   {
/* 168 */     return true; } private static final boolean execute$lambda$13(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$13", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$13 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #170	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$13;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 170 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 171 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 172 */           $_x, 
/* 173 */           $_y, 
/* 174 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$14(Player e)
/*     */   {
/* 188 */     return true; } private static final boolean execute$lambda$15(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$15", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$15 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #190	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$15;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 190 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 191 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 192 */           $_x, 
/* 193 */           $_y, 
/* 194 */           $_z);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final boolean execute$lambda$16(Player e)
/*     */   {
/* 207 */     return true; } private static final boolean execute$lambda$17(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$17", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$17 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #209	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$17;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 209 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 210 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 211 */           $_x, 
/* 212 */           $_y, 
/* 213 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$18(Player e)
/*     */   {
/* 231 */     return true; } private static final boolean execute$lambda$19(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$19", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$19 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
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
/*     */       //   #237	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$19;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D
/*     */     }
/* 237 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 238 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 239 */           $_x, 
/* 240 */           $_y, 
/* 241 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$20(Player e)
/*     */   {
/* 262 */     return true; } private static final boolean execute$lambda$21(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$21", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$21 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #264	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$21;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 264 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 265 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 266 */           $_x, 
/* 267 */           $_y, 
/* 268 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$22(Player e)
/*     */   {
/* 282 */     return true; } private static final boolean execute$lambda$23(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$23", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$23 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #284	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$23;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 284 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 285 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 286 */           $_x, 
/* 287 */           $_y, 
/* 288 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$24(Player e)
/*     */   {
/* 302 */     return true; } private static final boolean execute$lambda$25(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$25", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$25 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #304	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$25;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 304 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 305 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 306 */           $_x, 
/* 307 */           $_y, 
/* 308 */           $_z);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final boolean execute$lambda$26(Player e)
/*     */   {
/* 321 */     return true; } private static final boolean execute$lambda$27(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$27", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$27 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #323	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$27;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 323 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 324 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 325 */           $_x, 
/* 326 */           $_y, 
/* 327 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$28(Player e)
/*     */   {
/* 345 */     return true; } private static final boolean execute$lambda$29(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$29", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$29 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
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
/*     */       //   #351	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$29;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D
/*     */     }
/* 351 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 352 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 353 */           $_x, 
/* 354 */           $_y, 
/* 355 */           $_z);
/*     */     } }
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
/*     */   private static final boolean execute$lambda$30(Player e)
/*     */   {
/* 376 */     return true; } private static final boolean execute$lambda$31(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$31", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$31 { public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) { // Byte code:
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
/*     */       //   #378	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/brokenend/TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure$execute$31;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D }
/* 378 */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 379 */       Intrinsics.checkNotNull(_entcnd); return _entcnd.distanceToSqr(
/* 380 */           $_x, 
/* 381 */           $_y, 
/* 382 */           $_z);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final boolean execute$lambda$32(TheBrokenEndOverhaulStalkEntity e)
/*     */   {
/* 391 */     return true; } private static final boolean execute$lambda$33(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
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
/*     */   private static final void execute$lambda$34(LevelAccessor $world, double $x, double $y, double $z) {
/* 417 */     if ($world instanceof ServerLevel) {
/*     */       
/* 419 */       Intrinsics.checkNotNull(TBSEntities.THE_BROKEN_END.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.THE_BROKEN_END.get()).spawn(
/* 420 */           (ServerLevel)$world, 
/* 421 */           BlockPos.containing($x, $y, $z), 
/* 422 */           MobSpawnType.MOB_SUMMONED);
/*     */       
/* 424 */       if (entityToSpawn != null)
/* 425 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\brokenend\TheBrokenEndOverhaulStalkOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */