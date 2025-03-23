/*    */ package dev.wendigodrip.thebrokenscript.procedures.clan;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\b\020\013\032\004\030\0010\f¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/clan/ClanVoidPlayerEntersDimensionProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nClanVoidPlayerEntersDimensionProcedure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClanVoidPlayerEntersDimensionProcedure.kt\ndev/wendigodrip/thebrokenscript/procedures/clan/ClanVoidPlayerEntersDimensionProcedure\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
/*    */ public final class ClanVoidPlayerEntersDimensionProcedure
/*    */ {
/*    */   @NotNull
/*    */   public static final ClanVoidPlayerEntersDimensionProcedure INSTANCE = new ClanVoidPlayerEntersDimensionProcedure();
/*    */   
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double z, @Nullable Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'world'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #6
/*    */     //   8: ifnonnull -> 12
/*    */     //   11: return
/*    */     //   12: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   15: aload_1
/*    */     //   16: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   19: invokevirtual getHasGeneratedClanBuildDimension : ()Z
/*    */     //   22: ifne -> 79
/*    */     //   25: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   28: aload_1
/*    */     //   29: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   32: iconst_1
/*    */     //   33: invokevirtual setHasGeneratedClanBuildDimension : (Z)V
/*    */     //   36: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   39: aload_1
/*    */     //   40: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   43: aload_1
/*    */     //   44: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   47: aload_1
/*    */     //   48: dload_2
/*    */     //   49: ldc2_w 200.0
/*    */     //   52: dload #4
/*    */     //   54: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   57: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.INSTANCE : Ldev/wendigodrip/thebrokenscript/registry/TBSBlocks;
/*    */     //   60: invokevirtual getCLANBUILD_ANOMALY_GENERATOR : ()Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   63: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   66: checkcast net/minecraft/world/level/block/Block
/*    */     //   69: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   72: iconst_3
/*    */     //   73: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   78: pop
/*    */     //   79: sipush #18000
/*    */     //   82: aload #6
/*    */     //   84: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*    */     //   89: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   92: bipush #20
/*    */     //   94: aload #6
/*    */     //   96: dload_2
/*    */     //   97: dload #4
/*    */     //   99: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;DD)Ljava/lang/Runnable;
/*    */     //   104: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   107: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 6
/*    */     //   #19	-> 11
/*    */     //   #21	-> 12
/*    */     //   #22	-> 25
/*    */     //   #23	-> 36
/*    */     //   #24	-> 47
/*    */     //   #25	-> 48
/*    */     //   #26	-> 57
/*    */     //   #27	-> 72
/*    */     //   #24	-> 73
/*    */     //   #31	-> 79
/*    */     //   #32	-> 82
/*    */     //   #30	-> 82
/*    */     //   #79	-> 92
/*    */     //   #80	-> 94
/*    */     //   #78	-> 94
/*    */     //   #87	-> 107
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	108	0	this	Ldev/wendigodrip/thebrokenscript/procedures/clan/ClanVoidPlayerEntersDimensionProcedure;
/*    */     //   0	108	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	108	2	x	D
/*    */     //   0	108	4	z	D
/*    */     //   0	108	6	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$1(Entity $entity) {
/* 33 */     Object _player = null;
/* 34 */     if ($entity instanceof ServerPlayer) { Entity entity = $entity; ServerPlayer it = (ServerPlayer)entity;
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
/* 91 */       int $i$a$-also-ClanVoidPlayerEntersDimensionProcedure$execute$1$1 = 0;
/*    */       _player = it;
/*    */       if (!((ServerPlayer)entity).level().isClientSide()) {
/*    */         ResourceKey destinationType = Level.OVERWORLD;
/*    */         if (((ServerPlayer)$entity).level().dimension() == destinationType)
/*    */           return; 
/*    */         ServerLevel nextLevel = ((ServerPlayer)$entity).server.getLevel(destinationType);
/*    */         if (nextLevel != null) {
/*    */           ((ServerPlayer)$entity).connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/*    */           ((ServerPlayer)$entity).teleportTo(nextLevel, ((ServerPlayer)$entity).getX(), ((ServerPlayer)$entity).getY(), ((ServerPlayer)$entity).getZ(), ((ServerPlayer)$entity).getYRot(), ((ServerPlayer)$entity).getXRot());
/*    */           ((ServerPlayer)$entity).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((ServerPlayer)$entity).getAbilities()));
/*    */           for (MobEffectInstance _effectinstance : ((ServerPlayer)$entity).getActiveEffects())
/*    */             ((ServerPlayer)$entity).connection.send((Packet)new ClientboundUpdateMobEffectPacket(((ServerPlayer)$entity).getId(), _effectinstance, false)); 
/*    */           ((ServerPlayer)$entity).connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*    */         } 
/*    */       }  }
/*    */   
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$2(Entity $entity, double $x, double $z) {
/*    */     Entity _ent = $entity;
/*    */     _ent.teleportTo($x, 205.0D, $z);
/*    */     if (_ent instanceof ServerPlayer)
/*    */       ((ServerPlayer)_ent).connection.teleport($x, 205.0D, $z, _ent.getYRot(), _ent.getXRot()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\clan\ClanVoidPlayerEntersDimensionProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */