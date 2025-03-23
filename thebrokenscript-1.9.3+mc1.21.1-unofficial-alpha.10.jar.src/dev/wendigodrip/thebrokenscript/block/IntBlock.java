/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.procedures.IntOnTickUpdateProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ 
/*    */ public class IntBlock extends Block {
/*    */   public IntBlock() {
/* 17 */     super(BlockBehaviour.Properties.of().sound(SoundType.EMPTY).strength(-1.0F, 3600000.0F));
/*    */   }
/*    */   
/*    */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/* 21 */     return true;
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 25 */     return 0;
/*    */   }
/*    */   
/*    */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 29 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 30 */     world.scheduleTick(pos, this, 20);
/*    */   }
/*    */   
/*    */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 34 */     super.tick(blockstate, world, pos, random);
/* 35 */     int x = pos.getX();
/* 36 */     int y = pos.getY();
/* 37 */     int z = pos.getZ();
/* 38 */     IntOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 39 */     world.scheduleTick(pos, this, 20);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\IntBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */