/*     */ package dev.wendigodrip.thebrokenscript.procedures.siluet;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.util.TimeOfDay;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SiluetChasePriObnovlieniiTikaSushchnostiProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  31 */     if (entity == null) {
/*     */       return;
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
/*  43 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 820.0D, 820.0D, 820.0D), e -> true).isEmpty()) {
/*  44 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/*  46 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  48 */               AABB.ofSize(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  55 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  58 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  64 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/*  66 */               AABB.ofSize(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  73 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  76 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  82 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/*  84 */               AABB.ofSize(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  91 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  94 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 100 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*     */ 
/*     */       
/* 103 */       if (entity instanceof Mob) { Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 118 */         Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 119 */         if (entity2 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity2;
/* 120 */           _entity.setTarget(_ent); }
/*     */          }
/*     */     
/*     */     } 
/* 124 */     if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).getBlock() == Blocks.WATER) {
/*     */       
/* 126 */       Entity _ent = entity;
/* 127 */       _ent.teleportTo(entity
/* 128 */           .level()
/* 129 */           .clip(new ClipContext(entity
/* 130 */               .getEyePosition(1.0F), entity
/* 131 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 136 */           .getBlockPos()
/* 137 */           .getX(), entity
/* 138 */           .level()
/* 139 */           .clip(new ClipContext(entity
/* 140 */               .getEyePosition(1.0F), entity
/* 141 */               .getEyePosition(1.0F)
/* 142 */               .add(entity.getViewVector(1.0F).scale(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 147 */           .getBlockPos()
/* 148 */           .getY(), entity
/* 149 */           .level()
/* 150 */           .clip(new ClipContext(entity
/* 151 */               .getEyePosition(1.0F), entity
/* 152 */               .getEyePosition(1.0F)
/* 153 */               .add(entity.getViewVector(1.0F).scale(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 158 */           .getBlockPos()
/* 159 */           .getZ());
/*     */       
/* 161 */       if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 162 */         _serverPlayer.connection.teleport(entity
/* 163 */             .level()
/* 164 */             .clip(new ClipContext(entity
/* 165 */                 .getEyePosition(1.0F), entity
/* 166 */                 .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 171 */             .getBlockPos()
/* 172 */             .getX(), entity
/* 173 */             .level()
/* 174 */             .clip(new ClipContext(entity
/* 175 */                 .getEyePosition(1.0F), entity
/* 176 */                 .getEyePosition(1.0F)
/* 177 */                 .add(entity.getViewVector(1.0F)
/* 178 */                   .scale(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 183 */             .getBlockPos()
/* 184 */             .getY(), entity
/* 185 */             .level()
/* 186 */             .clip(new ClipContext(entity
/* 187 */                 .getEyePosition(1.0F), entity
/* 188 */                 .getEyePosition(1.0F)
/* 189 */                 .add(entity.getViewVector(1.0F)
/* 190 */                   .scale(0.2D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 195 */             .getBlockPos()
/* 196 */             .getZ(), _ent
/* 197 */             .getYRot(), _ent
/* 198 */             .getXRot()); }
/*     */     
/*     */     } 
/*     */     
/* 202 */     if (Math.random() < 0.01D && world instanceof ServerLevel) {
/* 203 */       TimeOfDay.MIDNIGHT.set(world);
/*     */     }
/* 205 */     if (Math.random() < 0.01D && world instanceof ServerLevel) {
/* 206 */       TimeOfDay.DAY.set(world);
/*     */     }
/* 208 */     if (world instanceof ServerLevel) {
/* 209 */       ServerLevel _level = (ServerLevel)world;
/* 210 */       _level.getServer()
/* 211 */         .getCommands()
/* 212 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 220 */             (Component)Component.literal(""), _level
/* 221 */             .getServer(), null))
/*     */           
/* 223 */           .withSuppressedOutput(), "gamemode survival @a");
/*     */     } 
/*     */     
/* 226 */     if (world.getBlockState(BlockPos.containing(x + 1.0D, y, z))
/* 227 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 228 */       BlockPos _pos = BlockPos.containing(x + 1.0D, y, z);
/* 229 */       Block.dropResources(world
/* 230 */           .getBlockState(_pos), world, 
/*     */           
/* 232 */           BlockPos.containing(x + 1.0D, y, z), null);
/*     */ 
/*     */       
/* 235 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 237 */     if (world.getBlockState(BlockPos.containing(x - 1.0D, y, z))
/* 238 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 239 */       BlockPos _pos = BlockPos.containing(x - 1.0D, y, z);
/* 240 */       Block.dropResources(world
/* 241 */           .getBlockState(_pos), world, 
/*     */           
/* 243 */           BlockPos.containing(x - 1.0D, y, z), null);
/*     */ 
/*     */       
/* 246 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 248 */     if (world.getBlockState(BlockPos.containing(x, y, z + 1.0D))
/* 249 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 250 */       BlockPos _pos = BlockPos.containing(x, y, z + 1.0D);
/* 251 */       Block.dropResources(world
/* 252 */           .getBlockState(_pos), world, 
/*     */           
/* 254 */           BlockPos.containing(x, y, z + 1.0D), null);
/*     */ 
/*     */       
/* 257 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 259 */     if (world.getBlockState(BlockPos.containing(x, y, z - 1.0D))
/* 260 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 261 */       BlockPos _pos = BlockPos.containing(x, y, z - 1.0D);
/* 262 */       Block.dropResources(world
/* 263 */           .getBlockState(_pos), world, 
/*     */           
/* 265 */           BlockPos.containing(x, y, z - 1.0D), null);
/*     */ 
/*     */       
/* 268 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 270 */     if (world.getBlockState(BlockPos.containing(x + 1.0D, y + 1.0D, z))
/* 271 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 272 */       BlockPos _pos = BlockPos.containing(x + 1.0D, y + 1.0D, z);
/* 273 */       Block.dropResources(world
/* 274 */           .getBlockState(_pos), world, 
/*     */           
/* 276 */           BlockPos.containing(x + 1.0D, y + 1.0D, z), null);
/*     */ 
/*     */       
/* 279 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 281 */     if (world.getBlockState(BlockPos.containing(x - 1.0D, y + 1.0D, z))
/* 282 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 283 */       BlockPos _pos = BlockPos.containing(x + 1.0D, y + 1.0D, z);
/* 284 */       Block.dropResources(world
/* 285 */           .getBlockState(_pos), world, 
/*     */           
/* 287 */           BlockPos.containing(x + 1.0D, y + 1.0D, z), null);
/*     */ 
/*     */       
/* 290 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 292 */     if (world.getBlockState(BlockPos.containing(x, y + 1.0D, z + 1.0D))
/* 293 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 294 */       BlockPos _pos = BlockPos.containing(x, y + 1.0D, z + 1.0D);
/* 295 */       Block.dropResources(world
/* 296 */           .getBlockState(_pos), world, 
/*     */           
/* 298 */           BlockPos.containing(x, y + 1.0D, z + 1.0D), null);
/*     */ 
/*     */       
/* 301 */       world.destroyBlock(_pos, false);
/*     */     } 
/* 303 */     if (world.getBlockState(BlockPos.containing(x, y + 1.0D, z - 1.0D))
/* 304 */       .is(BlockTags.create(TBSConstants.id("circuitbreakable")))) {
/* 305 */       BlockPos _pos = BlockPos.containing(x, y + 1.0D, z - 1.0D);
/* 306 */       Block.dropResources(world
/* 307 */           .getBlockState(_pos), world, 
/*     */           
/* 309 */           BlockPos.containing(x, y + 1.0D, z - 1.0D), null);
/*     */ 
/*     */       
/* 312 */       world.destroyBlock(_pos, false);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\siluet\SiluetChasePriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */