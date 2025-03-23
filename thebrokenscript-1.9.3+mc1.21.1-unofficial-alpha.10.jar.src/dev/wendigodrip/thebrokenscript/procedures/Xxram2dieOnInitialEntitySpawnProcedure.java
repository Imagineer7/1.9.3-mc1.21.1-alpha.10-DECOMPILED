/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/Xxram2dieOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class Xxram2dieOnInitialEntitySpawnProcedure
/*     */ {
/*     */   @NotNull
/*     */   public static final Xxram2dieOnInitialEntitySpawnProcedure INSTANCE = new Xxram2dieOnInitialEntitySpawnProcedure();
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
/*     */     //   19: invokevirtual getHasTriggeredRam2Die : ()Z
/*     */     //   22: ifeq -> 111
/*     */     //   25: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   28: aload_0
/*     */     //   29: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   32: invokevirtual getHasRam2DieJoined : ()Z
/*     */     //   35: ifne -> 92
/*     */     //   38: aload_0
/*     */     //   39: dload_1
/*     */     //   40: dload_3
/*     */     //   41: dload #5
/*     */     //   43: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   46: invokeinterface canSeeSkyFromBelowWater : (Lnet/minecraft/core/BlockPos;)Z
/*     */     //   51: ifeq -> 73
/*     */     //   54: iconst_1
/*     */     //   55: aload_0
/*     */     //   56: dload_1
/*     */     //   57: dload_3
/*     */     //   58: dload #5
/*     */     //   60: aload #7
/*     */     //   62: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*     */     //   67: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   70: goto -> 127
/*     */     //   73: aload #7
/*     */     //   75: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   78: invokevirtual isClientSide : ()Z
/*     */     //   81: ifne -> 127
/*     */     //   84: aload #7
/*     */     //   86: invokevirtual discard : ()V
/*     */     //   89: goto -> 127
/*     */     //   92: aload #7
/*     */     //   94: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   97: invokevirtual isClientSide : ()Z
/*     */     //   100: ifne -> 127
/*     */     //   103: aload #7
/*     */     //   105: invokevirtual discard : ()V
/*     */     //   108: goto -> 127
/*     */     //   111: aload #7
/*     */     //   113: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*     */     //   116: invokevirtual isClientSide : ()Z
/*     */     //   119: ifne -> 127
/*     */     //   122: aload #7
/*     */     //   124: invokevirtual discard : ()V
/*     */     //   127: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #23	-> 6
/*     */     //   #24	-> 11
/*     */     //   #26	-> 12
/*     */     //   #27	-> 25
/*     */     //   #28	-> 38
/*     */     //   #29	-> 54
/*     */     //   #276	-> 73
/*     */     //   #277	-> 84
/*     */     //   #279	-> 92
/*     */     //   #280	-> 103
/*     */     //   #282	-> 111
/*     */     //   #283	-> 122
/*     */     //   #285	-> 127
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	128	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	128	1	x	D
/*     */     //   0	128	3	y	D
/*     */     //   0	128	5	z	D
/*     */     //   0	128	7	entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$6(LevelAccessor $world, double $x, double $y, double $z, Entity $entity) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   4: ifeq -> 92
/*     */     //   7: ldc 'Local game hosted on port ['
/*     */     //   9: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   12: ldc '00000'
/*     */     //   14: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   17: getstatic net/minecraft/ChatFormatting.GREEN : Lnet/minecraft/ChatFormatting;
/*     */     //   20: invokevirtual withStyle : (Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   23: checkcast net/minecraft/network/chat/Component
/*     */     //   26: invokevirtual append : (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   29: ldc_w ']'
/*     */     //   32: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   35: checkcast net/minecraft/network/chat/Component
/*     */     //   38: invokevirtual append : (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   41: astore #8
/*     */     //   43: aload_0
/*     */     //   44: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   47: invokevirtual players : ()Ljava/util/List;
/*     */     //   50: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   55: astore #9
/*     */     //   57: aload #9
/*     */     //   59: invokeinterface hasNext : ()Z
/*     */     //   64: ifeq -> 92
/*     */     //   67: aload #9
/*     */     //   69: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   74: checkcast net/minecraft/server/level/ServerPlayer
/*     */     //   77: astore #10
/*     */     //   79: aload #10
/*     */     //   81: aload #8
/*     */     //   83: checkcast net/minecraft/network/chat/Component
/*     */     //   86: invokevirtual sendSystemMessage : (Lnet/minecraft/network/chat/Component;)V
/*     */     //   89: goto -> 57
/*     */     //   92: sipush #500
/*     */     //   95: aload_0
/*     */     //   96: dload_1
/*     */     //   97: dload_3
/*     */     //   98: dload #5
/*     */     //   100: aload #7
/*     */     //   102: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*     */     //   107: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   110: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #30	-> 0
/*     */     //   #31	-> 7
/*     */     //   #32	-> 12
/*     */     //   #33	-> 29
/*     */     //   #31	-> 41
/*     */     //   #35	-> 43
/*     */     //   #36	-> 79
/*     */     //   #40	-> 92
/*     */     //   #275	-> 110
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   79	10	10	player	Lnet/minecraft/server/level/ServerPlayer;
/*     */     //   43	49	8	msg	Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   0	111	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	111	1	$x	D
/*     */     //   0	111	3	$y	D
/*     */     //   0	111	5	$z	D
/*     */     //   0	111	7	$entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$6$lambda$5(LevelAccessor $world, double $x, double $y, double $z, Entity $entity) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #8
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 75
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #8
/*     */     //   16: aload #8
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #8
/*     */     //   47: iconst_4
/*     */     //   48: ldc ''
/*     */     //   50: ldc ''
/*     */     //   52: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   55: checkcast net/minecraft/network/chat/Component
/*     */     //   58: aload #8
/*     */     //   60: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   63: aconst_null
/*     */     //   64: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   67: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   70: ldc 'tellraw @a {"text":"xXram2dieXx joined the game","color":"yellow"}'
/*     */     //   72: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   75: aload_0
/*     */     //   76: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   79: ifeq -> 92
/*     */     //   82: getstatic dev/wendigodrip/thebrokenscript/util/TimeOfDay.MIDNIGHT : Ldev/wendigodrip/thebrokenscript/util/TimeOfDay;
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   89: invokevirtual set : (Lnet/minecraft/server/level/ServerLevel;)V
/*     */     //   92: aload_0
/*     */     //   93: instanceof net/minecraft/world/level/Level
/*     */     //   96: ifeq -> 169
/*     */     //   99: aload_0
/*     */     //   100: checkcast net/minecraft/world/level/Level
/*     */     //   103: invokevirtual isClientSide : ()Z
/*     */     //   106: ifne -> 142
/*     */     //   109: aload_0
/*     */     //   110: checkcast net/minecraft/world/level/Level
/*     */     //   113: aconst_null
/*     */     //   114: dload_1
/*     */     //   115: dload_3
/*     */     //   116: dload #5
/*     */     //   118: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   121: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   124: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   127: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   130: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   133: ldc 555.0
/*     */     //   135: fconst_0
/*     */     //   136: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   139: goto -> 169
/*     */     //   142: aload_0
/*     */     //   143: checkcast net/minecraft/world/level/Level
/*     */     //   146: dload_1
/*     */     //   147: dload_3
/*     */     //   148: dload #5
/*     */     //   150: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   153: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   156: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   159: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   162: ldc 555.0
/*     */     //   164: fconst_0
/*     */     //   165: iconst_0
/*     */     //   166: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   169: sipush #1000
/*     */     //   172: aload_0
/*     */     //   173: dload_1
/*     */     //   174: dload_3
/*     */     //   175: dload #5
/*     */     //   177: aload #7
/*     */     //   179: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*     */     //   184: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   187: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   190: aload_0
/*     */     //   191: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   194: iconst_1
/*     */     //   195: invokevirtual setHasRam2DieJoined : (Z)V
/*     */     //   198: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   201: aload_0
/*     */     //   202: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   205: aload_0
/*     */     //   206: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   209: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 0
/*     */     //   #42	-> 3
/*     */     //   #43	-> 10
/*     */     //   #44	-> 16
/*     */     //   #45	-> 24
/*     */     //   #46	-> 28
/*     */     //   #47	-> 31
/*     */     //   #48	-> 42
/*     */     //   #49	-> 45
/*     */     //   #50	-> 47
/*     */     //   #51	-> 48
/*     */     //   #52	-> 50
/*     */     //   #53	-> 58
/*     */     //   #54	-> 63
/*     */     //   #45	-> 64
/*     */     //   #55	-> 67
/*     */     //   #56	-> 70
/*     */     //   #44	-> 72
/*     */     //   #59	-> 75
/*     */     //   #60	-> 82
/*     */     //   #62	-> 92
/*     */     //   #63	-> 99
/*     */     //   #64	-> 109
/*     */     //   #65	-> 113
/*     */     //   #66	-> 114
/*     */     //   #65	-> 118
/*     */     //   #67	-> 121
/*     */     //   #64	-> 136
/*     */     //   #70	-> 142
/*     */     //   #71	-> 146
/*     */     //   #72	-> 147
/*     */     //   #73	-> 148
/*     */     //   #74	-> 150
/*     */     //   #75	-> 159
/*     */     //   #76	-> 162
/*     */     //   #77	-> 164
/*     */     //   #78	-> 165
/*     */     //   #70	-> 166
/*     */     //   #83	-> 169
/*     */     //   #84	-> 172
/*     */     //   #82	-> 172
/*     */     //   #272	-> 187
/*     */     //   #273	-> 198
/*     */     //   #274	-> 209
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	207	8	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	210	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	210	1	$x	D
/*     */     //   0	210	3	$y	D
/*     */     //   0	210	5	$z	D
/*     */     //   0	210	7	$entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$6$lambda$5$lambda$4(LevelAccessor $world, double $x, double $y, double $z, Entity $entity) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #8
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 75
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #8
/*     */     //   16: aload #8
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #8
/*     */     //   47: iconst_4
/*     */     //   48: ldc ''
/*     */     //   50: ldc ''
/*     */     //   52: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   55: checkcast net/minecraft/network/chat/Component
/*     */     //   58: aload #8
/*     */     //   60: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   63: aconst_null
/*     */     //   64: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   67: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   70: ldc 'tellraw @a "<xXram2dieXx> 48656c6c6f3f"'
/*     */     //   72: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   75: aload_0
/*     */     //   76: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   79: ifeq -> 92
/*     */     //   82: getstatic dev/wendigodrip/thebrokenscript/util/TimeOfDay.MIDNIGHT : Ldev/wendigodrip/thebrokenscript/util/TimeOfDay;
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   89: invokevirtual set : (Lnet/minecraft/server/level/ServerLevel;)V
/*     */     //   92: aload_0
/*     */     //   93: instanceof net/minecraft/world/level/Level
/*     */     //   96: ifeq -> 169
/*     */     //   99: aload_0
/*     */     //   100: checkcast net/minecraft/world/level/Level
/*     */     //   103: invokevirtual isClientSide : ()Z
/*     */     //   106: ifne -> 142
/*     */     //   109: aload_0
/*     */     //   110: checkcast net/minecraft/world/level/Level
/*     */     //   113: aconst_null
/*     */     //   114: dload_1
/*     */     //   115: dload_3
/*     */     //   116: dload #5
/*     */     //   118: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   121: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   124: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   127: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   130: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   133: ldc 555.0
/*     */     //   135: fconst_0
/*     */     //   136: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   139: goto -> 169
/*     */     //   142: aload_0
/*     */     //   143: checkcast net/minecraft/world/level/Level
/*     */     //   146: dload_1
/*     */     //   147: dload_3
/*     */     //   148: dload #5
/*     */     //   150: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   153: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   156: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   159: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   162: ldc 555.0
/*     */     //   164: fconst_0
/*     */     //   165: iconst_0
/*     */     //   166: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   169: sipush #500
/*     */     //   172: aload_0
/*     */     //   173: dload_1
/*     */     //   174: dload_3
/*     */     //   175: dload #5
/*     */     //   177: aload #7
/*     */     //   179: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*     */     //   184: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   187: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #85	-> 0
/*     */     //   #86	-> 3
/*     */     //   #87	-> 10
/*     */     //   #88	-> 16
/*     */     //   #89	-> 24
/*     */     //   #90	-> 28
/*     */     //   #91	-> 50
/*     */     //   #90	-> 52
/*     */     //   #92	-> 58
/*     */     //   #89	-> 64
/*     */     //   #93	-> 67
/*     */     //   #88	-> 72
/*     */     //   #96	-> 75
/*     */     //   #97	-> 82
/*     */     //   #99	-> 92
/*     */     //   #100	-> 99
/*     */     //   #101	-> 109
/*     */     //   #102	-> 113
/*     */     //   #103	-> 114
/*     */     //   #102	-> 118
/*     */     //   #104	-> 121
/*     */     //   #101	-> 136
/*     */     //   #107	-> 142
/*     */     //   #108	-> 146
/*     */     //   #109	-> 147
/*     */     //   #110	-> 148
/*     */     //   #111	-> 150
/*     */     //   #112	-> 159
/*     */     //   #113	-> 162
/*     */     //   #114	-> 164
/*     */     //   #115	-> 165
/*     */     //   #107	-> 166
/*     */     //   #120	-> 169
/*     */     //   #121	-> 172
/*     */     //   #119	-> 172
/*     */     //   #271	-> 187
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	185	8	lv	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	188	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	188	1	$x	D
/*     */     //   0	188	3	$y	D
/*     */     //   0	188	5	$z	D
/*     */     //   0	188	7	$entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$6$lambda$5$lambda$4$lambda$3(LevelAccessor $world, double $x, double $y, double $z, Entity $entity) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #8
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 75
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #8
/*     */     //   16: aload #8
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #8
/*     */     //   47: iconst_4
/*     */     //   48: ldc ''
/*     */     //   50: ldc ''
/*     */     //   52: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   55: checkcast net/minecraft/network/chat/Component
/*     */     //   58: aload #8
/*     */     //   60: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   63: aconst_null
/*     */     //   64: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   67: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   70: ldc 'tellraw @a "<xXram2dieXx> 486f772064696420796f7520666f756e642074686973207365727665723f"'
/*     */     //   72: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   75: aload_0
/*     */     //   76: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   79: ifeq -> 92
/*     */     //   82: getstatic dev/wendigodrip/thebrokenscript/util/TimeOfDay.MIDNIGHT : Ldev/wendigodrip/thebrokenscript/util/TimeOfDay;
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   89: invokevirtual set : (Lnet/minecraft/server/level/ServerLevel;)V
/*     */     //   92: aload_0
/*     */     //   93: instanceof net/minecraft/world/level/Level
/*     */     //   96: ifeq -> 169
/*     */     //   99: aload_0
/*     */     //   100: checkcast net/minecraft/world/level/Level
/*     */     //   103: invokevirtual isClientSide : ()Z
/*     */     //   106: ifne -> 142
/*     */     //   109: aload_0
/*     */     //   110: checkcast net/minecraft/world/level/Level
/*     */     //   113: aconst_null
/*     */     //   114: dload_1
/*     */     //   115: dload_3
/*     */     //   116: dload #5
/*     */     //   118: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   121: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   124: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   127: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   130: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   133: ldc 555.0
/*     */     //   135: fconst_0
/*     */     //   136: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   139: goto -> 169
/*     */     //   142: aload_0
/*     */     //   143: checkcast net/minecraft/world/level/Level
/*     */     //   146: dload_1
/*     */     //   147: dload_3
/*     */     //   148: dload #5
/*     */     //   150: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   153: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   156: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   159: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   162: ldc 555.0
/*     */     //   164: fconst_0
/*     */     //   165: iconst_0
/*     */     //   166: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   169: sipush #500
/*     */     //   172: aload_0
/*     */     //   173: dload_1
/*     */     //   174: dload_3
/*     */     //   175: dload #5
/*     */     //   177: aload #7
/*     */     //   179: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*     */     //   184: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   187: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #122	-> 0
/*     */     //   #123	-> 3
/*     */     //   #124	-> 10
/*     */     //   #125	-> 16
/*     */     //   #126	-> 24
/*     */     //   #127	-> 28
/*     */     //   #128	-> 35
/*     */     //   #127	-> 39
/*     */     //   #129	-> 42
/*     */     //   #130	-> 50
/*     */     //   #129	-> 52
/*     */     //   #131	-> 58
/*     */     //   #126	-> 64
/*     */     //   #132	-> 67
/*     */     //   #133	-> 70
/*     */     //   #125	-> 72
/*     */     //   #136	-> 75
/*     */     //   #137	-> 82
/*     */     //   #139	-> 92
/*     */     //   #140	-> 99
/*     */     //   #141	-> 109
/*     */     //   #142	-> 113
/*     */     //   #143	-> 114
/*     */     //   #142	-> 118
/*     */     //   #144	-> 121
/*     */     //   #141	-> 136
/*     */     //   #147	-> 142
/*     */     //   #148	-> 146
/*     */     //   #149	-> 147
/*     */     //   #150	-> 148
/*     */     //   #151	-> 150
/*     */     //   #152	-> 159
/*     */     //   #153	-> 162
/*     */     //   #154	-> 164
/*     */     //   #155	-> 165
/*     */     //   #147	-> 166
/*     */     //   #160	-> 169
/*     */     //   #161	-> 172
/*     */     //   #159	-> 172
/*     */     //   #270	-> 187
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	185	8	lvl	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	188	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	188	1	$x	D
/*     */     //   0	188	3	$y	D
/*     */     //   0	188	5	$z	D
/*     */     //   0	188	7	$entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(LevelAccessor $world, double $x, double $y, double $z, Entity $entity) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #8
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 75
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #8
/*     */     //   16: aload #8
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #8
/*     */     //   47: iconst_4
/*     */     //   48: ldc ''
/*     */     //   50: ldc ''
/*     */     //   52: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   55: checkcast net/minecraft/network/chat/Component
/*     */     //   58: aload #8
/*     */     //   60: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   63: aconst_null
/*     */     //   64: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   67: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   70: ldc 'tellraw @a "<xXram2dieXx> 446f20796f752077616e7420746f20626520667269656e64733f0a"'
/*     */     //   72: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   75: aload_0
/*     */     //   76: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   79: ifeq -> 92
/*     */     //   82: getstatic dev/wendigodrip/thebrokenscript/util/TimeOfDay.MIDNIGHT : Ldev/wendigodrip/thebrokenscript/util/TimeOfDay;
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   89: invokevirtual set : (Lnet/minecraft/server/level/ServerLevel;)V
/*     */     //   92: aload_0
/*     */     //   93: instanceof net/minecraft/world/level/Level
/*     */     //   96: ifeq -> 169
/*     */     //   99: aload_0
/*     */     //   100: checkcast net/minecraft/world/level/Level
/*     */     //   103: invokevirtual isClientSide : ()Z
/*     */     //   106: ifne -> 142
/*     */     //   109: aload_0
/*     */     //   110: checkcast net/minecraft/world/level/Level
/*     */     //   113: aconst_null
/*     */     //   114: dload_1
/*     */     //   115: dload_3
/*     */     //   116: dload #5
/*     */     //   118: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   121: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   124: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   127: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   130: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   133: ldc 555.0
/*     */     //   135: fconst_0
/*     */     //   136: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   139: goto -> 169
/*     */     //   142: aload_0
/*     */     //   143: checkcast net/minecraft/world/level/Level
/*     */     //   146: dload_1
/*     */     //   147: dload_3
/*     */     //   148: dload #5
/*     */     //   150: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   153: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   156: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   159: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   162: ldc 555.0
/*     */     //   164: fconst_0
/*     */     //   165: iconst_0
/*     */     //   166: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   169: sipush #500
/*     */     //   172: aload_0
/*     */     //   173: dload_1
/*     */     //   174: dload_3
/*     */     //   175: dload #5
/*     */     //   177: aload #7
/*     */     //   179: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*     */     //   184: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   187: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #162	-> 0
/*     */     //   #163	-> 3
/*     */     //   #164	-> 10
/*     */     //   #165	-> 16
/*     */     //   #166	-> 24
/*     */     //   #167	-> 28
/*     */     //   #168	-> 35
/*     */     //   #167	-> 39
/*     */     //   #169	-> 42
/*     */     //   #170	-> 50
/*     */     //   #169	-> 52
/*     */     //   #171	-> 58
/*     */     //   #166	-> 64
/*     */     //   #172	-> 67
/*     */     //   #173	-> 70
/*     */     //   #165	-> 72
/*     */     //   #176	-> 75
/*     */     //   #177	-> 82
/*     */     //   #179	-> 92
/*     */     //   #180	-> 99
/*     */     //   #181	-> 109
/*     */     //   #182	-> 113
/*     */     //   #184	-> 114
/*     */     //   #183	-> 118
/*     */     //   #186	-> 121
/*     */     //   #187	-> 130
/*     */     //   #188	-> 133
/*     */     //   #189	-> 135
/*     */     //   #181	-> 136
/*     */     //   #192	-> 142
/*     */     //   #193	-> 146
/*     */     //   #194	-> 147
/*     */     //   #195	-> 148
/*     */     //   #196	-> 150
/*     */     //   #197	-> 159
/*     */     //   #198	-> 162
/*     */     //   #199	-> 164
/*     */     //   #200	-> 165
/*     */     //   #192	-> 166
/*     */     //   #205	-> 169
/*     */     //   #206	-> 172
/*     */     //   #204	-> 172
/*     */     //   #269	-> 187
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	185	8	lv3	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	188	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	188	1	$x	D
/*     */     //   0	188	3	$y	D
/*     */     //   0	188	5	$z	D
/*     */     //   0	188	7	$entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1(LevelAccessor $world, double $x, double $y, double $z, Entity $entity) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #8
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 75
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #8
/*     */     //   16: aload #8
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #8
/*     */     //   47: iconst_4
/*     */     //   48: ldc ''
/*     */     //   50: ldc ''
/*     */     //   52: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   55: checkcast net/minecraft/network/chat/Component
/*     */     //   58: aload #8
/*     */     //   60: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   63: aconst_null
/*     */     //   64: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   67: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   70: ldc 'tellraw @a "<xXram2dieXx> 4c656176652e"'
/*     */     //   72: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   75: aload_0
/*     */     //   76: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   79: ifeq -> 92
/*     */     //   82: getstatic dev/wendigodrip/thebrokenscript/util/TimeOfDay.MIDNIGHT : Ldev/wendigodrip/thebrokenscript/util/TimeOfDay;
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   89: invokevirtual set : (Lnet/minecraft/server/level/ServerLevel;)V
/*     */     //   92: aload_0
/*     */     //   93: instanceof net/minecraft/world/level/Level
/*     */     //   96: ifeq -> 169
/*     */     //   99: aload_0
/*     */     //   100: checkcast net/minecraft/world/level/Level
/*     */     //   103: invokevirtual isClientSide : ()Z
/*     */     //   106: ifne -> 142
/*     */     //   109: aload_0
/*     */     //   110: checkcast net/minecraft/world/level/Level
/*     */     //   113: aconst_null
/*     */     //   114: dload_1
/*     */     //   115: dload_3
/*     */     //   116: dload #5
/*     */     //   118: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   121: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   124: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   127: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   130: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   133: ldc 555.0
/*     */     //   135: fconst_0
/*     */     //   136: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   139: goto -> 169
/*     */     //   142: aload_0
/*     */     //   143: checkcast net/minecraft/world/level/Level
/*     */     //   146: dload_1
/*     */     //   147: dload_3
/*     */     //   148: dload #5
/*     */     //   150: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   153: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   156: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   159: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   162: ldc 555.0
/*     */     //   164: fconst_0
/*     */     //   165: iconst_0
/*     */     //   166: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   169: sipush #500
/*     */     //   172: aload_0
/*     */     //   173: dload_1
/*     */     //   174: dload_3
/*     */     //   175: dload #5
/*     */     //   177: aload #7
/*     */     //   179: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*     */     //   184: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   187: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #207	-> 0
/*     */     //   #208	-> 3
/*     */     //   #209	-> 10
/*     */     //   #210	-> 16
/*     */     //   #211	-> 24
/*     */     //   #212	-> 28
/*     */     //   #213	-> 35
/*     */     //   #212	-> 39
/*     */     //   #214	-> 42
/*     */     //   #215	-> 50
/*     */     //   #214	-> 52
/*     */     //   #216	-> 58
/*     */     //   #211	-> 64
/*     */     //   #217	-> 67
/*     */     //   #218	-> 70
/*     */     //   #210	-> 72
/*     */     //   #221	-> 75
/*     */     //   #222	-> 82
/*     */     //   #224	-> 92
/*     */     //   #225	-> 99
/*     */     //   #226	-> 109
/*     */     //   #227	-> 113
/*     */     //   #229	-> 114
/*     */     //   #228	-> 118
/*     */     //   #231	-> 121
/*     */     //   #232	-> 130
/*     */     //   #233	-> 133
/*     */     //   #234	-> 135
/*     */     //   #226	-> 136
/*     */     //   #237	-> 142
/*     */     //   #238	-> 146
/*     */     //   #239	-> 147
/*     */     //   #240	-> 148
/*     */     //   #241	-> 150
/*     */     //   #242	-> 159
/*     */     //   #243	-> 162
/*     */     //   #244	-> 164
/*     */     //   #245	-> 165
/*     */     //   #237	-> 166
/*     */     //   #250	-> 169
/*     */     //   #251	-> 172
/*     */     //   #249	-> 172
/*     */     //   #268	-> 187
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	185	8	lv4	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	188	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	188	1	$x	D
/*     */     //   0	188	3	$y	D
/*     */     //   0	188	5	$z	D
/*     */     //   0	188	7	$entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(LevelAccessor $world, double $x, double $y, double $z, Entity $entity) {
/* 252 */     if ($world instanceof ServerLevel) {
/* 253 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 254 */           new CommandSourceStack(
/* 255 */             CommandSource.NULL, new Vec3(
/* 256 */               $x, $y, $z), 
/* 257 */             Vec2.ZERO, (ServerLevel)$world, 4, "", (Component)Component.literal(
/* 258 */               ""), (
/* 259 */             (ServerLevel)$world).getServer(), null))
/* 260 */           .withSuppressedOutput(), 
/* 261 */           "tellraw @a {\"text\":\"xXram2dieXx left the game\",\"color\":\"yellow\"}");
/*     */     }
/*     */     
/* 264 */     if (!$entity.level().isClientSide())
/* 265 */       $entity.discard(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\Xxram2dieOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */