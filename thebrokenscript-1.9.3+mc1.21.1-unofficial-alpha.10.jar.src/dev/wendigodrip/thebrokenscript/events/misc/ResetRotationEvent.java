/*    */ package dev.wendigodrip.thebrokenscript.events.misc;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/misc/ResetRotationEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class ResetRotationEvent extends BaseEvent {
/*    */   public ResetRotationEvent() {
/*  9 */     super("reset_rotation", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 11 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); entity.setYRot(5.0F);
/* 12 */     entity.setXRot(0.0F);
/* 13 */     entity.setYBodyRot(entity.getYRot());
/* 14 */     entity.setYHeadRot(entity.getYRot());
/* 15 */     entity.yRotO = entity.getYRot();
/* 16 */     entity.xRotO = entity.getXRot();
/*    */     
/* 18 */     if (entity instanceof LivingEntity) {
/* 19 */       ((LivingEntity)entity).yBodyRotO = entity.getYRot();
/* 20 */       ((LivingEntity)entity).yHeadRotO = entity.getYRot();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\misc\ResetRotationEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */