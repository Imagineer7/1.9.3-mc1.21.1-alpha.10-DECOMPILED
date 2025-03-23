/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NullScarePriNachalnomPrizyvieSushchnostiProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  29 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  32 */     if (TBSConfigs.COMMON != null && !TBSConfigs.COMMON.disableRandomJumpscares) {
/*  33 */       if (Math.random() < 0.9D) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  43 */         if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 450.0D, 450.0D, 450.0D), e -> true).isEmpty()) {
/*  44 */           entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */                 
/*  46 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/*  48 */                   AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  55 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  58 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/*  64 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */                   
/*  66 */                   AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  73 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  76 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/*  82 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */                   
/*  84 */                   AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  91 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  94 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 100 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*     */ 
/*     */           
/* 103 */           ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 105 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 112 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 115 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 117 */               }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 118 */             .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/* 119 */           if (world instanceof Level) { Level _level = (Level)world;
/* 120 */             if (!_level.isClientSide()) {
/* 121 */               _level.playSound(null, 
/*     */                   
/* 123 */                   BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 124 */                   .get(TBSConstants.id("nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */             
/*     */             }
/*     */             else {
/*     */ 
/*     */               
/* 130 */               _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                   
/* 134 */                   .get(TBSConstants.id("nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */             }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 142 */           Vec3 _center = new Vec3(x, y, z);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 147 */           List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, (new AABB(_center, _center)).inflate(10.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
/* 148 */           for (Entity entityiterator : _entfound) {
/* 149 */             entityiterator.hurt(new DamageSource((Holder)world
/* 150 */                   .registryAccess()
/* 151 */                   .registryOrThrow(Registries.DAMAGE_TYPE)
/* 152 */                   .getHolderOrThrow(DamageTypes.GENERIC)), 5.0F);
/*     */           }
/*     */         } 
/*     */         
/* 156 */         TheBrokenScript.queueServerWork(10, () -> {
/*     */ 
/*     */               
/*     */               if (!entity.level().isClientSide()) {
/*     */                 entity.discard();
/*     */               }
/*     */             });
/*     */       } else {
/* 164 */         if (!entity.level().isClientSide()) {
/* 165 */           entity.discard();
/*     */         }
/* 167 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 168 */           Entity entityToSpawn = ((EntityType)TBSEntities.NULL_ENDGAME.get()).spawn(_level, 
/*     */               
/* 170 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 177 */           if (entityToSpawn != null) {
/* 178 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           } }
/*     */       
/*     */       } 
/* 182 */     } else if (!entity.level().isClientSide()) {
/* 183 */       entity.discard();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullScarePriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */