/*     */ package dev.wendigodrip.thebrokenscript.command;
/*     */ @EventBusSubscriber
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\026\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\f0\013H\002¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/command/TBSCommands;", "", "<init>", "()V", "register", "", "event", "Lnet/neoforged/neoforge/event/RegisterCommandsEvent;", "devCheck", "", "it", "Lcom/mojang/brigadier/context/CommandContext;", "Lnet/minecraft/commands/CommandSourceStack;", "thebrokenscript"})
/*     */ public final class TBSCommands { @NotNull
/*     */   public static final TBSCommands INSTANCE = new TBSCommands();
/*     */   private static final boolean register$lambda$0(CommandSourceStack it) {
/*     */     return it.hasPermission(3);
/*     */   }
/*     */   private static final int register$lambda$1(CommandContext it) {
/*     */     ConfigApi.INSTANCE.openScreen(String.valueOf((TBSConfigs.COMMON != null) ? TBSConfigs.COMMON.getId() : null));
/*     */     return 0;
/*     */   }
/*     */   private static final int register$lambda$3(CommandContext it) {
/*     */     int code = IntegerArgumentType.getInteger(it, "code");
/*     */     if (code == 2018) {
/*     */       ((CommandSourceStack)it.getSource()).sendSuccess(TBSCommands::register$lambda$3$lambda$2, true);
/*     */       for (int i = 0; i < 1000; i++) {
/*     */         CircuitEntity ent = (CircuitEntity)((EntityType)TBSEntities.CIRCUIT.get()).spawn(((CommandSourceStack)it.getSource()).getLevel(), BlockPos.containing((Position)((CommandSourceStack)it.getSource()).getPosition()), MobSpawnType.MOB_SUMMONED);
/*     */         if (ent != null)
/*     */           ent.setYRot((((CommandSourceStack)it.getSource()).getLevel()).random.nextFloat() * 360.0F); 
/*     */       } 
/*     */       return 0;
/*     */     } 
/*     */     ((CommandSourceStack)it.getSource()).sendFailure((Component)Component.literal("Dev mode code is invalid!").withStyle(ChatFormatting.RED));
/*     */     return 0;
/*     */   }
/*     */   private static final Component register$lambda$3$lambda$2() {
/*     */     return (Component)Component.literal("Dev mode enabled!").withStyle(ChatFormatting.GREEN);
/*     */   }
/*     */   
/*     */   private static final int register$lambda$4(CommandContext it) {
/*     */     Entity ent = ((CommandSourceStack)it.getSource()).getEntity();
/*     */     if (ent instanceof ServerPlayer)
/*     */       ((ServerPlayer)ent).openMenu(new TBSCommands$register$4$1(ent)); 
/*     */     return 0;
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*  39 */   public final void register(@NotNull RegisterCommandsEvent event) { Intrinsics.checkNotNullParameter(event, "event"); event.getDispatcher().register(
/*  40 */         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal("tbs").requires(TBSCommands::register$lambda$0))
/*  41 */         .then(Commands.literal("config").executes(TBSCommands::register$lambda$1)))
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  46 */         .then(((LiteralArgumentBuilder)Commands.literal("devmode").then(Commands.argument("code", (ArgumentType)IntegerArgumentType.integer(0, 9999)).executes(TBSCommands::register$lambda$3)))
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
/*  73 */           .executes(TBSCommands::register$lambda$4)))
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
/*  91 */         .then(((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal("vhs").then(Commands.literal("toggle").executes(TBSCommands::register$lambda$5)))
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
/* 102 */           .then(Commands.literal("on").executes(TBSCommands::register$lambda$6)))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 108 */           .then(Commands.literal("off").executes(TBSCommands::register$lambda$7))))
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 114 */         .then(Commands.literal("reputation").executes(TBSCommands::register$lambda$9)))
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
/* 126 */         .then((
/* 127 */           (LiteralArgumentBuilder)Commands.literal("moonglitch").then(Commands.literal("on").executes(TBSCommands::register$lambda$11)))
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
/* 139 */           .then(Commands.literal("off").executes(TBSCommands::register$lambda$13))))
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
/* 152 */         .then((
/* 153 */           (LiteralArgumentBuilder)Commands.literal("event").then(Commands.literal("random").executes(TBSCommands::register$lambda$16)))
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
/* 174 */           .then(
/* 175 */             Commands.literal("force").then(
/* 176 */               Commands.argument(
/* 177 */                 "event", (ArgumentType)ResourceLocationArgument.id())
/* 178 */               .suggests(new EventSuggestionProvider()).executes(TBSCommands::register$lambda$18)))))
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
/* 215 */         .then(
/* 216 */           Commands.literal("dev").then(
/* 217 */             Commands.literal("time").then(
/* 218 */               Commands.argument(
/* 219 */                 "time", 
/* 220 */                 (ArgumentType)EnumArgument.enumArgument(TimeOfDay.class))
/* 221 */               .executes(TBSCommands::register$lambda$19))))); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\025\020\002\032\n \004*\004\030\0010\0030\003H\026¢\006\002\020\005J \020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026¨\006\016"}, d2 = {"dev/wendigodrip/thebrokenscript/command/TBSCommands$register$4$1", "Lnet/minecraft/world/MenuProvider;", "getDisplayName", "Lnet/minecraft/network/chat/MutableComponent;", "kotlin.jvm.PlatformType", "()Lnet/minecraft/network/chat/MutableComponent;", "createMenu", "Ldev/wendigodrip/thebrokenscript/world/inventory/DevPassMenu;", "id", "", "inventory", "Lnet/minecraft/world/entity/player/Inventory;", "player", "Lnet/minecraft/world/entity/player/Player;", "thebrokenscript"}) public static final class TBSCommands$register$4$1 implements MenuProvider {
/* 222 */     TBSCommands$register$4$1(Entity $ent) {} public MutableComponent getDisplayName() { return Component.literal("DevPass"); } public DevPassMenu createMenu(int id, Inventory inventory, Player player) { Intrinsics.checkNotNullParameter(inventory, "inventory"); Intrinsics.checkNotNullParameter(player, "player"); return new DevPassMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).writeBlockPos(BlockPos.containing((Position)((ServerPlayer)this.$ent).position()))); } } private static final int register$lambda$5(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); if (MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).getShowvhs()) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;  Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).setShowvhs(false); Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).syncData((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()); } else { Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).setShowvhs(true); Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).syncData((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()); }  return 0; } private static final int register$lambda$6(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;  Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).setShowvhs(true); Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).syncData((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()); return 0; } private static final int register$lambda$7(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;  Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).setShowvhs(false); Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).syncData((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()); return 0; } private static final int register$lambda$9(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;  Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); double rep = MapVariables.Companion.get((LevelAccessor)((CommandSourceStack)it.getSource()).getLevel()).getEntityReputation(); String text = (rep <= 0.0D) ? "BAD" : (((rep == 1.0D)) ? "NORMAL" : "GOOD"); ((CommandSourceStack)it.getSource()).sendSuccess(text::register$lambda$9$lambda$8, true); return 0; } private static final int register$lambda$19(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;
/*     */     
/* 224 */     Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getLevel(), "getLevel(...)"); ((TimeOfDay)it.getArgument("time", TimeOfDay.class)).set(((CommandSourceStack)it.getSource()).getLevel());
/*     */     
/* 226 */     return 0; } private static final Component register$lambda$9$lambda$8(String $text) { return (Component)Component.literal("Reputation: ").withStyle(ChatFormatting.GREEN).append((Component)Component.literal($text).withStyle(ChatFormatting.AQUA)); } private static final int register$lambda$11(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;  EventState.moonGlitchActive = true; ((CommandSourceStack)it.getSource()).sendSuccess(TBSCommands::register$lambda$11$lambda$10, true); return 0; } private static final Component register$lambda$11$lambda$10() { return (Component)Component.literal("Set moon glitch mode to ").withStyle(ChatFormatting.GREEN).append((Component)Component.literal("ON").withStyle(ChatFormatting.AQUA)).append((Component)Component.literal("!").withStyle(ChatFormatting.GREEN)); }
/*     */   private static final int register$lambda$13(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;  EventState.moonGlitchActive = false; ((CommandSourceStack)it.getSource()).sendSuccess(TBSCommands::register$lambda$13$lambda$12, true); return 0; }
/*     */   private static final Component register$lambda$13$lambda$12() { return (Component)Component.literal("Set moon glitch mode to ").withStyle(ChatFormatting.GREEN).append((Component)Component.literal("OFF").withStyle(ChatFormatting.AQUA)).append((Component)Component.literal("!").withStyle(ChatFormatting.GREEN)); }
/*     */   private static final int register$lambda$16(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;  Intrinsics.checkNotNullExpressionValue(((CommandSourceStack)it.getSource()).getEntityOrException(), "getEntityOrException(...)"); Map.Entry ev = EventEngine.INSTANCE.execute(((CommandSourceStack)it.getSource()).getEntityOrException()); if (ev != null) { ((CommandSourceStack)it.getSource()).sendSuccess(ev::register$lambda$16$lambda$14, true); } else { ((CommandSourceStack)it.getSource()).sendSuccess(TBSCommands::register$lambda$16$lambda$15, true); }  return 0; }
/*     */   private static final Component register$lambda$16$lambda$14(Map.Entry $ev) { return (Component)Component.literal("Triggered event ").withStyle(ChatFormatting.GREEN).append((Component)Component.literal(((ResourceKey)$ev.getKey()).location().toString()).withStyle(ChatFormatting.AQUA)).append((Component)Component.literal("!").withStyle(ChatFormatting.GREEN)); }
/*     */   private static final Component register$lambda$16$lambda$15() { return (Component)Component.literal("No event triggered (picked nothing)!").withStyle(ChatFormatting.GREEN); }
/*     */   private static final int register$lambda$18(CommandContext<CommandSourceStack> it) { Intrinsics.checkNotNull(it); if (!INSTANCE.devCheck(it)) return 0;  Entity entity = ((CommandSourceStack)it.getSource()).getEntity(); if (entity == null) { ((CommandSourceStack)it.getSource()).sendFailure((Component)Component.literal("This command must only be executed by a player!").withStyle(ChatFormatting.RED)); return 0; }  ResourceLocation id = ResourceLocationArgument.getId(it, "event"); Intrinsics.checkNotNullExpressionValue(TBSRegistries.INSTANCE.getEVENT_REGISTRY().getOptional(id), "getOptional(...)"); BaseEvent item = (BaseEvent)OptionalsKt.getOrNull(TBSRegistries.INSTANCE.getEVENT_REGISTRY().getOptional(id)); if (item == null) { ((CommandSourceStack)it.getSource()).sendFailure((Component)Component.literal("Could not find event with id: " + id).withStyle(ChatFormatting.RED)); return 0; }  ((CommandSourceStack)it.getSource()).sendSuccess(id::register$lambda$18$lambda$17, true); Intrinsics.checkNotNullExpressionValue(entity.level(), "level(...)"); item.run(entity.level(), entity); return 0; }
/*     */   private static final Component register$lambda$18$lambda$17(ResourceLocation $id) { return (Component)Component.literal("Triggering event ").withStyle(ChatFormatting.GREEN).append((Component)Component.literal($id.toString()).withStyle(ChatFormatting.AQUA)).append((Component)Component.literal("...").withStyle(ChatFormatting.GREEN)); }
/* 234 */   private final boolean devCheck(CommandContext it) { if (!((TBSConfigs.COMMON != null) ? ((TBSConfigs.COMMON.enableCheats == true) ? 1 : 0) : 0)) {
/* 235 */       ((CommandSourceStack)it.getSource()).sendFailure(
/* 236 */           (Component)Component.literal("Cheats are not enabled!").withStyle(ChatFormatting.RED));
/*     */ 
/*     */       
/* 239 */       return false;
/*     */     } 
/*     */     
/* 242 */     return true; }
/*     */    }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\command\TBSCommands.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */