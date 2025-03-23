/*    */ package dev.wendigodrip.thebrokenscript.entity;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.procedures.MazeShadowsNaturalEntitySpawningConditionProcedure;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.util.RandomSource;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.SpawnPlacementTypes;
/*    */ import net.minecraft.world.entity.SpawnPlacements;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.entity.monster.Monster;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.levelgen.Heightmap;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\004\032\0020\005J\006\020\006\032\0020\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/MazeShadowsEntity$Companion;", "", "<init>", "()V", "init", "", "createAttributes", "Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", "thebrokenscript"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   public final void init() {
/* 62 */     SpawnPlacements.register(
/* 63 */         (EntityType)TBSEntities.MAZE_SHADOWS.get(), 
/* 64 */         SpawnPlacementTypes.ON_GROUND, 
/* 65 */         Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, 
/* 66 */         Companion::init$lambda$0); } private static final boolean init$lambda$0(EntityType paramEntityType, ServerLevelAccessor world, MobSpawnType paramMobSpawnType, BlockPos pos, RandomSource paramRandomSource) {
/* 67 */     int x = pos.getX();
/* 68 */     int y = pos.getY();
/* 69 */     int z = pos.getZ();
/*    */     
/* 71 */     return MazeShadowsNaturalEntitySpawningConditionProcedure.execute(
/* 72 */         (LevelAccessor)world, 
/* 73 */         x, 
/* 74 */         y, 
/* 75 */         z);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final AttributeSupplier.Builder createAttributes() {
/* 86 */     Intrinsics.checkNotNullExpressionValue(Monster.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3D).add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.ARMOR, 0.0D).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.FOLLOW_RANGE, 16.0D), "add(...)"); return Monster.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3D).add(Attributes.MAX_HEALTH, 10.0D).add(Attributes.ARMOR, 0.0D).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.FOLLOW_RANGE, 16.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\MazeShadowsEntity$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */