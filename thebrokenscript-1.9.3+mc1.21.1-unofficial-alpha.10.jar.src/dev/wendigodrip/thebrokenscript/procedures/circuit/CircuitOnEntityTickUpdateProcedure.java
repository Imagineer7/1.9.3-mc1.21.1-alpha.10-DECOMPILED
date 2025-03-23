/*     */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import dev.wendigodrip.thebrokenscript.util.TimeOfDay;
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*     */ import java.util.Comparator;
/*     */ import java.util.Map;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.entity.vehicle.Boat;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ public class CircuitOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  38 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  41 */     double heights = 0.0D;
/*  42 */     heights = Mth.nextInt(RandomSource.create(), 1, 5);
/*  43 */     entity.getPersistentData().putDouble("a", entity.getPersistentData().getDouble("a") + 1.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  53 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1450.0D, 1450.0D, 1450.0D), e -> true).isEmpty() && entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  68 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1500.0D, 1500.0D, 1500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*  69 */       if (entity2 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity2;
/*  70 */         _entity.setTarget(_ent); }
/*     */        }
/*     */     
/*  73 */     if (world.getBlockState(BlockPos.containing(x + 1.0D, heights, z))
/*  74 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/*  75 */       BlockPos _pos = BlockPos.containing(x + 1.0D, heights, z);
/*  76 */       Block.dropResources(world
/*  77 */           .getBlockState(_pos), world, 
/*     */           
/*  79 */           BlockPos.containing(x + 1.0D, heights, z), null);
/*     */ 
/*     */       
/*  82 */       world.destroyBlock(_pos, false);
/*     */     } 
/*  84 */     if (world.getBlockState(BlockPos.containing(x - 1.0D, heights, z))
/*  85 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/*  86 */       BlockPos _pos = BlockPos.containing(x - 1.0D, heights, z);
/*  87 */       Block.dropResources(world
/*  88 */           .getBlockState(_pos), world, 
/*     */           
/*  90 */           BlockPos.containing(x - 1.0D, heights, z), null);
/*     */ 
/*     */       
/*  93 */       world.destroyBlock(_pos, false);
/*     */     } 
/*  95 */     if (world.getBlockState(BlockPos.containing(x, heights, z + 1.0D))
/*  96 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/*  97 */       BlockPos _pos = BlockPos.containing(x, heights, z + 1.0D);
/*  98 */       Block.dropResources(world
/*  99 */           .getBlockState(_pos), world, 
/*     */           
/* 101 */           BlockPos.containing(x, heights, z + 1.0D), null);
/*     */ 
/*     */       
/* 104 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 106 */     if (world.getBlockState(BlockPos.containing(x, heights, z - 1.0D))
/* 107 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 108 */       BlockPos _pos = BlockPos.containing(x, heights, z - 1.0D);
/* 109 */       Block.dropResources(world
/* 110 */           .getBlockState(_pos), world, 
/*     */           
/* 112 */           BlockPos.containing(x, heights, z - 1.0D), null);
/*     */ 
/*     */       
/* 115 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 117 */     if (entity.getPersistentData().getDouble("a") > 45.0D) {
/*     */ 
/*     */       
/* 120 */       entity.getPersistentData().putDouble("a", 0.0D);
/* 121 */       MapVariables.get(world).setNoWayOutFrame(MapVariables.get(world).getNoWayOutFrame() + 1.0D);
/* 122 */       MapVariables.get(world).syncData(world);
/* 123 */       if (world instanceof Level) {
/* 124 */         Level _level = (Level)world;
/* 125 */         if (!_level.isClientSide()) {
/* 126 */           _level.playSound(null, 
/*     */               
/* 128 */               BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 129 */               .get(TBSConstants.id("nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 0.5F);
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/* 135 */           _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */               
/* 139 */               .get(TBSConstants.id("nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 0.5F, false);
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 147 */       if (world instanceof ServerLevel) {
/* 148 */         ServerLevel serverLevel = (ServerLevel)world;
/* 149 */         Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT_JUMPSCARE_FRAME_ENTITY.get()).spawn(serverLevel, 
/*     */             
/* 151 */             BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 158 */         if (entityToSpawn != null) {
/* 159 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */         }
/*     */       } 
/* 162 */       if (Math.random() < 0.7D) {
/* 163 */         ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 165 */             AABB.ofSize(new Vec3(x, y, z), 1500.0D, 1500.0D, 1500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 172 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 175 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 177 */             }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 178 */           .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 5.0D, z));
/*     */       }
/* 180 */       if (Math.random() < 0.7D) {
/* 181 */         if (world instanceof ServerLevel) {
/* 182 */           TimeOfDay.MIDNIGHT.set(world);
/*     */         }
/* 184 */         if (world instanceof ServerLevel) {
/* 185 */           ServerLevel serverLevel = (ServerLevel)world;
/* 186 */           Entity entityToSpawn = ((EntityType)TBSEntities.JFRAME_1ENTITY.get()).spawn(serverLevel, 
/*     */               
/* 188 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 195 */           if (entityToSpawn != null) {
/* 196 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           }
/*     */         } 
/*     */       } 
/* 200 */       if (Math.random() < 0.7D) {
/* 201 */         if (world instanceof ServerLevel) {
/* 202 */           TimeOfDay.DAY.set(world);
/*     */         }
/* 204 */         if (world instanceof ServerLevel) {
/* 205 */           ServerLevel serverLevel = (ServerLevel)world;
/* 206 */           Entity entityToSpawn = ((EntityType)TBSEntities.JFRAME_2ENTITY.get()).spawn(serverLevel, 
/*     */               
/* 208 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 215 */           if (entityToSpawn != null) {
/* 216 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           }
/*     */         } 
/*     */       } 
/* 220 */       if (Math.random() < 0.7D && world instanceof ServerLevel) {
/* 221 */         TimeOfDay.DAY.set(world);
/*     */       }
/*     */     } 
/* 224 */     int horizontalRadiusSquare = 2;
/* 225 */     int verticalRadiusSquare = 2, yIterationsSquare = verticalRadiusSquare;
/* 226 */     for (int i = -yIterationsSquare; i <= yIterationsSquare; i++) {
/* 227 */       for (int xi = -horizontalRadiusSquare; xi <= horizontalRadiusSquare; xi++) {
/* 228 */         for (int zi = -horizontalRadiusSquare; zi <= horizontalRadiusSquare; zi++) {
/* 229 */           if (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))
/*     */ 
/*     */ 
/*     */             
/* 233 */             .is(BlockTags.create(TBSConstants.id("wa")))) {
/* 234 */             BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 239 */             BlockState _bs = Blocks.COBBLESTONE.defaultBlockState();
/* 240 */             BlockState _bso = world.getBlockState(_bp);
/* 241 */             for (Map.Entry entry : _bso.getValues().entrySet()) {
/*     */ 
/*     */               
/* 244 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 245 */               if (_property == null || _bs.getValue(_property) == null)
/*     */                 continue;  try {
/* 247 */                 _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
/* 248 */               } catch (Exception exception) {}
/*     */             } 
/*     */             
/* 251 */             world.setBlock(_bp, _bs, 3);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 264 */     if (!world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty())
/*     */     {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 278 */       if (!((Boat)world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
/* 279 */         ((Boat)world.getEntitiesOfClass(Boat.class, 
/*     */             
/* 281 */             AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 288 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 291 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 293 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard(); 
/*     */     }
/* 295 */     if (Math.random() < 0.01D) {
/* 296 */       MapVariables.get(world).setNoWayOutFrame(MapVariables.get(world).getNoWayOutFrame() + 1.0D);
/* 297 */       MapVariables.get(world).syncData(world);
/*     */     } 
/* 299 */     if (MapVariables.get(world).getNoWayOutFrame() > 6.0D) {
/* 300 */       MapVariables.get(world).setNoWayOutFrame(0.0D);
/* 301 */       MapVariables.get(world).syncData(world);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */