/*    */ package dev.wendigodrip.thebrokenscript.world.inventory;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSMenus;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.client.gui.components.AbstractWidget;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.inventory.ContainerLevelAccess;
/*    */ import net.minecraft.world.inventory.MenuType;
/*    */ import net.minecraft.world.inventory.Slot;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.entity.BlockEntity;
/*    */ import net.neoforged.neoforge.items.IItemHandler;
/*    */ import net.neoforged.neoforge.items.ItemStackHandler;
/*    */ 
/*    */ public class DevPassMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
/* 24 */   public static final HashMap<String, AbstractWidget> guistate = new HashMap<>();
/*    */   public final Level world;
/*    */   public final Player entity;
/* 27 */   private final Map<Integer, Slot> customSlots = new HashMap<>();
/*    */   private final IItemHandler internal;
/*    */   private final boolean bound = false;
/* 30 */   private final Supplier<Boolean> boundItemMatcher = null;
/* 31 */   private final Entity boundEntity = null;
/* 32 */   private final BlockEntity boundBlockEntity = null;
/*    */   public int x;
/*    */   public int y;
/*    */   public int z;
/* 36 */   private ContainerLevelAccess access = ContainerLevelAccess.NULL;
/*    */   
/*    */   public DevPassMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/* 39 */     super((MenuType)TBSMenus.DEV_PASS.get(), id);
/* 40 */     this.entity = inv.player;
/* 41 */     this.world = inv.player.level();
/* 42 */     this.internal = (IItemHandler)new ItemStackHandler(0);
/* 43 */     BlockPos pos = null;
/* 44 */     if (extraData != null) {
/* 45 */       pos = extraData.readBlockPos();
/* 46 */       this.x = pos.getX();
/* 47 */       this.y = pos.getY();
/* 48 */       this.z = pos.getZ();
/* 49 */       this.access = ContainerLevelAccess.create(this.world, pos);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean stillValid(Player player) {
/* 54 */     Objects.requireNonNull(this);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 69 */     return true;
/*    */   }
/*    */   
/*    */   public ItemStack quickMoveStack(Player playerIn, int index) {
/* 73 */     return ItemStack.EMPTY;
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<Integer, Slot> get() {
/* 78 */     return this.customSlots;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\world\inventory\DevPassMenu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */