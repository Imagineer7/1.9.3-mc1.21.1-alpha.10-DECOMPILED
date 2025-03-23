/*     */ package dev.wendigodrip.thebrokenscript.registry;
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.neoforged.neoforge.registries.DeferredHolder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\bB\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\035\020\t\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\013\020\fR\035\020\r\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\016\020\fR\035\020\017\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\020\020\fR\035\020\021\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\022\020\fR\035\020\023\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\024\020\fR\035\020\025\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\026\020\fR\035\020\027\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\030\020\fR\035\020\031\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\032\020\fR\035\020\033\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\034\020\fR\034\020\035\032\016\022\004\022\0020\006\022\004\022\0020\0060\n8\006X\004¢\006\002\n\000R\035\020\036\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\037\020\fR\035\020 \032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b!\020\fR\034\020\"\032\016\022\004\022\0020\006\022\004\022\0020\0060\n8\006X\004¢\006\002\n\000R\035\020#\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b$\020\fR\035\020%\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b&\020\fR\035\020'\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b(\020\fR\035\020)\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b*\020\fR\035\020+\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b,\020\fR\035\020-\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b.\020\fR\035\020/\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b0\020\fR\035\0201\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b2\020\fR\035\0203\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b4\020\fR\035\0205\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b6\020\fR\035\0207\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b8\020\fR\035\0209\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b:\020\fR\035\020;\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b<\020\fR\035\020=\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b>\020\fR\034\020?\032\016\022\004\022\0020\006\022\004\022\0020\0060\n8\006X\004¢\006\002\n\000R\035\020@\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\bA\020\fR\035\020B\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\bC\020\fR\035\020D\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\bE\020\fR\035\020F\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\bG\020\fR\035\020H\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\bI\020\fR\035\020J\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\bK\020\f¨\006L"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSSounds;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/minecraft/sounds/SoundEvent;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "TREVOGA", "Lnet/neoforged/neoforge/registries/DeferredHolder;", "getTREVOGA", "()Lnet/neoforged/neoforge/registries/DeferredHolder;", "NULLCHASE", "getNULLCHASE", "NULLFLEE", "getNULLFLEE", "WHITENOISE", "getWHITENOISE", "RANDOMSONG", "getRANDOMSONG", "HEARTBEAT", "getHEARTBEAT", "GLITHCSOUND1", "getGLITHCSOUND1", "NULLKILLSPLAYER", "getNULLKILLSPLAYER", "NULLSOUND2", "getNULLSOUND2", "TEXTMADNESS1", "NULLDIMENTIONAMBIENT", "getNULLDIMENTIONAMBIENT", "NULLSAD", "getNULLSAD", "BSOD", "INTEGRITYWATCHING", "getINTEGRITYWATCHING", "NULLJUMPSCARELOUD", "getNULLJUMPSCARELOUD", "FOLLOWCHASELOOP", "getFOLLOWCHASELOOP", "FALSECALM2", "getFALSECALM2", "THEENDISNEAR", "getTHEENDISNEAR", "RECORD14", "getRECORD14", "NULLISHERELOOP", "getNULLISHERELOOP", "DISC15_BETRAY", "getDISC15_BETRAY", "YOUKNOWNOTHING", "getYOUKNOWNOTHING", "ONEOFUS", "getONEOFUS", "DISC16_YOUCANT", "getDISC16_YOUCANT", "YOUWILLREGRETTHAT", "getYOUWILLREGRETTHAT", "CIRCUITDECEIVE", "getCIRCUITDECEIVE", "MOONGLITCH", "getMOONGLITCH", "INTEGRITYDIES", "PURGATORYAMBIENCE", "getPURGATORYAMBIENCE", "CIRCUIT_JUMPSCARE", "getCIRCUIT_JUMPSCARE", "CIRCUIT_MINIGAME_SPEECH_AND_COUNTING", "getCIRCUIT_MINIGAME_SPEECH_AND_COUNTING", "THEBROKENEND_CHASE", "getTHEBROKENEND_CHASE", "FALSESUBWOOFERLULLABY", "getFALSESUBWOOFERLULLABY", "CURVED_SPAWN", "getCURVED_SPAWN", "thebrokenscript"})
/*     */ public final class TBSSounds {
/*     */   @NotNull
/*  11 */   public static final TBSSounds INSTANCE = new TBSSounds(); @NotNull private static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(
/*  12 */       BuiltInRegistries.SOUND_EVENT, 
/*  13 */       "thebrokenscript"); static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "thebrokenscript"), "create(...)"); }
/*     */   @NotNull public final DeferredRegister<SoundEvent> getREGISTRY() { return REGISTRY; } @NotNull
/*  15 */   private static final DeferredHolder<SoundEvent, SoundEvent> TREVOGA = REGISTRY.register(
/*  16 */       "trevoga", 
/*  17 */       TBSSounds::TREVOGA$lambda$0); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getTREVOGA() { return TREVOGA; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("trevoga", TBSSounds::TREVOGA$lambda$0), "register(...)"); } private static final SoundEvent TREVOGA$lambda$0() {
/*  18 */     return SoundEvent.createVariableRangeEvent(
/*  19 */         TBSConstants.id(
/*  20 */           "trevoga"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  25 */   private static final DeferredHolder<SoundEvent, SoundEvent> NULLCHASE = REGISTRY.register(
/*  26 */       "nullchase", 
/*  27 */       TBSSounds::NULLCHASE$lambda$1); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getNULLCHASE() { return NULLCHASE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nullchase", TBSSounds::NULLCHASE$lambda$1), "register(...)"); } private static final SoundEvent NULLCHASE$lambda$1() {
/*  28 */     return SoundEvent.createVariableRangeEvent(
/*  29 */         TBSConstants.id(
/*  30 */           "nullchase"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  35 */   private static final DeferredHolder<SoundEvent, SoundEvent> NULLFLEE = REGISTRY.register(
/*  36 */       "nullflee", 
/*  37 */       TBSSounds::NULLFLEE$lambda$2); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getNULLFLEE() { return NULLFLEE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nullflee", TBSSounds::NULLFLEE$lambda$2), "register(...)"); } private static final SoundEvent NULLFLEE$lambda$2() {
/*  38 */     return SoundEvent.createVariableRangeEvent(
/*  39 */         TBSConstants.id(
/*  40 */           "nullflee"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  45 */   private static final DeferredHolder<SoundEvent, SoundEvent> WHITENOISE = REGISTRY.register(
/*  46 */       "whitenoise", 
/*  47 */       TBSSounds::WHITENOISE$lambda$3); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getWHITENOISE() { return WHITENOISE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("whitenoise", TBSSounds::WHITENOISE$lambda$3), "register(...)"); } private static final SoundEvent WHITENOISE$lambda$3() {
/*  48 */     return SoundEvent.createVariableRangeEvent(
/*  49 */         TBSConstants.id(
/*  50 */           "whitenoise"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  55 */   private static final DeferredHolder<SoundEvent, SoundEvent> RANDOMSONG = REGISTRY.register(
/*  56 */       "randomsong", 
/*  57 */       TBSSounds::RANDOMSONG$lambda$4); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getRANDOMSONG() { return RANDOMSONG; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("randomsong", TBSSounds::RANDOMSONG$lambda$4), "register(...)"); } private static final SoundEvent RANDOMSONG$lambda$4() {
/*  58 */     return SoundEvent.createVariableRangeEvent(
/*  59 */         TBSConstants.id(
/*  60 */           "randomsong"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  65 */   private static final DeferredHolder<SoundEvent, SoundEvent> HEARTBEAT = REGISTRY.register(
/*  66 */       "heartbeat", 
/*  67 */       TBSSounds::HEARTBEAT$lambda$5); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getHEARTBEAT() { return HEARTBEAT; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("heartbeat", TBSSounds::HEARTBEAT$lambda$5), "register(...)"); } private static final SoundEvent HEARTBEAT$lambda$5() {
/*  68 */     return SoundEvent.createVariableRangeEvent(
/*  69 */         TBSConstants.id(
/*  70 */           "heartbeat"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  75 */   private static final DeferredHolder<SoundEvent, SoundEvent> GLITHCSOUND1 = REGISTRY.register(
/*  76 */       "glithcsound1", 
/*  77 */       TBSSounds::GLITHCSOUND1$lambda$6); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getGLITHCSOUND1() { return GLITHCSOUND1; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("glithcsound1", TBSSounds::GLITHCSOUND1$lambda$6), "register(...)"); } private static final SoundEvent GLITHCSOUND1$lambda$6() {
/*  78 */     return SoundEvent.createVariableRangeEvent(
/*  79 */         TBSConstants.id(
/*  80 */           "glithcsound1"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  85 */   private static final DeferredHolder<SoundEvent, SoundEvent> NULLKILLSPLAYER = REGISTRY.register(
/*  86 */       "nullkillsplayer", 
/*  87 */       TBSSounds::NULLKILLSPLAYER$lambda$7); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getNULLKILLSPLAYER() { return NULLKILLSPLAYER; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nullkillsplayer", TBSSounds::NULLKILLSPLAYER$lambda$7), "register(...)"); } private static final SoundEvent NULLKILLSPLAYER$lambda$7() {
/*  88 */     return SoundEvent.createVariableRangeEvent(
/*  89 */         TBSConstants.id(
/*  90 */           "nullkillsplayer"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*  95 */   private static final DeferredHolder<SoundEvent, SoundEvent> NULLSOUND2 = REGISTRY.register(
/*  96 */       "nullsound2", 
/*  97 */       TBSSounds::NULLSOUND2$lambda$8); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getNULLSOUND2() { return NULLSOUND2; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nullsound2", TBSSounds::NULLSOUND2$lambda$8), "register(...)"); } private static final SoundEvent NULLSOUND2$lambda$8() {
/*  98 */     return SoundEvent.createVariableRangeEvent(
/*  99 */         TBSConstants.id(
/* 100 */           "nullsound2"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 107 */   public static final DeferredHolder<SoundEvent, SoundEvent> TEXTMADNESS1 = REGISTRY.register(
/* 108 */       "textmadness1", 
/* 109 */       TBSSounds::TEXTMADNESS1$lambda$9); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("textmadness1", TBSSounds::TEXTMADNESS1$lambda$9), "register(...)"); } private static final SoundEvent TEXTMADNESS1$lambda$9() {
/* 110 */     return SoundEvent.createVariableRangeEvent(
/* 111 */         TBSConstants.id(
/* 112 */           "textmadness1"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 117 */   private static final DeferredHolder<SoundEvent, SoundEvent> NULLDIMENTIONAMBIENT = REGISTRY.register(
/* 118 */       "nulldimentionambient", 
/* 119 */       TBSSounds::NULLDIMENTIONAMBIENT$lambda$10); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getNULLDIMENTIONAMBIENT() { return NULLDIMENTIONAMBIENT; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nulldimentionambient", TBSSounds::NULLDIMENTIONAMBIENT$lambda$10), "register(...)"); } private static final SoundEvent NULLDIMENTIONAMBIENT$lambda$10() {
/* 120 */     return SoundEvent.createVariableRangeEvent(
/* 121 */         TBSConstants.id(
/* 122 */           "nulldimentionambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 127 */   private static final DeferredHolder<SoundEvent, SoundEvent> NULLSAD = REGISTRY.register(
/* 128 */       "nullsad", 
/* 129 */       TBSSounds::NULLSAD$lambda$11); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getNULLSAD() { return NULLSAD; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nullsad", TBSSounds::NULLSAD$lambda$11), "register(...)"); } private static final SoundEvent NULLSAD$lambda$11() {
/* 130 */     return SoundEvent.createVariableRangeEvent(
/* 131 */         TBSConstants.id(
/* 132 */           "nullsad"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 139 */   public static final DeferredHolder<SoundEvent, SoundEvent> BSOD = REGISTRY.register(
/* 140 */       "bsod", 
/* 141 */       TBSSounds::BSOD$lambda$12); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("bsod", TBSSounds::BSOD$lambda$12), "register(...)"); } private static final SoundEvent BSOD$lambda$12() {
/* 142 */     return SoundEvent.createVariableRangeEvent(
/* 143 */         TBSConstants.id(
/* 144 */           "bsod"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 149 */   private static final DeferredHolder<SoundEvent, SoundEvent> INTEGRITYWATCHING = REGISTRY.register(
/* 150 */       "integritywatching", 
/* 151 */       TBSSounds::INTEGRITYWATCHING$lambda$13); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getINTEGRITYWATCHING() { return INTEGRITYWATCHING; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("integritywatching", TBSSounds::INTEGRITYWATCHING$lambda$13), "register(...)"); } private static final SoundEvent INTEGRITYWATCHING$lambda$13() {
/* 152 */     return SoundEvent.createVariableRangeEvent(
/* 153 */         TBSConstants.id(
/* 154 */           "integritywatching"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 159 */   private static final DeferredHolder<SoundEvent, SoundEvent> NULLJUMPSCARELOUD = REGISTRY.register(
/* 160 */       "nulljumpscareloud", 
/* 161 */       TBSSounds::NULLJUMPSCARELOUD$lambda$14); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getNULLJUMPSCARELOUD() { return NULLJUMPSCARELOUD; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nulljumpscareloud", TBSSounds::NULLJUMPSCARELOUD$lambda$14), "register(...)"); } private static final SoundEvent NULLJUMPSCARELOUD$lambda$14() {
/* 162 */     return SoundEvent.createVariableRangeEvent(
/* 163 */         TBSConstants.id(
/* 164 */           "nulljumpscareloud"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 169 */   private static final DeferredHolder<SoundEvent, SoundEvent> FOLLOWCHASELOOP = REGISTRY.register(
/* 170 */       "followchaseloop", 
/* 171 */       TBSSounds::FOLLOWCHASELOOP$lambda$15); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getFOLLOWCHASELOOP() { return FOLLOWCHASELOOP; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("followchaseloop", TBSSounds::FOLLOWCHASELOOP$lambda$15), "register(...)"); } private static final SoundEvent FOLLOWCHASELOOP$lambda$15() {
/* 172 */     return SoundEvent.createVariableRangeEvent(
/* 173 */         TBSConstants.id(
/* 174 */           "followchaseloop"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 179 */   private static final DeferredHolder<SoundEvent, SoundEvent> FALSECALM2 = REGISTRY.register(
/* 180 */       "falsecalm2", 
/* 181 */       TBSSounds::FALSECALM2$lambda$16); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getFALSECALM2() { return FALSECALM2; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("falsecalm2", TBSSounds::FALSECALM2$lambda$16), "register(...)"); } private static final SoundEvent FALSECALM2$lambda$16() {
/* 182 */     return SoundEvent.createVariableRangeEvent(
/* 183 */         TBSConstants.id(
/* 184 */           "falsecalm2"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 189 */   private static final DeferredHolder<SoundEvent, SoundEvent> THEENDISNEAR = REGISTRY.register(
/* 190 */       "theendisnear", 
/* 191 */       TBSSounds::THEENDISNEAR$lambda$17); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getTHEENDISNEAR() { return THEENDISNEAR; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("theendisnear", TBSSounds::THEENDISNEAR$lambda$17), "register(...)"); } private static final SoundEvent THEENDISNEAR$lambda$17() {
/* 192 */     return SoundEvent.createVariableRangeEvent(
/* 193 */         TBSConstants.id(
/* 194 */           "theendisnear"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 199 */   private static final DeferredHolder<SoundEvent, SoundEvent> RECORD14 = REGISTRY.register(
/* 200 */       "record14", 
/* 201 */       TBSSounds::RECORD14$lambda$18); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getRECORD14() { return RECORD14; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("record14", TBSSounds::RECORD14$lambda$18), "register(...)"); } private static final SoundEvent RECORD14$lambda$18() {
/* 202 */     return SoundEvent.createVariableRangeEvent(
/* 203 */         TBSConstants.id(
/* 204 */           "record14"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 209 */   private static final DeferredHolder<SoundEvent, SoundEvent> NULLISHERELOOP = REGISTRY.register(
/* 210 */       "nullishereloop", 
/* 211 */       TBSSounds::NULLISHERELOOP$lambda$19); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getNULLISHERELOOP() { return NULLISHERELOOP; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nullishereloop", TBSSounds::NULLISHERELOOP$lambda$19), "register(...)"); } private static final SoundEvent NULLISHERELOOP$lambda$19() {
/* 212 */     return SoundEvent.createVariableRangeEvent(
/* 213 */         TBSConstants.id(
/* 214 */           "nullishereloop"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 219 */   private static final DeferredHolder<SoundEvent, SoundEvent> DISC15_BETRAY = REGISTRY.register(
/* 220 */       "disc15.betray", 
/* 221 */       TBSSounds::DISC15_BETRAY$lambda$20); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getDISC15_BETRAY() { return DISC15_BETRAY; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("disc15.betray", TBSSounds::DISC15_BETRAY$lambda$20), "register(...)"); } private static final SoundEvent DISC15_BETRAY$lambda$20() {
/* 222 */     return SoundEvent.createVariableRangeEvent(
/* 223 */         TBSConstants.id(
/* 224 */           "disc15.betray"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 229 */   private static final DeferredHolder<SoundEvent, SoundEvent> YOUKNOWNOTHING = REGISTRY.register(
/* 230 */       "youknownothing", 
/* 231 */       TBSSounds::YOUKNOWNOTHING$lambda$21); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getYOUKNOWNOTHING() { return YOUKNOWNOTHING; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("youknownothing", TBSSounds::YOUKNOWNOTHING$lambda$21), "register(...)"); } private static final SoundEvent YOUKNOWNOTHING$lambda$21() {
/* 232 */     return SoundEvent.createVariableRangeEvent(
/* 233 */         TBSConstants.id(
/* 234 */           "youknownothing"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 239 */   private static final DeferredHolder<SoundEvent, SoundEvent> ONEOFUS = REGISTRY.register(
/* 240 */       "oneofus", 
/* 241 */       TBSSounds::ONEOFUS$lambda$22); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getONEOFUS() { return ONEOFUS; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("oneofus", TBSSounds::ONEOFUS$lambda$22), "register(...)"); } private static final SoundEvent ONEOFUS$lambda$22() {
/* 242 */     return SoundEvent.createVariableRangeEvent(
/* 243 */         TBSConstants.id(
/* 244 */           "oneofus"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 249 */   private static final DeferredHolder<SoundEvent, SoundEvent> DISC16_YOUCANT = REGISTRY.register(
/* 250 */       "disc16.youcant", 
/* 251 */       TBSSounds::DISC16_YOUCANT$lambda$23); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getDISC16_YOUCANT() { return DISC16_YOUCANT; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("disc16.youcant", TBSSounds::DISC16_YOUCANT$lambda$23), "register(...)"); } private static final SoundEvent DISC16_YOUCANT$lambda$23() {
/* 252 */     return SoundEvent.createVariableRangeEvent(
/* 253 */         TBSConstants.id(
/* 254 */           "disc16.youcant"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 259 */   private static final DeferredHolder<SoundEvent, SoundEvent> YOUWILLREGRETTHAT = REGISTRY.register(
/* 260 */       "youwillregretthat", 
/* 261 */       TBSSounds::YOUWILLREGRETTHAT$lambda$24); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getYOUWILLREGRETTHAT() { return YOUWILLREGRETTHAT; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("youwillregretthat", TBSSounds::YOUWILLREGRETTHAT$lambda$24), "register(...)"); } private static final SoundEvent YOUWILLREGRETTHAT$lambda$24() {
/* 262 */     return SoundEvent.createVariableRangeEvent(
/* 263 */         TBSConstants.id(
/* 264 */           "youwillregretthat"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 269 */   private static final DeferredHolder<SoundEvent, SoundEvent> CIRCUITDECEIVE = REGISTRY.register(
/* 270 */       "circuitdeceive", 
/* 271 */       TBSSounds::CIRCUITDECEIVE$lambda$25); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getCIRCUITDECEIVE() { return CIRCUITDECEIVE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("circuitdeceive", TBSSounds::CIRCUITDECEIVE$lambda$25), "register(...)"); } private static final SoundEvent CIRCUITDECEIVE$lambda$25() {
/* 272 */     return SoundEvent.createVariableRangeEvent(
/* 273 */         TBSConstants.id(
/* 274 */           "circuitdeceive"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 279 */   private static final DeferredHolder<SoundEvent, SoundEvent> MOONGLITCH = REGISTRY.register(
/* 280 */       "moonglitch", 
/* 281 */       TBSSounds::MOONGLITCH$lambda$26); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getMOONGLITCH() { return MOONGLITCH; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("moonglitch", TBSSounds::MOONGLITCH$lambda$26), "register(...)"); } private static final SoundEvent MOONGLITCH$lambda$26() {
/* 282 */     return SoundEvent.createVariableRangeEvent(
/* 283 */         TBSConstants.id(
/* 284 */           "moonglitch"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 291 */   public static final DeferredHolder<SoundEvent, SoundEvent> INTEGRITYDIES = REGISTRY.register(
/* 292 */       "integritydies", 
/* 293 */       TBSSounds::INTEGRITYDIES$lambda$27); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("integritydies", TBSSounds::INTEGRITYDIES$lambda$27), "register(...)"); } private static final SoundEvent INTEGRITYDIES$lambda$27() {
/* 294 */     return SoundEvent.createVariableRangeEvent(
/* 295 */         TBSConstants.id(
/* 296 */           "integritydies"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 301 */   private static final DeferredHolder<SoundEvent, SoundEvent> PURGATORYAMBIENCE = REGISTRY.register(
/* 302 */       "purgatoryambience", 
/* 303 */       TBSSounds::PURGATORYAMBIENCE$lambda$28); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getPURGATORYAMBIENCE() { return PURGATORYAMBIENCE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("purgatoryambience", TBSSounds::PURGATORYAMBIENCE$lambda$28), "register(...)"); } private static final SoundEvent PURGATORYAMBIENCE$lambda$28() {
/* 304 */     return SoundEvent.createVariableRangeEvent(
/* 305 */         TBSConstants.id(
/* 306 */           "purgatoryambience"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 311 */   private static final DeferredHolder<SoundEvent, SoundEvent> CIRCUIT_JUMPSCARE = REGISTRY.register(
/* 312 */       "circuit_jumpscare", 
/* 313 */       TBSSounds::CIRCUIT_JUMPSCARE$lambda$29); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getCIRCUIT_JUMPSCARE() { return CIRCUIT_JUMPSCARE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("circuit_jumpscare", TBSSounds::CIRCUIT_JUMPSCARE$lambda$29), "register(...)"); } private static final SoundEvent CIRCUIT_JUMPSCARE$lambda$29() {
/* 314 */     return SoundEvent.createVariableRangeEvent(
/* 315 */         TBSConstants.id(
/* 316 */           "circuit_jumpscare"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 321 */   private static final DeferredHolder<SoundEvent, SoundEvent> CIRCUIT_MINIGAME_SPEECH_AND_COUNTING = REGISTRY.register(
/* 322 */       "circuitminigamespeechandcounting", 
/* 323 */       TBSSounds::CIRCUIT_MINIGAME_SPEECH_AND_COUNTING$lambda$30); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getCIRCUIT_MINIGAME_SPEECH_AND_COUNTING() { return CIRCUIT_MINIGAME_SPEECH_AND_COUNTING; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("circuitminigamespeechandcounting", TBSSounds::CIRCUIT_MINIGAME_SPEECH_AND_COUNTING$lambda$30), "register(...)"); } private static final SoundEvent CIRCUIT_MINIGAME_SPEECH_AND_COUNTING$lambda$30() {
/* 324 */     return SoundEvent.createVariableRangeEvent(
/* 325 */         TBSConstants.id(
/* 326 */           "circuitminigamespeechandcounting"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 331 */   private static final DeferredHolder<SoundEvent, SoundEvent> THEBROKENEND_CHASE = REGISTRY.register(
/* 332 */       "thebrokenend_chase", 
/* 333 */       TBSSounds::THEBROKENEND_CHASE$lambda$31); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getTHEBROKENEND_CHASE() { return THEBROKENEND_CHASE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("thebrokenend_chase", TBSSounds::THEBROKENEND_CHASE$lambda$31), "register(...)"); } private static final SoundEvent THEBROKENEND_CHASE$lambda$31() {
/* 334 */     return SoundEvent.createVariableRangeEvent(
/* 335 */         TBSConstants.id(
/* 336 */           "thebrokenend_chase"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 341 */   private static final DeferredHolder<SoundEvent, SoundEvent> FALSESUBWOOFERLULLABY = REGISTRY.register(
/* 342 */       "falsesubwooferlullaby", 
/* 343 */       TBSSounds::FALSESUBWOOFERLULLABY$lambda$32); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getFALSESUBWOOFERLULLABY() { return FALSESUBWOOFERLULLABY; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("falsesubwooferlullaby", TBSSounds::FALSESUBWOOFERLULLABY$lambda$32), "register(...)"); } private static final SoundEvent FALSESUBWOOFERLULLABY$lambda$32() {
/* 344 */     return SoundEvent.createVariableRangeEvent(
/* 345 */         TBSConstants.id(
/* 346 */           "falsesubwooferlullaby"));
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/* 351 */   private static final DeferredHolder<SoundEvent, SoundEvent> CURVED_SPAWN = REGISTRY.register(
/* 352 */       "curved_spawn", 
/* 353 */       TBSSounds::CURVED_SPAWN$lambda$33); @NotNull public final DeferredHolder<SoundEvent, SoundEvent> getCURVED_SPAWN() { return CURVED_SPAWN; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("curved_spawn", TBSSounds::CURVED_SPAWN$lambda$33), "register(...)"); } private static final SoundEvent CURVED_SPAWN$lambda$33() {
/* 354 */     return SoundEvent.createVariableRangeEvent(
/* 355 */         TBSConstants.id(
/* 356 */           "curved_spawn"));
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSSounds.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */