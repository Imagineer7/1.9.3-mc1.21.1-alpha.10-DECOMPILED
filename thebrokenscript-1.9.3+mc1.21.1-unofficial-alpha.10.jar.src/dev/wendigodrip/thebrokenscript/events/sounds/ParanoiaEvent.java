/*    */ package dev.wendigodrip.thebrokenscript.events.sounds;
/*    */ import kotlin.Unit;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/sounds/ParanoiaEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class ParanoiaEvent extends BaseEvent {
/*    */   public ParanoiaEvent() {
/*  9 */     super("paranoia", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
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
/*    */     //   19: checkcast dev/wendigodrip/thebrokenscript/events/BaseEvent
/*    */     //   22: aload_3
/*    */     //   23: getstatic net/minecraft/sounds/SoundEvents.GRASS_BREAK : Lnet/minecraft/sounds/SoundEvent;
/*    */     //   26: dup
/*    */     //   27: ldc 'GRASS_BREAK'
/*    */     //   29: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   32: fconst_1
/*    */     //   33: fconst_1
/*    */     //   34: iconst_0
/*    */     //   35: bipush #16
/*    */     //   37: aconst_null
/*    */     //   38: invokestatic playSound$default : (Ldev/wendigodrip/thebrokenscript/events/BaseEvent;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/sounds/SoundEvent;FFZILjava/lang/Object;)V
/*    */     //   41: aload_0
/*    */     //   42: bipush #20
/*    */     //   44: aload_0
/*    */     //   45: aload_3
/*    */     //   46: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/sounds/ParanoiaEvent;Lnet/minecraft/world/phys/Vec3;)Lkotlin/jvm/functions/Function0;
/*    */     //   51: invokevirtual doWork : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   54: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 18
/*    */     //   #13	-> 41
/*    */     //   #24	-> 54
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	55	0	this	Ldev/wendigodrip/thebrokenscript/events/sounds/ParanoiaEvent;
/*    */     //   0	55	1	level	Lnet/minecraft/world/level/Level;
/*    */     //   0	55	2	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	55	3	pos	Lnet/minecraft/world/phys/Vec3;
/*    */   }
/*    */   private static final Unit execute$lambda$2(ParanoiaEvent this$0, Vec3 $pos) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: checkcast dev/wendigodrip/thebrokenscript/events/BaseEvent
/*    */     //   4: aload_1
/*    */     //   5: getstatic net/minecraft/sounds/SoundEvents.GRASS_BREAK : Lnet/minecraft/sounds/SoundEvent;
/*    */     //   8: dup
/*    */     //   9: ldc 'GRASS_BREAK'
/*    */     //   11: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   14: fconst_1
/*    */     //   15: fconst_1
/*    */     //   16: iconst_0
/*    */     //   17: bipush #16
/*    */     //   19: aconst_null
/*    */     //   20: invokestatic playSound$default : (Ldev/wendigodrip/thebrokenscript/events/BaseEvent;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/sounds/SoundEvent;FFZILjava/lang/Object;)V
/*    */     //   23: aload_0
/*    */     //   24: bipush #20
/*    */     //   26: aload_0
/*    */     //   27: aload_1
/*    */     //   28: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/sounds/ParanoiaEvent;Lnet/minecraft/world/phys/Vec3;)Lkotlin/jvm/functions/Function0;
/*    */     //   33: invokevirtual doWork : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   36: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   39: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 0
/*    */     //   #16	-> 23
/*    */     //   #23	-> 36
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	40	0	this$0	Ldev/wendigodrip/thebrokenscript/events/sounds/ParanoiaEvent;
/*    */     //   0	40	1	$pos	Lnet/minecraft/world/phys/Vec3;
/*    */   }
/*    */   private static final Unit execute$lambda$2$lambda$1(ParanoiaEvent this$0, Vec3 $pos) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: checkcast dev/wendigodrip/thebrokenscript/events/BaseEvent
/*    */     //   4: aload_1
/*    */     //   5: getstatic net/minecraft/sounds/SoundEvents.GRASS_BREAK : Lnet/minecraft/sounds/SoundEvent;
/*    */     //   8: dup
/*    */     //   9: ldc 'GRASS_BREAK'
/*    */     //   11: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   14: fconst_1
/*    */     //   15: fconst_1
/*    */     //   16: iconst_0
/*    */     //   17: bipush #16
/*    */     //   19: aconst_null
/*    */     //   20: invokestatic playSound$default : (Ldev/wendigodrip/thebrokenscript/events/BaseEvent;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/sounds/SoundEvent;FFZILjava/lang/Object;)V
/*    */     //   23: aload_0
/*    */     //   24: bipush #20
/*    */     //   26: aload_0
/*    */     //   27: aload_1
/*    */     //   28: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/sounds/ParanoiaEvent;Lnet/minecraft/world/phys/Vec3;)Lkotlin/jvm/functions/Function0;
/*    */     //   33: invokevirtual doWork : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   36: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   39: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 0
/*    */     //   #19	-> 23
/*    */     //   #22	-> 36
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	40	0	this$0	Ldev/wendigodrip/thebrokenscript/events/sounds/ParanoiaEvent;
/*    */     //   0	40	1	$pos	Lnet/minecraft/world/phys/Vec3;
/*    */   }
/*    */   private static final Unit execute$lambda$2$lambda$1$lambda$0(ParanoiaEvent this$0, Vec3 $pos) {
/* 20 */     Intrinsics.checkNotNullExpressionValue(SoundEvents.GRASS_BREAK, "GRASS_BREAK"); BaseEvent.playSound$default(this$0, $pos, SoundEvents.GRASS_BREAK, 1.0F, 1.0F, false, 16, null);
/* 21 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\sounds\ParanoiaEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */