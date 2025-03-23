/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import net.minecraft.client.gui.screens.MenuScreens;
/*    */ import net.minecraft.world.inventory.MenuType;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber(value = {Dist.CLIENT}, bus = EventBusSubscriber.Bus.MOD)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSScreens;", "", "<init>", "()V", "clientLoad", "", "event", "Lnet/neoforged/neoforge/client/event/RegisterMenuScreensEvent;", "thebrokenscript"})
/*    */ public final class TBSScreens {
/*    */   @SubscribeEvent
/*    */   public final void clientLoad(@NotNull RegisterMenuScreensEvent event) {
/* 13 */     Intrinsics.checkNotNullParameter(event, "event"); event.register(
/* 14 */         (MenuType)TBSMenus.NULLINTERFACE.get(), 
/* 15 */         dev.wendigodrip.thebrokenscript.client.gui.NullinterfaceScreen::new);
/*    */     
/* 17 */     event.register(
/* 18 */         (MenuType)TBSMenus.NULL_INTERFACE_2.get(), 
/* 19 */         dev.wendigodrip.thebrokenscript.client.gui.NullInterface2Screen::new);
/*    */     
/* 21 */     event.register(
/* 22 */         (MenuType)TBSMenus.NULLINTERFACE_3.get(), 
/* 23 */         dev.wendigodrip.thebrokenscript.client.gui.Nullinterface3Screen::new);
/*    */     
/* 25 */     event.register(
/* 26 */         (MenuType)TBSMenus.NULLED_GUI.get(), 
/* 27 */         dev.wendigodrip.thebrokenscript.client.gui.NulledGuiScreen::new);
/*    */     
/* 29 */     event.register(
/* 30 */         (MenuType)TBSMenus.TAB.get(), 
/* 31 */         dev.wendigodrip.thebrokenscript.client.gui.TabScreen::new);
/*    */     
/* 33 */     event.register(
/* 34 */         (MenuType)TBSMenus.PC_GUI.get(), 
/* 35 */         dev.wendigodrip.thebrokenscript.client.gui.PcGuiScreen::new);
/*    */     
/* 37 */     event.register(
/* 38 */         (MenuType)TBSMenus.DEV_PASS.get(), 
/* 39 */         dev.wendigodrip.thebrokenscript.client.gui.DevPassScreen::new);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final TBSScreens INSTANCE = new TBSScreens();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSScreens.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */