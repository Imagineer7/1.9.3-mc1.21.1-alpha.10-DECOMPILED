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
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J&\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fJ2\020\b\032\0020\0052\b\020\006\032\004\030\0010\0172\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/NoPeaceProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class NoPeaceProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 20 */     Intrinsics.checkNotNullParameter(event, "event");
/*    */     
/* 22 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), 
/* 23 */         event.getEntity().getX(), 
/* 24 */         event.getEntity().getY(), 
/* 25 */         event.getEntity().getZ());
/*    */   }
/*    */   @NotNull
/*    */   public static final NoPeaceProcedure INSTANCE = new NoPeaceProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 30 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z) {
/* 34 */     if (world.getDifficulty() == Difficulty.PEACEFUL && world instanceof ServerLevel)
/* 35 */       ((ServerLevel)world).getServer()
/* 36 */         .getCommands()
/* 37 */         .performPrefixedCommand((
/* 38 */           new CommandSourceStack(
/* 39 */             CommandSource.NULL, 
/* 40 */             new Vec3(x, y, z), 
/* 41 */             Vec2.ZERO, 
/* 42 */             (ServerLevel)world, 
/* 43 */             4, 
/* 44 */             "", 
/* 45 */             (Component)Component.literal(""), (
/* 46 */             (ServerLevel)world).getServer(), 
/* 47 */             null))
/* 48 */           .withSuppressedOutput(), "difficulty easy"); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\NoPeaceProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */