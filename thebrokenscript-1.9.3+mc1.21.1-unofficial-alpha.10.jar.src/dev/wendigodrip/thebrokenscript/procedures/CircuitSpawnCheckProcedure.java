/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J(\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\017"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/CircuitSpawnCheckProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "thebrokenscript"})
/*    */ public final class CircuitSpawnCheckProcedure {
/*    */   @NotNull
/*    */   public static final CircuitSpawnCheckProcedure INSTANCE = new CircuitSpawnCheckProcedure();
/*    */   
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 19 */     Intrinsics.checkNotNullParameter(event, "event");
/* 20 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((LevelAccessor)event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
/*    */   }
/*    */   
/*    */   private final void execute(LevelAccessor world, double x, double y, double z) {
/*    */     // Byte code:
/*    */     //   0: invokestatic random : ()D
/*    */     //   3: ldc2_w 0.7
/*    */     //   6: dcmpg
/*    */     //   7: ifge -> 170
/*    */     //   10: aload_1
/*    */     //   11: instanceof net/minecraft/world/level/Level
/*    */     //   14: ifeq -> 170
/*    */     //   17: aload_1
/*    */     //   18: checkcast net/minecraft/world/level/Level
/*    */     //   21: invokevirtual isDay : ()Z
/*    */     //   24: ifeq -> 170
/*    */     //   27: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   30: aload_1
/*    */     //   31: ldc dev/wendigodrip/thebrokenscript/entity/CircuitStareEntity
/*    */     //   33: new net/minecraft/world/phys/Vec3
/*    */     //   36: dup
/*    */     //   37: dload_2
/*    */     //   38: dload #4
/*    */     //   40: dload #6
/*    */     //   42: invokespecial <init> : (DDD)V
/*    */     //   45: ldc2_w 4000.0
/*    */     //   48: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   51: invokeinterface isEmpty : ()Z
/*    */     //   56: ifeq -> 148
/*    */     //   59: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   62: aload_1
/*    */     //   63: ldc dev/wendigodrip/thebrokenscript/entity/CircuitStalkEntity
/*    */     //   65: new net/minecraft/world/phys/Vec3
/*    */     //   68: dup
/*    */     //   69: dload_2
/*    */     //   70: dload #4
/*    */     //   72: dload #6
/*    */     //   74: invokespecial <init> : (DDD)V
/*    */     //   77: ldc2_w 4000.0
/*    */     //   80: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   83: invokeinterface isEmpty : ()Z
/*    */     //   88: ifeq -> 148
/*    */     //   91: getstatic dev/wendigodrip/thebrokenscript/util/EntityFinder.INSTANCE : Ldev/wendigodrip/thebrokenscript/util/EntityFinder;
/*    */     //   94: aload_1
/*    */     //   95: ldc dev/wendigodrip/thebrokenscript/entity/CircuitMineshaftStareEntity
/*    */     //   97: new net/minecraft/world/phys/Vec3
/*    */     //   100: dup
/*    */     //   101: dload_2
/*    */     //   102: dload #4
/*    */     //   104: dload #6
/*    */     //   106: invokespecial <init> : (DDD)V
/*    */     //   109: ldc2_w 4000.0
/*    */     //   112: invokevirtual findEntitiesInRange : (Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Ljava/util/List;
/*    */     //   115: invokeinterface isEmpty : ()Z
/*    */     //   120: ifeq -> 148
/*    */     //   123: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   126: aload_1
/*    */     //   127: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   130: iconst_0
/*    */     //   131: invokevirtual setHasCircuitSpawned : (Z)V
/*    */     //   134: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   137: aload_1
/*    */     //   138: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   141: aload_1
/*    */     //   142: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   145: goto -> 170
/*    */     //   148: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   151: aload_1
/*    */     //   152: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   155: iconst_1
/*    */     //   156: invokevirtual setHasCircuitSpawned : (Z)V
/*    */     //   159: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   162: aload_1
/*    */     //   163: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   166: aload_1
/*    */     //   167: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   170: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   173: aload_1
/*    */     //   174: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   177: iconst_0
/*    */     //   178: invokevirtual setHasSpawnedEntity : (Z)V
/*    */     //   181: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   184: aload_1
/*    */     //   185: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   188: aload_1
/*    */     //   189: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   192: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #25	-> 0
/*    */     //   #26	-> 27
/*    */     //   #27	-> 51
/*    */     //   #28	-> 83
/*    */     //   #29	-> 95
/*    */     //   #30	-> 97
/*    */     //   #31	-> 109
/*    */     //   #28	-> 112
/*    */     //   #32	-> 115
/*    */     //   #34	-> 123
/*    */     //   #35	-> 134
/*    */     //   #37	-> 148
/*    */     //   #38	-> 159
/*    */     //   #42	-> 170
/*    */     //   #43	-> 181
/*    */     //   #44	-> 192
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	193	0	this	Ldev/wendigodrip/thebrokenscript/procedures/CircuitSpawnCheckProcedure;
/*    */     //   0	193	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	193	2	x	D
/*    */     //   0	193	4	y	D
/*    */     //   0	193	6	z	D
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\CircuitSpawnCheckProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */