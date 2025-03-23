/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.tick.LevelTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\020\020\b\032\0020\0052\006\020\t\032\0020\nH\002¨\006\013"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/MoonDevoidsProcedure;", "", "<init>", "()V", "onWorldTick", "", "event", "Lnet/neoforged/neoforge/event/tick/LevelTickEvent$Post;", "execute", "level", "Lnet/minecraft/world/level/LevelAccessor;", "thebrokenscript"})
/*    */ public final class MoonDevoidsProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onWorldTick(@NotNull LevelTickEvent.Post event) {
/* 17 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getLevel(), "getLevel(...)"); execute((LevelAccessor)event.getLevel());
/*    */   } @NotNull
/*    */   public static final MoonDevoidsProcedure INSTANCE = new MoonDevoidsProcedure();
/*    */   private final void execute(LevelAccessor level) {
/* 21 */     if (((MapVariables.Companion.get(level).getMoonPhase() == 1.0D)) && level.isClientSide()) {
/* 22 */       Minecraft.getInstance()
/* 23 */         .getTextureManager()
/* 24 */         .bindForSetup(TBSConstants.id("textures/moonevent/moon_phases1.png"));
/*    */       
/* 26 */       Minecraft.getInstance()
/* 27 */         .getTextureManager()
/* 28 */         .register(
/* 29 */           ResourceLocation.parse("minecraft:textures/environment/moon_phases.png"), 
/* 30 */           Minecraft.getInstance()
/* 31 */           .getTextureManager()
/* 32 */           .getTexture(TBSConstants.id("textures/moonevent/moon_phases1.png")));
/*    */     } 
/*    */ 
/*    */     
/* 36 */     if (((MapVariables.Companion.get(level).getMoonPhase() == 2.0D)) && level.isClientSide()) {
/* 37 */       Minecraft.getInstance()
/* 38 */         .getTextureManager()
/* 39 */         .bindForSetup(TBSConstants.id("textures/moonevent/moon_phases2.png"));
/*    */       
/* 41 */       Minecraft.getInstance()
/* 42 */         .getTextureManager()
/* 43 */         .register(
/* 44 */           ResourceLocation.parse("minecraft:textures/environment/moon_phases.png"), 
/* 45 */           Minecraft.getInstance()
/* 46 */           .getTextureManager()
/* 47 */           .getTexture(TBSConstants.id("textures/moonevent/moon_phases2.png")));
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\MoonDevoidsProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */