/*    */ package dev.wendigodrip.thebrokenscript.registry;
/*    */ import dev.wendigodrip.thebrokenscript.block.entity.ConsoleBlockEntity;
/*    */ import dev.wendigodrip.thebrokenscript.block.entity.WhiteBlockEntity;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.entity.BlockEntityType;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.neoforged.neoforge.registries.DeferredHolder;
/*    */ import net.neoforged.neoforge.registries.DeferredRegister;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JV\020\t\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\002H\0130\0060\n\"\n\b\000\020\013*\004\030\0010\f2\006\020\r\032\0020\0162\024\020\017\032\020\022\004\022\0020\020\022\006\b\001\022\0020\0200\n2\f\020\021\032\b\022\004\022\002H\0130\022H\002R\033\020\004\032\f\022\b\022\006\022\002\b\0030\0060\005¢\006\b\n\000\032\004\b\007\020\bR&\020\023\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0240\0060\n8\006X\004¢\006\002\n\000R&\020\025\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020\0260\0060\n8\006X\004¢\006\002\n\000¨\006\027"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSBlockEntities;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/minecraft/world/level/block/entity/BlockEntityType;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "register", "Lnet/neoforged/neoforge/registries/DeferredHolder;", "T", "Lnet/minecraft/world/level/block/entity/BlockEntity;", "name", "", "block", "Lnet/minecraft/world/level/block/Block;", "supplier", "Lnet/minecraft/world/level/block/entity/BlockEntityType$BlockEntitySupplier;", "CONSOLE", "Ldev/wendigodrip/thebrokenscript/block/entity/ConsoleBlockEntity;", "WHITE", "Ldev/wendigodrip/thebrokenscript/block/entity/WhiteBlockEntity;", "thebrokenscript"})
/*    */ public final class TBSBlockEntities {
/*    */   @NotNull
/* 18 */   public static final TBSBlockEntities INSTANCE = new TBSBlockEntities(); @NotNull private static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(
/* 19 */       BuiltInRegistries.BLOCK_ENTITY_TYPE, 
/* 20 */       "thebrokenscript"); static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, "thebrokenscript"), "create(...)"); }
/*    */   
/*    */   @NotNull
/*    */   public final DeferredRegister<BlockEntityType<?>> getREGISTRY() {
/*    */     return REGISTRY;
/*    */   }
/*    */   private final <T extends net.minecraft.world.level.block.entity.BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(String name, DeferredHolder block, BlockEntityType.BlockEntitySupplier supplier) {
/*    */     // Byte code:
/*    */     //   0: getstatic dev/wendigodrip/thebrokenscript/registry/TBSBlockEntities.REGISTRY : Lnet/neoforged/neoforge/registries/DeferredRegister;
/*    */     //   3: aload_1
/*    */     //   4: aload_3
/*    */     //   5: aload_2
/*    */     //   6: <illegal opcode> get : (Lnet/minecraft/world/level/block/entity/BlockEntityType$BlockEntitySupplier;Lnet/neoforged/neoforge/registries/DeferredHolder;)Ljava/util/function/Supplier;
/*    */     //   11: invokevirtual register : (Ljava/lang/String;Ljava/util/function/Supplier;)Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   14: dup
/*    */     //   15: ldc 'register(...)'
/*    */     //   17: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   20: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #28	-> 0
/*    */     //   #29	-> 3
/*    */     //   #30	-> 4
/*    */     //   #28	-> 4
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	21	0	this	Ldev/wendigodrip/thebrokenscript/registry/TBSBlockEntities;
/*    */     //   0	21	1	name	Ljava/lang/String;
/*    */     //   0	21	2	block	Lnet/neoforged/neoforge/registries/DeferredHolder;
/*    */     //   0	21	3	supplier	Lnet/minecraft/world/level/block/entity/BlockEntityType$BlockEntitySupplier;
/*    */   }
/*    */   private static final BlockEntityType register$lambda$0(BlockEntityType.BlockEntitySupplier $supplier, DeferredHolder $block) {
/* 30 */     Block[] arrayOfBlock = new Block[1]; arrayOfBlock[0] = (Block)$block.get(); return BlockEntityType.Builder.of($supplier, arrayOfBlock).build(null);
/*    */   }
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 35 */   public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ConsoleBlockEntity>> CONSOLE = INSTANCE.register(
/* 36 */       "console", 
/* 37 */       TBSBlocks.INSTANCE.getCONSOLE(), 
/* 38 */       TBSBlockEntities::CONSOLE$lambda$1); private static final ConsoleBlockEntity CONSOLE$lambda$1(BlockPos position, BlockState state) { return new ConsoleBlockEntity(position, state); }
/*    */    @JvmField
/*    */   @NotNull
/* 41 */   public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WhiteBlockEntity>> WHITE = INSTANCE.register(
/* 42 */       "white", 
/* 43 */       TBSBlocks.INSTANCE.getWHITE(), 
/* 44 */       TBSBlockEntities::WHITE$lambda$2); private static final WhiteBlockEntity WHITE$lambda$2(BlockPos position, BlockState state) { return new WhiteBlockEntity(position, state); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSBlockEntities.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */