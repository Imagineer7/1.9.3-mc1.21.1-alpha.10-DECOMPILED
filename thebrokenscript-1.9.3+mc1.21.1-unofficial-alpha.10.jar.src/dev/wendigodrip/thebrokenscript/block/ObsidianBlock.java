/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class ObsidianBlock
/*    */   extends Block {
/*    */   public ObsidianBlock() {
/* 13 */     super(BlockBehaviour.Properties.of()
/* 14 */         .sound(SoundType.STONE)
/* 15 */         .strength(50.0F, 10.0F)
/* 16 */         .requiresCorrectToolForDrops());
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 20 */     return 15;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\ObsidianBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */