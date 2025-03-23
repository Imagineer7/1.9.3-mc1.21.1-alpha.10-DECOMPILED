/*    */ package dev.wendigodrip.thebrokenscript.world.inventory;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSMenus;
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import java.util.Objects;
/*    */ import java.util.function.Supplier;
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
/*    */ public class PcGuiMenu
/*    */   extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
/* 25 */   public static final HashMap<String, Object> guistate = new HashMap<>();
/*    */   public final Level world;
/*    */   public final Player entity;
/* 28 */   private final Map<Integer, Slot> customSlots = new HashMap<>();
/*    */   private final IItemHandler internal;
/*    */   private final boolean bound = false;
/* 31 */   private final Supplier<Boolean> boundItemMatcher = null;
/* 32 */   private final Entity boundEntity = null;
/* 33 */   private final BlockEntity boundBlockEntity = null;
/*    */   public int x;
/*    */   public int y;
/*    */   public int z;
/* 37 */   private ContainerLevelAccess access = ContainerLevelAccess.NULL;
/*    */   
/*    */   public PcGuiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
/* 40 */     super((MenuType)TBSMenus.PC_GUI.get(), id);
/* 41 */     this.entity = inv.player;
/* 42 */     this.world = inv.player.level();
/* 43 */     this.internal = (IItemHandler)new ItemStackHandler(0);
/* 44 */     BlockPos pos = null;
/* 45 */     if (extraData != null) {
/* 46 */       pos = extraData.readBlockPos();
/* 47 */       this.x = pos.getX();
/* 48 */       this.y = pos.getY();
/* 49 */       this.z = pos.getZ();
/* 50 */       this.access = ContainerLevelAccess.create(this.world, pos);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean stillValid(Player player) {
/* 55 */     Objects.requireNonNull(this);
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
/* 70 */     return true;
/*    */   }
/*    */   
/*    */   public ItemStack quickMoveStack(Player playerIn, int index) {
/* 74 */     return ItemStack.EMPTY;
/*    */   }
/*    */ 
/*    */   
/*    */   public Map<Integer, Slot> get() {
/* 79 */     return this.customSlots;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\world\inventory\PcGuiMenu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */