/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.item.JukeboxSong;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\007\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\035\020\t\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\013\020\fR\035\020\r\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\016\020\fR\035\020\017\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\020\020\f¨\006\021"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSSongs;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/minecraft/world/item/JukeboxSong;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "DISC_14", "Lnet/neoforged/neoforge/registries/DeferredHolder;", "getDISC_14", "()Lnet/neoforged/neoforge/registries/DeferredHolder;", "DISC_15_BETRAY", "getDISC_15_BETRAY", "DISC_16_YOUCANT", "getDISC_16_YOUCANT", "thebrokenscript"})
/*    */ public final class TBSSongs {
/*    */   @NotNull
/* 12 */   public static final TBSSongs INSTANCE = new TBSSongs(); @NotNull private static final DeferredRegister<JukeboxSong> REGISTRY = DeferredRegister.create(
/* 13 */       Registries.JUKEBOX_SONG, 
/* 14 */       "thebrokenscript"); static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create(Registries.JUKEBOX_SONG, "thebrokenscript"), "create(...)"); }
/*    */   @NotNull
/*    */   public final DeferredRegister<JukeboxSong> getREGISTRY() { return REGISTRY; } @NotNull
/* 17 */   private static final DeferredHolder<JukeboxSong, JukeboxSong> DISC_14 = REGISTRY.register(
/* 18 */       "record14", TBSSongs::DISC_14$lambda$0); @NotNull public final DeferredHolder<JukeboxSong, JukeboxSong> getDISC_14() { return DISC_14; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("record14", TBSSongs::DISC_14$lambda$0), "register(...)"); } private static final JukeboxSong DISC_14$lambda$0() {
/* 19 */     return new JukeboxSong(
/* 20 */         TBSSounds.INSTANCE.getRECORD14().getDelegate(), 
/* 21 */         (Component)Component.translatable("subtitles.record14"), 
/* 22 */         61.0F, 
/* 23 */         16);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/* 28 */   private static final DeferredHolder<JukeboxSong, JukeboxSong> DISC_15_BETRAY = REGISTRY.register(
/* 29 */       "disc15.betray", TBSSongs::DISC_15_BETRAY$lambda$1); @NotNull public final DeferredHolder<JukeboxSong, JukeboxSong> getDISC_15_BETRAY() { return DISC_15_BETRAY; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("disc15.betray", TBSSongs::DISC_15_BETRAY$lambda$1), "register(...)"); } private static final JukeboxSong DISC_15_BETRAY$lambda$1() {
/* 30 */     return new JukeboxSong(
/* 31 */         TBSSounds.INSTANCE.getDISC15_BETRAY().getDelegate(), 
/* 32 */         (Component)Component.translatable("subtitles.disc15.betray"), 
/* 33 */         78.0F, 
/* 34 */         16);
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/* 39 */   private static final DeferredHolder<JukeboxSong, JukeboxSong> DISC_16_YOUCANT = REGISTRY.register(
/* 40 */       "disc16.youcant", TBSSongs::DISC_16_YOUCANT$lambda$2); @NotNull public final DeferredHolder<JukeboxSong, JukeboxSong> getDISC_16_YOUCANT() { return DISC_16_YOUCANT; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("disc16.youcant", TBSSongs::DISC_16_YOUCANT$lambda$2), "register(...)"); } private static final JukeboxSong DISC_16_YOUCANT$lambda$2() {
/* 41 */     return new JukeboxSong(
/* 42 */         TBSSounds.INSTANCE.getDISC16_YOUCANT().getDelegate(), 
/* 43 */         (Component)Component.translatable("subtitles.disc16.youcant"), 
/* 44 */         98.0F, 
/* 45 */         16);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSSongs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */