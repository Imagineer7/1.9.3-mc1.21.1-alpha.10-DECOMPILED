/*    */ package dev.wendigodrip.thebrokenscript.events;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\007\n\002\b\003\b&\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\"\020\022\032\0020\0232\006\020\f\032\0020\r2\006\020\016\032\0020\0172\b\b\002\020\024\032\0020\025H&J\026\020\026\032\0020\0232\006\020\f\032\0020\r2\006\020\016\032\0020\017J\036\020\027\032\0020\0232\006\020\030\032\0020\0052\f\020\031\032\b\022\004\022\0020\0230\032H\004J\036\020\020\032\0020\0232\006\020\030\032\0020\0052\f\020\031\032\b\022\004\022\0020\0230\032H\004J+\020\033\032\0020\0232!\020\031\032\035\022\023\022\0210\035¢\006\f\b\036\022\b\b\002\022\004\b\b(\f\022\004\022\0020\0230\034H\004J\032\020\037\032\0020\0232\006\020 \032\0020!2\b\b\002\020\"\032\0020#H\004J\024\020$\032\016\022\004\022\0020\r\022\004\022\0020\0170%H\004J6\020&\032\0020\0232\006\020\024\032\0020\0252\006\020'\032\0020(2\b\b\002\020)\032\0020*2\b\b\002\020+\032\0020*2\b\b\002\020,\032\0020#H\004J>\020&\032\0020\0232\006\020\f\032\0020\r2\006\020\024\032\0020\0252\006\020'\032\0020(2\b\b\002\020)\032\0020*2\b\b\002\020+\032\0020*2\b\b\002\020,\032\0020#H\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\020\020\f\032\004\030\0010\rX\016¢\006\002\n\000R\020\020\016\032\004\030\0010\017X\016¢\006\002\n\000R\024\020\020\032\b\022\004\022\0020\0000\021X\016¢\006\002\n\000¨\006-"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "", "name", "", "weight", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getWeight", "()I", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "queue", "Ldev/wendigodrip/thebrokenscript/events/util/DelayedWorkQueue;", "execute", "", "pos", "Lnet/minecraft/world/phys/Vec3;", "run", "doWork", "afterTicks", "action", "Lkotlin/Function0;", "onServer", "Lkotlin/Function1;", "Lnet/minecraft/server/level/ServerLevel;", "Lkotlin/ParameterName;", "broadcast", "msg", "Lnet/minecraft/network/chat/Component;", "bypassHiddenChat", "", "condition", "Ldev/wendigodrip/thebrokenscript/events/condition/EventConditionBuilder;", "playSound", "sound", "Lnet/minecraft/sounds/SoundEvent;", "volume", "", "pitch", "distanceDelay", "thebrokenscript"})
/*    */ public abstract class BaseEvent {
/*    */   @NotNull
/*    */   private final String name;
/*    */   private final int weight;
/*    */   
/* 16 */   public BaseEvent(@NotNull String name, int weight) { this.name = name; this.weight = weight;
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.queue = new DelayedWorkQueue(); }
/*    */   @Nullable private Level level;
/*    */   @Nullable
/*    */   private Entity entity; @NotNull
/*    */   private DelayedWorkQueue<BaseEvent> queue; @NotNull
/* 25 */   public final String getName() { return this.name; } public final int getWeight() { return this.weight; } public final void run(@NotNull Level level, @NotNull Entity entity) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); this.level = level;
/* 26 */     this.entity = entity;
/*    */     
/* 28 */     execute$default(this, level, entity, null, 4, null);
/*    */ 
/*    */     
/* 31 */     this.queue.start(this);
/*    */     
/* 33 */     this.level = null;
/* 34 */     this.entity = null; }
/*    */ 
/*    */   
/*    */   protected final void doWork(int afterTicks, @NotNull Function0 action) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc 'action'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   10: dup
/*    */     //   11: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   14: astore_3
/*    */     //   15: aload_0
/*    */     //   16: getfield entity : Lnet/minecraft/world/entity/Entity;
/*    */     //   19: dup
/*    */     //   20: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   23: astore #4
/*    */     //   25: iload_1
/*    */     //   26: aload_0
/*    */     //   27: aload_3
/*    */     //   28: aload #4
/*    */     //   30: aload_2
/*    */     //   31: <illegal opcode> run : (Ldev/wendigodrip/thebrokenscript/events/BaseEvent;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lkotlin/jvm/functions/Function0;)Ljava/lang/Runnable;
/*    */     //   36: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   39: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #38	-> 6
/*    */     //   #39	-> 15
/*    */     //   #41	-> 25
/*    */     //   #47	-> 39
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   15	25	3	levelCopy	Lnet/minecraft/world/level/Level;
/*    */     //   25	15	4	entityCopy	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	40	0	this	Ldev/wendigodrip/thebrokenscript/events/BaseEvent;
/*    */     //   0	40	1	afterTicks	I
/*    */     //   0	40	2	action	Lkotlin/jvm/functions/Function0;
/*    */   }
/*    */   
/*    */   private static final void doWork$lambda$0(BaseEvent this$0, Level $levelCopy, Entity $entityCopy, Function0 $action) {
/* 42 */     this$0.level = $levelCopy;
/* 43 */     this$0.entity = $entityCopy;
/*    */     
/* 45 */     $action.invoke();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected final void queue(int afterTicks, @NotNull Function0 action) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: ldc 'action'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   10: dup
/*    */     //   11: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   14: astore_3
/*    */     //   15: aload_0
/*    */     //   16: getfield entity : Lnet/minecraft/world/entity/Entity;
/*    */     //   19: dup
/*    */     //   20: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   23: astore #4
/*    */     //   25: aload_0
/*    */     //   26: getfield queue : Ldev/wendigodrip/thebrokenscript/events/util/DelayedWorkQueue;
/*    */     //   29: iload_1
/*    */     //   30: aload_0
/*    */     //   31: aload_3
/*    */     //   32: aload #4
/*    */     //   34: aload_2
/*    */     //   35: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/BaseEvent;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function1;
/*    */     //   40: invokevirtual add : (ILkotlin/jvm/functions/Function1;)Z
/*    */     //   43: pop
/*    */     //   44: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #55	-> 6
/*    */     //   #56	-> 15
/*    */     //   #58	-> 25
/*    */     //   #64	-> 44
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   15	30	3	levelCopy	Lnet/minecraft/world/level/Level;
/*    */     //   25	20	4	entityCopy	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	45	0	this	Ldev/wendigodrip/thebrokenscript/events/BaseEvent;
/*    */     //   0	45	1	afterTicks	I
/*    */     //   0	45	2	action	Lkotlin/jvm/functions/Function0;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final Unit queue$lambda$1(BaseEvent this$0, Level $levelCopy, Entity $entityCopy, Function0 $action, BaseEvent it) {
/* 59 */     Intrinsics.checkNotNullParameter(it, "it"); this$0.level = $levelCopy;
/* 60 */     this$0.entity = $entityCopy;
/*    */     
/* 62 */     $action.invoke();
/* 63 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   protected final void onServer(@NotNull Function1 action) {
/* 67 */     Intrinsics.checkNotNullParameter(action, "action"); condition().onServer(action::onServer$lambda$2); } private static final Unit onServer$lambda$2(Function1 $action, ServerLevel level, Entity paramEntity) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(paramEntity, "<unused var>"); $action.invoke(level); return Unit.INSTANCE; }
/*    */    protected final void broadcast(@NotNull Component msg, boolean bypassHiddenChat) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'msg'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: aload_1
/*    */     //   8: iload_2
/*    */     //   9: <illegal opcode> invoke : (Lnet/minecraft/network/chat/Component;Z)Lkotlin/jvm/functions/Function1;
/*    */     //   14: invokevirtual onServer : (Lkotlin/jvm/functions/Function1;)V
/*    */     //   17: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #71	-> 6
/*    */     //   #74	-> 17
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	18	0	this	Ldev/wendigodrip/thebrokenscript/events/BaseEvent;
/*    */     //   0	18	1	msg	Lnet/minecraft/network/chat/Component;
/*    */     //   0	18	2	bypassHiddenChat	Z
/*    */   }
/*    */   private static final Unit broadcast$lambda$3(Component $msg, boolean $bypassHiddenChat, ServerLevel it) {
/* 72 */     Intrinsics.checkNotNullParameter(it, "it"); it.getServer().getPlayerList().broadcastSystemMessage($msg, $bypassHiddenChat);
/* 73 */     return Unit.INSTANCE;
/*    */   }
/*    */   @NotNull
/*    */   protected final EventConditionBuilder<Level, Entity> condition() {
/* 77 */     Intrinsics.checkNotNull(this.level); Intrinsics.checkNotNull(this.entity); return new EventConditionBuilder(this.level, this.entity);
/*    */   }
/*    */ 
/*    */   
/*    */   protected final void playSound(@NotNull Vec3 pos, @NotNull SoundEvent sound, float volume, float pitch, boolean distanceDelay) {
/* 82 */     Intrinsics.checkNotNullParameter(pos, "pos"); Intrinsics.checkNotNullParameter(sound, "sound"); Intrinsics.checkNotNull(this.level); playSound(this.level, pos, sound, volume, pitch, distanceDelay);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   protected final void playSound(@NotNull Level level, @NotNull Vec3 pos, @NotNull SoundEvent sound, float volume, float pitch, boolean distanceDelay) {
/* 93 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(pos, "pos"); Intrinsics.checkNotNullParameter(sound, "sound"); if (!level.isClientSide()) {
/* 94 */       level.playSound(null, BlockPos.containing((Position)pos), sound, SoundSource.NEUTRAL, volume, pitch);
/*    */     } else {
/* 96 */       level.playLocalSound(pos.x, pos.y, pos.z, sound, SoundSource.NEUTRAL, volume, pitch, distanceDelay);
/*    */     } 
/*    */   }
/*    */   
/*    */   public abstract void execute(@NotNull Level paramLevel, @NotNull Entity paramEntity, @NotNull Vec3 paramVec3);
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\BaseEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */