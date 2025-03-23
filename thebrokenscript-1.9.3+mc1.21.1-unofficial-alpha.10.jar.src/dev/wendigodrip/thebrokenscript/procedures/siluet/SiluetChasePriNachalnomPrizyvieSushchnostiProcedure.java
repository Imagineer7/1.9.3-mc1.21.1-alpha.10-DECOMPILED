/*    */ package dev.wendigodrip.thebrokenscript.procedures.siluet;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SiluetChasePriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 15 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 18 */     if (world instanceof Level) { Level _level = (Level)world;
/* 19 */       if (!_level.isClientSide()) {
/* 20 */         _level.playSound(null, 
/*    */             
/* 22 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 23 */             .get(TBSConstants.id("nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*    */       
/*    */       }
/*    */       else {
/*    */ 
/*    */         
/* 29 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*    */ 
/*    */ 
/*    */             
/* 33 */             .get(TBSConstants.id("nullchase")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 41 */     TheBrokenScript.queueServerWork(800, () -> {
/*    */           if (!entity.level().isClientSide())
/*    */             entity.discard(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\siluet\SiluetChasePriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */