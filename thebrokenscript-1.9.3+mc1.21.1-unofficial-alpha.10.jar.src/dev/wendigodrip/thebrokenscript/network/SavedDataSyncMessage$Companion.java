/*    */ package dev.wendigodrip.thebrokenscript.network;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import dev.wendigodrip.thebrokenscript.vars.WorldVariables;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.HolderLookup;
/*    */ import net.minecraft.nbt.CompoundTag;
/*    */ import net.minecraft.nbt.Tag;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.neoforged.neoforge.network.handling.IPayloadContext;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\t\032\0020\n2\006\020\t\032\0020\0132\006\020\f\032\0020\006J\026\020\r\032\0020\n2\006\020\f\032\0020\0062\006\020\016\032\0020\017R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/network/SavedDataSyncMessage$Companion;", "", "<init>", "()V", "TYPE", "Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", "Ldev/wendigodrip/thebrokenscript/network/SavedDataSyncMessage;", "getTYPE", "()Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", "buffer", "", "Lnet/minecraft/network/FriendlyByteBuf;", "message", "handler", "context", "Lnet/neoforged/neoforge/network/handling/IPayloadContext;", "thebrokenscript"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final CustomPacketPayload.Type<SavedDataSyncMessage> getTYPE() {
/* 44 */     return SavedDataSyncMessage.access$getTYPE$cp();
/*    */   }
/*    */   
/*    */   public final void buffer(@NotNull FriendlyByteBuf buffer, @NotNull SavedDataSyncMessage message) {
/* 48 */     Intrinsics.checkNotNullParameter(buffer, "buffer"); Intrinsics.checkNotNullParameter(message, "message"); buffer.writeInt(SavedDataSyncMessage.access$getType$p(message));
/*    */     
/* 50 */     if (SavedDataSyncMessage.access$getData$p(message) != null) {
/*    */ 
/*    */       
/* 53 */       Intrinsics.checkNotNull(SavedDataSyncMessage.access$getData$p(message)); buffer.writeNbt((Tag)SavedDataSyncMessage.access$getData$p(message).save(
/* 54 */             new CompoundTag(), HolderLookup.Provider.create(CollectionsKt.emptyList().stream())));
/*    */     } 
/*    */   }
/*    */   public final void handler(@NotNull SavedDataSyncMessage message, @NotNull IPayloadContext context) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'message'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'context'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_2
/*    */     //   13: aload_2
/*    */     //   14: aload_1
/*    */     //   15: <illegal opcode> run : (Lnet/neoforged/neoforge/network/handling/IPayloadContext;Ldev/wendigodrip/thebrokenscript/network/SavedDataSyncMessage;)Ljava/lang/Runnable;
/*    */     //   20: invokeinterface enqueueWork : (Ljava/lang/Runnable;)Ljava/util/concurrent/CompletableFuture;
/*    */     //   25: pop
/*    */     //   26: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #61	-> 12
/*    */     //   #70	-> 26
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	27	0	this	Ldev/wendigodrip/thebrokenscript/network/SavedDataSyncMessage$Companion;
/*    */     //   0	27	1	message	Ldev/wendigodrip/thebrokenscript/network/SavedDataSyncMessage;
/*    */     //   0	27	2	context	Lnet/neoforged/neoforge/network/handling/IPayloadContext;
/*    */   }
/*    */   
/*    */   private static final void handler$lambda$0(IPayloadContext $context, SavedDataSyncMessage $message) {
/* 62 */     if (!$context.flow().getReceptionSide().isServer() && SavedDataSyncMessage.access$getData$p($message) != null)
/* 63 */       if (SavedDataSyncMessage.access$getType$p($message) == 0) {
/* 64 */         Intrinsics.checkNotNull(SavedDataSyncMessage.access$getData$p($message), "null cannot be cast to non-null type dev.wendigodrip.thebrokenscript.vars.MapVariables"); MapVariables.Companion.setClientVariables((MapVariables)SavedDataSyncMessage.access$getData$p($message));
/*    */       } else {
/* 66 */         Intrinsics.checkNotNull(SavedDataSyncMessage.access$getData$p($message), "null cannot be cast to non-null type dev.wendigodrip.thebrokenscript.vars.WorldVariables"); WorldVariables.clientSide = (WorldVariables)SavedDataSyncMessage.access$getData$p($message);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\network\SavedDataSyncMessage$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */