/*     */ package dev.wendigodrip.thebrokenscript.procedures.brokenend;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import dev.wendigodrip.thebrokenscript.util.TimeOfDay;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.vehicle.Boat;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TheBrokenEndOnInitialEntitySpawnProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  27 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  30 */     boolean found = false;
/*  31 */     double sx = 0.0D;
/*  32 */     double sy = 0.0D;
/*  33 */     double sz = 0.0D;
/*  34 */     if (world instanceof Level) {
/*  35 */       Level _level = (Level)world;
/*  36 */       if (!_level.isClientSide()) {
/*  37 */         _level.playSound(null, 
/*     */             
/*  39 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  40 */             .get(TBSConstants.id("theendisnear")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/*  46 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */             
/*  50 */             .get(TBSConstants.id("theendisnear")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     if (world instanceof net.minecraft.server.level.ServerLevel) {
/*  59 */       TimeOfDay.MIDNIGHT.set(world);
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
/*  70 */     if (!world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty())
/*     */     {
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
/*  84 */       if (!((Boat)world.getEntitiesOfClass(Boat.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
/*  85 */         ((Boat)world.getEntitiesOfClass(Boat.class, 
/*     */             
/*  87 */             AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  94 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  97 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/*  99 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard(); 
/*     */     }
/* 101 */     Entity _ent = entity;
/* 102 */     _ent.teleportTo(x, y, z);
/* 103 */     if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 104 */       _serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot()); }
/*     */     
/* 106 */     TheBrokenScript.queueServerWork(1000, () -> {
/*     */           if (!entity.level().isClientSide())
/*     */             entity.discard(); 
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\brokenend\TheBrokenEndOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */