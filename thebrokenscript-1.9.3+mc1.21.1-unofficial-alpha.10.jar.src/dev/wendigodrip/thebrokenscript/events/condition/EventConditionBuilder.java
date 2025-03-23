/*    */ package dev.wendigodrip.thebrokenscript.events.condition;
/*    */ 
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\b\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\030\000*\b\b\000\020\001*\0020\002*\b\b\001\020\003*\0020\0042\0020\005B)\b\002\022\b\020\006\032\004\030\0018\000\022\b\020\007\032\004\030\0018\001\022\n\b\002\020\b\032\004\030\0010\t¢\006\004\b\n\020\013B\031\b\026\022\006\020\006\032\0028\000\022\006\020\007\032\0028\001¢\006\004\b\n\020\fJV\020\020\032\016\022\004\022\0028\000\022\004\022\0028\0010\0002\006\020\b\032\0020\t2:\b\002\020\021\0324\022\023\022\0218\000¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0218\001¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\025\030\0010\022JN\020\026\032\016\022\004\022\0020\027\022\004\022\0028\0010\0002:\b\002\020\021\0324\022\023\022\0210\027¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0218\001¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\025\030\0010\022JN\020\030\032\016\022\004\022\0020\031\022\004\022\0028\0010\0002:\b\002\020\021\0324\022\023\022\0210\031¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0218\001¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\025\030\0010\022JN\020\032\032\016\022\004\022\0028\000\022\004\022\0020\0330\0002:\b\002\020\021\0324\022\023\022\0218\000¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0210\033¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\025\030\0010\022JN\020\034\032\016\022\004\022\0028\000\022\004\022\0020\0350\0002:\b\002\020\021\0324\022\023\022\0218\000¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0210\035¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\025\030\0010\022JN\020\036\032\016\022\004\022\0028\000\022\004\022\0020\0370\0002:\b\002\020\021\0324\022\023\022\0218\000¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0210\037¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\025\030\0010\022JN\020 \032\016\022\004\022\0028\000\022\004\022\0020!0\0002:\b\002\020\021\0324\022\023\022\0218\000¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0210!¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\025\030\0010\022JN\020\"\032\016\022\004\022\0028\000\022\004\022\0020#0\0002:\b\002\020\021\0324\022\023\022\0218\000¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0210#¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\025\030\0010\022JA\020$\032\0020\02526\020\021\0322\022\023\022\0218\000¢\006\f\b\023\022\b\b\024\022\004\b\b(\006\022\023\022\0218\001¢\006\f\b\023\022\b\b\024\022\004\b\b(\007\022\004\022\0020\0250\022H\002R\022\020\006\032\004\030\0018\000X\004¢\006\004\n\002\020\rR\022\020\007\032\004\030\0018\001X\004¢\006\004\n\002\020\016R\022\020\b\032\004\030\0010\tX\016¢\006\004\n\002\020\017¨\006%"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/condition/EventConditionBuilder;", "L", "Lnet/minecraft/world/level/Level;", "E", "Lnet/minecraft/world/entity/Entity;", "", "level", "entity", "afterTicks", "", "<init>", "(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Ljava/lang/Integer;)V", "(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;)V", "Lnet/minecraft/world/level/Level;", "Lnet/minecraft/world/entity/Entity;", "Ljava/lang/Integer;", "after", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "onServer", "Lnet/minecraft/server/level/ServerLevel;", "onClient", "Lnet/minecraft/client/multiplayer/ClientLevel;", "ifLiving", "Lnet/minecraft/world/entity/LivingEntity;", "ifMob", "Lnet/minecraft/world/entity/Mob;", "ifPlayer", "Lnet/minecraft/world/entity/player/Player;", "ifServerPlayer", "Lnet/minecraft/server/level/ServerPlayer;", "isLocalPlayer", "Lnet/minecraft/client/player/LocalPlayer;", "invoke", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nEventConditionBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventConditionBuilder.kt\ndev/wendigodrip/thebrokenscript/events/condition/EventConditionBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,56:1\n1#2:57\n*E\n"})
/*    */ public final class EventConditionBuilder<L extends Level, E extends Entity> {
/*    */   @Nullable
/*    */   private final L level;
/*    */   
/* 15 */   private EventConditionBuilder(Level level, Entity entity, Integer afterTicks) { this.level = (L)level; this.entity = (E)entity; this.afterTicks = afterTicks; } @Nullable
/*    */   private final E entity; @Nullable
/* 17 */   private Integer afterTicks; public EventConditionBuilder(@NotNull Level level, @NotNull Entity entity) { this((L)level, (E)entity, null); }
/*    */   
/*    */   @NotNull
/* 20 */   public final EventConditionBuilder<L, E> after(int afterTicks, @Nullable Function2 action) { EventConditionBuilder<L, E> eventConditionBuilder1 = this, $this$after_u24lambda_u240 = eventConditionBuilder1;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 57 */     int $i$a$-apply-EventConditionBuilder$after$1 = 0; $this$after_u24lambda_u240.afterTicks = Integer.valueOf(afterTicks); EventConditionBuilder<L, E> it = eventConditionBuilder1 = eventConditionBuilder1; int $i$a$-also-EventConditionBuilder$after$2 = 0; if (action != null) it.invoke(action);  return eventConditionBuilder1; } @NotNull public final EventConditionBuilder<ServerLevel, E> onServer(@Nullable Function2 action) { L l = this.level; EventConditionBuilder<ServerLevel, E> eventConditionBuilder1 = new EventConditionBuilder((L)((l instanceof ServerLevel) ? (Level)l : null), this.entity, this.afterTicks); EventConditionBuilder<ServerLevel, E> it = eventConditionBuilder1; int $i$a$-also-EventConditionBuilder$onServer$1 = 0; if (action != null) it.invoke(action);  return eventConditionBuilder1; } @NotNull public final EventConditionBuilder<ClientLevel, E> onClient(@Nullable Function2 action) { L l = this.level; EventConditionBuilder<ClientLevel, E> eventConditionBuilder1 = new EventConditionBuilder((L)((l instanceof ClientLevel) ? (Level)l : null), this.entity, this.afterTicks), it = eventConditionBuilder1; int $i$a$-also-EventConditionBuilder$onClient$1 = 0; if (action != null) it.invoke(action);  return eventConditionBuilder1; } @NotNull public final EventConditionBuilder<L, LivingEntity> ifLiving(@Nullable Function2 action) { E e = this.entity; EventConditionBuilder<L, LivingEntity> eventConditionBuilder1 = new EventConditionBuilder(this.level, (E)((e instanceof LivingEntity) ? (Entity)e : null), this.afterTicks), it = eventConditionBuilder1; int $i$a$-also-EventConditionBuilder$ifLiving$1 = 0; if (action != null) it.invoke(action);  return eventConditionBuilder1; } @NotNull public final EventConditionBuilder<L, Mob> ifMob(@Nullable Function2 action) { E e = this.entity; EventConditionBuilder<L, Mob> eventConditionBuilder1 = new EventConditionBuilder(this.level, (E)((e instanceof Mob) ? (Entity)e : null), this.afterTicks), it = eventConditionBuilder1; int $i$a$-also-EventConditionBuilder$ifMob$1 = 0; if (action != null) it.invoke(action);  return eventConditionBuilder1; } @NotNull public final EventConditionBuilder<L, Player> ifPlayer(@Nullable Function2 action) { E e = this.entity; EventConditionBuilder<L, Player> eventConditionBuilder1 = new EventConditionBuilder(this.level, (E)((e instanceof Player) ? (Entity)e : null), this.afterTicks), it = eventConditionBuilder1; int $i$a$-also-EventConditionBuilder$ifPlayer$1 = 0; if (action != null) it.invoke(action);  return eventConditionBuilder1; } @NotNull public final EventConditionBuilder<L, ServerPlayer> ifServerPlayer(@Nullable Function2 action) { E e = this.entity; EventConditionBuilder<L, ServerPlayer> eventConditionBuilder1 = new EventConditionBuilder(this.level, (E)((e instanceof ServerPlayer) ? (Entity)e : null), this.afterTicks), it = eventConditionBuilder1; int $i$a$-also-EventConditionBuilder$ifServerPlayer$1 = 0; if (action != null) it.invoke(action);  return eventConditionBuilder1; } @NotNull public final EventConditionBuilder<L, LocalPlayer> isLocalPlayer(@Nullable Function2 action) { E e = this.entity; EventConditionBuilder<L, LocalPlayer> eventConditionBuilder1 = new EventConditionBuilder(this.level, (E)((e instanceof LocalPlayer) ? (Entity)e : null), this.afterTicks), it = eventConditionBuilder1; int $i$a$-also-EventConditionBuilder$isLocalPlayer$1 = 0;
/*    */     if (action != null)
/*    */       it.invoke(action); 
/*    */     return eventConditionBuilder1; }
/*    */ 
/*    */   
/*    */   public final void invoke(@NotNull Function2 action) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'action'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   10: ifnull -> 66
/*    */     //   13: aload_0
/*    */     //   14: getfield entity : Lnet/minecraft/world/entity/Entity;
/*    */     //   17: ifnull -> 66
/*    */     //   20: aload_0
/*    */     //   21: getfield afterTicks : Ljava/lang/Integer;
/*    */     //   24: ifnull -> 51
/*    */     //   27: aload_0
/*    */     //   28: getfield afterTicks : Ljava/lang/Integer;
/*    */     //   31: dup
/*    */     //   32: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   35: invokevirtual intValue : ()I
/*    */     //   38: aload_1
/*    */     //   39: aload_0
/*    */     //   40: <illegal opcode> run : (Lkotlin/jvm/functions/Function2;Ldev/wendigodrip/thebrokenscript/events/condition/EventConditionBuilder;)Ljava/lang/Runnable;
/*    */     //   45: invokestatic queueServerWork : (ILjava/lang/Runnable;)V
/*    */     //   48: goto -> 66
/*    */     //   51: aload_1
/*    */     //   52: aload_0
/*    */     //   53: getfield level : Lnet/minecraft/world/level/Level;
/*    */     //   56: aload_0
/*    */     //   57: getfield entity : Lnet/minecraft/world/entity/Entity;
/*    */     //   60: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   65: pop
/*    */     //   66: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #45	-> 6
/*    */     //   #46	-> 20
/*    */     //   #47	-> 27
/*    */     //   #51	-> 51
/*    */     //   #54	-> 66
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	67	0	this	Ldev/wendigodrip/thebrokenscript/events/condition/EventConditionBuilder;
/*    */     //   0	67	1	action	Lkotlin/jvm/functions/Function2;
/*    */   }
/*    */   
/*    */   private static final void invoke$lambda$9(Function2 $action, EventConditionBuilder this$0) {
/*    */     $action.invoke(this$0.level, this$0.entity);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\condition\EventConditionBuilder.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */