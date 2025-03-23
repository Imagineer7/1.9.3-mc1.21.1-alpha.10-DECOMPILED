/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullFinalizeSpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class NullFinalizeSpawnProcedure
/*     */ {
/*     */   @NotNull
/*     */   public static final NullFinalizeSpawnProcedure INSTANCE = new NullFinalizeSpawnProcedure();
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
/*     */     //   49: ldc 'nulljumpscareloud'
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
/*     */     //   83: ldc 'nulljumpscareloud'
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
/*     */     //   140: ldc 'nullchase'
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
/*     */     //   174: ldc 'nullchase'
/*     */     //   176: invokestatic id : (Ljava/lang/String;)Lnet/minecraft/resources/ResourceLocation;
/*     */     //   179: invokeinterface get : (Lnet/minecraft/resources/ResourceLocation;)Ljava/lang/Object;
/*     */     //   184: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   187: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   190: ldc 555.0
/*     */     //   192: fconst_1
/*     */     //   193: iconst_0
/*     */     //   194: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   197: sipush #450
/*     */     //   200: aload_0
/*     */     //   201: dload_1
/*     */     //   202: dload_3
/*     */     //   203: dload #5
/*     */     //   205: aload #7
/*     */     //   207: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDDLnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*     */     //   212: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   215: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   218: aload_0
/*     */     //   219: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   222: astore #9
/*     */     //   224: aload #9
/*     */     //   226: aload #9
/*     */     //   228: invokevirtual getEntityReputation : ()D
/*     */     //   231: dconst_1
/*     */     //   232: dsub
/*     */     //   233: invokevirtual setEntityReputation : (D)V
/*     */     //   236: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   239: aload_0
/*     */     //   240: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   243: aload_0
/*     */     //   244: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   247: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #25	-> 6
/*     */     //   #26	-> 9
/*     */     //   #27	-> 14
/*     */     //   #29	-> 15
/*     */     //   #30	-> 22
/*     */     //   #31	-> 28
/*     */     //   #32	-> 36
/*     */     //   #33	-> 38
/*     */     //   #34	-> 39
/*     */     //   #35	-> 46
/*     */     //   #36	-> 62
/*     */     //   #37	-> 65
/*     */     //   #38	-> 67
/*     */     //   #32	-> 68
/*     */     //   #41	-> 74
/*     */     //   #42	-> 76
/*     */     //   #43	-> 77
/*     */     //   #44	-> 78
/*     */     //   #45	-> 80
/*     */     //   #46	-> 96
/*     */     //   #47	-> 99
/*     */     //   #48	-> 101
/*     */     //   #49	-> 102
/*     */     //   #41	-> 103
/*     */     //   #53	-> 106
/*     */     //   #54	-> 113
/*     */     //   #55	-> 119
/*     */     //   #56	-> 127
/*     */     //   #57	-> 129
/*     */     //   #58	-> 130
/*     */     //   #59	-> 137
/*     */     //   #60	-> 153
/*     */     //   #61	-> 156
/*     */     //   #62	-> 158
/*     */     //   #56	-> 159
/*     */     //   #65	-> 165
/*     */     //   #66	-> 167
/*     */     //   #67	-> 168
/*     */     //   #68	-> 169
/*     */     //   #69	-> 171
/*     */     //   #70	-> 187
/*     */     //   #71	-> 190
/*     */     //   #72	-> 192
/*     */     //   #73	-> 193
/*     */     //   #65	-> 194
/*     */     //   #78	-> 197
/*     */     //   #79	-> 200
/*     */     //   #77	-> 200
/*     */     //   #119	-> 215
/*     */     //   #120	-> 236
/*     */     //   #121	-> 247
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   9	239	8	_level	Lnet/minecraft/world/level/Level;
/*     */     //   0	248	0	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	248	1	x	D
/*     */     //   0	248	3	y	D
/*     */     //   0	248	5	z	D
/*     */     //   0	248	7	entity	Lnet/minecraft/world/entity/Entity;
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$0(LevelAccessor $world, double $x, double $y, double $z, Entity $entity) {
/*  80 */     ServerLevel lv = null;
/*  81 */     if ($world instanceof ServerLevel) {
/*  82 */       lv = (ServerLevel)$world;
/*  83 */       lv.getServer()
/*  84 */         .getCommands()
/*  85 */         .performPrefixedCommand((
/*  86 */           new CommandSourceStack(
/*  87 */             CommandSource.NULL, 
/*  88 */             new Vec3($x, $y, $z), 
/*  89 */             Vec2.ZERO, 
/*  90 */             lv, 
/*  91 */             4, 
/*  92 */             "", 
/*  93 */             (Component)Component.literal(""), 
/*  94 */             lv.getServer(), 
/*  95 */             null))
/*  96 */           .withSuppressedOutput(), "stopsound @a");
/*     */     } 
/*     */     
/*  99 */     if (!$entity.level().isClientSide()) {
/* 100 */       $entity.discard();
/*     */     }
/* 102 */     if (Math.random() < 0.7D && $world instanceof ServerLevel) {
/* 103 */       lv = (ServerLevel)$world;
/*     */       
/* 105 */       Intrinsics.checkNotNull(TBSEntities.NULL_IS_HERE.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.NULL_IS_HERE.get()).spawn(
/* 106 */           lv, 
/* 107 */           BlockPos.containing(
/* 108 */             $x, 
/* 109 */             $y, 
/* 110 */             $z), 
/*     */           
/* 112 */           MobSpawnType.MOB_SUMMONED);
/*     */       
/* 114 */       if (entityToSpawn != null)
/* 115 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullFinalizeSpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */