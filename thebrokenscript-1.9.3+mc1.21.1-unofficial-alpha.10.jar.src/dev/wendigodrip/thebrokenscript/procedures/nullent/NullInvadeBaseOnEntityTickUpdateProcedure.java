/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Vec3i;
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
/*     */ public class NullInvadeBaseOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  23 */     if (entity == null) {
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
/*  35 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 450.0D, 450.0D, 450.0D), e -> true).isEmpty()) {
/*  36 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/*  38 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  40 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  47 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  50 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  56 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/*  58 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  65 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  68 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  74 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/*  76 */               AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  83 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  86 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  92 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
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
/* 104 */       if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 15.0D, 15.0D, 15.0D), e -> true).isEmpty())
/* 105 */         if (Math.random() < 0.7D) {
/*     */ 
/*     */           
/* 108 */           if (!entity.level().isClientSide()) {
/* 109 */             entity.discard();
/*     */           }
/* 111 */           if (world instanceof ServerLevel) {
/* 112 */             ServerLevel _level = (ServerLevel)world;
/* 113 */             Entity entityToSpawn = ((EntityType)TBSEntities.WE_CAN_HEAR_U_OVERLAY.get()).spawn(_level, 
/*     */                 
/* 115 */                 BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */             
/* 118 */             if (entityToSpawn != null) {
/* 119 */               entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */             }
/*     */           } 
/* 122 */           if (world instanceof Level) { Level lv = (Level)world;
/* 123 */             if (!lv.isClientSide()) {
/* 124 */               lv.playSound(null, 
/*     */                   
/* 126 */                   BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 127 */                   .get(TBSConstants.id("textmadness1")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */             
/*     */             }
/*     */             else {
/*     */ 
/*     */               
/* 133 */               lv.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                   
/* 137 */                   .get(TBSConstants.id("textmadness1")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */             }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 145 */           if (world instanceof ServerLevel) {
/* 146 */             ServerLevel _level = (ServerLevel)world;
/* 147 */             Entity entityToSpawn = EntityType.LIGHTNING_BOLT.create((Level)_level);
/* 148 */             entityToSpawn.moveTo(Vec3.atBottomCenterOf((Vec3i)BlockPos.containing(x, y, z)));
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 153 */             _level.addFreshEntity(entityToSpawn);
/*     */           } 
/*     */         } else {
/* 156 */           if (!entity.level().isClientSide()) {
/* 157 */             entity.discard();
/*     */           }
/* 159 */           if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 160 */             Entity entityToSpawn = ((EntityType)TBSEntities.NULLL.get()).spawn(_level, 
/*     */                 
/* 162 */                 BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 169 */             if (entityToSpawn != null)
/* 170 */               entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);  }
/*     */         
/*     */         }  
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullInvadeBaseOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */