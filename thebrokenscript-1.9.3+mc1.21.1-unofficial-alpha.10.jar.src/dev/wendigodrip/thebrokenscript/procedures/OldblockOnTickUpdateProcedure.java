/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSBlocks;
/*    */ import java.util.Map;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class OldblockOnTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     BlockPos _bp = BlockPos.containing(x, y - 1.0D, z);
/* 14 */     BlockState _bs = ((Block)TBSBlocks.OLDBLOCK.get()).defaultBlockState();
/* 15 */     BlockState _bso = world.getBlockState(_bp);
/* 16 */     for (Map.Entry entry : _bso.getValues().entrySet()) {
/* 17 */       Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 18 */       if (_property == null || _bs.getValue(_property) == null)
/*    */         continue;  try {
/* 20 */         _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
/* 21 */       } catch (Exception exception) {}
/*    */     } 
/*    */     
/* 24 */     world.setBlock(_bp, _bs, 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\OldblockOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */