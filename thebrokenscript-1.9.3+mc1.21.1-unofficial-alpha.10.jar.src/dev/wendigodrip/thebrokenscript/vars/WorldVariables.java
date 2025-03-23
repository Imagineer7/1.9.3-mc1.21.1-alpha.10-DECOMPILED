/*    */ package dev.wendigodrip.thebrokenscript.vars;
/*    */ import dev.wendigodrip.thebrokenscript.network.SavedDataSyncMessage;
/*    */ import java.util.function.Supplier;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.nbt.CompoundTag;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.saveddata.SavedData;
/*    */ import net.neoforged.neoforge.network.PacketDistributor;
/*    */ 
/*    */ public class WorldVariables extends SavedData {
/* 14 */   public static WorldVariables clientSide = new WorldVariables(); public static final String DATA_NAME = "thebrokenscript_worldvars";
/*    */   
/*    */   public static WorldVariables load(CompoundTag tag, HolderLookup.Provider prov) {
/* 17 */     WorldVariables data = new WorldVariables();
/* 18 */     data.read(tag);
/* 19 */     return data;
/*    */   }
/*    */   
/*    */   public static WorldVariables get(LevelAccessor world) {
/* 23 */     if (world instanceof ServerLevel) { ServerLevel level = (ServerLevel)world;
/* 24 */       return (WorldVariables)level.getDataStorage()
/* 25 */         .computeIfAbsent(new SavedData.Factory(WorldVariables::new, WorldVariables::load), "thebrokenscript_worldvars"); }
/*    */     
/* 27 */     return clientSide;
/*    */   }
/*    */ 
/*    */   
/*    */   public void read(CompoundTag nbt) {}
/*    */   
/*    */   public CompoundTag save(CompoundTag nbt, HolderLookup.Provider prov) {
/* 34 */     return nbt;
/*    */   }
/*    */ 
/*    */   
/*    */   public void syncData(LevelAccessor world) {
/* 39 */     setDirty(); Level level;
/* 40 */     if (world instanceof Level && !(level = (Level)world).isClientSide())
/* 41 */       PacketDistributor.sendToPlayersInDimension((ServerLevel)level, (CustomPacketPayload)new SavedDataSyncMessage(1, this), new CustomPacketPayload[0]); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\vars\WorldVariables.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */