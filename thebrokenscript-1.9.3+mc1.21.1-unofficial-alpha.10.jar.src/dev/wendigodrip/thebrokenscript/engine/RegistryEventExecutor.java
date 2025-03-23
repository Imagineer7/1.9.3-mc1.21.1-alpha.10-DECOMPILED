/*    */ package dev.wendigodrip.thebrokenscript.engine;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.events.BaseEvent;
/*    */ import java.util.Map;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020&\n\002\030\002\n\000\030\0002\0020\001B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006J\032\020\007\032\026\022\n\022\b\022\004\022\0020\0040\t\022\004\022\0020\004\030\0010\bR\024\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\002\n\000¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/engine/RegistryEventExecutor;", "", "registry", "Lnet/minecraft/core/Registry;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "(Lnet/minecraft/core/Registry;)V", "pickRandom", "", "Lnet/minecraft/resources/ResourceKey;", "thebrokenscript"})
/*    */ public final class RegistryEventExecutor {
/*  8 */   public RegistryEventExecutor(@NotNull Registry<BaseEvent> registry) { this.registry = registry; } @NotNull
/*    */   private final Registry<BaseEvent> registry; @Nullable
/* 10 */   public final Map.Entry<ResourceKey<BaseEvent>, BaseEvent> pickRandom() { Set entries = this.registry.entrySet();
/* 11 */     List<Map.Entry> weightedEntries = new ArrayList();
/*    */     
/* 13 */     for (Map.Entry entry : entries) {
/* 14 */       for (int i = 0, j = ((BaseEvent)entry.getValue()).getWeight(); i < j; i++) {
/* 15 */         Intrinsics.checkNotNull(entry); weightedEntries.add(entry);
/*    */       } 
/*    */     } 
/*    */     
/* 19 */     Map.Entry<ResourceKey<BaseEvent>, BaseEvent> item = (Map.Entry)CollectionsKt.randomOrNull(weightedEntries, (Random)Random.Default);
/*    */     
/* 21 */     if (item != null) {
/* 22 */       if ((TBSConfigs.COMMON != null && TBSConfigs.COMMON.enabledEvents != null) ? (!TBSConfigs.COMMON.enabledEvents.contains(((ResourceKey)item.getKey()).location())) : false) return null;
/*    */     
/*    */     }
/* 25 */     return item; }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\engine\RegistryEventExecutor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */