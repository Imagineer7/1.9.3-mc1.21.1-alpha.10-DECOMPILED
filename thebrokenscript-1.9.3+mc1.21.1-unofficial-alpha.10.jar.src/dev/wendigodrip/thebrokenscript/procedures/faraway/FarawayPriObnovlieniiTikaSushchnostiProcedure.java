/*     */ package dev.wendigodrip.thebrokenscript.procedures.faraway;
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
/*     */ public class FarawayPriObnovlieniiTikaSushchnostiProcedure {
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
/*  37 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 50.0D, 50.0D, 50.0D), e -> true).isEmpty()) {
/*     */       
/*  39 */       if (!entity.level().isClientSide()) {
/*  40 */         entity.discard();
/*     */       }
/*  42 */       ((Player)world.getEntitiesOfClass(Player.class, 
/*     */           
/*  44 */           AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  51 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  54 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/*  56 */           }).compareDistOf(x, y, z)).findFirst().orElse(null))
/*  57 */         .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/*  58 */       if (world instanceof Level) {
/*  59 */         Level _level = (Level)world;
/*  60 */         if (!_level.isClientSide()) {
/*  61 */           _level.playSound(null, 
/*     */               
/*  63 */               BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  64 */               .get(TBSConstants.id("nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*     */         
/*     */         }
/*     */         else {
/*     */ 
/*     */           
/*  70 */           _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */               
/*  74 */               .get(TBSConstants.id("nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */         } 
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  82 */       if (world instanceof ServerLevel) {
/*  83 */         ServerLevel serverLevel = (ServerLevel)world;
/*  84 */         Entity entityToSpawn = ((EntityType)TBSEntities.JUMPOSCROOOO.get()).spawn(serverLevel, 
/*     */             
/*  86 */             BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  93 */         if (entityToSpawn != null) {
/*  94 */           entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */         }
/*     */       } 
/*  97 */       if (Math.random() < 0.5D) {
/*  98 */         if (world instanceof ServerLevel) {
/*  99 */           ServerLevel serverLevel = (ServerLevel)world;
/* 100 */           serverLevel.sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE
/* 101 */               .get(), x, y, z, 555, 2.0D, 2.0D, 2.0D, 0.0D);
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       }
/* 112 */       else if (world instanceof ServerLevel) {
/* 113 */         ServerLevel serverLevel = (ServerLevel)world;
/* 114 */         serverLevel.sendParticles((ParticleOptions)TBSParticleTypes.EYES
/* 115 */             .get(), x, y, z, 555, 2.0D, 2.0D, 2.0D, 0.0D);
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
/* 136 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), e -> true).isEmpty())
/* 137 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/* 139 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 141 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 148 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 151 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 157 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 159 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 166 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 169 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 175 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + 1.0D, ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 177 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 184 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 187 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 193 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\faraway\FarawayPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */