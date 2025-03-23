/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import net.minecraft.world.level.block.SlabBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ 
/*    */ public class ProtectedVoidSlabBlock
/*    */   extends SlabBlock {
/*    */   public ProtectedVoidSlabBlock() {
/* 10 */     super(BlockBehaviour.Properties.of().sound(SoundType.ANVIL).strength(-1.0F, 3600000.0F));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\ProtectedVoidSlabBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */