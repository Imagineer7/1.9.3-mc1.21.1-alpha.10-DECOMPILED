/*    */ package dev.wendigodrip.thebrokenscript.events.nullent;
/*    */ import java.util.Iterator;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.chat.MutableComponent;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.component.WrittenBookContent;
/*    */ import net.minecraft.world.level.Level;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/nullent/NullBookEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nNullBookEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullBookEvent.kt\ndev/wendigodrip/thebrokenscript/events/nullent/NullBookEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n2341#2,14:38\n*S KotlinDebug\n*F\n+ 1 NullBookEvent.kt\ndev/wendigodrip/thebrokenscript/events/nullent/NullBookEvent\n*L\n33#1:38,14\n*E\n"})
/*    */ public final class NullBookEvent extends BaseEvent {
/*    */   public NullBookEvent() {
/* 17 */     super("null_book", 1);
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
/*    */     //   19: aload_1
/*    */     //   20: aload_2
/*    */     //   21: <illegal opcode> invoke : (Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;)Lkotlin/jvm/functions/Function1;
/*    */     //   26: invokevirtual onServer : (Lkotlin/jvm/functions/Function1;)V
/*    */     //   29: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #19	-> 18
/*    */     //   #35	-> 29
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	30	0	this	Ldev/wendigodrip/thebrokenscript/events/nullent/NullBookEvent;
/*    */     //   0	30	1	level	Lnet/minecraft/world/level/Level;
/*    */     //   0	30	2	entity	Lnet/minecraft/world/entity/Entity;
/*    */     //   0	30	3	pos	Lnet/minecraft/world/phys/Vec3;
/*    */   } private static final Unit execute$lambda$1(Level $level, Entity $entity, ServerLevel it) {
/* 21 */     Intrinsics.checkNotNullParameter(it, "it"); MutableComponent page = Component.literal("null.err.object.err.null.object.alone.3.not.behind.entitytype:player.receiveddata.invalid.reboot.failed.reset.playerdata:00F9219492D94210F812")
/* 22 */       .withStyle(ChatFormatting.BLACK);
/*    */     
/* 24 */     WrittenBookContent content = new WrittenBookContent(
/* 25 */         Filterable.passThrough("null"), "null", 0, CollectionsKt.listOf(Filterable.passThrough(page)), true);
/*    */ 
/*    */     
/* 28 */     ItemStack item = new ItemStack((ItemLike)Items.WRITTEN_BOOK, 1);
/*    */     
/* 30 */     item.applyComponents(DataComponentMap.builder().set(DataComponents.WRITTEN_BOOK_CONTENT, content).build());
/*    */     
/* 32 */     Intrinsics.checkNotNullExpressionValue($level.getEntitiesOfClass(Player.class, $entity.getBoundingBox().inflate(10.0D, 10.0D, 10.0D)), "getEntitiesOfClass(...)"); List list = $level.getEntitiesOfClass(Player.class, $entity.getBoundingBox().inflate(10.0D, 10.0D, 10.0D));
/* 33 */     int $i$f$minByOrNull = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     Iterator iterator$iv = list.iterator();
/*    */     
/* 40 */     Object minElem$iv = iterator$iv.next();
/* 41 */     if (!iterator$iv.hasNext()) {  }
/* 42 */     else { Player player1 = (Player)minElem$iv; int $i$a$-minByOrNull-NullBookEvent$execute$1$1 = 0; double minValue$iv = player1.distanceToSqr($entity); }
/*    */     
/*    */     Player player = !iterator$iv.hasNext() ? null : (Player)"JD-Core does not support Kotlin";
/*    */     if (player != null)
/*    */       player.addItem(item); 
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\nullent\NullBookEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */