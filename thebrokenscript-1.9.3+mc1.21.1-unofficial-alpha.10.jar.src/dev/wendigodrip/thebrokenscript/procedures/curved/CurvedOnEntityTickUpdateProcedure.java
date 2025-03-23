/*     */ package dev.wendigodrip.thebrokenscript.procedures.curved;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.entity.CurvedEntity;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSParticleTypes;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.client.Minecraft;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.network.syncher.SynchedEntityData;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.GameType;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class CurvedOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*     */     int n;
/*  31 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  34 */     if (world instanceof Level) { Level _level = (Level)world;
/*  35 */       if (!_level.isClientSide()) {
/*  36 */         _level.playSound(null, 
/*     */             
/*  38 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  39 */             .get(TBSConstants.id("curved_spawn")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/*  45 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */             
/*  49 */             .get(TBSConstants.id("curved_spawn")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  57 */     if (entity instanceof CurvedEntity) { int n2; CurvedEntity _datEntSetI = (CurvedEntity)entity;
/*     */       
/*  59 */       SynchedEntityData synchedEntityData = _datEntSetI.getEntityData();
/*  60 */       if (entity instanceof CurvedEntity) { CurvedEntity _datEntI = (CurvedEntity)entity;
/*  61 */         n2 = ((Integer)_datEntI.getEntityData().get(CurvedEntity.DATA_despawntimer)).intValue(); }
/*     */       else
/*  63 */       { n2 = 0; }
/*     */       
/*  65 */       synchedEntityData.set(CurvedEntity.DATA_despawntimer, Integer.valueOf(n2 + 1)); }
/*     */     
/*  67 */     int horizontalRadiusSquare = 2;
/*  68 */     int verticalRadiusSquare = 2, yIterationsSquare = verticalRadiusSquare;
/*  69 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/*  70 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/*  71 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/*  72 */           if (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  77 */             .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/*  78 */             BlockPos _pos = BlockPos.containing(x + xi, y + i, z + zi);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  83 */             Block.dropResources(world
/*  84 */                 .getBlockState(_pos), world, 
/*     */                 
/*  86 */                 BlockPos.containing(x + xi, y + i, z + zi), null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  93 */             world.destroyBlock(_pos, false);
/*     */           } 
/*     */         } 
/*     */       } 
/*  97 */     }  if (entity instanceof CurvedEntity) { CurvedEntity _datEntI = (CurvedEntity)entity;
/*  98 */       n = ((Integer)_datEntI.getEntityData().get(CurvedEntity.DATA_despawntimer)).intValue(); }
/*     */     else
/* 100 */     { n = 0; }
/*     */     
/* 102 */     if (n > 1200) {
/* 103 */       if (!entity.level().isClientSide()) {
/* 104 */         entity.discard();
/*     */       }
/* 106 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 107 */         _level.sendParticles((ParticleOptions)TBSParticleTypes.PARTICLE_OF_CURVED
/* 108 */             .get(), x, y, z, 55, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */     
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     if (Math.random() < 0.001D) {
/* 121 */       Entity _ent = entity;
/* 122 */       _ent.teleportTo(entity
/* 123 */           .level()
/* 124 */           .clip(new ClipContext(entity
/* 125 */               .getEyePosition(1.0F), entity
/* 126 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 131 */           .getBlockPos()
/* 132 */           .getX(), y, entity
/*     */           
/* 134 */           .level()
/* 135 */           .clip(new ClipContext(entity
/* 136 */               .getEyePosition(1.0F), entity
/* 137 */               .getEyePosition(1.0F)
/* 138 */               .add(entity.getViewVector(1.0F).scale(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 143 */           .getBlockPos()
/* 144 */           .getZ());
/*     */       
/* 146 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 147 */         _serverPlayer.connection.teleport(entity
/* 148 */             .level()
/* 149 */             .clip(new ClipContext(entity
/* 150 */                 .getEyePosition(1.0F), entity
/* 151 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 156 */             .getBlockPos()
/* 157 */             .getX(), y, entity
/*     */             
/* 159 */             .level()
/* 160 */             .clip(new ClipContext(entity
/* 161 */                 .getEyePosition(1.0F), entity
/* 162 */                 .getEyePosition(1.0F)
/* 163 */                 .add(entity.getViewVector(1.0F)
/* 164 */                   .scale(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 169 */             .getBlockPos()
/* 170 */             .getZ(), _ent
/* 171 */             .getYRot(), _ent
/* 172 */             .getXRot()); }
/*     */     
/*     */     } 
/*     */     
/* 176 */     if (world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
/* 177 */       Entity _ent = entity;
/* 178 */       _ent.teleportTo(x, y + 1.0D, z);
/* 179 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 180 */         _serverPlayer.connection.teleport(x, y + 1.0D, z, _ent.getYRot(), _ent.getXRot()); }
/*     */     
/*     */     } 
/* 183 */     if ((new Object()
/*     */       {
/*     */         public boolean checkGamemode(Entity _ent) {
/* 186 */           if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 187 */             return (_serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE); }
/*     */           
/* 189 */           if (_ent.level().isClientSide() && _ent instanceof Player) { Player _player = (Player)_ent;
/* 190 */             if (Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null)
/*     */             {
/* 192 */               if (Minecraft.getInstance()
/* 193 */                 .getConnection()
/* 194 */                 .getPlayerInfo(_player.getGameProfile().getId())
/* 195 */                 .getGameMode() == GameType.CREATIVE); }  return false; }
/*     */           
/* 197 */           return false;
/*     */         }
/* 199 */       }).checkGamemode(world.getEntitiesOfClass(Player.class, 
/*     */           
/* 201 */           AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 208 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 211 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/* 213 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)) && !entity.level().isClientSide())
/* 214 */       entity.discard(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\curved\CurvedOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */