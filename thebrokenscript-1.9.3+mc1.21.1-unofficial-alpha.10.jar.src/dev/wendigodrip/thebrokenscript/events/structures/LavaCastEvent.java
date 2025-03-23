/*    */ package dev.wendigodrip.thebrokenscript.events.structures;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/structures/LavaCastEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class LavaCastEvent extends BaseEvent {
/*    */   public LavaCastEvent() {
/* 14 */     super("lava_cast", 1);
/*    */   }
/* 16 */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); onServer(level::execute$lambda$0); } private static final Unit execute$lambda$0(Level $level, ServerLevel it) {
/* 17 */     Intrinsics.checkNotNullParameter(it, "it"); MapVariables vars = MapVariables.Companion.get((LevelAccessor)$level);
/* 18 */     StructureTemplate template = it.getStructureManager().getOrCreate(TBSConstants.id("lavacast"));
/*    */     
/* 20 */     if ((vars.getEntityReputation() == 0.0D)) {
/* 21 */       template.placeInWorld(
/* 22 */           (ServerLevelAccessor)it, 
/* 23 */           BlockPos.containing(vars.getBaseX(), vars.getBaseY(), vars.getBaseZ()), 
/* 24 */           BlockPos.containing(vars.getBaseX(), vars.getBaseY(), vars.getBaseZ()), (
/* 25 */           new StructurePlaceSettings()).setRotation(Rotation.getRandom(it.random))
/* 26 */           .setMirror((Mirror)EntriesMappings.entries$0.get(it.random.nextInt(2))).setIgnoreEntities(false), 
/* 27 */           it.random, 
/* 28 */           3);
/*    */     }
/*    */     
/* 31 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\structures\LavaCastEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */