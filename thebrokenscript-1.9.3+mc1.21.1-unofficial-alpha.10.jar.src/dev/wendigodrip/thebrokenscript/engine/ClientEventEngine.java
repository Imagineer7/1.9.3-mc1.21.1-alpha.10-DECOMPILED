/*    */ package dev.wendigodrip.thebrokenscript.engine;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.random.Random;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.neoforged.neoforge.event.tick.ServerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber({Dist.CLIENT})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/engine/ClientEventEngine;", "", "<init>", "()V", "onServerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/ServerTickEvent$Post;", "thebrokenscript"})
/*    */ public final class ClientEventEngine {
/*    */   @SubscribeEvent
/*    */   public final void onServerTick(@NotNull ServerTickEvent.Post event) {
/* 13 */     Intrinsics.checkNotNullParameter(event, "event"); if (Minecraft.getInstance().getConnection() == null || !Minecraft.getInstance().isLocalServer())
/* 14 */       return;  if (event.getServer().getPlayerList().getPlayers().isEmpty())
/*    */       return; 
/* 16 */     Intrinsics.checkNotNullExpressionValue(event.getServer().getPlayerList().getPlayers(), "getPlayers(...)"); ServerPlayer player = (ServerPlayer)CollectionsKt.random(event.getServer().getPlayerList().getPlayers(), (Random)Random.Default);
/*    */ 
/*    */     
/* 19 */     Intrinsics.checkNotNullExpressionValue(player.serverLevel(), "serverLevel(...)"); EventEngine.INSTANCE.execute((LevelAccessor)player.serverLevel(), player.getX(), player.getY(), player.getZ(), (Entity)player);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final ClientEventEngine INSTANCE = new ClientEventEngine();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\engine\ClientEventEngine.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */