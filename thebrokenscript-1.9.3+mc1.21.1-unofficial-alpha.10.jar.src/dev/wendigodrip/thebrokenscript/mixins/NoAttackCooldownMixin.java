/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ import org.spongepowered.asm.mixin.injection.Inject;
/*    */ import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*    */ 
/*    */ @Mixin({Player.class})
/*    */ public abstract class NoAttackCooldownMixin {
/*    */   @Inject(method = {"getAttackStrengthScale"}, at = {@At("HEAD")}, cancellable = true)
/*    */   private void removeCooldown(CallbackInfoReturnable<Float> ci) {
/* 14 */     if (TBSConfigs.COMMON != null && TBSConfigs.COMMON.getDisableAttackCooldown()) ci.setReturnValue(Float.valueOf(1.0F)); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\NoAttackCooldownMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */