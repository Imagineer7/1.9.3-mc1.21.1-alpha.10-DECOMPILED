/*     */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*     */ import dev.wendigodrip.thebrokenscript.util.EntityFinder;
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitMineshaftStareOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class CircuitMineshaftStareOnInitialEntitySpawnProcedure {
/*     */   @JvmStatic
/*     */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/*  21 */     Intrinsics.checkNotNullParameter(world, "world"); if (entity == null) {
/*     */       return;
/*     */     }
/*  24 */     boolean found = false;
/*  25 */     double sx = 0.0D;
/*  26 */     double sy = 0.0D;
/*  27 */     double sz = 0.0D;
/*  28 */     if (world.getBiome(BlockPos.containing(x, y, z))
/*  29 */       .is(ResourceLocation.parse("the_end")) || 
/*  30 */       world.getBiome(BlockPos.containing(x, y, z))
/*  31 */       .is(TBSConstants.id("null_biome")) || 
/*  32 */       world.getBiome(BlockPos.containing(x, y, z))
/*  33 */       .is(ResourceLocation.parse("end_midlands")) || 
/*  34 */       world.getBiome(BlockPos.containing(x, y, z))
/*  35 */       .is(ResourceLocation.parse("end_highlands"))) {
/*     */       
/*  37 */       if (!entity.level().isClientSide()) {
/*  38 */         entity.discard();
/*     */       }
/*  40 */     } else if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
/*  41 */       if (!entity.level().isClientSide()) {
/*  42 */         entity.discard();
/*     */       }
/*  44 */     } else if (y > 30.0D) {
/*  45 */       if (!entity.level().isClientSide()) {
/*  46 */         entity.discard();
/*     */       }
/*     */     } else {
/*  49 */       Vec3 vec3 = new Vec3(x, y, z);
/*  50 */       Object v1 = new CircuitMineshaftStareOnInitialEntitySpawnProcedure$execute$v1$1();
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
/*  61 */       (Player)EntityFinder.INSTANCE.findClosestEntityInRange(world, Player.class, vec3, 10000.0D); if ((((Player)EntityFinder.INSTANCE.findClosestEntityInRange(world, Player.class, vec3, 10000.0D) != null) ? ((Player)EntityFinder.INSTANCE.findClosestEntityInRange(world, Player.class, vec3, 10000.0D)).getY() : 0.0D) > 40.0D) {
/*  62 */         if (!entity.level().isClientSide()) {
/*  63 */           entity.discard();
/*     */         }
/*  65 */       } else if (MapVariables.Companion.get(world).getHasCircuitSpawned()) {
/*  66 */         if (!entity.level().isClientSide()) {
/*  67 */           entity.discard();
/*     */         }
/*     */       } else {
/*  70 */         sx = -3.0D;
/*  71 */         found = false;
/*  72 */         for (int index0 = 0; index0 < 6; index0++) {
/*  73 */           sy = -3.0D;
/*  74 */           for (int index1 = 0; index1 < 6; index1++) {
/*  75 */             sz = -3.0D;
/*  76 */             for (int index2 = 0; index2 < 6; index2++) {
/*  77 */               if (world.getBlockState(
/*  78 */                   BlockPos.containing(
/*  79 */                     x + sx, 
/*  80 */                     y + sy, 
/*  81 */                     z + sz))
/*     */                 
/*  83 */                 .getBlock() == Blocks.OAK_PLANKS)
/*     */               {
/*  85 */                 found = true;
/*     */               }
/*  87 */               sz++;
/*     */             } 
/*  89 */             sy++;
/*     */           } 
/*  91 */           sx++;
/*     */         } 
/*  93 */         if (found)
/*  94 */           if (Math.random() < 0.1D) {
/*  95 */             if (world instanceof Level) {
/*  96 */               if (!((Level)world).isClientSide()) {
/*  97 */                 ((Level)world).playSound(
/*  98 */                     null, 
/*  99 */                     BlockPos.containing(x, y, z), 
/* 100 */                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse(
/* 101 */                         "ambient.cave")), 
/*     */                     
/* 103 */                     SoundSource.NEUTRAL, 
/* 104 */                     555.0F, 
/* 105 */                     0.0F);
/*     */               } else {
/*     */                 
/* 108 */                 ((Level)world).playLocalSound(
/* 109 */                     x, 
/* 110 */                     y, 
/* 111 */                     z, 
/* 112 */                     (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse(
/* 113 */                         "ambient.cave")), 
/*     */                     
/* 115 */                     SoundSource.NEUTRAL, 
/* 116 */                     555.0F, 
/* 117 */                     0.0F, 
/* 118 */                     false);
/*     */               } 
/*     */             }
/*     */             
/* 122 */             MapVariables.Companion.get(world).setHasCircuitSpawned(true);
/* 123 */             MapVariables.Companion.get(world).syncData(world);
/* 124 */             TheBrokenScript.queueServerWork(
/* 125 */                 10000, entity::execute$lambda$0);
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           }
/* 131 */           else if (!entity.level().isClientSide()) {
/* 132 */             entity.discard();
/*     */           }  
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final CircuitMineshaftStareOnInitialEntitySpawnProcedure INSTANCE = new CircuitMineshaftStareOnInitialEntitySpawnProcedure();
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J.\020\002\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/circuit/CircuitMineshaftStareOnInitialEntitySpawnProcedure$execute$v1$1", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class CircuitMineshaftStareOnInitialEntitySpawnProcedure$execute$v1$1 {
/*     */     public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*     */       // Byte code:
/*     */       //   0: dload_1
/*     */       //   1: dload_3
/*     */       //   2: dload #5
/*     */       //   4: <illegal opcode> invoke : (DDD)Lkotlin/jvm/functions/Function1;
/*     */       //   9: <illegal opcode> applyAsDouble : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/ToDoubleFunction;
/*     */       //   14: invokestatic comparingDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
/*     */       //   17: dup
/*     */       //   18: ldc 'comparingDouble(...)'
/*     */       //   20: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   23: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #52	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitMineshaftStareOnInitialEntitySpawnProcedure$execute$v1$1;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D
/*     */     }
/*     */     
/*     */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) {
/*     */       return ((Number)$tmp0.invoke(p0)).doubleValue();
/*     */     }
/*     */     
/*     */     private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/*     */       Intrinsics.checkNotNullParameter(_entcnd, "_entcnd");
/*     */       return _entcnd.distanceToSqr($_x, $_y, $_z);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final void execute$lambda$0(Entity $entity) {
/*     */     if (!$entity.level().isClientSide())
/*     */       $entity.discard(); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitMineshaftStareOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */