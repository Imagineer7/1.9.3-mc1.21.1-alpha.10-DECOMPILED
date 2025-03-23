/*    */ package dev.wendigodrip.thebrokenscript.procedures;
/*    */ import java.util.HashMap;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.gui.components.EditBox;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
/*    */ import net.minecraft.resources.ResourceKey;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.server.level.ServerPlayer;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\020\006\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JB\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\b\020\t\032\004\030\0010\n2\036\020\013\032\032\022\002\b\003\022\002\b\003\030\0010\fj\f\022\002\b\003\022\002\b\003\030\001`\rH\007¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/PcguibuttonpressProcedure;", "", "<init>", "()V", "execute", "", "x", "", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "guistate", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "thebrokenscript"})
/*    */ public final class PcguibuttonpressProcedure {
/*    */   @JvmStatic
/*    */   public static final void execute(double x, double z, @Nullable Entity entity, @Nullable HashMap guistate) {
/* 16 */     EditBox _tf = null;
/* 17 */     if (entity == null || guistate == null) {
/*    */       return;
/*    */     }
/* 20 */     Intrinsics.checkNotNull(guistate.get("text:pcline"), "null cannot be cast to non-null type net.minecraft.client.gui.components.EditBox"); if (Intrinsics.areEqual(guistate.containsKey("text:pcline") ? ((EditBox)guistate.get("text:pcline")).getValue() : "", "sv.exit")) {
/* 21 */       if (entity instanceof ServerPlayer && !((ServerPlayer)entity).level().isClientSide()) {
/* 22 */         ResourceKey destinationType = Level.OVERWORLD;
/* 23 */         if (((ServerPlayer)entity).level().dimension() == destinationType) {
/*    */           return;
/*    */         }
/* 26 */         ServerLevel nextLevel = ((ServerPlayer)entity).server.getLevel(destinationType);
/* 27 */         if (nextLevel != null) {
/* 28 */           ((ServerPlayer)entity).connection.send(
/* 29 */               (Packet)new ClientboundGameEventPacket(
/* 30 */                 ClientboundGameEventPacket.WIN_GAME, 0.0F));
/*    */ 
/*    */           
/* 33 */           ((ServerPlayer)entity).teleportTo(
/* 34 */               nextLevel, ((ServerPlayer)entity).getX(), ((ServerPlayer)entity).getY(), ((ServerPlayer)entity).getZ(), ((ServerPlayer)entity).getYRot(), ((ServerPlayer)entity).getXRot());
/*    */           
/* 36 */           ((ServerPlayer)entity).connection.send((Packet)new ClientboundPlayerAbilitiesPacket(((ServerPlayer)entity).getAbilities()));
/* 37 */           for (MobEffectInstance _effectinstance : ((ServerPlayer)entity).getActiveEffects()) {
/* 38 */             ((ServerPlayer)entity).connection.send(
/* 39 */                 (Packet)new ClientboundUpdateMobEffectPacket((
/* 40 */                   (ServerPlayer)entity).getId(), _effectinstance, false));
/*    */           }
/*    */ 
/*    */           
/* 44 */           ((ServerPlayer)entity).connection.send((Packet)new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
/*    */         } 
/*    */       } 
/* 47 */       entity.teleportTo(x, 80.0D, z);
/* 48 */       if (entity instanceof ServerPlayer) {
/* 49 */         ((ServerPlayer)entity).connection.teleport(x, 80.0D, z, ((ServerPlayer)entity).getYRot(), ((ServerPlayer)entity).getXRot());
/*    */       }
/*    */     } 
/* 52 */     Intrinsics.checkNotNull(guistate.get("text:pcline"), "null cannot be cast to non-null type net.minecraft.client.gui.components.EditBox"); if (Intrinsics.areEqual(guistate.containsKey("text:pcline") ? ((EditBox)guistate.get("text:pcline")).getValue() : "", "null") && guistate.get("text:pcline") instanceof EditBox) {
/* 53 */       Intrinsics.checkNotNull(guistate.get("text:pcline"), "null cannot be cast to non-null type net.minecraft.client.gui.components.EditBox"); _tf = (EditBox)guistate.get("text:pcline");
/* 54 */       _tf.setValue("Outside");
/*    */     } 
/* 56 */     Intrinsics.checkNotNull(guistate.get("text:pcline"), "null cannot be cast to non-null type net.minecraft.client.gui.components.EditBox"); if (Intrinsics.areEqual(guistate.containsKey("text:pcline") ? ((EditBox)guistate.get("text:pcline")).getValue() : "", "xXram2dieXx") && guistate.get("text:pcline") instanceof EditBox) {
/* 57 */       Intrinsics.checkNotNull(guistate.get("text:pcline"), "null cannot be cast to non-null type net.minecraft.client.gui.components.EditBox"); _tf = (EditBox)guistate.get("text:pcline");
/* 58 */       _tf.setValue("Error");
/*    */     } 
/* 60 */     Intrinsics.checkNotNull(guistate.get("text:pcline"), "null cannot be cast to non-null type net.minecraft.client.gui.components.EditBox"); if (Intrinsics.areEqual(guistate.containsKey("text:pcline") ? ((EditBox)guistate.get("text:pcline")).getValue() : "", "Integrity") && guistate.get("text:pcline") instanceof EditBox) {
/* 61 */       Intrinsics.checkNotNull(guistate.get("text:pcline"), "null cannot be cast to non-null type net.minecraft.client.gui.components.EditBox"); _tf = (EditBox)guistate.get("text:pcline");
/* 62 */       _tf.setValue("ERR.NEXTNIGHT");
/*    */     } 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final PcguibuttonpressProcedure INSTANCE = new PcguibuttonpressProcedure();
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\PcguibuttonpressProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */