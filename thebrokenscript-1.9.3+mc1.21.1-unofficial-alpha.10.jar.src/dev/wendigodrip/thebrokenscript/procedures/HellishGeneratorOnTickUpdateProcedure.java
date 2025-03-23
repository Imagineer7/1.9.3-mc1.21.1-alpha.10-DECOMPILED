/*     */ package dev.wendigodrip.thebrokenscript.procedures;
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
/*     */ public class HellishGeneratorOnTickUpdateProcedure {
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
/*  36 */           BlockPos.containing(x, y, z), Blocks.BEDROCK
/*  37 */           .defaultBlockState(), 3);
/*     */ 
/*     */       
/*  40 */       if (Math.random() < 0.9D) {
/*  41 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/*  44 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway1"))) != null)
/*     */         {
/*  46 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/*  48 */               BlockPos.containing(x, y, z), 
/*  49 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  50 */               .setRotation(Rotation.NONE)
/*  51 */               .setMirror(Mirror.NONE)
/*  52 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/*  58 */         doaction = Mth.nextInt(RandomSource.create(), 1, 10);
/*     */       } 
/*  60 */       if (doaction == 1.0D) {
/*  61 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/*  64 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway2"))) != null)
/*     */         {
/*  66 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/*  68 */               BlockPos.containing(x, y, z), 
/*  69 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  70 */               .setRotation(Rotation.NONE)
/*  71 */               .setMirror(Mirror.NONE)
/*  72 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/*  77 */         world.setBlock(
/*  78 */             BlockPos.containing(x, y, z), Blocks.AIR
/*  79 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/*  82 */         world.setBlock(
/*  83 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/*  84 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/*  88 */       if (doaction == 2.0D) {
/*  89 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/*  92 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway3"))) != null)
/*     */         {
/*  94 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/*  96 */               BlockPos.containing(x, y, z), 
/*  97 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  98 */               .setRotation(Rotation.NONE)
/*  99 */               .setMirror(Mirror.NONE)
/* 100 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 105 */         world.setBlock(
/* 106 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 107 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 110 */         world.setBlock(
/* 111 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 112 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 116 */       if (doaction == 3.0D) {
/* 117 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 120 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway4"))) != null)
/*     */         {
/* 122 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 124 */               BlockPos.containing(x, y, z), 
/* 125 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 126 */               .setRotation(Rotation.NONE)
/* 127 */               .setMirror(Mirror.NONE)
/* 128 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 133 */         world.setBlock(
/* 134 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 135 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 138 */         world.setBlock(
/* 139 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 140 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 144 */       if (doaction == 4.0D) {
/* 145 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 148 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway5"))) != null)
/*     */         {
/* 150 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 152 */               BlockPos.containing(x, y, z), 
/* 153 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 154 */               .setRotation(Rotation.NONE)
/* 155 */               .setMirror(Mirror.NONE)
/* 156 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 161 */         world.setBlock(
/* 162 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 163 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 166 */         world.setBlock(
/* 167 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 168 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 172 */       if (doaction == 5.0D) {
/* 173 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 176 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway6"))) != null)
/*     */         {
/* 178 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 180 */               BlockPos.containing(x, y, z), 
/* 181 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 182 */               .setRotation(Rotation.NONE)
/* 183 */               .setMirror(Mirror.NONE)
/* 184 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 189 */         world.setBlock(
/* 190 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 191 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 194 */         world.setBlock(
/* 195 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 196 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 200 */       if (doaction == 6.0D) {
/* 201 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 204 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway7"))) != null)
/*     */         {
/* 206 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 208 */               BlockPos.containing(x, y, z), 
/* 209 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 210 */               .setRotation(Rotation.NONE)
/* 211 */               .setMirror(Mirror.NONE)
/* 212 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 217 */         world.setBlock(
/* 218 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 219 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 222 */         world.setBlock(
/* 223 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 224 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 228 */       if (doaction == 7.0D) {
/* 229 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 232 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway8"))) != null)
/*     */         {
/* 234 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 236 */               BlockPos.containing(x, y, z), 
/* 237 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 238 */               .setRotation(Rotation.NONE)
/* 239 */               .setMirror(Mirror.NONE)
/* 240 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 245 */         world.setBlock(
/* 246 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 247 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 250 */         world.setBlock(
/* 251 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 252 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 256 */       if (doaction == 8.0D) {
/* 257 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 260 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway9"))) != null)
/*     */         {
/* 262 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 264 */               BlockPos.containing(x, y, z), 
/* 265 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 266 */               .setRotation(Rotation.NONE)
/* 267 */               .setMirror(Mirror.NONE)
/* 268 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 273 */         world.setBlock(
/* 274 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 275 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 278 */         world.setBlock(
/* 279 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 280 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 284 */       if (doaction == 9.0D) {
/* 285 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 288 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallway10"))) != null)
/*     */         {
/* 290 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 292 */               BlockPos.containing(x, y, z), 
/* 293 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 294 */               .setRotation(Rotation.NONE)
/* 295 */               .setMirror(Mirror.NONE)
/* 296 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 301 */         world.setBlock(
/* 302 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 303 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 306 */         world.setBlock(
/* 307 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 308 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 312 */       if (doaction == 10.0D) {
/* 313 */         ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*     */ 
/*     */           
/* 316 */           template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("bedrockhallwayexit"))) != null)
/*     */         {
/* 318 */           template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*     */               
/* 320 */               BlockPos.containing(x, y, z), 
/* 321 */               BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 322 */               .setRotation(Rotation.NONE)
/* 323 */               .setMirror(Mirror.NONE)
/* 324 */               .setIgnoreEntities(false), _serverworld.random, 3);
/*     */         }
/*     */ 
/*     */ 
/*     */         
/* 329 */         world.setBlock(
/* 330 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 331 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 334 */         world.setBlock(
/* 335 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 336 */             .defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 340 */       if (world.getBlockState(BlockPos.containing(x + 16.0D, y, z)).getBlock() != Blocks.BEDROCK) {
/*     */         
/* 342 */         world.setBlock(
/* 343 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 344 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 347 */         world.setBlock(
/* 348 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 349 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 352 */         world.setBlock(
/* 353 */             BlockPos.containing(x + 16.0D, y, z), ((Block)TBSBlocks.HELLISH_GENERATOR
/* 354 */             .get()).defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 358 */       if (world.getBlockState(BlockPos.containing(x - 16.0D, y, z)).getBlock() != Blocks.BEDROCK) {
/*     */         
/* 360 */         world.setBlock(
/* 361 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 362 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 365 */         world.setBlock(
/* 366 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 367 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 370 */         world.setBlock(
/* 371 */             BlockPos.containing(x - 16.0D, y, z), ((Block)TBSBlocks.HELLISH_GENERATOR
/* 372 */             .get()).defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 376 */       if (world.getBlockState(BlockPos.containing(x, y, z + 16.0D)).getBlock() != Blocks.BEDROCK) {
/*     */         
/* 378 */         world.setBlock(
/* 379 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 380 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 383 */         world.setBlock(
/* 384 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 385 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 388 */         world.setBlock(
/* 389 */             BlockPos.containing(x, y, z + 16.0D), ((Block)TBSBlocks.HELLISH_GENERATOR
/* 390 */             .get()).defaultBlockState(), 3);
/*     */       } 
/*     */ 
/*     */       
/* 394 */       if (world.getBlockState(BlockPos.containing(x, y, z - 16.0D)).getBlock() != Blocks.BEDROCK) {
/*     */         
/* 396 */         world.setBlock(
/* 397 */             BlockPos.containing(x, y, z), Blocks.AIR
/* 398 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 401 */         world.setBlock(
/* 402 */             BlockPos.containing(x, y, z), Blocks.BEDROCK
/* 403 */             .defaultBlockState(), 3);
/*     */ 
/*     */         
/* 406 */         world.setBlock(
/* 407 */             BlockPos.containing(x, y, z - 16.0D), ((Block)TBSBlocks.HELLISH_GENERATOR
/* 408 */             .get()).defaultBlockState(), 3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\HellishGeneratorOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */