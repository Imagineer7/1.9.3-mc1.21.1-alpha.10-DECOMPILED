/*     */ package dev.wendigodrip.thebrokenscript.procedures.nothing;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import java.util.List;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.Vec3i;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NothingiswatchingPriObnovlieniiTikaSushchnostiProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  23 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  26 */     Vec3 _center = new Vec3(x, y, z);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  31 */     List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, (new AABB(_center, _center)).inflate(5.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
/*  32 */     for (Entity entityiterator : _entfound) {
/*  33 */       if (entityiterator == entity)
/*  34 */         continue;  entityiterator.hurt(new DamageSource((Holder)world
/*  35 */             .registryAccess()
/*  36 */             .registryOrThrow(Registries.DAMAGE_TYPE)
/*  37 */             .getHolderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 15.0F);
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
/*  49 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20.0D, 20.0D, 20.0D), e -> true).isEmpty()) {
/*  50 */       if (Math.random() < 0.7D) {
/*  51 */         if (!entity.level().isClientSide()) {
/*  52 */           entity.discard();
/*     */         }
/*  54 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  55 */           Entity entityToSpawn = ((EntityType)TBSEntities.NOTHINGISWATCHINGCHASE.get()).spawn(_level, 
/*     */               
/*  57 */               BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  64 */           if (entityToSpawn != null) {
/*  65 */             entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */           } }
/*     */       
/*     */       } else {
/*  69 */         if (!entity.level().isClientSide()) {
/*  70 */           entity.discard();
/*     */         }
/*  72 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  73 */           Entity entityToSpawn = EntityType.LIGHTNING_BOLT.create((Level)_level);
/*  74 */           entityToSpawn.moveTo(Vec3.atBottomCenterOf((Vec3i)BlockPos.containing(x, y, z)));
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  79 */           _level.addFreshEntity(entityToSpawn); }
/*     */       
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
/*  92 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).isEmpty())
/*  93 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/*  95 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  97 */               AABB.ofSize(new Vec3(x, y, z), 510.0D, 510.0D, 510.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 104 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 107 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 113 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 115 */               AABB.ofSize(new Vec3(x, y, z), 510.0D, 510.0D, 510.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 122 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 125 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 131 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + 1.0D, ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 133 */               AABB.ofSize(new Vec3(x, y, z), 510.0D, 510.0D, 510.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 140 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 143 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 149 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ())); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nothing\NothingiswatchingPriObnovlieniiTikaSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */