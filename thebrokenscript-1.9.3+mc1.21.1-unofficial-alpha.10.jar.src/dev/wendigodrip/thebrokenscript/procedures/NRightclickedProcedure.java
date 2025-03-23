/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ 
/*    */ public class NRightclickedProcedure {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 13 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 14 */       ItemStack _stktoremove = new ItemStack((ItemLike)TBSItems.N.get());
/* 15 */       _player.getInventory()
/* 16 */         .clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/*    */ 
/*    */           
/* 19 */           .getCraftSlots()); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\NRightclickedProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */