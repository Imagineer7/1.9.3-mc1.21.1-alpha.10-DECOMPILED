/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.StairBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class ProtectedVoidStairsBlock
/*    */   extends StairBlock {
/*    */   public ProtectedVoidStairsBlock() {
/* 12 */     super(Blocks.AIR
/* 13 */         .defaultBlockState(), 
/* 14 */         BlockBehaviour.Properties.of().sound(SoundType.ANVIL).strength(-1.0F, 3600000.0F));
/*    */   }
/*    */ 
/*    */   
/*    */   public float getExplosionResistance() {
/* 19 */     return 10.0F;
/*    */   }
/*    */   
/*    */   public boolean isRandomlyTicking(BlockState state) {
/* 23 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\ProtectedVoidStairsBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */