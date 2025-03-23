/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import dev.wendigodrip.thebrokenscript.world.inventory.PcGuiMenu;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.inventory.MenuType;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ import org.apache.commons.lang3.function.TriFunction;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000^\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J:\020\t\032\b\022\004\022\002H\n0\006\"\b\b\000\020\n*\0020\0132 \020\f\032\034\022\004\022\0020\016\022\004\022\0020\017\022\006\022\004\030\0010\020\022\004\022\002H\n0\rH\002R\033\020\004\032\f\022\b\022\006\022\002\b\0030\0060\005¢\006\b\n\000\032\004\b\007\020\bR&\020\021\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0230\0060\0228\006X\004¢\006\002\n\000R&\020\024\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0250\0060\0228\006X\004¢\006\002\n\000R&\020\026\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0270\0060\0228\006X\004¢\006\002\n\000R&\020\030\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0310\0060\0228\006X\004¢\006\002\n\000R&\020\032\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0330\0060\0228\006X\004¢\006\002\n\000R&\020\034\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0350\0060\0228\006X\004¢\006\002\n\000R&\020\036\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0370\0060\0228\006X\004¢\006\002\n\000¨\006 "}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSMenus;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/minecraft/world/inventory/MenuType;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "menuType", "T", "Lnet/minecraft/world/inventory/AbstractContainerMenu;", "supplier", "Lorg/apache/commons/lang3/function/TriFunction;", "", "Lnet/minecraft/world/entity/player/Inventory;", "Lnet/minecraft/network/FriendlyByteBuf;", "NULLINTERFACE", "Lnet/neoforged/neoforge/registries/DeferredHolder;", "Ldev/wendigodrip/thebrokenscript/world/inventory/NullInterfaceMenu;", "NULL_INTERFACE_2", "Ldev/wendigodrip/thebrokenscript/world/inventory/NullInterface2Menu;", "NULLINTERFACE_3", "Ldev/wendigodrip/thebrokenscript/world/inventory/NullInterface3Menu;", "NULLED_GUI", "Ldev/wendigodrip/thebrokenscript/world/inventory/NulledGuiMenu;", "TAB", "Ldev/wendigodrip/thebrokenscript/world/inventory/TabMenu;", "PC_GUI", "Ldev/wendigodrip/thebrokenscript/world/inventory/PcGuiMenu;", "DEV_PASS", "Ldev/wendigodrip/thebrokenscript/world/inventory/DevPassMenu;", "thebrokenscript"})
/*    */ public final class TBSMenus {
/*    */   @NotNull
/* 17 */   public static final TBSMenus INSTANCE = new TBSMenus(); @NotNull private static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(
/* 18 */       BuiltInRegistries.MENU, "thebrokenscript"); @NotNull public final DeferredRegister<MenuType<?>> getREGISTRY() { return REGISTRY; } static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create(BuiltInRegistries.MENU, "thebrokenscript"), "create(...)"); }
/*    */ 
/*    */   
/*    */   private final <T extends AbstractContainerMenu> MenuType<T> menuType(TriFunction supplier) {
/* 22 */     return new MenuType(supplier::menuType$lambda$0, FeatureFlagSet.of()); } private static final AbstractContainerMenu menuType$lambda$0(TriFunction $supplier, int id, Inventory inv) { return (AbstractContainerMenu)$supplier.apply(Integer.valueOf(id), inv, null); }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 26 */   public static final DeferredHolder<MenuType<?>, MenuType<NullInterfaceMenu>> NULLINTERFACE = REGISTRY.register(
/* 27 */       "nullinterface", TBSMenus::NULLINTERFACE$lambda$1); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nullinterface", TBSMenus::NULLINTERFACE$lambda$1), "register(...)"); } private static final MenuType NULLINTERFACE$lambda$1() {
/* 28 */     return INSTANCE.menuType(NullInterfaceMenu::new);
/*    */   }
/*    */   @JvmField
/*    */   @NotNull
/* 32 */   public static final DeferredHolder<MenuType<?>, MenuType<NullInterface2Menu>> NULL_INTERFACE_2 = REGISTRY.register(
/* 33 */       "null_interface_2", TBSMenus::NULL_INTERFACE_2$lambda$2); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("null_interface_2", TBSMenus::NULL_INTERFACE_2$lambda$2), "register(...)"); } private static final MenuType NULL_INTERFACE_2$lambda$2() {
/* 34 */     return INSTANCE.menuType(NullInterface2Menu::new);
/*    */   }
/*    */   @JvmField
/*    */   @NotNull
/* 38 */   public static final DeferredHolder<MenuType<?>, MenuType<NullInterface3Menu>> NULLINTERFACE_3 = REGISTRY.register(
/* 39 */       "nullinterface_3", TBSMenus::NULLINTERFACE_3$lambda$3); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nullinterface_3", TBSMenus::NULLINTERFACE_3$lambda$3), "register(...)"); } private static final MenuType NULLINTERFACE_3$lambda$3() {
/* 40 */     return INSTANCE.menuType(NullInterface3Menu::new);
/*    */   }
/*    */   @JvmField
/*    */   @NotNull
/* 44 */   public static final DeferredHolder<MenuType<?>, MenuType<NulledGuiMenu>> NULLED_GUI = REGISTRY.register(
/* 45 */       "nulled_gui", TBSMenus::NULLED_GUI$lambda$4); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("nulled_gui", TBSMenus::NULLED_GUI$lambda$4), "register(...)"); } private static final MenuType NULLED_GUI$lambda$4() {
/* 46 */     return INSTANCE.menuType(NulledGuiMenu::new);
/*    */   }
/*    */   @JvmField
/*    */   @NotNull
/* 50 */   public static final DeferredHolder<MenuType<?>, MenuType<TabMenu>> TAB = REGISTRY.register(
/* 51 */       "tab", TBSMenus::TAB$lambda$5); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("tab", TBSMenus::TAB$lambda$5), "register(...)"); } private static final MenuType TAB$lambda$5() {
/* 52 */     return INSTANCE.menuType(TabMenu::new);
/*    */   }
/*    */   @JvmField
/*    */   @NotNull
/* 56 */   public static final DeferredHolder<MenuType<?>, MenuType<PcGuiMenu>> PC_GUI = REGISTRY.register(
/* 57 */       "pc_gui", TBSMenus::PC_GUI$lambda$6); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("pc_gui", TBSMenus::PC_GUI$lambda$6), "register(...)"); } private static final MenuType PC_GUI$lambda$6() {
/* 58 */     return INSTANCE.menuType(PcGuiMenu::new);
/*    */   }
/*    */   @JvmField
/*    */   @NotNull
/* 62 */   public static final DeferredHolder<MenuType<?>, MenuType<DevPassMenu>> DEV_PASS = REGISTRY.register(
/* 63 */       "dev_pass", TBSMenus::DEV_PASS$lambda$7); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("dev_pass", TBSMenus::DEV_PASS$lambda$7), "register(...)"); } private static final MenuType DEV_PASS$lambda$7() {
/* 64 */     return INSTANCE.menuType(DevPassMenu::new);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSMenus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */