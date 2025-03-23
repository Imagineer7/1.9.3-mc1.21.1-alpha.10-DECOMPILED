/*    */ package dev.wendigodrip.thebrokenscript.entity.anim;
/*    */ 
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import software.bernie.geckolib.animation.AnimationState;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\016\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\026\030\000 \0332\0020\001:\001\033B\037\022\016\020\002\032\n\022\006\b\001\022\0020\0010\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\024\020\027\032\0020\0302\n\020\031\032\006\022\002\b\0030\032H\004R\032\020\b\032\0020\tX\016¢\006\016\n\000\032\004\b\n\020\013\"\004\b\f\020\rR\032\020\016\032\0020\tX\016¢\006\016\n\000\032\004\b\017\020\013\"\004\b\020\020\rR\021\020\021\032\0020\t8F¢\006\006\032\004\b\022\020\013R$\020\024\032\0020\t2\006\020\023\032\0020\t8F@FX\016¢\006\f\032\004\b\025\020\013\"\004\b\026\020\r¨\006\034"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/anim/AnimatedMonster;", "Lnet/minecraft/world/entity/monster/Monster;", "entityType", "Lnet/minecraft/world/entity/EntityType;", "level", "Lnet/minecraft/world/level/Level;", "<init>", "(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", "animationprocedure", "", "getAnimationprocedure", "()Ljava/lang/String;", "setAnimationprocedure", "(Ljava/lang/String;)V", "prevAnim", "getPrevAnim", "setPrevAnim", "syncedAnimation", "getSyncedAnimation", "value", "animation", "getAnimation", "setAnimation", "procedurePredicate", "Lsoftware/bernie/geckolib/animation/PlayState;", "event", "Lsoftware/bernie/geckolib/animation/AnimationState;", "Companion", "thebrokenscript"})
/*    */ public class AnimatedMonster extends Monster {
/*    */   @NotNull
/*    */   public final String getAnimationprocedure() {
/*    */     return this.animationprocedure;
/*    */   }
/*    */   
/* 14 */   public AnimatedMonster(@NotNull EntityType entityType, @NotNull Level level) { super(entityType, level);
/* 15 */     this.animationprocedure = "empty";
/* 16 */     this.prevAnim = "empty"; } @NotNull public final String getPrevAnim() { return this.prevAnim; } public final void setAnimationprocedure(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.animationprocedure = <set-?>; } public final void setPrevAnim(@NotNull String <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.prevAnim = <set-?>; }
/*    */    @NotNull
/*    */   public final String getSyncedAnimation() {
/* 19 */     Intrinsics.checkNotNullExpressionValue(this.entityData.get(ANIMATION), "get(...)"); return (String)this.entityData.get(ANIMATION);
/*    */   }
/*    */   @NotNull
/* 22 */   public final String getAnimation() { return getSyncedAnimation(); } public final void setAnimation(@NotNull String value) {
/* 23 */     Intrinsics.checkNotNullParameter(value, "value"); this.entityData.set(ANIMATION, value);
/*    */   } @NotNull
/*    */   protected final PlayState procedurePredicate(@NotNull AnimationState event) {
/* 26 */     Intrinsics.checkNotNullParameter(event, "event"); if ((!Intrinsics.areEqual(this.animationprocedure, "empty") && event.getController().getAnimationState() == AnimationController.State.STOPPED) || (!Intrinsics.areEqual(this.animationprocedure, this.prevAnim) && !Intrinsics.areEqual(this.animationprocedure, "empty"))) {
/* 27 */       if (!Intrinsics.areEqual(this.animationprocedure, this.prevAnim)) {
/* 28 */         event.getController().forceAnimationReset();
/*    */       }
/*    */       
/* 31 */       event.getController().setAnimation(RawAnimation.begin().thenPlay(this.animationprocedure));
/*    */       
/* 33 */       if (event.getController().getAnimationState() == AnimationController.State.STOPPED) {
/* 34 */         this.animationprocedure = "empty";
/* 35 */         event.getController().forceAnimationReset();
/*    */       } 
/* 37 */     } else if (Intrinsics.areEqual(this.animationprocedure, "empty")) {
/* 38 */       this.prevAnim = "empty";
/*    */       
/* 40 */       return PlayState.STOP;
/*    */     } 
/*    */     
/* 43 */     this.prevAnim = this.animationprocedure;
/*    */     
/* 45 */     return PlayState.CONTINUE;
/*    */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/anim/AnimatedMonster$Companion;", "", "<init>", "()V", "ANIMATION", "Lnet/minecraft/network/syncher/EntityDataAccessor;", "", "getANIMATION", "()Lnet/minecraft/network/syncher/EntityDataAccessor;", "thebrokenscript"})
/*    */   public static final class Companion { private Companion() {}
/*    */     @NotNull
/* 49 */     public final EntityDataAccessor<String> getANIMATION() { return AnimatedMonster.ANIMATION; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private String animationprocedure; @NotNull private String prevAnim; @NotNull private static final EntityDataAccessor<String> ANIMATION = SynchedEntityData.defineId(
/* 50 */       AnimatedMonster.class, EntityDataSerializers.STRING); static { Intrinsics.checkNotNullExpressionValue(SynchedEntityData.defineId(AnimatedMonster.class, EntityDataSerializers.STRING), "defineId(...)"); }
/*    */ 
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\anim\AnimatedMonster.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */