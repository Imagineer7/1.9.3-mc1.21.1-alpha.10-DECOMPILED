/*    */ package dev.wendigodrip.thebrokenscript.world.dimension;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.renderer.DimensionSpecialEffects;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.client.event.RegisterDimensionSpecialEffectsEvent;
/*    */ import net.neoforged.neoforge.event.entity.player.PlayerEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\bB\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\t"}, d2 = {"Ldev/wendigodrip/thebrokenscript/world/dimension/DayBDimension;", "", "<init>", "()V", "onPlayerChangedDimensionEvent", "", "event", "Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$PlayerChangedDimensionEvent;", "DayBSpecialEffectsHandler", "thebrokenscript"})
/*    */ public final class DayBDimension {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerChangedDimensionEvent(@NotNull PlayerEvent.PlayerChangedDimensionEvent event) {
/* 20 */     Intrinsics.checkNotNullParameter(event, "event"); Player entity = event.getEntity();
/* 21 */     Level world = entity.level();
/* 22 */     double x = entity.getX();
/* 23 */     double y = entity.getY();
/* 24 */     double z = entity.getZ();
/* 25 */     if (event.getTo() == 
/* 26 */       ResourceKey.create(
/* 27 */         Registries.DIMENSION, 
/* 28 */         TBSConstants.id("day_b"))) {
/*    */ 
/*    */       
/* 31 */       Intrinsics.checkNotNull(world); DayBPlayerEntersDimensionProcedure.INSTANCE.execute((LevelAccessor)world, x, z, (Entity)entity);
/*    */     } 
/*    */   } @NotNull
/*    */   public static final DayBDimension INSTANCE = new DayBDimension(); @EventBusSubscriber(value = {Dist.CLIENT}, bus = EventBusSubscriber.Bus.MOD)
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/world/dimension/DayBDimension$DayBSpecialEffectsHandler;", "", "<init>", "()V", "registerDimensionSpecialEffects", "", "event", "Lnet/neoforged/neoforge/client/event/RegisterDimensionSpecialEffectsEvent;", "thebrokenscript"})
/*    */   public static final class DayBSpecialEffectsHandler { @NotNull
/*    */     public static final DayBSpecialEffectsHandler INSTANCE = new DayBSpecialEffectsHandler();
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000'\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\007\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\002*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0032\006\020\005\032\0020\006H\026J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\nH\026¨\006\f"}, d2 = {"dev/wendigodrip/thebrokenscript/world/dimension/DayBDimension$DayBSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1", "Lnet/minecraft/client/renderer/DimensionSpecialEffects;", "getBrightnessDependentFogColor", "Lnet/minecraft/world/phys/Vec3;", "color", "sunHeight", "", "isFoggyAt", "", "x", "", "y", "thebrokenscript"})
/*    */     public static final class DayBDimension$DayBSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1 extends DimensionSpecialEffects { DayBDimension$DayBSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1(DimensionSpecialEffects.SkyType $super_call_param$1) {
/* 40 */         super(
/* 41 */             Float.NaN, 
/* 42 */             true, 
/* 43 */             $super_call_param$1, 
/* 44 */             false, 
/* 45 */             false);
/*    */       }
/*    */       public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
/* 48 */         Intrinsics.checkNotNullParameter(color, "color"); return new Vec3(1.0D, 1.0D, 1.0D);
/*    */       }
/*    */       
/*    */       public boolean isFoggyAt(int x, int y) {
/* 52 */         return true; } } @SubscribeEvent @OnlyIn(Dist.CLIENT) public final void registerDimensionSpecialEffects(@NotNull RegisterDimensionSpecialEffectsEvent event) { Intrinsics.checkNotNullParameter(event, "event");
/*    */       DimensionSpecialEffects.SkyType skyType = DimensionSpecialEffects.SkyType.END;
/*    */       DimensionSpecialEffects customEffect = new DayBDimension$DayBSpecialEffectsHandler$registerDimensionSpecialEffects$customEffect$1(skyType);
/* 55 */       event.register(TBSConstants.id("day_b"), customEffect); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\world\dimension\DayBDimension.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */