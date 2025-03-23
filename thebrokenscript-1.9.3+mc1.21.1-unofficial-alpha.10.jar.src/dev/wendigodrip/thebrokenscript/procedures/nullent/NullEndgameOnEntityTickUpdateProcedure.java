/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NullEndgameOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  18 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  21 */     Entity _ent = entity;
/*  22 */     _ent.teleportTo(entity
/*  23 */         .level()
/*  24 */         .clip(new ClipContext(entity
/*  25 */             .getEyePosition(1.0F), entity
/*  26 */             .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.01D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  31 */         .getBlockPos()
/*  32 */         .getX(), entity
/*  33 */         .level()
/*  34 */         .clip(new ClipContext(entity
/*  35 */             .getEyePosition(1.0F), entity
/*  36 */             .getEyePosition(1.0F)
/*  37 */             .add(entity.getViewVector(1.0F).scale(0.01D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  42 */         .getBlockPos()
/*  43 */         .getY(), entity
/*  44 */         .level()
/*  45 */         .clip(new ClipContext(entity
/*  46 */             .getEyePosition(1.0F), entity
/*  47 */             .getEyePosition(1.0F)
/*  48 */             .add(entity.getViewVector(1.0F).scale(0.01D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  53 */         .getBlockPos()
/*  54 */         .getZ());
/*     */     
/*  56 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/*  57 */       _serverPlayer.connection.teleport(entity
/*  58 */           .level()
/*  59 */           .clip(new ClipContext(entity
/*  60 */               .getEyePosition(1.0F), entity
/*  61 */               .getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.01D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  66 */           .getBlockPos()
/*  67 */           .getX(), entity
/*  68 */           .level()
/*  69 */           .clip(new ClipContext(entity
/*  70 */               .getEyePosition(1.0F), entity
/*  71 */               .getEyePosition(1.0F)
/*  72 */               .add(entity.getViewVector(1.0F)
/*  73 */                 .scale(0.01D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  78 */           .getBlockPos()
/*  79 */           .getY(), entity
/*  80 */           .level()
/*  81 */           .clip(new ClipContext(entity
/*  82 */               .getEyePosition(1.0F), entity
/*  83 */               .getEyePosition(1.0F)
/*  84 */               .add(entity.getViewVector(1.0F)
/*  85 */                 .scale(0.01D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  90 */           .getBlockPos()
/*  91 */           .getZ(), _ent
/*  92 */           .getYRot(), _ent
/*  93 */           .getXRot()); }
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
/* 105 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/* 106 */       entity.hurt(new DamageSource((Holder)world
/* 107 */             .registryAccess()
/* 108 */             .registryOrThrow(Registries.DAMAGE_TYPE)
/* 109 */             .getHolderOrThrow(DamageTypes.GENERIC)), 1.0F);
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
/* 120 */       if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), e -> true).isEmpty()) {
/* 121 */         if (!entity.level().isClientSide()) {
/* 122 */           entity.discard();
/*     */         }
/* 124 */         entity.hurt(new DamageSource((Holder)world
/* 125 */               .registryAccess()
/* 126 */               .registryOrThrow(Registries.DAMAGE_TYPE)
/* 127 */               .getHolderOrThrow(DamageTypes.GENERIC)), 20.0F);
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
/* 164 */     BlockPos _pos = new BlockPos(entity.level().clip(new ClipContext(entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX(), entity.level().clip(new ClipContext(entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY(), entity.level().clip(new ClipContext(entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.1D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ());
/*     */     
/* 166 */     Block.dropResources(world
/* 167 */         .getBlockState(_pos), world, 
/*     */         
/* 169 */         BlockPos.containing(x, y, z), null);
/*     */ 
/*     */     
/* 172 */     world.destroyBlock(_pos, false);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullEndgameOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */