/*    */ package dev.wendigodrip.thebrokenscript.events.nullent;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/nullent/NullTitleEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class NullTitleEvent extends BaseEvent {
/*    */   public NullTitleEvent() {
/* 11 */     super("null_title", 1);
/*    */   }
/* 13 */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) { Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); onServer(NullTitleEvent::execute$lambda$0); } private static final Unit execute$lambda$0(ServerLevel it) {
/* 14 */     Intrinsics.checkNotNullParameter(it, "it"); MutableComponent text = Component.literal("null null null null null null null null").withStyle(ChatFormatting.WHITE);
/* 15 */     ClientboundSetTitleTextPacket packet = new ClientboundSetTitleTextPacket((Component)text);
/*    */     
/* 17 */     for (ServerPlayer player : it.players()) {
/* 18 */       player.connection.send((Packet)packet);
/*    */     }
/* 20 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\nullent\NullTitleEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */