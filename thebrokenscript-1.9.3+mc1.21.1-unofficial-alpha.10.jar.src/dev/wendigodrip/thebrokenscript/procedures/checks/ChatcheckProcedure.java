/*    */ package dev.wendigodrip.thebrokenscript.procedures.checks;
/*    */ import dev.wendigodrip.thebrokenscript.entity.SiluetChaseEntity;
/*    */ import dev.wendigodrip.thebrokenscript.entity.SiluetStareEntity;
/*    */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndStalkEntity;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.ServerChatEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J0\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020J<\020\b\032\0020\0052\b\020\006\032\004\030\0010\0072\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020H\002¨\006\021"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/checks/ChatcheckProcedure;", "", "<init>", "()V", "onChat", "", "event", "Lnet/neoforged/neoforge/event/ServerChatEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class ChatcheckProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onChat(@NotNull ServerChatEvent event) {
/* 22 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     
/* 24 */     Intrinsics.checkNotNullExpressionValue(event.getPlayer().level(), "level(...)"); execute(event, (LevelAccessor)event.getPlayer().level(), 
/* 25 */         event.getPlayer().getX(), 
/* 26 */         event.getPlayer().getY(), 
/* 27 */         event.getPlayer().getZ(), 
/* 28 */         (Entity)event.getPlayer());
/*    */   }
/*    */   @NotNull
/*    */   public static final ChatcheckProcedure INSTANCE = new ChatcheckProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/* 33 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z, entity);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final void execute(ServerChatEvent event, LevelAccessor world, double x, double y, double z, Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload #9
/*    */     //   2: ifnonnull -> 6
/*    */     //   5: return
/*    */     //   6: aload_2
/*    */     //   7: ldc dev/wendigodrip/thebrokenscript/entity/TheBrokenEndStalkEntity
/*    */     //   9: new net/minecraft/world/phys/Vec3
/*    */     //   12: dup
/*    */     //   13: dload_3
/*    */     //   14: dload #5
/*    */     //   16: dload #7
/*    */     //   18: invokespecial <init> : (DDD)V
/*    */     //   21: ldc2_w 4000.0
/*    */     //   24: ldc2_w 4000.0
/*    */     //   27: ldc2_w 4000.0
/*    */     //   30: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*    */     //   33: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   38: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*    */     //   43: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*    */     //   48: invokeinterface isEmpty : ()Z
/*    */     //   53: ifeq -> 206
/*    */     //   56: aload_2
/*    */     //   57: ldc dev/wendigodrip/thebrokenscript/entity/TheBrokenEndEntity
/*    */     //   59: new net/minecraft/world/phys/Vec3
/*    */     //   62: dup
/*    */     //   63: dload_3
/*    */     //   64: dload #5
/*    */     //   66: dload #7
/*    */     //   68: invokespecial <init> : (DDD)V
/*    */     //   71: ldc2_w 4000.0
/*    */     //   74: ldc2_w 4000.0
/*    */     //   77: ldc2_w 4000.0
/*    */     //   80: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*    */     //   83: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   88: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*    */     //   93: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*    */     //   98: invokeinterface isEmpty : ()Z
/*    */     //   103: ifeq -> 206
/*    */     //   106: aload_2
/*    */     //   107: ldc dev/wendigodrip/thebrokenscript/entity/SiluetStareEntity
/*    */     //   109: new net/minecraft/world/phys/Vec3
/*    */     //   112: dup
/*    */     //   113: dload_3
/*    */     //   114: dload #5
/*    */     //   116: dload #7
/*    */     //   118: invokespecial <init> : (DDD)V
/*    */     //   121: ldc2_w 4000.0
/*    */     //   124: ldc2_w 4000.0
/*    */     //   127: ldc2_w 4000.0
/*    */     //   130: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*    */     //   133: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   138: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*    */     //   143: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*    */     //   148: invokeinterface isEmpty : ()Z
/*    */     //   153: ifeq -> 206
/*    */     //   156: aload_2
/*    */     //   157: ldc dev/wendigodrip/thebrokenscript/entity/SiluetChaseEntity
/*    */     //   159: new net/minecraft/world/phys/Vec3
/*    */     //   162: dup
/*    */     //   163: dload_3
/*    */     //   164: dload #5
/*    */     //   166: dload #7
/*    */     //   168: invokespecial <init> : (DDD)V
/*    */     //   171: ldc2_w 4000.0
/*    */     //   174: ldc2_w 4000.0
/*    */     //   177: ldc2_w 4000.0
/*    */     //   180: invokestatic ofSize : (Lnet/minecraft/world/phys/Vec3;DDD)Lnet/minecraft/world/phys/AABB;
/*    */     //   183: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   188: <illegal opcode> test : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/Predicate;
/*    */     //   193: invokeinterface getEntitiesOfClass : (Ljava/lang/Class;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Ljava/util/List;
/*    */     //   198: invokeinterface isEmpty : ()Z
/*    */     //   203: ifne -> 273
/*    */     //   206: aload_1
/*    */     //   207: ifnull -> 222
/*    */     //   210: aload_1
/*    */     //   211: invokevirtual isCanceled : ()Z
/*    */     //   214: ifne -> 222
/*    */     //   217: aload_1
/*    */     //   218: iconst_1
/*    */     //   219: invokevirtual setCanceled : (Z)V
/*    */     //   222: aload #9
/*    */     //   224: instanceof net/minecraft/world/entity/player/Player
/*    */     //   227: ifeq -> 261
/*    */     //   230: aload #9
/*    */     //   232: checkcast net/minecraft/world/entity/player/Player
/*    */     //   235: invokevirtual level : ()Lnet/minecraft/world/level/Level;
/*    */     //   238: invokevirtual isClientSide : ()Z
/*    */     //   241: ifne -> 261
/*    */     //   244: aload #9
/*    */     //   246: checkcast net/minecraft/world/entity/player/Player
/*    */     //   249: ldc 'IMPORT minecraft.chatengine'
/*    */     //   251: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   254: checkcast net/minecraft/network/chat/Component
/*    */     //   257: iconst_1
/*    */     //   258: invokevirtual displayClientMessage : (Lnet/minecraft/network/chat/Component;Z)V
/*    */     //   261: bipush #20
/*    */     //   263: aload #9
/*    */     //   265: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;)Ljava/lang/Runnable;
/*    */     //   270: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   273: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #44	-> 0
/*    */     //   #45	-> 5
/*    */     //   #47	-> 6
/*    */     //   #48	-> 7
/*    */     //   #50	-> 9
/*    */     //   #51	-> 21
/*    */     //   #52	-> 24
/*    */     //   #53	-> 27
/*    */     //   #49	-> 30
/*    */     //   #55	-> 38
/*    */     //   #47	-> 43
/*    */     //   #55	-> 48
/*    */     //   #56	-> 56
/*    */     //   #57	-> 57
/*    */     //   #58	-> 59
/*    */     //   #59	-> 88
/*    */     //   #56	-> 93
/*    */     //   #59	-> 98
/*    */     //   #60	-> 106
/*    */     //   #61	-> 107
/*    */     //   #62	-> 109
/*    */     //   #63	-> 138
/*    */     //   #60	-> 143
/*    */     //   #63	-> 148
/*    */     //   #64	-> 156
/*    */     //   #65	-> 157
/*    */     //   #66	-> 159
/*    */     //   #67	-> 188
/*    */     //   #64	-> 193
/*    */     //   #67	-> 198
/*    */     //   #70	-> 206
/*    */     //   #71	-> 217
/*    */     //   #73	-> 222
/*    */     //   #74	-> 244
/*    */     //   #75	-> 249
/*    */     //   #76	-> 257
/*    */     //   #74	-> 258
/*    */     //   #80	-> 261
/*    */     //   #81	-> 263
/*    */     //   #79	-> 263
/*    */     //   #90	-> 273
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	274	0	this	Ldev/wendigodrip/thebrokenscript/procedures/checks/ChatcheckProcedure;
/*    */     //   0	274	1	event	Lnet/neoforged/neoforge/event/ServerChatEvent;
/*    */     //   0	274	2	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	274	3	x	D
/*    */     //   0	274	5	y	D
/*    */     //   0	274	7	z	D
/*    */     //   0	274	9	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final boolean execute$lambda$0(TheBrokenEndStalkEntity e)
/*    */   {
/* 55 */     return true; } private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*    */ 
/*    */   
/*    */   private static final boolean execute$lambda$2(TheBrokenEndEntity e) {
/* 59 */     return true; } private static final boolean execute$lambda$3(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*    */ 
/*    */   
/*    */   private static final boolean execute$lambda$4(SiluetStareEntity e) {
/* 63 */     return true; } private static final boolean execute$lambda$5(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*    */ 
/*    */   
/*    */   private static final boolean execute$lambda$6(SiluetChaseEntity e) {
/* 67 */     return true; } private static final boolean execute$lambda$7(Function1 $tmp0, Object p0) { return ((Boolean)$tmp0.invoke(p0)).booleanValue(); }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void execute$lambda$8(Entity $entity) {
/* 82 */     if ($entity instanceof Player && !((Player)$entity).level().isClientSide())
/* 83 */       ((Player)$entity).displayClientMessage(
/* 84 */           (Component)Component.literal("Unexpected_error.returnedvalue=-1"), 
/* 85 */           true); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\checks\ChatcheckProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */