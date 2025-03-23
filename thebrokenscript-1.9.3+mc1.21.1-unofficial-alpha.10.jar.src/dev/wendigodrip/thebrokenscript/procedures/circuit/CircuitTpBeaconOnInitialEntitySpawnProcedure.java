/*     */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*     */ import dev.wendigodrip.thebrokenscript.entity.CircuitStalkEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.CircuitStareEntity;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitTpBeaconOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class CircuitTpBeaconOnInitialEntitySpawnProcedure {
/*     */   @JvmStatic
/*     */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/*  18 */     Intrinsics.checkNotNullParameter(world, "world"); if (entity == null) {
/*     */       return;
/*     */     }
/*  21 */     if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) {
/*  22 */       if (!entity.level().isClientSide()) {
/*  23 */         entity.discard();
/*     */       }
/*  25 */     } else if (y > 30.0D) {
/*  26 */       if (!entity.level().isClientSide()) {
/*  27 */         entity.discard();
/*     */       }
/*     */     } else {
/*  30 */       Vec3 vec3 = new Vec3(x, y, z);
/*  31 */       Object v1 = new CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$v1$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  40 */       (Player)EntityFinder.INSTANCE.findClosestEntityInRange(world, Player.class, vec3, 10000.0D); if ((((Player)EntityFinder.INSTANCE.findClosestEntityInRange(world, Player.class, vec3, 10000.0D) != null) ? ((Player)EntityFinder.INSTANCE.findClosestEntityInRange(world, Player.class, vec3, 10000.0D)).getY() : 0.0D) > 40.0D) {
/*  41 */         if (!entity.level().isClientSide()) {
/*  42 */           entity.discard();
/*     */         }
/*  44 */       } else if (MapVariables.Companion.get(world).getHasCircuitSpawned()) {
/*  45 */         ServerPlayer _serverPlayer = null;
/*  46 */         Entity _ent = null;
/*  47 */         if (!entity.level().isClientSide()) {
/*  48 */           entity.discard();
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  54 */         if (!world.getEntitiesOfClass(CircuitStalkEntity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), CircuitTpBeaconOnInitialEntitySpawnProcedure::execute$lambda$0::execute$lambda$1).isEmpty()) {
/*     */           
/*  56 */           _ent = world.getEntitiesOfClass(
/*  57 */               CircuitStalkEntity.class, AABB.ofSize(
/*  58 */                 new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), CircuitTpBeaconOnInitialEntitySpawnProcedure::execute$lambda$2
/*     */               
/*  60 */               ::execute$lambda$3).stream().sorted((new CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$3())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  68 */               .compareDistOf(x, y, z)).findFirst().orElse(null);
/*  69 */           ((CircuitStalkEntity)_ent).teleportTo(x, y, z);
/*  70 */           if (_ent instanceof ServerPlayer) {
/*  71 */             _serverPlayer = (ServerPlayer)_ent;
/*  72 */             _serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
/*     */           } 
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  79 */         if (!world.getEntitiesOfClass(CircuitStareEntity.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), CircuitTpBeaconOnInitialEntitySpawnProcedure::execute$lambda$4::execute$lambda$5).isEmpty()) {
/*     */           
/*  81 */           _ent = world.getEntitiesOfClass(
/*  82 */               CircuitStareEntity.class, AABB.ofSize(
/*  83 */                 new Vec3(x, y, z), 10000.0D, 10000.0D, 10000.0D), CircuitTpBeaconOnInitialEntitySpawnProcedure::execute$lambda$6
/*     */               
/*  85 */               ::execute$lambda$7).stream().sorted((new CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$6())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  93 */               .compareDistOf(x, y, z)).findFirst().orElse(null);
/*  94 */           ((CircuitStareEntity)_ent).teleportTo(x, y, z);
/*  95 */           if (_ent instanceof ServerPlayer) {
/*  96 */             _serverPlayer = (ServerPlayer)_ent;
/*  97 */             _serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
/*     */           } 
/*     */         } 
/* 100 */       } else if (!entity.level().isClientSide()) {
/* 101 */         entity.discard();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final CircuitTpBeaconOnInitialEntitySpawnProcedure INSTANCE = new CircuitTpBeaconOnInitialEntitySpawnProcedure();
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J.\020\002\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/circuit/CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$v1$1", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$v1$1 {
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
/*     */       //   #33	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$v1$1;
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
/*     */   private static final boolean execute$lambda$0(CircuitStalkEntity e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$2(CircuitStalkEntity e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$3(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/circuit/CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$3", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$3 {
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
/*     */       //   #62	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$3;
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
/*     */       Intrinsics.checkNotNull(_entcnd);
/*     */       return _entcnd.distanceToSqr($_x, $_y, $_z);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$4(CircuitStareEntity e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$5(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$6(CircuitStareEntity e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$7(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/circuit/CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$6", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$6 {
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
/*     */       //   #87	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitTpBeaconOnInitialEntitySpawnProcedure$execute$6;
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
/*     */       Intrinsics.checkNotNull(_entcnd);
/*     */       return _entcnd.distanceToSqr($_x, $_y, $_z);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitTpBeaconOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */