/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import dev.wendigodrip.thebrokenscript.events.BaseEvent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.neoforged.neoforge.registries.NewRegistryEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\016\032\0020\0172\006\020\020\032\0020\021H\007R#\020\004\032\016\022\n\022\b\022\004\022\0020\0070\0060\005¢\006\016\n\000\022\004\b\b\020\003\032\004\b\t\020\nR\027\020\013\032\b\022\004\022\0020\0070\006¢\006\b\n\000\032\004\b\f\020\r¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSRegistries;", "", "<init>", "()V", "EVENT_REGISTRY_KEY", "Lnet/minecraft/resources/ResourceKey;", "Lnet/minecraft/core/Registry;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "getEVENT_REGISTRY_KEY$annotations", "getEVENT_REGISTRY_KEY", "()Lnet/minecraft/resources/ResourceKey;", "EVENT_REGISTRY", "getEVENT_REGISTRY", "()Lnet/minecraft/core/Registry;", "register", "", "ev", "Lnet/neoforged/neoforge/registries/NewRegistryEvent;", "thebrokenscript"})
/*    */ public final class TBSRegistries {
/*    */   @NotNull
/*    */   public final ResourceKey<Registry<BaseEvent>> getEVENT_REGISTRY_KEY() {
/* 14 */     return EVENT_REGISTRY_KEY;
/*    */   } @NotNull
/* 16 */   public static final TBSRegistries INSTANCE = new TBSRegistries(); @NotNull private static final ResourceKey<Registry<BaseEvent>> EVENT_REGISTRY_KEY = ResourceKey.createRegistryKey(TBSConstants.id("events")); static { Intrinsics.checkNotNullExpressionValue(ResourceKey.createRegistryKey(TBSConstants.id("events")), "createRegistryKey(...)"); }
/*    */    @NotNull
/* 18 */   private static final Registry<BaseEvent> EVENT_REGISTRY = (new RegistryBuilder(EVENT_REGISTRY_KEY)).sync(true).create(); @NotNull public final Registry<BaseEvent> getEVENT_REGISTRY() { return EVENT_REGISTRY; } static { Intrinsics.checkNotNullExpressionValue((new RegistryBuilder(EVENT_REGISTRY_KEY)).sync(true).create(), "create(...)"); }
/*    */   
/*    */   @SubscribeEvent
/*    */   public final void register(@NotNull NewRegistryEvent ev) {
/* 22 */     Intrinsics.checkNotNullParameter(ev, "ev"); ev.register(EVENT_REGISTRY);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSRegistries.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */