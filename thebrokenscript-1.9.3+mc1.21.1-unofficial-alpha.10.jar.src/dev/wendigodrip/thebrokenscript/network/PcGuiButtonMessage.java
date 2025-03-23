/*    */ package dev.wendigodrip.thebrokenscript.network;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.procedures.PcguibuttonpressProcedure;
/*    */ import dev.wendigodrip.thebrokenscript.world.inventory.PcGuiMenu;
/*    */ import java.util.HashMap;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.neoforged.neoforge.network.handling.IPayloadContext;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class PcGuiButtonMessage implements CustomPacketPayload {
/* 18 */   public static final CustomPacketPayload.Type<PcGuiButtonMessage> TYPE = new CustomPacketPayload.Type(
/* 19 */       TBSConstants.id("pc_gui_button_message"));
/*    */   
/*    */   private final int buttonID;
/*    */   
/*    */   private final int x;
/*    */   private final int y;
/*    */   private final int z;
/*    */   
/*    */   public PcGuiButtonMessage(FriendlyByteBuf buffer) {
/* 28 */     this.buttonID = buffer.readInt();
/* 29 */     this.x = buffer.readInt();
/* 30 */     this.y = buffer.readInt();
/* 31 */     this.z = buffer.readInt();
/*    */   }
/*    */   
/*    */   public PcGuiButtonMessage(int buttonID, int x, int y, int z) {
/* 35 */     this.buttonID = buttonID;
/* 36 */     this.x = x;
/* 37 */     this.y = y;
/* 38 */     this.z = z;
/*    */   }
/*    */   
/*    */   public static void buffer(FriendlyByteBuf buffer, PcGuiButtonMessage message) {
/* 42 */     buffer.writeInt(message.buttonID);
/* 43 */     buffer.writeInt(message.x);
/* 44 */     buffer.writeInt(message.y);
/* 45 */     buffer.writeInt(message.z);
/*    */   }
/*    */   
/*    */   public static void handler(PcGuiButtonMessage message, IPayloadContext context) {
/* 49 */     context.enqueueWork(() -> {
/*    */           ServerPlayer entity = (ServerPlayer)context.player();
/*    */           int buttonID = message.buttonID;
/*    */           int x = message.x;
/*    */           int y = message.y;
/*    */           int z = message.z;
/*    */           handleButtonAction((Player)entity, buttonID, x, y, z);
/*    */         });
/*    */   }
/*    */   
/*    */   public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
/* 60 */     Level world = entity.level();
/* 61 */     HashMap<String, Object> guistate = PcGuiMenu.guistate;
/* 62 */     if (!world.hasChunkAt(new BlockPos(x, y, z))) {
/*    */       return;
/*    */     }
/* 65 */     if (buttonID == 0) {
/* 66 */       PcguibuttonpressProcedure.execute(x, z, (Entity)entity, guistate);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
/* 72 */     return (CustomPacketPayload.Type)TYPE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\network\PcGuiButtonMessage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */