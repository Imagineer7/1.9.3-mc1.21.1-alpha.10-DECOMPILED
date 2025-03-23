/*    */ package dev.wendigodrip.thebrokenscript.procedures.misc;
/*    */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*    */ import java.util.List;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.animal.Cat;
/*    */ import net.minecraft.world.entity.animal.Dolphin;
/*    */ import net.minecraft.world.entity.animal.Fox;
/*    */ import net.minecraft.world.entity.animal.allay.Allay;
/*    */ import net.minecraft.world.entity.animal.horse.TraderLlama;
/*    */ import net.minecraft.world.entity.monster.Drowned;
/*    */ import net.minecraft.world.entity.monster.hoglin.Hoglin;
/*    */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*    */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*    */ import net.neoforged.bus.api.ICancellableEvent;
/*    */ import net.neoforged.bus.api.SubscribeEvent;
/*    */ import net.neoforged.fml.common.EventBusSubscriber;
/*    */ import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\030\020\b\032\0020\0052\006\020\006\032\0020\t2\006\020\n\032\0020\013H\002¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/misc/DropNewMobSpawns;", "", "<init>", "()V", "onEntitySpawned", "", "event", "Lnet/neoforged/neoforge/event/entity/EntityJoinLevelEvent;", "execute", "Lnet/neoforged/bus/api/ICancellableEvent;", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*    */ public final class DropNewMobSpawns {
/*    */   @SubscribeEvent
/*    */   public final void onEntitySpawned(@NotNull EntityJoinLevelEvent event) {
/* 27 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getEntity(), "getEntity(...)"); execute((ICancellableEvent)event, event.getEntity());
/*    */   } @NotNull
/*    */   public static final DropNewMobSpawns INSTANCE = new DropNewMobSpawns();
/*    */   private final void execute(ICancellableEvent event, Entity entity) {
/* 31 */     if ((TBSConfigs.COMMON != null) ? ((TBSConfigs.COMMON.getDisableNewMobSpawning() == true)) : false) {
/*    */       return;
/*    */     }
/* 34 */     Class[] arrayOfClass = new Class[20]; arrayOfClass[0] = Bat.class; arrayOfClass[1] = 
/* 35 */       Drowned.class;
/* 36 */     arrayOfClass[2] = GlowSquid.class;
/* 37 */     arrayOfClass[3] = Phantom.class;
/* 38 */     arrayOfClass[4] = Bee.class;
/* 39 */     arrayOfClass[5] = Allay.class;
/* 40 */     arrayOfClass[6] = Fox.class;
/* 41 */     arrayOfClass[7] = Cat.class;
/* 42 */     arrayOfClass[8] = Goat.class;
/* 43 */     arrayOfClass[9] = TropicalFish.class;
/* 44 */     arrayOfClass[10] = Panda.class;
/* 45 */     arrayOfClass[11] = Pufferfish.class;
/* 46 */     arrayOfClass[12] = Dolphin.class;
/* 47 */     arrayOfClass[13] = TraderLlama.class;
/* 48 */     arrayOfClass[14] = WanderingTrader.class;
/* 49 */     arrayOfClass[15] = Turtle.class;
/* 50 */     arrayOfClass[16] = Hoglin.class;
/* 51 */     arrayOfClass[17] = Piglin.class;
/* 52 */     arrayOfClass[18] = PiglinBrute.class;
/* 53 */     arrayOfClass[19] = Sniffer.class;
/*    */     
/*    */     List mobs = CollectionsKt.listOf((Object[])arrayOfClass);
/* 56 */     if (mobs.contains(entity.getClass()) && !event.isCanceled())
/* 57 */       event.setCanceled(true); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\misc\DropNewMobSpawns.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */