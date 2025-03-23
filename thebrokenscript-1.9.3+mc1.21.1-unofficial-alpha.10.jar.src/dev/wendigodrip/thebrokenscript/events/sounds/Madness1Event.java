/*    */ package dev.wendigodrip.thebrokenscript.events.sounds;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSSounds;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.ClipContext;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/sounds/Madness1Event;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class Madness1Event extends BaseEvent {
/*    */   public Madness1Event() {
/* 13 */     super("madness1", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 15 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); if (entity instanceof Player && !entity.level().isClientSide()) {
/* 16 */       ((Player)entity).displayClientMessage((Component)Component.literal("=)"), true);
/*    */     }
/*    */     
/* 19 */     Intrinsics.checkNotNullExpressionValue(TBSSounds.TEXTMADNESS1.get(), "get(...)"); BaseEvent.playSound$default(this, pos, (SoundEvent)TBSSounds.TEXTMADNESS1.get(), 555.0F, 0.0F, false, 16, null);
/*    */     
/* 21 */     entity.lookAt(
/* 22 */         EntityAnchorArgument.Anchor.EYES, new Vec3(
/* 23 */           entity.level().clip(
/* 24 */             new ClipContext(
/* 25 */               entity.getEyePosition(1.0F), 
/* 26 */               entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(-5.0D)), 
/* 27 */               ClipContext.Block.OUTLINE, 
/* 28 */               ClipContext.Fluid.NONE, 
/* 29 */               entity))
/*    */           
/* 31 */           .getBlockPos().getX(), pos.y, entity.level().clip(
/* 32 */             new ClipContext(
/* 33 */               entity.getEyePosition(1.0F), 
/* 34 */               entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(-5.0D)), 
/* 35 */               ClipContext.Block.OUTLINE, 
/* 36 */               ClipContext.Fluid.NONE, 
/* 37 */               entity))
/*    */           
/* 39 */           .getBlockPos().getZ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\sounds\Madness1Event.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */