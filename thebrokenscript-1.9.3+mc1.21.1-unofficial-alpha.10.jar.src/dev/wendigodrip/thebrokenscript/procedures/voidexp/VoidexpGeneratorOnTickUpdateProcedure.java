/*     */ package dev.wendigodrip.thebrokenscript.procedures.voidexp;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSBlocks;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.Mirror;
/*     */ import net.minecraft.world.level.block.Rotation;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*     */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class VoidexpGeneratorOnTickUpdateProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  21 */     double doaction = 0.0D;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  31 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 200.0D, 200.0D, 200.0D), e -> true).isEmpty()) {
/*     */ 
/*     */       
/*  34 */       world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*  35 */       world.setBlock(
/*  36 */           BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/*  37 */           .get()).defaultBlockState(), 3);
/*     */ 
/*     */       
/*  40 */       doaction = Mth.nextInt(RandomSource.create(), 1, 8);
/*  41 */       if (doaction == 1.0D) {
/*  42 */         world.setBlock(
/*  43 */             BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/*  44 */             .get()).defaultBlockState(), 3);
/*     */         ServerLevel _serverworld;
/*     */         StructureTemplate template;
/*  47 */         if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/*  50 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("voidexp1"))) != null)
/*     */         {
/*  52 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/*  54 */               BlockPos.containing(x, y, z), 
/*  55 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  56 */               .setRotation(Rotation.NONE)
/*  57 */               .setMirror(Mirror.NONE)
/*  58 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/*  64 */       if (doaction == 2.0D) {
/*  65 */         world.setBlock(
/*  66 */             BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/*  67 */             .get()).defaultBlockState(), 3);
/*     */         ServerLevel _serverworld;
/*     */         StructureTemplate template;
/*  70 */         if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/*  73 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("voidexp2"))) != null)
/*     */         {
/*  75 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/*  77 */               BlockPos.containing(x, y, z), 
/*  78 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  79 */               .setRotation(Rotation.NONE)
/*  80 */               .setMirror(Mirror.NONE)
/*  81 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/*  87 */       if (doaction == 3.0D) {
/*  88 */         world.setBlock(
/*  89 */             BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/*  90 */             .get()).defaultBlockState(), 3);
/*     */         ServerLevel _serverworld;
/*     */         StructureTemplate template;
/*  93 */         if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/*  96 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("voidexp3"))) != null)
/*     */         {
/*  98 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 100 */               BlockPos.containing(x, y, z), 
/* 101 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 102 */               .setRotation(Rotation.NONE)
/* 103 */               .setMirror(Mirror.NONE)
/* 104 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 110 */       if (doaction == 4.0D) {
/* 111 */         world.setBlock(
/* 112 */             BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/* 113 */             .get()).defaultBlockState(), 3);
/*     */         ServerLevel _serverworld;
/*     */         StructureTemplate template;
/* 116 */         if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 119 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("voidexp6"))) != null)
/*     */         {
/* 121 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 123 */               BlockPos.containing(x, y, z), 
/* 124 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 125 */               .setRotation(Rotation.NONE)
/* 126 */               .setMirror(Mirror.NONE)
/* 127 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 133 */       if (doaction == 5.0D) {
/* 134 */         world.setBlock(
/* 135 */             BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/* 136 */             .get()).defaultBlockState(), 3);
/*     */         ServerLevel _serverworld;
/*     */         StructureTemplate template;
/* 139 */         if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 142 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("voidexp7"))) != null)
/*     */         {
/* 144 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 146 */               BlockPos.containing(x, y, z), 
/* 147 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 148 */               .setRotation(Rotation.NONE)
/* 149 */               .setMirror(Mirror.NONE)
/* 150 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 156 */       if (doaction == 6.0D) {
/* 157 */         world.setBlock(
/* 158 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 159 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 162 */         world.setBlock(
/* 163 */             BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/* 164 */             .get()).defaultBlockState(), 3);
/*     */         ServerLevel _serverworld;
/*     */         StructureTemplate template;
/* 167 */         if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 170 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("voidexp8"))) != null)
/*     */         {
/* 172 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 174 */               BlockPos.containing(x, y, z), 
/* 175 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 176 */               .setRotation(Rotation.NONE)
/* 177 */               .setMirror(Mirror.NONE)
/* 178 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 184 */       if (doaction == 8.0D) {
/* 185 */         world.setBlock(
/* 186 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 187 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 190 */         world.setBlock(
/* 191 */             BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/* 192 */             .get()).defaultBlockState(), 3);
/*     */         ServerLevel _serverworld;
/*     */         StructureTemplate template;
/* 195 */         if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 198 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("voidexp11"))) != null)
/*     */         {
/* 200 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 202 */               BlockPos.containing(x, y, z), 
/* 203 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 204 */               .setRotation(Rotation.NONE)
/* 205 */               .setMirror(Mirror.NONE)
/* 206 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 212 */       if (doaction == 7.0D) {
/* 213 */         world.setBlock(
/* 214 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 215 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 218 */         world.setBlock(
/* 219 */             BlockPos.containing(x, y, z), ((Block)TBSBlocks.PROTECTED_VOID
/* 220 */             .get()).defaultBlockState(), 3);
/*     */         ServerLevel _serverworld;
/*     */         StructureTemplate template;
/* 223 */         if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 226 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("voidexp9"))) != null)
/*     */         {
/* 228 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 230 */               BlockPos.containing(x, y, z), 
/* 231 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 232 */               .setRotation(Rotation.NONE)
/* 233 */               .setMirror(Mirror.NONE)
/* 234 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */       } 
/*     */ 
/*     */ 
/*     */       
/* 240 */       if (world.getBlockState(BlockPos.containing(x + 16.0D, y, z)).getBlock() != TBSBlocks.PROTECTED_VOID
/* 241 */         .get()) {
/* 242 */         world.setBlock(
/* 243 */             BlockPos.containing(x + 16.0D, y, z), ((Block)TBSBlocks.VOIDEXP_GENERATOR
/* 244 */             .get()).defaultBlockState(), 3);
/*     */       }
/*     */ 
/*     */       
/* 248 */       if (world.getBlockState(BlockPos.containing(x - 16.0D, y, z)).getBlock() != TBSBlocks.PROTECTED_VOID
/* 249 */         .get()) {
/* 250 */         world.setBlock(
/* 251 */             BlockPos.containing(x - 16.0D, y, z), ((Block)TBSBlocks.VOIDEXP_GENERATOR
/* 252 */             .get()).defaultBlockState(), 3);
/*     */       }
/*     */ 
/*     */       
/* 256 */       if (world.getBlockState(BlockPos.containing(x, y, z + 16.0D)).getBlock() != TBSBlocks.PROTECTED_VOID
/* 257 */         .get()) {
/* 258 */         world.setBlock(
/* 259 */             BlockPos.containing(x, y, z + 16.0D), ((Block)TBSBlocks.VOIDEXP_GENERATOR
/* 260 */             .get()).defaultBlockState(), 3);
/*     */       }
/*     */ 
/*     */       
/* 264 */       if (world.getBlockState(BlockPos.containing(x, y, z - 16.0D)).getBlock() != TBSBlocks.PROTECTED_VOID
/* 265 */         .get())
/* 266 */         world.setBlock(
/* 267 */             BlockPos.containing(x, y, z - 16.0D), ((Block)TBSBlocks.VOIDEXP_GENERATOR
/* 268 */             .get()).defaultBlockState(), 3); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\voidexp\VoidexpGeneratorOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */