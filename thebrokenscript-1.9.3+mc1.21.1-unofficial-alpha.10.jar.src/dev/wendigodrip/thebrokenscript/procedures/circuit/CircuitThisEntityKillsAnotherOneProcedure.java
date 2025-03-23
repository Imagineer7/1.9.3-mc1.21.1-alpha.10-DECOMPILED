/*     */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import dev.wendigodrip.thebrokenscript.entity.CircuitEntity;
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
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
/*     */ import net.minecraft.world.entity.animal.Bee;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class CircuitThisEntityKillsAnotherOneProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  27 */     if (world instanceof ServerLevel) {
/*  28 */       ServerLevel _level = (ServerLevel)world;
/*  29 */       _level.getServer()
/*  30 */         .getCommands()
/*  31 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  39 */             (Component)Component.literal(""), _level
/*  40 */             .getServer(), null))
/*     */           
/*  42 */           .withSuppressedOutput(), "stopsound @a");
/*     */     } 
/*     */     
/*  45 */     if (world instanceof Level) { Level lvl = (Level)world;
/*  46 */       if (!lvl.isClientSide()) {
/*  47 */         lvl.playSound(null, 
/*     */             
/*  49 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  50 */             .get(TBSConstants.id("nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/*  56 */         lvl.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */             
/*  60 */             .get(TBSConstants.id("nulljumpscareloud")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */       }  }
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
/*     */     
/*  82 */     if (!((CircuitEntity)world.getEntitiesOfClass(CircuitEntity.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide()) {
/*  83 */       ((CircuitEntity)world.getEntitiesOfClass(CircuitEntity.class, 
/*     */           
/*  85 */           AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  92 */         .stream().sorted((new Object()
/*     */           {
/*     */             Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  95 */               return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */             }
/*  97 */           }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
/*     */     }
/*  99 */     MapVariables.get(world).setNoWayOutFrame(0.0D);
/* 100 */     MapVariables.get(world).syncData(world);
/* 101 */     TheBrokenScript.queueServerWork(20, () -> {
/*     */           if (Math.random() < 0.1D) {
/*     */             if (!((Bee)world.getEntitiesOfClass(Bee.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), ()).stream().sorted((new Object()
/*     */                 {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*     */                   Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                   {
/* 116 */                     return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                   }
/*     */                 }).compareDistOf(x, y, z)).findFirst().orElse(null)).level().isClientSide())
/*     */               ((Bee)world.getEntitiesOfClass(Bee.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), ()).stream().sorted((new Object()
/*     */                   {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                     
/*     */                     Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                     {
/* 131 */                       return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                     }
/*     */                   }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard(); 
/*     */           } else if (Math.random() < 0.5D) {
/*     */             if (world instanceof ServerLevel) {
/*     */               ServerLevel lvl = (ServerLevel)world;
/*     */               lvl.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, lvl, 4, "", (Component)Component.literal(""), lvl.getServer(), null)).withSuppressedOutput(), "kick @a No more running.");
/*     */             } 
/*     */           } else if (world instanceof ServerLevel) {
/*     */             ServerLevel lvl = (ServerLevel)world;
/*     */             lvl.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, lvl, 4, "", (Component)Component.literal(""), lvl.getServer(), null)).withSuppressedOutput(), "kick @a No more hiding.");
/*     */           } 
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */