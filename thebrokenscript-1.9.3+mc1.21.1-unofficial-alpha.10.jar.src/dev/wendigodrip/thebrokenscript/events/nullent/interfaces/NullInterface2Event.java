/*    */ package dev.wendigodrip.thebrokenscript.events.nullent.interfaces;
/*    */ import dev.wendigodrip.thebrokenscript.world.inventory.NullInterface2Menu;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/nullent/interfaces/NullInterface2Event;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class NullInterface2Event extends BaseEvent {
/*    */   public NullInterface2Event() {
/* 10 */     super("null_interface_2", 1);
/*    */   }
/* 12 */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); condition().ifPlayer(pos::execute$lambda$0); } private static final Unit execute$lambda$0(Vec3 $pos, Level paramLevel, Player it) {
/* 13 */     Intrinsics.checkNotNullParameter(paramLevel, "<unused var>"); Intrinsics.checkNotNullParameter(it, "it");
/*    */     
/* 15 */     Intrinsics.checkNotNullExpressionValue(BlockPos.containing((Position)$pos), "containing(...)"); it.openMenu(new NullMenuProvider<>("NullInterface2", BlockPos.containing((Position)$pos), NullInterface2Event$execute$1$1.INSTANCE), 
/* 16 */         BlockPos.containing((Position)$pos));
/*    */     
/* 18 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\nullent\interfaces\NullInterface2Event.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */