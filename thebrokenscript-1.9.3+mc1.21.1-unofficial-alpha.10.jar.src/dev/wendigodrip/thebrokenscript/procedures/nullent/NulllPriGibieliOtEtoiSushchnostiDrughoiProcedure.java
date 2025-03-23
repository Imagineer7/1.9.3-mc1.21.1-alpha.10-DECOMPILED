/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.entity.NulllEntity;
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
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NulllPriGibieliOtEtoiSushchnostiDrughoiProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  24 */     if (world instanceof ServerLevel) {
/*  25 */       ServerLevel _level = (ServerLevel)world;
/*  26 */       _level.getServer()
/*  27 */         .getCommands()
/*  28 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  36 */             (Component)Component.literal(""), _level
/*  37 */             .getServer(), null))
/*     */           
/*  39 */           .withSuppressedOutput(), "stopsound @a");
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
/*  56 */     if (!((NulllEntity)world.getEntitiesOfClass(NulllEntity.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide()) {
/*  57 */       ((NulllEntity)world.getEntitiesOfClass(NulllEntity.class, 
/*     */           
/*  59 */           AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  66 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  69 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/*  71 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
/*     */     }
/*  73 */     if (world instanceof Level) { Level lv = (Level)world;
/*  74 */       if (!lv.isClientSide()) {
/*  75 */         lv.playSound(null, 
/*     */             
/*  77 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  78 */             .get(TBSConstants.id("nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/*  84 */         lv.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */             
/*  88 */             .get(TBSConstants.id("nullkillsplayer")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */       }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  96 */     if (world instanceof ServerLevel) {
/*  97 */       ServerLevel _level = (ServerLevel)world;
/*  98 */       _level.getServer()
/*  99 */         .getCommands()
/* 100 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 108 */             (Component)Component.literal(""), _level
/* 109 */             .getServer(), null))
/*     */           
/* 111 */           .withSuppressedOutput(), "kick @p null");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NulllPriGibieliOtEtoiSushchnostiDrughoiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */