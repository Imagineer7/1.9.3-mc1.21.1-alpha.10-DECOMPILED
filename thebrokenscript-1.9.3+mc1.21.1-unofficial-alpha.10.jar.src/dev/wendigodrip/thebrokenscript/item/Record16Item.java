/*   */ package dev.wendigodrip.thebrokenscript.item;
/*   */ import net.minecraft.world.item.Item;
/*   */ import net.minecraft.world.item.Rarity;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Ldev/wendigodrip/thebrokenscript/item/Record16Item;", "Lnet/minecraft/world/item/Item;", "<init>", "()V", "thebrokenscript"})
/*   */ public final class Record16Item extends Item {
/*   */   public Record16Item() {
/* 8 */     super((new Item.Properties()).stacksTo(1).rarity(Rarity.COMMON).jukeboxPlayable(TBSSongs.INSTANCE.getDISC_16_YOUCANT().getKey()));
/*   */   }
/*   */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\item\Record16Item.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */