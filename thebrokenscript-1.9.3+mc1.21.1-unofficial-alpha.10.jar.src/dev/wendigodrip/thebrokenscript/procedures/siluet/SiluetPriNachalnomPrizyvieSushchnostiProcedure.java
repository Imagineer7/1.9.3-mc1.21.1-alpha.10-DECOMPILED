/*     */ package dev.wendigodrip.thebrokenscript.procedures.siluet;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.advancements.AdvancementHolder;
/*     */ import net.minecraft.advancements.AdvancementProgress;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
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
/*     */ public class SiluetPriNachalnomPrizyvieSushchnostiProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  27 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  30 */     if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
/*  31 */       if (Math.random() < 0.7D) {
/*  32 */         if (!entity.level().isClientSide()) {
/*  33 */           entity.discard();
/*     */         }
/*     */       } else {
/*     */         
/*  37 */         if (world instanceof Level) { Level _level = (Level)world;
/*  38 */           if (!_level.isClientSide()) {
/*  39 */             _level.playSound(null, 
/*     */                 
/*  41 */                 BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  42 */                 .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */           
/*     */           }
/*     */           else {
/*     */ 
/*     */             
/*  48 */             _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */                 
/*  52 */                 .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */           }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  60 */         if (Math.random() < 0.9D) {
/*     */           Entity entity2;
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
/*  75 */           if (entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null) instanceof ServerPlayer) {
/*     */             
/*  77 */             ServerPlayer _player = (ServerPlayer)entity2;
/*     */             
/*  79 */             AdvancementHolder _adv = _player.server.getAdvancements().get(TBSConstants.id("can_you_see_me"));
/*  80 */             AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
/*  81 */             if (!_ap.isDone())
/*  82 */               for (String criteria : _ap.getRemainingCriteria()) {
/*  83 */                 _player.getAdvancements().award(_adv, criteria);
/*     */               } 
/*     */           } 
/*     */         } 
/*  87 */         TheBrokenScript.queueServerWork(18000, () -> {
/*     */               if (!entity.level().isClientSide()) {
/*     */                 entity.discard();
/*     */               }
/*     */ 
/*     */               
/*     */               if (Math.random() < 0.01D && world instanceof ServerLevel) {
/*     */                 ServerLevel _level = (ServerLevel)world;
/*     */ 
/*     */                 
/*     */                 Entity entityToSpawn = ((EntityType)TBSEntities.SILUET_CHASE.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */                 
/*     */                 if (entityToSpawn != null) {
/*     */                   entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */                 }
/*     */               } 
/*     */             });
/*     */       } 
/* 105 */     } else if (!entity.level().isClientSide()) {
/* 106 */       entity.discard();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\siluet\SiluetPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */