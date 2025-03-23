/*    */ package dev.wendigodrip.thebrokenscript.config;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import me.fzzyhmstrs.fzzy_config.annotations.ClientModifiable;
/*    */ import me.fzzyhmstrs.fzzy_config.annotations.Comment;
/*    */ import me.fzzyhmstrs.fzzy_config.annotations.NonSync;
/*    */ 
/*    */ @Version(version = 1)
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\016\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003R$\020\004\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b\006\020\003\032\004\b\007\020\b\"\004\b\t\020\nR$\020\013\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b\f\020\003\032\004\b\r\020\b\"\004\b\016\020\nR$\020\017\032\0020\0058\006@\006X\016¢\006\024\n\000\022\004\b\020\020\003\032\004\b\021\020\b\"\004\b\022\020\n¨\006\023"}, d2 = {"Ldev/wendigodrip/thebrokenscript/config/ClientConfig;", "Lme/fzzyhmstrs/fzzy_config/config/Config;", "<init>", "()V", "disableCrashes", "", "getDisableCrashes$annotations", "getDisableCrashes", "()Z", "setDisableCrashes", "(Z)V", "enableWindowShake", "getEnableWindowShake$annotations", "getEnableWindowShake", "setEnableWindowShake", "enableVhsOverlay", "getEnableVhsOverlay$annotations", "getEnableVhsOverlay", "setEnableVhsOverlay", "thebrokenscript"})
/*    */ public final class ClientConfig extends Config {
/*    */   public ClientConfig() {
/* 11 */     super(TBSConstants.id("client_config"), null, null, null, 14, null);
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 20 */     this.enableWindowShake = true;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     this.enableVhsOverlay = true;
/*    */   }
/*    */   
/*    */   private boolean disableCrashes;
/*    */   private boolean enableWindowShake;
/*    */   private boolean enableVhsOverlay;
/*    */   
/*    */   public final boolean getDisableCrashes() {
/*    */     return this.disableCrashes;
/*    */   }
/*    */   
/*    */   public final void setDisableCrashes(boolean <set-?>) {
/*    */     this.disableCrashes = <set-?>;
/*    */   }
/*    */   
/*    */   public final boolean getEnableWindowShake() {
/*    */     return this.enableWindowShake;
/*    */   }
/*    */   
/*    */   public final void setEnableWindowShake(boolean <set-?>) {
/*    */     this.enableWindowShake = <set-?>;
/*    */   }
/*    */   
/*    */   public final boolean getEnableVhsOverlay() {
/*    */     return this.enableVhsOverlay;
/*    */   }
/*    */   
/*    */   public final void setEnableVhsOverlay(boolean <set-?>) {
/*    */     this.enableVhsOverlay = <set-?>;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\config\ClientConfig.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */