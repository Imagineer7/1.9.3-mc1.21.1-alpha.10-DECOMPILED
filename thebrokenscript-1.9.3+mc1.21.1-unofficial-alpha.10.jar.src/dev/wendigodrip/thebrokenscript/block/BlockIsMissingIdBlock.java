/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class BlockIsMissingIdBlock
/*    */   extends Block {
/*    */   public BlockIsMissingIdBlock() {
/* 13 */     super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(-1.0F, 3600000.0F));
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 17 */     return 15;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\BlockIsMissingIdBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */