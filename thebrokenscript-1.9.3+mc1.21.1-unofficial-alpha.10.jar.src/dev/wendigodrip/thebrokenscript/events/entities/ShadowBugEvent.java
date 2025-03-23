/*    */ package dev.wendigodrip.thebrokenscript.events.entities;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/entities/ShadowBugEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class ShadowBugEvent extends BaseEvent {
/*    */   public ShadowBugEvent() {
/* 10 */     super("shadow_bug", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 12 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); int yi = 0;
/* 13 */     int horizontalRadiusSquare = 9;
/* 14 */     int yIterationsSquare = 9;
/*    */     
/* 16 */     while (yi <= yIterationsSquare) {
/* 17 */       int xi = -horizontalRadiusSquare; if (xi <= horizontalRadiusSquare)
/* 18 */         while (true) { int zi = -horizontalRadiusSquare; if (zi <= horizontalRadiusSquare)
/* 19 */             while (true) { Vec3 offset = new Vec3(xi, yi, zi);
/*    */               
/* 21 */               level.setBlock(
/* 22 */                   BlockPos.containing((Position)pos.add(offset)), ((Block)TBSBlocks.INSTANCE.getSHADOW_BUG().get()).defaultBlockState(), 3); if (zi != horizontalRadiusSquare) { zi++; continue; }
/*    */                break; }
/*    */               if (xi != horizontalRadiusSquare) {
/*    */             xi++; continue;
/*    */           }  break; }
/* 27 */           yi++;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\entities\ShadowBugEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */