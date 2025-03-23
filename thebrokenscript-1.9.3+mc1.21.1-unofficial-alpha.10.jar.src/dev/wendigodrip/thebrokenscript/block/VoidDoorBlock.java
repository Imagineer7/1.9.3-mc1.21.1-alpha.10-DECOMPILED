/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.DoorBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.BlockSetType;
/*    */ 
/*    */ public class VoidDoorBlock
/*    */   extends DoorBlock {
/*    */   public VoidDoorBlock() {
/* 14 */     super(BlockSetType.STONE, 
/*    */         
/* 16 */         BlockBehaviour.Properties.of()
/* 17 */         .sound(SoundType.ANVIL)
/* 18 */         .strength(-1.0F, 3600000.0F)
/* 19 */         .noOcclusion()
/* 20 */         .isRedstoneConductor((bs, br, bp) -> false));
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 25 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\VoidDoorBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */