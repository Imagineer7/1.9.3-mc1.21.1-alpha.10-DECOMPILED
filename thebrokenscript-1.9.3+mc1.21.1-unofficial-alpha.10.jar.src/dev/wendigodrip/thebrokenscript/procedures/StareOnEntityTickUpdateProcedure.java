/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import java.util.Comparator;
/*    */ import java.util.List;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ public class StareOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 22 */     Vec3 _center = new Vec3(x, y, z);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, (new AABB(_center, _center)).inflate(1000.0D), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
/* 28 */     for (Entity entityiterator : _entfound) {
/*    */ 
/*    */       
/* 31 */       if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, 
/*    */             
/* 33 */             TBSConstants.id("lookable"))))
/*    */         continue; 
/* 35 */       entityiterator.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*    */             
/* 37 */             .getEntitiesOfClass(Player.class, 
/*    */               
/* 39 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 46 */             .stream().sorted((new Object()
/*    */               {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 49 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*    */                 }
/* 55 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*    */               
/* 57 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 64 */             .stream().sorted((new Object()
/*    */               {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 67 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*    */                 }
/* 73 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + 1.0D, ((Player)world.getEntitiesOfClass(Player.class, 
/*    */               
/* 75 */               AABB.ofSize(new Vec3(x, y, z), 4100.0D, 4100.0D, 4100.0D), e -> true)
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 82 */             .stream().sorted((new Object()
/*    */               {
/*    */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 85 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*    */                 }
/* 91 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*    */       
/*    */       LivingEntity _entity;
/* 94 */       if (!(entityiterator instanceof LivingEntity) || (_entity = (LivingEntity)entityiterator)
/* 95 */         .level().isClientSide())
/* 96 */         continue;  _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 55, false, false));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\StareOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */