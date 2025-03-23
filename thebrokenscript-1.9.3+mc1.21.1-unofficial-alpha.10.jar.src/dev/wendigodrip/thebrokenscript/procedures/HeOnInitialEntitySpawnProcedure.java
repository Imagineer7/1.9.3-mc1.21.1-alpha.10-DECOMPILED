/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Vec3i;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LightningBolt;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class HeOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 22 */     boolean found = false;
/* 23 */     double sx = 0.0D;
/* 24 */     double sy = 0.0D;
/* 25 */     double sz = 0.0D;
/* 26 */     if (world instanceof Level) {
/* 27 */       Level _level = (Level)world;
/* 28 */       if (!_level.isClientSide()) {
/* 29 */         _level.playSound(null, 
/*    */             
/* 31 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 32 */             .get(TBSConstants.id("himspawn")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       
/*    */       }
/*    */       else {
/*    */ 
/*    */         
/* 38 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*    */ 
/*    */ 
/*    */             
/* 42 */             .get(TBSConstants.id("himspawn")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 50 */     if (world instanceof ServerLevel) {
/* 51 */       ServerLevel serverLevel = (ServerLevel)world;
/* 52 */       serverLevel.getServer()
/* 53 */         .getCommands()
/* 54 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 62 */             (Component)Component.literal(""), serverLevel
/* 63 */             .getServer(), null))
/*    */           
/* 65 */           .withSuppressedOutput(), "weather rain");
/*    */     } 
/*    */     
/* 68 */     if (world instanceof ServerLevel) {
/* 69 */       ServerLevel serverLevel = (ServerLevel)world;
/* 70 */       LightningBolt entityToSpawn = (LightningBolt)EntityType.LIGHTNING_BOLT.create((Level)serverLevel);
/* 71 */       entityToSpawn.moveTo(Vec3.atBottomCenterOf((Vec3i)BlockPos.containing(x, y, z)));
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 76 */       serverLevel.addFreshEntity((Entity)entityToSpawn);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\HeOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */