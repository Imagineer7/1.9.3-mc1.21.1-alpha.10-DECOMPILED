/*    */ package dev.wendigodrip.thebrokenscript.procedures.clan;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\tH\007¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/clan/ClanbuildAnomalyGeneratorOnTickUpdateProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nClanbuildAnomalyGeneratorOnTickUpdateProcedure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClanbuildAnomalyGeneratorOnTickUpdateProcedure.kt\ndev/wendigodrip/thebrokenscript/procedures/clan/ClanbuildAnomalyGeneratorOnTickUpdateProcedure\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,95:1\n1755#2,3:96\n*S KotlinDebug\n*F\n+ 1 ClanbuildAnomalyGeneratorOnTickUpdateProcedure.kt\ndev/wendigodrip/thebrokenscript/procedures/clan/ClanbuildAnomalyGeneratorOnTickUpdateProcedure\n*L\n61#1:96,3\n*E\n"})
/*    */ public final class ClanbuildAnomalyGeneratorOnTickUpdateProcedure {
/*    */   @NotNull
/*    */   public static final ClanbuildAnomalyGeneratorOnTickUpdateProcedure INSTANCE = new ClanbuildAnomalyGeneratorOnTickUpdateProcedure();
/*    */   
/*    */   @JvmStatic
/*    */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'world'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: ldc net/minecraft/world/entity/player/Player
/*    */     //   9: new net/minecraft/world/phys/Vec3
/*    */     //   12: dup
/*    */     //   13: dload_1
/*    */     //   14: dload_3
/*    */     //   15: dload #5
/*    */     //   17: invokespecial <init> : (DDD)V
/*    */     //   20: ldc2_w 200.0
/*    */     //   23: ldc2_w 200.0
/*    */     //   26: ldc2_w 200.0
/*    */     //   29: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*    */     //   32: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   37: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*    */     //   42: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*    */     //   47: invokeinterface isEmpty : ()Z
/*    */     //   52: ifeq -> 56
/*    */     //   55: return
/*    */     //   56: invokestatic create : ()Lnet/minecraft/util/RandomSource;
/*    */     //   59: iconst_1
/*    */     //   60: bipush #8
/*    */     //   62: invokestatic nextInt : (Lnet/minecraft/util/RandomSource;II)I
/*    */     //   65: i2d
/*    */     //   66: dstore #7
/*    */     //   68: invokestatic random : ()D
/*    */     //   71: ldc2_w 0.9
/*    */     //   74: dcmpg
/*    */     //   75: ifge -> 82
/*    */     //   78: iconst_1
/*    */     //   79: goto -> 83
/*    */     //   82: iconst_0
/*    */     //   83: istore #9
/*    */     //   85: dload #7
/*    */     //   87: dstore #11
/*    */     //   89: dload #11
/*    */     //   91: dconst_1
/*    */     //   92: dcmpg
/*    */     //   93: ifne -> 100
/*    */     //   96: iconst_1
/*    */     //   97: goto -> 101
/*    */     //   100: iconst_0
/*    */     //   101: ifeq -> 109
/*    */     //   104: ldc 'clanvoidnew1'
/*    */     //   106: goto -> 283
/*    */     //   109: dload #11
/*    */     //   111: ldc2_w 2.0
/*    */     //   114: dcmpg
/*    */     //   115: ifne -> 122
/*    */     //   118: iconst_1
/*    */     //   119: goto -> 123
/*    */     //   122: iconst_0
/*    */     //   123: ifeq -> 131
/*    */     //   126: ldc 'clanvoidnew2'
/*    */     //   128: goto -> 283
/*    */     //   131: dload #11
/*    */     //   133: ldc2_w 3.0
/*    */     //   136: dcmpg
/*    */     //   137: ifne -> 144
/*    */     //   140: iconst_1
/*    */     //   141: goto -> 145
/*    */     //   144: iconst_0
/*    */     //   145: ifeq -> 153
/*    */     //   148: ldc 'clanvoidnew3'
/*    */     //   150: goto -> 283
/*    */     //   153: dload #11
/*    */     //   155: ldc2_w 4.0
/*    */     //   158: dcmpg
/*    */     //   159: ifne -> 166
/*    */     //   162: iconst_1
/*    */     //   163: goto -> 167
/*    */     //   166: iconst_0
/*    */     //   167: ifeq -> 175
/*    */     //   170: ldc 'clanvoidnew4'
/*    */     //   172: goto -> 283
/*    */     //   175: dload #11
/*    */     //   177: ldc2_w 5.0
/*    */     //   180: dcmpg
/*    */     //   181: ifne -> 188
/*    */     //   184: iconst_1
/*    */     //   185: goto -> 189
/*    */     //   188: iconst_0
/*    */     //   189: ifeq -> 197
/*    */     //   192: ldc 'clanvoidnew5'
/*    */     //   194: goto -> 283
/*    */     //   197: dload #11
/*    */     //   199: ldc2_w 6.0
/*    */     //   202: dcmpg
/*    */     //   203: ifne -> 210
/*    */     //   206: iconst_1
/*    */     //   207: goto -> 211
/*    */     //   210: iconst_0
/*    */     //   211: ifeq -> 219
/*    */     //   214: ldc 'clanvoidnew6'
/*    */     //   216: goto -> 283
/*    */     //   219: dload #11
/*    */     //   221: ldc2_w 7.0
/*    */     //   224: dcmpg
/*    */     //   225: ifne -> 232
/*    */     //   228: iconst_1
/*    */     //   229: goto -> 233
/*    */     //   232: iconst_0
/*    */     //   233: ifeq -> 241
/*    */     //   236: ldc 'clanvoidnew7'
/*    */     //   238: goto -> 283
/*    */     //   241: dload #11
/*    */     //   243: ldc2_w 8.0
/*    */     //   246: dcmpg
/*    */     //   247: ifne -> 254
/*    */     //   250: iconst_1
/*    */     //   251: goto -> 255
/*    */     //   254: iconst_0
/*    */     //   255: ifeq -> 273
/*    */     //   258: iload #9
/*    */     //   260: ifeq -> 268
/*    */     //   263: ldc 'clanvoidnew7'
/*    */     //   265: goto -> 283
/*    */     //   268: ldc 'clanvoidnew8'
/*    */     //   270: goto -> 283
/*    */     //   273: new java/lang/IndexOutOfBoundsException
/*    */     //   276: dup
/*    */     //   277: ldc 'How did we get here?'
/*    */     //   279: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   282: athrow
/*    */     //   283: astore #10
/*    */     //   285: iload #9
/*    */     //   287: ifne -> 332
/*    */     //   290: aload_0
/*    */     //   291: dload_1
/*    */     //   292: dload_3
/*    */     //   293: dload #5
/*    */     //   295: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   298: getstatic net/minecraft/world/level/block/Blocks.AIR : Lnet/minecraft/world/level/block/Block;
/*    */     //   301: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   304: iconst_3
/*    */     //   305: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   310: pop
/*    */     //   311: aload_0
/*    */     //   312: dload_1
/*    */     //   313: dload_3
/*    */     //   314: dload #5
/*    */     //   316: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   319: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE : Lnet/minecraft/world/level/block/Block;
/*    */     //   322: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   325: iconst_3
/*    */     //   326: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   331: pop
/*    */     //   332: aload_0
/*    */     //   333: instanceof net/minecraft/server/level/ServerLevel
/*    */     //   336: ifeq -> 407
/*    */     //   339: aload_0
/*    */     //   340: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   343: invokevirtual getStructureManager : ()Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplateManager;
/*    */     //   346: aload #10
/*    */     //   348: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*    */     //   351: invokevirtual getOrCreate : (Lnet/minecraft/resources/ResourceLocation;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructureTemplate;
/*    */     //   354: aload_0
/*    */     //   355: checkcast net/minecraft/world/level/ServerLevelAccessor
/*    */     //   358: dload_1
/*    */     //   359: dload_3
/*    */     //   360: dload #5
/*    */     //   362: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   365: dload_1
/*    */     //   366: dload_3
/*    */     //   367: dload #5
/*    */     //   369: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   372: new net/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings
/*    */     //   375: dup
/*    */     //   376: invokespecial <init> : ()V
/*    */     //   379: getstatic net/minecraft/world/level/block/Rotation.NONE : Lnet/minecraft/world/level/block/Rotation;
/*    */     //   382: invokevirtual setRotation : (Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;
/*    */     //   385: getstatic net/minecraft/world/level/block/Mirror.NONE : Lnet/minecraft/world/level/block/Mirror;
/*    */     //   388: invokevirtual setMirror : (Lnet/minecraft/world/level/block/Mirror;)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;
/*    */     //   391: iconst_0
/*    */     //   392: invokevirtual setIgnoreEntities : (Z)Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;
/*    */     //   395: aload_0
/*    */     //   396: checkcast net/minecraft/server/level/ServerLevel
/*    */     //   399: getfield random : Lnet/minecraft/util/RandomSource;
/*    */     //   402: iconst_3
/*    */     //   403: invokevirtual placeInWorld : (Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/levelgen/structure/templatesystem/StructurePlaceSettings;Lnet/minecraft/util/RandomSource;I)Z
/*    */     //   406: pop
/*    */     //   407: aload_0
/*    */     //   408: dload_1
/*    */     //   409: ldc2_w 16.0
/*    */     //   412: dadd
/*    */     //   413: dload_3
/*    */     //   414: dload #5
/*    */     //   416: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   419: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   424: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
/*    */     //   427: astore #11
/*    */     //   429: aload_0
/*    */     //   430: dload_1
/*    */     //   431: dload_3
/*    */     //   432: dload #5
/*    */     //   434: ldc2_w 16.0
/*    */     //   437: dadd
/*    */     //   438: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   441: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   446: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
/*    */     //   449: astore #12
/*    */     //   451: aload_0
/*    */     //   452: dload_1
/*    */     //   453: ldc2_w 16.0
/*    */     //   456: dsub
/*    */     //   457: dload_3
/*    */     //   458: dload #5
/*    */     //   460: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   463: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   468: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
/*    */     //   471: astore #13
/*    */     //   473: aload_0
/*    */     //   474: dload_1
/*    */     //   475: dload_3
/*    */     //   476: dload #5
/*    */     //   478: ldc2_w 16.0
/*    */     //   481: dsub
/*    */     //   482: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   485: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   490: invokevirtual getBlock : ()Lnet/minecraft/world/level/block/Block;
/*    */     //   493: astore #14
/*    */     //   495: iconst_4
/*    */     //   496: anewarray net/minecraft/world/level/block/Block
/*    */     //   499: astore #16
/*    */     //   501: aload #16
/*    */     //   503: iconst_0
/*    */     //   504: aload #11
/*    */     //   506: aastore
/*    */     //   507: aload #16
/*    */     //   509: iconst_1
/*    */     //   510: aload #12
/*    */     //   512: aastore
/*    */     //   513: aload #16
/*    */     //   515: iconst_2
/*    */     //   516: aload #13
/*    */     //   518: aastore
/*    */     //   519: aload #16
/*    */     //   521: iconst_3
/*    */     //   522: aload #14
/*    */     //   524: aastore
/*    */     //   525: aload #16
/*    */     //   527: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   530: astore #15
/*    */     //   532: aload #15
/*    */     //   534: checkcast java/lang/Iterable
/*    */     //   537: astore #16
/*    */     //   539: iconst_0
/*    */     //   540: istore #17
/*    */     //   542: aload #16
/*    */     //   544: instanceof java/util/Collection
/*    */     //   547: ifeq -> 567
/*    */     //   550: aload #16
/*    */     //   552: checkcast java/util/Collection
/*    */     //   555: invokeinterface isEmpty : ()Z
/*    */     //   560: ifeq -> 567
/*    */     //   563: iconst_0
/*    */     //   564: goto -> 629
/*    */     //   567: aload #16
/*    */     //   569: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   574: astore #18
/*    */     //   576: aload #18
/*    */     //   578: invokeinterface hasNext : ()Z
/*    */     //   583: ifeq -> 628
/*    */     //   586: aload #18
/*    */     //   588: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   593: astore #19
/*    */     //   595: aload #19
/*    */     //   597: checkcast net/minecraft/world/level/block/Block
/*    */     //   600: astore #20
/*    */     //   602: iconst_0
/*    */     //   603: istore #21
/*    */     //   605: aload #20
/*    */     //   607: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE : Lnet/minecraft/world/level/block/Block;
/*    */     //   610: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   613: ifne -> 620
/*    */     //   616: iconst_1
/*    */     //   617: goto -> 621
/*    */     //   620: iconst_0
/*    */     //   621: ifeq -> 576
/*    */     //   624: iconst_1
/*    */     //   625: goto -> 629
/*    */     //   628: iconst_0
/*    */     //   629: ifeq -> 674
/*    */     //   632: aload_0
/*    */     //   633: dload_1
/*    */     //   634: dload_3
/*    */     //   635: dload #5
/*    */     //   637: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   640: getstatic net/minecraft/world/level/block/Blocks.AIR : Lnet/minecraft/world/level/block/Block;
/*    */     //   643: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   646: iconst_3
/*    */     //   647: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   652: pop
/*    */     //   653: aload_0
/*    */     //   654: dload_1
/*    */     //   655: dload_3
/*    */     //   656: dload #5
/*    */     //   658: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   661: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE : Lnet/minecraft/world/level/block/Block;
/*    */     //   664: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   667: iconst_3
/*    */     //   668: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   673: pop
/*    */     //   674: aload #11
/*    */     //   676: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE : Lnet/minecraft/world/level/block/Block;
/*    */     //   679: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   682: ifne -> 719
/*    */     //   685: aload_0
/*    */     //   686: dload_1
/*    */     //   687: ldc2_w 16.0
/*    */     //   690: dadd
/*    */     //   691: dload_3
/*    */     //   692: dload #5
/*    */     //   694: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   697: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.INSTANCE : Ldev/wendigodrip/thebrokenscript/registry/TBSBlocks;
/*    */     //   700: invokevirtual getCLANBUILD_ANOMALY_GENERATOR : ()Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   703: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   706: checkcast net/minecraft/world/level/block/Block
/*    */     //   709: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   712: iconst_3
/*    */     //   713: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   718: pop
/*    */     //   719: aload #13
/*    */     //   721: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE : Lnet/minecraft/world/level/block/Block;
/*    */     //   724: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   727: ifne -> 764
/*    */     //   730: aload_0
/*    */     //   731: dload_1
/*    */     //   732: ldc2_w 16.0
/*    */     //   735: dsub
/*    */     //   736: dload_3
/*    */     //   737: dload #5
/*    */     //   739: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   742: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.INSTANCE : Ldev/wendigodrip/thebrokenscript/registry/TBSBlocks;
/*    */     //   745: invokevirtual getCLANBUILD_ANOMALY_GENERATOR : ()Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   748: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   751: checkcast net/minecraft/world/level/block/Block
/*    */     //   754: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   757: iconst_3
/*    */     //   758: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   763: pop
/*    */     //   764: aload #12
/*    */     //   766: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE : Lnet/minecraft/world/level/block/Block;
/*    */     //   769: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   772: ifne -> 809
/*    */     //   775: aload_0
/*    */     //   776: dload_1
/*    */     //   777: dload_3
/*    */     //   778: dload #5
/*    */     //   780: ldc2_w 16.0
/*    */     //   783: dadd
/*    */     //   784: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   787: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.INSTANCE : Ldev/wendigodrip/thebrokenscript/registry/TBSBlocks;
/*    */     //   790: invokevirtual getCLANBUILD_ANOMALY_GENERATOR : ()Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   793: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   796: checkcast net/minecraft/world/level/block/Block
/*    */     //   799: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   802: iconst_3
/*    */     //   803: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   808: pop
/*    */     //   809: aload #14
/*    */     //   811: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE : Lnet/minecraft/world/level/block/Block;
/*    */     //   814: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   817: ifne -> 854
/*    */     //   820: aload_0
/*    */     //   821: dload_1
/*    */     //   822: dload_3
/*    */     //   823: dload #5
/*    */     //   825: ldc2_w 16.0
/*    */     //   828: dsub
/*    */     //   829: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   832: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.INSTANCE : Ldev/wendigodrip/thebrokenscript/registry/TBSBlocks;
/*    */     //   835: invokevirtual getCLANBUILD_ANOMALY_GENERATOR : ()Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   838: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   841: checkcast net/minecraft/world/level/block/Block
/*    */     //   844: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   847: iconst_3
/*    */     //   848: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   853: pop
/*    */     //   854: aload_0
/*    */     //   855: dload_1
/*    */     //   856: dload_3
/*    */     //   857: dload #5
/*    */     //   859: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   862: getstatic net/minecraft/world/level/block/Blocks.AIR : Lnet/minecraft/world/level/block/Block;
/*    */     //   865: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   868: iconst_3
/*    */     //   869: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   874: pop
/*    */     //   875: aload_0
/*    */     //   876: dload_1
/*    */     //   877: dload_3
/*    */     //   878: dload #5
/*    */     //   880: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   883: getstatic net/minecraft/world/level/block/Blocks.COBBLESTONE : Lnet/minecraft/world/level/block/Block;
/*    */     //   886: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   889: iconst_3
/*    */     //   890: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   895: pop
/*    */     //   896: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 6
/*    */     //   #22	-> 47
/*    */     //   #24	-> 56
/*    */     //   #25	-> 68
/*    */     //   #27	-> 85
/*    */     //   #28	-> 89
/*    */     //   #29	-> 109
/*    */     //   #30	-> 131
/*    */     //   #31	-> 153
/*    */     //   #32	-> 175
/*    */     //   #33	-> 197
/*    */     //   #34	-> 219
/*    */     //   #35	-> 241
/*    */     //   #36	-> 273
/*    */     //   #27	-> 283
/*    */     //   #39	-> 285
/*    */     //   #40	-> 290
/*    */     //   #41	-> 311
/*    */     //   #44	-> 332
/*    */     //   #45	-> 339
/*    */     //   #46	-> 354
/*    */     //   #47	-> 358
/*    */     //   #48	-> 365
/*    */     //   #49	-> 372
/*    */     //   #50	-> 395
/*    */     //   #51	-> 402
/*    */     //   #45	-> 403
/*    */     //   #55	-> 407
/*    */     //   #56	-> 429
/*    */     //   #57	-> 451
/*    */     //   #58	-> 473
/*    */     //   #59	-> 495
/*    */     //   #61	-> 532
/*    */     //   #96	-> 542
/*    */     //   #97	-> 567
/*    */     //   #61	-> 605
/*    */     //   #97	-> 621
/*    */     //   #98	-> 628
/*    */     //   #61	-> 629
/*    */     //   #62	-> 632
/*    */     //   #63	-> 653
/*    */     //   #66	-> 674
/*    */     //   #67	-> 685
/*    */     //   #68	-> 686
/*    */     //   #67	-> 713
/*    */     //   #72	-> 719
/*    */     //   #73	-> 730
/*    */     //   #74	-> 731
/*    */     //   #73	-> 758
/*    */     //   #78	-> 764
/*    */     //   #79	-> 775
/*    */     //   #80	-> 776
/*    */     //   #79	-> 803
/*    */     //   #84	-> 809
/*    */     //   #85	-> 820
/*    */     //   #86	-> 821
/*    */     //   #85	-> 848
/*    */     //   #90	-> 854
/*    */     //   #91	-> 875
/*    */     //   #92	-> 896
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   605	16	21	$i$a$-any-ClanbuildAnomalyGeneratorOnTickUpdateProcedure$execute$2	I
/*    */     //   602	19	20	it	Lnet/minecraft/world/level/block/Block;
/*    */     //   595	33	19	element$iv	Ljava/lang/Object;
/*    */     //   542	87	17	$i$f$any	I
/*    */     //   539	90	16	$this$any$iv	Ljava/lang/Iterable;
/*    */     //   68	829	7	variant	D
/*    */     //   85	812	9	special	Z
/*    */     //   285	612	10	structureId	Ljava/lang/String;
/*    */     //   429	468	11	leftBlock	Lnet/minecraft/world/level/block/Block;
/*    */     //   451	446	12	backwardBlock	Lnet/minecraft/world/level/block/Block;
/*    */     //   473	424	13	rightBlock	Lnet/minecraft/world/level/block/Block;
/*    */     //   495	402	14	forwardBlock	Lnet/minecraft/world/level/block/Block;
/*    */     //   532	365	15	allBlocks	Ljava/util/List;
/*    */     //   0	897	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	897	1	x	D
/*    */     //   0	897	3	y	D
/*    */     //   0	897	5	z	D
/*    */   }
/*    */   
/* 21 */   private static final boolean execute$lambda$0(Player it) { return true; } private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\clan\ClanbuildAnomalyGeneratorOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */