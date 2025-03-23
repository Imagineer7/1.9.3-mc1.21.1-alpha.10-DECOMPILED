/*    */ package dev.wendigodrip.thebrokenscript.config;
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\020\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\f\032\0020\rR\034\020\004\032\004\030\0010\005X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\tR\024\020\n\032\004\030\0010\0138\006@\006X\016¢\006\002\n\000¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/config/TBSConfigs;", "", "<init>", "()V", "CLIENT", "Ldev/wendigodrip/thebrokenscript/config/ClientConfig;", "getCLIENT", "()Ldev/wendigodrip/thebrokenscript/config/ClientConfig;", "setCLIENT", "(Ldev/wendigodrip/thebrokenscript/config/ClientConfig;)V", "COMMON", "Ldev/wendigodrip/thebrokenscript/config/CommonConfig;", "register", "", "thebrokenscript"})
/*    */ public final class TBSConfigs { @NotNull
/*    */   public static final TBSConfigs INSTANCE = new TBSConfigs();
/*    */   
/*    */   @Nullable
/*  7 */   public final ClientConfig getCLIENT() { return CLIENT; } @Nullable private static ClientConfig CLIENT; @JvmField @Nullable public static CommonConfig COMMON; public final void setCLIENT(@Nullable ClientConfig <set-?>) { CLIENT = <set-?>; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public final void register() {
/* 13 */     CLIENT = (ClientConfig)ConfigApi.registerAndLoadConfig(TBSConfigs$register$1.INSTANCE, RegisterType.CLIENT);
/* 14 */     COMMON = (CommonConfig)ConfigApi.registerAndLoadConfig(TBSConfigs$register$2.INSTANCE, RegisterType.BOTH);
/*    */   } }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\config\TBSConfigs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */