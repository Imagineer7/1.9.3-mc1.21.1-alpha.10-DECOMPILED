/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSParticleTypes;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J0\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020J<\020\b\032\0020\0052\b\020\006\032\004\030\0010\0212\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020H\002¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/TheGrimLimitProcedure;", "", "<init>", "()V", "onRightClickBlock", "", "event", "Lnet/neoforged/neoforge/event/entity/player/PlayerInteractEvent$RightClickBlock;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class TheGrimLimitProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onRightClickBlock(@NotNull PlayerInteractEvent.RightClickBlock event) {
/* 23 */     Intrinsics.checkNotNullParameter(event, "event"); if (event.getHand() != event.getEntity().getUsedItemHand()) {
/*    */       return;
/*    */     }
/*    */     
/* 27 */     Intrinsics.checkNotNullExpressionValue(event.getLevel(), "getLevel(...)"); execute((Event)event, (LevelAccessor)event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), (Entity)event.getEntity());
/*    */   }
/*    */   @NotNull
/*    */   public static final TheGrimLimitProcedure INSTANCE = new TheGrimLimitProcedure();
/*    */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/* 32 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z, entity);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final void execute(Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/* 38 */     double sz = 0.0D;
/* 39 */     double sy = 0.0D;
/* 40 */     double sx = 0.0D;
/* 41 */     boolean found = false;
/*    */     
/* 43 */     TheGrimLimitProcedure $this$execute_u24lambda_u240 = this; int $i$a$-run-TheGrimLimitProcedure$execute$1 = 0;
/* 44 */     if (entity == null) {
/*    */       return;
/*    */     }
/*    */     
/* 48 */     found = false;
/* 49 */     sx = 0.0D;
/* 50 */     sy = 0.0D;
/* 51 */     sz = 0.0D;
/*    */     
/* 53 */     ItemStack itemStack2 = (entity instanceof LivingEntity) ? (
/* 54 */       (LivingEntity)entity).getMainHandItem() : 
/*    */       
/* 56 */       ItemStack.EMPTY;
/*    */ 
/*    */     
/* 59 */     if (itemStack2.getItem() != Items.MUSIC_DISC_11) {
/*    */       
/* 61 */       ItemStack itemStack = (entity instanceof LivingEntity) ? (
/* 62 */         (LivingEntity)entity).getMainHandItem() : 
/*    */         
/* 64 */         ItemStack.EMPTY;
/*    */ 
/*    */       
/* 67 */       if (itemStack.getItem() != Items.MUSIC_DISC_13)
/*    */         return; 
/*    */     } 
/* 70 */     sx = -3.0D;
/* 71 */     found = false;
/* 72 */     for (int index0 = 0; index0 < 6; index0++) {
/* 73 */       sy = -3.0D;
/* 74 */       for (int index1 = 0; index1 < 6; index1++) {
/* 75 */         sz = -3.0D;
/* 76 */         for (int index2 = 0; index2 < 6; index2++) {
/* 77 */           if (world.getBlockState(
/* 78 */               BlockPos.containing(
/* 79 */                 x + sx, y + sy, z + sz))
/*    */             
/* 81 */             .getBlock() == Blocks.JUKEBOX)
/*    */           {
/* 83 */             found = true;
/*    */           }
/* 85 */           sz++;
/*    */         } 
/* 87 */         sy++;
/*    */       } 
/* 89 */       sx++;
/*    */     } 
/* 91 */     if (found) {
/* 92 */       MapVariables.Companion.get(world).setHasPlayedCreepyDisc(true);
/* 93 */       MapVariables.Companion.get(world).syncData(world);
/* 94 */       if (world instanceof ServerLevel) {
/*    */         
/* 96 */         Intrinsics.checkNotNull(TBSParticleTypes.NULL_PARTICLE.get(), "null cannot be cast to non-null type net.minecraft.core.particles.ParticleOptions"); ((ServerLevel)world).sendParticles((ParticleOptions)TBSParticleTypes.NULL_PARTICLE.get(), x, y, z, 40, 3.0D, 3.0D, 3.0D, 0.0D);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\TheGrimLimitProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */