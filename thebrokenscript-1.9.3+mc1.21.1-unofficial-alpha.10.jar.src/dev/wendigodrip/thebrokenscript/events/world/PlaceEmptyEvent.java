/*    */ package dev.wendigodrip.thebrokenscript.events.world;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/world/PlaceEmptyEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class PlaceEmptyEvent extends BaseEvent {
/*    */   public PlaceEmptyEvent() {
/* 13 */     super("place_empty", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 15 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); MapVariables vars = MapVariables.Companion.get((LevelAccessor)level);
/*    */     
/* 17 */     if (level.getEntitiesOfClass(
/* 18 */         Player.class, AABB.ofSize(new Vec3(vars.getBaseX(), vars.getBaseY(), vars.getBaseZ()), 50.0D, 50.0D, 50.0D), PlaceEmptyEvent::execute$lambda$0
/* 19 */         ::execute$lambda$1).isEmpty())
/*    */     {
/* 21 */       level.setBlock(
/* 22 */           BlockPos.containing(vars.getBaseX(), vars.getBaseY(), vars.getBaseZ()), ((Block)TBSBlocks.INSTANCE.getEMPTY().get()).defaultBlockState(), 3);
/*    */     }
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$0(Player it) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) {
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\world\PlaceEmptyEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */