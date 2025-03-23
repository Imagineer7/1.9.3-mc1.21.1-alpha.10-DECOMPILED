/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import com.mojang.blaze3d.Blaze3D;
/*    */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*    */ import dev.wendigodrip.thebrokenscript.entity.NullEndgameEntity;
/*    */ import dev.wendigodrip.thebrokenscript.util.EntityFinder;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\007J0\020\n\032\0020\0072\006\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0162\006\020\020\032\0020\0162\006\020\021\032\0020\022H\002R\016\020\004\032\0020\005X\016¢\006\002\n\000¨\006\023"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/TrueEndgameProcedure;", "", "<init>", "()V", "spawnedWindow", "", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class TrueEndgameProcedure {
/*    */   @NotNull
/*    */   public static final TrueEndgameProcedure INSTANCE = new TrueEndgameProcedure();
/*    */   
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 21 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); Intrinsics.checkNotNullExpressionValue(event.getEntity(), "getEntity(...)"); execute((LevelAccessor)event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), (Entity)event.getEntity());
/*    */   }
/*    */   private static boolean spawnedWindow;
/*    */   private final void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 25 */     if (!EntityFinder.INSTANCE.findEntitiesInRange(world, NullEndgameEntity.class, new Vec3(x, y, z), 400.0D).isEmpty()) {
/* 26 */       entity.getPersistentData().putDouble("shutdown", entity.getPersistentData().getDouble("shutdown") + 1.0D);
/*    */       
/* 28 */       if (entity.getPersistentData().getDouble("shutdown") > 10.0D && !spawnedWindow) {
/* 29 */         (new AlertWindow("LWJGL Alert", "UNEXPECTED EXCEPTION -1")).show();
/* 30 */         spawnedWindow = true;
/*    */       } 
/*    */       
/* 33 */       if (entity.getPersistentData().getDouble("shutdown") > 15.0D) {
/* 34 */         TBSConfigs.INSTANCE.getCLIENT(); if (!((TBSConfigs.INSTANCE.getCLIENT() != null) ? ((TBSConfigs.INSTANCE.getCLIENT().getDisableCrashes() == true) ? 1 : 0) : 0))
/* 35 */           Blaze3D.youJustLostTheGame(); 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\TrueEndgameProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */