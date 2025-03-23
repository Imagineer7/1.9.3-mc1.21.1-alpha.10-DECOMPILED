/*     */ package dev.wendigodrip.thebrokenscript.block.entity;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSBlockEntities;
/*     */ import java.util.Arrays;
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.HolderLookup;
/*     */ import net.minecraft.core.NonNullList;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
/*     */ import net.minecraft.world.ContainerHelper;
/*     */ import net.minecraft.world.WorldlyContainer;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.inventory.ChestMenu;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.entity.BlockEntityType;
/*     */ import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.neoforged.neoforge.items.IItemHandler;
/*     */ import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
/*     */ 
/*     */ public class WhiteBlockEntity
/*     */   extends RandomizableContainerBlockEntity
/*     */   implements WorldlyContainer
/*     */ {
/*     */   private final IItemHandler[] handlers;
/*     */   private NonNullList<ItemStack> stacks;
/*     */   
/*     */   public WhiteBlockEntity(BlockPos position, BlockState state) {
/*  36 */     super((BlockEntityType)TBSBlockEntities.WHITE.get(), position, state);
/*     */     this.handlers = (IItemHandler[])Arrays.<Direction>stream(Direction.values()).map(it -> new SidedInvWrapper(this, it)).toArray(x$0 -> new IItemHandler[x$0]);
/*     */     this.stacks = NonNullList.withSize(9, ItemStack.EMPTY);
/*     */   } public void loadAdditional(CompoundTag compound, HolderLookup.Provider registries) {
/*  40 */     super.loadAdditional(compound, registries);
/*  41 */     if (!tryLoadLootTable(compound)) {
/*  42 */       this.stacks = NonNullList.withSize(getContainerSize(), ItemStack.EMPTY);
/*     */     }
/*  44 */     ContainerHelper.loadAllItems(compound, this.stacks, registries);
/*     */   }
/*     */   
/*     */   public void saveAdditional(CompoundTag compound, HolderLookup.Provider registries) {
/*  48 */     super.saveAdditional(compound, registries);
/*  49 */     if (!trySaveLootTable(compound)) {
/*  50 */       ContainerHelper.saveAllItems(compound, this.stacks, registries);
/*     */     }
/*     */   }
/*     */   
/*     */   public ClientboundBlockEntityDataPacket getUpdatePacket() {
/*  55 */     return ClientboundBlockEntityDataPacket.create((BlockEntity)this);
/*     */   }
/*     */   
/*     */   public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
/*  59 */     return saveWithFullMetadata(registries);
/*     */   }
/*     */   
/*     */   public int getContainerSize() {
/*  63 */     return this.stacks.size();
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*  67 */     for (ItemStack itemstack : this.stacks) {
/*  68 */       if (itemstack.isEmpty())
/*  69 */         continue;  return false;
/*     */     } 
/*  71 */     return true;
/*     */   }
/*     */   
/*     */   public Component getDefaultName() {
/*  75 */     return (Component)Component.literal("white");
/*     */   }
/*     */   
/*     */   public int getMaxStackSize() {
/*  79 */     return 64;
/*     */   }
/*     */   
/*     */   public AbstractContainerMenu createMenu(int id, Inventory inventory) {
/*  83 */     return (AbstractContainerMenu)ChestMenu.threeRows(id, inventory);
/*     */   }
/*     */   
/*     */   public Component getDisplayName() {
/*  87 */     return (Component)Component.literal("OUTSIDE");
/*     */   }
/*     */   
/*     */   protected NonNullList<ItemStack> getItems() {
/*  91 */     return this.stacks;
/*     */   }
/*     */   
/*     */   protected void setItems(NonNullList<ItemStack> stacks) {
/*  95 */     this.stacks = stacks;
/*     */   }
/*     */   
/*     */   public boolean canPlaceItem(int index, ItemStack stack) {
/*  99 */     return true;
/*     */   }
/*     */   
/*     */   public int[] getSlotsForFace(Direction side) {
/* 103 */     return IntStream.range(0, getContainerSize()).toArray();
/*     */   }
/*     */   
/*     */   public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
/* 107 */     return canPlaceItem(index, stack);
/*     */   }
/*     */   
/*     */   public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
/* 111 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\entity\WhiteBlockEntity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */