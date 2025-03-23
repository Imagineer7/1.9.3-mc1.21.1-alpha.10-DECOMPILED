/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import net.minecraft.world.level.LevelHeightAccessor;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Overwrite;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({LevelHeightAccessor.class})
/*    */ public interface LevelHeightAccessorMixin {
/*    */   @Overwrite
/*    */   default int getMinBuildHeight() {
/* 14 */     return -64;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Inject(method = {"isOutsideBuildHeight(I)Z"}, at = {@At("HEAD")}, cancellable = true)
/*    */   default void allowBuildingBelow(int y, CallbackInfoReturnable<Boolean> cir) {
/* 23 */     if (y < -64)
/* 24 */       cir.setReturnValue(Boolean.valueOf(false)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\LevelHeightAccessorMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */