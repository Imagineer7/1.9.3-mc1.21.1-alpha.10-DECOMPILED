/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b9\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020C\032\016\022\004\022\0020\006\022\004\022\0020\0060\n2\022\020C\032\016\022\004\022\0020D\022\004\022\0020D0\nH\002J(\020E\032\016\022\004\022\0020\006\022\004\022\0020\0060\n2\022\020C\032\016\022\004\022\0020D\022\004\022\0020D0\nH\002R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\034\020\t\032\016\022\004\022\0020\006\022\004\022\0020\0060\n8\006X\004¢\006\002\n\000R\035\020\013\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\f\020\rR\035\020\016\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\017\020\rR\035\020\020\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\021\020\rR\035\020\022\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\023\020\rR\035\020\024\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\025\020\rR\035\020\026\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\027\020\rR\035\020\030\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\031\020\rR\035\020\032\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\033\020\rR\035\020\034\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\035\020\rR\035\020\036\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b\037\020\rR\035\020 \032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b!\020\rR\035\020\"\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b#\020\rR\035\020$\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b%\020\rR\035\020&\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b'\020\rR\035\020(\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b)\020\rR\035\020*\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b+\020\rR\035\020,\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b-\020\rR\035\020.\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b/\020\rR\035\0200\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b1\020\rR\035\0202\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b3\020\rR\034\0204\032\016\022\004\022\0020\006\022\004\022\0020\0060\n8\006X\004¢\006\002\n\000R\035\0205\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b6\020\rR\035\0207\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b8\020\rR\035\0209\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b:\020\rR\035\020;\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b<\020\rR\035\020=\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b>\020\rR\035\020?\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\b@\020\rR\035\020A\032\016\022\004\022\0020\006\022\004\022\0020\0060\n¢\006\b\n\000\032\004\bB\020\r¨\006F"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSItems;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/minecraft/world/item/Item;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "N", "Lnet/neoforged/neoforge/registries/DeferredHolder;", "ALL_DEAD", "getALL_DEAD", "()Lnet/neoforged/neoforge/registries/DeferredHolder;", "OLDBLOCK", "getOLDBLOCK", "HELLO", "getHELLO", "EMPTY", "getEMPTY", "IT", "getIT", "HELLISH_GENERATOR", "getHELLISH_GENERATOR", "EXIT", "getEXIT", "CLANBUILD_ANOMALY_GENERATOR", "getCLANBUILD_ANOMALY_GENERATOR", "RECORD_14", "getRECORD_14", "DISRUPTION", "getDISRUPTION", "PROTECTED_VOID", "getPROTECTED_VOID", "PROTECTED_VOID_STAIRS", "getPROTECTED_VOID_STAIRS", "PROTECTED_VOID_SLAB", "getPROTECTED_VOID_SLAB", "VOID_DOOR", "getVOID_DOOR", "RECORD_15", "getRECORD_15", "PROTECTED_VOID_LIGHT", "getPROTECTED_VOID_LIGHT", "CONSOLE", "getCONSOLE", "GORE", "getGORE", "FIELD_GENERATOR", "getFIELD_GENERATOR", "PHYSICAL_STACKTRACE", "getPHYSICAL_STACKTRACE", "RECORD_16", "OBSIDIAN", "getOBSIDIAN", "WHITE", "getWHITE", "VOIDEXP_GENERATOR", "getVOIDEXP_GENERATOR", "BLOCK_IS_MISSING_ID", "getBLOCK_IS_MISSING_ID", "R_3", "getR_3", "INT", "getINT", "SHADOW_BUG", "getSHADOW_BUG", "block", "Lnet/minecraft/world/level/block/Block;", "doubleBlock", "thebrokenscript"})
/*    */ public final class TBSItems {
/*    */   @NotNull
/* 15 */   public static final TBSItems INSTANCE = new TBSItems(); @NotNull private static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(
/* 16 */       (Registry)BuiltInRegistries.ITEM, 
/* 17 */       "thebrokenscript"); @NotNull public final DeferredRegister<Item> getREGISTRY() { return REGISTRY; } static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create((Registry)BuiltInRegistries.ITEM, "thebrokenscript"), "create(...)"); }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 21 */   public static final DeferredHolder<Item, Item> N = REGISTRY.register(
/* 22 */       "n", 
/* 23 */       TBSItems::N$lambda$0); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("n", TBSItems::N$lambda$0), "register(...)"); } private static final Item N$lambda$0() { return (Item)new NItem(); } @NotNull
/* 24 */   private static final DeferredHolder<Item, Item> ALL_DEAD = INSTANCE.block(TBSBlocks.INSTANCE.getALL_DEAD()); @NotNull public final DeferredHolder<Item, Item> getALL_DEAD() { return ALL_DEAD; } @NotNull
/* 25 */   private static final DeferredHolder<Item, Item> OLDBLOCK = INSTANCE.block(TBSBlocks.OLDBLOCK); @NotNull public final DeferredHolder<Item, Item> getOLDBLOCK() { return OLDBLOCK; } @NotNull
/* 26 */   private static final DeferredHolder<Item, Item> HELLO = INSTANCE.block(TBSBlocks.INSTANCE.getHELLO()); @NotNull public final DeferredHolder<Item, Item> getHELLO() { return HELLO; } @NotNull
/* 27 */   private static final DeferredHolder<Item, Item> EMPTY = INSTANCE.block(TBSBlocks.INSTANCE.getEMPTY()); @NotNull public final DeferredHolder<Item, Item> getEMPTY() { return EMPTY; } @NotNull
/* 28 */   private static final DeferredHolder<Item, Item> IT = INSTANCE.block(TBSBlocks.INSTANCE.getIT()); @NotNull public final DeferredHolder<Item, Item> getIT() { return IT; } @NotNull
/* 29 */   private static final DeferredHolder<Item, Item> HELLISH_GENERATOR = INSTANCE.block(TBSBlocks.HELLISH_GENERATOR); @NotNull public final DeferredHolder<Item, Item> getHELLISH_GENERATOR() { return HELLISH_GENERATOR; } @NotNull
/* 30 */   private static final DeferredHolder<Item, Item> EXIT = INSTANCE.block(TBSBlocks.INSTANCE.getEXIT()); @NotNull public final DeferredHolder<Item, Item> getEXIT() { return EXIT; } @NotNull
/* 31 */   private static final DeferredHolder<Item, Item> CLANBUILD_ANOMALY_GENERATOR = INSTANCE.block(
/* 32 */       TBSBlocks.INSTANCE.getCLANBUILD_ANOMALY_GENERATOR());
/*    */   @NotNull public final DeferredHolder<Item, Item> getCLANBUILD_ANOMALY_GENERATOR() { return CLANBUILD_ANOMALY_GENERATOR; } @NotNull
/* 34 */   private static final DeferredHolder<Item, Item> RECORD_14 = REGISTRY.register(
/* 35 */       "record_14", 
/* 36 */       TBSItems::RECORD_14$lambda$1); @NotNull public final DeferredHolder<Item, Item> getRECORD_14() { return RECORD_14; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("record_14", TBSItems::RECORD_14$lambda$1), "register(...)"); } private static final Item RECORD_14$lambda$1() { return (Item)new Record14Item(); } @NotNull
/* 37 */   private static final DeferredHolder<Item, Item> DISRUPTION = INSTANCE.block(TBSBlocks.DISRUPTION); @NotNull public final DeferredHolder<Item, Item> getDISRUPTION() { return DISRUPTION; } @NotNull
/* 38 */   private static final DeferredHolder<Item, Item> PROTECTED_VOID = INSTANCE.block(TBSBlocks.PROTECTED_VOID); @NotNull public final DeferredHolder<Item, Item> getPROTECTED_VOID() { return PROTECTED_VOID; } @NotNull
/* 39 */   private static final DeferredHolder<Item, Item> PROTECTED_VOID_STAIRS = INSTANCE.block(
/* 40 */       TBSBlocks.INSTANCE.getPROTECTED_VOID_STAIRS());
/*    */   @NotNull public final DeferredHolder<Item, Item> getPROTECTED_VOID_STAIRS() { return PROTECTED_VOID_STAIRS; } @NotNull
/* 42 */   private static final DeferredHolder<Item, Item> PROTECTED_VOID_SLAB = INSTANCE.block(
/* 43 */       TBSBlocks.INSTANCE.getPROTECTED_VOID_SLAB());
/*    */   @NotNull public final DeferredHolder<Item, Item> getPROTECTED_VOID_SLAB() { return PROTECTED_VOID_SLAB; } @NotNull
/* 45 */   private static final DeferredHolder<Item, Item> VOID_DOOR = INSTANCE.doubleBlock(TBSBlocks.INSTANCE.getVOID_DOOR()); @NotNull public final DeferredHolder<Item, Item> getVOID_DOOR() { return VOID_DOOR; } @NotNull
/* 46 */   private static final DeferredHolder<Item, Item> RECORD_15 = REGISTRY.register(
/* 47 */       "record_15", 
/* 48 */       TBSItems::RECORD_15$lambda$2); @NotNull public final DeferredHolder<Item, Item> getRECORD_15() { return RECORD_15; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("record_15", TBSItems::RECORD_15$lambda$2), "register(...)"); } private static final Item RECORD_15$lambda$2() { return (Item)new Record15Item(); } @NotNull
/* 49 */   private static final DeferredHolder<Item, Item> PROTECTED_VOID_LIGHT = INSTANCE.block(
/* 50 */       TBSBlocks.INSTANCE.getPROTECTED_VOID_LIGHT());
/*    */   @NotNull public final DeferredHolder<Item, Item> getPROTECTED_VOID_LIGHT() { return PROTECTED_VOID_LIGHT; } @NotNull
/* 52 */   private static final DeferredHolder<Item, Item> CONSOLE = INSTANCE.block(TBSBlocks.INSTANCE.getCONSOLE()); @NotNull public final DeferredHolder<Item, Item> getCONSOLE() { return CONSOLE; } @NotNull
/* 53 */   private static final DeferredHolder<Item, Item> GORE = REGISTRY.register(
/* 54 */       "gore", 
/* 55 */       TBSItems::GORE$lambda$3); @NotNull public final DeferredHolder<Item, Item> getGORE() { return GORE; } static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("gore", TBSItems::GORE$lambda$3), "register(...)"); } private static final Item GORE$lambda$3() { return (Item)new GoreItem(); } @NotNull
/* 56 */   private static final DeferredHolder<Item, Item> FIELD_GENERATOR = INSTANCE.block(TBSBlocks.FIELD_GENERATOR); @NotNull public final DeferredHolder<Item, Item> getFIELD_GENERATOR() { return FIELD_GENERATOR; } @NotNull
/* 57 */   private static final DeferredHolder<Item, Item> PHYSICAL_STACKTRACE = INSTANCE.block(
/* 58 */       TBSBlocks.PHYSICAL_STACKTRACE);
/*    */   @NotNull
/*    */   public final DeferredHolder<Item, Item> getPHYSICAL_STACKTRACE() { return PHYSICAL_STACKTRACE; } @JvmField
/*    */   @NotNull
/* 62 */   public static final DeferredHolder<Item, Item> RECORD_16 = REGISTRY.register(
/* 63 */       "record_16", 
/* 64 */       TBSItems::RECORD_16$lambda$4); static { Intrinsics.checkNotNullExpressionValue(REGISTRY.register("record_16", TBSItems::RECORD_16$lambda$4), "register(...)"); } private static final Item RECORD_16$lambda$4() { return (Item)new Record16Item(); } @NotNull
/* 65 */   private static final DeferredHolder<Item, Item> OBSIDIAN = INSTANCE.block(TBSBlocks.INSTANCE.getOBSIDIAN()); @NotNull public final DeferredHolder<Item, Item> getOBSIDIAN() { return OBSIDIAN; } @NotNull
/* 66 */   private static final DeferredHolder<Item, Item> WHITE = INSTANCE.block(TBSBlocks.INSTANCE.getWHITE()); @NotNull public final DeferredHolder<Item, Item> getWHITE() { return WHITE; } @NotNull
/* 67 */   private static final DeferredHolder<Item, Item> VOIDEXP_GENERATOR = INSTANCE.block(TBSBlocks.VOIDEXP_GENERATOR); @NotNull public final DeferredHolder<Item, Item> getVOIDEXP_GENERATOR() { return VOIDEXP_GENERATOR; } @NotNull
/* 68 */   private static final DeferredHolder<Item, Item> BLOCK_IS_MISSING_ID = INSTANCE.block(
/* 69 */       TBSBlocks.INSTANCE.getBLOCK_IS_MISSING_ID());
/*    */   @NotNull public final DeferredHolder<Item, Item> getBLOCK_IS_MISSING_ID() { return BLOCK_IS_MISSING_ID; } @NotNull
/* 71 */   private static final DeferredHolder<Item, Item> R_3 = INSTANCE.block(TBSBlocks.INSTANCE.getR_3()); @NotNull public final DeferredHolder<Item, Item> getR_3() { return R_3; } @NotNull
/* 72 */   private static final DeferredHolder<Item, Item> INT = INSTANCE.block(TBSBlocks.INSTANCE.getINT()); @NotNull public final DeferredHolder<Item, Item> getINT() { return INT; } @NotNull
/* 73 */   private static final DeferredHolder<Item, Item> SHADOW_BUG = INSTANCE.block(TBSBlocks.INSTANCE.getSHADOW_BUG()); @NotNull public final DeferredHolder<Item, Item> getSHADOW_BUG() { return SHADOW_BUG; }
/*    */ 
/*    */   
/* 76 */   private final DeferredHolder<Item, Item> block(DeferredHolder block) { Intrinsics.checkNotNullExpressionValue(REGISTRY.register(
/* 77 */           block.getId().getPath(), block::block$lambda$5), "register(...)"); return REGISTRY.register(block.getId().getPath(), block::block$lambda$5); } private static final Item block$lambda$5(DeferredHolder $block) {
/* 78 */     return (Item)new BlockItem((Block)$block.get(), new Item.Properties());
/*    */   }
/*    */ 
/*    */   
/*    */   private final DeferredHolder<Item, Item> doubleBlock(DeferredHolder block) {
/* 83 */     Intrinsics.checkNotNullExpressionValue(REGISTRY.register(
/* 84 */           block.getId().getPath(), block::doubleBlock$lambda$6), "register(...)"); return REGISTRY.register(block.getId().getPath(), block::doubleBlock$lambda$6); } private static final Item doubleBlock$lambda$6(DeferredHolder $block) {
/* 85 */     return (Item)new DoubleHighBlockItem((Block)$block.get(), new Item.Properties());
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSItems.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */