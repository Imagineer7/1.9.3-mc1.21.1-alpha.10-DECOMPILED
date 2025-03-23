/*    */ package dev.wendigodrip.thebrokenscript.procedures.nothing;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class NothingiswatchingPriNachalnomPrizyvieSushchnostiProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if (world instanceof Level) {
/* 16 */       Level _level = (Level)world;
/* 17 */       if (!_level.isClientSide()) {
/* 18 */         _level.playSound(null, 
/*    */             
/* 20 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 21 */             .get(TBSConstants.id("whitenoise")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       
/*    */       }
/*    */       else {
/*    */ 
/*    */         
/* 27 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*    */ 
/*    */ 
/*    */             
/* 31 */             .get(TBSConstants.id("whitenoise")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       } 
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 39 */     if (world instanceof Level) {
/* 40 */       Level _level = (Level)world;
/* 41 */       if (!_level.isClientSide()) {
/* 42 */         _level.playSound(null, 
/*    */             
/* 44 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 45 */             .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       
/*    */       }
/*    */       else {
/*    */ 
/*    */         
/* 51 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*    */ 
/*    */ 
/*    */             
/* 55 */             .get(ResourceLocation.parse("ambient.cave")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nothing\NothingiswatchingPriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */