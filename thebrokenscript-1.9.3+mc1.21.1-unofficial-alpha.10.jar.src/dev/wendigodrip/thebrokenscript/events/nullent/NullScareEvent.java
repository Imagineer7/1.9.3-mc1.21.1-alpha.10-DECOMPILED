/*    */ package dev.wendigodrip.thebrokenscript.events.nullent;
/*    */ import dev.wendigodrip.thebrokenscript.entity.NullScareEntity;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.Mth;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/nullent/NullScareEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class NullScareEvent extends BaseEvent {
/*    */   public NullScareEvent() {
/* 13 */     super("null_scare", 1);
/*    */   }
/* 15 */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); onServer(pos::execute$lambda$0); } private static final Unit execute$lambda$0(Vec3 $pos, ServerLevel it) {
/* 16 */     Intrinsics.checkNotNullParameter(it, "it"); double scalar = (Math.random() < 0.5D) ? 1.0D : -1.0D;
/* 17 */     double offsetX = Mth.nextInt(RandomSource.create(), 0, 5) * scalar;
/* 18 */     double offsetY = Mth.nextInt(RandomSource.create(), 0, 5);
/* 19 */     double offsetZ = Mth.nextInt(RandomSource.create(), 0, 5) * scalar;
/* 20 */     Vec3 offset = new Vec3(offsetX, offsetY, offsetZ);
/*    */     
/* 22 */     NullScareEntity toSpawn = 
/* 23 */       (NullScareEntity)((EntityType)TBSEntities.NULL_SCARE.get()).spawn(it, BlockPos.containing((Position)$pos.add(offset)), MobSpawnType.MOB_SUMMONED);
/*    */     
/* 25 */     if (toSpawn != null) toSpawn.setYRot(it.random.nextFloat() * 360.0F); 
/* 26 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\nullent\NullScareEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */