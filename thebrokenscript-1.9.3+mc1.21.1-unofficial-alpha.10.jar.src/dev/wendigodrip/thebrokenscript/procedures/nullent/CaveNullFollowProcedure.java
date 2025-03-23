/*    */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J&\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fJ2\020\b\032\0020\0052\b\020\006\032\004\030\0010\0172\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/nullent/CaveNullFollowProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class CaveNullFollowProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 18 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     
/* 20 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), 
/* 21 */         event.getEntity().getX(), 
/* 22 */         event.getEntity().getY(), 
/* 23 */         event.getEntity().getZ());
/*    */   }
/*    */   @NotNull
/*    */   public static final CaveNullFollowProcedure INSTANCE = new CaveNullFollowProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 28 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z) {
/* 32 */     if (y < 40.0D && 
/* 33 */       world.getBlockState(BlockPos.containing(x, y + 2.0D, z)).canOcclude() && 
/* 34 */       world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).canOcclude() && Math.random() < 3.0E-5D && 
/* 35 */       world instanceof ServerLevel) {
/*    */       
/* 37 */       Intrinsics.checkNotNull(TBSEntities.NULL_MINING.get(), "null cannot be cast to non-null type net.minecraft.world.entity.EntityType<*>"); Entity entityToSpawn = ((EntityType)TBSEntities.NULL_MINING.get()).spawn(
/* 38 */           (ServerLevel)world, 
/* 39 */           BlockPos.containing(
/* 40 */             x + 
/* 41 */             10.0D, 
/* 42 */             y, 
/* 43 */             z + 
/* 44 */             5.0D), 
/*    */           
/* 46 */           MobSpawnType.MOB_SUMMONED);
/*    */       
/* 48 */       if (entityToSpawn != null)
/* 49 */         entityToSpawn.setYRot(((ServerLevel)world).getRandom().nextFloat() * 360.0F); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\CaveNullFollowProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */