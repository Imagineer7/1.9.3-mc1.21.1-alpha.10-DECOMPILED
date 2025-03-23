/*    */ package dev.wendigodrip.thebrokenscript.procedures.misc;
/*    */ import java.util.Map;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J&\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fJ2\020\b\032\0020\0052\b\020\006\032\004\030\0010\0172\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/misc/DeepslateReplacerProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class DeepslateReplacerProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/* 16 */     Intrinsics.checkNotNullParameter(event, "event");
/* 17 */     Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); execute((Event)event, (LevelAccessor)event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
/*    */   }
/*    */   @NotNull
/*    */   public static final DeepslateReplacerProcedure INSTANCE = new DeepslateReplacerProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 22 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z) {
/* 26 */     if ((TBSConfigs.COMMON != null) ? (!TBSConfigs.COMMON.getRemoveDeepslate()) : false)
/*    */       return; 
/* 28 */     if (Math.random() < 0.1D && y < 10.0D) {
/* 29 */       int horizontalRadiusSquare = 4;
/* 30 */       int verticalRadiusSquare = 4;
/* 31 */       int yIterationsSquare = verticalRadiusSquare;
/* 32 */       int i = -yIterationsSquare; if (i <= yIterationsSquare)
/* 33 */         while (true) { int xi = -horizontalRadiusSquare; if (xi <= horizontalRadiusSquare)
/* 34 */             while (true) { int zi = -horizontalRadiusSquare; if (zi <= horizontalRadiusSquare)
/* 35 */                 while (true) { if (world.getBlockState(
/* 36 */                       BlockPos.containing(
/* 37 */                         x + xi, y + i, z + zi))
/*    */                     
/* 39 */                     .getBlock() == Blocks.DEEPSLATE) {
/*    */                     
/* 41 */                     BlockPos _bp = BlockPos.containing(
/* 42 */                         x + xi, y + i, z + zi);
/*    */                     
/* 44 */                     BlockState _bs = Blocks.STONE.defaultBlockState();
/* 45 */                     BlockState _bso = world.getBlockState(_bp);
/*    */                     
/* 47 */                     Intrinsics.checkNotNullExpressionValue(_bso.getValues(), "getValues(...)"); for (Map.Entry entry : _bso.getValues().entrySet()) { Property key = (Property)entry.getKey(); Comparable value = (Comparable)entry.getValue();
/* 48 */                       Property _property = _bs.getBlock().getStateDefinition().getProperty(key.getName());
/*    */                       
/* 50 */                       if (_property == null || _bs.getValue(_property) == null)
/*    */                         continue; 
/*    */                       try {
/* 53 */                         if (value != null && 
/* 54 */                           !_bs.getValue(_property).equals(value))
/*    */                         
/* 56 */                         { BlockState temp = (BlockState)_bs.neighbours.get(_property, value);
/*    */                           
/* 58 */                           if (temp != null) _bs = temp;  } 
/* 59 */                       } catch (Exception exception) {} }
/*    */ 
/*    */ 
/*    */                     
/* 63 */                     world.setBlock(_bp, _bs, 3);
/*    */                   } 
/*    */                   if (zi != horizontalRadiusSquare) {
/*    */                     zi++;
/*    */                     continue;
/*    */                   } 
/*    */                   break; }
/*    */                  
/*    */               if (xi != horizontalRadiusSquare) {
/*    */                 xi++;
/*    */                 continue;
/*    */               } 
/*    */               break; }
/*    */              
/*    */           if (i != yIterationsSquare) {
/*    */             i++;
/*    */             continue;
/*    */           } 
/*    */           break; }
/*    */          
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\misc\DeepslateReplacerProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */