/*    */ package dev.wendigodrip.thebrokenscript.events.misc;
/*    */ import dev.wendigodrip.thebrokenscript.events.BaseEvent;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.MutableComponent;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/misc/OpenGLErrorEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class OpenGLErrorEvent extends BaseEvent {
/*    */   public OpenGLErrorEvent() {
/* 11 */     super("opengl_error", 1);
/*    */   }
/*    */   
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
/*    */     //   18: ldc 'OpenGL Error'
/*    */     //   20: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   23: getstatic net/minecraft/ChatFormatting.YELLOW : Lnet/minecraft/ChatFormatting;
/*    */     //   26: invokevirtual withStyle : (Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   29: ldc ': 1282 (Invalid operation)'
/*    */     //   31: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   34: getstatic net/minecraft/ChatFormatting.WHITE : Lnet/minecraft/ChatFormatting;
/*    */     //   37: invokevirtual withStyle : (Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   40: checkcast net/minecraft/network/chat/Component
/*    */     //   43: invokevirtual append : (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   46: astore #4
/*    */     //   48: ldc 'OpenGL Error'
/*    */     //   50: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   53: getstatic net/minecraft/ChatFormatting.YELLOW : Lnet/minecraft/ChatFormatting;
/*    */     //   56: invokevirtual withStyle : (Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   59: ldc ': 0 (Here I am.)'
/*    */     //   61: invokestatic literal : (Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   64: getstatic net/minecraft/ChatFormatting.WHITE : Lnet/minecraft/ChatFormatting;
/*    */     //   67: invokevirtual withStyle : (Lnet/minecraft/ChatFormatting;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   70: checkcast net/minecraft/network/chat/Component
/*    */     //   73: invokevirtual append : (Lnet/minecraft/network/chat/Component;)Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   76: astore #5
/*    */     //   78: aload_0
/*    */     //   79: iconst_1
/*    */     //   80: aload_0
/*    */     //   81: aload #4
/*    */     //   83: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/misc/OpenGLErrorEvent;Lnet/minecraft/network/chat/MutableComponent;)Lkotlin/jvm/functions/Function0;
/*    */     //   88: invokevirtual queue : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   91: aload_0
/*    */     //   92: bipush #20
/*    */     //   94: aload_0
/*    */     //   95: aload #4
/*    */     //   97: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/misc/OpenGLErrorEvent;Lnet/minecraft/network/chat/MutableComponent;)Lkotlin/jvm/functions/Function0;
/*    */     //   102: invokevirtual queue : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   105: aload_0
/*    */     //   106: bipush #20
/*    */     //   108: aload_0
/*    */     //   109: aload #4
/*    */     //   111: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/misc/OpenGLErrorEvent;Lnet/minecraft/network/chat/MutableComponent;)Lkotlin/jvm/functions/Function0;
/*    */     //   116: invokevirtual queue : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   119: aload_0
/*    */     //   120: bipush #20
/*    */     //   122: aload_0
/*    */     //   123: aload #4
/*    */     //   125: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/misc/OpenGLErrorEvent;Lnet/minecraft/network/chat/MutableComponent;)Lkotlin/jvm/functions/Function0;
/*    */     //   130: invokevirtual queue : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   133: aload_0
/*    */     //   134: bipush #100
/*    */     //   136: aload_0
/*    */     //   137: aload #5
/*    */     //   139: aload_3
/*    */     //   140: <illegal opcode> invoke : (Ldev/wendigodrip/thebrokenscript/events/misc/OpenGLErrorEvent;Lnet/minecraft/network/chat/MutableComponent;Lnet/minecraft/world/phys/Vec3;)Lkotlin/jvm/functions/Function0;
/*    */     //   145: invokevirtual queue : (ILkotlin/jvm/functions/Function0;)V
/*    */     //   148: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 18
/*    */     //   #14	-> 29
/*    */     //   #13	-> 46
/*    */     //   #16	-> 48
/*    */     //   #17	-> 59
/*    */     //   #16	-> 76
/*    */     //   #19	-> 78
/*    */     //   #20	-> 91
/*    */     //   #21	-> 105
/*    */     //   #22	-> 119
/*    */     //   #24	-> 133
/*    */     //   #28	-> 148
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   48	101	4	msg	Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   78	71	5	hereIAm	Lnet/minecraft/network/chat/MutableComponent;
/*    */     //   0	149	0	this	Ldev/wendigodrip/thebrokenscript/events/misc/OpenGLErrorEvent;
/*    */     //   0	149	1	level	Lnet/minecraft/world/level/Level;
/*    */     //   0	149	2	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	149	3	pos	Lnet/minecraft/world/phys/Vec3;
/*    */   }
/*    */   
/*    */   private static final Unit execute$lambda$0(OpenGLErrorEvent this$0, MutableComponent $msg) {
/* 19 */     Intrinsics.checkNotNull($msg); BaseEvent.broadcast$default(this$0, (Component)$msg, false, 2, null); return Unit.INSTANCE;
/* 20 */   } private static final Unit execute$lambda$1(OpenGLErrorEvent this$0, MutableComponent $msg) { Intrinsics.checkNotNull($msg); BaseEvent.broadcast$default(this$0, (Component)$msg, false, 2, null); return Unit.INSTANCE; }
/* 21 */   private static final Unit execute$lambda$2(OpenGLErrorEvent this$0, MutableComponent $msg) { Intrinsics.checkNotNull($msg); BaseEvent.broadcast$default(this$0, (Component)$msg, false, 2, null); return Unit.INSTANCE; } private static final Unit execute$lambda$3(OpenGLErrorEvent this$0, MutableComponent $msg) {
/* 22 */     Intrinsics.checkNotNull($msg); BaseEvent.broadcast$default(this$0, (Component)$msg, false, 2, null); return Unit.INSTANCE;
/*    */   }
/*    */   private static final Unit execute$lambda$4(OpenGLErrorEvent this$0, MutableComponent $hereIAm, Vec3 $pos) {
/* 25 */     Intrinsics.checkNotNull($hereIAm); BaseEvent.broadcast$default(this$0, (Component)$hereIAm, false, 2, null);
/* 26 */     Intrinsics.checkNotNullExpressionValue(SoundEvents.AMBIENT_CAVE.value(), "value(...)"); BaseEvent.playSound$default(this$0, $pos, (SoundEvent)SoundEvents.AMBIENT_CAVE.value(), 555.0F, 0.0F, false, 16, null);
/* 27 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\misc\OpenGLErrorEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */