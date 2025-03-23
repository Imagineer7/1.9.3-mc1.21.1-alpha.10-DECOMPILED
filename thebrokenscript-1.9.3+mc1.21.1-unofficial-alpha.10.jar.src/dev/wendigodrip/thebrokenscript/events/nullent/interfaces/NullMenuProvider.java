/*    */ package dev.wendigodrip.thebrokenscript.events.nullent.interfaces;
/*    */ 
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\030\000*\b\b\000\020\001*\0020\0022\0020\003B7\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\036\020\b\032\032\022\004\022\0020\n\022\004\022\0020\013\022\004\022\0020\f\022\004\022\0028\0000\t¢\006\004\b\r\020\016J\b\020\017\032\0020\020H\026J \020\021\032\0020\0022\006\020\022\032\0020\n2\006\020\023\032\0020\0132\006\020\024\032\0020\025H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R&\020\b\032\032\022\004\022\0020\n\022\004\022\0020\013\022\004\022\0020\f\022\004\022\0028\0000\tX\004¢\006\002\n\000¨\006\026"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/nullent/interfaces/NullMenuProvider;", "T", "Lnet/minecraft/world/inventory/AbstractContainerMenu;", "Lnet/minecraft/world/MenuProvider;", "displayName", "", "blockPos", "Lnet/minecraft/core/BlockPos;", "ctor", "Lkotlin/Function3;", "", "Lnet/minecraft/world/entity/player/Inventory;", "Lnet/minecraft/network/FriendlyByteBuf;", "<init>", "(Ljava/lang/String;Lnet/minecraft/core/BlockPos;Lkotlin/jvm/functions/Function3;)V", "getDisplayName", "Lnet/minecraft/network/chat/Component;", "createMenu", "id", "inventory", "player", "Lnet/minecraft/world/entity/player/Player;", "thebrokenscript"})
/*    */ public final class NullMenuProvider<T extends AbstractContainerMenu> implements MenuProvider {
/*    */   @NotNull
/*    */   private final String displayName;
/*    */   
/* 13 */   public NullMenuProvider(@NotNull String displayName, @NotNull BlockPos blockPos, @NotNull Function3<Integer, Inventory, FriendlyByteBuf, T> ctor) { this.displayName = displayName;
/* 14 */     this.blockPos = blockPos;
/* 15 */     this.ctor = ctor; } @NotNull private final BlockPos blockPos; @NotNull
/*    */   private final Function3<Integer, Inventory, FriendlyByteBuf, T> ctor; @NotNull
/* 17 */   public Component getDisplayName() { Intrinsics.checkNotNullExpressionValue(Component.literal(this.displayName), "literal(...)"); return (Component)Component.literal(this.displayName); }
/*    */    @NotNull
/*    */   public AbstractContainerMenu createMenu(int id, @NotNull Inventory inventory, @NotNull Player player) {
/* 20 */     Intrinsics.checkNotNullParameter(inventory, "inventory"); Intrinsics.checkNotNullParameter(player, "player");
/* 21 */     Intrinsics.checkNotNullExpressionValue((new FriendlyByteBuf(Unpooled.buffer())).writeBlockPos(this.blockPos), "writeBlockPos(...)"); return (AbstractContainerMenu)this.ctor.invoke(Integer.valueOf(id), inventory, (new FriendlyByteBuf(Unpooled.buffer())).writeBlockPos(this.blockPos));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\nullent\interfaces\NullMenuProvider.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */