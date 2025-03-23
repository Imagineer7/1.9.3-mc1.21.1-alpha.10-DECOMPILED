/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/block/R3Block;", "Lnet/minecraft/world/level/block/Block;", "<init>", "()V", "getLightBlock", "", "state", "Lnet/minecraft/world/level/block/state/BlockState;", "worldIn", "Lnet/minecraft/world/level/BlockGetter;", "pos", "Lnet/minecraft/core/BlockPos;", "thebrokenscript"})
/*    */ public final class R3Block extends Block {
/*    */   public R3Block() {
/*  9 */     super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(-1.0F, 3600000.0F));
/*    */   } public int getLightBlock(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
/* 11 */     Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(worldIn, "worldIn"); Intrinsics.checkNotNullParameter(pos, "pos"); return 15;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\R3Block.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */