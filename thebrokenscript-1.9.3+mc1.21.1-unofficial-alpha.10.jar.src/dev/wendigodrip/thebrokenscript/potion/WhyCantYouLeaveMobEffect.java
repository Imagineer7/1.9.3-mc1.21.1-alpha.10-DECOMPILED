/*    */ package dev.wendigodrip.thebrokenscript.potion;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectCategory;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class WhyCantYouLeaveMobEffect
/*    */   extends MobEffect {
/*    */   public WhyCantYouLeaveMobEffect() {
/* 14 */     super(MobEffectCategory.NEUTRAL, -16777216);
/*    */   }
/*    */   
/*    */   public List<ItemStack> getCurativeItems() {
/* 18 */     ArrayList<ItemStack> cures = new ArrayList<>();
/* 19 */     cures.add(new ItemStack((ItemLike)Items.MILK_BUCKET));
/* 20 */     return cures;
/*    */   }
/*    */   
/*    */   public boolean isDurationEffectTick(int duration, int amplifier) {
/* 24 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\potion\WhyCantYouLeaveMobEffect.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */