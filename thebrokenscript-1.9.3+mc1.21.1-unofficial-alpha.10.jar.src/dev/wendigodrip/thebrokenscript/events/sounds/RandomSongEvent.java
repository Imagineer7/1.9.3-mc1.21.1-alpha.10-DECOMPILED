/*    */ package dev.wendigodrip.thebrokenscript.events.sounds;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.StrikeEntity;
/*    */ import dev.wendigodrip.thebrokenscript.util.TimeOfDay;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/sounds/RandomSongEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class RandomSongEvent extends BaseEvent {
/* 15 */   public RandomSongEvent() { super("random_song", 1); } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'level'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'entity'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'pos'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload_0
/*    */     //   19: iconst_1
/*    */     //   20: aload_0
/*    */     //   21: aload_3
/*    */     //   22: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/sounds/RandomSongEvent;Lnet/minecraft/world/phys/Vec3;)Lkotlin/jvm/functions/Function0;
/*    */     //   27: invokevirtual doWork : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   30: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 18
/*    */     //   #41	-> 30
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	31	0	this	Ldev/wendigodrip/thebrokenscript/events/sounds/RandomSongEvent;
/*    */     //   0	31	1	level	Lnet/minecraft/world/level/Level;
/*    */     //   0	31	2	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	31	3	pos	Lnet/minecraft/world/phys/Vec3;
/*    */   } private static final Unit execute$lambda$2(RandomSongEvent this$0, Vec3 $pos) {
/* 18 */     Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getRANDOMSONG().get(), "get(...)"); BaseEvent.playSound$default(this$0, $pos, (SoundEvent)TBSSounds.INSTANCE.getRANDOMSONG().get(), 555.0F, 1.0F, false, 16, null);
/* 19 */     this$0.onServer(new RandomSongEvent$execute$1$1(TimeOfDay.MIDNIGHT));
/*    */     
/* 21 */     EventConditionBuilder.ifLiving$default(this$0.condition(), null, 1, null).onServer(RandomSongEvent::execute$lambda$2$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     EventConditionBuilder.after$default(this$0.condition(), 320, null, 2, null).onServer($pos::execute$lambda$2$lambda$1);
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
/* 40 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit execute$lambda$2$lambda$0(ServerLevel paramServerLevel, LivingEntity ent) {
/*    */     Intrinsics.checkNotNullParameter(paramServerLevel, "<unused var>");
/*    */     Intrinsics.checkNotNullParameter(ent, "ent");
/*    */     ent.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 320, 1));
/*    */     ent.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 320, 1));
/*    */     ent.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 320, 1));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit execute$lambda$2$lambda$1(Vec3 $pos, ServerLevel level, Entity paramEntity) {
/*    */     Intrinsics.checkNotNullParameter(level, "level");
/*    */     Intrinsics.checkNotNullParameter(paramEntity, "<unused var>");
/*    */     if (Math.random() < 0.5D) {
/*    */       StrikeEntity strike = (StrikeEntity)((EntityType)TBSEntities.STRIKE.get()).spawn(level, BlockPos.containing((Position)$pos), MobSpawnType.MOB_SUMMONED);
/*    */       if (strike != null)
/*    */         strike.setYRot(level.getRandom().nextFloat() * 360.0F); 
/*    */     } 
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\sounds\RandomSongEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */