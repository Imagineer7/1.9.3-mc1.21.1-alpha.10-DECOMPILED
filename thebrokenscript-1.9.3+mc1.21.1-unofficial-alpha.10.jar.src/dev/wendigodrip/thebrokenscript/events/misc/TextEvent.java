/*    */ package dev.wendigodrip.thebrokenscript.events.misc;
/*    */ import net.minecraft.ChatFormatting;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.MutableComponent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\"\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\017H\026R\034\020\004\032\020\022\f\022\n \007*\004\030\0010\0060\0060\005X\004¢\006\002\n\000¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/misc/TextEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "texts", "", "Lnet/minecraft/network/chat/MutableComponent;", "kotlin.jvm.PlatformType", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class TextEvent extends BaseEvent {
/*    */   public TextEvent() {
/* 10 */     super("text", 1);
/*    */     
/* 12 */     MutableComponent[] arrayOfMutableComponent = new MutableComponent[13]; arrayOfMutableComponent[0] = Component.literal("I see you."); arrayOfMutableComponent[1] = 
/* 13 */       Component.literal("Can you see me?");
/* 14 */     arrayOfMutableComponent[2] = Component.literal("It was your fault.");
/* 15 */     arrayOfMutableComponent[3] = Component.literal("Help us.");
/* 16 */     arrayOfMutableComponent[4] = Component.literal("I am right behind you.");
/* 17 */     arrayOfMutableComponent[5] = Component.literal("I am right behind you.").withStyle(ChatFormatting.DARK_RED);
/* 18 */     arrayOfMutableComponent[6] = Component.literal("null");
/* 19 */     arrayOfMutableComponent[7] = Component.literal("null.err");
/* 20 */     arrayOfMutableComponent[8] = Component.literal("000");
/* 21 */     ChatFormatting[] arrayOfChatFormatting = new ChatFormatting[2]; arrayOfChatFormatting[0] = ChatFormatting.OBFUSCATED; arrayOfChatFormatting[1] = ChatFormatting.WHITE; arrayOfMutableComponent[9] = Component.literal("AAAAAAAAA").withStyle(arrayOfChatFormatting);
/* 22 */     arrayOfMutableComponent[10] = Component.literal("Null joined the game").withStyle(ChatFormatting.YELLOW);
/* 23 */     arrayOfMutableComponent[11] = Component.literal("Null left the game").withStyle(ChatFormatting.YELLOW);
/* 24 */     arrayOfMutableComponent[12] = Component.literal("joined the game").withStyle(ChatFormatting.YELLOW);
/*    */     this.texts = SetsKt.setOf((Object[])arrayOfMutableComponent);
/*    */   } @NotNull
/*    */   private final Set<MutableComponent> texts; public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 28 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); MutableComponent text = (MutableComponent)CollectionsKt.random(this.texts, (Random)Random.Default);
/*    */     
/* 30 */     onServer(text::execute$lambda$0); } private static final Unit execute$lambda$0(MutableComponent $text, ServerLevel it) {
/* 31 */     Intrinsics.checkNotNullParameter(it, "it"); for (ServerPlayer player : it.players()) {
/* 32 */       player.sendSystemMessage((Component)$text);
/*    */     }
/* 34 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\misc\TextEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */