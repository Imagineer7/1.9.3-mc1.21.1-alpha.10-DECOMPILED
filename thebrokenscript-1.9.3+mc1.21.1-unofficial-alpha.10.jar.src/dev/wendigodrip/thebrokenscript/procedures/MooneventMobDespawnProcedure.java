/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.ICancellableEvent;
/*    */ import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\030\020\b\032\0020\0052\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fJ$\020\b\032\0020\0052\b\020\006\032\004\030\0010\r2\006\020\t\032\0020\n2\b\020\013\032\004\030\0010\fH\002¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/MooneventMobDespawnProcedure;", "", "<init>", "()V", "onEntitySpawned", "", "event", "Lnet/neoforged/neoforge/event/entity/EntityJoinLevelEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/ICancellableEvent;", "thebrokenscript"})
/*    */ public final class MooneventMobDespawnProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onEntitySpawned(@NotNull EntityJoinLevelEvent event) {
/* 17 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getLevel(), "getLevel(...)"); execute((ICancellableEvent)event, (LevelAccessor)event.getLevel(), event.getEntity());
/*    */   } @NotNull
/*    */   public static final MooneventMobDespawnProcedure INSTANCE = new MooneventMobDespawnProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, @Nullable Entity entity) {
/* 21 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, entity);
/*    */   }
/*    */   
/*    */   private final void execute(ICancellableEvent event, LevelAccessor world, Entity entity) {
/* 25 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 28 */     if (world.dimensionType().moonPhase(world.dayTime()) == 5)
/* 29 */       if (entity.getType()
/* 30 */         .is(
/* 31 */           TagKey.create(
/* 32 */             Registries.ENTITY_TYPE, 
/* 33 */             TBSConstants.id("despawnable"))))
/*    */       {
/*    */ 
/*    */         
/* 37 */         if (event != null && !event.isCanceled()) {
/* 38 */           event.setCanceled(true);
/*    */         }
/*    */       } 
/* 41 */     if (world.dimensionType().moonPhase(world.dayTime()) == 6)
/* 42 */       if (entity.getType()
/* 43 */         .is(
/* 44 */           TagKey.create(
/* 45 */             Registries.ENTITY_TYPE, 
/* 46 */             TBSConstants.id("despawnable"))))
/*    */       {
/*    */ 
/*    */         
/* 50 */         if (event != null && !event.isCanceled()) {
/* 51 */           event.setCanceled(true);
/*    */         }
/*    */       } 
/* 54 */     if (world.dimensionType().moonPhase(world.dayTime()) == 7)
/* 55 */       if (entity.getType()
/* 56 */         .is(
/* 57 */           TagKey.create(
/* 58 */             Registries.ENTITY_TYPE, 
/* 59 */             TBSConstants.id("despawnable"))))
/*    */       {
/*    */ 
/*    */         
/* 63 */         if (event != null && !event.isCanceled()) {
/* 64 */           event.setCanceled(true);
/*    */         }
/*    */       } 
/* 67 */     if (world.dimensionType().moonPhase(world.dayTime()) == 8)
/* 68 */       if (entity.getType()
/* 69 */         .is(
/* 70 */           TagKey.create(
/* 71 */             Registries.ENTITY_TYPE, 
/* 72 */             TBSConstants.id("despawnable"))))
/*    */       {
/*    */ 
/*    */         
/* 76 */         if (event != null && !event.isCanceled())
/* 77 */           event.setCanceled(true); 
/*    */       } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\MooneventMobDespawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */