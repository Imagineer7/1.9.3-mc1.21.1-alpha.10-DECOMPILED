/*     */ package dev.wendigodrip.thebrokenscript.procedures.brokenend;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*     */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndEntity;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class TheBrokenEndThisEntityKillsAnotherOneProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  28 */     if (world instanceof Level) {
/*  29 */       Level _level = (Level)world;
/*  30 */       if (!_level.isClientSide()) {
/*  31 */         _level.playSound(null, 
/*     */             
/*  33 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  34 */             .get(TBSConstants.id("nullkillsplayer")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/*  40 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */             
/*  44 */             .get(TBSConstants.id("nullkillsplayer")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
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
/*     */     
/*  66 */     if (!((TheBrokenEndEntity)world.getEntitiesOfClass(TheBrokenEndEntity.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide()) {
/*  67 */       ((TheBrokenEndEntity)world.getEntitiesOfClass(TheBrokenEndEntity.class, 
/*     */           
/*  69 */           AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  76 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  79 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/*  81 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
/*     */     }
/*  83 */     if (world instanceof ServerLevel) {
/*  84 */       ServerLevel serverLevel = (ServerLevel)world;
/*  85 */       serverLevel.getServer()
/*  86 */         .getCommands()
/*  87 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  95 */             (Component)Component.literal(""), serverLevel
/*  96 */             .getServer(), null))
/*     */           
/*  98 */           .withSuppressedOutput(), "kick @p Here I am.");
/*     */     } 
/*     */     
/* 101 */     if (world instanceof ServerLevel && TBSConfigs.COMMON != null && !TBSConfigs.COMMON.getDisableBanning()) {
/* 102 */       ServerLevel serverLevel = (ServerLevel)world;
/* 103 */       Entity entityToSpawn = ((EntityType)TBSEntities.BAN.get()).spawn(serverLevel, 
/*     */           
/* 105 */           BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 112 */       if (entityToSpawn != null)
/* 113 */         entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\brokenend\TheBrokenEndThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */