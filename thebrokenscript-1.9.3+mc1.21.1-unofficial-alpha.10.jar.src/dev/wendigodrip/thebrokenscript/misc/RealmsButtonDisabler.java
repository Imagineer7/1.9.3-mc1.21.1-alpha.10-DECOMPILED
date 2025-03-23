/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.gui.components.Button;
/*    */ import net.minecraft.client.gui.components.events.GuiEventListener;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.client.event.ScreenEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber(value = {Dist.CLIENT}, bus = EventBusSubscriber.Bus.GAME)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/RealmsButtonDisabler;", "", "<init>", "()V", "onGuiInit", "", "event", "Lnet/neoforged/neoforge/client/event/ScreenEvent$Init$Post;", "thebrokenscript"})
/*    */ public final class RealmsButtonDisabler {
/*    */   @SubscribeEvent
/*    */   public final void onGuiInit(@NotNull ScreenEvent.Init.Post event) {
/* 15 */     Intrinsics.checkNotNullParameter(event, "event"); if (event.getScreen() instanceof net.minecraft.client.gui.screens.TitleScreen)
/* 16 */       for (GuiEventListener button : event.getScreen().children()) {
/* 17 */         if (!(button instanceof Button) || !Intrinsics.areEqual(((Button)button).getMessage().getString(), I18n.get("menu.realms", new Object[0])))
/*    */           continue; 
/* 19 */         ((Button)button).active = false;
/*    */       }  
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final RealmsButtonDisabler INSTANCE = new RealmsButtonDisabler();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\RealmsButtonDisabler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */