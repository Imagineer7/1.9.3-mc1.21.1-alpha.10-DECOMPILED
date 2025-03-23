/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\004\n\002\020\002\n\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\006\020\007\032\0020\bR\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\003X\004¢\006\002\n\000¨\006\t"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/AlertWindow;", "", "title", "", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "show", "", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nAlertWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertWindow.kt\ndev/wendigodrip/thebrokenscript/misc/AlertWindow\n+ 2 Forge.kt\nthedarkcolour/kotlinforforge/neoforge/forge/ForgeKt\n*L\n1#1,48:1\n37#2:49\n*S KotlinDebug\n*F\n+ 1 AlertWindow.kt\ndev/wendigodrip/thebrokenscript/misc/AlertWindow\n*L\n12#1:49\n*E\n"})
/*    */ public final class AlertWindow {
/*    */   @NotNull
/*    */   private final String title;
/*    */   
/* 10 */   public AlertWindow(@NotNull String title, @NotNull String message) { this.title = title; this.message = message; } @NotNull
/*    */   private final String message; public final void show() {
/* 12 */     int $i$f$getDIST = 0;
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
/* 49 */     Intrinsics.checkNotNullExpressionValue(FMLEnvironment.dist, "dist"); if (!FMLEnvironment.dist.isClient())
/*    */       return; 
/*    */     Intrinsics.checkNotNullExpressionValue(System.getProperty("os.name"), "getProperty(...)");
/*    */     String str = System.getProperty("os.name");
/*    */     Intrinsics.checkNotNullExpressionValue(Locale.getDefault(), "getDefault(...)");
/*    */     Intrinsics.checkNotNullExpressionValue(str.toLowerCase(Locale.getDefault()), "toLowerCase(...)");
/*    */     if (!StringsKt.contains$default(str.toLowerCase(Locale.getDefault()), "mac", false, 2, null)) {
/*    */       String[] arrayOfString1 = new String[1];
/*    */       arrayOfString1[0] = "bin";
/*    */       Path javaBinDir = Paths.get(System.getProperty("java.home"), arrayOfString1).normalize();
/*    */       String[] arrayOfString2 = new String[3];
/*    */       arrayOfString2[0] = "javaw.exe";
/*    */       arrayOfString2[1] = "java.exe";
/*    */       arrayOfString2[2] = "java";
/*    */       String[] executables = arrayOfString2;
/*    */       Path javaPath = null;
/*    */       byte b;
/*    */       int i;
/*    */       for (b = 0, i = executables.length; b < i; ) {
/*    */         String executable = executables[b];
/*    */         Path path = javaBinDir.resolve(executable);
/*    */         if (Files.isRegularFile(path, new java.nio.file.LinkOption[0])) {
/*    */           javaPath = path;
/*    */           break;
/*    */         } 
/*    */         b++;
/*    */       } 
/*    */       if (javaPath == null)
/*    */         throw new RuntimeException("Can't find java executable in " + javaBinDir); 
/*    */       try {
/*    */         String[] arrayOfString = new String[7];
/*    */         arrayOfString[0] = javaPath.toString();
/*    */         arrayOfString[1] = "-Xmx100M";
/*    */         arrayOfString[2] = "-cp";
/*    */         arrayOfString[3] = System.getProperty("java.class.path");
/*    */         arrayOfString[4] = AlertWindowInner.class.getName();
/*    */         arrayOfString[5] = this.title;
/*    */         arrayOfString[6] = this.message;
/*    */         Process process = (new ProcessBuilder(arrayOfString)).redirectOutput(ProcessBuilder.Redirect.INHERIT).redirectError(ProcessBuilder.Redirect.INHERIT).start();
/*    */       } catch (IOException e) {
/*    */         throw new RuntimeException((Throwable)e);
/*    */       } 
/*    */     } else {
/*    */       throw new RuntimeException(this.title + ": " + this.title);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\AlertWindow.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */