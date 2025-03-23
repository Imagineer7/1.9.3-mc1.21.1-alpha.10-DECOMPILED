/*    */ package dev.wendigodrip.thebrokenscript.item;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.InteractionResultHolder;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J&\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\fH\026¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/item/GoreItem;", "Lnet/minecraft/world/item/Item;", "<init>", "()V", "use", "Lnet/minecraft/world/InteractionResultHolder;", "Lnet/minecraft/world/item/ItemStack;", "world", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/player/Player;", "hand", "Lnet/minecraft/world/InteractionHand;", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nGoreItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoreItem.kt\ndev/wendigodrip/thebrokenscript/item/GoreItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
/*    */ public final class GoreItem extends Item {
/* 12 */   public GoreItem() { super((new Item.Properties()).stacksTo(64).rarity(Rarity.COMMON)); } @NotNull
/*    */   public InteractionResultHolder<ItemStack> use(@NotNull Level world, @NotNull Player entity, @NotNull InteractionHand hand) {
/* 14 */     Intrinsics.checkNotNullParameter(world, "world"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(hand, "hand"); InteractionResultHolder<ItemStack> interactionResultHolder1 = super.use(world, entity, hand), it = interactionResultHolder1;
/*    */ 
/*    */     
/* 17 */     int $i$a$-also-GoreItem$use$1 = 0;
/*    */     NRightclickedProcedure.execute((Entity)entity);
/*    */     Intrinsics.checkNotNullExpressionValue(interactionResultHolder1, "also(...)");
/*    */     return interactionResultHolder1;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\item\GoreItem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */