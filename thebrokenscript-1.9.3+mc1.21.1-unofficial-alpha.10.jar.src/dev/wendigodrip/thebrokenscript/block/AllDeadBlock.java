/*    */ package dev.wendigodrip.thebrokenscript.block;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.util.EntityFinder;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\024J\030\020\f\032\0020\r2\006\020\006\032\0020\0072\006\020\016\032\0020\017H\024J0\020\020\032\0020\0212\006\020\022\032\0020\0072\006\020\023\032\0020\0242\006\020\n\032\0020\0132\006\020\025\032\0020\0072\006\020\026\032\0020\rH\024J(\020\027\032\0020\0212\006\020\022\032\0020\0072\006\020\023\032\0020\0302\006\020\n\032\0020\0132\006\020\031\032\0020\032H\024¨\006\033"}, d2 = {"Ldev/wendigodrip/thebrokenscript/block/AllDeadBlock;", "Lnet/minecraft/world/level/block/Block;", "<init>", "()V", "getLightBlock", "", "state", "Lnet/minecraft/world/level/block/state/BlockState;", "worldIn", "Lnet/minecraft/world/level/BlockGetter;", "pos", "Lnet/minecraft/core/BlockPos;", "canBeReplaced", "", "context", "Lnet/minecraft/world/item/context/BlockPlaceContext;", "onPlace", "", "blockstate", "world", "Lnet/minecraft/world/level/Level;", "oldState", "moving", "tick", "Lnet/minecraft/server/level/ServerLevel;", "random", "Lnet/minecraft/util/RandomSource;", "thebrokenscript"})
/*    */ public final class AllDeadBlock extends Block {
/* 25 */   public AllDeadBlock() { super(BlockBehaviour.Properties.of().sound(SoundType.GLASS).strength(-1.0F, 3600000.0F).noCollission()); } protected int getLightBlock(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
/* 26 */     Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(worldIn, "worldIn"); Intrinsics.checkNotNullParameter(pos, "pos"); return 15;
/*    */   }
/*    */   protected boolean canBeReplaced(@NotNull BlockState state, @NotNull BlockPlaceContext context) {
/* 29 */     Intrinsics.checkNotNullParameter(state, "state"); Intrinsics.checkNotNullParameter(context, "context"); return (context.getItemInHand().getItem() != asItem());
/*    */   }
/*    */   
/*    */   protected void onPlace(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState oldState, boolean moving) {
/* 33 */     Intrinsics.checkNotNullParameter(blockstate, "blockstate"); Intrinsics.checkNotNullParameter(world, "world"); Intrinsics.checkNotNullParameter(pos, "pos"); Intrinsics.checkNotNullParameter(oldState, "oldState"); super.onPlace(blockstate, world, pos, oldState, moving);
/*    */     
/* 35 */     world.scheduleTick(pos, this, 2);
/*    */   }
/*    */   
/*    */   protected void tick(@NotNull BlockState blockstate, @NotNull ServerLevel world, @NotNull BlockPos pos, @NotNull RandomSource random) {
/* 39 */     Intrinsics.checkNotNullParameter(blockstate, "blockstate"); Intrinsics.checkNotNullParameter(world, "world"); Intrinsics.checkNotNullParameter(pos, "pos"); Intrinsics.checkNotNullParameter(random, "random"); super.tick(blockstate, world, pos, random);
/*    */     
/* 41 */     Intrinsics.checkNotNullExpressionValue(pos.getCenter(), "getCenter(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)world, Player.class, pos.getCenter(), 2.0D).isEmpty()) {
/* 42 */       if (Math.random() < 0.7D) {
/* 43 */         Intrinsics.checkNotNullExpressionValue(pos.getCenter(), "getCenter(...)"); List player = EntityFinder.INSTANCE.findSortedEntitiesInRange((LevelAccessor)world, Player.class, pos.getCenter(), 40.0D);
/*    */         
/* 45 */         if (player instanceof ServerPlayer && !((Entity)player).level().isClientSide()) {
/* 46 */           ResourceKey destinationType = ResourceKey.create(Registries.DIMENSION, TBSConstants.id("clan_void"));
/*    */           
/* 48 */           if (Intrinsics.areEqual(((Entity)player).level().dimension(), destinationType))
/*    */             return; 
/* 50 */           ServerLevel playerLevel = ((ServerPlayer)player).server.getLevel(destinationType);
/*    */           
/* 52 */           if (playerLevel != null) {
/* 53 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/* 54 */             ((ServerPlayer)player).teleportTo(playerLevel, ((Entity)player).getX(), ((Entity)player).getY(), ((Entity)player).getZ(), ((Entity)player).getYRot(), ((Entity)player).getXRot());
/* 55 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((Player)player).getAbilities()));
/*    */             
/* 57 */             for (MobEffectInstance effect : ((LivingEntity)player).getActiveEffects()) {
/* 58 */               ((ServerPlayer)player).connection.send(
/* 59 */                   (Packet)new ClientboundUpdateMobEffectPacket((
/* 60 */                     (Entity)player).getId(), effect, false));
/*    */             }
/*    */ 
/*    */ 
/*    */             
/* 65 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*    */           } 
/*    */         } 
/*    */       } else {
/* 69 */         Intrinsics.checkNotNullExpressionValue(pos.getCenter(), "getCenter(...)"); Player player = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)world, Player.class, pos.getCenter(), 40.0D);
/*    */         
/* 71 */         if (player instanceof ServerPlayer && !((ServerPlayer)player).level().isClientSide()) {
/* 72 */           ResourceKey dest = ResourceKey.create(Registries.DIMENSION, TBSConstants.id("null_torture"));
/*    */           
/* 74 */           if (((ServerPlayer)player).level().dimension() == dest)
/*    */             return; 
/* 76 */           ServerLevel playerLevel = ((ServerPlayer)player).server.getLevel(dest);
/*    */           
/* 78 */           if (playerLevel != null) {
/* 79 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0.0F));
/* 80 */             ((ServerPlayer)player).teleportTo(playerLevel, ((ServerPlayer)player).getX(), ((ServerPlayer)player).getY(), ((ServerPlayer)player).getZ(), ((ServerPlayer)player).getYRot(), ((ServerPlayer)player).getXRot());
/* 81 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((ServerPlayer)player).getAbilities()));
/*    */             
/* 83 */             for (MobEffectInstance effect : ((ServerPlayer)player).getActiveEffects()) {
/* 84 */               ((ServerPlayer)player).connection.send((Packet)new ClientboundUpdateMobEffectPacket(((ServerPlayer)player).getId(), effect, false));
/*    */             }
/*    */             
/* 87 */             ((ServerPlayer)player).connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*    */           } 
/*    */         } 
/*    */       } 
/*    */     }
/*    */     
/* 93 */     world.scheduleTick(pos, this, 2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\block\AllDeadBlock.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */