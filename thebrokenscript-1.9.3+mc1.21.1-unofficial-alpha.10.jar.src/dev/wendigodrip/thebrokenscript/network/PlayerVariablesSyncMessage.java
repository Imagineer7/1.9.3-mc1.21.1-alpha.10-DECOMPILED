/*    */ package dev.wendigodrip.thebrokenscript.network;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSDataAttachments;
/*    */ import dev.wendigodrip.thebrokenscript.vars.PlayerVariables;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.nbt.Tag;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.neoforged.neoforge.network.handling.IPayloadContext;
/*    */ 
/*    */ public class PlayerVariablesSyncMessage implements CustomPacketPayload {
/* 12 */   public static final CustomPacketPayload.Type<PlayerVariablesSyncMessage> TYPE = new CustomPacketPayload.Type(
/* 13 */       TBSConstants.id("player_vars_sync"));
/*    */   
/*    */   private final PlayerVariables data;
/*    */   
/*    */   public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
/* 18 */     this.data = new PlayerVariables();
/* 19 */     this.data.deserializeNBT(null, (Tag)buffer.readNbt());
/*    */   }
/*    */   
/*    */   public PlayerVariablesSyncMessage(PlayerVariables data) {
/* 23 */     this.data = data;
/*    */   }
/*    */   
/*    */   public static void buffer(FriendlyByteBuf buffer, PlayerVariablesSyncMessage message) {
/* 27 */     buffer.writeNbt(message.data.serializeNBT(null));
/*    */   }
/*    */   
/*    */   public static void handler(PlayerVariablesSyncMessage message, IPayloadContext context) {
/* 31 */     context.enqueueWork(() -> {
/*    */           if (!context.flow().getReceptionSide().isServer()) {
/*    */             PlayerVariables variables = (PlayerVariables)(Minecraft.getInstance()).player.getData(TBSDataAttachments.PLAYER_VARIABLES);
/*    */             variables.filecreated = message.data.filecreated;
/*    */             variables.corrupted = message.data.corrupted;
/*    */             variables.screendamage = message.data.screendamage;
/*    */             variables.is_player_an_entity = message.data.is_player_an_entity;
/*    */           } 
/*    */         });
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public CustomPacketPayload.Type<? extends CustomPacketPayload> type() {
/* 45 */     return (CustomPacketPayload.Type)TYPE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\network\PlayerVariablesSyncMessage.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */