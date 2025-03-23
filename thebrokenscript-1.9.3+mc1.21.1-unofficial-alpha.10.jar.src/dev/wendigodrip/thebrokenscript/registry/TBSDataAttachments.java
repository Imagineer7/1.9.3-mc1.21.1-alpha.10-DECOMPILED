/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import dev.wendigodrip.thebrokenscript.vars.PlayerVariables;
/*    */ import net.neoforged.neoforge.attachment.AttachmentType;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ import net.neoforged.neoforge.registries.NeoForgeRegistries;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\033\020\004\032\f\022\b\022\006\022\002\b\0030\0060\005¢\006\b\n\000\032\004\b\007\020\bR\034\020\t\032\016\022\n\022\b\022\004\022\0020\0130\0060\n8\006X\004¢\006\002\n\000¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSDataAttachments;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/neoforged/neoforge/attachment/AttachmentType;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "PLAYER_VARIABLES", "Ljava/util/function/Supplier;", "Ldev/wendigodrip/thebrokenscript/vars/PlayerVariables;", "thebrokenscript"})
/*    */ public final class TBSDataAttachments {
/*    */   @NotNull
/* 11 */   public static final TBSDataAttachments INSTANCE = new TBSDataAttachments(); @NotNull private static final DeferredRegister<AttachmentType<?>> REGISTRY = DeferredRegister.create(
/* 12 */       NeoForgeRegistries.ATTACHMENT_TYPES, 
/* 13 */       "thebrokenscript"); static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create(NeoForgeRegistries.ATTACHMENT_TYPES, "thebrokenscript"), "create(...)"); }
/*    */   @NotNull
/*    */   public final DeferredRegister<AttachmentType<?>> getREGISTRY() { return REGISTRY; } @JvmField
/*    */   @NotNull
/* 17 */   public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = (Supplier<AttachmentType<PlayerVariables>>)REGISTRY.register(
/* 18 */       "player_vars", 
/* 19 */       TBSDataAttachments::PLAYER_VARIABLES$lambda$1); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("player_vars", TBSDataAttachments::PLAYER_VARIABLES$lambda$1), "register(...)"); }
/*    */    private static final PlayerVariables PLAYER_VARIABLES$lambda$1$lambda$0() {
/* 21 */     return new PlayerVariables();
/*    */   } private static final AttachmentType PLAYER_VARIABLES$lambda$1() {
/* 23 */     return AttachmentType.serializable(TBSDataAttachments::PLAYER_VARIABLES$lambda$1$lambda$0).copyOnDeath().build();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSDataAttachments.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */