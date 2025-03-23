/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.procedures.FieldGeneratorOnTickUpdateProcedure;
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
/*    */ public class FieldGeneratorBlock extends Block {
/*    */   public FieldGeneratorBlock() {
/* 17 */     super(BlockBehaviour.Properties.of().sound(SoundType.WOOL).strength(-1.0F, 3600000.0F));
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 21 */     return 15;
/*    */   }
/*    */   
/*    */   public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
/* 25 */     super.onPlace(blockstate, world, pos, oldState, moving);
/* 26 */     world.scheduleTick(pos, this, 5);
/*    */   }
/*    */   
/*    */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 30 */     super.tick(blockstate, world, pos, random);
/* 31 */     int x = pos.getX();
/* 32 */     int y = pos.getY();
/* 33 */     int z = pos.getZ();
/* 34 */     FieldGeneratorOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/* 35 */     world.scheduleTick(pos, this, 5);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\FieldGeneratorBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */