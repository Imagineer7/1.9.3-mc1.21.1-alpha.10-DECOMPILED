/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.effect.MobEffectInstance;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class NullMiningOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  25 */     if (entity == null) {
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
/*  37 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).isEmpty() && entity instanceof Mob) {
/*  38 */       Mob _entity = (Mob)entity;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  53 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*  54 */       if (entity2 instanceof LivingEntity) { LivingEntity _ent2 = (LivingEntity)entity2;
/*  55 */         _entity.setTarget(_ent2); }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  91 */     BlockPos _pos = new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), entity.level().clip(new ClipContext(entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(), entity.level().clip(new ClipContext(entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ());
/*     */     
/*  93 */     Block.dropResources(world
/*  94 */         .getBlockState(_pos), world, new BlockPos(entity
/*     */ 
/*     */           
/*  97 */           .level()
/*  98 */           .clip(new ClipContext(entity
/*  99 */               .getEyePosition(1.0F), entity
/* 100 */               .getEyePosition(1.0F)
/* 101 */               .add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 106 */           .getBlockPos()
/* 107 */           .getX(), entity
/* 108 */           .level()
/* 109 */           .clip(new ClipContext(entity
/* 110 */               .getEyePosition(1.0F), entity
/* 111 */               .getEyePosition(1.0F)
/* 112 */               .add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 117 */           .getBlockPos()
/* 118 */           .getY(), entity
/* 119 */           .level()
/* 120 */           .clip(new ClipContext(entity
/* 121 */               .getEyePosition(1.0F), entity
/* 122 */               .getEyePosition(1.0F)
/* 123 */               .add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 128 */           .getBlockPos()
/* 129 */           .getZ()), null);
/*     */ 
/*     */ 
/*     */     
/* 133 */     world.destroyBlock(_pos, false);
/* 134 */     _pos = BlockPos.containing(entity
/* 135 */         .level()
/* 136 */         .clip(new ClipContext(entity
/* 137 */             .getEyePosition(1.0F), entity
/* 138 */             .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 143 */         .getBlockPos()
/* 144 */         .getX(), (entity
/* 145 */         .level()
/* 146 */         .clip(new ClipContext(entity
/* 147 */             .getEyePosition(1.0F), entity
/* 148 */             .getEyePosition(1.0F)
/* 149 */             .add(entity.getViewVector(1.0F)
/* 150 */               .scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 155 */         .getBlockPos()
/* 156 */         .getY() - 1), entity
/* 157 */         .level()
/* 158 */         .clip(new ClipContext(entity
/* 159 */             .getEyePosition(1.0F), entity
/* 160 */             .getEyePosition(1.0F)
/* 161 */             .add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 166 */         .getBlockPos()
/* 167 */         .getZ());
/*     */     
/* 169 */     Block.dropResources(world
/* 170 */         .getBlockState(_pos), world, new BlockPos(entity
/*     */ 
/*     */           
/* 173 */           .level()
/* 174 */           .clip(new ClipContext(entity
/* 175 */               .getEyePosition(1.0F), entity
/* 176 */               .getEyePosition(1.0F)
/* 177 */               .add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 182 */           .getBlockPos()
/* 183 */           .getX(), entity
/* 184 */           .level()
/* 185 */           .clip(new ClipContext(entity
/* 186 */               .getEyePosition(1.0F), entity
/* 187 */               .getEyePosition(1.0F)
/* 188 */               .add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 193 */           .getBlockPos()
/* 194 */           .getY(), entity
/* 195 */           .level()
/* 196 */           .clip(new ClipContext(entity
/* 197 */               .getEyePosition(1.0F), entity
/* 198 */               .getEyePosition(1.0F)
/* 199 */               .add(entity.getViewVector(1.0F).scale(1.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 204 */           .getBlockPos()
/* 205 */           .getZ()), null);
/*     */ 
/*     */ 
/*     */     
/* 209 */     world.destroyBlock(_pos, false);
/* 210 */     Vec3 vec3 = new Vec3(x, y, z);
/* 211 */     Object object1 = new Object()
/*     */       {
/*     */         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 214 */           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */         }
/*     */       };
/* 217 */     if (y > ((Player)world
/* 218 */       .getEntitiesOfClass(Player.class, 
/*     */         
/* 220 */         AABB.ofSize(vec3, 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */       
/* 222 */       .stream().sorted(object1.compareDistOf(x, y, z)).findFirst().orElse(null)).getY()) {
/* 223 */       world.setBlock(
/* 224 */           BlockPos.containing(x, y - 1.0D, z), Blocks.AIR
/* 225 */           .defaultBlockState(), 3);
/*     */ 
/*     */       
/* 228 */       Entity _ent = entity;
/* 229 */       _ent.teleportTo(x, y - 1.0D, z);
/* 230 */       if (_ent instanceof ServerPlayer) {
/* 231 */         ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 232 */         _serverPlayer.connection.teleport(x, y - 1.0D, z, _ent.getYRot(), _ent.getXRot());
/*     */       }  Mob _entity;
/* 234 */       if (entity instanceof LivingEntity && !(_entity = (Mob)entity).level().isClientSide()) {
/* 235 */         _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 21, 55, false, false));
/*     */       }
/*     */     } 
/* 238 */     Vec3 vec32 = new Vec3(x, y, z);
/* 239 */     Object object2 = new Object()
/*     */       {
/*     */         Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 242 */           return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */         }
/*     */       };
/* 245 */     if (y < ((Player)world
/* 246 */       .getEntitiesOfClass(Player.class, 
/*     */         
/* 248 */         AABB.ofSize(vec32, 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */       
/* 250 */       .stream().sorted(object2.compareDistOf(x, y, z)).findFirst().orElse(null)).getY() && Math.random() < 0.01D) {
/* 251 */       world.setBlock(
/* 252 */           BlockPos.containing(x, y, z), Blocks.COBBLESTONE
/* 253 */           .defaultBlockState(), 3);
/*     */ 
/*     */       
/* 256 */       world.setBlock(
/* 257 */           BlockPos.containing(x, y + 1.0D, z), Blocks.AIR
/* 258 */           .defaultBlockState(), 3);
/*     */ 
/*     */       
/* 261 */       Entity _ent = entity;
/* 262 */       _ent.teleportTo(x, y + 1.0D, z);
/* 263 */       if (_ent instanceof ServerPlayer) {
/* 264 */         ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 265 */         _serverPlayer.connection.teleport(x, y + 1.0D, z, _ent.getYRot(), _ent.getXRot());
/*     */       }  Mob _entity;
/* 267 */       if (entity instanceof LivingEntity && !(_entity = (Mob)entity).level().isClientSide())
/* 268 */         _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 21, 55, false, false)); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullMiningOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */