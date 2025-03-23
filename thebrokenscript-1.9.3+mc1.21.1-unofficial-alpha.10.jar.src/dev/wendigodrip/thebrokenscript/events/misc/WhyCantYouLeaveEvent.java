/*    */ package dev.wendigodrip.thebrokenscript.events.misc;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/misc/WhyCantYouLeaveEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class WhyCantYouLeaveEvent extends BaseEvent {
/*    */   public WhyCantYouLeaveEvent() {
/* 10 */     super("why_cant_you_leave", 1);
/*    */   }
/* 12 */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); EventConditionBuilder.onServer$default(condition(), null, 1, null).ifLiving(WhyCantYouLeaveEvent::execute$lambda$0); } private static final Unit execute$lambda$0(ServerLevel paramServerLevel, LivingEntity it) {
/* 13 */     Intrinsics.checkNotNullParameter(paramServerLevel, "<unused var>"); Intrinsics.checkNotNullParameter(it, "it"); it.addEffect(new MobEffectInstance(TBSEffects.INSTANCE.getWHY_CANT_YOU_LEAVE().getDelegate(), 1000, 1));
/* 14 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\misc\WhyCantYouLeaveEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */