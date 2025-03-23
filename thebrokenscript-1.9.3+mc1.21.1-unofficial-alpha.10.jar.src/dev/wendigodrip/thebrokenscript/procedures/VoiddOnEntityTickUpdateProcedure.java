/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.tags.TagKey;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class VoiddOnEntityTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  32 */     if (entity == null) {
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
/*  44 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/*  45 */       if (Math.random() < 0.7D) {
/*  46 */         if (!entity.level().isClientSide()) {
/*  47 */           entity.discard();
/*     */         }
/*  49 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  50 */           Entity entityToSpawn = ((EntityType)TBSEntities.NULLL.get()).spawn(_level, 
/*     */               
/*  52 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  59 */           if (entityToSpawn != null) {
/*  60 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           } }
/*     */ 
/*     */       
/*     */       } else {
/*     */         
/*  66 */         if (!entity.level().isClientSide()) {
/*  67 */           entity.discard();
/*     */         }
/*  69 */         if (world instanceof Level) { Level _level = (Level)world;
/*  70 */           if (!_level.isClientSide()) {
/*  71 */             _level.playSound(null, 
/*     */                 
/*  73 */                 BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  74 */                 .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */             
/*  80 */             _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                 
/*  84 */                 .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */         
/*     */         ServerLevel _serverworld;
/*     */         
/*     */         StructureTemplate template;
/*     */         
/*  92 */         if (Math.random() < 0.1D && world instanceof ServerLevel && (
/*     */ 
/*     */ 
/*     */           
/*  96 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("giift"))) != null)
/*     */         {
/*  98 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 100 */               BlockPos.containing(x, y, z), 
/* 101 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 102 */               .setRotation(Rotation.NONE)
/* 103 */               .setMirror(Mirror.NONE)
/* 104 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 111 */     Vec3 _center = new Vec3(x, y, z);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, (new AABB(_center, _center)).inflate(500.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
/* 117 */     for (Entity entityiterator : _entfound) {
/*     */       
/* 119 */       if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, 
/*     */             
/* 121 */             TBSConstants.id("despawnable"))) || entityiterator
/* 122 */         .level().isClientSide())
/* 123 */         continue;  entityiterator.discard();
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
/* 134 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true).isEmpty())
/* 135 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/* 137 */             .getEntitiesOfClass(Player.class, 
/*     */               
/* 139 */               AABB.ofSize(new Vec3(x, y, z), 2002.0D, 2002.0D, 2002.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 146 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 149 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 155 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 157 */               AABB.ofSize(new Vec3(x, y, z), 2002.0D, 2002.0D, 2002.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 164 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 167 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 173 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 175 */               AABB.ofSize(new Vec3(x, y, z), 2002.0D, 2002.0D, 2002.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 182 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 185 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 191 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\VoiddOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */