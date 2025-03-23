/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.procedures.ItBlockDestroyedByPlayerProcedure;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.FluidState;
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.Shapes;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ 
/*    */ public class ItBlock extends Block {
/*    */   public ItBlock() {
/* 20 */     super(BlockBehaviour.Properties.of()
/* 21 */         .sound(SoundType.GLASS)
/* 22 */         .strength(-1.0F, 3600000.0F)
/* 23 */         .noCollission()
/* 24 */         .noOcclusion()
/* 25 */         .isRedstoneConductor((bs, br, bp) -> false));
/*    */   }
/*    */   
/*    */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/* 29 */     return true;
/*    */   }
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 33 */     return 0;
/*    */   }
/*    */   
/*    */   public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 37 */     return Shapes.empty();
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
/* 49 */     ItBlockDestroyedByPlayerProcedure.execute((Entity)entity);
/* 50 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\ItBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */