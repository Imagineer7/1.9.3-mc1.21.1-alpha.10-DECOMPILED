/*    */ package dev.wendigodrip.thebrokenscript.events.nullent;
/*    */ import dev.wendigodrip.thebrokenscript.world.inventory.NulledGuiMenu;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/nullent/NulledGuiEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class NulledGuiEvent extends BaseEvent {
/*    */   public NulledGuiEvent() {
/* 13 */     super("nulled_gui", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 15 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); condition().ifServerPlayer(pos::execute$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     onServer(new NulledGuiEvent$execute$2(TimeOfDay.MIDNIGHT));
/* 22 */     Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getGLITHCSOUND1().get(), "get(...)"); BaseEvent.playSound$default(this, pos, (SoundEvent)TBSSounds.INSTANCE.getGLITHCSOUND1().get(), 555.0F, 1.0F, false, 16, null);
/*    */   }
/*    */   
/*    */   private static final Unit execute$lambda$0(Vec3 $pos, Level paramLevel, ServerPlayer it) {
/*    */     Intrinsics.checkNotNullParameter(paramLevel, "<unused var>");
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     Intrinsics.checkNotNullExpressionValue(BlockPos.containing((Position)$pos), "containing(...)");
/*    */     it.openMenu((MenuProvider)new NullMenuProvider("NulledGui", BlockPos.containing((Position)$pos), NulledGuiEvent$execute$1$1.INSTANCE), BlockPos.containing((Position)$pos));
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\nullent\NulledGuiEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */