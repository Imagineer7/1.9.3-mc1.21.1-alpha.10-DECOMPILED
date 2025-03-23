/*     */ package dev.wendigodrip.thebrokenscript.procedures.integrity;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ public class IntegrityOnEntityTickUpdateProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  25 */     if (entity == null) {
/*     */       return;
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
/*  37 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).isEmpty() && entity instanceof Mob) { Mob _entity = (Mob)entity;
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
/*  52 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*  53 */       if (entity2 instanceof LivingEntity) { LivingEntity _ent = (LivingEntity)entity2;
/*  54 */         _entity.setTarget(_ent); }
/*     */        }
/*     */     
/*  57 */     if (world instanceof ServerLevel) {
/*  58 */       ServerLevel _level = (ServerLevel)world;
/*  59 */       _level.getServer()
/*  60 */         .getCommands()
/*  61 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  69 */             (Component)Component.literal(""), _level
/*  70 */             .getServer(), null))
/*     */           
/*  72 */           .withSuppressedOutput(), "particle thebrokenscript:nullparticle ~ ~2 ~ 1 1 1 0 100");
/*     */     } 
/*     */     
/*  75 */     world.setBlock(
/*  76 */         BlockPos.containing(x, y + 
/*     */ 
/*     */           
/*  79 */           Mth.nextInt(
/*  80 */             RandomSource.create(), 1, 9), z), Blocks.AIR
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  85 */         .defaultBlockState(), 3);
/*     */     
/*  87 */     world.setBlock(
/*  88 */         BlockPos.containing(x + 1.0D, y + 
/*     */ 
/*     */           
/*  91 */           Mth.nextInt(
/*  92 */             RandomSource.create(), 1, 9), z), Blocks.AIR
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  97 */         .defaultBlockState(), 3);
/*     */     
/*  99 */     world.setBlock(
/* 100 */         BlockPos.containing(x - 1.0D, y + 
/*     */ 
/*     */           
/* 103 */           Mth.nextInt(
/* 104 */             RandomSource.create(), 1, 9), z), Blocks.AIR
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 109 */         .defaultBlockState(), 3);
/*     */     
/* 111 */     world.setBlock(
/* 112 */         BlockPos.containing(x, y + 
/*     */ 
/*     */           
/* 115 */           Mth.nextInt(
/* 116 */             RandomSource.create(), 1, 9), z + 1.0D), Blocks.AIR
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 121 */         .defaultBlockState(), 3);
/*     */     
/* 123 */     world.setBlock(
/* 124 */         BlockPos.containing(x, y + 
/*     */ 
/*     */           
/* 127 */           Mth.nextInt(
/* 128 */             RandomSource.create(), 1, 9), z - 1.0D), Blocks.AIR
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 133 */         .defaultBlockState(), 3);
/*     */     
/* 135 */     if (Math.random() < 0.1D && world instanceof ServerLevel) {
/* 136 */       ServerLevel _level = (ServerLevel)world;
/* 137 */       _level.setDayTime(Mth.nextInt(RandomSource.create(), 1, 18000));
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\integrity\IntegrityOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */