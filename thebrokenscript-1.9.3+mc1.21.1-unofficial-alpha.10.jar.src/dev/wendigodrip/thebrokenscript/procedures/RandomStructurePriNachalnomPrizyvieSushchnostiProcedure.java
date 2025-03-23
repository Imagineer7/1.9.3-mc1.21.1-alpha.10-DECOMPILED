/*      */ package dev.wendigodrip.thebrokenscript.procedures;
/*      */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*      */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*      */ import net.minecraft.core.BlockPos;
/*      */ import net.minecraft.server.level.ServerLevel;
/*      */ import net.minecraft.util.Mth;
/*      */ import net.minecraft.util.RandomSource;
/*      */ import net.minecraft.world.entity.Entity;
/*      */ import net.minecraft.world.level.LevelAccessor;
/*      */ import net.minecraft.world.level.ServerLevelAccessor;
/*      */ import net.minecraft.world.level.block.Blocks;
/*      */ import net.minecraft.world.level.block.Mirror;
/*      */ import net.minecraft.world.level.block.Rotation;
/*      */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*      */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
/*      */ 
/*      */ public class RandomStructurePriNachalnomPrizyvieSushchnostiProcedure {
/*      */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*   19 */     if (entity == null) {
/*      */       return;
/*      */     }
/*   22 */     double structure = 0.0D;
/*   23 */     if (TBSConfigs.COMMON != null && !TBSConfigs.COMMON.disableRandomStructures) {
/*   24 */       if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
/*      */ 
/*      */         
/*   27 */         structure = Mth.nextInt(RandomSource.create(), 1, 44);
/*   28 */         if (!entity.level().isClientSide()) {
/*   29 */           entity.discard();
/*      */         }
/*   31 */         if (structure == 1.0D) {
/*   32 */           structure = 0.0D;
/*   33 */           if (Math.random() < 0.5D) {
/*   34 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*   36 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("thedoor"))) != null)
/*      */             {
/*   38 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*   40 */                   BlockPos.containing(x, y, z), 
/*   41 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*   42 */                   .setRotation(Rotation.NONE)
/*   43 */                   .setMirror(Mirror.NONE)
/*   44 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*   49 */             if (world instanceof ServerLevel && (
/*      */               
/*   51 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("thedoor"))) != null)
/*      */             {
/*   53 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*   55 */                   BlockPos.containing(x, y, z), 
/*   56 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*   57 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*   58 */                   .setMirror(Mirror.NONE)
/*   59 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*   65 */         if (structure == 2.0D) {
/*   66 */           structure = 0.0D;
/*   67 */           if (Math.random() < 0.5D) {
/*   68 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*   70 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("structure1"))) != null)
/*      */             {
/*   72 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*   74 */                   BlockPos.containing(x, y, z), 
/*   75 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*   76 */                   .setRotation(Rotation.NONE)
/*   77 */                   .setMirror(Mirror.NONE)
/*   78 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*   83 */             if (world instanceof ServerLevel && (
/*      */               
/*   85 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("structure1"))) != null)
/*      */             {
/*      */               
/*   88 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*   90 */                   BlockPos.containing(x, y, z), 
/*   91 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*   92 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*   93 */                   .setMirror(Mirror.NONE)
/*   94 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  100 */         if (structure == 3.0D) {
/*  101 */           structure = 0.0D;
/*  102 */           if (Math.random() < 0.5D) {
/*  103 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  105 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign5"))) != null)
/*      */             {
/*  107 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  109 */                   BlockPos.containing(x, y, z), 
/*  110 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  111 */                   .setRotation(Rotation.NONE)
/*  112 */                   .setMirror(Mirror.NONE)
/*  113 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  118 */             if (world instanceof ServerLevel && (
/*      */               
/*  120 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign5"))) != null)
/*      */             {
/*  122 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  124 */                   BlockPos.containing(x, y, z), 
/*  125 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  126 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  127 */                   .setMirror(Mirror.NONE)
/*  128 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  134 */         if (structure == 4.0D) {
/*  135 */           structure = 0.0D;
/*  136 */           if (Math.random() < 0.5D) {
/*  137 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  139 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign4"))) != null)
/*      */             {
/*  141 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  143 */                   BlockPos.containing(x, y, z), 
/*  144 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  145 */                   .setRotation(Rotation.NONE)
/*  146 */                   .setMirror(Mirror.NONE)
/*  147 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  152 */             if (world instanceof ServerLevel && (
/*      */               
/*  154 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign4"))) != null)
/*      */             {
/*  156 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  158 */                   BlockPos.containing(x, y, z), 
/*  159 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  160 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  161 */                   .setMirror(Mirror.NONE)
/*  162 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  168 */         if (structure == 5.0D) {
/*  169 */           structure = 0.0D;
/*  170 */           if (Math.random() < 0.5D) {
/*  171 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  173 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign3"))) != null)
/*      */             {
/*  175 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  177 */                   BlockPos.containing(x, y, z), 
/*  178 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  179 */                   .setRotation(Rotation.NONE)
/*  180 */                   .setMirror(Mirror.NONE)
/*  181 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  186 */             if (world instanceof ServerLevel && (
/*      */               
/*  188 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign3"))) != null)
/*      */             {
/*  190 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  192 */                   BlockPos.containing(x, y, z), 
/*  193 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  194 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  195 */                   .setMirror(Mirror.NONE)
/*  196 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  202 */         if (structure == 5.0D) {
/*  203 */           structure = 0.0D;
/*  204 */           if (Math.random() < 0.5D) {
/*  205 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  207 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign2"))) != null)
/*      */             {
/*  209 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  211 */                   BlockPos.containing(x, y, z), 
/*  212 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  213 */                   .setRotation(Rotation.NONE)
/*  214 */                   .setMirror(Mirror.NONE)
/*  215 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  220 */             if (world instanceof ServerLevel && (
/*      */               
/*  222 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign2"))) != null)
/*      */             {
/*  224 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  226 */                   BlockPos.containing(x, y, z), 
/*  227 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  228 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  229 */                   .setMirror(Mirror.NONE)
/*  230 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  236 */         if (structure == 6.0D) {
/*  237 */           structure = 0.0D;
/*  238 */           if (Math.random() < 0.5D) {
/*  239 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  241 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign1"))) != null)
/*      */             {
/*  243 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  245 */                   BlockPos.containing(x, y, z), 
/*  246 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  247 */                   .setRotation(Rotation.NONE)
/*  248 */                   .setMirror(Mirror.NONE)
/*  249 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  254 */             if (world instanceof ServerLevel && (
/*      */               
/*  256 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sign1"))) != null)
/*      */             {
/*  258 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  260 */                   BlockPos.containing(x, y, z), 
/*  261 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  262 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  263 */                   .setMirror(Mirror.NONE)
/*  264 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  270 */         if (structure == 7.0D) {
/*  271 */           structure = 0.0D;
/*  272 */           if (Math.random() < 0.5D) {
/*  273 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  275 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sandpillar"))) != null)
/*      */             {
/*  277 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  279 */                   BlockPos.containing(x, y, z), 
/*  280 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  281 */                   .setRotation(Rotation.NONE)
/*  282 */                   .setMirror(Mirror.NONE)
/*  283 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  288 */             if (world instanceof ServerLevel && (
/*      */               
/*  290 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sandpillar"))) != null)
/*      */             {
/*      */               
/*  293 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  295 */                   BlockPos.containing(x, y, z), 
/*  296 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  297 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  298 */                   .setMirror(Mirror.NONE)
/*  299 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  305 */         if (structure == 8.0D) {
/*  306 */           structure = 0.0D;
/*  307 */           if (Math.random() < 0.5D) {
/*  308 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  310 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("house3"))) != null)
/*      */             {
/*  312 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  314 */                   BlockPos.containing(x, y, z), 
/*  315 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  316 */                   .setRotation(Rotation.NONE)
/*  317 */                   .setMirror(Mirror.NONE)
/*  318 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  323 */             if (world instanceof ServerLevel && (
/*      */               
/*  325 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("house3"))) != null)
/*      */             {
/*  327 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  329 */                   BlockPos.containing(x, y, z), 
/*  330 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  331 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  332 */                   .setMirror(Mirror.NONE)
/*  333 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  339 */         if (structure == 9.0D) {
/*  340 */           structure = 0.0D;
/*  341 */           if (Math.random() < 0.5D) {
/*  342 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  344 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("house2"))) != null)
/*      */             {
/*  346 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  348 */                   BlockPos.containing(x, y, z), 
/*  349 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  350 */                   .setRotation(Rotation.NONE)
/*  351 */                   .setMirror(Mirror.NONE)
/*  352 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  357 */             if (world instanceof ServerLevel && (
/*      */               
/*  359 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("house2"))) != null)
/*      */             {
/*  361 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  363 */                   BlockPos.containing(x, y, z), 
/*  364 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  365 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  366 */                   .setMirror(Mirror.NONE)
/*  367 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  373 */         if (structure == 10.0D) {
/*  374 */           structure = 0.0D;
/*  375 */           if (Math.random() < 0.5D) {
/*  376 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  378 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("house1"))) != null)
/*      */             {
/*  380 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  382 */                   BlockPos.containing(x, y, z), 
/*  383 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  384 */                   .setRotation(Rotation.NONE)
/*  385 */                   .setMirror(Mirror.NONE)
/*  386 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  391 */             if (world instanceof ServerLevel && (
/*      */               
/*  393 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("house1"))) != null)
/*      */             {
/*  395 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  397 */                   BlockPos.containing(x, y, z), 
/*  398 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  399 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  400 */                   .setMirror(Mirror.NONE)
/*  401 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  407 */         if (structure == 11.0D) {
/*  408 */           structure = 0.0D;
/*  409 */           if (Math.random() < 0.5D) {
/*  410 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  412 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("generationbug1"))) != null)
/*      */             {
/*      */               
/*  415 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  417 */                   BlockPos.containing(x, y, z), 
/*  418 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  419 */                   .setRotation(Rotation.NONE)
/*  420 */                   .setMirror(Mirror.NONE)
/*  421 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  426 */             if (world instanceof ServerLevel && (
/*      */               
/*  428 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("generationbug1"))) != null)
/*      */             {
/*      */               
/*  431 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  433 */                   BlockPos.containing(x, y, z), 
/*  434 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  435 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  436 */                   .setMirror(Mirror.NONE)
/*  437 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  443 */         if (structure == 12.0D) {
/*  444 */           structure = 0.0D;
/*  445 */           if (Math.random() < 0.5D) {
/*  446 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  448 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("dirtpillar"))) != null)
/*      */             {
/*  450 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  452 */                   BlockPos.containing(x, y, z), 
/*  453 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  454 */                   .setRotation(Rotation.NONE)
/*  455 */                   .setMirror(Mirror.NONE)
/*  456 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  461 */             if (world instanceof ServerLevel && (
/*      */               
/*  463 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("dirtpillar"))) != null)
/*      */             {
/*      */               
/*  466 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  468 */                   BlockPos.containing(x, y, z), 
/*  469 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  470 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  471 */                   .setMirror(Mirror.NONE)
/*  472 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  478 */         if (structure == 13.0D) {
/*  479 */           structure = 0.0D;
/*  480 */           if (Math.random() < 0.5D) {
/*  481 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  483 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("cross"))) != null)
/*      */             {
/*  485 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  487 */                   BlockPos.containing(x, y, z), 
/*  488 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  489 */                   .setRotation(Rotation.NONE)
/*  490 */                   .setMirror(Mirror.NONE)
/*  491 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  496 */             if (world instanceof ServerLevel && (
/*      */               
/*  498 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("cross"))) != null)
/*      */             {
/*  500 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  502 */                   BlockPos.containing(x, y, z), 
/*  503 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  504 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  505 */                   .setMirror(Mirror.NONE)
/*  506 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  512 */         if (structure == 14.0D) {
/*  513 */           structure = 0.0D;
/*  514 */           if (Math.random() < 0.5D) {
/*  515 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  517 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("cobledpillar"))) != null)
/*      */             {
/*      */               
/*  520 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  522 */                   BlockPos.containing(x, y, z), 
/*  523 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  524 */                   .setRotation(Rotation.NONE)
/*  525 */                   .setMirror(Mirror.NONE)
/*  526 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  531 */             if (world instanceof ServerLevel && (
/*      */               
/*  533 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("cobledpillar"))) != null)
/*      */             {
/*      */               
/*  536 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  538 */                   BlockPos.containing(x, y, z), 
/*  539 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  540 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  541 */                   .setMirror(Mirror.NONE)
/*  542 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  548 */         if (structure == 15.0D) {
/*  549 */           structure = 0.0D;
/*  550 */           if (Math.random() < 0.5D) {
/*  551 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  553 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("2bedrocks"))) != null)
/*      */             {
/*  555 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  557 */                   BlockPos.containing(x, y, z), 
/*  558 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  559 */                   .setRotation(Rotation.NONE)
/*  560 */                   .setMirror(Mirror.NONE)
/*  561 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  566 */             if (world instanceof ServerLevel && (
/*      */               
/*  568 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("2bedrocks"))) != null)
/*      */             {
/*      */               
/*  571 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  573 */                   BlockPos.containing(x, y, z), 
/*  574 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  575 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  576 */                   .setMirror(Mirror.NONE)
/*  577 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  583 */         if (structure == 16.0D) {
/*  584 */           structure = 0.0D;
/*  585 */           if (Math.random() < 0.5D) {
/*  586 */             world.setBlock(BlockPos.containing(x, y, z), Blocks.TORCH.defaultBlockState(), 3);
/*      */           } else {
/*  588 */             world.setBlock(BlockPos.containing(x, y, z), Blocks.REDSTONE_TORCH.defaultBlockState(), 3);
/*      */           } 
/*      */         } 
/*  591 */         if (structure == 17.0D) {
/*  592 */           structure = 0.0D;
/*  593 */           if (Math.random() < 0.5D) {
/*  594 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  596 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("gift"))) != null)
/*      */             {
/*  598 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  600 */                   BlockPos.containing(x, y, z), 
/*  601 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  602 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  603 */                   .setMirror(Mirror.NONE)
/*  604 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  609 */             if (world instanceof ServerLevel && (
/*      */               
/*  611 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("glasspillar"))) != null)
/*      */             {
/*      */               
/*  614 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  616 */                   BlockPos.containing(x, y, z), 
/*  617 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  618 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  619 */                   .setMirror(Mirror.NONE)
/*  620 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  626 */         if (structure == 18.0D) {
/*  627 */           structure = 0.0D;
/*  628 */           if (Math.random() < 0.5D) {
/*  629 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  631 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("stoneaslym"))) != null)
/*      */             {
/*  633 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  635 */                   BlockPos.containing(x, y, z), 
/*  636 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  637 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  638 */                   .setMirror(Mirror.NONE)
/*  639 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  644 */             if (world instanceof ServerLevel && (
/*      */               
/*  646 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("smallfractal"))) != null)
/*      */             {
/*      */               
/*  649 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  651 */                   BlockPos.containing(x, y, z), 
/*  652 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  653 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  654 */                   .setMirror(Mirror.NONE)
/*  655 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  661 */         if (structure == 19.0D) {
/*  662 */           structure = 0.0D;
/*  663 */           if (Math.random() < 0.5D) {
/*  664 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  666 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("redstoneconstruct"))) != null)
/*      */             {
/*      */               
/*  669 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  671 */                   BlockPos.containing(x, y, z), 
/*  672 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  673 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  674 */                   .setMirror(Mirror.NONE)
/*  675 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  680 */             if (world instanceof ServerLevel && (
/*      */               
/*  682 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("sandcube"))) != null)
/*      */             {
/*      */               
/*  685 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  687 */                   BlockPos.containing(x, y, z), 
/*  688 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  689 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  690 */                   .setMirror(Mirror.NONE)
/*  691 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  697 */         if (structure == 20.0D) {
/*  698 */           structure = 0.0D;
/*  699 */           if (Math.random() < 0.5D) {
/*  700 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  702 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("magmacross"))) != null)
/*      */             {
/*  704 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  706 */                   BlockPos.containing(x, y, z), 
/*  707 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  708 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  709 */                   .setMirror(Mirror.NONE)
/*  710 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  715 */             if (world instanceof ServerLevel && (
/*      */               
/*  717 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("treewithnoleaves"))) != null)
/*      */             {
/*      */               
/*  720 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  722 */                   BlockPos.containing(x, y, z), 
/*  723 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  724 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  725 */                   .setMirror(Mirror.NONE)
/*  726 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  732 */         if (structure == 21.0D) {
/*  733 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  734 */           if (world instanceof ServerLevel && (
/*      */             
/*  736 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("treetop"))) != null)
/*      */           {
/*  738 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  740 */                 BlockPos.containing(x, y, z), 
/*  741 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  742 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  743 */                 .setMirror(Mirror.NONE)
/*  744 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  750 */         if (structure == 22.0D) {
/*  751 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  752 */           if (world instanceof ServerLevel && (
/*      */             
/*  754 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("fractal3"))) != null)
/*      */           {
/*  756 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  758 */                 BlockPos.containing(x, y, z), 
/*  759 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  760 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  761 */                 .setMirror(Mirror.NONE)
/*  762 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  768 */         if (structure == 23.0D) {
/*  769 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  770 */           if (world instanceof ServerLevel && (
/*      */             
/*  772 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("trap1"))) != null)
/*      */           {
/*  774 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  776 */                 BlockPos.containing(x, y, z), 
/*  777 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  778 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  779 */                 .setMirror(Mirror.NONE)
/*  780 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  786 */         if (structure == 24.0D) {
/*  787 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  788 */           if (world instanceof ServerLevel && (
/*      */             
/*  790 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("trap2"))) != null)
/*      */           {
/*  792 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  794 */                 BlockPos.containing(x, y, z), 
/*  795 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  796 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  797 */                 .setMirror(Mirror.NONE)
/*  798 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  804 */         if (structure == 25.0D) {
/*  805 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  806 */           if (world instanceof ServerLevel && (
/*      */             
/*  808 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("lavapool"))) != null)
/*      */           {
/*  810 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  812 */                 BlockPos.containing(x, y, z), 
/*  813 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  814 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  815 */                 .setMirror(Mirror.NONE)
/*  816 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  822 */         if (structure == 26.0D) {
/*  823 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  824 */           if (world instanceof ServerLevel && (
/*      */             
/*  826 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("giift"))) != null)
/*      */           {
/*  828 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  830 */                 BlockPos.containing(x, y, z), 
/*  831 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  832 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  833 */                 .setMirror(Mirror.NONE)
/*  834 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  840 */         if (structure == 27.0D) {
/*  841 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  842 */           if (world instanceof ServerLevel && (
/*      */             
/*  844 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("totem"))) != null)
/*      */           {
/*  846 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  848 */                 BlockPos.containing(x, y, z), 
/*  849 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  850 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  851 */                 .setMirror(Mirror.NONE)
/*  852 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  858 */         if (structure == 28.0D) {
/*  859 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  860 */           if (world instanceof ServerLevel && (
/*      */             
/*  862 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("crossfly"))) != null)
/*      */           {
/*  864 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  866 */                 BlockPos.containing(x, y + 50.0D, z), 
/*  867 */                 BlockPos.containing(x, y + 50.0D, z), (new StructurePlaceSettings())
/*  868 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  869 */                 .setMirror(Mirror.NONE)
/*  870 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  876 */         if (structure == 29.0D) {
/*  877 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  878 */           if (world instanceof ServerLevel && (
/*      */             
/*  880 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("magmacross"))) != null)
/*      */           {
/*  882 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  884 */                 BlockPos.containing(x, y + 50.0D, z), 
/*  885 */                 BlockPos.containing(x, y + 50.0D, z), (new StructurePlaceSettings())
/*  886 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  887 */                 .setMirror(Mirror.NONE)
/*  888 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  894 */         if (structure == 30.0D) {
/*  895 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  896 */           if (world instanceof ServerLevel && (
/*      */             
/*  898 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("portal1"))) != null)
/*      */           {
/*  900 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  902 */                 BlockPos.containing(x, y, z), 
/*  903 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  904 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  905 */                 .setMirror(Mirror.NONE)
/*  906 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  912 */         if (structure == 31.0D) {
/*  913 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  914 */           if (world instanceof ServerLevel && (
/*      */             
/*  916 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("carcas"))) != null)
/*      */           {
/*  918 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  920 */                 BlockPos.containing(x, y, z), 
/*  921 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  922 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  923 */                 .setMirror(Mirror.NONE)
/*  924 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  930 */         if (structure == 32.0D) {
/*  931 */           structure = 0.0D;
/*  932 */           if (Math.random() < 0.5D) {
/*  933 */             ServerLevel _serverworld; StructureTemplate template; if (world instanceof ServerLevel && (
/*      */               
/*  935 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("clanbuildoverhaul"))) != null)
/*      */             {
/*      */               
/*  938 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  940 */                   BlockPos.containing(x, y, z), 
/*  941 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  942 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  943 */                   .setMirror(Mirror.NONE)
/*  944 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } else {
/*      */             ServerLevel _serverworld;
/*      */             StructureTemplate template;
/*  949 */             if (world instanceof ServerLevel && (
/*      */               
/*  951 */               template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("cavebase"))) != null)
/*      */             {
/*      */               
/*  954 */               template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                   
/*  956 */                   BlockPos.containing(x, -10.0D, z), 
/*  957 */                   BlockPos.containing(x, -10.0D, z), (new StructurePlaceSettings())
/*  958 */                   .setRotation(Rotation.getRandom(_serverworld.random))
/*  959 */                   .setMirror(Mirror.NONE)
/*  960 */                   .setIgnoreEntities(false), _serverworld.random, 3);
/*      */             }
/*      */           } 
/*      */         } 
/*      */ 
/*      */         
/*  966 */         if (structure == 33.0D) {
/*  967 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  968 */           if (world instanceof ServerLevel && (
/*      */             
/*  970 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("baseruins"))) != null)
/*      */           {
/*  972 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  974 */                 BlockPos.containing(x, y, z), 
/*  975 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/*  976 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  977 */                 .setMirror(Mirror.NONE)
/*  978 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/*  984 */         if (structure == 34.0D) {
/*  985 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/*  986 */           if (world instanceof ServerLevel && (
/*      */             
/*  988 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("crosses"))) != null)
/*      */           {
/*  990 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/*  992 */                 BlockPos.containing(x, y + 35.0D, z), 
/*  993 */                 BlockPos.containing(x, y + 35.0D, z), (new StructurePlaceSettings())
/*  994 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/*  995 */                 .setMirror(Mirror.NONE)
/*  996 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1002 */         if (structure == 35.0D) {
/* 1003 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1004 */           if (world instanceof ServerLevel && (
/*      */             
/* 1006 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("signabomination"))) != null)
/*      */           {
/*      */             
/* 1009 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1011 */                 BlockPos.containing(x, y, z), 
/* 1012 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1013 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1014 */                 .setMirror(Mirror.NONE)
/* 1015 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1021 */         if (structure == 36.0D) {
/* 1022 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1023 */           if (world instanceof ServerLevel && (
/*      */             
/* 1025 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("heavenportal"))) != null)
/*      */           {
/* 1027 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1029 */                 BlockPos.containing(x, y, z), 
/* 1030 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1031 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1032 */                 .setMirror(Mirror.NONE)
/* 1033 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1039 */         if (structure == 37.0D) {
/* 1040 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1041 */           if (world instanceof ServerLevel && (
/*      */             
/* 1043 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("doortrap"))) != null)
/*      */           {
/* 1045 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1047 */                 BlockPos.containing(x, y, z), 
/* 1048 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1049 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1050 */                 .setMirror(Mirror.NONE)
/* 1051 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1057 */         if (structure == 38.0D) {
/* 1058 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1059 */           if (world instanceof ServerLevel && (
/*      */             
/* 1061 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("carcas"))) != null)
/*      */           {
/* 1063 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1065 */                 BlockPos.containing(x, y, z), 
/* 1066 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1067 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1068 */                 .setMirror(Mirror.NONE)
/* 1069 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1075 */         if (structure == 39.0D) {
/* 1076 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1077 */           if (world instanceof ServerLevel && (
/*      */             
/* 1079 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("carcas"))) != null)
/*      */           {
/* 1081 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1083 */                 BlockPos.containing(x, y, z), 
/* 1084 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1085 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1086 */                 .setMirror(Mirror.NONE)
/* 1087 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1093 */         if (structure == 40.0D) {
/* 1094 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1095 */           if (world instanceof ServerLevel && (
/*      */             
/* 1097 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("randombrickstructure"))) != null)
/*      */           {
/*      */             
/* 1100 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1102 */                 BlockPos.containing(x, y, z), 
/* 1103 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1104 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1105 */                 .setMirror(Mirror.NONE)
/* 1106 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1112 */         if (structure == 41.0D) {
/* 1113 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1114 */           if (world instanceof ServerLevel && (
/*      */             
/* 1116 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("randomwoodstructure"))) != null)
/*      */           {
/*      */             
/* 1119 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1121 */                 BlockPos.containing(x, y, z), 
/* 1122 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1123 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1124 */                 .setMirror(Mirror.NONE)
/* 1125 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1131 */         if (structure == 42.0D) {
/* 1132 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1133 */           if (world instanceof ServerLevel && (
/*      */             
/* 1135 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("signnicehouses"))) != null)
/*      */           {
/* 1137 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1139 */                 BlockPos.containing(x, y, z), 
/* 1140 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1141 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1142 */                 .setMirror(Mirror.NONE)
/* 1143 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */         
/* 1149 */         if (structure == 43.0D) {
/* 1150 */           structure = 0.0D; ServerLevel _serverworld; StructureTemplate template;
/* 1151 */           if (world instanceof ServerLevel && (
/*      */             
/* 1153 */             template = (_serverworld = (ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("glassfractal"))) != null)
/*      */           {
/* 1155 */             template.placeInWorld((ServerLevelAccessor)_serverworld, 
/*      */                 
/* 1157 */                 BlockPos.containing(x, y, z), 
/* 1158 */                 BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1159 */                 .setRotation(Rotation.getRandom(_serverworld.random))
/* 1160 */                 .setMirror(Mirror.NONE)
/* 1161 */                 .setIgnoreEntities(false), _serverworld.random, 3);
/*      */           }
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1168 */         if (structure == 44.0D) {
/* 1169 */           structure = 0.0D;
/* 1170 */           if (world instanceof ServerLevel) { ServerLevel lv = (ServerLevel)world;
/*      */             
/* 1172 */             StructureTemplate tmpl = lv.getStructureManager().getOrCreate(TBSConstants.id("burn_fractal"));
/* 1173 */             if (tmpl != null) {
/* 1174 */               tmpl.placeInWorld((ServerLevelAccessor)lv, 
/*      */                   
/* 1176 */                   BlockPos.containing(x, y, z), 
/* 1177 */                   BlockPos.containing(x, y, z), (new StructurePlaceSettings())
/* 1178 */                   .setRotation(Rotation.getRandom(lv.random))
/* 1179 */                   .setMirror(Mirror.NONE)
/* 1180 */                   .setIgnoreEntities(false), lv.random, 3);
/*      */             } }
/*      */         
/*      */         } 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1188 */         if (!entity.level().isClientSide()) {
/* 1189 */           entity.discard();
/*      */         }
/* 1191 */       } else if (!entity.level().isClientSide()) {
/* 1192 */         entity.discard();
/*      */       } 
/* 1194 */     } else if (!entity.level().isClientSide()) {
/* 1195 */       entity.discard();
/*      */     } 
/*      */   }
/*      */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\RandomStructurePriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */