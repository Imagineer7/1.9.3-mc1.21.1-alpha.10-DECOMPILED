/*    */ package dev.wendigodrip.thebrokenscript.procedures.circuit;
/*    */ import com.mojang.blaze3d.platform.Window;
/*    */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*    */ import dev.wendigodrip.thebrokenscript.entity.CircuitEntity;
/*    */ import dev.wendigodrip.thebrokenscript.util.EntityFinder;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.lwjgl.glfw.GLFW;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J(\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\017"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/circuit/WindowShakeProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "thebrokenscript"})
/*    */ public final class WindowShakeProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 19 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((LevelAccessor)event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
/*    */   } @NotNull
/*    */   public static final WindowShakeProcedure INSTANCE = new WindowShakeProcedure();
/*    */   private final void execute(LevelAccessor world, double x, double y, double z) {
/* 23 */     ((world instanceof net.minecraft.world.level.Level) ? world : null).tickRateManager(); if ((((world instanceof net.minecraft.world.level.Level) ? world : null) != null && ((world instanceof net.minecraft.world.level.Level) ? world : null).tickRateManager() != null) ? ((((world instanceof net.minecraft.world.level.Level) ? world : null).tickRateManager().isFrozen() == true)) : false) {
/*    */       return;
/*    */     }
/* 26 */     if (!EntityFinder.INSTANCE.findEntitiesInRange(world, CircuitEntity.class, new Vec3(x, y, z), 400.0D).isEmpty()) { TBSConfigs.INSTANCE.getCLIENT(); if ((TBSConfigs.INSTANCE.getCLIENT() != null) ? ((TBSConfigs.INSTANCE.getCLIENT().getEnableWindowShake() == true)) : false)
/*    */       {
/* 28 */         if (Math.random() < 0.7D) {
/* 29 */           Window minecraftWindow = Minecraft.getInstance().getWindow();
/* 30 */           long windowHandle = minecraftWindow.getWindow();
/* 31 */           int xCoord = 50;
/* 32 */           int yCoord = 40;
/*    */           
/* 34 */           GLFW.glfwSetWindowPos(windowHandle, xCoord, yCoord);
/*    */         } else {
/* 36 */           Window minecraftWindow = Minecraft.getInstance().getWindow();
/* 37 */           long windowHandle = minecraftWindow.getWindow();
/* 38 */           int xCoord = -50;
/* 39 */           int yCoord = -40;
/*    */           
/* 41 */           GLFW.glfwSetWindowPos(windowHandle, xCoord, yCoord);
/*    */         } 
/*    */       } }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\circuit\WindowShakeProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */