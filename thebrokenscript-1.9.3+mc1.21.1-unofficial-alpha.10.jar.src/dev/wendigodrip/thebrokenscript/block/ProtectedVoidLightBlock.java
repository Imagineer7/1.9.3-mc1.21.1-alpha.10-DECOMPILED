/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class ProtectedVoidLightBlock
/*    */   extends Block {
/*    */   public ProtectedVoidLightBlock() {
/* 13 */     super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(-1.0F, 3600000.0F).lightLevel(s -> 15));
/*    */   }
/*    */   
/*    */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/* 17 */     return true;
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 21 */     return 0;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\ProtectedVoidLightBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */