/*    */ package dev.wendigodrip.thebrokenscript.util;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\020 \n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J9\020\004\032\004\030\001H\005\"\b\b\000\020\005*\0020\006*\0020\0072\f\020\b\032\b\022\004\022\002H\0050\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r¢\006\002\020\016J8\020\017\032\b\022\004\022\002H\0050\020\"\b\b\000\020\005*\0020\006*\0020\0072\f\020\b\032\b\022\004\022\002H\0050\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rJ8\020\021\032\b\022\004\022\002H\0050\020\"\b\b\000\020\005*\0020\006*\0020\0072\f\020\b\032\b\022\004\022\002H\0050\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/util/EntityFinder;", "", "<init>", "()V", "findClosestEntityInRange", "T", "Lnet/minecraft/world/entity/Entity;", "Lnet/minecraft/world/level/LevelAccessor;", "clazz", "Ljava/lang/Class;", "base", "Lnet/minecraft/world/phys/Vec3;", "radius", "", "(Lnet/minecraft/world/level/LevelAccessor;Ljava/lang/Class;Lnet/minecraft/world/phys/Vec3;D)Lnet/minecraft/world/entity/Entity;", "findSortedEntitiesInRange", "", "findEntitiesInRange", "thebrokenscript"})
/*    */ public final class EntityFinder {
/*    */   @Nullable
/* 10 */   public final <T extends Entity> T findClosestEntityInRange(@NotNull LevelAccessor $this$findClosestEntityInRange, @NotNull Class<Entity> clazz, @NotNull Vec3 base, double radius) { Intrinsics.checkNotNullParameter($this$findClosestEntityInRange, "<this>"); Intrinsics.checkNotNullParameter(clazz, "clazz"); Intrinsics.checkNotNullParameter(base, "base"); return (T)CollectionsKt.firstOrNull(findSortedEntitiesInRange($this$findClosestEntityInRange, clazz, base, radius)); } @NotNull
/*    */   public static final EntityFinder INSTANCE = new EntityFinder(); @NotNull
/*    */   public final <T extends Entity> List<T> findSortedEntitiesInRange(@NotNull LevelAccessor $this$findSortedEntitiesInRange, @NotNull Class clazz, @NotNull Vec3 base, double radius) {
/* 13 */     Intrinsics.checkNotNullParameter($this$findSortedEntitiesInRange, "<this>"); Intrinsics.checkNotNullParameter(clazz, "clazz"); Intrinsics.checkNotNullParameter(base, "base");
/*    */ 
/*    */ 
/*    */     
/* 17 */     List<T> list = $this$findSortedEntitiesInRange.getEntitiesOfClass(clazz, AABB.ofSize(base, radius, radius, radius)).stream().sorted(Comparator.comparingDouble(base::findSortedEntitiesInRange$lambda$0::findSortedEntitiesInRange$lambda$1)).toList(); Intrinsics.checkNotNullExpressionValue(list, "toList(...)");
/*    */     return list; } private static final double findSortedEntitiesInRange$lambda$1(Function1 $tmp0, Object p0) { return ((Number)$tmp0.invoke(p0)).doubleValue(); }
/*    */   private static final double findSortedEntitiesInRange$lambda$0(Vec3 $base, Entity it) { return it.distanceToSqr($base); }
/* 20 */   @NotNull public final <T extends Entity> List<T> findEntitiesInRange(@NotNull LevelAccessor $this$findEntitiesInRange, @NotNull Class clazz, @NotNull Vec3 base, double radius) { Intrinsics.checkNotNullParameter($this$findEntitiesInRange, "<this>"); Intrinsics.checkNotNullParameter(clazz, "clazz"); Intrinsics.checkNotNullParameter(base, "base"); Intrinsics.checkNotNullExpressionValue($this$findEntitiesInRange.getEntitiesOfClass(clazz, AABB.ofSize(base, radius, radius, radius)), "getEntitiesOfClass(...)"); return $this$findEntitiesInRange.getEntitiesOfClass(clazz, AABB.ofSize(base, radius, radius, radius)); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscrip\\util\EntityFinder.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */