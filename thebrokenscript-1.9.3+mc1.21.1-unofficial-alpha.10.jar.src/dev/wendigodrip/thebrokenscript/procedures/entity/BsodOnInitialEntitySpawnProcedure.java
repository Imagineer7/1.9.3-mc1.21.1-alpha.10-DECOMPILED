/*    */ package dev.wendigodrip.thebrokenscript.procedures.entity;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSSounds;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class BsodOnInitialEntitySpawnProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 21 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 24 */     if (Math.random() < 0.7D && world instanceof ServerLevel) {
/* 25 */       ServerLevel _level = (ServerLevel)world;
/* 26 */       _level.getServer()
/* 27 */         .getCommands()
/* 28 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 36 */             (Component)Component.literal(""), _level
/* 37 */             .getServer(), null))
/*    */           
/* 39 */           .withSuppressedOutput(), "weather rain");
/*    */     } 
/*    */     
/* 42 */     if (world instanceof Level) { Level level2 = (Level)world;
/* 43 */       if (!level2.isClientSide()) {
/* 44 */         level2.playSound(null, 
/*    */             
/* 46 */             BlockPos.containing(x, y, z), (SoundEvent)TBSSounds.BSOD
/* 47 */             .get(), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       
/*    */       }
/*    */       else {
/*    */ 
/*    */         
/* 53 */         level2.playLocalSound(x, y, z, (SoundEvent)TBSSounds.BSOD
/*    */ 
/*    */ 
/*    */             
/* 57 */             .get(), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 65 */     TheBrokenScript.queueServerWork(180, () -> {
/*    */           if (!entity.level().isClientSide())
/*    */             entity.discard(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\entity\BsodOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */