/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.chunk.LevelChunk;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({LevelChunk.class})
/*    */ public class ChunkAccessMixin
/*    */ {
/*    */   @Inject(method = {"setBlockState"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void allowPlacingBelowBedrock(BlockPos pos, BlockState state, boolean isMoving, CallbackInfoReturnable<BlockState> cir) {
/* 24 */     if (pos.getY() < -164)
/* 25 */       cir.setReturnValue(state); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\ChunkAccessMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */