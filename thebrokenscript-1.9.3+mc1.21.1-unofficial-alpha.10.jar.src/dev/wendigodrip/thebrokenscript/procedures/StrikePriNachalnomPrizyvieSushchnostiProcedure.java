/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Vec3i;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LightningBolt;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class StrikePriNachalnomPrizyvieSushchnostiProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  17 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  20 */     if (world.canSeeSkyFromBelowWater(BlockPos.containing(((Player)world
/*  21 */           .getEntitiesOfClass(Player.class, 
/*     */             
/*  23 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  30 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  33 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/*  35 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/*  37 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  44 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  47 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/*  49 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/*  51 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  58 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  61 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/*  63 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()))) {
/*     */       
/*  65 */       if (!entity.level().isClientSide()) {
/*  66 */         entity.discard();
/*     */       }
/*  68 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  69 */         LightningBolt entityToSpawn = (LightningBolt)EntityType.LIGHTNING_BOLT.create((Level)_level);
/*  70 */         entityToSpawn.moveTo(Vec3.atBottomCenterOf((Vec3i)BlockPos.containing(((Player)world
/*  71 */                 .getEntitiesOfClass(Player.class, 
/*     */                   
/*  73 */                   AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  80 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  83 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/*  85 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */                   
/*  87 */                   AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  94 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  97 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/*  99 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */                   
/* 101 */                   AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/* 108 */                 .stream().sorted((new Object()
/*     */                   {
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 111 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/* 113 */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())));
/*     */         
/* 115 */         _level.addFreshEntity((Entity)entityToSpawn); }
/*     */     
/* 117 */     } else if (!entity.level().isClientSide()) {
/* 118 */       entity.discard();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\StrikePriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */