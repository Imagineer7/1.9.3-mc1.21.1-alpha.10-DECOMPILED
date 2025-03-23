/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import dev.wendigodrip.thebrokenscript.events.BaseEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.NoopEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.entities.StrikeLightningEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.misc.ExplodeBaseEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.misc.SetDoDaylightCycleEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.misc.SetOnFireEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.misc.SetTimeEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.misc.TextEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.nullent.NullScareEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.nullent.NullTitleEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.sounds.GiveDisc11Event;
/*    */ import dev.wendigodrip.thebrokenscript.events.sounds.RandomSongEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.world.PlaceAllDeadEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.world.PlaceBedrockEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.world.PlaceHelloEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.world.PlaceOakSignEvent;
/*    */ import dev.wendigodrip.thebrokenscript.events.world.PlaceRedstoneTorchEvent;
/*    */ import net.neoforged.bus.api.IEventBus;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\013\032\0020\f2\006\020\r\032\0020\016R\024\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\002\n\000R4\020\007\032&\022\f\022\n \t*\004\030\0010\0060\006 \t*\022\022\f\022\n \t*\004\030\0010\0060\006\030\0010\b0\bX\004¢\006\004\n\002\020\n¨\006\017"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSEvents;", "", "<init>", "()V", "EVENTS_TO_REGISTER", "", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "kotlin.jvm.PlatformType", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "register", "", "bus", "Lnet/neoforged/bus/api/IEventBus;", "thebrokenscript"})
/*    */ public final class TBSEvents {
/*    */   @NotNull
/* 26 */   public static final TBSEvents INSTANCE = new TBSEvents(); @NotNull
/* 27 */   private static final List<BaseEvent> EVENTS_TO_REGISTER; static { BaseEvent[] arrayOfBaseEvent = new BaseEvent[56]; arrayOfBaseEvent[0] = (BaseEvent)new BSODEvent(); arrayOfBaseEvent[1] = 
/* 28 */       (BaseEvent)new CanSomeoneHearMeAdvancementEvent();
/* 29 */     arrayOfBaseEvent[2] = (BaseEvent)new CloseMenuEvent();
/* 30 */     arrayOfBaseEvent[3] = (BaseEvent)new DamageEvent();
/* 31 */     arrayOfBaseEvent[4] = (BaseEvent)new DoorsEvent();
/* 32 */     arrayOfBaseEvent[5] = (BaseEvent)new ExplodeBaseEvent();
/* 33 */     arrayOfBaseEvent[6] = (BaseEvent)new EyesEvent();
/* 34 */     arrayOfBaseEvent[7] = (BaseEvent)new FalseVillagerEvent();
/* 35 */     arrayOfBaseEvent[8] = (BaseEvent)new GiiftEvent();
/* 36 */     arrayOfBaseEvent[9] = (BaseEvent)new GiveDisc11Event();
/* 37 */     arrayOfBaseEvent[10] = (BaseEvent)new HeartBeatEvent();
/* 38 */     arrayOfBaseEvent[11] = (BaseEvent)new HungryEvent();
/* 39 */     arrayOfBaseEvent[12] = (BaseEvent)new JFrame5Event();
/* 40 */     arrayOfBaseEvent[13] = (BaseEvent)new LavaCastEvent();
/* 41 */     arrayOfBaseEvent[14] = (BaseEvent)new LookAndDamageEvent();
/* 42 */     arrayOfBaseEvent[15] = (BaseEvent)new Madness1Event();
/* 43 */     arrayOfBaseEvent[16] = (BaseEvent)new MoonGlitchEvent();
/* 44 */     arrayOfBaseEvent[17] = (BaseEvent)new MoonPhaseEvent();
/* 45 */     arrayOfBaseEvent[18] = (BaseEvent)new NoopEvent();
/* 46 */     arrayOfBaseEvent[19] = (BaseEvent)new NullBookEvent();
/* 47 */     arrayOfBaseEvent[20] = (BaseEvent)new NulledGuiEvent();
/* 48 */     arrayOfBaseEvent[21] = (BaseEvent)new NullInterfaceTriggerEvent();
/* 49 */     arrayOfBaseEvent[22] = (BaseEvent)new NullInvadeBaseEvent();
/* 50 */     arrayOfBaseEvent[23] = (BaseEvent)new NullNullNullAdvancementEvent();
/* 51 */     arrayOfBaseEvent[24] = (BaseEvent)new NullParticleEvent();
/* 52 */     arrayOfBaseEvent[25] = (BaseEvent)new NullScareEvent();
/* 53 */     arrayOfBaseEvent[26] = (BaseEvent)new NullTitleEvent();
/* 54 */     arrayOfBaseEvent[27] = (BaseEvent)new ObfuscatedSignEvent();
/* 55 */     arrayOfBaseEvent[28] = (BaseEvent)new OpenGLErrorEvent();
/* 56 */     arrayOfBaseEvent[29] = (BaseEvent)new ParanoiaEvent();
/* 57 */     arrayOfBaseEvent[30] = (BaseEvent)new PlaceAllDeadEvent();
/* 58 */     arrayOfBaseEvent[31] = (BaseEvent)new PlaceBedrockEvent();
/* 59 */     arrayOfBaseEvent[32] = (BaseEvent)new PlaceCaveAirEvent();
/* 60 */     arrayOfBaseEvent[33] = (BaseEvent)new PlaceEmptyEvent();
/* 61 */     arrayOfBaseEvent[34] = (BaseEvent)new PlaceFlowingWaterEvent();
/* 62 */     arrayOfBaseEvent[35] = (BaseEvent)new PlaceHelloEvent();
/* 63 */     arrayOfBaseEvent[36] = (BaseEvent)new PlaceLavaEvent();
/* 64 */     arrayOfBaseEvent[37] = (BaseEvent)new PlaceNetherrackEvent();
/* 65 */     arrayOfBaseEvent[38] = (BaseEvent)new PlaceOakSignEvent();
/* 66 */     arrayOfBaseEvent[39] = (BaseEvent)new PlaceRedstoneTorchEvent();
/* 67 */     arrayOfBaseEvent[40] = (BaseEvent)new PlaceWaterEvent();
/* 68 */     arrayOfBaseEvent[41] = (BaseEvent)new PlaySoundEvent();
/* 69 */     arrayOfBaseEvent[42] = (BaseEvent)new PushEvent();
/* 70 */     arrayOfBaseEvent[43] = (BaseEvent)new RandomSongEvent();
/* 71 */     arrayOfBaseEvent[44] = (BaseEvent)new RemoveVHSEvent();
/* 72 */     arrayOfBaseEvent[45] = (BaseEvent)new ResetRotationEvent();
/* 73 */     arrayOfBaseEvent[46] = (BaseEvent)new SetDoDaylightCycleEvent();
/* 74 */     arrayOfBaseEvent[47] = (BaseEvent)new SetOnFireEvent();
/* 75 */     arrayOfBaseEvent[48] = (BaseEvent)new SetRandomTimeOfDay();
/* 76 */     arrayOfBaseEvent[49] = (BaseEvent)new SetTimeEvent();
/* 77 */     arrayOfBaseEvent[50] = (BaseEvent)new ShadowBugEvent();
/* 78 */     arrayOfBaseEvent[51] = (BaseEvent)new StrikeLightningEvent();
/* 79 */     arrayOfBaseEvent[52] = (BaseEvent)new TextEvent();
/* 80 */     arrayOfBaseEvent[53] = (BaseEvent)new WhyCantYouLeaveEvent();
/* 81 */     arrayOfBaseEvent[54] = (BaseEvent)new WrongOverlayEvent();
/* 82 */     arrayOfBaseEvent[55] = (BaseEvent)new ExperienceEvent();
/*    */     EVENTS_TO_REGISTER = CollectionsKt.listOf((Object[])arrayOfBaseEvent); }
/*    */   
/* 85 */   private static final DeferredRegister<BaseEvent> REGISTRY = DeferredRegister.create(TBSRegistries.INSTANCE.getEVENT_REGISTRY(), "thebrokenscript");
/*    */   
/*    */   public final void register(@NotNull IEventBus bus) {
/* 88 */     Intrinsics.checkNotNullParameter(bus, "bus"); for (BaseEvent event : EVENTS_TO_REGISTER) {
/* 89 */       REGISTRY.register(event.getName(), event::register$lambda$0);
/*    */     }
/*    */     
/* 92 */     REGISTRY.register(bus);
/*    */   }
/*    */   
/*    */   private static final BaseEvent register$lambda$0(BaseEvent $event) {
/*    */     return $event;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSEvents.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */