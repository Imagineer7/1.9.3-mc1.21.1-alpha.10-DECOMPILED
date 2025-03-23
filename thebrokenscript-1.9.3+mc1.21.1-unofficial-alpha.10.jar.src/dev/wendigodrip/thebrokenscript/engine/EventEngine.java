/*    */ package dev.wendigodrip.thebrokenscript.engine;
/*    */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*    */ import dev.wendigodrip.thebrokenscript.events.BaseEvent;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import java.util.Map;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\"\020\006\032\026\022\n\022\b\022\004\022\0020\t0\b\022\004\022\0020\t\030\0010\0072\006\020\n\032\0020\013J0\020\006\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0202\006\020\021\032\0020\0202\006\020\022\032\0020\0202\b\020\n\032\004\030\0010\013R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\023"}, d2 = {"Ldev/wendigodrip/thebrokenscript/engine/EventEngine;", "", "<init>", "()V", "executor", "Ldev/wendigodrip/thebrokenscript/engine/RegistryEventExecutor;", "execute", "", "Lnet/minecraft/resources/ResourceKey;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "entity", "Lnet/minecraft/world/entity/Entity;", "", "level", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nEventEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventEngine.kt\ndev/wendigodrip/thebrokenscript/engine/EventEngine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n1#2:44\n*E\n"})
/*    */ public final class EventEngine {
/*    */   @NotNull
/* 15 */   public static final EventEngine INSTANCE = new EventEngine(); @NotNull private static final RegistryEventExecutor executor = new RegistryEventExecutor(TBSRegistries.INSTANCE.getEVENT_REGISTRY());
/*    */   
/*    */   @Nullable
/* 18 */   public final Map.Entry<ResourceKey<BaseEvent>, BaseEvent> execute(@NotNull Entity entity) { Intrinsics.checkNotNullParameter(entity, "entity"); Map.Entry<ResourceKey<BaseEvent>, BaseEvent> entry1 = executor.pickRandom(), it = entry1;
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
/* 44 */     int $i$a$-also-EventEngine$execute$1 = 0; if (it != null && (BaseEvent)it.getValue() != null) { Intrinsics.checkNotNullExpressionValue(entity.level(), "level(...)"); ((BaseEvent)it.getValue()).run(entity.level(), entity); } else { (BaseEvent)it.getValue(); }  return entry1; } public final void execute(@NotNull LevelAccessor level, double x, double y, double z, @Nullable Entity entity) { Intrinsics.checkNotNullParameter(level, "level"); if (entity == null) return;  if (!((TBSConfigs.COMMON != null) ? (!TBSConfigs.COMMON.getEnableRandomEvents() ? 1 : 0) : 0)) { if (Math.random() < ((TBSConfigs.COMMON != null && TBSConfigs.COMMON.eventFrequencyPerTick != null) ? ((Number)TBSConfigs.COMMON.eventFrequencyPerTick.get()).doubleValue() : 3.0E-4D)) { Map.Entry<ResourceKey<BaseEvent>, BaseEvent> entry1 = executor.pickRandom(), it = entry1; int $i$a$-also-EventEngine$execute$2 = 0;
/*    */         if (it != null && (BaseEvent)it.getValue() != null) {
/*    */           Intrinsics.checkNotNullExpressionValue(entity.level(), "level(...)");
/*    */           ((BaseEvent)it.getValue()).run(entity.level(), entity);
/*    */         } else {
/*    */           (BaseEvent)it.getValue();
/*    */         }  }
/*    */       
/*    */       if (level.getBlockState(BlockPos.containing(x, y - 1.0D, z)).is(BlockTags.create(TBSConstants.id("houseengine"))) && Math.random() < 0.001D) {
/*    */         MapVariables.Companion.get(level).setBaseX(x);
/*    */         MapVariables.Companion.get(level).syncData(level);
/*    */         MapVariables.Companion.get(level).setBaseY(y);
/*    */         MapVariables.Companion.get(level).syncData(level);
/*    */         MapVariables.Companion.get(level).setBaseZ(z);
/*    */         MapVariables.Companion.get(level).syncData(level);
/*    */       }  }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\engine\EventEngine.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */