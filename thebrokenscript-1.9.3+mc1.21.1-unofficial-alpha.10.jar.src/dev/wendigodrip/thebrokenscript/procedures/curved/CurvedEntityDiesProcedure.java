/*     */ package dev.wendigodrip.thebrokenscript.procedures.curved;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSItems;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.item.ItemEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class CurvedEntityDiesProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  24 */     if (world instanceof ServerLevel) { ServerLevel _level2 = (ServerLevel)world;
/*  25 */       _level2.getServer()
/*  26 */         .getCommands()
/*  27 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level2, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  35 */             (Component)Component.literal(""), _level2
/*  36 */             .getServer(), null))
/*     */           
/*  38 */           .withSuppressedOutput(), "stopsound @a"); }
/*     */ 
/*     */     
/*  41 */     for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 25); index0++) {
/*  42 */       if (world instanceof ServerLevel) {
/*  43 */         ServerLevel _level = (ServerLevel)world;
/*  44 */         ItemEntity entityToSpawn2 = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.COBBLESTONE));
/*  45 */         entityToSpawn2.setPickUpDelay(10);
/*  46 */         _level.addFreshEntity((Entity)entityToSpawn2);
/*     */       } 
/*  48 */     }  for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 25); index1++) {
/*  49 */       if (world instanceof ServerLevel) {
/*  50 */         ServerLevel _level = (ServerLevel)world;
/*  51 */         ItemEntity entityToSpawn2 = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/*  52 */         entityToSpawn2.setPickUpDelay(10);
/*  53 */         _level.addFreshEntity((Entity)entityToSpawn2);
/*     */       } 
/*  55 */     }  if (world instanceof ServerLevel) { ServerLevel _level3 = (ServerLevel)world;
/*  56 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level3, x, y, z, new ItemStack((ItemLike)Items.STONE_AXE));
/*  57 */       entityToSpawn.setPickUpDelay(10);
/*  58 */       _level3.addFreshEntity((Entity)entityToSpawn); }
/*     */     
/*  60 */     if (world instanceof ServerLevel) { ServerLevel _level4 = (ServerLevel)world;
/*  61 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level4, x, y, z, new ItemStack((ItemLike)Items.STONE_SWORD));
/*  62 */       entityToSpawn.setPickUpDelay(10);
/*  63 */       _level4.addFreshEntity((Entity)entityToSpawn); }
/*     */     
/*  65 */     if (world instanceof ServerLevel) { ServerLevel _level5 = (ServerLevel)world;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  71 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level5, x, y, z, new ItemStack((ItemLike)TBSItems.RECORD_16.get()));
/*     */       
/*  73 */       entityToSpawn.setPickUpDelay(10);
/*  74 */       _level5.addFreshEntity((Entity)entityToSpawn); }
/*     */     
/*  76 */     for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 25); index2++) {
/*  77 */       if (world instanceof ServerLevel) {
/*  78 */         ServerLevel _level = (ServerLevel)world;
/*  79 */         ItemEntity entityToSpawn2 = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.DIRT));
/*  80 */         entityToSpawn2.setPickUpDelay(10);
/*  81 */         _level.addFreshEntity((Entity)entityToSpawn2);
/*     */       } 
/*  83 */     }  for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 1, 25); index3++) {
/*  84 */       if (world instanceof ServerLevel) {
/*  85 */         ServerLevel _level = (ServerLevel)world;
/*  86 */         ItemEntity entityToSpawn2 = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE_TORCH));
/*  87 */         entityToSpawn2.setPickUpDelay(10);
/*  88 */         _level.addFreshEntity((Entity)entityToSpawn2);
/*     */       } 
/*  90 */     }  for (int index4 = 0; index4 < Mth.nextInt(RandomSource.create(), 1, 25); index4++) {
/*  91 */       if (world instanceof ServerLevel) {
/*  92 */         ServerLevel _level = (ServerLevel)world;
/*  93 */         ItemEntity entityToSpawn2 = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.OAK_PLANKS));
/*  94 */         entityToSpawn2.setPickUpDelay(10);
/*  95 */         _level.addFreshEntity((Entity)entityToSpawn2);
/*     */       } 
/*  97 */     }  for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 1, 25); index5++) {
/*  98 */       if (world instanceof ServerLevel) {
/*  99 */         ServerLevel _level = (ServerLevel)world;
/* 100 */         ItemEntity entityToSpawn2 = new ItemEntity((Level)_level, x, y, z, new ItemStack((ItemLike)Blocks.OAK_LOG));
/* 101 */         entityToSpawn2.setPickUpDelay(10);
/* 102 */         _level.addFreshEntity((Entity)entityToSpawn2);
/*     */       } 
/* 104 */     }  if (world instanceof ServerLevel) { ServerLevel _level6 = (ServerLevel)world;
/* 105 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level6, x, y, z, new ItemStack((ItemLike)Items.ROTTEN_FLESH));
/* 106 */       entityToSpawn.setPickUpDelay(10);
/* 107 */       _level6.addFreshEntity((Entity)entityToSpawn); }
/*     */     
/* 109 */     if (world instanceof ServerLevel) { ServerLevel _level7 = (ServerLevel)world;
/* 110 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level7, x, y, z, new ItemStack((ItemLike)Items.STRING));
/* 111 */       entityToSpawn.setPickUpDelay(10);
/* 112 */       _level7.addFreshEntity((Entity)entityToSpawn); }
/*     */     
/* 114 */     if (world instanceof ServerLevel) { ServerLevel _level8 = (ServerLevel)world;
/* 115 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level8, x, y, z, new ItemStack((ItemLike)Blocks.OAK_SAPLING));
/* 116 */       entityToSpawn.setPickUpDelay(10);
/* 117 */       _level8.addFreshEntity((Entity)entityToSpawn); }
/*     */     
/* 119 */     if (world instanceof ServerLevel) { ServerLevel _level9 = (ServerLevel)world;
/* 120 */       ItemEntity entityToSpawn = new ItemEntity((Level)_level9, x, y, z, new ItemStack((ItemLike)Items.DIAMOND));
/* 121 */       entityToSpawn.setPickUpDelay(10);
/* 122 */       _level9.addFreshEntity((Entity)entityToSpawn); }
/*     */     
/* 124 */     if (world instanceof ServerLevel) { ServerLevel _level10 = (ServerLevel)world;
/* 125 */       _level10.getServer()
/* 126 */         .getCommands()
/* 127 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level10, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 135 */             (Component)Component.literal(""), _level10
/* 136 */             .getServer(), null))
/*     */           
/* 138 */           .withSuppressedOutput(), "tellraw @a [{\"text\":\"\"},{\"text\":\"DyeXD412 was slain by \",\"color\":\"white\"},{\"selector\":\"@p\",\"color\":\"white\"}]"); }
/*     */ 
/*     */ 
/*     */     
/* 142 */     TheBrokenScript.queueServerWork(100, () -> {
/*     */           if (world instanceof ServerLevel) {
/*     */             ServerLevel lvl = (ServerLevel)world;
/*     */             lvl.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, lvl, 4, "", (Component)Component.literal(""), lvl.getServer(), null)).withSuppressedOutput(), "tellraw @a {\"text\":\"DyeXD412 left the game\",\"color\":\"yellow\"}");
/*     */           } 
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\curved\CurvedEntityDiesProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */