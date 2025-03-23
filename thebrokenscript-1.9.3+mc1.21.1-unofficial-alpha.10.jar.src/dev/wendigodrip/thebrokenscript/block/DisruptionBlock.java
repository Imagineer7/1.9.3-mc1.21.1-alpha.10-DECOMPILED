/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.procedures.DisruptionBlockAddedProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.pathfinder.PathType;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ public class DisruptionBlock extends Block {
/*    */   public DisruptionBlock() {
/* 18 */     super(BlockBehaviour.Properties.of()
/* 19 */         .sound(SoundType.STONE)
/* 20 */         .strength(1.0F, 10.0F)
/* 21 */         .noCollission()
/* 22 */         .hasPostProcess((bs, br, bp) -> true)
/* 23 */         .emissiveRendering((bs, br, bp) -> true));
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 27 */     return 15;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public PathType getAdjacentBlockPathType(BlockState state, BlockGetter level, BlockPos pos, @Nullable Mob mob, PathType originalType) {
/* 38 */     return PathType.WALKABLE;
/*    */   }
/*    */   
/*    */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 42 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 43 */     DisruptionBlockAddedProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\DisruptionBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */