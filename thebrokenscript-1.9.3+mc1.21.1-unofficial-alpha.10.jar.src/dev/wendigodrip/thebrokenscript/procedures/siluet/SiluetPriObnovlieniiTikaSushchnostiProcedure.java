/*     */ package dev.wendigodrip.thebrokenscript.procedures.siluet;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSParticleTypes;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class SiluetPriObnovlieniiTikaSushchnostiProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  26 */     if (entity == null) {
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
/*  38 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty()) {
/*  39 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/*  41 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  43 */               AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  50 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  53 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  59 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/*  61 */               AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  68 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  71 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  77 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/*  79 */               AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  86 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  89 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  95 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
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
/* 108 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty())
/* 109 */       if (Math.random() < 0.5D) {
/* 110 */         if (!entity.level().isClientSide()) {
/* 111 */           entity.discard();
/*     */         }
/* 113 */         ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 115 */             AABB.ofSize(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 122 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 125 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 127 */             }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 128 */           .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/* 129 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 130 */           Entity entityToSpawn = ((EntityType)TBSEntities.STRIKE.get()).spawn(_level, 
/*     */               
/* 132 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 139 */           if (entityToSpawn != null) {
/* 140 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           } }
/*     */         
/* 143 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 144 */           Entity entityToSpawn = ((EntityType)TBSEntities.SILUET_CHASE.get()).spawn(_level, 
/*     */               
/* 146 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 153 */           if (entityToSpawn != null) {
/* 154 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           } }
/*     */       
/*     */       } else {
/* 158 */         if (!entity.level().isClientSide()) {
/* 159 */           entity.discard();
/*     */         }
/* 161 */         ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 163 */             AABB.ofSize(new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 170 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 173 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 175 */             }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 176 */           .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/* 177 */         if (world instanceof Level) { Level _level = (Level)world;
/* 178 */           if (!_level.isClientSide()) {
/* 179 */             _level.playSound(null, 
/*     */                 
/* 181 */                 BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 182 */                 .get(TBSConstants.id("textmadness1")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */             
/* 188 */             _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                 
/* 192 */                 .get(TBSConstants.id("textmadness1")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 200 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 201 */           Entity entityToSpawn = ((EntityType)TBSEntities.CANT_YOU_SEE.get()).spawn(_level, 
/*     */               
/* 203 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 210 */           if (entityToSpawn != null) {
/* 211 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           } }
/*     */       
/*     */       }  
/*     */     Level _lvl19;
/* 216 */     if (world instanceof Level && (_lvl19 = (Level)world).isDay()) {
/* 217 */       if (!entity.level().isClientSide()) {
/* 218 */         entity.discard();
/*     */       }
/* 220 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 221 */         _level.sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE
/* 222 */             .get(), x, y, z, 50, 3.0D, 3.0D, 3.0D, 0.0D); }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\siluet\SiluetPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */