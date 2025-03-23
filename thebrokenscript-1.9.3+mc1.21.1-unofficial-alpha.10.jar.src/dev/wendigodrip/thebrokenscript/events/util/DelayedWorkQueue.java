/*    */ package dev.wendigodrip.thebrokenscript.events.util;
/*    */ import kotlin.Pair;
/*    */ import kotlin.Unit;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\000\n\002\020\000\n\002\b\003\n\002\020!\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\b\n\000\n\002\020\013\n\002\b\n\030\000*\004\b\000\020\0012\0020\002B\007¢\006\004\b\003\020\004J\"\020\013\032\0020\f2\006\020\r\032\0020\n2\022\020\016\032\016\022\004\022\0028\000\022\004\022\0020\t0\bJ \020\017\032\034\022\020\022\016\022\004\022\0028\000\022\004\022\0020\t0\b\022\004\022\0020\n\030\0010\007J \020\020\032\034\022\020\022\016\022\004\022\0028\000\022\004\022\0020\t0\b\022\004\022\0020\n\030\0010\007J\023\020\021\032\0020\t2\006\020\022\032\0028\000¢\006\002\020\023J\023\020\024\032\0020\f2\006\020\022\032\0028\000¢\006\002\020\025R,\020\005\032 \022\034\022\032\022\020\022\016\022\004\022\0028\000\022\004\022\0020\t0\b\022\004\022\0020\n0\0070\006X\004¢\006\002\n\000¨\006\026"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/util/DelayedWorkQueue;", "T", "", "<init>", "()V", "queue", "", "Lkotlin/Pair;", "Lkotlin/Function1;", "", "", "add", "", "delay", "handler", "removeFirst", "pop", "start", "cx", "(Ljava/lang/Object;)V", "next", "(Ljava/lang/Object;)Z", "thebrokenscript"})
/*    */ public final class DelayedWorkQueue<T> {
/*    */   @NotNull
/* 12 */   private final List<Pair<Function1<T, Unit>, Integer>> queue = new ArrayList<>();
/*    */   
/* 14 */   public final boolean add(int delay, @NotNull Function1 handler) { Intrinsics.checkNotNullParameter(handler, "handler"); return this.queue.add(TuplesKt.to(handler, Integer.valueOf(delay))); } @Nullable
/* 15 */   public final Pair<Function1<T, Unit>, Integer> removeFirst() { return (Pair<Function1<T, Unit>, Integer>)CollectionsKt.removeFirstOrNull(this.queue); } @Nullable
/* 16 */   public final Pair<Function1<T, Unit>, Integer> pop() { return (Pair<Function1<T, Unit>, Integer>)CollectionsKt.removeLastOrNull(this.queue); }
/*    */   
/*    */   public final void start(Object cx) {
/* 19 */     next((T)cx);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final boolean next(Object cx) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield queue : Ljava/util/List;
/*    */     //   4: invokeinterface isEmpty : ()Z
/*    */     //   9: ifeq -> 14
/*    */     //   12: iconst_0
/*    */     //   13: ireturn
/*    */     //   14: aload_0
/*    */     //   15: getfield queue : Ljava/util/List;
/*    */     //   18: invokeinterface removeFirst : ()Ljava/lang/Object;
/*    */     //   23: dup
/*    */     //   24: ldc 'removeFirst(...)'
/*    */     //   26: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   29: checkcast kotlin/Pair
/*    */     //   32: astore_2
/*    */     //   33: aload_2
/*    */     //   34: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   37: checkcast java/lang/Number
/*    */     //   40: invokevirtual intValue : ()I
/*    */     //   43: aload_2
/*    */     //   44: aload_1
/*    */     //   45: aload_0
/*    */     //   46: <illegal opcode> run : (Lkotlin/Pair;Ljava/lang/Object;Ldev/wendigodrip/thebrokenscript/events/util/DelayedWorkQueue;)Ljava/lang/Runnable;
/*    */     //   51: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   54: aload_0
/*    */     //   55: getfield queue : Ljava/util/List;
/*    */     //   58: checkcast java/util/Collection
/*    */     //   61: invokeinterface isEmpty : ()Z
/*    */     //   66: ifne -> 73
/*    */     //   69: iconst_1
/*    */     //   70: goto -> 74
/*    */     //   73: iconst_0
/*    */     //   74: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 0
/*    */     //   #30	-> 14
/*    */     //   #32	-> 33
/*    */     //   #37	-> 54
/*    */     //   #37	-> 74
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   33	42	2	entry	Lkotlin/Pair;
/*    */     //   0	75	0	this	Ldev/wendigodrip/thebrokenscript/events/util/DelayedWorkQueue;
/*    */     //   0	75	1	cx	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final void next$lambda$0(Pair $entry, Object $cx, DelayedWorkQueue<Object> this$0) {
/* 33 */     ((Function1)$entry.getFirst()).invoke($cx);
/* 34 */     this$0.next($cx);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\event\\util\DelayedWorkQueue.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */