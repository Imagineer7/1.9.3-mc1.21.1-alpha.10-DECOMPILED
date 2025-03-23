/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSBlocks;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J(\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\tH\007¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/FieldGeneratorOnTickUpdateProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "thebrokenscript"})
/*    */ public final class FieldGeneratorOnTickUpdateProcedure {
/*    */   @JvmStatic
/*    */   public static final void execute(@NotNull LevelAccessor world, double x, double y, double z) {
/* 20 */     Intrinsics.checkNotNullParameter(world, "world"); double doaction = 0.0D;
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 25 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 400.0D, 400.0D, 400.0D), FieldGeneratorOnTickUpdateProcedure::execute$lambda$0::execute$lambda$1).isEmpty()) {
/*    */       
/* 27 */       ServerLevel _serverworld = null;
/* 28 */       StructureTemplate template = null;
/* 29 */       world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/* 30 */       world.setBlock(
/* 31 */           BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
/*    */       
/* 33 */       if (Math.random() < 0.7D) {
/* 34 */         if (world instanceof ServerLevel) {
/* 35 */           ((ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("fieldbase")).placeInWorld(
/* 36 */               (ServerLevelAccessor)world, 
/* 37 */               BlockPos.containing(x, y - 5.0D, z), 
/* 38 */               BlockPos.containing(x, y - 5.0D, z), (
/* 39 */               new StructurePlaceSettings()).setRotation(Rotation.NONE).setMirror(Mirror.NONE)
/* 40 */               .setIgnoreEntities(false), 
/* 41 */               ((ServerLevel)world).random, 
/* 42 */               3);
/*    */         }
/*    */       }
/* 45 */       else if (world instanceof ServerLevel) {
/* 46 */         ((ServerLevel)world).getStructureManager().getOrCreate(TBSConstants.id("fieldtree")).placeInWorld(
/* 47 */             (ServerLevelAccessor)world, 
/* 48 */             BlockPos.containing(x, y - 5.0D, z), 
/* 49 */             BlockPos.containing(x, y - 5.0D, z), (
/* 50 */             new StructurePlaceSettings()).setRotation(Rotation.NONE).setMirror(Mirror.NONE)
/* 51 */             .setIgnoreEntities(false), 
/* 52 */             ((ServerLevel)world).random, 
/* 53 */             3);
/*    */       } 
/*    */       
/* 56 */       if (world.getBlockState(BlockPos.containing(x + 16.0D, y, z)).getBlock() != Blocks.BEDROCK) {
/* 57 */         world.setBlock(
/* 58 */             BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */         
/* 60 */         world.setBlock(
/* 61 */             BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
/*    */         
/* 63 */         world.setBlock(
/* 64 */             BlockPos.containing(x + 16.0D, y, z), ((Block)TBSBlocks.FIELD_GENERATOR.get()).defaultBlockState(), 3);
/*    */       } 
/*    */       
/* 67 */       if (world.getBlockState(BlockPos.containing(x - 16.0D, y, z)).getBlock() != Blocks.BEDROCK) {
/* 68 */         world.setBlock(
/* 69 */             BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */         
/* 71 */         world.setBlock(
/* 72 */             BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
/*    */         
/* 74 */         world.setBlock(
/* 75 */             BlockPos.containing(x - 16.0D, y, z), ((Block)TBSBlocks.FIELD_GENERATOR.get()).defaultBlockState(), 3);
/*    */       } 
/*    */       
/* 78 */       if (world.getBlockState(BlockPos.containing(x, y, z + 16.0D)).getBlock() != Blocks.BEDROCK) {
/* 79 */         world.setBlock(
/* 80 */             BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */         
/* 82 */         world.setBlock(
/* 83 */             BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
/*    */         
/* 85 */         world.setBlock(
/* 86 */             BlockPos.containing(x, y, z + 16.0D), ((Block)TBSBlocks.FIELD_GENERATOR.get()).defaultBlockState(), 3);
/*    */       } 
/*    */       
/* 89 */       if (world.getBlockState(BlockPos.containing(x, y, z - 16.0D)).getBlock() != Blocks.BEDROCK) {
/* 90 */         world.setBlock(
/* 91 */             BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */         
/* 93 */         world.setBlock(
/* 94 */             BlockPos.containing(x, y, z), Blocks.BEDROCK.defaultBlockState(), 3);
/*    */         
/* 96 */         world.setBlock(
/* 97 */             BlockPos.containing(x, y, z - 16.0D), ((Block)TBSBlocks.FIELD_GENERATOR.get()).defaultBlockState(), 3);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final FieldGeneratorOnTickUpdateProcedure INSTANCE = new FieldGeneratorOnTickUpdateProcedure();
/*    */   
/*    */   private static final boolean execute$lambda$0(Player e) {
/*    */     return true;
/*    */   }
/*    */   
/*    */   private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) {
/*    */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\FieldGeneratorOnTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */