/*    */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*    */ 
/*    */ import java.util.Comparator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.Entity;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J.\020\002\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/circuit/CircuitMineshaftStareOnInitialEntitySpawnProcedure$execute$v1$1", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*    */ public final class CircuitMineshaftStareOnInitialEntitySpawnProcedure$execute$v1$1
/*    */ {
/*    */   public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*    */     // Byte code:
/*    */     //   0: dload_1
/*    */     //   1: dload_3
/*    */     //   2: dload #5
/*    */     //   4: <illegal opcode> invoke : (DDD)Lkotlin/jvm/functions/Function1;
/*    */     //   9: <illegal opcode> applyAsDouble : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/ToDoubleFunction;
/*    */     //   14: invokestatic comparingDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
/*    */     //   17: dup
/*    */     //   18: ldc 'comparingDouble(...)'
/*    */     //   20: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   23: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #52	-> 0
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/circuit/CircuitMineshaftStareOnInitialEntitySpawnProcedure$execute$v1$1;
/*    */     //   0	24	1	_x	D
/*    */     //   0	24	3	_y	D
/*    */     //   0	24	5	_z	D
/*    */   }
/*    */   
/*    */   private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) {
/* 52 */     return ((Number)$tmp0.invoke(p0)).doubleValue(); } private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/* 53 */     Intrinsics.checkNotNullParameter(_entcnd, "_entcnd"); return _entcnd.distanceToSqr(
/* 54 */         $_x, 
/* 55 */         $_y, 
/* 56 */         $_z);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\CircuitMineshaftStareOnInitialEntitySpawnProcedure$execute$v1$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */