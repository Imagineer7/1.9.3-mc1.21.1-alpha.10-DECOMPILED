/*     */ package dev.wendigodrip.thebrokenscript.entity;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.network.syncher.EntityDataAccessor;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\013\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\004\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\006\020\021\032\0020\022R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\bR\027\020\t\032\b\022\004\022\0020\n0\005¢\006\b\n\000\032\004\b\013\020\bR\027\020\f\032\b\022\004\022\0020\r0\005¢\006\b\n\000\032\004\b\016\020\bR\027\020\017\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\020\020\b¨\006\023"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/HetzerEntity$Companion;", "", "<init>", "()V", "SHOOT", "Lnet/minecraft/network/syncher/EntityDataAccessor;", "", "getSHOOT", "()Lnet/minecraft/network/syncher/EntityDataAccessor;", "TEXTURE", "", "getTEXTURE", "ANGER_METER", "", "getANGER_METER", "IS_LOOKED_AT", "getIS_LOOKED_AT", "createAttributes", "Lnet/minecraft/world/entity/ai/attributes/AttributeSupplier$Builder;", "thebrokenscript"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final EntityDataAccessor<Boolean> getSHOOT() {
/* 182 */     return HetzerEntity.access$getSHOOT$cp();
/*     */   }
/*     */   @NotNull
/*     */   public final EntityDataAccessor<String> getTEXTURE() {
/* 186 */     return HetzerEntity.access$getTEXTURE$cp();
/*     */   }
/*     */   @NotNull
/*     */   public final EntityDataAccessor<Integer> getANGER_METER() {
/* 190 */     return HetzerEntity.access$getANGER_METER$cp();
/*     */   }
/*     */   @NotNull
/*     */   public final EntityDataAccessor<Boolean> getIS_LOOKED_AT() {
/* 194 */     return HetzerEntity.access$getIS_LOOKED_AT$cp();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final AttributeSupplier.Builder createAttributes() {
/* 201 */     Intrinsics.checkNotNullExpressionValue(Monster.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.0D).add(Attributes.MAX_HEALTH, 900.0D).add(Attributes.ARMOR, 50.0D).add(Attributes.ATTACK_DAMAGE, 13.0D).add(Attributes.FOLLOW_RANGE, 1916.0D).add(Attributes.KNOCKBACK_RESISTANCE, 50.0D).add(Attributes.FLYING_SPEED, 0.0D), "add(...)"); return Monster.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.0D).add(Attributes.MAX_HEALTH, 900.0D).add(Attributes.ARMOR, 50.0D).add(Attributes.ATTACK_DAMAGE, 13.0D).add(Attributes.FOLLOW_RANGE, 1916.0D).add(Attributes.KNOCKBACK_RESISTANCE, 50.0D).add(Attributes.FLYING_SPEED, 0.0D);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\HetzerEntity$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */