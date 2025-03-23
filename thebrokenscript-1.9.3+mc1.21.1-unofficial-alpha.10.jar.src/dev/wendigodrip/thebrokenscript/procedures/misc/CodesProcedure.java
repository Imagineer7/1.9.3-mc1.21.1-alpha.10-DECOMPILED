/*     */ package dev.wendigodrip.thebrokenscript.procedures.misc;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSSounds;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundEvents;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.neoforged.bus.api.Event;
/*     */ import net.neoforged.bus.api.SubscribeEvent;
/*     */ import net.neoforged.fml.common.EventBusSubscriber;
/*     */ import net.neoforged.neoforge.event.ServerChatEvent;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\020\016\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J0\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020J<\020\b\032\0020\0052\b\020\006\032\004\030\0010\0212\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020H\002¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/misc/CodesProcedure;", "", "<init>", "()V", "onChat", "", "event", "Lnet/neoforged/neoforge/event/ServerChatEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "text", "", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*     */ public final class CodesProcedure {
/*     */   @SubscribeEvent
/*     */   public final void onChat(@NotNull ServerChatEvent event) {
/*  31 */     Intrinsics.checkNotNullParameter(event, "event");
/*  32 */     Intrinsics.checkNotNullExpressionValue(event.getPlayer().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getPlayer().level(), event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getRawText());
/*     */   }
/*     */   @NotNull
/*     */   public static final CodesProcedure INSTANCE = new CodesProcedure();
/*     */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable String text) {
/*  37 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z, text);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final void execute(Event event, LevelAccessor world, double x, double y, double z, String text) {
/*     */     // Byte code:
/*     */     //   0: aload #9
/*     */     //   2: ifnonnull -> 6
/*     */     //   5: return
/*     */     //   6: aload #9
/*     */     //   8: checkcast java/lang/CharSequence
/*     */     //   11: ldc 'Hello'
/*     */     //   13: checkcast java/lang/CharSequence
/*     */     //   16: iconst_0
/*     */     //   17: iconst_2
/*     */     //   18: aconst_null
/*     */     //   19: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   22: ifne -> 44
/*     */     //   25: aload #9
/*     */     //   27: checkcast java/lang/CharSequence
/*     */     //   30: ldc 'Hi?'
/*     */     //   32: checkcast java/lang/CharSequence
/*     */     //   35: iconst_0
/*     */     //   36: iconst_2
/*     */     //   37: aconst_null
/*     */     //   38: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   41: ifeq -> 70
/*     */     //   44: invokestatic create : ()Lnet/minecraft/util/RandomSource;
/*     */     //   47: sipush #500
/*     */     //   50: sipush #800
/*     */     //   53: invokestatic nextInt : (Lnet/minecraft/util/RandomSource;II)I
/*     */     //   56: aload_2
/*     */     //   57: dload_3
/*     */     //   58: dload #5
/*     */     //   60: dload #7
/*     */     //   62: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   67: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   70: aload #9
/*     */     //   72: checkcast java/lang/CharSequence
/*     */     //   75: ldc 'Who are you?'
/*     */     //   77: checkcast java/lang/CharSequence
/*     */     //   80: iconst_0
/*     */     //   81: iconst_2
/*     */     //   82: aconst_null
/*     */     //   83: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   86: ifeq -> 105
/*     */     //   89: bipush #100
/*     */     //   91: aload_2
/*     */     //   92: dload_3
/*     */     //   93: dload #5
/*     */     //   95: dload #7
/*     */     //   97: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   102: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   105: aload #9
/*     */     //   107: ldc 'What do you want?'
/*     */     //   109: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   112: ifeq -> 131
/*     */     //   115: bipush #100
/*     */     //   117: aload_2
/*     */     //   118: dload_3
/*     */     //   119: dload #5
/*     */     //   121: dload #7
/*     */     //   123: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   128: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   131: aload #9
/*     */     //   133: ldc 'null'
/*     */     //   135: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   138: ifeq -> 157
/*     */     //   141: bipush #100
/*     */     //   143: aload_2
/*     */     //   144: dload_3
/*     */     //   145: dload #5
/*     */     //   147: dload #7
/*     */     //   149: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   154: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   157: aload #9
/*     */     //   159: ldc 'Can you see me?'
/*     */     //   161: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   164: ifeq -> 183
/*     */     //   167: bipush #100
/*     */     //   169: aload_2
/*     */     //   170: dload_3
/*     */     //   171: dload #5
/*     */     //   173: dload #7
/*     */     //   175: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   180: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   183: aload #9
/*     */     //   185: ldc 'Friend?'
/*     */     //   187: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   190: ifeq -> 209
/*     */     //   193: bipush #100
/*     */     //   195: aload_2
/*     */     //   196: dload_3
/*     */     //   197: dload #5
/*     */     //   199: dload #7
/*     */     //   201: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   206: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   209: aload #9
/*     */     //   211: ldc 'Fuck you'
/*     */     //   213: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   216: ifeq -> 235
/*     */     //   219: bipush #100
/*     */     //   221: aload_2
/*     */     //   222: dload_3
/*     */     //   223: dload #5
/*     */     //   225: dload #7
/*     */     //   227: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   232: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   235: aload #9
/*     */     //   237: ldc 'How can I help you?'
/*     */     //   239: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   242: ifeq -> 261
/*     */     //   245: bipush #100
/*     */     //   247: aload_2
/*     */     //   248: dload_3
/*     */     //   249: dload #5
/*     */     //   251: dload #7
/*     */     //   253: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   258: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   261: aload #9
/*     */     //   263: ldc 'Herobrine'
/*     */     //   265: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   268: ifeq -> 287
/*     */     //   271: bipush #100
/*     */     //   273: aload_2
/*     */     //   274: dload_3
/*     */     //   275: dload #5
/*     */     //   277: dload #7
/*     */     //   279: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   284: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   287: aload #9
/*     */     //   289: ldc 'Entity 303'
/*     */     //   291: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   294: ifeq -> 313
/*     */     //   297: bipush #100
/*     */     //   299: aload_2
/*     */     //   300: dload_3
/*     */     //   301: dload #5
/*     */     //   303: dload #7
/*     */     //   305: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   310: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   313: aload #9
/*     */     //   315: ldc 'Integrity'
/*     */     //   317: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   320: ifeq -> 339
/*     */     //   323: bipush #100
/*     */     //   325: aload_2
/*     */     //   326: dload_3
/*     */     //   327: dload #5
/*     */     //   329: dload #7
/*     */     //   331: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   336: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   339: aload #9
/*     */     //   341: ldc 'clan_build'
/*     */     //   343: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   346: ifeq -> 365
/*     */     //   349: bipush #100
/*     */     //   351: aload_2
/*     */     //   352: dload_3
/*     */     //   353: dload #5
/*     */     //   355: dload #7
/*     */     //   357: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   362: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   365: aload #9
/*     */     //   367: ldc 'xXram2dieXx'
/*     */     //   369: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   372: ifeq -> 391
/*     */     //   375: bipush #100
/*     */     //   377: aload_2
/*     */     //   378: dload_3
/*     */     //   379: dload #5
/*     */     //   381: dload #7
/*     */     //   383: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   388: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   391: aload #9
/*     */     //   393: ldc 'Revuxor'
/*     */     //   395: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   398: ifeq -> 417
/*     */     //   401: bipush #100
/*     */     //   403: aload_2
/*     */     //   404: dload_3
/*     */     //   405: dload #5
/*     */     //   407: dload #7
/*     */     //   409: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   414: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   417: aload #9
/*     */     //   419: ldc 'Follow'
/*     */     //   421: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   424: ifeq -> 443
/*     */     //   427: bipush #100
/*     */     //   429: aload_2
/*     */     //   430: dload_3
/*     */     //   431: dload #5
/*     */     //   433: dload #7
/*     */     //   435: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   440: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   443: aload #9
/*     */     //   445: ldc 'Nothingiswatching'
/*     */     //   447: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   450: ifeq -> 469
/*     */     //   453: bipush #100
/*     */     //   455: aload_2
/*     */     //   456: dload_3
/*     */     //   457: dload #5
/*     */     //   459: dload #7
/*     */     //   461: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   466: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   469: aload #9
/*     */     //   471: ldc 'Circuit'
/*     */     //   473: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   476: ifeq -> 495
/*     */     //   479: bipush #100
/*     */     //   481: aload_2
/*     */     //   482: dload_3
/*     */     //   483: dload #5
/*     */     //   485: dload #7
/*     */     //   487: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   492: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   495: aload #9
/*     */     //   497: ldc 'Steve'
/*     */     //   499: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   502: ifeq -> 521
/*     */     //   505: bipush #100
/*     */     //   507: aload_2
/*     */     //   508: dload_3
/*     */     //   509: dload #5
/*     */     //   511: dload #7
/*     */     //   513: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   518: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   521: aload #9
/*     */     //   523: ldc 'Void'
/*     */     //   525: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   528: ifeq -> 547
/*     */     //   531: bipush #100
/*     */     //   533: aload_2
/*     */     //   534: dload_3
/*     */     //   535: dload #5
/*     */     //   537: dload #7
/*     */     //   539: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   544: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   547: aload #9
/*     */     //   549: ldc 'The broken end'
/*     */     //   551: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   554: ifeq -> 573
/*     */     //   557: bipush #100
/*     */     //   559: aload_2
/*     */     //   560: dload_3
/*     */     //   561: dload #5
/*     */     //   563: dload #7
/*     */     //   565: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   570: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   573: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #41	-> 0
/*     */     //   #42	-> 5
/*     */     //   #44	-> 6
/*     */     //   #46	-> 44
/*     */     //   #47	-> 56
/*     */     //   #45	-> 56
/*     */     //   #71	-> 70
/*     */     //   #73	-> 89
/*     */     //   #74	-> 91
/*     */     //   #72	-> 91
/*     */     //   #98	-> 105
/*     */     //   #100	-> 115
/*     */     //   #101	-> 117
/*     */     //   #99	-> 117
/*     */     //   #125	-> 131
/*     */     //   #127	-> 141
/*     */     //   #128	-> 143
/*     */     //   #126	-> 143
/*     */     //   #213	-> 157
/*     */     //   #215	-> 167
/*     */     //   #216	-> 169
/*     */     //   #214	-> 169
/*     */     //   #313	-> 183
/*     */     //   #315	-> 193
/*     */     //   #316	-> 195
/*     */     //   #314	-> 195
/*     */     //   #327	-> 209
/*     */     //   #329	-> 219
/*     */     //   #330	-> 221
/*     */     //   #328	-> 221
/*     */     //   #360	-> 235
/*     */     //   #362	-> 245
/*     */     //   #363	-> 247
/*     */     //   #361	-> 247
/*     */     //   #381	-> 261
/*     */     //   #383	-> 271
/*     */     //   #384	-> 273
/*     */     //   #382	-> 273
/*     */     //   #402	-> 287
/*     */     //   #404	-> 297
/*     */     //   #405	-> 299
/*     */     //   #403	-> 299
/*     */     //   #423	-> 313
/*     */     //   #425	-> 323
/*     */     //   #426	-> 325
/*     */     //   #424	-> 325
/*     */     //   #444	-> 339
/*     */     //   #446	-> 349
/*     */     //   #447	-> 351
/*     */     //   #445	-> 351
/*     */     //   #465	-> 365
/*     */     //   #467	-> 375
/*     */     //   #468	-> 377
/*     */     //   #466	-> 377
/*     */     //   #497	-> 391
/*     */     //   #499	-> 401
/*     */     //   #500	-> 403
/*     */     //   #498	-> 403
/*     */     //   #518	-> 417
/*     */     //   #520	-> 427
/*     */     //   #521	-> 429
/*     */     //   #519	-> 429
/*     */     //   #539	-> 443
/*     */     //   #541	-> 453
/*     */     //   #542	-> 455
/*     */     //   #540	-> 455
/*     */     //   #560	-> 469
/*     */     //   #562	-> 479
/*     */     //   #563	-> 481
/*     */     //   #561	-> 481
/*     */     //   #581	-> 495
/*     */     //   #583	-> 505
/*     */     //   #584	-> 507
/*     */     //   #582	-> 507
/*     */     //   #602	-> 521
/*     */     //   #604	-> 531
/*     */     //   #605	-> 533
/*     */     //   #603	-> 533
/*     */     //   #623	-> 547
/*     */     //   #625	-> 557
/*     */     //   #626	-> 559
/*     */     //   #624	-> 559
/*     */     //   #644	-> 573
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	574	0	this	Ldev/wendigodrip/thebrokenscript/procedures/misc/CodesProcedure;
/*     */     //   0	574	1	event	Lnet/neoforged/bus/api/Event;
/*     */     //   0	574	2	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	574	3	x	D
/*     */     //   0	574	5	y	D
/*     */     //   0	574	7	z	D
/*     */     //   0	574	9	text	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$0(LevelAccessor $world, double $x, double $y, double $z) {
/*  48 */     if ($world instanceof Level) {
/*  49 */       if (!((Level)$world).isClientSide()) {
/*  50 */         ((Level)$world).playSound(
/*  51 */             null, 
/*  52 */             BlockPos.containing($x, $y, $z), 
/*  53 */             (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), 
/*  54 */             SoundSource.NEUTRAL, 
/*  55 */             555.0F, 
/*  56 */             0.0F);
/*     */       } else {
/*     */         
/*  59 */         ((Level)$world).playLocalSound(
/*  60 */             $x, $y, $z, (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       } 
/*     */     }
/*     */     
/*  64 */     if (!$world.isClientSide() && $world.getServer() != null) {
/*  65 */       Intrinsics.checkNotNull($world.getServer()); $world.getServer().getPlayerList().broadcastSystemMessage(
/*  66 */           (Component)Component.literal("<Null> err.type=null.hello"), false);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$1(LevelAccessor $world, double $x, double $y, double $z) {
/*  75 */     if (!$world.isClientSide() && $world.getServer() != null) {
/*  76 */       Intrinsics.checkNotNull($world.getServer()); $world.getServer().getPlayerList().broadcastSystemMessage(
/*  77 */           (Component)Component.literal("<Null> err.type=null."), false);
/*     */     } 
/*     */     
/*  80 */     if ($world instanceof Level) {
/*  81 */       if (!((Level)$world).isClientSide()) {
/*  82 */         ((Level)$world).playSound(
/*  83 */             null, 
/*  84 */             BlockPos.containing($x, $y, $z), 
/*  85 */             (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), 
/*  86 */             SoundSource.NEUTRAL, 
/*  87 */             555.0F, 
/*  88 */             0.0F);
/*     */       } else {
/*     */         
/*  91 */         ((Level)$world).playLocalSound(
/*  92 */             $x, $y, $z, (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$2(LevelAccessor $world, double $x, double $y, double $z) {
/* 102 */     if (!$world.isClientSide() && $world.getServer() != null) {
/* 103 */       Intrinsics.checkNotNull($world.getServer()); $world.getServer().getPlayerList().broadcastSystemMessage(
/* 104 */           (Component)Component.literal("<null> err.type=null.freedom"), false);
/*     */     } 
/*     */     
/* 107 */     if ($world instanceof Level) {
/* 108 */       if (!((Level)$world).isClientSide()) {
/* 109 */         ((Level)$world).playSound(
/* 110 */             null, 
/* 111 */             BlockPos.containing($x, $y, $z), 
/* 112 */             (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), 
/* 113 */             SoundSource.NEUTRAL, 
/* 114 */             555.0F, 
/* 115 */             0.0F);
/*     */       } else {
/*     */         
/* 118 */         ((Level)$world).playLocalSound(
/* 119 */             $x, $y, $z, (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       } 
/*     */     }
/*     */   }
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
/*     */   private static final void execute$lambda$5(LevelAccessor $world, double $x, double $y, double $z) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #7
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 78
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #7
/*     */     //   16: aload #7
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #7
/*     */     //   47: iconst_4
/*     */     //   48: ldc_w ''
/*     */     //   51: ldc_w ''
/*     */     //   54: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   57: checkcast net/minecraft/network/chat/Component
/*     */     //   60: aload #7
/*     */     //   62: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   65: aconst_null
/*     */     //   66: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   69: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   72: ldc_w 'tellraw @a "<null> The end is nigh"'
/*     */     //   75: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   78: aload_0
/*     */     //   79: instanceof net/minecraft/world/level/Level
/*     */     //   82: ifeq -> 157
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/world/level/Level
/*     */     //   89: invokevirtual isClientSide : ()Z
/*     */     //   92: ifne -> 129
/*     */     //   95: aload_0
/*     */     //   96: checkcast net/minecraft/world/level/Level
/*     */     //   99: aconst_null
/*     */     //   100: dload_1
/*     */     //   101: dload_3
/*     */     //   102: dload #5
/*     */     //   104: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   107: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   110: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   113: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   116: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   119: ldc_w 555.0
/*     */     //   122: fconst_0
/*     */     //   123: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   126: goto -> 157
/*     */     //   129: aload_0
/*     */     //   130: checkcast net/minecraft/world/level/Level
/*     */     //   133: dload_1
/*     */     //   134: dload_3
/*     */     //   135: dload #5
/*     */     //   137: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   140: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   143: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   146: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   149: ldc_w 555.0
/*     */     //   152: fconst_0
/*     */     //   153: iconst_0
/*     */     //   154: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   157: bipush #20
/*     */     //   159: aload_0
/*     */     //   160: dload_1
/*     */     //   161: dload_3
/*     */     //   162: dload #5
/*     */     //   164: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   169: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   172: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #129	-> 0
/*     */     //   #130	-> 3
/*     */     //   #131	-> 10
/*     */     //   #132	-> 16
/*     */     //   #133	-> 24
/*     */     //   #134	-> 28
/*     */     //   #135	-> 31
/*     */     //   #136	-> 42
/*     */     //   #137	-> 45
/*     */     //   #138	-> 47
/*     */     //   #139	-> 48
/*     */     //   #140	-> 51
/*     */     //   #141	-> 60
/*     */     //   #142	-> 65
/*     */     //   #133	-> 66
/*     */     //   #143	-> 69
/*     */     //   #132	-> 75
/*     */     //   #146	-> 78
/*     */     //   #147	-> 85
/*     */     //   #148	-> 95
/*     */     //   #149	-> 99
/*     */     //   #150	-> 100
/*     */     //   #151	-> 107
/*     */     //   #152	-> 116
/*     */     //   #153	-> 119
/*     */     //   #154	-> 122
/*     */     //   #148	-> 123
/*     */     //   #157	-> 129
/*     */     //   #158	-> 133
/*     */     //   #157	-> 154
/*     */     //   #163	-> 157
/*     */     //   #164	-> 159
/*     */     //   #162	-> 159
/*     */     //   #211	-> 172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	170	7	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	173	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	173	1	$x	D
/*     */     //   0	173	3	$y	D
/*     */     //   0	173	5	$z	D
/*     */   }
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
/*     */   private static final void execute$lambda$5$lambda$4(LevelAccessor $world, double $x, double $y, double $z) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #7
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 78
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #7
/*     */     //   16: aload #7
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #7
/*     */     //   47: iconst_4
/*     */     //   48: ldc_w ''
/*     */     //   51: ldc_w ''
/*     */     //   54: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   57: checkcast net/minecraft/network/chat/Component
/*     */     //   60: aload #7
/*     */     //   62: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   65: aconst_null
/*     */     //   66: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   69: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   72: ldc_w 'tellraw @a "<null> The end is null"'
/*     */     //   75: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   78: aload_0
/*     */     //   79: instanceof net/minecraft/world/level/Level
/*     */     //   82: ifeq -> 157
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/world/level/Level
/*     */     //   89: invokevirtual isClientSide : ()Z
/*     */     //   92: ifne -> 129
/*     */     //   95: aload_0
/*     */     //   96: checkcast net/minecraft/world/level/Level
/*     */     //   99: aconst_null
/*     */     //   100: dload_1
/*     */     //   101: dload_3
/*     */     //   102: dload #5
/*     */     //   104: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   107: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   110: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   113: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   116: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   119: ldc_w 555.0
/*     */     //   122: fconst_0
/*     */     //   123: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   126: goto -> 157
/*     */     //   129: aload_0
/*     */     //   130: checkcast net/minecraft/world/level/Level
/*     */     //   133: dload_1
/*     */     //   134: dload_3
/*     */     //   135: dload #5
/*     */     //   137: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   140: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   143: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   146: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   149: ldc_w 555.0
/*     */     //   152: fconst_0
/*     */     //   153: iconst_0
/*     */     //   154: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   157: bipush #10
/*     */     //   159: aload_0
/*     */     //   160: dload_1
/*     */     //   161: dload_3
/*     */     //   162: dload #5
/*     */     //   164: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   169: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   172: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #165	-> 0
/*     */     //   #166	-> 3
/*     */     //   #167	-> 10
/*     */     //   #168	-> 16
/*     */     //   #169	-> 24
/*     */     //   #170	-> 28
/*     */     //   #171	-> 31
/*     */     //   #172	-> 42
/*     */     //   #173	-> 45
/*     */     //   #174	-> 47
/*     */     //   #175	-> 48
/*     */     //   #176	-> 51
/*     */     //   #177	-> 60
/*     */     //   #178	-> 65
/*     */     //   #169	-> 66
/*     */     //   #179	-> 69
/*     */     //   #168	-> 75
/*     */     //   #182	-> 78
/*     */     //   #183	-> 85
/*     */     //   #184	-> 95
/*     */     //   #185	-> 99
/*     */     //   #186	-> 100
/*     */     //   #187	-> 107
/*     */     //   #188	-> 116
/*     */     //   #189	-> 119
/*     */     //   #190	-> 122
/*     */     //   #184	-> 123
/*     */     //   #193	-> 129
/*     */     //   #194	-> 133
/*     */     //   #193	-> 154
/*     */     //   #199	-> 157
/*     */     //   #200	-> 159
/*     */     //   #198	-> 159
/*     */     //   #210	-> 172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	170	7	l2	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	173	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	173	1	$x	D
/*     */     //   0	173	3	$y	D
/*     */     //   0	173	5	$z	D
/*     */   }
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
/*     */   private static final void execute$lambda$5$lambda$4$lambda$3(LevelAccessor $world, double $x, double $y, double $z) {
/* 201 */     if ($world instanceof ServerLevel) {
/* 202 */       Intrinsics.checkNotNull(TBSEntities.NULLL.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.NULLL.get()).spawn(
/* 203 */           (ServerLevel)$world, BlockPos.containing($x, $y, $z), MobSpawnType.MOB_SUMMONED);
/*     */       
/* 205 */       if (entityToSpawn != null) {
/* 206 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/*     */   }
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
/*     */   private static final void execute$lambda$8(LevelAccessor $world, double $x, double $y, double $z) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #7
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 78
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #7
/*     */     //   16: aload #7
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #7
/*     */     //   47: iconst_4
/*     */     //   48: ldc_w ''
/*     */     //   51: ldc_w ''
/*     */     //   54: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   57: checkcast net/minecraft/network/chat/Component
/*     */     //   60: aload #7
/*     */     //   62: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   65: aconst_null
/*     */     //   66: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   69: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   72: ldc_w 'tellraw @a "<Null> Yes."'
/*     */     //   75: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   78: aload_0
/*     */     //   79: instanceof net/minecraft/world/level/Level
/*     */     //   82: ifeq -> 157
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/world/level/Level
/*     */     //   89: invokevirtual isClientSide : ()Z
/*     */     //   92: ifne -> 129
/*     */     //   95: aload_0
/*     */     //   96: checkcast net/minecraft/world/level/Level
/*     */     //   99: aconst_null
/*     */     //   100: dload_1
/*     */     //   101: dload_3
/*     */     //   102: dload #5
/*     */     //   104: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   107: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   110: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   113: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   116: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   119: ldc_w 555.0
/*     */     //   122: fconst_0
/*     */     //   123: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   126: goto -> 157
/*     */     //   129: aload_0
/*     */     //   130: checkcast net/minecraft/world/level/Level
/*     */     //   133: dload_1
/*     */     //   134: dload_3
/*     */     //   135: dload #5
/*     */     //   137: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   140: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   143: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   146: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   149: ldc_w 555.0
/*     */     //   152: fconst_0
/*     */     //   153: iconst_0
/*     */     //   154: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   157: bipush #60
/*     */     //   159: aload_0
/*     */     //   160: dload_1
/*     */     //   161: dload_3
/*     */     //   162: dload #5
/*     */     //   164: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   169: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   172: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #217	-> 0
/*     */     //   #218	-> 3
/*     */     //   #219	-> 10
/*     */     //   #220	-> 16
/*     */     //   #221	-> 24
/*     */     //   #222	-> 28
/*     */     //   #223	-> 31
/*     */     //   #224	-> 42
/*     */     //   #225	-> 45
/*     */     //   #226	-> 47
/*     */     //   #227	-> 48
/*     */     //   #228	-> 51
/*     */     //   #229	-> 60
/*     */     //   #230	-> 65
/*     */     //   #221	-> 66
/*     */     //   #231	-> 69
/*     */     //   #220	-> 75
/*     */     //   #234	-> 78
/*     */     //   #235	-> 85
/*     */     //   #236	-> 95
/*     */     //   #237	-> 99
/*     */     //   #238	-> 100
/*     */     //   #239	-> 107
/*     */     //   #240	-> 116
/*     */     //   #241	-> 119
/*     */     //   #242	-> 122
/*     */     //   #236	-> 123
/*     */     //   #245	-> 129
/*     */     //   #246	-> 133
/*     */     //   #245	-> 154
/*     */     //   #251	-> 157
/*     */     //   #252	-> 159
/*     */     //   #250	-> 159
/*     */     //   #311	-> 172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	170	7	_level	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	173	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	173	1	$x	D
/*     */     //   0	173	3	$y	D
/*     */     //   0	173	5	$z	D
/*     */   }
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
/*     */   private static final void execute$lambda$8$lambda$7(LevelAccessor $world, double $x, double $y, double $z) {
/*     */     // Byte code:
/*     */     //   0: aconst_null
/*     */     //   1: astore #7
/*     */     //   3: aload_0
/*     */     //   4: instanceof net/minecraft/server/level/ServerLevel
/*     */     //   7: ifeq -> 78
/*     */     //   10: aload_0
/*     */     //   11: checkcast net/minecraft/server/level/ServerLevel
/*     */     //   14: astore #7
/*     */     //   16: aload #7
/*     */     //   18: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   21: invokevirtual getCommands : ()Lnet/minecraft/commands/Commands;
/*     */     //   24: new net/minecraft/commands/CommandSourceStack
/*     */     //   27: dup
/*     */     //   28: getstatic net/minecraft/commands/CommandSource.NULL : Lnet/minecraft/commands/CommandSource;
/*     */     //   31: new net/minecraft/world/phys/Vec3
/*     */     //   34: dup
/*     */     //   35: dload_1
/*     */     //   36: dload_3
/*     */     //   37: dload #5
/*     */     //   39: invokespecial <init> : (DDD)V
/*     */     //   42: getstatic net/minecraft/world/phys/Vec2.ZERO : Lnet/minecraft/world/phys/Vec2;
/*     */     //   45: aload #7
/*     */     //   47: iconst_4
/*     */     //   48: ldc_w ''
/*     */     //   51: ldc_w ''
/*     */     //   54: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*     */     //   57: checkcast net/minecraft/network/chat/Component
/*     */     //   60: aload #7
/*     */     //   62: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   65: aconst_null
/*     */     //   66: invokespecial <init> : (Lnet/minecraft/commands/CommandSource;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec2;Lnet/minecraft/server/level/ServerLevel;ILjava/lang/String;Lnet/minecraft/network/chat/Component;Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/world/entity/Entity;)V
/*     */     //   69: invokevirtual withSuppressedOutput : ()Lnet/minecraft/commands/CommandSourceStack;
/*     */     //   72: ldc_w 'tellraw @a "<Null> Hello."'
/*     */     //   75: invokevirtual performPrefixedCommand : (Lnet/minecraft/commands/CommandSourceStack;Ljava/lang/String;)V
/*     */     //   78: aload_0
/*     */     //   79: instanceof net/minecraft/world/level/Level
/*     */     //   82: ifeq -> 157
/*     */     //   85: aload_0
/*     */     //   86: checkcast net/minecraft/world/level/Level
/*     */     //   89: invokevirtual isClientSide : ()Z
/*     */     //   92: ifne -> 129
/*     */     //   95: aload_0
/*     */     //   96: checkcast net/minecraft/world/level/Level
/*     */     //   99: aconst_null
/*     */     //   100: dload_1
/*     */     //   101: dload_3
/*     */     //   102: dload #5
/*     */     //   104: invokestatic containing : (DDD)Lnet/minecraft/core/BlockPos;
/*     */     //   107: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   110: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   113: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   116: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   119: ldc_w 555.0
/*     */     //   122: fconst_0
/*     */     //   123: invokevirtual playSound : (Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FF)V
/*     */     //   126: goto -> 157
/*     */     //   129: aload_0
/*     */     //   130: checkcast net/minecraft/world/level/Level
/*     */     //   133: dload_1
/*     */     //   134: dload_3
/*     */     //   135: dload #5
/*     */     //   137: getstatic net/minecraft/sounds/SoundEvents.AMBIENT_CAVE : Lnet/minecraft/core/Holder$Reference;
/*     */     //   140: invokevirtual value : ()Ljava/lang/Object;
/*     */     //   143: checkcast net/minecraft/sounds/SoundEvent
/*     */     //   146: getstatic net/minecraft/sounds/SoundSource.NEUTRAL : Lnet/minecraft/sounds/SoundSource;
/*     */     //   149: ldc_w 555.0
/*     */     //   152: fconst_0
/*     */     //   153: iconst_0
/*     */     //   154: invokevirtual playLocalSound : (DDDLnet/minecraft/sounds/SoundEvent;Lnet/minecraft/sounds/SoundSource;FFZ)V
/*     */     //   157: bipush #60
/*     */     //   159: aload_0
/*     */     //   160: dload_1
/*     */     //   161: dload_3
/*     */     //   162: dload #5
/*     */     //   164: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   169: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   172: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #253	-> 0
/*     */     //   #254	-> 3
/*     */     //   #255	-> 10
/*     */     //   #256	-> 16
/*     */     //   #257	-> 24
/*     */     //   #258	-> 28
/*     */     //   #259	-> 31
/*     */     //   #260	-> 42
/*     */     //   #261	-> 45
/*     */     //   #262	-> 47
/*     */     //   #263	-> 48
/*     */     //   #264	-> 51
/*     */     //   #265	-> 60
/*     */     //   #266	-> 65
/*     */     //   #257	-> 66
/*     */     //   #267	-> 69
/*     */     //   #256	-> 75
/*     */     //   #270	-> 78
/*     */     //   #271	-> 85
/*     */     //   #272	-> 95
/*     */     //   #273	-> 99
/*     */     //   #274	-> 100
/*     */     //   #275	-> 107
/*     */     //   #276	-> 116
/*     */     //   #277	-> 119
/*     */     //   #278	-> 122
/*     */     //   #272	-> 123
/*     */     //   #281	-> 129
/*     */     //   #282	-> 133
/*     */     //   #281	-> 154
/*     */     //   #287	-> 157
/*     */     //   #288	-> 159
/*     */     //   #286	-> 159
/*     */     //   #310	-> 172
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   3	170	7	l2	Lnet/minecraft/server/level/ServerLevel;
/*     */     //   0	173	0	$world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	173	1	$x	D
/*     */     //   0	173	3	$y	D
/*     */     //   0	173	5	$z	D
/*     */   }
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
/*     */   private static final void execute$lambda$8$lambda$7$lambda$6(LevelAccessor $world, double $x, double $y, double $z) {
/* 289 */     Entity entityToSpawn = null;
/* 290 */     ServerLevel lvl = null;
/* 291 */     if ($world instanceof ServerLevel) {
/* 292 */       lvl = (ServerLevel)$world;
/* 293 */       Intrinsics.checkNotNull(TBSEntities.STRIKE.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.STRIKE.get()).spawn(
/* 294 */           lvl, BlockPos.containing($x, $y, $z), MobSpawnType.MOB_SUMMONED);
/*     */       
/* 296 */       if (entityToSpawn != null) {
/* 297 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/* 300 */     if ($world instanceof ServerLevel) {
/* 301 */       lvl = (ServerLevel)$world;
/* 302 */       Intrinsics.checkNotNull(TBSEntities.JUMPOSCROOOO.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); entityToSpawn = ((EntityType)TBSEntities.JUMPOSCROOOO.get()).spawn(
/* 303 */           lvl, BlockPos.containing($x, $y, $z), MobSpawnType.MOB_SUMMONED);
/*     */       
/* 305 */       if (entityToSpawn != null) {
/* 306 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$9(LevelAccessor $world, double $x, double $y, double $z) {
/* 317 */     if ($world instanceof ServerLevel) {
/* 318 */       Intrinsics.checkNotNull(TBSEntities.NULL_SCARE.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.NULL_SCARE.get()).spawn(
/* 319 */           (ServerLevel)$world, BlockPos.containing($x, $y, $z), MobSpawnType.MOB_SUMMONED);
/*     */       
/* 321 */       if (entityToSpawn != null) {
/* 322 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$10(LevelAccessor $world, double $x, double $y, double $z) {
/* 331 */     Level _level = null;
/* 332 */     if ($world instanceof Level) {
/* 333 */       _level = (Level)$world;
/* 334 */       if (!_level.isClientSide()) {
/* 335 */         _level.playSound(
/* 336 */             null, 
/* 337 */             BlockPos.containing($x, $y, $z), 
/* 338 */             (SoundEvent)TBSSounds.INSTANCE.getNULLKILLSPLAYER().get(), 
/* 339 */             SoundSource.NEUTRAL, 
/* 340 */             555.0F, 
/* 341 */             0.0F);
/*     */       } else {
/*     */         
/* 344 */         _level.playLocalSound(
/* 345 */             $x, $y, $z, (SoundEvent)TBSSounds.INSTANCE.getNULLKILLSPLAYER().get(), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*     */       } 
/*     */     } 
/*     */     
/* 349 */     if ($world instanceof ServerLevel) {
/* 350 */       _level = (Level)$world;
/* 351 */       Intrinsics.checkNotNull(TBSEntities.NOTHINGISWATCHINGCHASE.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.NOTHINGISWATCHINGCHASE.get()).spawn(
/* 352 */           (ServerLevel)_level, BlockPos.containing($x, $y, $z), MobSpawnType.MOB_SUMMONED);
/*     */       
/* 354 */       if (entityToSpawn != null) {
/* 355 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$11(LevelAccessor $world, double $x, double $y, double $z) {
/* 364 */     if ($world instanceof ServerLevel) {
/* 365 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 366 */           new CommandSourceStack(
/* 367 */             CommandSource.NULL, 
/* 368 */             new Vec3($x, $y, $z), 
/* 369 */             Vec2.ZERO, 
/* 370 */             (ServerLevel)$world, 
/* 371 */             4, 
/* 372 */             "", 
/* 373 */             (Component)Component.literal(""), (
/* 374 */             (ServerLevel)$world).getServer(), 
/* 375 */             null))
/* 376 */           .withSuppressedOutput(), "tellraw @a \"[?][?][?]\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$12(LevelAccessor $world, double $x, double $y, double $z) {
/* 385 */     if ($world instanceof ServerLevel) {
/* 386 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 387 */           new CommandSourceStack(
/* 388 */             CommandSource.NULL, 
/* 389 */             new Vec3($x, $y, $z), 
/* 390 */             Vec2.ZERO, 
/* 391 */             (ServerLevel)$world, 
/* 392 */             4, 
/* 393 */             "", 
/* 394 */             (Component)Component.literal(""), (
/* 395 */             (ServerLevel)$world).getServer(), 
/* 396 */             null))
/* 397 */           .withSuppressedOutput(), "tellraw @a \"<null> \"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$13(LevelAccessor $world, double $x, double $y, double $z) {
/* 406 */     if ($world instanceof ServerLevel) {
/* 407 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 408 */           new CommandSourceStack(
/* 409 */             CommandSource.NULL, 
/* 410 */             new Vec3($x, $y, $z), 
/* 411 */             Vec2.ZERO, 
/* 412 */             (ServerLevel)$world, 
/* 413 */             4, 
/* 414 */             "", 
/* 415 */             (Component)Component.literal(""), (
/* 416 */             (ServerLevel)$world).getServer(), 
/* 417 */             null))
/* 418 */           .withSuppressedOutput(), "tellraw @a \"<null> Ended his own life.\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$14(LevelAccessor $world, double $x, double $y, double $z) {
/* 427 */     if ($world instanceof ServerLevel) {
/* 428 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 429 */           new CommandSourceStack(
/* 430 */             CommandSource.NULL, 
/* 431 */             new Vec3($x, $y, $z), 
/* 432 */             Vec2.ZERO, 
/* 433 */             (ServerLevel)$world, 
/* 434 */             4, 
/* 435 */             "", 
/* 436 */             (Component)Component.literal(""), (
/* 437 */             (ServerLevel)$world).getServer(), 
/* 438 */             null))
/* 439 */           .withSuppressedOutput(), "tellraw @a \"<null> Deep down under the bedrock.\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$15(LevelAccessor $world, double $x, double $y, double $z) {
/* 448 */     if ($world instanceof ServerLevel) {
/* 449 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 450 */           new CommandSourceStack(
/* 451 */             CommandSource.NULL, 
/* 452 */             new Vec3($x, $y, $z), 
/* 453 */             Vec2.ZERO, 
/* 454 */             (ServerLevel)$world, 
/* 455 */             4, 
/* 456 */             "", 
/* 457 */             (Component)Component.literal(""), (
/* 458 */             (ServerLevel)$world).getServer(), 
/* 459 */             null))
/* 460 */           .withSuppressedOutput(), "tellraw @a \"<null> Home.\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$16(LevelAccessor $world, double $x, double $y, double $z) {
/* 469 */     ServerLevel _level = null;
/* 470 */     if ($world instanceof ServerLevel) {
/* 471 */       _level = (ServerLevel)$world;
/* 472 */       _level.getServer().getCommands().performPrefixedCommand((
/* 473 */           new CommandSourceStack(
/* 474 */             CommandSource.NULL, 
/* 475 */             new Vec3($x, $y, $z), 
/* 476 */             Vec2.ZERO, 
/* 477 */             _level, 
/* 478 */             4, 
/* 479 */             "", 
/* 480 */             (Component)Component.literal(""), 
/* 481 */             _level.getServer(), 
/* 482 */             null))
/* 483 */           .withSuppressedOutput(), "tellraw @a \"<null> Rot in hell.\"");
/*     */     } 
/*     */     
/* 486 */     if ($world instanceof ServerLevel) {
/* 487 */       _level = (ServerLevel)$world;
/* 488 */       Intrinsics.checkNotNull(TBSEntities.NULL_IS_HERE.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.NULL_IS_HERE.get()).spawn(
/* 489 */           _level, BlockPos.containing($x, $y, $z), MobSpawnType.MOB_SUMMONED);
/*     */       
/* 491 */       if (entityToSpawn != null) {
/* 492 */         entityToSpawn.setYRot(((ServerLevel)$world).getRandom().nextFloat() * 360.0F);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$17(LevelAccessor $world, double $x, double $y, double $z) {
/* 501 */     if ($world instanceof ServerLevel) {
/* 502 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 503 */           new CommandSourceStack(
/* 504 */             CommandSource.NULL, 
/* 505 */             new Vec3($x, $y, $z), 
/* 506 */             Vec2.ZERO, 
/* 507 */             (ServerLevel)$world, 
/* 508 */             4, 
/* 509 */             "", 
/* 510 */             (Component)Component.literal(""), (
/* 511 */             (ServerLevel)$world).getServer(), 
/* 512 */             null))
/* 513 */           .withSuppressedOutput(), "tellraw @a \"<null> Poor soul.\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$18(LevelAccessor $world, double $x, double $y, double $z) {
/* 522 */     if ($world instanceof ServerLevel) {
/* 523 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 524 */           new CommandSourceStack(
/* 525 */             CommandSource.NULL, 
/* 526 */             new Vec3($x, $y, $z), 
/* 527 */             Vec2.ZERO, 
/* 528 */             (ServerLevel)$world, 
/* 529 */             4, 
/* 530 */             "", 
/* 531 */             (Component)Component.literal(""), (
/* 532 */             (ServerLevel)$world).getServer(), 
/* 533 */             null))
/* 534 */           .withSuppressedOutput(), "tellraw @a \"<null> Is behind you.\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$19(LevelAccessor $world, double $x, double $y, double $z) {
/* 543 */     if ($world instanceof ServerLevel) {
/* 544 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 545 */           new CommandSourceStack(
/* 546 */             CommandSource.NULL, 
/* 547 */             new Vec3($x, $y, $z), 
/* 548 */             Vec2.ZERO, 
/* 549 */             (ServerLevel)$world, 
/* 550 */             4, 
/* 551 */             "", 
/* 552 */             (Component)Component.literal(""), (
/* 553 */             (ServerLevel)$world).getServer(), 
/* 554 */             null))
/* 555 */           .withSuppressedOutput(), "tellraw @a \"<null> A broken promise.\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$20(LevelAccessor $world, double $x, double $y, double $z) {
/* 564 */     if ($world instanceof ServerLevel) {
/* 565 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 566 */           new CommandSourceStack(
/* 567 */             CommandSource.NULL, 
/* 568 */             new Vec3($x, $y, $z), 
/* 569 */             Vec2.ZERO, 
/* 570 */             (ServerLevel)$world, 
/* 571 */             4, 
/* 572 */             "", 
/* 573 */             (Component)Component.literal(""), (
/* 574 */             (ServerLevel)$world).getServer(), 
/* 575 */             null))
/* 576 */           .withSuppressedOutput(), "tellraw @a \"<null> It was all his fault.\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$21(LevelAccessor $world, double $x, double $y, double $z) {
/* 585 */     if ($world instanceof ServerLevel) {
/* 586 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 587 */           new CommandSourceStack(
/* 588 */             CommandSource.NULL, 
/* 589 */             new Vec3($x, $y, $z), 
/* 590 */             Vec2.ZERO, 
/* 591 */             (ServerLevel)$world, 
/* 592 */             4, 
/* 593 */             "", 
/* 594 */             (Component)Component.literal(""), (
/* 595 */             (ServerLevel)$world).getServer(), 
/* 596 */             null))
/* 597 */           .withSuppressedOutput(), "tellraw @a \"<null> [0.1]\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$22(LevelAccessor $world, double $x, double $y, double $z) {
/* 606 */     if ($world instanceof ServerLevel) {
/* 607 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 608 */           new CommandSourceStack(
/* 609 */             CommandSource.NULL, 
/* 610 */             new Vec3($x, $y, $z), 
/* 611 */             Vec2.ZERO, 
/* 612 */             (ServerLevel)$world, 
/* 613 */             4, 
/* 614 */             "", 
/* 615 */             (Component)Component.literal(""), (
/* 616 */             (ServerLevel)$world).getServer(), 
/* 617 */             null))
/* 618 */           .withSuppressedOutput(), "tellraw @a \"It's me.\"");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$23(LevelAccessor $world, double $x, double $y, double $z) {
/* 627 */     if ($world instanceof ServerLevel)
/* 628 */       ((ServerLevel)$world).getServer().getCommands().performPrefixedCommand((
/* 629 */           new CommandSourceStack(
/* 630 */             CommandSource.NULL, 
/* 631 */             new Vec3($x, $y, $z), 
/* 632 */             Vec2.ZERO, 
/* 633 */             (ServerLevel)$world, 
/* 634 */             4, 
/* 635 */             "", 
/* 636 */             (Component)Component.literal(""), (
/* 637 */             (ServerLevel)$world).getServer(), 
/* 638 */             null))
/* 639 */           .withSuppressedOutput(), "tellraw @a \"<Circuit> Administration.\""); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\misc\CodesProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */