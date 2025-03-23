/*    */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.NullWatchingEntity;
/*    */ import java.util.Comparator;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class NullTpBeaconOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null) {
/*    */       return;
/*    */     }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 28 */     if (!world.getEntitiesOfClass(NullWatchingEntity.class, AABB.ofSize(new Vec3(x, y, z), 1000.0D, 1000.0D, 1000.0D), e -> true).isEmpty() && world
/* 29 */       .canSeeSkyFromBelowWater(BlockPos.containing(x, y, z))) if (world
/* 30 */         .getEntitiesOfClass(Player.class, 
/*    */           
/* 32 */           AABB.ofSize(new Vec3(x, y, z), 100.0D, 100.0D, 100.0D), e -> true)
/*    */         
/* 34 */         .isEmpty()) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 49 */         Entity _ent = world.getEntitiesOfClass(NullWatchingEntity.class, AABB.ofSize(new Vec3(x, y, z), 1200.0D, 1200.0D, 1200.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 50 */         _ent.teleportTo(x, y, z);
/* 51 */         if (_ent instanceof ServerPlayer) { ServerPlayer _serverPlayer = (ServerPlayer)_ent;
/* 52 */           _serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot()); }
/*    */       
/*    */       }  
/* 55 */     if (!entity.level().isClientSide())
/* 56 */       entity.discard(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullTpBeaconOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */