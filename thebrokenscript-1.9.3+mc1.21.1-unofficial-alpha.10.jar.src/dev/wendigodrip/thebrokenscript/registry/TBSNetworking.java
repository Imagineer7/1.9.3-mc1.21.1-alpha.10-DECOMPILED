/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import dev.wendigodrip.thebrokenscript.network.DevPassButtonMessage;
/*    */ import dev.wendigodrip.thebrokenscript.network.PcGuiButtonMessage;
/*    */ import dev.wendigodrip.thebrokenscript.network.PlayerVariablesSyncMessage;
/*    */ import dev.wendigodrip.thebrokenscript.network.SavedDataSyncMessage;
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Function;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.network.RegistryFriendlyByteBuf;
/*    */ import net.minecraft.network.codec.StreamCodec;
/*    */ import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
/*    */ import net.neoforged.neoforge.network.handling.IPayloadContext;
/*    */ import net.neoforged.neoforge.network.handling.IPayloadHandler;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber(modid = "thebrokenscript", bus = EventBusSubscriber.Bus.MOD)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\006\032\0020\0072\006\020\b\032\0020\tH\007JV\020\006\032\0020\007\"\b\b\000\020\n*\0020\0132\f\020\f\032\b\022\004\022\002H\n0\r2\022\020\016\032\016\022\004\022\0020\020\022\004\022\002H\n0\0172\022\020\021\032\016\022\004\022\0020\020\022\004\022\002H\n0\0222\f\020\023\032\b\022\004\022\002H\n0\024H\002J\b\020\025\032\0020\007H\002R\020\020\004\032\004\030\0010\005X\016¢\006\002\n\000¨\006\026"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSNetworking;", "", "<init>", "()V", "registrar", "Lnet/neoforged/neoforge/network/registration/PayloadRegistrar;", "register", "", "event", "Lnet/neoforged/neoforge/network/event/RegisterPayloadHandlersEvent;", "T", "Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload;", "type", "Lnet/minecraft/network/protocol/common/custom/CustomPacketPayload$Type;", "encoder", "Ljava/util/function/BiConsumer;", "Lnet/minecraft/network/FriendlyByteBuf;", "decoder", "Ljava/util/function/Function;", "handler", "Lnet/neoforged/neoforge/network/handling/IPayloadHandler;", "bootstrap", "thebrokenscript"})
/*    */ public final class TBSNetworking {
/*    */   @NotNull
/*    */   public static final TBSNetworking INSTANCE = new TBSNetworking();
/*    */   
/*    */   @SubscribeEvent
/*    */   public final void register(@NotNull RegisterPayloadHandlersEvent event) {
/* 27 */     Intrinsics.checkNotNullParameter(event, "event"); registrar = event.registrar("1");
/* 28 */     bootstrap();
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   private static PayloadRegistrar registrar;
/*    */ 
/*    */   
/*    */   private final <T extends CustomPacketPayload> void register(CustomPacketPayload.Type type, BiConsumer encoder, Function decoder, IPayloadHandler handler) {
/* 37 */     if (registrar != null) { registrar.playBidirectional(
/* 38 */           type, StreamCodec.of(encoder::register$lambda$0, decoder::register$lambda$1), 
/*    */           
/* 40 */           handler); } else {  }  } private static final CustomPacketPayload register$lambda$1(Function<RegistryFriendlyByteBuf, CustomPacketPayload> $decoder, RegistryFriendlyByteBuf t) { Intrinsics.checkNotNullParameter(t, "t"); return $decoder.apply(t); }
/*    */    private static final void register$lambda$0(BiConsumer<RegistryFriendlyByteBuf, CustomPacketPayload> $encoder, RegistryFriendlyByteBuf t, CustomPacketPayload u) {
/*    */     Intrinsics.checkNotNullParameter(t, "t");
/*    */     Intrinsics.checkNotNullParameter(u, "u");
/*    */     $encoder.accept(t, u);
/*    */   }
/* 46 */   private final void bootstrap() { Intrinsics.checkNotNullExpressionValue(DevPassButtonMessage.TYPE, "TYPE"); register(DevPassButtonMessage.TYPE, 
/* 47 */         TBSNetworking::bootstrap$lambda$2, 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 52 */         TBSNetworking::bootstrap$lambda$3, 
/* 53 */         TBSNetworking::bootstrap$lambda$4);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 60 */     Intrinsics.checkNotNullExpressionValue(PcGuiButtonMessage.TYPE, "TYPE"); register(PcGuiButtonMessage.TYPE, 
/* 61 */         TBSNetworking::bootstrap$lambda$5, 
/* 62 */         TBSNetworking::bootstrap$lambda$6, 
/* 63 */         TBSNetworking::bootstrap$lambda$7);
/*    */ 
/*    */     
/* 66 */     Intrinsics.checkNotNullExpressionValue(PlayerVariablesSyncMessage.TYPE, "TYPE"); register(PlayerVariablesSyncMessage.TYPE, 
/* 67 */         TBSNetworking::bootstrap$lambda$8, 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 72 */         TBSNetworking::bootstrap$lambda$9, 
/* 73 */         TBSNetworking::bootstrap$lambda$10);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 79 */     register(
/* 80 */         SavedDataSyncMessage.Companion.getTYPE(), 
/* 81 */         TBSNetworking::bootstrap$lambda$11, 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 86 */         TBSNetworking::bootstrap$lambda$12, 
/* 87 */         TBSNetworking::bootstrap$lambda$13); } private static final void bootstrap$lambda$2(FriendlyByteBuf buffer, DevPassButtonMessage message) { DevPassButtonMessage.buffer(buffer, message); }
/* 88 */   private static final void bootstrap$lambda$13(SavedDataSyncMessage message, IPayloadContext context) { Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(context, "context"); SavedDataSyncMessage.Companion.handler(
/* 89 */         message, context); }
/*    */ 
/*    */   
/*    */   private static final DevPassButtonMessage bootstrap$lambda$3(FriendlyByteBuf buffer) {
/*    */     return new DevPassButtonMessage(buffer);
/*    */   }
/*    */   
/*    */   private static final void bootstrap$lambda$4(DevPassButtonMessage message, IPayloadContext context) {
/*    */     DevPassButtonMessage.handler(message, context);
/*    */   }
/*    */   
/*    */   private static final void bootstrap$lambda$5(FriendlyByteBuf buffer, PcGuiButtonMessage message) {
/*    */     PcGuiButtonMessage.buffer(buffer, message);
/*    */   }
/*    */   
/*    */   private static final PcGuiButtonMessage bootstrap$lambda$6(FriendlyByteBuf buffer) {
/*    */     return new PcGuiButtonMessage(buffer);
/*    */   }
/*    */   
/*    */   private static final void bootstrap$lambda$7(PcGuiButtonMessage message, IPayloadContext context) {
/*    */     PcGuiButtonMessage.handler(message, context);
/*    */   }
/*    */   
/*    */   private static final void bootstrap$lambda$8(FriendlyByteBuf buffer, PlayerVariablesSyncMessage message) {
/*    */     PlayerVariablesSyncMessage.buffer(buffer, message);
/*    */   }
/*    */   
/*    */   private static final PlayerVariablesSyncMessage bootstrap$lambda$9(FriendlyByteBuf buffer) {
/*    */     return new PlayerVariablesSyncMessage(buffer);
/*    */   }
/*    */   
/*    */   private static final void bootstrap$lambda$10(PlayerVariablesSyncMessage message, IPayloadContext context) {
/*    */     PlayerVariablesSyncMessage.handler(message, context);
/*    */   }
/*    */   
/*    */   private static final void bootstrap$lambda$11(FriendlyByteBuf buffer, SavedDataSyncMessage message) {
/*    */     Intrinsics.checkNotNullParameter(buffer, "buffer");
/*    */     Intrinsics.checkNotNullParameter(message, "message");
/*    */     SavedDataSyncMessage.Companion.buffer(buffer, message);
/*    */   }
/*    */   
/*    */   private static final SavedDataSyncMessage bootstrap$lambda$12(FriendlyByteBuf buffer) {
/*    */     Intrinsics.checkNotNullParameter(buffer, "buffer");
/*    */     return new SavedDataSyncMessage(buffer);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSNetworking.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */