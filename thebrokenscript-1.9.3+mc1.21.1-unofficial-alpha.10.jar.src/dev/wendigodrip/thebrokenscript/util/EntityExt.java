/*    */ package dev.wendigodrip.thebrokenscript.util;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\006\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J,\020\004\032\0020\005*\n\022\006\b\001\022\0020\0070\0062\006\020\b\032\0020\t2\006\020\n\032\0020\0132\b\b\002\020\f\032\0020\r¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/util/EntityExt;", "", "<init>", "()V", "discardNearest", "", "Ljava/lang/Class;", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "level", "Lnet/minecraft/world/level/Level;", "maxDist", "", "thebrokenscript"})
/*    */ public final class EntityExt {
/*    */   public final void discardNearest(@NotNull Class<Entity> $this$discardNearest, @NotNull Vec3 pos, @NotNull Level level, double maxDist) {
/* 10 */     Intrinsics.checkNotNullParameter($this$discardNearest, "<this>"); Intrinsics.checkNotNullParameter(pos, "pos"); Intrinsics.checkNotNullParameter(level, "level"); Entity closest = EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, $this$discardNearest, pos, maxDist);
/*    */     
/* 12 */     if (closest != null && !closest.level().isClientSide())
/* 13 */       closest.discard(); 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final EntityExt INSTANCE = new EntityExt();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscrip\\util\EntityExt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */