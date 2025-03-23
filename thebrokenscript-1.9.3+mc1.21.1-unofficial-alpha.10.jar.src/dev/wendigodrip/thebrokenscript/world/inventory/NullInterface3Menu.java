/*     */ package dev.wendigodrip.thebrokenscript.world.inventory;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSMenus;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import java.util.function.Supplier;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.Container;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.inventory.ContainerLevelAccess;
/*     */ import net.minecraft.world.inventory.MenuType;
/*     */ import net.minecraft.world.inventory.Slot;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.neoforged.neoforge.capabilities.Capabilities;
/*     */ import net.neoforged.neoforge.items.IItemHandler;
/*     */ import net.neoforged.neoforge.items.ItemStackHandler;
/*     */ 
/*     */ public class NullInterface3Menu
/*     */   extends AbstractContainerMenu
/*     */   implements Supplier<Map<Integer, Slot>> {
/*  29 */   public static final HashMap<String, Object> guistate = new HashMap<>();
/*     */   public final Level world;
/*     */   public final Player entity;
/*  32 */   private final Map<Integer, Slot> customSlots = new HashMap<>();
/*     */   public int x;
/*     */   public int y;
/*     */   public int z;
/*  36 */   private ContainerLevelAccess access = ContainerLevelAccess.NULL;
/*     */   private IItemHandler internal;
/*     */   private boolean bound = false;
/*  39 */   private Supplier<Boolean> boundItemMatcher = null;
/*  40 */   private Entity boundEntity = null;
/*  41 */   private BlockEntity boundBlockEntity = null;
/*     */   
/*     */   public NullInterface3Menu(int id, Inventory inv, FriendlyByteBuf extraData) {
/*  44 */     super((MenuType)TBSMenus.NULLINTERFACE_3.get(), id);
/*     */     
/*  46 */     this.entity = inv.player;
/*  47 */     this.world = inv.player.level();
/*  48 */     this.internal = (IItemHandler)new ItemStackHandler(0);
/*  49 */     BlockPos pos = null;
/*  50 */     if (extraData != null) {
/*  51 */       pos = extraData.readBlockPos();
/*  52 */       this.x = pos.getX();
/*  53 */       this.y = pos.getY();
/*  54 */       this.z = pos.getZ();
/*  55 */       this.access = ContainerLevelAccess.create(this.world, pos);
/*     */     } 
/*  57 */     if (pos != null)
/*  58 */       if (extraData.readableBytes() == 1) {
/*  59 */         byte hand = extraData.readByte();
/*  60 */         ItemStack itemstack = (hand == 0) ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
/*  61 */         this.boundItemMatcher = (() -> Boolean.valueOf((itemstack == ((hand == 0) ? this.entity.getMainHandItem() : this.entity.getOffhandItem()))));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/*  67 */         IItemHandler cap = (IItemHandler)itemstack.getCapability(Capabilities.ItemHandler.ITEM, null);
/*  68 */         if (cap != null) {
/*  69 */           this.internal = cap;
/*  70 */           this.bound = true;
/*     */         } 
/*  72 */       } else if (extraData.readableBytes() > 1) {
/*  73 */         extraData.readByte();
/*  74 */         this.boundEntity = this.world.getEntity(extraData.readVarInt());
/*  75 */         if (this.boundEntity != null) {
/*  76 */           IItemHandler cap = (IItemHandler)this.boundEntity.getCapability(Capabilities.ItemHandler.ENTITY, null);
/*  77 */           if (cap != null) {
/*  78 */             this.internal = cap;
/*  79 */             this.bound = true;
/*     */           } 
/*     */         } 
/*     */       } else {
/*  83 */         this.boundBlockEntity = this.world.getBlockEntity(pos);
/*  84 */         if (this.boundBlockEntity != null) {
/*  85 */           IItemHandler cap = (IItemHandler)this.world.getCapability(Capabilities.ItemHandler.BLOCK, this.boundBlockEntity
/*     */               
/*  87 */               .getBlockPos(), Direction.NORTH);
/*     */ 
/*     */ 
/*     */           
/*  91 */           if (cap != null) {
/*  92 */             this.internal = cap;
/*  93 */             this.bound = true;
/*     */           } 
/*     */         } 
/*     */       }  
/*     */     int si;
/*  98 */     for (si = 0; si < 3; si++) {
/*  99 */       for (int sj = 0; sj < 9; sj++) {
/* 100 */         addSlot(new Slot((Container)inv, sj + (si + 1) * 9, 8 + sj * 18, 84 + si * 18));
/*     */       }
/*     */     } 
/* 103 */     for (si = 0; si < 9; si++) {
/* 104 */       addSlot(new Slot((Container)inv, si, 8 + si * 18, 142));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean stillValid(Player player) {
/* 109 */     if (this.bound) {
/* 110 */       if (this.boundItemMatcher != null) {
/* 111 */         return ((Boolean)this.boundItemMatcher.get()).booleanValue();
/*     */       }
/* 113 */       if (this.boundBlockEntity != null) {
/* 114 */         return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity
/*     */ 
/*     */             
/* 117 */             .getBlockState().getBlock());
/*     */       }
/*     */       
/* 120 */       if (this.boundEntity != null) {
/* 121 */         return this.boundEntity.isAlive();
/*     */       }
/*     */     } 
/* 124 */     return true;
/*     */   }
/*     */   
/*     */   public ItemStack quickMoveStack(Player playerIn, int index) {
/* 128 */     ItemStack itemstack = ItemStack.EMPTY;
/* 129 */     Slot slot = (Slot)this.slots.get(index);
/* 130 */     if (slot != null && slot.hasItem()) {
/* 131 */       ItemStack itemstack1 = slot.getItem();
/* 132 */       itemstack = itemstack1.copy();
/* 133 */       if (index < 0) {
/* 134 */         if (!moveItemStackTo(itemstack1, 0, this.slots.size(), true)) {
/* 135 */           return ItemStack.EMPTY;
/*     */         }
/* 137 */         slot.onQuickCraft(itemstack1, itemstack);
/* 138 */       } else if (!moveItemStackTo(itemstack1, 0, 0, false)) {
/* 139 */         if ((index < 27) ? 
/* 140 */           !moveItemStackTo(itemstack1, 27, this.slots.size(), true) : 
/* 141 */           !moveItemStackTo(itemstack1, 0, 27, false)) {
/* 142 */           return ItemStack.EMPTY;
/*     */         }
/* 144 */         return ItemStack.EMPTY;
/*     */       } 
/* 146 */       if (itemstack1.getCount() == 0) {
/* 147 */         slot.set(ItemStack.EMPTY);
/*     */       } else {
/* 149 */         slot.setChanged();
/*     */       } 
/* 151 */       if (itemstack1.getCount() == itemstack.getCount()) {
/* 152 */         return ItemStack.EMPTY;
/*     */       }
/* 154 */       slot.onTake(playerIn, itemstack1);
/*     */     } 
/* 156 */     return itemstack;
/*     */   }
/*     */   
/*     */   protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
/* 160 */     boolean flag = false;
/* 161 */     int i = p_38905_;
/* 162 */     if (p_38907_) {
/* 163 */       i = p_38906_ - 1;
/*     */     }
/* 165 */     if (p_38904_.isStackable()) {
/* 166 */       while (!p_38904_.isEmpty() && (!p_38907_ ? (i >= p_38906_) : (i < p_38905_))) {
/*     */         
/* 168 */         Slot slot = (Slot)this.slots.get(i); ItemStack itemstack;
/* 169 */         if (slot.mayPlace(itemstack = slot.getItem()) && 
/* 170 */           !itemstack.isEmpty() && 
/* 171 */           ItemStack.isSameItemSameComponents(p_38904_, itemstack)) {
/*     */           
/* 173 */           int j = itemstack.getCount() + p_38904_.getCount(); int maxSize;
/* 174 */           if (j <= (maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize()))) {
/* 175 */             p_38904_.setCount(0);
/* 176 */             itemstack.setCount(j);
/* 177 */             slot.set(itemstack);
/* 178 */             flag = true;
/* 179 */           } else if (itemstack.getCount() < maxSize) {
/* 180 */             p_38904_.shrink(maxSize - itemstack.getCount());
/* 181 */             itemstack.setCount(maxSize);
/* 182 */             slot.set(itemstack);
/* 183 */             flag = true;
/*     */           } 
/*     */         } 
/* 186 */         if (p_38907_) {
/* 187 */           i--;
/*     */           continue;
/*     */         } 
/* 190 */         i++;
/*     */       } 
/*     */     }
/* 193 */     if (!p_38904_.isEmpty()) {
/* 194 */       i = p_38907_ ? (p_38906_ - 1) : p_38905_;
/* 195 */       while (!p_38907_ ? (i >= p_38906_) : (i < p_38905_)) {
/* 196 */         Slot slot1 = (Slot)this.slots.get(i);
/* 197 */         ItemStack itemstack1 = slot1.getItem();
/* 198 */         if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
/* 199 */           if (p_38904_.getCount() > slot1.getMaxStackSize()) {
/* 200 */             slot1.setByPlayer(p_38904_.split(slot1.getMaxStackSize()));
/*     */           } else {
/* 202 */             slot1.setByPlayer(p_38904_.split(p_38904_.getCount()));
/*     */           } 
/* 204 */           slot1.setChanged();
/* 205 */           flag = true;
/*     */           break;
/*     */         } 
/* 208 */         if (p_38907_) {
/* 209 */           i--;
/*     */           continue;
/*     */         } 
/* 212 */         i++;
/*     */       } 
/*     */     } 
/* 215 */     return flag;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void removed(Player playerIn) {
/* 221 */     super.removed(playerIn);
/* 222 */     if (!this.bound && playerIn instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)playerIn;
/* 223 */       if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
/* 224 */         for (int j = 0; j < this.internal.getSlots(); j++) {
/* 225 */           playerIn.drop(this.internal
/* 226 */               .extractItem(j, this.internal.getStackInSlot(j).getCount(), false), false);
/*     */         }
/*     */       }
/*     */       else {
/*     */         
/* 231 */         for (int i = 0; i < this.internal.getSlots(); i++) {
/* 232 */           playerIn.getInventory()
/* 233 */             .placeItemBackInInventory(this.internal.extractItem(i, this.internal
/*     */                 
/* 235 */                 .getStackInSlot(i).getCount(), false));
/*     */         }
/*     */       }  }
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Map<Integer, Slot> get() {
/* 245 */     return this.customSlots;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\world\inventory\NullInterface3Menu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */