/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.misc.AlertWindow;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.entity.player.CanContinueSleepingEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\030\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\fH\002¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/TriesToSleepProcedure;", "", "<init>", "()V", "onPlayerInBed", "", "event", "Lnet/neoforged/neoforge/event/entity/player/CanContinueSleepingEvent;", "execute", "world", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class TriesToSleepProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerInBed(@NotNull CanContinueSleepingEvent event) {
/* 19 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); Intrinsics.checkNotNullExpressionValue(event.getEntity(), "getEntity(...)"); execute(event.getEntity().level(), (Entity)event.getEntity());
/*    */   } @NotNull
/*    */   public static final TriesToSleepProcedure INSTANCE = new TriesToSleepProcedure(); private final void execute(Level world, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   3: aload_1
/*    */     //   4: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   7: ldc dev/wendigodrip/thebrokenscript/entity/NullWatchingEntity
/*    */     //   9: aload_2
/*    */     //   10: invokevirtual position : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   13: dup
/*    */     //   14: ldc 'position(...)'
/*    */     //   16: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   19: ldc2_w 4000.0
/*    */     //   22: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   25: checkcast java/util/Collection
/*    */     //   28: invokeinterface isEmpty : ()Z
/*    */     //   33: ifne -> 40
/*    */     //   36: iconst_1
/*    */     //   37: goto -> 41
/*    */     //   40: iconst_0
/*    */     //   41: ifeq -> 58
/*    */     //   44: iconst_5
/*    */     //   45: aload_2
/*    */     //   46: aload_1
/*    */     //   47: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;)Ljava/lang/Runnable;
/*    */     //   52: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   55: goto -> 382
/*    */     //   58: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   61: aload_1
/*    */     //   62: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   65: ldc dev/wendigodrip/thebrokenscript/entity/NullFlyingEntity
/*    */     //   67: aload_2
/*    */     //   68: invokevirtual position : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   71: dup
/*    */     //   72: ldc 'position(...)'
/*    */     //   74: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   77: ldc2_w 4000.0
/*    */     //   80: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   83: checkcast java/util/Collection
/*    */     //   86: invokeinterface isEmpty : ()Z
/*    */     //   91: ifne -> 98
/*    */     //   94: iconst_1
/*    */     //   95: goto -> 99
/*    */     //   98: iconst_0
/*    */     //   99: ifeq -> 116
/*    */     //   102: iconst_5
/*    */     //   103: aload_2
/*    */     //   104: aload_1
/*    */     //   105: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;)Ljava/lang/Runnable;
/*    */     //   110: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   113: goto -> 382
/*    */     //   116: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   119: aload_1
/*    */     //   120: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   123: ldc dev/wendigodrip/thebrokenscript/entity/FollowEntity
/*    */     //   125: aload_2
/*    */     //   126: invokevirtual position : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   129: dup
/*    */     //   130: ldc 'position(...)'
/*    */     //   132: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   135: ldc2_w 4000.0
/*    */     //   138: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   141: checkcast java/util/Collection
/*    */     //   144: invokeinterface isEmpty : ()Z
/*    */     //   149: ifne -> 156
/*    */     //   152: iconst_1
/*    */     //   153: goto -> 157
/*    */     //   156: iconst_0
/*    */     //   157: ifeq -> 174
/*    */     //   160: iconst_5
/*    */     //   161: aload_2
/*    */     //   162: aload_1
/*    */     //   163: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;)Ljava/lang/Runnable;
/*    */     //   168: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   171: goto -> 382
/*    */     //   174: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   177: aload_1
/*    */     //   178: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   181: ldc dev/wendigodrip/thebrokenscript/entity/SiluetStareEntity
/*    */     //   183: aload_2
/*    */     //   184: invokevirtual position : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   187: dup
/*    */     //   188: ldc 'position(...)'
/*    */     //   190: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   193: ldc2_w 4000.0
/*    */     //   196: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   199: checkcast java/util/Collection
/*    */     //   202: invokeinterface isEmpty : ()Z
/*    */     //   207: ifne -> 214
/*    */     //   210: iconst_1
/*    */     //   211: goto -> 215
/*    */     //   214: iconst_0
/*    */     //   215: ifeq -> 232
/*    */     //   218: iconst_5
/*    */     //   219: aload_2
/*    */     //   220: aload_1
/*    */     //   221: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;)Ljava/lang/Runnable;
/*    */     //   226: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   229: goto -> 382
/*    */     //   232: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   235: aload_1
/*    */     //   236: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   239: ldc dev/wendigodrip/thebrokenscript/entity/TheBrokenEndStalkEntity
/*    */     //   241: aload_2
/*    */     //   242: invokevirtual position : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   245: dup
/*    */     //   246: ldc 'position(...)'
/*    */     //   248: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   251: ldc2_w 4000.0
/*    */     //   254: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   257: checkcast java/util/Collection
/*    */     //   260: invokeinterface isEmpty : ()Z
/*    */     //   265: ifne -> 272
/*    */     //   268: iconst_1
/*    */     //   269: goto -> 273
/*    */     //   272: iconst_0
/*    */     //   273: ifeq -> 290
/*    */     //   276: iconst_5
/*    */     //   277: aload_2
/*    */     //   278: aload_1
/*    */     //   279: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;)Ljava/lang/Runnable;
/*    */     //   284: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   287: goto -> 382
/*    */     //   290: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   293: aload_1
/*    */     //   294: checkcast net/minecraft/world/level/LevelAccessor
/*    */     //   297: ldc dev/wendigodrip/thebrokenscript/entity/SiluetEntity
/*    */     //   299: aload_2
/*    */     //   300: invokevirtual position : ()Lnet/minecraft/world/phys/Vec3;
/*    */     //   303: dup
/*    */     //   304: ldc 'position(...)'
/*    */     //   306: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   309: ldc2_w 4000.0
/*    */     //   312: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   315: checkcast java/util/Collection
/*    */     //   318: invokeinterface isEmpty : ()Z
/*    */     //   323: ifne -> 330
/*    */     //   326: iconst_1
/*    */     //   327: goto -> 331
/*    */     //   330: iconst_0
/*    */     //   331: ifeq -> 348
/*    */     //   334: iconst_5
/*    */     //   335: aload_2
/*    */     //   336: aload_1
/*    */     //   337: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;)Ljava/lang/Runnable;
/*    */     //   342: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   345: goto -> 382
/*    */     //   348: aload_1
/*    */     //   349: invokevirtual dimensionType : ()Lnet/minecraft/world/level/dimension/DimensionType;
/*    */     //   352: aload_1
/*    */     //   353: invokevirtual dayTime : ()J
/*    */     //   356: invokevirtual moonPhase : (J)I
/*    */     //   359: invokestatic create : ()Lnet/minecraft/util/RandomSource;
/*    */     //   362: iconst_5
/*    */     //   363: bipush #8
/*    */     //   365: invokestatic nextInt : (Lnet/minecraft/util/RandomSource;II)I
/*    */     //   368: if_icmpne -> 382
/*    */     //   371: iconst_5
/*    */     //   372: aload_2
/*    */     //   373: aload_1
/*    */     //   374: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;)Ljava/lang/Runnable;
/*    */     //   379: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   382: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 0
/*    */     //   #23	-> 41
/*    */     //   #24	-> 44
/*    */     //   #28	-> 58
/*    */     //   #28	-> 99
/*    */     //   #29	-> 102
/*    */     //   #33	-> 116
/*    */     //   #33	-> 157
/*    */     //   #34	-> 160
/*    */     //   #38	-> 174
/*    */     //   #38	-> 215
/*    */     //   #39	-> 218
/*    */     //   #43	-> 232
/*    */     //   #44	-> 260
/*    */     //   #44	-> 273
/*    */     //   #46	-> 276
/*    */     //   #50	-> 290
/*    */     //   #50	-> 331
/*    */     //   #51	-> 334
/*    */     //   #55	-> 348
/*    */     //   #56	-> 371
/*    */     //   #61	-> 382
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	383	0	this	Ldev/wendigodrip/thebrokenscript/procedures/TriesToSleepProcedure;
/*    */     //   0	383	1	world	Lnet/minecraft/world/level/Level;
/*    */     //   0	383	2	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */   private static final void execute$lambda$0(Entity $entity, Level $world) {
/* 25 */     $entity.hurt($world.damageSources().fellOutOfWorld(), 0.1F);
/* 26 */     (new AlertWindow("LWJGL Alert", "err.null")).show();
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$1(Entity $entity, Level $world) {
/* 30 */     $entity.hurt($world.damageSources().fellOutOfWorld(), 0.1F);
/* 31 */     (new AlertWindow("LWJGL Alert", "err.null")).show();
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$2(Entity $entity, Level $world) {
/* 35 */     $entity.hurt($world.damageSources().fellOutOfWorld(), 0.1F);
/* 36 */     (new AlertWindow("LWJGL Alert", "err.texture")).show();
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$3(Entity $entity, Level $world) {
/* 40 */     $entity.hurt($world.damageSources().fellOutOfWorld(), 0.1F);
/* 41 */     (new AlertWindow("LWJGL Alert", "err.soul")).show();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void execute$lambda$4(Entity $entity, Level $world) {
/* 47 */     $entity.hurt($world.damageSources().fellOutOfWorld(), 0.1F);
/* 48 */     (new AlertWindow("LWJGL Alert", "err.endisnear")).show();
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$5(Entity $entity, Level $world) {
/* 52 */     $entity.hurt($world.damageSources().fellOutOfWorld(), 0.1F);
/* 53 */     (new AlertWindow("LWJGL Alert", "err.soul")).show();
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$6(Entity $entity, Level $world) {
/* 57 */     $entity.hurt($world.damageSources().fellOutOfWorld(), 0.1F);
/* 58 */     (new AlertWindow("LWJGL Alert", "err.themoon")).show();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\TriesToSleepProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */