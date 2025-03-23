/*    */ package dev.wendigodrip.thebrokenscript.world.inventory;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020$\n\002\020\b\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\f\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\005\030\000 32\0020\0012\024\022\020\022\016\022\004\022\0020\004\022\004\022\0020\0050\0030\002:\0013B!\022\006\020\006\032\0020\004\022\006\020\007\032\0020\b\022\b\020\t\032\004\030\0010\n¢\006\004\b\013\020\fJ\020\020,\032\0020\0312\006\020-\032\0020\022H\026J\030\020.\032\0020/2\006\0200\032\0020\0222\006\0201\032\0020\004H\026J\024\0202\032\016\022\004\022\0020\004\022\004\022\0020\0050\003H\026R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024R\032\020\025\032\016\022\004\022\0020\004\022\004\022\0020\0050\003X\004¢\006\002\n\000R\016\020\026\032\0020\027X\004¢\006\002\n\000R\016\020\030\032\0020\031XD¢\006\002\n\000R\026\020\032\032\n\022\004\022\0020\031\030\0010\002X\004¢\006\002\n\000R\020\020\033\032\004\030\0010\034X\004¢\006\002\n\000R\020\020\035\032\004\030\0010\036X\004¢\006\002\n\000R\032\020\037\032\0020\004X\016¢\006\016\n\000\032\004\b \020!\"\004\b\"\020#R\032\020$\032\0020\004X\016¢\006\016\n\000\032\004\b%\020!\"\004\b&\020#R\032\020'\032\0020\004X\016¢\006\016\n\000\032\004\b(\020!\"\004\b)\020#R\016\020*\032\0020+X\016¢\006\002\n\000¨\0064"}, d2 = {"Ldev/wendigodrip/thebrokenscript/world/inventory/TabMenu;", "Lnet/minecraft/world/inventory/AbstractContainerMenu;", "Ljava/util/function/Supplier;", "", "", "Lnet/minecraft/world/inventory/Slot;", "id", "inv", "Lnet/minecraft/world/entity/player/Inventory;", "extraData", "Lnet/minecraft/network/FriendlyByteBuf;", "<init>", "(ILnet/minecraft/world/entity/player/Inventory;Lnet/minecraft/network/FriendlyByteBuf;)V", "world", "Lnet/minecraft/world/level/Level;", "getWorld", "()Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/player/Player;", "getEntity", "()Lnet/minecraft/world/entity/player/Player;", "customSlots", "internal", "Lnet/neoforged/neoforge/items/IItemHandler;", "bound", "", "boundItemMatcher", "boundEntity", "Lnet/minecraft/world/entity/Entity;", "boundBlockEntity", "Lnet/minecraft/world/level/block/entity/BlockEntity;", "x", "getX", "()I", "setX", "(I)V", "y", "getY", "setY", "z", "getZ", "setZ", "access", "Lnet/minecraft/world/inventory/ContainerLevelAccess;", "stillValid", "player", "quickMoveStack", "Lnet/minecraft/world/item/ItemStack;", "playerIn", "index", "get", "Companion", "thebrokenscript"})
/*    */ public final class TabMenu extends AbstractContainerMenu implements Supplier<Map<Integer, ? extends Slot>> {
/*    */   @NotNull
/*    */   public final Level getWorld() {
/*    */     return this.world;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Player getEntity() {
/*    */     return this.entity;
/*    */   }
/*    */   
/* 20 */   public TabMenu(int id, @NotNull Inventory inv, @Nullable FriendlyByteBuf extraData) { super((MenuType)TBSMenus.TAB.get(), id);
/*    */     
/* 22 */     Intrinsics.checkNotNullExpressionValue(inv.player.level(), "level(...)"); this.world = inv.player.level();
/*    */     
/* 24 */     Intrinsics.checkNotNullExpressionValue(inv.player, "player"); this.entity = inv.player;
/* 25 */     this.customSlots = new HashMap<>();
/* 26 */     this.internal = (IItemHandler)new ItemStackHandler(0);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 34 */     Intrinsics.checkNotNullExpressionValue(ContainerLevelAccess.NULL, "NULL"); this.access = ContainerLevelAccess.NULL;
/*    */ 
/*    */     
/* 37 */     BlockPos pos = null;
/* 38 */     if (extraData != null) {
/* 39 */       pos = extraData.readBlockPos();
/* 40 */       this.x = pos.getX();
/* 41 */       this.y = pos.getY();
/* 42 */       this.z = pos.getZ();
/* 43 */       this.access = ContainerLevelAccess.create(this.world, pos);
/*    */     }  }
/*    */   public final int getX() { return this.x; } public final void setX(int <set-?>) {
/*    */     this.x = <set-?>;
/*    */   } public boolean stillValid(@NotNull Player player) {
/* 48 */     Intrinsics.checkNotNullParameter(player, "player"); if (this.bound) {
/* 49 */       if (this.boundItemMatcher != null) {
/* 50 */         Intrinsics.checkNotNullExpressionValue(this.boundItemMatcher.get(), "get(...)"); return this.boundItemMatcher.get().booleanValue();
/*    */       } 
/* 52 */       if (this.boundBlockEntity != null) {
/* 53 */         return AbstractContainerMenu.stillValid(
/* 54 */             this.access, 
/* 55 */             player, 
/* 56 */             this.boundBlockEntity.getBlockState().getBlock());
/*    */       }
/*    */       
/* 59 */       if (this.boundEntity != null) {
/* 60 */         return this.boundEntity.isAlive();
/*    */       }
/*    */     } 
/* 63 */     return true; } public final int getY() { return this.y; }
/*    */   public final void setY(int <set-?>) { this.y = <set-?>; }
/*    */   public final int getZ() { return this.z; }
/*    */   public final void setZ(int <set-?>) { this.z = <set-?>; }
/* 67 */   @NotNull public ItemStack quickMoveStack(@NotNull Player playerIn, int index) { Intrinsics.checkNotNullParameter(playerIn, "playerIn"); Intrinsics.checkNotNullExpressionValue(ItemStack.EMPTY, "EMPTY"); return ItemStack.EMPTY; }
/*    */   
/*    */   @NotNull
/*    */   public Map<Integer, Slot> get() {
/* 71 */     return this.customSlots;
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R-\020\004\032\036\022\004\022\0020\006\022\004\022\0020\0010\005j\016\022\004\022\0020\006\022\004\022\0020\001`\007¢\006\b\n\000\032\004\b\b\020\t¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/world/inventory/TabMenu$Companion;", "", "<init>", "()V", "guistate", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getGuistate", "()Ljava/util/HashMap;", "thebrokenscript"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 75 */     public final HashMap<String, Object> getGuistate() { return TabMenu.guistate; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Level world; @NotNull private final Player entity; @NotNull private final Map<Integer, Slot> customSlots; @NotNull private final IItemHandler internal; private final boolean bound; @Nullable private final Supplier<Boolean> boundItemMatcher; @NotNull private static final HashMap<String, Object> guistate = new HashMap<>();
/*    */   @Nullable
/*    */   private final Entity boundEntity;
/*    */   @Nullable
/*    */   private final BlockEntity boundBlockEntity;
/*    */   private int x;
/*    */   private int y;
/*    */   private int z;
/*    */   @NotNull
/*    */   private ContainerLevelAccess access;
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\world\inventory\TabMenu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */