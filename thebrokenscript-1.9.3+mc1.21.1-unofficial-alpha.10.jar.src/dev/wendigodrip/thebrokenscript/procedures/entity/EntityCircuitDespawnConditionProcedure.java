/*    */ package dev.wendigodrip.thebrokenscript.procedures.entity;
/*    */ import dev.wendigodrip.thebrokenscript.entity.CircuitStalkEntity;
/*    */ import dev.wendigodrip.thebrokenscript.entity.CircuitStareEntity;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J0\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020J<\020\b\032\0020\0052\b\020\006\032\004\030\0010\0212\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020H\002¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/entity/EntityCircuitDespawnConditionProcedure;", "", "<init>", "()V", "onEntitySpawned", "", "event", "Lnet/neoforged/neoforge/event/entity/EntityJoinLevelEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class EntityCircuitDespawnConditionProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onEntitySpawned(@NotNull EntityJoinLevelEvent event) {
/* 21 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     
/* 23 */     Intrinsics.checkNotNullExpressionValue(event.getLevel(), "getLevel(...)"); execute((Event)event, (LevelAccessor)event.getLevel(), 
/* 24 */         event.getEntity().getX(), 
/* 25 */         event.getEntity().getY(), 
/* 26 */         event.getEntity().getZ(), 
/* 27 */         event.getEntity());
/*    */   }
/*    */   @NotNull
/*    */   public static final EntityCircuitDespawnConditionProcedure INSTANCE = new EntityCircuitDespawnConditionProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/* 32 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z, entity);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 43 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 46 */     if (entity.getType()
/* 47 */       .is(
/* 48 */         TagKey.create(
/* 49 */           Registries.ENTITY_TYPE, 
/* 50 */           TBSConstants.id("despawnable"))))
/*    */     
/* 52 */     { if (world.getEntitiesOfClass(
/* 53 */           CircuitStalkEntity.class, 
/* 54 */           AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), EntityCircuitDespawnConditionProcedure::execute$lambda$0
/* 55 */           ::execute$lambda$1).isEmpty())
/*    */       
/*    */       { 
/*    */         
/* 59 */         if (!world.getEntitiesOfClass(CircuitStareEntity.class, AABB.ofSize(new Vec3(x, y, z), 2000.0D, 2000.0D, 2000.0D), EntityCircuitDespawnConditionProcedure::execute$lambda$2::execute$lambda$3).isEmpty())
/* 60 */         { if (!entity.level().isClientSide())
/*    */           {
/*    */             
/* 63 */             entity.discard(); }  return; }  return; }  } else { return; }  if (!entity.level().isClientSide()) entity.discard(); 
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$0(CircuitStalkEntity e) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) {
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$2(CircuitStareEntity e) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$3(Function1 $tmp0, Object p0) {
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\entity\EntityCircuitDespawnConditionProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */