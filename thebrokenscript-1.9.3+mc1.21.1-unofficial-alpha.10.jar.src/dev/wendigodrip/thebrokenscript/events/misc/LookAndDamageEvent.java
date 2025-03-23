/*    */ package dev.wendigodrip.thebrokenscript.events.misc;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/misc/LookAndDamageEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class LookAndDamageEvent extends BaseEvent {
/*    */   public LookAndDamageEvent() {
/*  9 */     super("look_and_damage", 1);
/*    */   }
/*    */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
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
/*    */     //   19: iconst_1
/*    */     //   20: aload_2
/*    */     //   21: aload_1
/*    */     //   22: aload_3
/*    */     //   23: aload_0
/*    */     //   24: <illegal opcode> invoke : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;Ldev/wendigodrip/thebrokenscript/events/misc/LookAndDamageEvent;)Lkotlin/jvm/functions/Function0;
/*    */     //   29: invokevirtual doWork : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   32: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #11	-> 18
/*    */     //   #30	-> 32
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	33	0	this	Ldev/wendigodrip/thebrokenscript/events/misc/LookAndDamageEvent;
/*    */     //   0	33	1	level	Lnet/minecraft/world/level/Level;
/*    */     //   0	33	2	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	33	3	pos	Lnet/minecraft/world/phys/Vec3;
/*    */   }
/*    */   private static final Unit execute$lambda$3(Entity $entity, Level $level, Vec3 $pos, LookAndDamageEvent this$0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokevirtual damageSources : ()Lnet/minecraft/world/damagesource/DamageSources;
/*    */     //   5: invokevirtual generic : ()Lnet/minecraft/world/damagesource/DamageSource;
/*    */     //   8: fconst_1
/*    */     //   9: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
/*    */     //   12: pop
/*    */     //   13: aload_0
/*    */     //   14: getstatic net/minecraft/commands/arguments/EntityAnchorArgument$Anchor.EYES : Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;
/*    */     //   17: aload_2
/*    */     //   18: invokevirtual lookAt : (Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/phys/Vec3;)V
/*    */     //   21: aload_3
/*    */     //   22: iconst_5
/*    */     //   23: aload_0
/*    */     //   24: aload_1
/*    */     //   25: aload_2
/*    */     //   26: aload_3
/*    */     //   27: <illegal opcode> invoke : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;Ldev/wendigodrip/thebrokenscript/events/misc/LookAndDamageEvent;)Lkotlin/jvm/functions/Function0;
/*    */     //   32: invokevirtual doWork : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   35: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   38: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 0
/*    */     //   #13	-> 13
/*    */     //   #15	-> 21
/*    */     //   #29	-> 35
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	39	0	$entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	39	1	$level	Lnet/minecraft/world/level/Level;
/*    */     //   0	39	2	$pos	Lnet/minecraft/world/phys/Vec3;
/*    */     //   0	39	3	this$0	Ldev/wendigodrip/thebrokenscript/events/misc/LookAndDamageEvent;
/*    */   }
/*    */   private static final Unit execute$lambda$3$lambda$2(Entity $entity, Level $level, Vec3 $pos, LookAndDamageEvent this$0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokevirtual damageSources : ()Lnet/minecraft/world/damagesource/DamageSources;
/*    */     //   5: invokevirtual generic : ()Lnet/minecraft/world/damagesource/DamageSource;
/*    */     //   8: fconst_1
/*    */     //   9: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
/*    */     //   12: pop
/*    */     //   13: aload_0
/*    */     //   14: getstatic net/minecraft/commands/arguments/EntityAnchorArgument$Anchor.EYES : Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;
/*    */     //   17: aload_2
/*    */     //   18: dconst_0
/*    */     //   19: ldc2_w 20.0
/*    */     //   22: dconst_0
/*    */     //   23: invokevirtual add : (DDD)Lnet/minecraft/world/phys/Vec3;
/*    */     //   26: invokevirtual lookAt : (Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/phys/Vec3;)V
/*    */     //   29: aload_3
/*    */     //   30: iconst_5
/*    */     //   31: aload_0
/*    */     //   32: aload_1
/*    */     //   33: aload_2
/*    */     //   34: aload_3
/*    */     //   35: <illegal opcode> invoke : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;Ldev/wendigodrip/thebrokenscript/events/misc/LookAndDamageEvent;)Lkotlin/jvm/functions/Function0;
/*    */     //   40: invokevirtual doWork : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   43: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   46: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 0
/*    */     //   #17	-> 13
/*    */     //   #19	-> 29
/*    */     //   #28	-> 43
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	47	0	$entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	47	1	$level	Lnet/minecraft/world/level/Level;
/*    */     //   0	47	2	$pos	Lnet/minecraft/world/phys/Vec3;
/*    */     //   0	47	3	this$0	Ldev/wendigodrip/thebrokenscript/events/misc/LookAndDamageEvent;
/*    */   }
/*    */   private static final Unit execute$lambda$3$lambda$2$lambda$1(Entity $entity, Level $level, Vec3 $pos, LookAndDamageEvent this$0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokevirtual damageSources : ()Lnet/minecraft/world/damagesource/DamageSources;
/*    */     //   5: invokevirtual generic : ()Lnet/minecraft/world/damagesource/DamageSource;
/*    */     //   8: fconst_1
/*    */     //   9: invokevirtual hurt : (Lnet/minecraft/world/damagesource/DamageSource;F)Z
/*    */     //   12: pop
/*    */     //   13: aload_0
/*    */     //   14: getstatic net/minecraft/commands/arguments/EntityAnchorArgument$Anchor.EYES : Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;
/*    */     //   17: aload_2
/*    */     //   18: ldc2_w 20.0
/*    */     //   21: dconst_0
/*    */     //   22: dconst_0
/*    */     //   23: invokevirtual add : (DDD)Lnet/minecraft/world/phys/Vec3;
/*    */     //   26: invokevirtual lookAt : (Lnet/minecraft/commands/arguments/EntityAnchorArgument$Anchor;Lnet/minecraft/world/phys/Vec3;)V
/*    */     //   29: aload_3
/*    */     //   30: iconst_5
/*    */     //   31: aload_0
/*    */     //   32: aload_1
/*    */     //   33: aload_2
/*    */     //   34: <illegal opcode> invoke : (Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/Level;Lnet/minecraft/world/phys/Vec3;)Lkotlin/jvm/functions/Function0;
/*    */     //   39: invokevirtual doWork : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   42: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   45: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #20	-> 0
/*    */     //   #21	-> 13
/*    */     //   #23	-> 29
/*    */     //   #27	-> 42
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	46	0	$entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	46	1	$level	Lnet/minecraft/world/level/Level;
/*    */     //   0	46	2	$pos	Lnet/minecraft/world/phys/Vec3;
/*    */     //   0	46	3	this$0	Ldev/wendigodrip/thebrokenscript/events/misc/LookAndDamageEvent;
/*    */   }
/*    */   private static final Unit execute$lambda$3$lambda$2$lambda$1$lambda$0(Entity $entity, Level $level, Vec3 $pos) {
/* 24 */     $entity.hurt($level.damageSources().generic(), 1.0F);
/* 25 */     $entity.lookAt(EntityAnchorArgument.Anchor.EYES, $pos.add(0.0D, 0.0D, 20.0D));
/* 26 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\misc\LookAndDamageEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */