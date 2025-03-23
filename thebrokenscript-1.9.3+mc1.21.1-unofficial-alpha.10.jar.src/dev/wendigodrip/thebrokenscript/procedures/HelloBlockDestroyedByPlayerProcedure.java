/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\tH\007¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/HelloBlockDestroyedByPlayerProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "thebrokenscript"})
/*    */ public final class HelloBlockDestroyedByPlayerProcedure {
/*    */   @JvmStatic
/*    */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 19 */     Intrinsics.checkNotNullParameter(world, "world"); ServerLevel _serverworld = null;
/* 20 */     StructureTemplate template = null;
/* 21 */     if (world instanceof Level) {
/* 22 */       if (!((Level)world).isClientSide()) {
/* 23 */         ((Level)world).playSound(
/* 24 */             null, 
/* 25 */             BlockPos.containing(x, y, z), 
/* 26 */             (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(TBSConstants.id("heartbeat")), 
/* 27 */             SoundSource.NEUTRAL, 
/* 28 */             555.0F, 
/* 29 */             1.0F);
/*    */       } else {
/*    */         
/* 32 */         ((Level)world).playLocalSound(
/* 33 */             x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(TBSConstants.id("heartbeat")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       } 
/*    */     }
/*    */     
/* 37 */     if (world instanceof ServerLevel) {
/* 38 */       ((ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("magmacross")).placeInWorld(
/* 39 */           (ServerLevelAccessor)world, 
/* 40 */           BlockPos.containing(x, y, z), 
/* 41 */           BlockPos.containing(x, y, z), (
/* 42 */           new StructurePlaceSettings()).setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), 
/* 43 */           ((ServerLevel)world).random, 
/* 44 */           3);
/*    */     }
/*    */     
/* 47 */     MapVariables.Companion.get(world).setHasTriggeredRam2Die(true);
/* 48 */     MapVariables.Companion.get(world).syncData(world);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final HelloBlockDestroyedByPlayerProcedure INSTANCE = new HelloBlockDestroyedByPlayerProcedure();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\HelloBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */