/*    */ package dev.wendigodrip.thebrokenscript.events.entities;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.FalseVillagerEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/entities/FalseVillagerEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class FalseVillagerEvent extends BaseEvent {
/* 11 */   public FalseVillagerEvent() { super("false_villager", 1); } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'level'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'entity'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'pos'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload_0
/*    */     //   19: aload_3
/*    */     //   20: aload_1
/*    */     //   21: <illegal opcode> invoke : (Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/level/Level;)Lkotlin/jvm/functions/Function1;
/*    */     //   26: invokevirtual onServer : (Lkotlin/jvm/functions/Function1;)V
/*    */     //   29: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 18
/*    */     //   #23	-> 29
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	30	0	this	Ldev/wendigodrip/thebrokenscript/events/entities/FalseVillagerEvent;
/*    */     //   0	30	1	level	Lnet/minecraft/world/level/Level;
/*    */     //   0	30	2	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	30	3	pos	Lnet/minecraft/world/phys/Vec3;
/*    */   } private static final Unit execute$lambda$0(Vec3 $pos, Level $level, ServerLevel it) {
/* 14 */     Intrinsics.checkNotNullParameter(it, "it"); if (it.isVillage(BlockPos.containing((Position)$pos))) {
/* 15 */       FalseVillagerEntity toSpawn = (FalseVillagerEntity)((EntityType)TBSEntities.FALSE_VILLAGER.get())
/* 16 */         .spawn(it, BlockPos.containing((Position)$pos.add(40.0D, 100.0D, 0.0D)), MobSpawnType.MOB_SUMMONED);
/*    */       
/* 18 */       if (toSpawn != null) {
/* 19 */         toSpawn.setYRot($level.random.nextFloat() * 360.0F);
/*    */       }
/*    */     } 
/* 22 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\entities\FalseVillagerEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */