/*    */ package dev.wendigodrip.thebrokenscript.world.dimension;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.renderer.DimensionSpecialEffects;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.neoforged.api.distmarker.Dist;
/*    */ import net.neoforged.api.distmarker.OnlyIn;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.client.event.RegisterDimensionSpecialEffectsEvent;
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
/*    */ @EventBusSubscriber(value = {Dist.CLIENT}, bus = EventBusSubscriber.Bus.MOD)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/world/dimension/NullTortureDimension$NullTortureSpecialEffectsHandler;", "", "<init>", "()V", "registerDimensionSpecialEffects", "", "event", "Lnet/neoforged/neoforge/client/event/RegisterDimensionSpecialEffectsEvent;", "thebrokenscript"})
/*    */ public final class NullTortureSpecialEffectsHandler
/*    */ {
/*    */   @NotNull
/*    */   public static final NullTortureSpecialEffectsHandler INSTANCE = new NullTortureSpecialEffectsHandler();
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\002*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\006H\026J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nH\026¨\006\f"}, d2 = {"dev/wendigodrip/thebrokenscript/world/dimension/NullTortureDimension$NullTortureSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1", "Lnet/minecraft/client/renderer/DimensionSpecialEffects;", "getBrightnessDependentFogColor", "Lnet/minecraft/world/phys/Vec3;", "color", "sunHeight", "", "isFoggyAt", "", "x", "", "y", "thebrokenscript"})
/*    */   public static final class NullTortureDimension$NullTortureSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1
/*    */     extends DimensionSpecialEffects
/*    */   {
/*    */     NullTortureDimension$NullTortureSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1(DimensionSpecialEffects.SkyType $super_call_param$1) {
/* 45 */       super(
/* 46 */           Float.NaN, true, $super_call_param$1, false, false);
/*    */     }
/*    */     public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
/* 49 */       Intrinsics.checkNotNullParameter(color, "color"); return new Vec3(0.0D, 0.0D, 0.0D);
/*    */     }
/*    */     
/*    */     public boolean isFoggyAt(int x, int y) {
/* 53 */       return true; } } @SubscribeEvent @OnlyIn(Dist.CLIENT) public final void registerDimensionSpecialEffects(@NotNull RegisterDimensionSpecialEffectsEvent event) { Intrinsics.checkNotNullParameter(event, "event");
/*    */     DimensionSpecialEffects.SkyType skyType = DimensionSpecialEffects.SkyType.END;
/*    */     DimensionSpecialEffects customEffect = new NullTortureDimension$NullTortureSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1(skyType);
/* 56 */     event.register(TBSConstants.id("null_torture"), customEffect); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\world\dimension\NullTortureDimension$NullTortureSpecialEffectsHandler.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */