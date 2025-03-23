/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSBlocks;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSItems;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSParticleTypes;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
/*     */ import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
/*     */ import net.minecraft.resources.ResourceKey;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.neoforged.neoforge.items.ItemHandlerHelper;
/*     */ 
/*     */ public class FollowOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  38 */     if (entity == null) {
/*     */       return;
/*     */     }
/*     */     
/*  42 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/*  43 */       if (Math.random() < 0.5D) {
/*     */ 
/*     */         
/*  46 */         if (world instanceof ServerLevel) { ServerLevel lv = (ServerLevel)world;
/*  47 */           lv.sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE
/*  48 */               .get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  59 */         if (!entity.level().isClientSide()) {
/*  60 */           entity.discard();
/*     */         }
/*  62 */         if (world instanceof Level) { Level _level = (Level)world;
/*  63 */           if (!_level.isClientSide()) {
/*  64 */             _level.playSound(null, 
/*     */                 
/*  66 */                 BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  67 */                 .get(TBSConstants.id("textmadness1")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */             
/*  73 */             _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                 
/*  77 */                 .get(TBSConstants.id("textmadness1")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         LivingEntity _entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         Entity entity2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 103 */         if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity && 
/* 104 */           !(_entity = (LivingEntity)entity2).level().isClientSide()) {
/* 105 */           _entity.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 60, 1));
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 121 */         if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof LivingEntity) {
/*     */           
/* 123 */           _entity = (LivingEntity)entity2;
/* 124 */           _entity.setHealth(Mth.nextInt(RandomSource.create(), 1, 10));
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 144 */         Entity entity1 = entity2 = 
/* 145 */           world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null); if (entity1 instanceof ServerPlayer) { ServerPlayer _player = (ServerPlayer)entity1; if (!_player.level().isClientSide()) {
/* 146 */             ResourceKey destinationType = ResourceKey.create(Registries.DIMENSION, 
/*     */                 
/* 148 */                 TBSConstants.id("day_a"));
/*     */             
/* 150 */             if (_player.level().dimension() == destinationType) {
/*     */               return;
/*     */             }
/* 153 */             ServerLevel nextLevel = _player.server.getLevel(destinationType);
/* 154 */             if (nextLevel != null) {
/* 155 */               _player.connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/*     */ 
/*     */ 
/*     */               
/* 159 */               _player.teleportTo(nextLevel, _player
/*     */                   
/* 161 */                   .getX(), _player
/* 162 */                   .getY(), _player
/* 163 */                   .getZ(), _player
/* 164 */                   .getYRot(), _player
/* 165 */                   .getXRot());
/*     */               
/* 167 */               _player.connection.send((Packet)new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
/* 168 */               for (MobEffectInstance _effectinstance : _player.getActiveEffects()) {
/* 169 */                 _player.connection.send((Packet)new ClientboundUpdateMobEffectPacket(_player
/* 170 */                       .getId(), _effectinstance, false));
/*     */               }
/*     */ 
/*     */ 
/*     */               
/* 175 */               _player.connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*     */             }
/*     */           
/*     */           }
/*     */            }
/*     */ 
/*     */       
/*     */       }
/*     */       else {
/*     */         
/* 185 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 186 */           _level = (ServerLevel)world;
/* 187 */           _level.sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE
/* 188 */               .get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 199 */         if (!entity.level().isClientSide()) {
/* 200 */           entity.discard();
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 216 */         Entity destinationType = 
/* 217 */           world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null), entity1 = destinationType; if (entity1 instanceof Player) { Player _player = (Player)entity1;
/* 218 */           _player = (Player)destinationType;
/* 219 */           ItemStack _setstack = (new ItemStack((ItemLike)TBSItems.N.get())).copy();
/* 220 */           _setstack.setCount(1);
/* 221 */           ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 236 */         Entity _ent = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 237 */         _ent.teleportTo(x, y, z);
/* 238 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 239 */           _serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot()); }
/*     */       
/*     */       } 
/*     */     }
/* 243 */     entity.getPersistentData().putDouble("timer", entity.getPersistentData().getDouble("timer") + 1.0D);
/* 244 */     if (entity.getPersistentData().getDouble("timer") == 20.0D) {
/* 245 */       entity.getPersistentData().putDouble("timer", 0.0D);
/* 246 */       if (Math.random() < 0.5D) {
/* 247 */         world.setBlock(
/* 248 */             BlockPos.containing(x + 
/* 249 */               Mth.nextInt(RandomSource.create(), 0, 3), y + 
/* 250 */               Mth.nextInt(RandomSource.create(), 0, 3), z + 
/* 251 */               Mth.nextInt(RandomSource.create(), 0, 3)), ((Block)TBSBlocks.DISRUPTION
/* 252 */             .get()).defaultBlockState(), 3);
/*     */       } else {
/*     */         
/* 255 */         world.setBlock(
/* 256 */             BlockPos.containing(x - 
/* 257 */               Mth.nextInt(RandomSource.create(), 0, 3), y - 
/* 258 */               Mth.nextInt(RandomSource.create(), 0, 3), z - 
/* 259 */               Mth.nextInt(RandomSource.create(), 0, 3)), ((Block)TBSBlocks.DISRUPTION
/* 260 */             .get()).defaultBlockState(), 3);
/*     */       } 
/*     */     } 
/*     */     Level _lvl29;
/* 264 */     if (world instanceof Level && (_lvl29 = (Level)world).isDay() && !entity.level().isClientSide())
/* 265 */       entity.discard(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\FollowOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */