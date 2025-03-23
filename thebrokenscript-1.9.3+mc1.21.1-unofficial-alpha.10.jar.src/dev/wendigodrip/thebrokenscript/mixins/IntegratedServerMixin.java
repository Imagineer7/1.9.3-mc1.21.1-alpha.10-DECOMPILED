/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
/*    */ import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
/*    */ import dev.wendigodrip.thebrokenscript.engine.EventState;
/*    */ import net.minecraft.client.OptionInstance;
/*    */ import net.minecraft.client.Options;
/*    */ import net.minecraft.client.server.IntegratedServer;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mixin({IntegratedServer.class})
/*    */ public class IntegratedServerMixin
/*    */ {
/*    */   @WrapOperation(method = {"tickServer"}, at = {@At(value = "INVOKE", target = "Lnet/minecraft/client/Options;renderDistance()Lnet/minecraft/client/OptionInstance;")})
/*    */   public OptionInstance<Integer> modifyRenderDistanceResult(Options instance, Operation<OptionInstance<Integer>> original) {
/* 25 */     if (EventState.moonGlitchActive) {
/* 26 */       OptionInstance<Integer> orig = (OptionInstance<Integer>)original.call(new Object[] { instance });
/*    */       
/* 28 */       return new OptionInstance(orig.caption
/* 29 */           .getString(), 
/* 30 */           OptionInstance.noTooltip(), (cap, it) -> Component.literal(it.toString()), orig
/*    */           
/* 32 */           .values(), 
/* 33 */           Integer.valueOf(2), val -> {
/*    */           
/*    */           });
/*    */     } 
/*    */ 
/*    */     
/* 39 */     return (OptionInstance<Integer>)original.call(new Object[] { instance });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\IntegratedServerMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */