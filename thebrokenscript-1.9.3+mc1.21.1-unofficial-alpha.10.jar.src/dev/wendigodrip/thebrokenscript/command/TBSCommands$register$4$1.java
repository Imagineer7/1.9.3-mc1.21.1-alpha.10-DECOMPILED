/*    */ package dev.wendigodrip.thebrokenscript.command;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.world.inventory.DevPassMenu;
/*    */ import io.netty.buffer.Unpooled;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Position;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.MutableComponent;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.MenuProvider;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Inventory;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.inventory.AbstractContainerMenu;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000+\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\025\020\002\032\n \004*\004\030\0010\0030\003H\026¢\006\002\020\005J \020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\026¨\006\016"}, d2 = {"dev/wendigodrip/thebrokenscript/command/TBSCommands$register$4$1", "Lnet/minecraft/world/MenuProvider;", "getDisplayName", "Lnet/minecraft/network/chat/MutableComponent;", "kotlin.jvm.PlatformType", "()Lnet/minecraft/network/chat/MutableComponent;", "createMenu", "Ldev/wendigodrip/thebrokenscript/world/inventory/DevPassMenu;", "id", "", "inventory", "Lnet/minecraft/world/entity/player/Inventory;", "player", "Lnet/minecraft/world/entity/player/Player;", "thebrokenscript"})
/*    */ public final class TBSCommands$register$4$1
/*    */   implements MenuProvider
/*    */ {
/*    */   TBSCommands$register$4$1(Entity $ent) {}
/*    */   
/*    */   public MutableComponent getDisplayName() {
/* 79 */     return Component.literal("DevPass");
/*    */   } public DevPassMenu createMenu(int id, Inventory inventory, Player player) {
/* 81 */     Intrinsics.checkNotNullParameter(inventory, "inventory"); Intrinsics.checkNotNullParameter(player, "player"); return new DevPassMenu(
/* 82 */         id, 
/* 83 */         inventory, (
/* 84 */         new FriendlyByteBuf(Unpooled.buffer())).writeBlockPos(BlockPos.containing((Position)((ServerPlayer)this.$ent).position())));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\command\TBSCommands$register$4$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */