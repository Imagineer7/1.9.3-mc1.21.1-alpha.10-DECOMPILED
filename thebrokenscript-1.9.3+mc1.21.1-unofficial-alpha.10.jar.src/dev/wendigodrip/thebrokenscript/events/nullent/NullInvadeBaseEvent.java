/*    */ package dev.wendigodrip.thebrokenscript.events.nullent;
/*    */ import dev.wendigodrip.thebrokenscript.entity.NullInvadeBaseEntity;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/nullent/NullInvadeBaseEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class NullInvadeBaseEvent extends BaseEvent {
/*    */   public NullInvadeBaseEvent() {
/* 12 */     super("null_invade_base", 1);
/*    */   }
/* 14 */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); onServer(NullInvadeBaseEvent::execute$lambda$0); } private static final Unit execute$lambda$0(ServerLevel it) {
/* 15 */     Intrinsics.checkNotNullParameter(it, "it"); MapVariables vars = MapVariables.Companion.get((LevelAccessor)it);
/*    */     
/* 17 */     NullInvadeBaseEntity toSpawn = (NullInvadeBaseEntity)((EntityType)TBSEntities.NULL_INVADE_BASE.get())
/* 18 */       .spawn(it, BlockPos.containing(vars.getBaseX(), vars.getBaseY() + 1.0D, vars.getBaseZ()), MobSpawnType.MOB_SUMMONED);
/*    */     
/* 20 */     if (toSpawn != null) {
/* 21 */       toSpawn.setYRot(it.random.nextFloat() * 360.0F);
/*    */     }
/* 23 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\nullent\NullInvadeBaseEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */