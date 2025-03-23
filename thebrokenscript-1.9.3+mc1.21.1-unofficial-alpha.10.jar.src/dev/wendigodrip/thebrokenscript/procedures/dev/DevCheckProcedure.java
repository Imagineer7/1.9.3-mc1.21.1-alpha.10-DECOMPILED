/*    */ package dev.wendigodrip.thebrokenscript.procedures.dev;
/*    */ 
/*    */ import dev.wendigodrip.thebrokenscript.entity.CircuitEntity;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*    */ import java.util.HashMap;
/*    */ import net.minecraft.client.gui.components.AbstractWidget;
/*    */ import net.minecraft.client.gui.components.EditBox;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DevCheckProcedure {
/*    */   public static final int DEV_CODE = 2018;
/*    */   
/*    */   public static void execute(LevelAccessor world, BlockPos pos, HashMap<String, AbstractWidget> guistate) {
/* 19 */     if (guistate == null) {
/*    */       return;
/*    */     }
/*    */     
/* 23 */     if ((guistate.containsKey("text:dev_code") ? ((EditBox)guistate.get("text:dev_code")).getValue() : "").equals(
/* 24 */         String.valueOf(2018))) {
/* 25 */       if (world instanceof ServerLevel) { ServerLevel level = (ServerLevel)world;
/* 26 */         for (int i = 0; i < 1000; i++) {
/* 27 */           CircuitEntity ent = (CircuitEntity)((EntityType)TBSEntities.CIRCUIT.get()).spawn(level, pos, MobSpawnType.MOB_SUMMONED);
/*    */           
/* 29 */           if (ent != null) {
/* 30 */             ent.setYRot(world.getRandom().nextFloat() * 360.0F);
/*    */           }
/*    */         }  }
/*    */     
/* 34 */     } else if (!world.isClientSide() && world.getServer() != null) {
/* 35 */       world.getServer().getPlayerList().broadcastSystemMessage((Component)Component.literal("F A L S E"), false);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\dev\DevCheckProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */