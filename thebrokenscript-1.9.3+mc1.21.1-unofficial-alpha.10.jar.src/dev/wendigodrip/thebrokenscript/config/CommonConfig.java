/*    */ package dev.wendigodrip.thebrokenscript.config;
/*    */ 
/*    */ 
/*    */ @Version(version = 1)
/*    */ @AdminAccess(perms = {"thebrokenscript.config.edit.server"}, fallback = 3)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\"\n\002\030\002\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003R$\020\004\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b\006\020\003\032\004\b\007\020\b\"\004\b\t\020\nR\030\020\013\032\0020\0058\006@\006X\016¢\006\b\n\000\022\004\b\f\020\003R\030\020\r\032\0020\0058\006@\006X\016¢\006\b\n\000\022\004\b\016\020\003R$\020\017\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b\020\020\003\032\004\b\021\020\b\"\004\b\022\020\nR\030\020\023\032\0020\0058\006@\006X\016¢\006\b\n\000\022\004\b\024\020\003R$\020\025\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b\026\020\003\032\004\b\027\020\b\"\004\b\030\020\nR\030\020\031\032\0020\0058\006@\006X\016¢\006\b\n\000\022\004\b\032\020\003R$\020\033\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b\034\020\003\032\004\b\035\020\b\"\004\b\036\020\nR$\020\037\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b \020\003\032\004\b!\020\b\"\004\b\"\020\nR$\020#\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b$\020\003\032\004\b%\020\b\"\004\b&\020\nR\030\020'\032\0020(8\006@\006X\016¢\006\b\n\000\022\004\b)\020\003R\030\020*\032\0020\0058\006@\006X\016¢\006\b\n\000\022\004\b+\020\003R\036\020,\032\b\022\004\022\0020.0-8\006@\006X\016¢\006\b\n\000\022\004\b/\020\003¨\0060"}, d2 = {"Ldev/wendigodrip/thebrokenscript/config/CommonConfig;", "Lme/fzzyhmstrs/fzzy_config/config/Config;", "<init>", "()V", "enableRandomEvents", "", "getEnableRandomEvents$annotations", "getEnableRandomEvents", "()Z", "setEnableRandomEvents", "(Z)V", "disableSpawningEntities", "getDisableSpawningEntities$annotations", "disableRandomStructures", "getDisableRandomStructures$annotations", "disableBanning", "getDisableBanning$annotations", "getDisableBanning", "setDisableBanning", "disableBlockBreaking", "getDisableBlockBreaking$annotations", "disableBaseExplosion", "getDisableBaseExplosion$annotations", "getDisableBaseExplosion", "setDisableBaseExplosion", "disableRandomJumpscares", "getDisableRandomJumpscares$annotations", "disableNewMobSpawning", "getDisableNewMobSpawning$annotations", "getDisableNewMobSpawning", "setDisableNewMobSpawning", "removeDeepslate", "getRemoveDeepslate$annotations", "getRemoveDeepslate", "setRemoveDeepslate", "disableAttackCooldown", "getDisableAttackCooldown$annotations", "getDisableAttackCooldown", "setDisableAttackCooldown", "eventFrequencyPerTick", "Lme/fzzyhmstrs/fzzy_config/validation/number/ValidatedDouble;", "getEventFrequencyPerTick$annotations", "enableCheats", "getEnableCheats$annotations", "enabledEvents", "Lme/fzzyhmstrs/fzzy_config/validation/collection/ValidatedChoiceList;", "Lnet/minecraft/resources/ResourceLocation;", "getEnabledEvents$annotations", "thebrokenscript"})
/*    */ public final class CommonConfig extends Config {
/*    */   private boolean enableRandomEvents;
/*    */   @JvmField
/*    */   public boolean disableSpawningEntities;
/*    */   @JvmField
/*    */   public boolean disableRandomStructures;
/*    */   private boolean disableBanning;
/*    */   @JvmField
/*    */   public boolean disableBlockBreaking;
/*    */   private boolean disableBaseExplosion;
/*    */   
/* 18 */   public CommonConfig() { super(TBSConstants.id("server_config"), null, null, null, 14, null);
/*    */     
/* 20 */     this.enableRandomEvents = true;
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
/* 48 */     this.disableNewMobSpawning = true;
/*    */ 
/*    */     
/* 51 */     this.removeDeepslate = true;
/*    */ 
/*    */     
/* 54 */     this.disableAttackCooldown = true;
/*    */ 
/*    */ 
/*    */     
/* 58 */     this.eventFrequencyPerTick = new ValidatedDouble(
/* 59 */         3.0E-4D, 0.001D, 0.0D, ValidatedNumber.WidgetType.TEXTBOX_WITH_BUTTONS);
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
/* 70 */     Intrinsics.checkNotNullExpressionValue(TBSRegistries.INSTANCE.getEVENT_REGISTRY().keySet(), "keySet(...)");
/*    */     
/* 72 */     Intrinsics.checkNotNullExpressionValue(TBSRegistries.INSTANCE.getEVENT_REGISTRY().keySet(), "keySet(...)"); this.enabledEvents = ValidatedIdentifier.Companion.ofRegistry(TBSConstants.id("empty"), TBSRegistries.INSTANCE.getEVENT_REGISTRY()).toList(CollectionsKt.toList(TBSRegistries.INSTANCE.getEVENT_REGISTRY().keySet())).toChoiceList(CollectionsKt.toList(TBSRegistries.INSTANCE.getEVENT_REGISTRY().keySet()), 
/* 73 */         ValidatedChoiceList.WidgetType.INLINE, 
/* 74 */         CommonConfig::enabledEvents$lambda$0, 
/* 75 */         CommonConfig::enabledEvents$lambda$1); } @JvmField public boolean disableRandomJumpscares; private boolean disableNewMobSpawning; private boolean removeDeepslate; private boolean disableAttackCooldown; @JvmField @NotNull public ValidatedDouble eventFrequencyPerTick; @JvmField public boolean enableCheats; @JvmField @NotNull public ValidatedChoiceList<ResourceLocation> enabledEvents; public final boolean getEnableRandomEvents() { return this.enableRandomEvents; } public final void setEnableRandomEvents(boolean <set-?>) { this.enableRandomEvents = <set-?>; } public final boolean getDisableBanning() { return this.disableBanning; } public final void setDisableBanning(boolean <set-?>) { this.disableBanning = <set-?>; } public final boolean getDisableBaseExplosion() { return this.disableBaseExplosion; } public final void setDisableBaseExplosion(boolean <set-?>) { this.disableBaseExplosion = <set-?>; } private static final Component enabledEvents$lambda$1(ResourceLocation it, String paramString) { Intrinsics.checkNotNullParameter(it, "it"); Intrinsics.checkNotNullParameter(paramString, "<unused var>"); return (Component)Component.literal("Toggles the " + it + " event."); }
/*    */ 
/*    */   
/*    */   public final boolean getDisableNewMobSpawning() {
/*    */     return this.disableNewMobSpawning;
/*    */   }
/*    */   
/*    */   public final void setDisableNewMobSpawning(boolean <set-?>) {
/*    */     this.disableNewMobSpawning = <set-?>;
/*    */   }
/*    */   
/*    */   public final boolean getRemoveDeepslate() {
/*    */     return this.removeDeepslate;
/*    */   }
/*    */   
/*    */   public final void setRemoveDeepslate(boolean <set-?>) {
/*    */     this.removeDeepslate = <set-?>;
/*    */   }
/*    */   
/*    */   public final boolean getDisableAttackCooldown() {
/*    */     return this.disableAttackCooldown;
/*    */   }
/*    */   
/*    */   public final void setDisableAttackCooldown(boolean <set-?>) {
/*    */     this.disableAttackCooldown = <set-?>;
/*    */   }
/*    */   
/*    */   private static final MutableComponent enabledEvents$lambda$0(ResourceLocation it, String paramString) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     Intrinsics.checkNotNullParameter(paramString, "<unused var>");
/*    */     return Component.literal(it.getPath());
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\config\CommonConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */