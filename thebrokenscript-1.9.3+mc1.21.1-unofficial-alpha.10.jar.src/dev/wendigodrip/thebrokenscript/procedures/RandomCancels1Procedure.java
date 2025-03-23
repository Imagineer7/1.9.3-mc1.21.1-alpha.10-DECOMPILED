/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.npc.Villager;
/*    */ import net.neoforged.bus.api.Event;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\020\020\b\032\0020\0052\b\020\t\032\004\030\0010\nJ\034\020\b\032\0020\0052\b\020\006\032\004\030\0010\0132\b\020\t\032\004\030\0010\nH\002¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/RandomCancels1Procedure;", "", "<init>", "()V", "onEntitySpawned", "", "event", "Lnet/neoforged/neoforge/event/entity/EntityJoinLevelEvent;", "execute", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*    */ public final class RandomCancels1Procedure {
/*    */   @SubscribeEvent
/*    */   public final void onEntitySpawned(@NotNull EntityJoinLevelEvent event) {
/* 18 */     Intrinsics.checkNotNullParameter(event, "event"); execute((Event)event, event.getEntity());
/*    */   } @NotNull
/*    */   public static final RandomCancels1Procedure INSTANCE = new RandomCancels1Procedure();
/*    */   public final void execute(@Nullable Entity entity) {
/* 22 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private final void execute(Event event, Entity entity) {
/* 26 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 29 */     if (entity instanceof Villager) {
/* 30 */       if (Math.random() < 0.5D) {
/* 31 */         ((Villager)entity).setCustomName((Component)Component.literal("TESTIFICATE"));
/*    */       }
/* 33 */     } else if (entity.getType().is(
/* 34 */         TagKey.create(
/* 35 */           Registries.ENTITY_TYPE, TBSConstants.id("despawnable")))) {
/*    */       
/* 37 */       if (Math.random() < 0.01D)
/*    */       {
/* 39 */         if (Math.random() < 0.7D) {
/* 40 */           entity.setCustomName((Component)Component.literal(
/* 41 */                 "01001000 01100101 00100000 01110111 01101001 01101100 01101100 00100000 01100110 01101001 01101110 01100100 00100000 01111001 01101111 01110101"));
/*    */         } else {
/*    */           
/* 44 */           entity.setCustomName((Component)Component.literal("01001000 01100101 01101100 01101100 01101111"));
/*    */         } 
/*    */       }
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\RandomCancels1Procedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */