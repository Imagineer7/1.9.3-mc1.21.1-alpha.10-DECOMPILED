/*    */ package dev.wendigodrip.thebrokenscript.vars;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.network.PlayerVariablesSyncMessage;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.nbt.CompoundTag;
/*    */ import net.minecraft.nbt.Tag;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.neoforged.neoforge.common.util.INBTSerializable;
/*    */ import net.neoforged.neoforge.network.PacketDistributor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public class PlayerVariables implements INBTSerializable<Tag> {
/* 15 */   public double corrupted = 0.0D; public boolean filecreated = false;
/*    */   public boolean screendamage = false;
/*    */   public boolean is_player_an_entity = false;
/*    */   
/*    */   public void syncPlayerVariables(Entity entity) {
/* 20 */     if (entity instanceof ServerPlayer) { ServerPlayer serverPlayer = (ServerPlayer)entity;
/* 21 */       PacketDistributor.sendToPlayer(serverPlayer, (CustomPacketPayload)new PlayerVariablesSyncMessage(this), new CustomPacketPayload[0]); }
/*    */   
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Tag serializeNBT(HolderLookup.Provider provider) {
/* 29 */     CompoundTag nbt = new CompoundTag();
/*    */     
/* 31 */     nbt.putBoolean("filecreated", this.filecreated);
/* 32 */     nbt.putDouble("corrupted", this.corrupted);
/* 33 */     nbt.putBoolean("screendamage", this.screendamage);
/* 34 */     nbt.putBoolean("is_player_an_entity", this.is_player_an_entity);
/*    */     
/* 36 */     return (Tag)nbt;
/*    */   }
/*    */   
/*    */   public void deserializeNBT(HolderLookup.Provider provider, @NotNull Tag tag) {
/* 40 */     CompoundTag nbt = (CompoundTag)tag;
/*    */     
/* 42 */     this.filecreated = nbt.getBoolean("filecreated");
/* 43 */     this.corrupted = nbt.getDouble("corrupted");
/* 44 */     this.screendamage = nbt.getBoolean("screendamage");
/* 45 */     this.is_player_an_entity = nbt.getBoolean("is_player_an_entity");
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\vars\PlayerVariables.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */