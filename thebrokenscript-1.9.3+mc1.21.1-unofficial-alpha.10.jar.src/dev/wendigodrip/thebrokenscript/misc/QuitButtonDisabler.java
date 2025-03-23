/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ import java.util.Collection;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.gui.components.Button;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.client.event.ScreenEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber(value = {Dist.CLIENT}, bus = EventBusSubscriber.Bus.GAME)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/QuitButtonDisabler;", "", "<init>", "()V", "onGuiInit", "", "event", "Lnet/neoforged/neoforge/client/event/ScreenEvent$Init$Post;", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nQuitButtonDisabler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuitButtonDisabler.kt\ndev/wendigodrip/thebrokenscript/misc/QuitButtonDisabler\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n808#2,11:26\n*S KotlinDebug\n*F\n+ 1 QuitButtonDisabler.kt\ndev/wendigodrip/thebrokenscript/misc/QuitButtonDisabler\n*L\n16#1:26,11\n*E\n"})
/*    */ public final class QuitButtonDisabler {
/*    */   @SubscribeEvent
/*    */   public final void onGuiInit(@NotNull ScreenEvent.Init.Post event) {
/* 15 */     Intrinsics.checkNotNullParameter(event, "event"); if (event.getScreen() instanceof net.minecraft.client.gui.screens.TitleScreen) {
/* 16 */       Intrinsics.checkNotNullExpressionValue(event.getScreen().children(), "children(...)"); Iterable $this$filterIsInstance$iv = event.getScreen().children(); int $i$f$filterIsInstance = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 26 */       Iterable iterable1 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 35 */       for (Object element$iv$iv : iterable1) { if (element$iv$iv instanceof Button) destination$iv$iv.add(element$iv$iv);  }
/* 36 */        for (Button button : destination$iv$iv) {
/*    */         if (Intrinsics.areEqual(button.getMessage().getString(), I18n.get("menu.quit", new Object[0])))
/*    */           button.active = false; 
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final QuitButtonDisabler INSTANCE = new QuitButtonDisabler();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\QuitButtonDisabler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */