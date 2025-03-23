/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class OutOfCaveCheckOnInitialEntitySpawnProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  19 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  22 */     if (!entity.level().isClientSide()) {
/*  23 */       entity.discard();
/*     */     }
/*  25 */     if (!world.canSeeSkyFromBelowWater(BlockPos.containing(((Player)world
/*  26 */           .getEntitiesOfClass(Player.class, 
/*     */             
/*  28 */             AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  35 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  38 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/*  40 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/*  42 */             AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  49 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  52 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/*  54 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/*  56 */             AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  63 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  66 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/*  68 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())) && world instanceof ServerLevel) {
/*  69 */       ServerLevel _level = (ServerLevel)world;
/*  70 */       Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT.get()).spawn(_level, 
/*  71 */           BlockPos.containing(((Player)world
/*  72 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  74 */               AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  81 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  84 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*  90 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().clip(new ClipContext(((Player)world
/*  91 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/*  93 */                   AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 100 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 103 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 109 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F), ((Player)world
/* 110 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 112 */                   AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 119 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 122 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 128 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 129 */                 .getEyePosition(1.0F).add(((Player)world.getEntitiesOfClass(Player.class, 
/*     */                     
/* 131 */                     AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
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
/* 143 */                   .stream()
/* 144 */                   .sorted((new Object()
/*     */                     {
/*     */ 
/*     */ 
/*     */                       
/*     */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                       {
/* 151 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                       }
/* 158 */                     }).compareDistOf(x, y, z))
/* 159 */                   .findFirst()
/* 160 */                   .orElse(null))
/* 161 */                   .getViewVector(1.0F)
/* 162 */                   .scale(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/*     */ 
/*     */                 
/* 165 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 167 */                   AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 174 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 177 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 183 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)))
/* 184 */             .getBlockPos().getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 186 */               AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 193 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 196 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 202 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 204 */               AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 211 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 214 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 220 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().clip(new ClipContext(((Player)world
/* 221 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 223 */                   AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 230 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 233 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 239 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getEyePosition(1.0F), ((Player)world
/* 240 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 242 */                   AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 249 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 252 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 258 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null))
/* 259 */                 .getEyePosition(1.0F).add(((Player)world.getEntitiesOfClass(Player.class, 
/*     */                     
/* 261 */                     AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
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
/* 273 */                   .stream()
/* 274 */                   .sorted((new Object()
/*     */                     {
/*     */ 
/*     */ 
/*     */                       
/*     */                       Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                       {
/* 281 */                         return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                       }
/* 288 */                     }).compareDistOf(x, y, z))
/* 289 */                   .findFirst()
/* 290 */                   .orElse(null))
/* 291 */                   .getViewVector(1.0F)
/* 292 */                   .scale(-10.0D)), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, world
/*     */ 
/*     */                 
/* 295 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/* 297 */                   AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 304 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 307 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 313 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)))
/* 314 */             .getBlockPos().getZ()), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */       
/* 317 */       if (entityToSpawn != null)
/* 318 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\OutOfCaveCheckOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */