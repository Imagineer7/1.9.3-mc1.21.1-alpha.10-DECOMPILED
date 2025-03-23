/*     */ package dev.wendigodrip.thebrokenscript.procedures.misc;
/*     */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundEvents;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.neoforged.bus.api.Event;
/*     */ import net.neoforged.bus.api.SubscribeEvent;
/*     */ import net.neoforged.fml.common.EventBusSubscriber;
/*     */ import net.neoforged.neoforge.event.entity.player.PlayerEvent;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J&\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fJ2\020\b\032\0020\0052\b\020\006\032\004\030\0010\0172\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/misc/FirstJoinProcedure;", "", "<init>", "()V", "onPlayerLoggedIn", "", "event", "Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$PlayerLoggedInEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*     */ public final class FirstJoinProcedure {
/*     */   @SubscribeEvent
/*     */   public final void onPlayerLoggedIn(@NotNull PlayerEvent.PlayerLoggedInEvent event) {
/*  25 */     Intrinsics.checkNotNullParameter(event, "event");
/*     */     
/*  27 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), 
/*  28 */         event.getEntity().getX(), 
/*  29 */         event.getEntity().getY(), 
/*  30 */         event.getEntity().getZ());
/*     */   }
/*     */   @NotNull
/*     */   public static final FirstJoinProcedure INSTANCE = new FirstJoinProcedure();
/*     */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/*  35 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void execute(Event event, LevelAccessor world, double x, double y, double z) {
/*     */     // Byte code:
/*     */     //   0: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   3: aload_2
/*     */     //   4: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   7: iconst_0
/*     */     //   8: invokevirtual setHasCircuitSpawned : (Z)V
/*     */     //   11: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   14: aload_2
/*     */     //   15: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   18: aload_2
/*     */     //   19: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   22: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   25: aload_2
/*     */     //   26: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   29: iconst_0
/*     */     //   30: invokevirtual setHasSiluetSpawned : (Z)V
/*     */     //   33: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   36: aload_2
/*     */     //   37: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   40: aload_2
/*     */     //   41: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   44: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   47: aload_2
/*     */     //   48: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   51: iconst_0
/*     */     //   52: invokevirtual setHasNullSpawned : (Z)V
/*     */     //   55: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   58: aload_2
/*     */     //   59: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   62: aload_2
/*     */     //   63: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   66: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   69: aload_2
/*     */     //   70: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   73: iconst_0
/*     */     //   74: invokevirtual setHasVoidSpawned : (Z)V
/*     */     //   77: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   80: aload_2
/*     */     //   81: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   84: aload_2
/*     */     //   85: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   88: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   91: aload_2
/*     */     //   92: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   95: invokevirtual isFirstJoin : ()Z
/*     */     //   98: ifeq -> 186
/*     */     //   101: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   104: aload_2
/*     */     //   105: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   108: dload_3
/*     */     //   109: invokevirtual setHomeX : (D)V
/*     */     //   112: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   115: aload_2
/*     */     //   116: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   119: aload_2
/*     */     //   120: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   123: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   126: aload_2
/*     */     //   127: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   130: dload #5
/*     */     //   132: invokevirtual setHomeY : (D)V
/*     */     //   135: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   138: aload_2
/*     */     //   139: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   142: aload_2
/*     */     //   143: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   146: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   149: aload_2
/*     */     //   150: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   153: dload #7
/*     */     //   155: invokevirtual setHomeZ : (D)V
/*     */     //   158: getstatic dev/wendigodrip/thebrokenscript/vars/MapVariables.Companion : Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   161: aload_2
/*     */     //   162: invokevirtual get : (Lnet/minecraft/world/level/LevelAccessor;)Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   165: aload_2
/*     */     //   166: invokevirtual syncData : (Lnet/minecraft/world/level/LevelAccessor;)V
/*     */     //   169: sipush #18000
/*     */     //   172: aload_2
/*     */     //   173: dload_3
/*     */     //   174: dload #5
/*     */     //   176: dload #7
/*     */     //   178: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;DDD)Ljava/lang/Runnable;
/*     */     //   183: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   186: sipush #18000
/*     */     //   189: aload_2
/*     */     //   190: <illegal opcode> run : (Lnet/minecraft/world/level/LevelAccessor;)Ljava/lang/Runnable;
/*     */     //   195: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*     */     //   198: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #39	-> 0
/*     */     //   #40	-> 11
/*     */     //   #41	-> 22
/*     */     //   #42	-> 33
/*     */     //   #43	-> 44
/*     */     //   #44	-> 55
/*     */     //   #45	-> 66
/*     */     //   #46	-> 77
/*     */     //   #47	-> 88
/*     */     //   #48	-> 101
/*     */     //   #49	-> 112
/*     */     //   #50	-> 123
/*     */     //   #51	-> 135
/*     */     //   #52	-> 146
/*     */     //   #53	-> 158
/*     */     //   #55	-> 169
/*     */     //   #56	-> 172
/*     */     //   #54	-> 172
/*     */     //   #109	-> 186
/*     */     //   #110	-> 189
/*     */     //   #108	-> 189
/*     */     //   #114	-> 198
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	199	0	this	Ldev/wendigodrip/thebrokenscript/procedures/misc/FirstJoinProcedure;
/*     */     //   0	199	1	event	Lnet/neoforged/bus/api/Event;
/*     */     //   0	199	2	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     //   0	199	3	x	D
/*     */     //   0	199	5	y	D
/*     */     //   0	199	7	z	D
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$0(LevelAccessor $world, double $x, double $y, double $z) {
/*  57 */     ServerLevel _level = null;
/*  58 */     if ($world instanceof ServerLevel) {
/*  59 */       _level = (ServerLevel)$world;
/*  60 */       _level.getServer()
/*  61 */         .getCommands()
/*  62 */         .performPrefixedCommand((
/*  63 */           new CommandSourceStack(
/*  64 */             CommandSource.NULL, 
/*  65 */             new Vec3($x, $y, $z), 
/*  66 */             Vec2.ZERO, 
/*  67 */             _level, 
/*  68 */             4, 
/*  69 */             "", 
/*  70 */             (Component)Component.literal(""), 
/*  71 */             _level.getServer(), 
/*  72 */             null))
/*  73 */           .withSuppressedOutput(), 
/*  74 */           "tellraw @a {\"text\":\"Null joined the game\",\"color\":\"yellow\"}");
/*     */     } 
/*     */     
/*  77 */     if ($world instanceof Level) {
/*  78 */       if (!((Level)$world).isClientSide()) {
/*  79 */         ((Level)$world).playSound(
/*  80 */             null, 
/*  81 */             BlockPos.containing($x, $y, $z), 
/*  82 */             (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), 
/*  83 */             SoundSource.NEUTRAL, 
/*  84 */             555.0F, 
/*  85 */             0.0F);
/*     */       } else {
/*     */         
/*  88 */         ((Level)$world).playLocalSound(
/*  89 */             $x, 
/*  90 */             $y, 
/*  91 */             $z, 
/*  92 */             (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), 
/*  93 */             SoundSource.NEUTRAL, 
/*  94 */             555.0F, 
/*  95 */             0.0F, 
/*  96 */             false);
/*     */       } 
/*     */     }
/*     */     
/* 100 */     MapVariables.Companion.get($world).setHasNullSpawned(true);
/* 101 */     MapVariables.Companion.get($world).syncData($world);
/* 102 */     MapVariables.Companion.get($world).setFirstJoin(false);
/* 103 */     MapVariables.Companion.get($world).syncData($world);
/* 104 */     MapVariables.Companion.get($world).setNullHere(true);
/* 105 */     MapVariables.Companion.get($world).syncData($world);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void execute$lambda$1(LevelAccessor $world) {
/* 111 */     MapVariables.Companion.get($world).setHasNullSpawned(true);
/* 112 */     MapVariables.Companion.get($world).syncData($world);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\misc\FirstJoinProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */