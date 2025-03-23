/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\035\020\t\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\013\020\f¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSEffects;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/minecraft/world/effect/MobEffect;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "WHY_CANT_YOU_LEAVE", "Lnet/neoforged/neoforge/registries/DeferredHolder;", "getWHY_CANT_YOU_LEAVE", "()Lnet/neoforged/neoforge/registries/DeferredHolder;", "thebrokenscript"})
/*    */ public final class TBSEffects {
/*    */   @NotNull
/* 12 */   public static final TBSEffects INSTANCE = new TBSEffects(); @NotNull private static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(
/* 13 */       BuiltInRegistries.MOB_EFFECT, 
/* 14 */       "thebrokenscript"); static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, "thebrokenscript"), "create(...)"); }
/*    */   @NotNull public final DeferredRegister<MobEffect> getREGISTRY() { return REGISTRY; } @NotNull
/* 16 */   private static final DeferredHolder<MobEffect, MobEffect> WHY_CANT_YOU_LEAVE = REGISTRY.register(
/* 17 */       "why_cant_you_leave", 
/* 18 */       TBSEffects::WHY_CANT_YOU_LEAVE$lambda$0); @NotNull public final DeferredHolder<MobEffect, MobEffect> getWHY_CANT_YOU_LEAVE() { return WHY_CANT_YOU_LEAVE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("why_cant_you_leave", TBSEffects::WHY_CANT_YOU_LEAVE$lambda$0), "register(...)"); } private static final MobEffect WHY_CANT_YOU_LEAVE$lambda$0() { return (MobEffect)new WhyCantYouLeaveMobEffect(); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSEffects.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */