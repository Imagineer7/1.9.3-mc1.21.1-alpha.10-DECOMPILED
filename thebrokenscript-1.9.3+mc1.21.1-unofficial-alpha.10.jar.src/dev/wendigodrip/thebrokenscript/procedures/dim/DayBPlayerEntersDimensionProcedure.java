/*    */ package dev.wendigodrip.thebrokenscript.procedures.dim;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\b\020\013\032\004\030\0010\f¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/dim/DayBPlayerEntersDimensionProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class DayBPlayerEntersDimensionProcedure
/*    */ {
/*    */   @NotNull
/*    */   public static final DayBPlayerEntersDimensionProcedure INSTANCE = new DayBPlayerEntersDimensionProcedure();
/*    */   
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double z, @Nullable Entity entity) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'world'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload #6
/*    */     //   8: ifnonnull -> 12
/*    */     //   11: return
/*    */     //   12: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   15: aload_1
/*    */     //   16: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   19: invokevirtual getHasGeneratedField : ()Z
/*    */     //   22: ifne -> 76
/*    */     //   25: aload_1
/*    */     //   26: dload_2
/*    */     //   27: ldc2_w 100.0
/*    */     //   30: dload #4
/*    */     //   32: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*    */     //   35: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlocks.VOIDEXP_GENERATOR : Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   38: invokevirtual get : ()Ljava/lang/Object;
/*    */     //   41: checkcast net/minecraft/world/level/block/Block
/*    */     //   44: invokevirtual defaultBlockState : ()Lnet/minecraft/world/level/block/state/BlockState;
/*    */     //   47: iconst_3
/*    */     //   48: invokeinterface setBlock : (Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Z
/*    */     //   53: pop
/*    */     //   54: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   57: aload_1
/*    */     //   58: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   61: iconst_1
/*    */     //   62: invokevirtual setHasGeneratedField : (Z)V
/*    */     //   65: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*    */     //   68: aload_1
/*    */     //   69: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*    */     //   72: aload_1
/*    */     //   73: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*    */     //   76: aload #6
/*    */     //   78: astore #7
/*    */     //   80: aload #7
/*    */     //   82: dload_2
/*    */     //   83: ldc2_w 103.0
/*    */     //   86: dload #4
/*    */     //   88: invokevirtual teleportTo : (DDD)V
/*    */     //   91: aload #7
/*    */     //   93: instanceof net/minecraft/server/level/ServerPlayer
/*    */     //   96: ifeq -> 126
/*    */     //   99: aload #7
/*    */     //   101: checkcast net/minecraft/server/level/ServerPlayer
/*    */     //   104: getfield connection : Lnet/minecraft/server/network/ServerGamePacketListenerImpl;
/*    */     //   107: dload_2
/*    */     //   108: ldc2_w 103.0
/*    */     //   111: dload #4
/*    */     //   113: aload #7
/*    */     //   115: invokevirtual getYRot : ()F
/*    */     //   118: aload #7
/*    */     //   120: invokevirtual getXRot : ()F
/*    */     //   123: invokevirtual teleport : (DDDFF)V
/*    */     //   126: bipush #30
/*    */     //   128: aload #6
/*    */     //   130: dload_2
/*    */     //   131: dload #4
/*    */     //   133: <illegal opcode> run : (Lnet/minecraft/world/entity/Entity;DD)Ljava/lang/Runnable;
/*    */     //   138: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   141: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 6
/*    */     //   #14	-> 11
/*    */     //   #16	-> 12
/*    */     //   #17	-> 25
/*    */     //   #18	-> 26
/*    */     //   #19	-> 35
/*    */     //   #20	-> 47
/*    */     //   #17	-> 48
/*    */     //   #22	-> 54
/*    */     //   #23	-> 65
/*    */     //   #25	-> 76
/*    */     //   #26	-> 80
/*    */     //   #27	-> 91
/*    */     //   #28	-> 99
/*    */     //   #31	-> 126
/*    */     //   #32	-> 128
/*    */     //   #30	-> 128
/*    */     //   #39	-> 141
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   80	62	7	_ent	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	142	0	this	Ldev/wendigodrip/thebrokenscript/procedures/dim/DayBPlayerEntersDimensionProcedure;
/*    */     //   0	142	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*    */     //   0	142	2	x	D
/*    */     //   0	142	4	z	D
/*    */     //   0	142	6	entity	Lnet/minecraft/world/entity/Entity;
/*    */   }
/*    */   
/*    */   private static final void execute$lambda$0(Entity $entity, double $x, double $z) {
/* 33 */     Entity e = $entity;
/* 34 */     e.teleportTo($x, 103.0D, $z);
/* 35 */     if (e instanceof ServerPlayer)
/* 36 */       ((ServerPlayer)e).connection.teleport($x, 103.0D, $z, e.getYRot(), e.getXRot()); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\dim\DayBPlayerEntersDimensionProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */