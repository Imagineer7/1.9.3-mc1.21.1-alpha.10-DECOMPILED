/*    */ package dev.wendigodrip.thebrokenscript.events.advancements;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.advancements.AdvancementProgress;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/advancements/CanSomeoneHearMeAdvancementEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class CanSomeoneHearMeAdvancementEvent extends BaseEvent {
/*    */   public CanSomeoneHearMeAdvancementEvent() {
/* 10 */     super("can_someone_hear_me_advancement", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 12 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); if (entity instanceof ServerPlayer) {
/* 13 */       Intrinsics.checkNotNull(((ServerPlayer)entity).server.getAdvancements().get(TBSAdvancements.INSTANCE.getCAN_SOMEONE_HEAR_ME())); AdvancementHolder advancement = ((ServerPlayer)entity).server.getAdvancements().get(TBSAdvancements.INSTANCE.getCAN_SOMEONE_HEAR_ME());
/* 14 */       AdvancementProgress progress = ((ServerPlayer)entity).getAdvancements().getOrStartProgress(advancement);
/*    */       
/* 16 */       if (!progress.isDone())
/* 17 */         for (String criteria : progress.getRemainingCriteria())
/* 18 */           ((ServerPlayer)entity).getAdvancements().award(advancement, criteria);  
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\advancements\CanSomeoneHearMeAdvancementEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */