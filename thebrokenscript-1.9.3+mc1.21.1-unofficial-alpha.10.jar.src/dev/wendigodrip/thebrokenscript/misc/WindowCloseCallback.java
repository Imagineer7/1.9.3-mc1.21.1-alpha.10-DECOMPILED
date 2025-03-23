/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ 
/*    */ import net.minecraft.client.Minecraft;
/*    */ import org.lwjgl.glfw.GLFW;
/*    */ 
/*    */ public class WindowCloseCallback {
/*    */   public static void init() {
/*  8 */     long window = Minecraft.getInstance().getWindow().getWindow();
/*    */     
/* 10 */     GLFW.glfwSetWindowCloseCallback(window, win -> (new AlertWindow("LWJGL Alert", "Err.<o>")).show());
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\WindowCloseCallback.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */