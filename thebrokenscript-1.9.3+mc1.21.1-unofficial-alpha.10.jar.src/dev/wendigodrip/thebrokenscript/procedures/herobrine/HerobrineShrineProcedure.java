/*    */ package dev.wendigodrip.thebrokenscript.procedures.herobrine;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSSounds;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.neoforge.event.level.BlockEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J&\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fJ2\020\b\032\0020\0052\b\020\006\032\004\030\0010\0172\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\fH\002¨\006\020"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/herobrine/HerobrineShrineProcedure;", "", "<init>", "()V", "onBlockPlace", "", "event", "Lnet/neoforged/neoforge/event/level/BlockEvent$EntityPlaceEvent;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class HerobrineShrineProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onBlockPlace(@NotNull BlockEvent.EntityPlaceEvent event) {
/* 18 */     Intrinsics.checkNotNullParameter(event, "event");
/* 19 */     Intrinsics.checkNotNullExpressionValue(event.getLevel(), "getLevel(...)"); execute((Event)event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
/*    */   }
/*    */   @NotNull
/*    */   public static final HerobrineShrineProcedure INSTANCE = new HerobrineShrineProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 24 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z) {
/* 28 */     if (world.getBlockState(BlockPos.containing(x, y - 1.0D, z)).getBlock() == Blocks.NETHERRACK) if (world.getBlockState(
/* 29 */           BlockPos.containing(x, y - 2.0D, z))
/* 30 */         .getBlock() == Blocks.MOSSY_COBBLESTONE) if (world.getBlockState(
/* 31 */             BlockPos.containing(
/* 32 */               x + 1.0D, 
/* 33 */               y - 2.0D, 
/* 34 */               z))
/*    */           
/* 36 */           .getBlock() == Blocks.GOLD_BLOCK) if (world.getBlockState(
/* 37 */               BlockPos.containing(
/* 38 */                 x - 1.0D, 
/* 39 */                 y - 2.0D, 
/* 40 */                 z))
/*    */             
/* 42 */             .getBlock() == Blocks.GOLD_BLOCK) if (world.getBlockState(
/* 43 */                 BlockPos.containing(
/* 44 */                   x, 
/* 45 */                   y - 2.0D, 
/* 46 */                   z + 1.0D))
/*    */               
/* 48 */               .getBlock() == Blocks.GOLD_BLOCK) if (world.getBlockState(
/* 49 */                   BlockPos.containing(
/* 50 */                     x, 
/* 51 */                     y - 2.0D, 
/* 52 */                     z - 1.0D))
/*    */                 
/* 54 */                 .getBlock() == Blocks.GOLD_BLOCK) if (world instanceof Level)
/*    */                 {
/* 56 */                   if (!((Level)world).isClientSide()) {
/* 57 */                     ((Level)world).playSound(
/* 58 */                         null, BlockPos.containing(x, y, z), (SoundEvent)TBSSounds.INSTANCE.getCURVED_SPAWN().get(), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */                   } else {
/*    */                     
/* 61 */                     ((Level)world).playLocalSound(
/* 62 */                         x, y, z, (SoundEvent)TBSSounds.INSTANCE.getCURVED_SPAWN().get(), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */                   } 
/*    */                 }      
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\herobrine\HerobrineShrineProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */