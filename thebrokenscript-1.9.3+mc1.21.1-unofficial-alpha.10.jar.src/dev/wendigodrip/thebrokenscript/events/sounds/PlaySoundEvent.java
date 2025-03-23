/*    */ package dev.wendigodrip.thebrokenscript.events.sounds;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.protocol.game.ClientboundStopSoundPacket;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundEvents;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\"\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016H\026R\026\020\004\032\n\022\004\022\0020\006\030\0010\005X\016¢\006\002\n\000¨\006\017"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/sounds/PlaySoundEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "sounds", "", "Lnet/minecraft/sounds/SoundEvent;", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class PlaySoundEvent extends BaseEvent {
/*    */   public PlaySoundEvent() {
/* 13 */     super("play_sound", 1);
/*    */   } @Nullable
/*    */   private Set<? extends SoundEvent> sounds;
/*    */   public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 17 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); if (this.sounds == null) {
/* 18 */       SoundEvent[] arrayOfSoundEvent = new SoundEvent[3]; arrayOfSoundEvent[0] = (SoundEvent)SoundEvents.AMBIENT_CAVE.value(); arrayOfSoundEvent[1] = 
/* 19 */         (SoundEvent)SoundEvents.MUSIC_DISC_13.value();
/* 20 */       arrayOfSoundEvent[2] = (SoundEvent)SoundEvents.MUSIC_DISC_11.value();
/*    */       this.sounds = SetsKt.setOf((Object[])arrayOfSoundEvent);
/*    */     } 
/* 23 */     Intrinsics.checkNotNull(this.sounds); int random = Mth.nextInt(RandomSource.create(), 1, this.sounds.size() + 1);
/*    */     
/* 25 */     Intrinsics.checkNotNull(this.sounds); if (random == this.sounds.size() + 1) {
/* 26 */       onServer(PlaySoundEvent::execute$lambda$0);
/*    */ 
/*    */     
/*    */     }
/*    */     else {
/*    */ 
/*    */ 
/*    */       
/* 34 */       float pitch = Mth.nextInt(RandomSource.create(), 0, 1);
/*    */       
/* 36 */       Intrinsics.checkNotNull(this.sounds); BaseEvent.playSound$default(this, pos, (SoundEvent)CollectionsKt.elementAt(this.sounds, random - 1), 555.0F, pitch, false, 16, null);
/*    */     } 
/*    */   }
/*    */   
/*    */   private static final Unit execute$lambda$0(ServerLevel it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     ClientboundStopSoundPacket packet = new ClientboundStopSoundPacket(null, null);
/*    */     for (ServerPlayer player : it.players())
/*    */       player.connection.send((Packet)packet); 
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\sounds\PlaySoundEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */