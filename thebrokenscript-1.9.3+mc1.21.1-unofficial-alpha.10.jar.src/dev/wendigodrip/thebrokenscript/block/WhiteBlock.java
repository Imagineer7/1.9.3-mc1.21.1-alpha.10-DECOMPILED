/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.block.entity.WhiteBlockEntity;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.Containers;
/*    */ import net.minecraft.world.MenuProvider;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.EntityBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.entity.BlockEntity;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class WhiteBlock
/*    */   extends Block implements EntityBlock {
/*    */   public WhiteBlock() {
/* 21 */     super(BlockBehaviour.Properties.of()
/* 22 */         .sound(SoundType.GLASS)
/* 23 */         .strength(50.0F, 1000.0F)
/* 24 */         .speedFactor(0.5F)
/* 25 */         .jumpFactor(0.5F)
/* 26 */         .hasPostProcess((bs, br, bp) -> true)
/* 27 */         .emissiveRendering((bs, br, bp) -> true));
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 31 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
/* 36 */     BlockEntity tileEntity = worldIn.getBlockEntity(pos); MenuProvider menuProvider;
/* 37 */     return (tileEntity instanceof MenuProvider) ? (menuProvider = (MenuProvider)tileEntity) : null;
/*    */   }
/*    */   
/*    */   public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
/* 41 */     return (BlockEntity)new WhiteBlockEntity(pos, state);
/*    */   }
/*    */   
/*    */   public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
/* 45 */     super.triggerEvent(state, world, pos, eventID, eventParam);
/* 46 */     BlockEntity blockEntity = world.getBlockEntity(pos);
/* 47 */     return (blockEntity != null && blockEntity.triggerEvent(eventID, eventParam));
/*    */   }
/*    */   
/*    */   public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
/* 51 */     if (state.getBlock() != newState.getBlock()) {
/* 52 */       BlockEntity blockEntity = world.getBlockEntity(pos);
/* 53 */       if (blockEntity instanceof WhiteBlockEntity) { WhiteBlockEntity be = (WhiteBlockEntity)blockEntity;
/* 54 */         Containers.dropContents(world, pos, (Container)be);
/* 55 */         world.updateNeighbourForOutputSignal(pos, this); }
/*    */       
/* 57 */       super.onRemove(state, world, pos, newState, isMoving);
/*    */     } 
/*    */   }
/*    */   
/*    */   public boolean hasAnalogOutputSignal(BlockState state) {
/* 62 */     return true;
/*    */   }
/*    */   
/*    */   public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
/* 66 */     BlockEntity tileentity = world.getBlockEntity(pos);
/* 67 */     if (tileentity instanceof WhiteBlockEntity) { WhiteBlockEntity be = (WhiteBlockEntity)tileentity;
/* 68 */       return AbstractContainerMenu.getRedstoneSignalFromContainer((Container)be); }
/*    */     
/* 70 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\WhiteBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */