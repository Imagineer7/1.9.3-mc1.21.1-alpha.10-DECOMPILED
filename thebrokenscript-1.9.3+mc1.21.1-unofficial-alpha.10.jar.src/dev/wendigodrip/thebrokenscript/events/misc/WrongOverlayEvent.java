/*    */ package dev.wendigodrip.thebrokenscript.events.misc;
/*    */ import dev.wendigodrip.thebrokenscript.entity.WrongOverlayEntity;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/misc/WrongOverlayEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class WrongOverlayEvent extends BaseEvent {
/*    */   public WrongOverlayEvent() {
/* 17 */     super("wrong_overlay", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 19 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); onServer(pos::execute$lambda$0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 27 */     List found = level.getEntitiesOfClass(Entity.class, (new AABB(pos, pos)).inflate(500.0D), WrongOverlayEvent::execute$lambda$1::execute$lambda$2).stream()
/* 28 */       .sorted(Comparator.comparingDouble(pos::execute$lambda$3::execute$lambda$4)).toList();
/*    */     
/* 30 */     for (Entity ent : found) {
/* 31 */       if (ent instanceof Player) {
/*    */         
/* 33 */         ((Player)ent).teleportTo(pos.x, pos.y + 50.0D, pos.z);
/*    */         
/* 35 */         if (ent instanceof ServerPlayer) {
/* 36 */           ((ServerPlayer)ent).connection.teleport(pos.x, pos.y + 50.0D, pos.z, ((ServerPlayer)ent).getYRot(), ((ServerPlayer)ent).getXRot());
/*    */         }
/*    */         
/* 39 */         if (!(ent instanceof LivingEntity) || ((LivingEntity)ent).level()
/* 40 */           .isClientSide()) {
/*    */           continue;
/*    */         }
/* 43 */         ((Player)ent).addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 500, 1, false, false));
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   private static final Unit execute$lambda$0(Vec3 $pos, ServerLevel it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     WrongOverlayEntity toSpawn = (WrongOverlayEntity)((EntityType)TBSEntities.WRONG_OVERLAY.get()).spawn(it, BlockPos.containing((Position)$pos), MobSpawnType.MOB_SUMMONED);
/*    */     if (toSpawn != null)
/*    */       toSpawn.setYRot(it.random.nextFloat() * 360.0F); 
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$1(Entity it) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$2(Function1 $tmp0, Object p0) {
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */   }
/*    */   
/*    */   private static final double execute$lambda$3(Vec3 $pos, Entity it) {
/*    */     return it.distanceToSqr($pos);
/*    */   }
/*    */   
/*    */   private static final double execute$lambda$4(Function1 $tmp0, Object p0) {
/*    */     return ((Number)$tmp0.invoke(p0)).doubleValue();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\misc\WrongOverlayEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */