/*     */ package dev.wendigodrip.thebrokenscript.entity.anim;
/*     */ import dev.wendigodrip.thebrokenscript.entity.CircuitStalkEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndOverhaulStalkEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndStalkkEntity;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.neoforged.neoforge.event.tick.EntityTickEvent;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/anim/EntityAnimationFactory;", "", "<init>", "()V", "onEntityTick", "", "event", "Lnet/neoforged/neoforge/event/tick/EntityTickEvent$Post;", "thebrokenscript"})
/*     */ public final class EntityAnimationFactory {
/*     */   @SubscribeEvent
/*     */   public final void onEntityTick(@Nullable EntityTickEvent.Post event) {
/*  14 */     if (event != null) {
/*  15 */       Monster syncable = null;
/*  16 */       String animation = null;
/*     */       
/*  18 */       if (!(event.getEntity() instanceof net.minecraft.world.entity.LivingEntity))
/*     */         return; 
/*  20 */       Entity ent = event.getEntity();
/*     */       
/*  22 */       if (ent instanceof SiluetEntity && !Intrinsics.areEqual(((SiluetEntity)ent).getSyncedAnimation(), "undefined")) {
/*  23 */         animation = ((SiluetEntity)ent).getSyncedAnimation();
/*  24 */         ((SiluetEntity)ent).setAnimation("undefined");
/*  25 */         ((SiluetEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  28 */       if (ent instanceof SiluetChaseEntity && !Intrinsics.areEqual(((SiluetChaseEntity)ent).getSyncedAnimation(), "undefined")) {
/*  29 */         animation = ((SiluetChaseEntity)ent).getSyncedAnimation();
/*  30 */         ((SiluetChaseEntity)ent).setAnimation("undefined");
/*  31 */         ((SiluetChaseEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  34 */       if (ent instanceof NothingiswatchingEntity && !Intrinsics.areEqual(((NothingiswatchingEntity)ent).getSyncedAnimation(), "undefined")) {
/*  35 */         animation = ((NothingiswatchingEntity)ent).getSyncedAnimation();
/*  36 */         ((NothingiswatchingEntity)ent).setAnimation("undefined");
/*  37 */         ((NothingiswatchingEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  40 */       if (ent instanceof NothingiswatchingchaseEntity && !Intrinsics.areEqual(((NothingiswatchingchaseEntity)ent).getSyncedAnimation(), "undefined")) {
/*  41 */         animation = ((NothingiswatchingchaseEntity)ent).getSyncedAnimation();
/*  42 */         ((NothingiswatchingchaseEntity)ent).setAnimation("undefined");
/*  43 */         ((NothingiswatchingchaseEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  46 */       if (ent instanceof FollowEntity && !Intrinsics.areEqual(((FollowEntity)ent).getSyncedAnimation(), "undefined")) {
/*  47 */         animation = ((FollowEntity)ent).getSyncedAnimation();
/*  48 */         ((FollowEntity)ent).setAnimation("undefined");
/*  49 */         ((FollowEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  52 */       if (ent instanceof SiluetStareEntity && !Intrinsics.areEqual(((SiluetStareEntity)ent).getSyncedAnimation(), "undefined")) {
/*  53 */         animation = ((SiluetStareEntity)ent).getSyncedAnimation();
/*  54 */         ((SiluetStareEntity)ent).setAnimation("undefined");
/*  55 */         ((SiluetStareEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  58 */       if (ent instanceof HeEntity && !Intrinsics.areEqual(((HeEntity)ent).getSyncedAnimation(), "undefined")) {
/*  59 */         animation = ((HeEntity)ent).getSyncedAnimation();
/*  60 */         ((HeEntity)ent).setAnimation("undefined");
/*  61 */         ((HeEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  64 */       if (ent instanceof MazeChaserEntity && !Intrinsics.areEqual(((MazeChaserEntity)ent).getSyncedAnimation(), "undefined")) {
/*  65 */         animation = ((MazeChaserEntity)ent).getSyncedAnimation();
/*  66 */         ((MazeChaserEntity)ent).setAnimation("undefined");
/*  67 */         ((MazeChaserEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  70 */       if (ent instanceof CircuitStalkEntity && !Intrinsics.areEqual(((CircuitStalkEntity)ent).getSyncedAnimation(), "undefined")) {
/*  71 */         animation = ((CircuitStalkEntity)ent).getSyncedAnimation();
/*  72 */         ((CircuitStalkEntity)ent).setAnimation("undefined");
/*  73 */         ((CircuitStalkEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  76 */       if (ent instanceof CircuitStareEntity && !Intrinsics.areEqual(((CircuitStareEntity)ent).getSyncedAnimation(), "undefined")) {
/*  77 */         animation = ((CircuitStareEntity)ent).getSyncedAnimation();
/*  78 */         ((CircuitStareEntity)ent).setAnimation("undefined");
/*  79 */         ((CircuitStareEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  82 */       if (ent instanceof TheBrokenEndEntity && !Intrinsics.areEqual(((TheBrokenEndEntity)ent).getSyncedAnimation(), "undefined")) {
/*  83 */         animation = ((TheBrokenEndEntity)ent).getSyncedAnimation();
/*  84 */         ((TheBrokenEndEntity)ent).setAnimation("undefined");
/*  85 */         ((TheBrokenEndEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/*  88 */       if (ent instanceof TheObliterationEntity && !Intrinsics.areEqual(((TheObliterationEntity)ent).getSyncedAnimation(), "undefined")) {
/*  89 */         animation = ((TheObliterationEntity)ent).getSyncedAnimation();
/*  90 */         ((TheObliterationEntity)ent).setAnimation("undefined");
/*  91 */         ((TheObliterationEntity)ent).setAnimationprocedure(animation);
/*     */       } 
/*     */       
/*  94 */       if (ent instanceof TheBrokenEndStalkkEntity && !Intrinsics.areEqual(((TheBrokenEndStalkkEntity)ent).getSyncedAnimation(), "undefined")) {
/*  95 */         animation = ((TheBrokenEndStalkkEntity)ent).getSyncedAnimation();
/*  96 */         ((TheBrokenEndStalkkEntity)ent).setAnimation("undefined");
/*  97 */         ((TheBrokenEndStalkkEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 100 */       if (ent instanceof Xxram2dieEntity && !Intrinsics.areEqual(((Xxram2dieEntity)ent).getSyncedAnimation(), "undefined")) {
/* 101 */         animation = ((Xxram2dieEntity)ent).getSyncedAnimation();
/* 102 */         ((Xxram2dieEntity)ent).setAnimation("undefined");
/* 103 */         ((Xxram2dieEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 106 */       if (ent instanceof CircuitMineshaftStareEntity && !Intrinsics.areEqual(((CircuitMineshaftStareEntity)ent).getSyncedAnimation(), "undefined")) {
/* 107 */         animation = ((CircuitMineshaftStareEntity)ent).getSyncedAnimation();
/* 108 */         ((CircuitMineshaftStareEntity)ent).setAnimation("undefined");
/* 109 */         ((CircuitMineshaftStareEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 112 */       if (ent instanceof IntegrityEntity && !Intrinsics.areEqual(((IntegrityEntity)ent).getSyncedAnimation(), "undefined")) {
/* 113 */         animation = ((IntegrityEntity)ent).getSyncedAnimation();
/* 114 */         ((IntegrityEntity)ent).setAnimation("undefined");
/* 115 */         ((IntegrityEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 118 */       if (ent instanceof MissileEntity && !Intrinsics.areEqual(((MissileEntity)ent).getSyncedAnimation(), "undefined")) {
/* 119 */         animation = ((MissileEntity)ent).getSyncedAnimation();
/* 120 */         ((MissileEntity)ent).setAnimation("undefined");
/* 121 */         ((MissileEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 124 */       if (ent instanceof IntegrityBossfightEntity && !Intrinsics.areEqual(((IntegrityBossfightEntity)ent).getSyncedAnimation(), "undefined")) {
/* 125 */         animation = ((IntegrityBossfightEntity)ent).getSyncedAnimation();
/* 126 */         ((IntegrityBossfightEntity)ent).setAnimation("undefined");
/* 127 */         ((IntegrityBossfightEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 130 */       if (ent instanceof TheBrokenEndOverhaulStalkEntity && !Intrinsics.areEqual(((TheBrokenEndOverhaulStalkEntity)ent).getSyncedAnimation(), "undefined")) {
/* 131 */         animation = ((TheBrokenEndOverhaulStalkEntity)ent).getSyncedAnimation();
/* 132 */         ((TheBrokenEndOverhaulStalkEntity)ent).setAnimation("undefined");
/* 133 */         ((TheBrokenEndOverhaulStalkEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 136 */       if (ent instanceof CircuitMineshaftWalkEntity && !Intrinsics.areEqual(((CircuitMineshaftWalkEntity)ent).getSyncedAnimation(), "undefined")) {
/* 137 */         animation = ((CircuitMineshaftWalkEntity)ent).getSyncedAnimation();
/* 138 */         ((CircuitMineshaftWalkEntity)ent).setAnimation("undefined");
/* 139 */         ((CircuitMineshaftWalkEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 142 */       if (ent instanceof CircuitMineshaftFleeEntity && !Intrinsics.areEqual(((CircuitMineshaftFleeEntity)ent).getSyncedAnimation(), "undefined")) {
/* 143 */         animation = ((CircuitMineshaftFleeEntity)ent).getSyncedAnimation();
/* 144 */         ((CircuitMineshaftFleeEntity)ent).setAnimation("undefined");
/* 145 */         ((CircuitMineshaftFleeEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 148 */       if (ent instanceof HetzerEntity && !Intrinsics.areEqual(((HetzerEntity)ent).getSyncedAnimation(), "undefined")) {
/* 149 */         animation = ((HetzerEntity)ent).getSyncedAnimation();
/* 150 */         ((HetzerEntity)ent).setAnimation("undefined");
/* 151 */         ((HetzerEntity)ent).setAnimationprocedure(animation);
/*     */       } 
/*     */       
/* 154 */       if (ent instanceof CurvedEntity && !Intrinsics.areEqual(((CurvedEntity)ent).getSyncedAnimation(), "undefined")) {
/* 155 */         animation = ((CurvedEntity)ent).getSyncedAnimation();
/* 156 */         ((CurvedEntity)ent).setAnimation("undefined");
/* 157 */         ((CurvedEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */       
/* 160 */       if (ent instanceof CircuitEntity && !Intrinsics.areEqual(((CircuitEntity)ent).getSyncedAnimation(), "undefined")) {
/* 161 */         animation = ((CircuitEntity)ent).getSyncedAnimation();
/* 162 */         ((CircuitEntity)ent).setAnimation("undefined");
/* 163 */         ((CircuitEntity)ent).animationprocedure = animation;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final EntityAnimationFactory INSTANCE = new EntityAnimationFactory();
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\anim\EntityAnimationFactory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */