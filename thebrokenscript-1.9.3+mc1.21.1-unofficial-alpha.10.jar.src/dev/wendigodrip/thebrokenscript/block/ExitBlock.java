/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.procedures.ExitOnTickUpdateProcedure;
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
/*    */ public class ExitBlock extends Block {
/*    */   public ExitBlock() {
/* 21 */     super(BlockBehaviour.Properties.of()
/* 22 */         .sound(SoundType.GLASS)
/* 23 */         .strength(-1.0F, 3600000.0F)
/* 24 */         .lightLevel(s -> 15)
/* 25 */         .noCollission()
/* 26 */         .noOcclusion()
/* 27 */         .hasPostProcess((bs, br, bp) -> true)
/* 28 */         .emissiveRendering((bs, br, bp) -> true)
/* 29 */         .isRedstoneConductor((bs, br, bp) -> false));
/*    */   }
/*    */   
/*    */   public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
/* 33 */     return (adjacentBlockState.getBlock() == this || super.skipRendering(state, adjacentBlockState, side));
/*    */   }
/*    */   
/*    */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/* 37 */     return true;
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 41 */     return 0;
/*    */   }
/*    */   
/*    */   public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 45 */     return Shapes.empty();
/*    */   }
/*    */   
/*    */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 49 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 50 */     world.scheduleTick(pos, this, 1);
/*    */   }
/*    */   
/*    */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 54 */     super.tick(blockstate, world, pos, random);
/* 55 */     int x = pos.getX();
/* 56 */     int y = pos.getY();
/* 57 */     int z = pos.getZ();
/* 58 */     ExitOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 59 */     world.scheduleTick(pos, this, 1);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\ExitBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */