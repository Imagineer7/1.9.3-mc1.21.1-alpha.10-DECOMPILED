/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ import java.util.Random;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH\002¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/RandomSafeTeleport;", "", "<init>", "()V", "teleport", "", "entity", "Lnet/minecraft/world/entity/Entity;", "isSafeLocation", "", "world", "Lnet/minecraft/world/level/Level;", "pos", "Lnet/minecraft/core/BlockPos;", "thebrokenscript"})
/*    */ public final class RandomSafeTeleport {
/*    */   @JvmStatic
/*    */   public static final void teleport(@NotNull Entity entity) {
/* 12 */     Intrinsics.checkNotNullParameter(entity, "entity"); Level world = entity.level();
/* 13 */     Random random = new Random();
/* 14 */     BlockPos originalPos = entity.blockPosition();
/*    */     
/* 16 */     for (int i = 0; i < 10; i++) {
/* 17 */       int x = originalPos.getX() + random.nextInt(21) - 10;
/* 18 */       int z = originalPos.getZ() + random.nextInt(21) - 10;
/* 19 */       int y = world.getHeight();
/* 20 */       BlockPos newPos = new BlockPos(x, y, z);
/*    */       
/* 22 */       Intrinsics.checkNotNull(world); if (INSTANCE.isSafeLocation(world, newPos)) {
/*    */         
/* 24 */         entity.teleportTo(x + 0.5D, y, z + 0.5D);
/*    */         break;
/*    */       } 
/*    */     } 
/*    */   } @NotNull
/*    */   public static final RandomSafeTeleport INSTANCE = new RandomSafeTeleport();
/*    */   private final boolean isSafeLocation(Level world, BlockPos pos) {
/* 31 */     if (world.getBlockState(pos.below()).isSolid() && world.getBlockState(pos).isAir() && world.getBlockState(pos.above()).isAir()) if (world.getBlockState(
/* 32 */           pos.below())
/* 33 */         .getBlock() != Blocks.WATER) if (world.getBlockState(
/* 34 */             pos.below())
/* 35 */           .getBlock() != Blocks.LAVA);  
/*    */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\RandomSafeTeleport.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */