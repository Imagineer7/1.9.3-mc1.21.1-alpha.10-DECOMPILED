/*    */ package dev.wendigodrip.thebrokenscript.procedures.brokenend;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import net.minecraft.commands.CommandSource;
/*    */ import net.minecraft.commands.CommandSourceStack;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.GameRules;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec2;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class TheBrokenEndOverhaulStalkOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 19 */     ((GameRules.BooleanValue)world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT)).set(false, world
/*    */         
/* 21 */         .getServer());
/*    */     
/* 23 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 24 */       _level.getServer()
/* 25 */         .getCommands()
/* 26 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 34 */             (Component)Component.literal(""), _level
/* 35 */             .getServer(), null))
/*    */           
/* 37 */           .withSuppressedOutput(), "weather rain"); }
/*    */ 
/*    */     
/* 40 */     TheBrokenScript.queueServerWork(18000, () -> {
/*    */           if (!entity.level().isClientSide())
/*    */             entity.discard(); 
/*    */           ((GameRules.BooleanValue)world.getLevelData().getGameRules().getRule(GameRules.RULE_DAYLIGHT)).set(true, world.getServer());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\brokenend\TheBrokenEndOverhaulStalkOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */