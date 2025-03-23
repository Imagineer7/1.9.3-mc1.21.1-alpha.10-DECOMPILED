/*     */ package dev.wendigodrip.thebrokenscript;
/*     */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSSounds;
/*     */ import java.util.Collection;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.packs.PackType;
/*     */ import net.minecraft.server.packs.repository.Pack;
/*     */ import net.neoforged.bus.api.SubscribeEvent;
/*     */ import net.neoforged.fml.common.EventBusSubscriber;
/*     */ import net.neoforged.fml.event.lifecycle.FMLLoadCompleteEvent;
/*     */ import net.neoforged.fml.loading.FMLEnvironment;
/*     */ import net.neoforged.neoforge.event.AddPackFindersEvent;
/*     */ import net.neoforged.neoforge.event.tick.ServerTickEvent;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import thedarkcolour.kotlinforforge.neoforge.KotlinModLoadingContext;
/*     */ 
/*     */ @Mod("thebrokenscript")
/*     */ @EventBusSubscriber(bus = EventBusSubscriber.Bus.GAME)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\037\n\002\020'\n\002\030\002\n\002\020\b\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\r\032\0020\0162\006\020\017\032\0020\020J\020\020\021\032\0020\0162\006\020\017\032\0020\022H\007J\030\020\023\032\0020\0162\006\020\024\032\0020\f2\006\020\025\032\0020\013H\007J\016\020\026\032\0020\0162\006\020\027\032\0020\030R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R \020\b\032\024\022\020\022\016\022\004\022\0020\013\022\004\022\0020\f0\n0\tX\004¢\006\002\n\000¨\006\031"}, d2 = {"Ldev/wendigodrip/thebrokenscript/TheBrokenScript;", "", "<init>", "()V", "LOGGER", "Lorg/apache/logging/log4j/Logger;", "getLOGGER", "()Lorg/apache/logging/log4j/Logger;", "workQueue", "", "", "Ljava/lang/Runnable;", "", "onLoadComplete", "", "unused", "Lnet/neoforged/fml/event/lifecycle/FMLLoadCompleteEvent;", "tick", "Lnet/neoforged/neoforge/event/tick/ServerTickEvent$Post;", "queueServerWork", "afterTicks", "action", "registerBuiltInPacks", "event", "Lnet/neoforged/neoforge/event/AddPackFindersEvent;", "thebrokenscript"})
/*     */ @SourceDebugExtension({"SMAP\nTheBrokenScript.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TheBrokenScript.kt\ndev/wendigodrip/thebrokenscript/TheBrokenScript\n+ 2 Forge.kt\nthedarkcolour/kotlinforforge/neoforge/forge/ForgeKt\n*L\n1#1,97:1\n24#2:98\n24#2:99\n24#2:100\n24#2:101\n24#2:102\n24#2:103\n24#2:104\n24#2:105\n24#2:106\n24#2:107\n24#2:108\n24#2:109\n24#2:110\n65#2:111\n37#2:112\n66#2,3:113\n*S KotlinDebug\n*F\n+ 1 TheBrokenScript.kt\ndev/wendigodrip/thebrokenscript/TheBrokenScript\n*L\n33#1:98\n34#1:99\n35#1:100\n36#1:101\n37#1:102\n38#1:103\n39#1:104\n40#1:105\n41#1:106\n42#1:107\n43#1:108\n45#1:109\n46#1:110\n48#1:111\n48#1:112\n48#1:113,3\n*E\n"})
/*     */ public final class TheBrokenScript {
/*     */   @NotNull
/*  28 */   public static final TheBrokenScript INSTANCE = new TheBrokenScript(); @NotNull private static final Logger LOGGER = LogManager.getLogger(TheBrokenScript.class); @NotNull public final Logger getLOGGER() { return LOGGER; } static { Intrinsics.checkNotNullExpressionValue(LogManager.getLogger(TheBrokenScript.class), "getLogger(...)"); }
/*     */    @NotNull
/*  30 */   private static final Collection<Map.Entry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();
/*     */   
/*     */   static {
/*  33 */     int $i$f$getMOD_BUS = 0; TBSEvents.INSTANCE.register(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  98 */         KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/*  99 */     TBSDataAttachments.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 100 */     TBSSounds.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 101 */     TBSSongs.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 102 */     TBSBlocks.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 103 */     TBSBlockEntities.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 104 */     TBSItems.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 105 */     TBSEntities.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 106 */     TBSEffects.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 107 */     TBSParticleTypes.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 108 */     TBSMenus.INSTANCE.getREGISTRY().register(KotlinModLoadingContext.Companion.get().getKEventBus()); $i$f$getMOD_BUS = 0;
/* 109 */     KotlinModLoadingContext.Companion.get().getKEventBus().addListener(INSTANCE::registerBuiltInPacks); $i$f$getMOD_BUS = 0;
/* 110 */     KotlinModLoadingContext.Companion.get().getKEventBus().addListener(INSTANCE::onLoadComplete); int $i$f$runForDist = 0;
/* 111 */     int $i$f$getDIST = 0;
/* 112 */     Intrinsics.checkNotNullExpressionValue(FMLEnvironment.dist, "dist"); if (FMLEnvironment.dist == Dist.CLIENT) {
/* 113 */       int $i$a$-runForDist-TheBrokenScript$3 = 0; WindowCloseCallback.init();
/*     */     } 
/* 115 */     int $i$a$-runForDist-TheBrokenScript$4 = 0;
/*     */   }
/*     */   
/*     */   public final void onLoadComplete(@NotNull FMLLoadCompleteEvent unused) {
/*     */     Intrinsics.checkNotNullParameter(unused, "unused");
/*     */     TBSConfigs.INSTANCE.register();
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public final void tick(@NotNull ServerTickEvent.Post unused) {
/*     */     Intrinsics.checkNotNullParameter(unused, "unused");
/*     */     Set<?> actions = new LinkedHashSet();
/*     */     workQueue.forEach(actions::tick$lambda$2);
/*     */     actions.forEach(TheBrokenScript::tick$lambda$3);
/*     */     TypeIntrinsics.asMutableCollection(workQueue).removeAll(actions);
/*     */   }
/*     */   
/*     */   private static final void tick$lambda$2(Set<Map.Entry> $actions, Map.Entry work) {
/*     */     work.setValue(Integer.valueOf(((Number)work.getValue()).intValue() - 1));
/*     */     if (((Number)work.getValue()).intValue() == 0) {
/*     */       Intrinsics.checkNotNull(work);
/*     */       $actions.add(work);
/*     */     } 
/*     */   }
/*     */   
/*     */   private static final void tick$lambda$3(Map.Entry e) {
/*     */     Intrinsics.checkNotNullParameter(e, "e");
/*     */     ((Runnable)e.getKey()).run();
/*     */   }
/*     */   
/*     */   @JvmStatic
/*     */   public static final void queueServerWork(int afterTicks, @NotNull Runnable action) {
/*     */     Intrinsics.checkNotNullParameter(action, "action");
/*     */     if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER)
/*     */       workQueue.add(new AbstractMap.SimpleEntry<>(action, Integer.valueOf(afterTicks))); 
/*     */   }
/*     */   
/*     */   public final void registerBuiltInPacks(@NotNull AddPackFindersEvent event) {
/*     */     Intrinsics.checkNotNullParameter(event, "event");
/*     */     if (event.getPackType() == PackType.CLIENT_RESOURCES)
/*     */       event.addPackFinders(TBSConstants.id("nostalgia"), PackType.CLIENT_RESOURCES, (Component)Component.literal("Nostalgia Helper"), PackSource.BUILT_IN, false, Pack.Position.TOP); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\TheBrokenScript.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */