/*    */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.Metadata;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
/*    */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J0\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\r¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullTorturePlayerEntersDimensionProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class NullTorturePlayerEntersDimensionProcedure
/*    */ {
/*    */   @NotNull
/*    */   public static final NullTorturePlayerEntersDimensionProcedure INSTANCE = new NullTorturePlayerEntersDimensionProcedure();
/*    */   
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'world'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #8
/*    */     //   8: ifnonnull -> 12
/*    */     //   11: return
/*    */     //   12: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   15: aload_1
/*    */     //   16: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   19: invokevirtual getHasGeneratedNullDimension : ()Z
/*    */     //   22: ifne -> 242
/*    */     //   25: aload_1
/*    */     //   26: dload_2
/*    */     //   27: dload #4
/*    */     //   29: ldc2_w 6.0
/*    */     //   32: dsub
/*    */     //   33: dload #6
/*    */     //   35: ldc2_w 6.0
/*    */     //   38: dsub
/*    */     //   39: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   42: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.HELLISH_GENERATOR : Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   45: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   48: checkcast net/minecraft/world/level/block/Block
/*    */     //   51: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   54: iconst_3
/*    */     //   55: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   60: pop
/*    */     //   61: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   64: aload_1
/*    */     //   65: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   68: iconst_1
/*    */     //   69: invokevirtual setHasGeneratedNullDimension : (Z)V
/*    */     //   72: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   75: aload_1
/*    */     //   76: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   79: aload_1
/*    */     //   80: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   83: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   86: aload_1
/*    */     //   87: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   90: dload_2
/*    */     //   91: invokevirtual setDimensionSpawnX : (D)V
/*    */     //   94: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   97: aload_1
/*    */     //   98: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   101: aload_1
/*    */     //   102: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   105: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   108: aload_1
/*    */     //   109: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   112: dload #4
/*    */     //   114: invokevirtual setDimensionSpawnY : (D)V
/*    */     //   117: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   120: aload_1
/*    */     //   121: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   124: aload_1
/*    */     //   125: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   128: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   131: aload_1
/*    */     //   132: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   135: dload #6
/*    */     //   137: invokevirtual setDimensionSpawnZ : (D)V
/*    */     //   140: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   143: aload_1
/*    */     //   144: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   147: aload_1
/*    */     //   148: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   151: aload_1
/*    */     //   152: dload_2
/*    */     //   153: dload #4
/*    */     //   155: dload #6
/*    */     //   157: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   160: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   165: invokevirtual canOcclude : ()Z
/*    */     //   168: ifeq -> 340
/*    */     //   171: aload_1
/*    */     //   172: dload_2
/*    */     //   173: dload #4
/*    */     //   175: dload #6
/*    */     //   177: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   180: getstatic net/minecraft/world/level/block/Blocks.AIR : Lnet/minecraft/world/level/block/Block;
/*    */     //   183: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   186: iconst_3
/*    */     //   187: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   192: pop
/*    */     //   193: aload_1
/*    */     //   194: dload_2
/*    */     //   195: dload #4
/*    */     //   197: dconst_1
/*    */     //   198: dadd
/*    */     //   199: dload #6
/*    */     //   201: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   204: invokeinterface getBlockState : (Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   209: invokevirtual canOcclude : ()Z
/*    */     //   212: ifeq -> 340
/*    */     //   215: aload_1
/*    */     //   216: dload_2
/*    */     //   217: dload #4
/*    */     //   219: dconst_1
/*    */     //   220: dadd
/*    */     //   221: dload #6
/*    */     //   223: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   226: getstatic net/minecraft/world/level/block/Blocks.AIR : Lnet/minecraft/world/level/block/Block;
/*    */     //   229: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   232: iconst_3
/*    */     //   233: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   238: pop
/*    */     //   239: goto -> 340
/*    */     //   242: aload #8
/*    */     //   244: astore #9
/*    */     //   246: aload #9
/*    */     //   248: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   251: aload_1
/*    */     //   252: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   255: invokevirtual getDimensionSpawnX : ()D
/*    */     //   258: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   261: aload_1
/*    */     //   262: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   265: invokevirtual getDimensionSpawnY : ()D
/*    */     //   268: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   271: aload_1
/*    */     //   272: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   275: invokevirtual getDimensionSpawnZ : ()D
/*    */     //   278: invokevirtual teleportTo : (DDD)V
/*    */     //   281: aload #9
/*    */     //   283: instanceof net/minecraft/server/level/ServerPlayer
/*    */     //   286: ifeq -> 340
/*    */     //   289: aload #9
/*    */     //   291: checkcast net/minecraft/server/level/ServerPlayer
/*    */     //   294: getfield connection : Lnet/minecraft/server/network/ServerGamePacketListenerImpl;
/*    */     //   297: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   300: aload_1
/*    */     //   301: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   304: invokevirtual getDimensionSpawnX : ()D
/*    */     //   307: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   310: aload_1
/*    */     //   311: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   314: invokevirtual getDimensionSpawnY : ()D
/*    */     //   317: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   320: aload_1
/*    */     //   321: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   324: invokevirtual getDimensionSpawnZ : ()D
/*    */     //   327: aload #9
/*    */     //   329: invokevirtual getYRot : ()F
/*    */     //   332: aload #9
/*    */     //   334: invokevirtual getXRot : ()F
/*    */     //   337: invokevirtual teleport : (DDDFF)V
/*    */     //   340: sipush #4000
/*    */     //   343: aload #8
/*    */     //   345: aload_1
/*    */     //   346: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/LevelAccessor;)Ljava/lang/Runnable;
/*    */     //   351: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   354: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 6
/*    */     //   #20	-> 11
/*    */     //   #22	-> 12
/*    */     //   #23	-> 25
/*    */     //   #24	-> 26
/*    */     //   #23	-> 55
/*    */     //   #26	-> 61
/*    */     //   #27	-> 72
/*    */     //   #28	-> 83
/*    */     //   #29	-> 94
/*    */     //   #30	-> 105
/*    */     //   #31	-> 117
/*    */     //   #32	-> 128
/*    */     //   #33	-> 140
/*    */     //   #34	-> 151
/*    */     //   #35	-> 171
/*    */     //   #36	-> 172
/*    */     //   #35	-> 187
/*    */     //   #38	-> 193
/*    */     //   #39	-> 215
/*    */     //   #40	-> 216
/*    */     //   #39	-> 233
/*    */     //   #45	-> 242
/*    */     //   #46	-> 246
/*    */     //   #47	-> 248
/*    */     //   #46	-> 278
/*    */     //   #49	-> 281
/*    */     //   #50	-> 289
/*    */     //   #51	-> 297
/*    */     //   #52	-> 307
/*    */     //   #53	-> 317
/*    */     //   #54	-> 327
/*    */     //   #55	-> 332
/*    */     //   #50	-> 337
/*    */     //   #60	-> 340
/*    */     //   #61	-> 343
/*    */     //   #59	-> 343
/*    */     //   #104	-> 354
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   246	94	9	_ent	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	355	0	this	Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullTorturePlayerEntersDimensionProcedure;
/*    */     //   0	355	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	355	2	x	D
/*    */     //   0	355	4	y	D
/*    */     //   0	355	6	z	D
/*    */     //   0	355	8	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$0(Entity $entity, LevelAccessor $world) {
/* 62 */     if (Math.random() < 0.7D) {
/* 63 */       if ($entity instanceof ServerPlayer && !((ServerPlayer)$entity).level().isClientSide()) {
/* 64 */         ResourceKey destinationType = Level.OVERWORLD;
/* 65 */         if (((ServerPlayer)$entity).level().dimension() == destinationType) {
/*    */           return;
/*    */         }
/* 68 */         ServerLevel nextLevel = ((ServerPlayer)$entity).server.getLevel(destinationType);
/* 69 */         if (nextLevel != null) {
/* 70 */           ((ServerPlayer)$entity).connection.send(
/* 71 */               (Packet)new ClientboundGameEventPacket(
/* 72 */                 ClientboundGameEventPacket.WIN_GAME, 0.0F));
/*    */ 
/*    */           
/* 75 */           ((ServerPlayer)$entity).teleportTo(
/* 76 */               nextLevel, ((ServerPlayer)$entity).getX(), ((ServerPlayer)$entity).getY(), ((ServerPlayer)$entity).getZ(), ((ServerPlayer)$entity).getYRot(), ((ServerPlayer)$entity).getXRot());
/*    */           
/* 78 */           ((ServerPlayer)$entity).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((ServerPlayer)$entity).getAbilities()));
/* 79 */           for (MobEffectInstance _effectinstance : ((ServerPlayer)$entity).getActiveEffects()) {
/* 80 */             ((ServerPlayer)$entity).connection.send(
/* 81 */                 (Packet)new ClientboundUpdateMobEffectPacket((
/* 82 */                   (ServerPlayer)$entity).getId(), _effectinstance, false));
/*    */           }
/*    */ 
/*    */           
/* 86 */           ((ServerPlayer)$entity).connection.send(
/* 87 */               (Packet)new ClientboundLevelEventPacket(
/* 88 */                 1032, BlockPos.ZERO, 0, false));
/*    */         } 
/*    */       } 
/*    */ 
/*    */       
/* 93 */       Entity _ent = $entity;
/* 94 */       _ent.teleportTo(
/* 95 */           MapVariables.Companion.get($world).getBaseX(), MapVariables.Companion.get($world).getBaseY(), MapVariables.Companion.get($world).getBaseZ());
/*    */       
/* 97 */       if (_ent instanceof ServerPlayer)
/* 98 */         ((ServerPlayer)_ent).connection.teleport(
/* 99 */             MapVariables.Companion.get($world).getBaseX(), MapVariables.Companion.get($world).getBaseY(), MapVariables.Companion.get($world).getBaseZ(), _ent.getYRot(), _ent.getXRot()); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullTorturePlayerEntersDimensionProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */