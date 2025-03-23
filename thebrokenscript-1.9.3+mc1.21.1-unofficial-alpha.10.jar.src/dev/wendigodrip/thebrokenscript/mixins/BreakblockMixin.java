/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({Blocks.class})
/*    */ public abstract class BreakblockMixin {
/*    */   @Inject(method = {"properties"}, at = {@At("RETURN")}, cancellable = true)
/*    */   private static void modifyBedrockProperties(CallbackInfoReturnable<BlockBehaviour.Properties> cir) {
/* 14 */     if (cir.getReturnValue() != null)
/* 15 */       cir.setReturnValue(((BlockBehaviour.Properties)cir.getReturnValue()).strength(3.0F, 9.0F)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\BreakblockMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */