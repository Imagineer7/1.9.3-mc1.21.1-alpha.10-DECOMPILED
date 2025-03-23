/*    */ package dev.wendigodrip.thebrokenscript.network;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.procedures.dev.DevCheckProcedure;
/*    */ import dev.wendigodrip.thebrokenscript.world.inventory.DevPassMenu;
/*    */ import java.util.HashMap;
/*    */ import net.minecraft.client.gui.components.AbstractWidget;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.neoforge.network.handling.IPayloadContext;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class DevPassButtonMessage implements CustomPacketPayload {
/* 19 */   public static final CustomPacketPayload.Type<DevPassButtonMessage> TYPE = new CustomPacketPayload.Type(
/* 20 */       TBSConstants.id("dev_pass_button_message"));
/*    */   
/*    */   private final int buttonID;
/*    */   private final int x;
/*    */   private final int y;
/*    */   private final int z;
/*    */   
/*    */   public DevPassButtonMessage(FriendlyByteBuf buffer) {
/* 28 */     this.buttonID = buffer.readInt();
/* 29 */     this.x = buffer.readInt();
/* 30 */     this.y = buffer.readInt();
/* 31 */     this.z = buffer.readInt();
/*    */   }
/*    */   
/*    */   public DevPassButtonMessage(int buttonID, int x, int y, int z) {
/* 35 */     this.buttonID = buttonID;
/* 36 */     this.x = x;
/* 37 */     this.y = y;
/* 38 */     this.z = z;
/*    */   }
/*    */   
/*    */   public static void buffer(FriendlyByteBuf buffer, DevPassButtonMessage message) {
/* 42 */     buffer.writeInt(message.buttonID);
/* 43 */     buffer.writeInt(message.x);
/* 44 */     buffer.writeInt(message.y);
/* 45 */     buffer.writeInt(message.z);
/*    */   }
/*    */   
/*    */   public static void handler(DevPassButtonMessage message, IPayloadContext context) {
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
/* 61 */     HashMap<String, AbstractWidget> guistate = DevPassMenu.guistate;
/* 62 */     if (!world.hasChunkAt(new BlockPos(x, y, z))) {
/*    */       return;
/*    */     }
/* 65 */     if (buttonID == 0) {
/* 66 */       DevCheckProcedure.execute((LevelAccessor)world, new BlockPos(x, y, z), guistate);
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
/* 72 */     return (CustomPacketPayload.Type)TYPE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\network\DevPassButtonMessage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */