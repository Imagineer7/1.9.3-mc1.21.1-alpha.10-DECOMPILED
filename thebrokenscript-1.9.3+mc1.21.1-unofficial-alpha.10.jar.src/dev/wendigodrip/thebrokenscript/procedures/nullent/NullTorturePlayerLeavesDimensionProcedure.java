/*    */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\t¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/nullent/NullTorturePlayerLeavesDimensionProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class NullTorturePlayerLeavesDimensionProcedure {
/*    */   public final void execute(@NotNull LevelAccessor world, @Nullable Entity entity) {
/* 10 */     Intrinsics.checkNotNullParameter(world, "world"); if (entity == null) {
/*    */       return;
/*    */     }
/* 13 */     Entity _ent = entity;
/* 14 */     _ent.teleportTo(
/* 15 */         MapVariables.Companion.get(world).getBaseX(), 
/* 16 */         MapVariables.Companion.get(world).getBaseY(), 
/* 17 */         MapVariables.Companion.get(world).getBaseZ());
/*    */     
/* 19 */     if (_ent instanceof ServerPlayer)
/* 20 */       ((ServerPlayer)_ent).connection.teleport(
/* 21 */           MapVariables.Companion.get(world).getBaseX(), 
/* 22 */           MapVariables.Companion.get(world).getBaseY(), 
/* 23 */           MapVariables.Companion.get(world).getBaseZ(), 
/* 24 */           _ent.getYRot(), 
/* 25 */           _ent.getXRot()); 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final NullTorturePlayerLeavesDimensionProcedure INSTANCE = new NullTorturePlayerLeavesDimensionProcedure();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullTorturePlayerLeavesDimensionProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */