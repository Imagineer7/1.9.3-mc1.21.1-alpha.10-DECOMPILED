/*    */ package dev.wendigodrip.thebrokenscript.procedures.dim;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.MobSpawnType;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J0\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\r¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/dim/DayAPlayerEntersDimensionProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class DayAPlayerEntersDimensionProcedure
/*    */ {
/*    */   @NotNull
/*    */   public static final DayAPlayerEntersDimensionProcedure INSTANCE = new DayAPlayerEntersDimensionProcedure();
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
/*    */     //   19: invokevirtual getHasGeneratedField : ()Z
/*    */     //   22: ifne -> 76
/*    */     //   25: aload_1
/*    */     //   26: dload_2
/*    */     //   27: ldc2_w 100.0
/*    */     //   30: dload #6
/*    */     //   32: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   35: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.FIELD_GENERATOR : Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   38: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   41: checkcast net/minecraft/world/level/block/Block
/*    */     //   44: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   47: iconst_3
/*    */     //   48: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   53: pop
/*    */     //   54: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   57: aload_1
/*    */     //   58: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   61: iconst_1
/*    */     //   62: invokevirtual setHasGeneratedField : (Z)V
/*    */     //   65: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   68: aload_1
/*    */     //   69: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   72: aload_1
/*    */     //   73: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   76: aload #8
/*    */     //   78: astore #9
/*    */     //   80: aload #9
/*    */     //   82: dload_2
/*    */     //   83: ldc2_w 110.0
/*    */     //   86: dload #6
/*    */     //   88: invokevirtual teleportTo : (DDD)V
/*    */     //   91: aload #9
/*    */     //   93: instanceof net/minecraft/server/level/ServerPlayer
/*    */     //   96: ifeq -> 126
/*    */     //   99: aload #9
/*    */     //   101: checkcast net/minecraft/server/level/ServerPlayer
/*    */     //   104: getfield connection : Lnet/minecraft/server/network/ServerGamePacketListenerImpl;
/*    */     //   107: dload_2
/*    */     //   108: ldc2_w 110.0
/*    */     //   111: dload #6
/*    */     //   113: aload #9
/*    */     //   115: invokevirtual getYRot : ()F
/*    */     //   118: aload #9
/*    */     //   120: invokevirtual getXRot : ()F
/*    */     //   123: invokevirtual teleport : (DDDFF)V
/*    */     //   126: sipush #18000
/*    */     //   129: aload_1
/*    */     //   130: dload_2
/*    */     //   131: dload #4
/*    */     //   133: dload #6
/*    */     //   135: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*    */     //   140: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   143: sipush #20000
/*    */     //   146: aload #8
/*    */     //   148: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*    */     //   153: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   156: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 6
/*    */     //   #26	-> 11
/*    */     //   #28	-> 12
/*    */     //   #29	-> 25
/*    */     //   #30	-> 26
/*    */     //   #29	-> 48
/*    */     //   #32	-> 54
/*    */     //   #33	-> 65
/*    */     //   #35	-> 76
/*    */     //   #36	-> 80
/*    */     //   #37	-> 91
/*    */     //   #38	-> 99
/*    */     //   #41	-> 126
/*    */     //   #42	-> 129
/*    */     //   #40	-> 129
/*    */     //   #55	-> 143
/*    */     //   #56	-> 146
/*    */     //   #54	-> 146
/*    */     //   #91	-> 156
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   80	77	9	_ent	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	157	0	this	Ldev/wendigodrip/thebrokenscript/procedures/dim/DayAPlayerEntersDimensionProcedure;
/*    */     //   0	157	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	157	2	x	D
/*    */     //   0	157	4	y	D
/*    */     //   0	157	6	z	D
/*    */     //   0	157	8	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$0(LevelAccessor $world, double $x, double $y, double $z) {
/* 43 */     if ($world instanceof ServerLevel) {
/* 44 */       Intrinsics.checkNotNull(TBSEntities.NULL_IS_HERE.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.NULL_IS_HERE.get()).spawn(
/* 45 */           (ServerLevel)$world, BlockPos.containing(
/* 46 */             $x, $y, $z), 
/* 47 */           MobSpawnType.MOB_SUMMONED);
/*    */       
/* 49 */       if (entityToSpawn != null);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void execute$lambda$1(Entity $entity) {
/* 57 */     if ($entity instanceof ServerPlayer && !((ServerPlayer)$entity).level().isClientSide()) {
/* 58 */       ResourceKey destinationType = Level.OVERWORLD;
/* 59 */       if (((ServerPlayer)$entity).level().dimension() == destinationType) {
/*    */         return;
/*    */       }
/* 62 */       ServerLevel nextLevel = ((ServerPlayer)$entity).server.getLevel(destinationType);
/* 63 */       if (nextLevel != null) {
/* 64 */         ((ServerPlayer)$entity).connection.send(
/* 65 */             (Packet)new ClientboundGameEventPacket(
/* 66 */               ClientboundGameEventPacket.WIN_GAME, 0.0F));
/*    */ 
/*    */         
/* 69 */         ((ServerPlayer)$entity).teleportTo(
/* 70 */             nextLevel, ((ServerPlayer)$entity).getX(), ((ServerPlayer)$entity).getY(), ((ServerPlayer)$entity).getZ(), ((ServerPlayer)$entity).getYRot(), ((ServerPlayer)$entity).getXRot());
/*    */         
/* 72 */         ((ServerPlayer)$entity).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((ServerPlayer)$entity).getAbilities()));
/* 73 */         for (MobEffectInstance _effectinstance : ((ServerPlayer)$entity).getActiveEffects()) {
/* 74 */           ((ServerPlayer)$entity).connection.send(
/* 75 */               (Packet)new ClientboundUpdateMobEffectPacket((
/* 76 */                 (ServerPlayer)$entity).getId(), _effectinstance, false));
/*    */         }
/*    */ 
/*    */         
/* 80 */         ((ServerPlayer)$entity).connection.send(
/* 81 */             (Packet)new ClientboundLevelEventPacket(
/* 82 */               1032, BlockPos.ZERO, 0, false));
/*    */       } 
/*    */     } 
/*    */ 
/*    */     
/* 87 */     if ($entity instanceof LivingEntity && !((LivingEntity)$entity).level().isClientSide())
/* 88 */       ((LivingEntity)$entity).addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 500, 1, false, false)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\dim\DayAPlayerEntersDimensionProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */