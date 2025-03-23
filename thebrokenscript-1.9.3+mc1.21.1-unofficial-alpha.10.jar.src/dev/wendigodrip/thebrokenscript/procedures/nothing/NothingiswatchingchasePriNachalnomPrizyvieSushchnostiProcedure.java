/*    */ package dev.wendigodrip.thebrokenscript.procedures.nothing;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.registries.BuiltInRegistries;
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
/*    */ public class NothingiswatchingchasePriNachalnomPrizyvieSushchnostiProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 21 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 24 */     if (world instanceof Level) { Level _level = (Level)world;
/* 25 */       if (!_level.isClientSide()) {
/* 26 */         _level.playSound(null, 
/*    */             
/* 28 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/* 29 */             .get(TBSConstants.id("nullchase")), SoundSource.NEUTRAL, 555.0F, 0.0F);
/*    */       
/*    */       }
/*    */       else {
/*    */ 
/*    */         
/* 35 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*    */ 
/*    */ 
/*    */             
/* 39 */             .get(TBSConstants.id("nullchase")), SoundSource.NEUTRAL, 555.0F, 0.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 47 */     TheBrokenScript.queueServerWork(800, () -> {
/*    */           if (world instanceof ServerLevel) {
/*    */             ServerLevel _level = (ServerLevel)world;
/*    */             _level.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", (Component)Component.literal(""), _level.getServer(), null)).withSuppressedOutput(), "stopsound");
/*    */           } 
/*    */           if (!entity.level().isClientSide())
/*    */             entity.discard(); 
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nothing\NothingiswatchingchasePriNachalnomPrizyvieSushchnostiProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */