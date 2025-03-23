/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.particles.ParticleType;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\006\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\033\020\004\032\f\022\b\022\006\022\002\b\0030\0060\005¢\006\b\n\000\032\004\b\007\020\bR \020\t\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\0130\n8\006X\004¢\006\002\n\000R \020\f\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\0130\n8\006X\004¢\006\002\n\000R!\020\r\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\0130\n¢\006\b\n\000\032\004\b\016\020\017R \020\020\032\022\022\b\022\006\022\002\b\0030\006\022\004\022\0020\0130\n8\006X\004¢\006\002\n\000¨\006\021"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSParticleTypes;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/minecraft/core/particles/ParticleType;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "NULL_PARTICLE", "Lnet/neoforged/neoforge/registries/DeferredHolder;", "Lnet/minecraft/core/particles/SimpleParticleType;", "EYES", "WRETCHED_PARTICLE", "getWRETCHED_PARTICLE", "()Lnet/neoforged/neoforge/registries/DeferredHolder;", "PARTICLE_OF_CURVED", "thebrokenscript"})
/*    */ public final class TBSParticleTypes {
/*    */   @NotNull
/* 12 */   public static final TBSParticleTypes INSTANCE = new TBSParticleTypes(); @NotNull private static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(
/* 13 */       BuiltInRegistries.PARTICLE_TYPE, 
/* 14 */       "thebrokenscript"); static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, "thebrokenscript"), "create(...)"); }
/*    */   @NotNull
/*    */   public final DeferredRegister<ParticleType<?>> getREGISTRY() { return REGISTRY; } @JvmField
/*    */   @NotNull
/* 18 */   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> NULL_PARTICLE = REGISTRY.register(
/* 19 */       "null_particle", 
/* 20 */       TBSParticleTypes::NULL_PARTICLE$lambda$0); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("null_particle", TBSParticleTypes::NULL_PARTICLE$lambda$0), "register(...)"); } private static final SimpleParticleType NULL_PARTICLE$lambda$0() { return new SimpleParticleType(true); }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 24 */   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> EYES = REGISTRY.register(
/* 25 */       "eyes", 
/* 26 */       TBSParticleTypes::EYES$lambda$1); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("eyes", TBSParticleTypes::EYES$lambda$1), "register(...)"); } private static final SimpleParticleType EYES$lambda$1() { return new SimpleParticleType(true); }
/*    */    @NotNull
/* 28 */   private static final DeferredHolder<ParticleType<?>, SimpleParticleType> WRETCHED_PARTICLE = REGISTRY.register(
/* 29 */       "wretched_particle", 
/* 30 */       TBSParticleTypes::WRETCHED_PARTICLE$lambda$2); @NotNull public final DeferredHolder<ParticleType<?>, SimpleParticleType> getWRETCHED_PARTICLE() { return WRETCHED_PARTICLE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("wretched_particle", TBSParticleTypes::WRETCHED_PARTICLE$lambda$2), "register(...)"); } private static final SimpleParticleType WRETCHED_PARTICLE$lambda$2() { return new SimpleParticleType(false); }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 34 */   public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PARTICLE_OF_CURVED = REGISTRY.register(
/* 35 */       "particle_of_curved", 
/* 36 */       TBSParticleTypes::PARTICLE_OF_CURVED$lambda$3); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("particle_of_curved", TBSParticleTypes::PARTICLE_OF_CURVED$lambda$3), "register(...)"); } private static final SimpleParticleType PARTICLE_OF_CURVED$lambda$3() { return new SimpleParticleType(true); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSParticleTypes.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */