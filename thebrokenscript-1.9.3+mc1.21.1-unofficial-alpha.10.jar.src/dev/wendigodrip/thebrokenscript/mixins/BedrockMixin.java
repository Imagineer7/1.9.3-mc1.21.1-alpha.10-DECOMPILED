/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({Block.class})
/*    */ public abstract class BedrockMixin {
/*    */   @Inject(method = {"getDestroySpeed"}, at = {@At("HEAD")}, cancellable = true, remap = false)
/*    */   private void modifyBedrockHardness(BlockState state, CallbackInfoReturnable<Float> cir) {
/* 15 */     if (state.is(Blocks.BEDROCK))
/* 16 */       cir.setReturnValue(Float.valueOf(3.0F)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\BedrockMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */