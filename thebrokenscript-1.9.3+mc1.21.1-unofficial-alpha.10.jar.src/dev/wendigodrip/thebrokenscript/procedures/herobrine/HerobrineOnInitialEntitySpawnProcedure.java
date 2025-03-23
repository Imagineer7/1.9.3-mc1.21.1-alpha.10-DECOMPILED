/*    */ package dev.wendigodrip.thebrokenscript.procedures.herobrine;
/*    */ 
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\b\020\f\032\004\030\0010\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/herobrine/HerobrineOnInitialEntitySpawnProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class HerobrineOnInitialEntitySpawnProcedure {
/*    */   @JvmStatic
/* 11 */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) { Intrinsics.checkNotNullParameter(world, "world"); if (entity == null) {
/*    */       return;
/*    */     }
/*    */     
/* 15 */     if (!world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && !entity.level().isClientSide()) {
/* 16 */       entity.discard();
/* 17 */     } else if (Math.random() < 0.99D) {
/* 18 */       if (!entity.level().isClientSide()) {
/* 19 */         entity.discard();
/*    */       }
/*    */     } else {
/* 22 */       TheBrokenScript.queueServerWork(400, entity::execute$lambda$0);
/* 23 */     }  } @NotNull public static final HerobrineOnInitialEntitySpawnProcedure INSTANCE = new HerobrineOnInitialEntitySpawnProcedure(); private static final void execute$lambda$0(Entity $entity) { if (!$entity.level().isClientSide())
/* 24 */       $entity.discard();  }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\herobrine\HerobrineOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */