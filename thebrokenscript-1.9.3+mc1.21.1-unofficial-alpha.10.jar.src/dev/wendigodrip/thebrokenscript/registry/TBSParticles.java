/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.client.particle.EyesParticle;
/*    */ import dev.wendigodrip.thebrokenscript.client.particle.NullParticleParticle;
/*    */ import dev.wendigodrip.thebrokenscript.client.particle.WretchedParticleParticle;
/*    */ import net.minecraft.client.particle.ParticleProvider;
/*    */ import net.minecraft.client.particle.SpriteSet;
/*    */ import net.minecraft.core.particles.ParticleType;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber(value = {Dist.CLIENT}, bus = EventBusSubscriber.Bus.MOD)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSParticles;", "", "<init>", "()V", "registerParticles", "", "event", "Lnet/neoforged/neoforge/client/event/RegisterParticleProvidersEvent;", "thebrokenscript"})
/*    */ public final class TBSParticles {
/*    */   @SubscribeEvent
/* 17 */   public final void registerParticles(@NotNull RegisterParticleProvidersEvent event) { Intrinsics.checkNotNullParameter(event, "event"); event.registerSpriteSet(
/* 18 */         (ParticleType)TBSParticleTypes.NULL_PARTICLE.get(), 
/* 19 */         TBSParticles::registerParticles$lambda$0);
/* 20 */     event.registerSpriteSet(
/* 21 */         (ParticleType)TBSParticleTypes.EYES.get(), 
/* 22 */         TBSParticles::registerParticles$lambda$1);
/* 23 */     event.registerSpriteSet(
/* 24 */         (ParticleType)TBSParticleTypes.INSTANCE.getWRETCHED_PARTICLE().get(), 
/* 25 */         TBSParticles::registerParticles$lambda$2);
/* 26 */     event.registerSpriteSet(
/* 27 */         (ParticleType)TBSParticleTypes.PARTICLE_OF_CURVED.get(), 
/* 28 */         TBSParticles::registerParticles$lambda$3); } @NotNull public static final TBSParticles INSTANCE = new TBSParticles(); private static final ParticleProvider registerParticles$lambda$0(SpriteSet spriteSet) { return (ParticleProvider)NullParticleParticle.provider(spriteSet); } private static final ParticleProvider registerParticles$lambda$3(SpriteSet spriteSet) { return (ParticleProvider)ParticleOfCurvedParticle.provider(spriteSet); }
/*    */ 
/*    */   
/*    */   private static final ParticleProvider registerParticles$lambda$1(SpriteSet spriteSet) {
/*    */     return (ParticleProvider)EyesParticle.provider(spriteSet);
/*    */   }
/*    */   
/*    */   private static final ParticleProvider registerParticles$lambda$2(SpriteSet spriteSet) {
/*    */     return (ParticleProvider)WretchedParticleParticle.provider(spriteSet);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSParticles.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */