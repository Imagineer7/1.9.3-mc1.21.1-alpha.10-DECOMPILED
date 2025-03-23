/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import java.io.FileWriter;
/*    */ import java.io.IOException;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.level.LevelEvent;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @EventBusSubscriber({Dist.DEDICATED_SERVER})
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\007J\006\020\b\032\0020\005J\022\020\b\032\0020\0052\b\020\006\032\004\030\0010\tH\002¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/YouNeedToRealiseProcedure;", "", "<init>", "()V", "onWorldLoad", "", "event", "Lnet/neoforged/neoforge/event/level/LevelEvent$Load;", "execute", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class YouNeedToRealiseProcedure {
/*    */   @SubscribeEvent
/*    */   public final void onWorldLoad(@Nullable LevelEvent.Load event) {
/* 15 */     execute((Event)event);
/*    */   } @NotNull
/*    */   public static final YouNeedToRealiseProcedure INSTANCE = new YouNeedToRealiseProcedure();
/*    */   public final void execute() {
/* 19 */     execute(null);
/*    */   }
/*    */   
/*    */   private final void execute(Event event) {
/*    */     try {
/* 24 */       String desktopPath = System.getProperty("user.home") + "\\Desktop";
/* 25 */       String filePath = desktopPath + "\\serverpropertites.txt";
/* 26 */       String content = 
/* 27 */         "K̸̜̦̀͋̋̑́̌Ĩ̷̘͎̑̽̅̕L̷̛͉̉̊́̌̒ͅL̴̫̩̓̈̍̕͝ ̶̡̣͕̠̮̑̊͑̍̈́H̸̢̻͉̗͈̃̾̆̂̈́Ì̵̯̕M̵͙̞͌̐̊͆";
/* 28 */       FileWriter writer = new FileWriter(filePath);
/* 29 */       writer.write(content);
/* 30 */       writer.close();
/* 31 */     } catch (IOException e) {
/* 32 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\YouNeedToRealiseProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */