/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NullInvadeBaseOnInitialEntitySpawnProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  22 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  25 */     boolean found = false;
/*  26 */     double sx = 0.0D;
/*  27 */     double sy = 0.0D;
/*  28 */     double sz = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  38 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 40.0D, 40.0D, 40.0D), e -> true).isEmpty()) {
/*  39 */       if (Math.random() < 0.5D && !entity.level().isClientSide()) {
/*  40 */         entity.discard();
/*     */       }
/*  42 */       if (Math.random() < 0.5D) {
/*  43 */         if (Math.random() < 0.5D)
/*  44 */         { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  45 */             _level.getServer()
/*  46 */               .getCommands()
/*  47 */               .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                   
/*  55 */                   (Component)Component.literal(""), _level
/*  56 */                   .getServer(), null))
/*     */                 
/*  58 */                 .withSuppressedOutput(), "tellraw @a \"[{}]\""); }
/*     */           
/*     */            }
/*  61 */         else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  62 */           _level.getServer()
/*  63 */             .getCommands()
/*  64 */             .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */                 
/*  72 */                 (Component)Component.literal(""), _level
/*  73 */                 .getServer(), null))
/*     */               
/*  75 */               .withSuppressedOutput(), "tellraw @a \"{[> null]}\""); }
/*     */       
/*     */       }
/*     */     } 
/*     */     
/*  80 */     TheBrokenScript.queueServerWork(5000, () -> {
/*     */           if (!entity.level().isClientSide()) {
/*     */             entity.discard();
/*     */           }
/*     */         });
/*     */ 
/*     */     
/*  87 */     entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */           
/*  89 */           .getEntitiesOfClass(Player.class, 
/*     */             
/*  91 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  98 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 101 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 103 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 105 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 112 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 115 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 117 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getY(), ((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/* 119 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 126 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 129 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 131 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*     */ 
/*     */     
/* 134 */     if (entity instanceof Mob) { Mob _entity = (Mob)entity;
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
/* 149 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 150 */       if (entity2 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity2;
/* 151 */         _entity.setTarget(_ent); }
/*     */        }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullInvadeBaseOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */