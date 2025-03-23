/*     */ package dev.wendigodrip.thebrokenscript.block.entity;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSBlockEntities;
/*     */ import dev.wendigodrip.thebrokenscript.world.inventory.PcGuiMenu;
/*     */ import io.netty.buffer.Unpooled;
/*     */ import java.util.Arrays;
/*     */ import java.util.stream.IntStream;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Direction;
/*     */ import net.minecraft.core.HolderLookup;
/*     */ import net.minecraft.core.NonNullList;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.FriendlyByteBuf;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
/*     */ import net.minecraft.world.ContainerHelper;
/*     */ import net.minecraft.world.WorldlyContainer;
/*     */ import net.minecraft.world.entity.player.Inventory;
/*     */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.block.entity.BlockEntity;
/*     */ import net.minecraft.world.level.block.entity.BlockEntityType;
/*     */ import net.minecraft.world.level.block.entity.RandomizableContainerBlockEntity;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.neoforged.neoforge.items.IItemHandler;
/*     */ import net.neoforged.neoforge.items.wrapper.SidedInvWrapper;
/*     */ 
/*     */ public class ConsoleBlockEntity
/*     */   extends RandomizableContainerBlockEntity
/*     */   implements WorldlyContainer
/*     */ {
/*     */   private final IItemHandler[] handlers;
/*     */   private NonNullList<ItemStack> stacks;
/*     */   
/*     */   public ConsoleBlockEntity(BlockPos position, BlockState state) {
/*  38 */     super((BlockEntityType)TBSBlockEntities.CONSOLE.get(), position, state);
/*     */     this.handlers = (IItemHandler[])Arrays.<Direction>stream(Direction.values()).map(it -> new SidedInvWrapper(this, it)).toArray(x$0 -> new IItemHandler[x$0]);
/*     */     this.stacks = NonNullList.withSize(0, ItemStack.EMPTY);
/*     */   }
/*     */   public void loadAdditional(CompoundTag compound, HolderLookup.Provider registries) {
/*  43 */     super.loadAdditional(compound, registries);
/*     */     
/*  45 */     if (!tryLoadLootTable(compound)) {
/*  46 */       this.stacks = NonNullList.withSize(getContainerSize(), ItemStack.EMPTY);
/*     */     }
/*     */     
/*  49 */     ContainerHelper.loadAllItems(compound, this.stacks, registries);
/*     */   }
/*     */   
/*     */   public void saveAdditional(CompoundTag compound, HolderLookup.Provider registries) {
/*  53 */     super.saveAdditional(compound, registries);
/*     */     
/*  55 */     if (!trySaveLootTable(compound)) {
/*  56 */       ContainerHelper.saveAllItems(compound, this.stacks, registries);
/*     */     }
/*     */   }
/*     */   
/*     */   public ClientboundBlockEntityDataPacket getUpdatePacket() {
/*  61 */     return ClientboundBlockEntityDataPacket.create((BlockEntity)this);
/*     */   }
/*     */   
/*     */   public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
/*  65 */     return saveWithFullMetadata(registries);
/*     */   }
/*     */   
/*     */   public int getContainerSize() {
/*  69 */     return this.stacks.size();
/*     */   }
/*     */   
/*     */   public boolean isEmpty() {
/*  73 */     for (ItemStack itemstack : this.stacks) {
/*  74 */       if (itemstack.isEmpty())
/*  75 */         continue;  return false;
/*     */     } 
/*  77 */     return true;
/*     */   }
/*     */   
/*     */   public Component getDefaultName() {
/*  81 */     return (Component)Component.literal("console");
/*     */   }
/*     */   
/*     */   public int getMaxStackSize() {
/*  85 */     return 1;
/*     */   }
/*     */   
/*     */   public AbstractContainerMenu createMenu(int id, Inventory inventory) {
/*  89 */     return (AbstractContainerMenu)new PcGuiMenu(id, inventory, (new FriendlyByteBuf(Unpooled.buffer())).writeBlockPos(this.worldPosition));
/*     */   }
/*     */   
/*     */   public Component getDisplayName() {
/*  93 */     return (Component)Component.literal("Alternate Console Block");
/*     */   }
/*     */   
/*     */   protected NonNullList<ItemStack> getItems() {
/*  97 */     return this.stacks;
/*     */   }
/*     */   
/*     */   protected void setItems(NonNullList<ItemStack> stacks) {
/* 101 */     this.stacks = stacks;
/*     */   }
/*     */   
/*     */   public boolean canPlaceItem(int index, ItemStack stack) {
/* 105 */     return true;
/*     */   }
/*     */   
/*     */   public int[] getSlotsForFace(Direction side) {
/* 109 */     return IntStream.range(0, getContainerSize()).toArray();
/*     */   }
/*     */   
/*     */   public boolean canPlaceItemThroughFace(int index, ItemStack stack, @Nullable Direction direction) {
/* 113 */     return canPlaceItem(index, stack);
/*     */   }
/*     */   
/*     */   public boolean canTakeItemThroughFace(int index, ItemStack stack, Direction direction) {
/* 117 */     return true;
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\entity\ConsoleBlockEntity.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */