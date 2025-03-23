/*     */ package dev.wendigodrip.thebrokenscript.procedures.deceiver;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ public class DeceiverOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  26 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  29 */     double heights = 0.0D;
/*  30 */     double randomtitle = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  40 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 10.0D, 10.0D, 10.0D), e -> true).isEmpty()) {
/*  41 */       if (Math.random() < 0.7D) {
/*  42 */         if (!entity.level().isClientSide()) {
/*  43 */           entity.discard();
/*     */         }
/*  45 */         if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  46 */           _level.getServer()
/*  47 */             .getCommands()
/*  48 */             .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  56 */                 (Component)Component.literal(""), _level
/*  57 */                 .getServer(), null))
/*     */               
/*  59 */               .withSuppressedOutput(), "gamemode survival @a"); }
/*     */ 
/*     */         
/*  62 */         TheBrokenScript.queueServerWork(60, () -> {
/*     */               if (world instanceof ServerLevel) {
/*     */                 ServerLevel _level = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */                 
/*     */                 Entity entityToSpawn = ((EntityType)TBSEntities.CIRCUIT.get()).spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
/*     */ 
/*     */                 
/*     */                 if (entityToSpawn != null) {
/*     */                   entityToSpawn.setYRot(world.getRandom().nextFloat() * 360.0F);
/*     */                 }
/*     */               } 
/*     */             });
/*  76 */       } else if (!entity.level().isClientSide()) {
/*  77 */         entity.discard();
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
/*  89 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true).isEmpty()) {
/*  90 */       entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */             
/*  92 */             .getEntitiesOfClass(Player.class, 
/*     */               
/*  94 */               AABB.ofSize(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 101 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 104 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 110 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 112 */               AABB.ofSize(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 119 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 122 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 128 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + 1.0D, ((Player)world.getEntitiesOfClass(Player.class, 
/*     */               
/* 130 */               AABB.ofSize(new Vec3(x, y, z), 3000.0D, 3000.0D, 3000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 137 */             .stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 140 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/* 146 */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*     */     }
/*     */     
/*     */     Level _lvl14;
/* 150 */     if (world instanceof Level && (_lvl14 = (Level)world).isDay() && !entity.level().isClientSide())
/* 151 */       entity.discard(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\deceiver\DeceiverOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */