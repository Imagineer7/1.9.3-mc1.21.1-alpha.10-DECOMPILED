/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.procedures.OldblockBlockDestroyedByPlayerProcedure;
/*    */ import dev.wendigodrip.thebrokenscript.procedures.OldblockOnTickUpdateProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ 
/*    */ public class OldblockBlock extends Block {
/*    */   public OldblockBlock() {
/* 20 */     super(BlockBehaviour.Properties.of()
/* 21 */         .sound(SoundType.WOOD)
/* 22 */         .strength(1.0F, 10.0F)
/* 23 */         .randomTicks()
/* 24 */         .hasPostProcess((bs, br, bp) -> true)
/* 25 */         .emissiveRendering((bs, br, bp) -> true));
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 29 */     return 15;
/*    */   }
/*    */   
/*    */   public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
/* 33 */     super.tick(blockstate, world, pos, random);
/* 34 */     int x = pos.getX();
/* 35 */     int y = pos.getY();
/* 36 */     int z = pos.getZ();
/* 37 */     OldblockOnTickUpdateProcedure.execute((LevelAccessor)world, x, y, z);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
/* 48 */     boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
/* 49 */     OldblockBlockDestroyedByPlayerProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/* 50 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\OldblockBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */