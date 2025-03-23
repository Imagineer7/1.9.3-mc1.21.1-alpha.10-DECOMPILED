/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Point;
/*    */ import java.awt.Toolkit;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.InputStream;
/*    */ import javax.imageio.ImageIO;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.border.EmptyBorder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\020\021\n\002\020\016\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\033\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\007H\007¢\006\002\020\t¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/AlertWindowInner;", "", "<init>", "()V", "main", "", "args", "", "", "([Ljava/lang/String;)V", "thebrokenscript"})
/*    */ public final class AlertWindowInner {
/*    */   @JvmStatic
/*    */   public static final void main(@NotNull String[] args) {
/* 17 */     Intrinsics.checkNotNullParameter(args, "args"); String title = args[0];
/* 18 */     String message = args[1];
/*    */     
/* 20 */     InputStream iconStream = INSTANCE.getClass().getClassLoader().getResourceAsStream("lwjgl.png");
/* 21 */     BufferedImage icon = ImageIO.read(iconStream);
/*    */     
/* 23 */     JFrame win = new JFrame(title);
/* 24 */     int width = 300;
/* 25 */     int height = 75;
/* 26 */     Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
/* 27 */     int windowX = screen.width / 2 - width / 2;
/* 28 */     int windowY = screen.height / 2 - height / 2;
/*    */     
/* 30 */     win.setVisible(false);
/* 31 */     win.setMinimumSize(new Dimension(width, height));
/* 32 */     win.setLocationByPlatform(true);
/* 33 */     win.setDefaultCloseOperation(3);
/* 34 */     win.setResizable(false);
/* 35 */     win.setLocation(new Point(windowX, windowY));
/* 36 */     win.setIconImage(icon);
/*    */     
/* 38 */     JLabel text = new JLabel(message);
/*    */     
/* 40 */     text.setFont(text.getFont().deriveFont(text.getFont().getSize() * 1.25F));
/* 41 */     text.setHorizontalAlignment(2);
/* 42 */     text.setBorder(new EmptyBorder(10, 10, 10, 10));
/* 43 */     win.getContentPane().add(text, "Center");
/*    */     
/* 45 */     win.pack();
/* 46 */     win.setVisible(true);
/* 47 */     win.requestFocus();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final AlertWindowInner INSTANCE = new AlertWindowInner();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\AlertWindowInner.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */