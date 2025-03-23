/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.procedures.ShadowBugOnTickUpdateProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.Shapes;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ 
/*    */ public class ShadowBugBlock extends Block {
/*    */   public ShadowBugBlock() {
/* 21 */     super(BlockBehaviour.Properties.of()
/* 22 */         .sound(SoundType.EMPTY)
/* 23 */         .strength(1.0F, 10.0F)
/* 24 */         .noCollission()
/* 25 */         .noOcclusion()
/* 26 */         .isRedstoneConductor((bs, br, bp) -> false));
/*    */   }
/*    */   
/*    */   public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
/* 30 */     return (adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side));
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 34 */     return 15;
/*    */   }
/*    */   
/*    */   public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 38 */     return Shapes.empty();
/*    */   }
/*    */   
/*    */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 42 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 43 */     world.scheduleTick(pos, this, 60);
/*    */   }
/*    */   
/*    */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 47 */     super.tick(blockstate, world, pos, random);
/* 48 */     int x = pos.getX();
/* 49 */     int y = pos.getY();
/* 50 */     int z = pos.getZ();
/* 51 */     ShadowBugOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 52 */     world.scheduleTick(pos, this, 60);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\ShadowBugBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */