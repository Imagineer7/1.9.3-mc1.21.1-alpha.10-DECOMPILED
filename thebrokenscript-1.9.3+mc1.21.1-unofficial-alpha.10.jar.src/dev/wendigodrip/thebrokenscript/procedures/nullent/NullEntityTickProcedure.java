/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.entity.NullUnbeatableBossfightEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.NulllEntity;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSParticleTypes;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSSounds;
/*     */ import dev.wendigodrip.thebrokenscript.util.EntityFinder;
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*     */ import net.minecraft.resources.ResourceKey;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LightningBolt;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullEntityTickProcedure;", "", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class NullEntityTickProcedure {
/*     */   @JvmStatic
/*     */   public static final void execute(@NotNull Level level, double x, double y, double z, @Nullable Entity entity) {
/*  38 */     Intrinsics.checkNotNullParameter(level, "level"); if (entity == null)
/*     */       return; 
/*  40 */     if (!EntityFinder.INSTANCE.findSortedEntitiesInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 400.0D).isEmpty()) {
/*  41 */       Intrinsics.checkNotNull(EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 500.0D)); Player ent = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 500.0D);
/*     */       
/*  43 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, ent.position());
/*     */     } 
/*     */     
/*  46 */     if (!EntityFinder.INSTANCE.findSortedEntitiesInRange((LevelAccessor)level, IronGolem.class, new Vec3(x, y, z), 10.0D).isEmpty()) {
/*  47 */       Intrinsics.checkNotNull(EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, IronGolem.class, new Vec3(x, y, z), 500.0D)); ((IronGolem)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, IronGolem.class, new Vec3(x, y, z), 500.0D))
/*  48 */         .hurt(level.damageSources().generic(), 55.0F);
/*     */     } 
/*     */     
/*  51 */     if (!EntityFinder.INSTANCE.findSortedEntitiesInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 20.0D).isEmpty()) {
/*  52 */       MapVariables vars = MapVariables.Companion.get((LevelAccessor)level);
/*  53 */       double angerType = Mth.nextInt(RandomSource.create(), 1, 10);
/*     */       
/*  55 */       if ((angerType == 1.0D)) {
/*  56 */         if (!entity.level().isClientSide()) entity.discard();
/*     */         
/*  58 */         Player ent = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 24.0D);
/*     */         
/*  60 */         if (ent instanceof net.minecraft.world.entity.LivingEntity && 
/*  61 */           !ent.level().isClientSide()) {
/*  62 */           ent.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 80, 1, false, false));
/*     */         }
/*  64 */         if (!level.isClientSide()) {
/*  65 */           level.playSound(
/*  66 */               null, BlockPos.containing(x, y, z), (SoundEvent)TBSSounds.INSTANCE.getNULLFLEE().get(), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */         } else {
/*     */           
/*  69 */           level.playLocalSound(
/*  70 */               x, y, z, (SoundEvent)TBSSounds.INSTANCE.getNULLFLEE().get(), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */         }
/*     */       
/*  73 */       } else if (((angerType == 2.0D)) && !((vars.getEntityReputation() == 2.0D) ? 1 : 0)) {
/*  74 */         if (!entity.level().isClientSide()) entity.discard();
/*     */         
/*  76 */         if (level instanceof ServerLevel) {
/*  77 */           NulllEntity toSpawn = (NulllEntity)((EntityType)TBSEntities.NULLL.get()).spawn(
/*  78 */               (ServerLevel)level, BlockPos.containing(
/*  79 */                 x, y, z), 
/*  80 */               MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */           
/*  83 */           if (toSpawn != null) { toSpawn.setYRot(((ServerLevel)level).getRandom().nextFloat() * 360.0F); }
/*     */           else {  }
/*     */         
/*  86 */         }  Player ent = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 24.0D);
/*     */         
/*  88 */         if (ent != null && !ent.level().isClientSide()) ent.addEffect(
/*  89 */               new MobEffectInstance(
/*  90 */                 MobEffects.DARKNESS, 50, 1, false, false));
/*     */       
/*     */       }
/*  93 */       else if ((angerType == 3.0D)) {
/*  94 */         if ((vars.getEntityReputation() == 0.0D))
/*  95 */         { if (!entity.level().isClientSide()) entity.discard();
/*     */           
/*  97 */           if (level instanceof ServerLevel) {
/*  98 */             NullUnbeatableBossfightEntity toSpawn = (NullUnbeatableBossfightEntity)((EntityType)TBSEntities.NULL_UNBEATABLE_BOSSFIGHT.get())
/*  99 */               .spawn((ServerLevel)level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */             
/* 101 */             if (toSpawn != null) { toSpawn.setYRot(((ServerLevel)level).getRandom().nextFloat() * 360.0F); } else {  }
/*     */           
/*     */           }  }
/* 104 */         else { if (!entity.level().isClientSide()) entity.discard();
/*     */           
/* 106 */           if (level instanceof ServerLevel) {
/* 107 */             NulllEntity toSpawn = (NulllEntity)((EntityType)TBSEntities.NULLL.get())
/* 108 */               .spawn((ServerLevel)level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */             
/* 110 */             if (toSpawn != null) { toSpawn.setYRot(((ServerLevel)level).getRandom().nextFloat() * 360.0F); }
/*     */             else {  }
/*     */           
/* 113 */           }  Player ent = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 24.0D);
/*     */           
/* 115 */           if (ent != null && !ent.level().isClientSide()) {
/* 116 */             ent.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 50, 1, false, false));
/*     */           } }
/*     */       
/* 119 */       } else if ((angerType == 4.0D)) {
/* 120 */         if (!entity.level().isClientSide()) entity.discard();
/*     */         
/* 122 */         if (level instanceof ServerLevel)
/*     */         {
/* 124 */           Intrinsics.checkNotNull(TBSParticleTypes.NULL_PARTICLE.get(), "null cannot be cast to non-null type net.minecraft.core.particles.ParticleOptions"); ((ServerLevel)level).sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D);
/*     */         }
/*     */       
/* 127 */       } else if ((angerType == 5.0D)) {
/* 128 */         if (!entity.level().isClientSide()) entity.discard();
/*     */         
/* 130 */         if (level instanceof ServerLevel) {
/* 131 */           Intrinsics.checkNotNull(TBSParticleTypes.EYES.get(), "null cannot be cast to non-null type net.minecraft.core.particles.ParticleOptions"); ((ServerLevel)level).sendParticles((ParticleOptions)TBSParticleTypes.EYES.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D);
/*     */         } 
/* 133 */       } else if ((angerType == 6.0D)) {
/* 134 */         if (!entity.level().isClientSide()) entity.discard();
/*     */         
/* 136 */         if (level instanceof ServerLevel) {
/*     */           
/* 138 */           Intrinsics.checkNotNull(TBSParticleTypes.NULL_PARTICLE.get(), "null cannot be cast to non-null type net.minecraft.core.particles.ParticleOptions"); ((ServerLevel)level).sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D);
/*     */         } 
/*     */ 
/*     */         
/* 142 */         Player player = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 40.0D);
/*     */         
/* 144 */         if (player instanceof ServerPlayer && !((ServerPlayer)player).level().isClientSide()) {
/* 145 */           ResourceKey dest = ResourceKey.create(Registries.DIMENSION, TBSConstants.id("null_torture"));
/*     */           
/* 147 */           if (((ServerPlayer)player).level().dimension() == dest)
/*     */             return; 
/* 149 */           ServerLevel playerLevel = ((ServerPlayer)player).server.getLevel(dest);
/*     */           
/* 151 */           if (playerLevel != null) {
/* 152 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/* 153 */             ((ServerPlayer)player).teleportTo(playerLevel, ((ServerPlayer)player).getX(), ((ServerPlayer)player).getY(), ((ServerPlayer)player).getZ(), ((ServerPlayer)player).getYRot(), ((ServerPlayer)player).getXRot());
/* 154 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((ServerPlayer)player).getAbilities()));
/*     */             
/* 156 */             for (MobEffectInstance effect : ((ServerPlayer)player).getActiveEffects()) {
/* 157 */               ((ServerPlayer)player).connection.send((Packet)new ClientboundUpdateMobEffectPacket(((ServerPlayer)player).getId(), effect, false));
/*     */             }
/*     */             
/* 160 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*     */           } 
/*     */         } 
/* 163 */       } else if ((angerType == 7.0D)) {
/* 164 */         if (!entity.level().isClientSide()) entity.discard();
/*     */         
/* 166 */         if (level instanceof ServerLevel) {
/*     */           
/* 168 */           Intrinsics.checkNotNull(TBSParticleTypes.NULL_PARTICLE.get(), "null cannot be cast to non-null type net.minecraft.core.particles.ParticleOptions"); ((ServerLevel)level).sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D);
/*     */         } 
/*     */ 
/*     */         
/* 172 */         Player player = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 40.0D);
/*     */         
/* 174 */         if (player instanceof ServerPlayer && !((ServerPlayer)player).level().isClientSide()) {
/* 175 */           ResourceKey dest = ResourceKey.create(Registries.DIMENSION, TBSConstants.id("day_b"));
/*     */           
/* 177 */           if (((ServerPlayer)player).level().dimension() == dest)
/*     */             return; 
/* 179 */           ServerLevel playerLevel = ((ServerPlayer)player).server.getLevel(dest);
/*     */           
/* 181 */           if (playerLevel != null) {
/* 182 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/* 183 */             ((ServerPlayer)player).teleportTo(playerLevel, ((ServerPlayer)player).getX(), ((ServerPlayer)player).getY(), ((ServerPlayer)player).getZ(), ((ServerPlayer)player).getYRot(), ((ServerPlayer)player).getXRot());
/* 184 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((ServerPlayer)player).getAbilities()));
/*     */             
/* 186 */             for (MobEffectInstance effect : ((ServerPlayer)player).getActiveEffects()) {
/* 187 */               ((ServerPlayer)player).connection.send((Packet)new ClientboundUpdateMobEffectPacket(((ServerPlayer)player).getId(), effect, false));
/*     */             }
/*     */             
/* 190 */             ((ServerPlayer)player).connection.send(
/* 191 */                 (Packet)new ClientboundLevelEventPacket(
/* 192 */                   1032, BlockPos.ZERO, 0, false));
/*     */           }
/*     */         
/*     */         }
/*     */       
/* 197 */       } else if ((angerType == 8.0D)) {
/* 198 */         if (!entity.level().isClientSide()) {
/* 199 */           entity.discard();
/*     */         }
/* 201 */         if (level instanceof ServerLevel) {
/*     */           
/* 203 */           Intrinsics.checkNotNull(TBSParticleTypes.NULL_PARTICLE.get(), "null cannot be cast to non-null type net.minecraft.core.particles.ParticleOptions"); ((ServerLevel)level).sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D);
/*     */         } 
/*     */         
/* 206 */         entity.teleportTo(
/* 207 */             vars.getBaseX(), vars.getBaseY() + 1.0D, vars.getBaseZ());
/*     */         
/* 209 */         if (entity instanceof ServerPlayer) {
/* 210 */           ((ServerPlayer)entity).connection.teleport(
/* 211 */               vars.getBaseX(), vars.getBaseY() + 1.0D, vars.getBaseZ(), ((ServerPlayer)entity).getYRot(), ((ServerPlayer)entity).getXRot());
/*     */         }
/*     */       }
/* 214 */       else if ((angerType == 9.0D)) {
/* 215 */         if (!entity.level().isClientSide()) {
/* 216 */           entity.discard();
/*     */         }
/* 218 */         if (level instanceof ServerLevel) {
/*     */           
/* 220 */           Intrinsics.checkNotNull(TBSParticleTypes.NULL_PARTICLE.get(), "null cannot be cast to non-null type net.minecraft.core.particles.ParticleOptions"); ((ServerLevel)level).sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE.get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D);
/*     */         } 
/*     */ 
/*     */         
/* 224 */         Player player = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, Player.class, new Vec3(x, y, z), 40.0D);
/*     */         
/* 226 */         if (player != null) { player.teleportTo(vars.getBaseX(), vars.getBaseY() + 1.0D, vars.getBaseZ()); }
/*     */         else {  }
/* 228 */          if (player instanceof ServerPlayer) {
/* 229 */           ((ServerPlayer)player).connection.teleport(
/* 230 */               vars.getBaseX(), vars.getBaseY() + 1.0D, vars.getBaseZ(), ((ServerPlayer)player).getYRot(), ((ServerPlayer)player).getXRot());
/*     */         }
/*     */       }
/* 233 */       else if ((angerType == 10.0D)) {
/* 234 */         if (!entity.level().isClientSide()) entity.discard();
/*     */         
/* 236 */         if (level instanceof ServerLevel) {
/* 237 */           LightningBolt toSpawn = (LightningBolt)EntityType.LIGHTNING_BOLT.create(level);
/*     */           
/* 239 */           Intrinsics.checkNotNull(toSpawn); toSpawn.moveTo(Vec3.atBottomCenterOf((Vec3i)BlockPos.containing(x, y, z)));
/* 240 */           ((ServerLevel)level).addFreshEntity((Entity)toSpawn);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 245 */     if (level.isDay() && !entity.level().isClientSide()) entity.discard(); 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final NullEntityTickProcedure INSTANCE = new NullEntityTickProcedure();
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullEntityTickProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */