/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.entity.NullMiningEntity;
/*     */ import java.util.Comparator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.neoforged.bus.api.Event;
/*     */ import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J0\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020J<\020\b\032\0020\0052\b\020\006\032\004\030\0010\0212\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020H\002¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure;", "", "<init>", "()V", "onEntityAttacked", "", "event", "Lnet/neoforged/neoforge/event/entity/player/AttackEntityEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "sourceentity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*     */ public final class NullminedespawnProcedure {
/*     */   @SubscribeEvent
/*     */   public final void onEntityAttacked(@NotNull AttackEntityEvent event) {
/*  26 */     Intrinsics.checkNotNullParameter(event, "event"); if (!(event.getTarget() instanceof net.minecraft.world.entity.LivingEntity)) {
/*     */       return;
/*     */     }
/*  29 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), 
/*  30 */         event.getEntity().getX(), 
/*  31 */         event.getEntity().getY(), 
/*  32 */         event.getEntity().getZ(), 
/*  33 */         event.getTarget());
/*     */   }
/*     */   @NotNull
/*     */   public static final NullminedespawnProcedure INSTANCE = new NullminedespawnProcedure();
/*     */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity sourceentity) {
/*  38 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z, sourceentity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void execute(Event event, LevelAccessor world, double x, double y, double z, Entity sourceentity) {
/*  49 */     if (sourceentity == null) {
/*     */       return;
/*     */     }
/*  52 */     if (sourceentity instanceof NullMiningEntity) {
/*  53 */       ((NullMiningEntity)sourceentity).lookAt(
/*  54 */           EntityAnchorArgument.Anchor.EYES, new Vec3((
/*  55 */             (Player)world.getEntitiesOfClass(
/*  56 */               Player.class, 
/*  57 */               AABB.ofSize(
/*  58 */                 new Vec3(x, y, z), 
/*  59 */                 500.0D, 
/*  60 */                 500.0D, 
/*  61 */                 500.0D), NullminedespawnProcedure::execute$lambda$0
/*     */               
/*  63 */               ::execute$lambda$1).stream().sorted((new NullminedespawnProcedure$execute$2())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  73 */               .compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), ((Player)world.getEntitiesOfClass(
/*  74 */               Player.class, 
/*  75 */               AABB.ofSize(
/*  76 */                 new Vec3(x, y, z), 
/*  77 */                 500.0D, 
/*  78 */                 500.0D, 
/*  79 */                 500.0D), NullminedespawnProcedure::execute$lambda$2
/*     */               
/*  81 */               ::execute$lambda$3).stream().sorted((new NullminedespawnProcedure$execute$4())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  91 */               .compareDistOf(x, y, z)).findFirst().orElse(null)).getY() + 1.0D, ((Player)world.getEntitiesOfClass(
/*  92 */               Player.class, 
/*  93 */               AABB.ofSize(
/*  94 */                 new Vec3(x, y, z), 
/*  95 */                 500.0D, 
/*  96 */                 500.0D, 
/*  97 */                 500.0D), NullminedespawnProcedure::execute$lambda$4
/*     */               
/*  99 */               ::execute$lambda$5).stream().sorted((new NullminedespawnProcedure$execute$6())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 109 */               .compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*     */ 
/*     */       
/* 112 */       ((Player)world.getEntitiesOfClass(
/* 113 */           Player.class, 
/* 114 */           AABB.ofSize(
/* 115 */             new Vec3(x, y, z), 
/* 116 */             500.0D, 
/* 117 */             500.0D, 
/* 118 */             500.0D), NullminedespawnProcedure::execute$lambda$6
/*     */           
/* 120 */           ::execute$lambda$7).stream().sorted((new NullminedespawnProcedure$execute$8())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 130 */           .compareDistOf(x, y, z)).findFirst().orElse(null)).lookAt(
/* 131 */           EntityAnchorArgument.Anchor.EYES, new Vec3((
/* 132 */             (NullMiningEntity)world.getEntitiesOfClass(
/* 133 */               NullMiningEntity.class, 
/* 134 */               AABB.ofSize(
/* 135 */                 new Vec3(x, y, z), 
/* 136 */                 500.0D, 
/* 137 */                 500.0D, 
/* 138 */                 500.0D), NullminedespawnProcedure::execute$lambda$8
/*     */               
/* 140 */               ::execute$lambda$9).stream().sorted((new NullminedespawnProcedure$execute$10())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 150 */               .compareDistOf(x, y, z)).findFirst().orElse(null)).getX(), 
/* 151 */             y + 1.0D, (
/* 152 */             (NullMiningEntity)world.getEntitiesOfClass(
/* 153 */               NullMiningEntity.class, 
/* 154 */               AABB.ofSize(
/* 155 */                 new Vec3(x, y, z), 
/* 156 */                 500.0D, 
/* 157 */                 500.0D, 
/* 158 */                 500.0D), NullminedespawnProcedure::execute$lambda$10
/*     */               
/* 160 */               ::execute$lambda$11).stream().sorted((new NullminedespawnProcedure$execute$12())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 170 */               .compareDistOf(x, y, z)).findFirst().orElse(null)).getZ()));
/*     */ 
/*     */       
/* 173 */       if (world instanceof Level) {
/* 174 */         if (!((Level)world).isClientSide()) {
/* 175 */           ((Level)world).playSound(
/* 176 */               null, 
/* 177 */               BlockPos.containing(x, y, z), 
/* 178 */               (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(TBSConstants.id("oneofus")), 
/* 179 */               SoundSource.NEUTRAL, 
/* 180 */               555.0F, 
/* 181 */               1.0F);
/*     */         } else {
/*     */           
/* 184 */           ((Level)world).playLocalSound(
/* 185 */               x, 
/* 186 */               y, 
/* 187 */               z, 
/* 188 */               (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(TBSConstants.id("oneofus")), 
/* 189 */               SoundSource.NEUTRAL, 
/* 190 */               555.0F, 
/* 191 */               1.0F, 
/* 192 */               false);
/*     */         } 
/*     */       }
/*     */       
/* 196 */       TheBrokenScript.queueServerWork(
/* 197 */           5, sourceentity::execute$lambda$12);
/*     */     } 
/* 199 */   } private static final boolean execute$lambda$0(Player e) { return true; } private static final void execute$lambda$12(Entity $sourceentity) { if (!((NullMiningEntity)$sourceentity).level().isClientSide())
/* 200 */       ((NullMiningEntity)$sourceentity).discard();  }
/*     */ 
/*     */   
/*     */   private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$2", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class NullminedespawnProcedure$execute$2 {
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
/*     */       //   #65	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$2;
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
/*     */   private static final boolean execute$lambda$2(Player e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$3(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$4", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class NullminedespawnProcedure$execute$4 {
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
/*     */       //   #83	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$4;
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
/*     */   private static final boolean execute$lambda$4(Player e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$5(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$6", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class NullminedespawnProcedure$execute$6 {
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
/*     */       //   #101	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$6;
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
/*     */   private static final boolean execute$lambda$6(Player e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$7(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$8", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class NullminedespawnProcedure$execute$8 {
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
/*     */       //   #122	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$8;
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
/*     */   private static final boolean execute$lambda$8(NullMiningEntity e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$9(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$10", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class NullminedespawnProcedure$execute$10 {
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
/*     */       //   #142	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$10;
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
/*     */   private static final boolean execute$lambda$10(NullMiningEntity e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$11(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$12", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class NullminedespawnProcedure$execute$12 {
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
/*     */       //   #162	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullminedespawnProcedure$execute$12;
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


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullminedespawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */