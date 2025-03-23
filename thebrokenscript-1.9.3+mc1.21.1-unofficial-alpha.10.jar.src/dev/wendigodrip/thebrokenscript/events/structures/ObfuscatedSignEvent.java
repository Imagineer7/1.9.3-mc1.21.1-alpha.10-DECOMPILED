/*    */ package dev.wendigodrip.thebrokenscript.events.structures;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/structures/ObfuscatedSignEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class ObfuscatedSignEvent extends BaseEvent {
/*    */   public ObfuscatedSignEvent() {
/* 14 */     super("obfuscated_sign", 1);
/*    */   }
/* 16 */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); onServer(level::execute$lambda$0); } private static final Unit execute$lambda$0(Level $level, ServerLevel it) {
/* 17 */     Intrinsics.checkNotNullParameter(it, "it"); MapVariables vars = MapVariables.Companion.get((LevelAccessor)$level);
/*    */     
/* 19 */     it.getStructureManager().getOrCreate(TBSConstants.id("obfuscatedsign")).placeInWorld(
/* 20 */         (ServerLevelAccessor)it, 
/* 21 */         BlockPos.containing(vars.getBaseX(), vars.getBaseY() + 1.0D, vars.getBaseZ()), 
/* 22 */         BlockPos.containing(vars.getBaseX(), vars.getBaseY() + 1.0D, vars.getBaseZ()), (
/* 23 */         new StructurePlaceSettings()).setRotation(Rotation.getRandom(it.random)).setMirror(Mirror.NONE)
/* 24 */         .setIgnoreEntities(false), 
/* 25 */         it.random, 
/* 26 */         3);
/*    */     
/* 28 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\structures\ObfuscatedSignEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */