/*   */ package dev.wendigodrip.thebrokenscript.item;
/*   */ import net.minecraft.world.item.Item;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003¨\006\004"}, d2 = {"Ldev/wendigodrip/thebrokenscript/item/Record14Item;", "Lnet/minecraft/world/item/Item;", "<init>", "()V", "thebrokenscript"})
/*   */ public final class Record14Item extends Item {
/*   */   public Record14Item() {
/* 7 */     super((new Item.Properties()).stacksTo(1).rarity(Rarity.COMMON).jukeboxPlayable(TBSSongs.INSTANCE.getDISC_14().getKey()));
/*   */   }
/*   */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\item\Record14Item.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */