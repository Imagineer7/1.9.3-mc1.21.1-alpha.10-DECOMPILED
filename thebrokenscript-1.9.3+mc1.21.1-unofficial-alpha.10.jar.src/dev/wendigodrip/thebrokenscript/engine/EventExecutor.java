/*    */ package dev.wendigodrip.thebrokenscript.engine;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\020$\n\002\020\b\n\002\b\003\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\b\020\013\032\004\030\0010\004R\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000R\032\020\007\032\016\022\004\022\0020\t\022\004\022\0020\0040\bX\004¢\006\002\n\000R\024\020\n\032\b\022\004\022\0020\t0\003X\004¢\006\002\n\000¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/engine/EventExecutor;", "", "events", "", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "(Ljava/util/List;)V", "mappedEvents", "", "", "eventChances", "pickRandom", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nEventExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventExecutor.kt\ndev/wendigodrip/thebrokenscript/engine/EventExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n1202#2,2:16\n1230#2,4:18\n1557#2:22\n1628#2,3:23\n*S KotlinDebug\n*F\n+ 1 EventExecutor.kt\ndev/wendigodrip/thebrokenscript/engine/EventExecutor\n*L\n6#1:16,2\n6#1:18,4\n7#1:22\n7#1:23,3\n*E\n"})
/*    */ public final class EventExecutor {
/*    */   public EventExecutor(@NotNull List<BaseEvent> events) {
/*  5 */     this.events = events;
/*  6 */     List<BaseEvent> list1 = this.events; EventExecutor eventExecutor = this; int $i$f$associateBy = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 16 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list1, 10)), 16);
/* 17 */     List<BaseEvent> list2 = list1; Map<Object, Object> map = new LinkedHashMap<>(capacity$iv); int $i$f$associateByTo = 0;
/* 18 */     for (BaseEvent element$iv$iv : list2) {
/* 19 */       BaseEvent baseEvent1 = element$iv$iv; Map<Object, Object> map1 = map; int $i$a$-associateBy-EventExecutor$mappedEvents$1 = 0; map1.put(Integer.valueOf(baseEvent1.getWeight()), element$iv$iv);
/*    */     } 
/* 21 */     eventExecutor.mappedEvents = (Map)map; Iterable<BaseEvent> $this$associateBy$iv = this.events; eventExecutor = this; int $i$f$map = 0;
/* 22 */     Iterable<BaseEvent> iterable1 = $this$associateBy$iv; Collection<Integer> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$associateBy$iv, 10)); int $i$f$mapTo = 0;
/* 23 */     for (BaseEvent item$iv$iv : iterable1) {
/* 24 */       BaseEvent baseEvent1 = item$iv$iv; Collection<Integer> collection = destination$iv$iv; int $i$a$-map-EventExecutor$eventChances$1 = 0; collection.add(Integer.valueOf(baseEvent1.getWeight()));
/* 25 */     }  eventExecutor.eventChances = (List<Integer>)destination$iv$iv;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   private final List<BaseEvent> events;
/*    */   @NotNull
/*    */   private final Map<Integer, BaseEvent> mappedEvents;
/*    */   @NotNull
/*    */   private final List<Integer> eventChances;
/*    */   
/*    */   @Nullable
/*    */   public final BaseEvent pickRandom() {
/*    */     if (this.events.isEmpty())
/*    */       return null; 
/*    */     return this.mappedEvents.get(CollectionsKt.random(this.eventChances, (Random)Random.Default));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\engine\EventExecutor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */