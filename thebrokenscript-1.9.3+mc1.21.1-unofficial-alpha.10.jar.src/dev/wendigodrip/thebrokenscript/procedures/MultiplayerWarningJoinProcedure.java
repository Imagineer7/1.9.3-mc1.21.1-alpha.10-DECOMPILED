/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.entity.player.PlayerEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J&\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fJ2\020\b\032\0020\0052\b\020\006\032\004\030\0010\0172\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/MultiplayerWarningJoinProcedure;", "", "<init>", "()V", "onPlayerLoggedIn", "", "event", "Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$PlayerLoggedInEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class MultiplayerWarningJoinProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerLoggedIn(@NotNull PlayerEvent.PlayerLoggedInEvent event) {
/* 19 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     
/* 21 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), 
/* 22 */         event.getEntity().getX(), 
/* 23 */         event.getEntity().getY(), 
/* 24 */         event.getEntity().getZ());
/*    */   }
/*    */   @NotNull
/*    */   public static final MultiplayerWarningJoinProcedure INSTANCE = new MultiplayerWarningJoinProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 29 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z) {
/* 33 */     if (world.players().size() > 1 && world instanceof ServerLevel)
/* 34 */       ((ServerLevel)world).getServer()
/* 35 */         .getCommands()
/* 36 */         .performPrefixedCommand((
/* 37 */           new CommandSourceStack(
/* 38 */             CommandSource.NULL, 
/* 39 */             new Vec3(x, y, z), 
/* 40 */             Vec2.ZERO, 
/* 41 */             (ServerLevel)world, 
/* 42 */             4, 
/* 43 */             "", 
/* 44 */             (Component)Component.literal(""), (
/* 45 */             (ServerLevel)world).getServer(), 
/* 46 */             null))
/* 47 */           .withSuppressedOutput(), 
/* 48 */           "tellraw @a \"<Integrity> It seems that you are playing in a multiplayer world. You will encounter lots of bugs.\""); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\MultiplayerWarningJoinProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */