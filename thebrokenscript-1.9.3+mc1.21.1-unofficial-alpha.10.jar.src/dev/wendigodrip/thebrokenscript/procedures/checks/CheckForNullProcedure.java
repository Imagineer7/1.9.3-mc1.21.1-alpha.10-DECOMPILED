/*     */ package dev.wendigodrip.thebrokenscript.procedures.checks;
/*     */ import dev.wendigodrip.thebrokenscript.entity.CircuitStalkEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.NullWatchingEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndStalkkEntity;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSEntities;
/*     */ import dev.wendigodrip.thebrokenscript.registry.TBSSounds;
/*     */ import dev.wendigodrip.thebrokenscript.util.EntityExt;
/*     */ import dev.wendigodrip.thebrokenscript.util.EntityFinder;
/*     */ import dev.wendigodrip.thebrokenscript.util.WorldExt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.util.Mth;
/*     */ import net.minecraft.util.RandomSource;
/*     */ import net.minecraft.world.effect.MobEffects;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.neoforged.neoforge.event.tick.PlayerTickEvent;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J\030\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\fH\002¨\006\r"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/checks/CheckForNullProcedure;", "", "<init>", "()V", "onPlayerTick", "", "event", "Lnet/neoforged/neoforge/event/tick/PlayerTickEvent$Post;", "execute", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class CheckForNullProcedure {
/*     */   @SubscribeEvent
/*     */   public final void onPlayerTick(@NotNull PlayerTickEvent.Post event) {
/*  30 */     Intrinsics.checkNotNullParameter(event, "event"); Intrinsics.checkNotNullExpressionValue(event.getEntity().level(), "level(...)"); Intrinsics.checkNotNullExpressionValue(event.getEntity(), "getEntity(...)"); execute(event.getEntity().level(), (Entity)event.getEntity());
/*     */   } @NotNull
/*     */   public static final CheckForNullProcedure INSTANCE = new CheckForNullProcedure();
/*     */   private final void execute(Level level, Entity entity) {
/*  34 */     Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, NullWatchingEntity.class, entity.position(), 1000.0D).isEmpty()) {
/*  35 */       double ray = Mth.nextInt(RandomSource.create(), 1, 500);
/*     */       
/*  37 */       BlockHitResult rayCast = entity.level().clip(
/*  38 */           new ClipContext(
/*  39 */             entity.getEyePosition(1.0F), 
/*  40 */             entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(ray)), 
/*  41 */             ClipContext.Block.OUTLINE, 
/*  42 */             ClipContext.Fluid.NONE, 
/*  43 */             entity));
/*     */ 
/*     */ 
/*     */       
/*  47 */       Intrinsics.checkNotNullExpressionValue(rayCast.getBlockPos().getCenter(), "getCenter(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, NullWatchingEntity.class, rayCast.getBlockPos().getCenter(), 5.0D).isEmpty()) {
/*  48 */         Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); NullWatchingEntity closest = (NullWatchingEntity)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, NullWatchingEntity.class, entity.position(), 1000.0D);
/*     */         
/*  50 */         if (closest != null && !closest.level().isClientSide()) {
/*  51 */           closest.discard();
/*     */         }
/*     */         
/*  54 */         if (Math.random() < 0.5D) {
/*  55 */           if (Math.random() < 0.7D && level instanceof ServerLevel) {
/*  56 */             TimeOfDay.MIDNIGHT.set((ServerLevel)level);
/*     */           }
/*     */         }
/*  59 */         else if (level instanceof ServerLevel) {
/*  60 */           ((EntityType)TBSEntities.NULL_SCARE.get()).spawn(
/*  61 */               (ServerLevel)level, 
/*  62 */               BlockPos.containing((Position)entity.position().add(2.0D, 0.0D, 0.0D)), 
/*  63 */               MobSpawnType.MOB_SUMMONED);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/*  70 */     Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, CircuitStalkEntity.class, entity.position(), 1000.0D).isEmpty()) {
/*  71 */       double ray = Mth.nextInt(RandomSource.create(), 1, 500);
/*     */       
/*  73 */       BlockHitResult rayCast = entity.level().clip(
/*  74 */           new ClipContext(
/*  75 */             entity.getEyePosition(1.0F), 
/*  76 */             entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(ray)), 
/*  77 */             ClipContext.Block.OUTLINE, 
/*  78 */             ClipContext.Fluid.NONE, 
/*  79 */             entity));
/*     */ 
/*     */ 
/*     */       
/*  83 */       Intrinsics.checkNotNullExpressionValue(rayCast.getBlockPos().getCenter(), "getCenter(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, CircuitStalkEntity.class, rayCast.getBlockPos().getCenter(), 5.0D).isEmpty()) {
/*  84 */         Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); CircuitStalkEntity closest = (CircuitStalkEntity)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, CircuitStalkEntity.class, entity.position(), 1000.0D);
/*     */         
/*  86 */         if (closest != null && !closest.level().isClientSide()) {
/*  87 */           closest.discard();
/*     */         }
/*     */         
/*  90 */         if (Math.random() < 0.5D) {
/*  91 */           if (entity instanceof LivingEntity && !entity.level().isClientSide()) {
/*  92 */             ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 500, 1));
/*     */           }
/*     */           
/*  95 */           Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getINTEGRITYWATCHING().get(), "get(...)"); WorldExt.tryPlaySound$default(WorldExt.INSTANCE, level, entity.position(), (SoundEvent)TBSSounds.INSTANCE.getINTEGRITYWATCHING().get(), 555.0F, 0.0F, null, 16, null);
/*     */           
/*  97 */           if (Math.random() < 0.7D && level instanceof ServerLevel) {
/*  98 */             TimeOfDay.MIDNIGHT.set((ServerLevel)level);
/*     */           }
/*     */         }
/* 101 */         else if (level instanceof ServerLevel) {
/* 102 */           ((EntityType)TBSEntities.CIRCUIT.get()).spawn((ServerLevel)level, rayCast.getBlockPos(), MobSpawnType.MOB_SUMMONED);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 108 */     Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, TheBrokenEndStalkkEntity.class, entity.position(), 1000.0D).isEmpty()) {
/* 109 */       double ray = Mth.nextInt(RandomSource.create(), 1, 500);
/*     */       
/* 111 */       BlockHitResult rayCast = entity.level().clip(
/* 112 */           new ClipContext(
/* 113 */             entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(
/* 114 */               entity.getViewVector(1.0F).scale(ray)), 
/* 115 */             ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity));
/*     */ 
/*     */ 
/*     */       
/* 119 */       Intrinsics.checkNotNullExpressionValue(rayCast.getBlockPos().getCenter(), "getCenter(...)");
/* 120 */       if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, TheBrokenEndStalkkEntity.class, rayCast.getBlockPos().getCenter(), 5.0D).isEmpty()) {
/*     */ 
/*     */         
/* 123 */         Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); TheBrokenEndStalkkEntity closest = (TheBrokenEndStalkkEntity)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)level, TheBrokenEndStalkkEntity.class, entity.position(), 1000.0D);
/*     */         
/* 125 */         if (closest != null && !closest.level().isClientSide()) {
/* 126 */           closest.discard();
/*     */         }
/*     */         
/* 129 */         if (Math.random() < 0.5D) {
/* 130 */           if (entity instanceof LivingEntity && !entity.level().isClientSide()) {
/* 131 */             ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 500, 1));
/*     */           }
/*     */           
/* 134 */           Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getHEARTBEAT().get(), "get(...)"); WorldExt.tryPlaySound$default(WorldExt.INSTANCE, level, entity.position(), (SoundEvent)TBSSounds.INSTANCE.getHEARTBEAT().get(), 555.0F, 0.0F, null, 16, null);
/*     */           
/* 136 */           if (Math.random() < 0.7D && level instanceof ServerLevel) {
/* 137 */             TimeOfDay.MIDNIGHT.set((ServerLevel)level);
/*     */           }
/*     */         }
/* 140 */         else if (level instanceof ServerLevel) {
/* 141 */           ((EntityType)TBSEntities.THE_BROKEN_END.get()).spawn((ServerLevel)level, rayCast.getBlockPos(), MobSpawnType.MOB_SUMMONED);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 147 */     Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, NothingiswatchingEntity.class, entity.position(), 1000.0D).isEmpty()) {
/* 148 */       double ray = Mth.nextInt(RandomSource.create(), 1, 500);
/*     */       
/* 150 */       BlockHitResult rayCast = entity.level().clip(
/* 151 */           new ClipContext(
/* 152 */             entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(
/* 153 */               entity.getViewVector(1.0F).scale(ray)), 
/* 154 */             ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity));
/*     */ 
/*     */ 
/*     */       
/* 158 */       Intrinsics.checkNotNullExpressionValue(rayCast.getBlockPos().getCenter(), "getCenter(...)");
/* 159 */       if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, NothingiswatchingEntity.class, rayCast.getBlockPos().getCenter(), 5.0D).isEmpty()) {
/*     */         
/* 161 */         Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); EntityExt.discardNearest$default(EntityExt.INSTANCE, NothingiswatchingEntity.class, entity.position(), level, 0.0D, 4, null);
/*     */         
/* 163 */         if (Math.random() < 0.5D) {
/* 164 */           if (entity instanceof LivingEntity && !entity.level().isClientSide()) {
/* 165 */             ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 500, 1));
/*     */           }
/*     */           
/* 168 */           Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getGLITHCSOUND1().get(), "get(...)"); WorldExt.tryPlaySound$default(WorldExt.INSTANCE, level, entity.position(), (SoundEvent)TBSSounds.INSTANCE.getGLITHCSOUND1().get(), 555.0F, 0.0F, null, 16, null);
/*     */           
/* 170 */           if (Math.random() < 0.7D && level instanceof ServerLevel) {
/* 171 */             TimeOfDay.MIDNIGHT.set((ServerLevel)level);
/*     */           }
/*     */         }
/* 174 */         else if (level instanceof ServerLevel) {
/* 175 */           ((EntityType)TBSEntities.NOTHINGISWATCHINGCHASE.get())
/* 176 */             .spawn((ServerLevel)level, rayCast.getBlockPos(), MobSpawnType.MOB_SUMMONED);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 182 */     Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, SiluetStareEntity.class, entity.position(), 1000.0D).isEmpty()) {
/* 183 */       double ray = Mth.nextInt(RandomSource.create(), 1, 500);
/*     */       
/* 185 */       BlockHitResult rayCast = entity.level().clip(
/* 186 */           new ClipContext(
/* 187 */             entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(
/* 188 */               entity.getViewVector(1.0F).scale(ray)), 
/* 189 */             ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity));
/*     */ 
/*     */ 
/*     */       
/* 193 */       Intrinsics.checkNotNullExpressionValue(rayCast.getBlockPos().getCenter(), "getCenter(...)"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, SiluetStareEntity.class, rayCast.getBlockPos().getCenter(), 5.0D).isEmpty()) {
/* 194 */         Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); EntityExt.discardNearest$default(EntityExt.INSTANCE, SiluetStareEntity.class, entity.position(), level, 0.0D, 4, null);
/*     */         
/* 196 */         if (Math.random() < 0.5D) {
/* 197 */           if (entity instanceof LivingEntity && !entity.level().isClientSide()) {
/* 198 */             ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 500, 1));
/*     */           }
/*     */           
/* 201 */           Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getNULLISHERELOOP().get(), "get(...)"); WorldExt.tryPlaySound$default(WorldExt.INSTANCE, level, entity.position(), (SoundEvent)TBSSounds.INSTANCE.getNULLISHERELOOP().get(), 555.0F, 0.0F, null, 16, null);
/*     */           
/* 203 */           if (Math.random() < 0.7D && level instanceof ServerLevel) {
/* 204 */             TimeOfDay.MIDNIGHT.set((ServerLevel)level);
/*     */           }
/*     */         }
/* 207 */         else if (level instanceof ServerLevel) {
/* 208 */           ((EntityType)TBSEntities.SILUET_CHASE.get()).spawn((ServerLevel)level, rayCast.getBlockPos(), MobSpawnType.MOB_SUMMONED);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 214 */     Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)");
/* 215 */     if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, CircuitMineshaftStareEntity.class, entity.position(), 1000.0D).isEmpty()) {
/*     */       
/* 217 */       double ray = Mth.nextInt(RandomSource.create(), 1, 500);
/*     */       
/* 219 */       BlockHitResult rayCast = entity.level().clip(
/* 220 */           new ClipContext(
/* 221 */             entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(
/* 222 */               entity.getViewVector(1.0F).scale(ray)), 
/* 223 */             ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity));
/*     */ 
/*     */ 
/*     */       
/* 227 */       Intrinsics.checkNotNullExpressionValue(rayCast.getBlockPos().getCenter(), "getCenter(...)");
/* 228 */       if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, CircuitMineshaftStareEntity.class, rayCast.getBlockPos().getCenter(), 5.0D).isEmpty()) {
/*     */         
/* 230 */         Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); EntityExt.discardNearest$default(EntityExt.INSTANCE, CircuitMineshaftStareEntity.class, entity.position(), level, 0.0D, 4, null);
/*     */         
/* 232 */         if (Math.random() < 0.5D) {
/* 233 */           if (entity instanceof LivingEntity && !entity.level().isClientSide()) {
/* 234 */             ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 10, 2));
/*     */           }
/*     */           
/* 237 */           Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getYOUKNOWNOTHING().get(), "get(...)"); WorldExt.tryPlaySound$default(WorldExt.INSTANCE, level, entity.position(), (SoundEvent)TBSSounds.INSTANCE.getYOUKNOWNOTHING().get(), 555.0F, 0.0F, null, 16, null);
/*     */         }
/* 239 */         else if (level instanceof ServerLevel) {
/* 240 */           ((EntityType)TBSEntities.CIRCUIT.get()).spawn((ServerLevel)level, rayCast.getBlockPos(), MobSpawnType.MOB_SUMMONED);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */ 
/*     */     
/* 246 */     Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)");
/* 247 */     if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, NullFlyingEntity.class, entity.position(), 1000.0D).isEmpty()) {
/*     */       
/* 249 */       double ray = Mth.nextInt(RandomSource.create(), 1, 500);
/*     */       
/* 251 */       BlockHitResult rayCast = entity.level().clip(
/* 252 */           new ClipContext(
/* 253 */             entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(
/* 254 */               entity.getViewVector(1.0F).scale(ray)), 
/* 255 */             ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity));
/*     */ 
/*     */ 
/*     */       
/* 259 */       Intrinsics.checkNotNullExpressionValue(rayCast.getBlockPos().getCenter(), "getCenter(...)");
/* 260 */       if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)level, NullFlyingEntity.class, rayCast.getBlockPos().getCenter(), 5.0D).isEmpty()) {
/*     */         
/* 262 */         Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); EntityExt.discardNearest$default(EntityExt.INSTANCE, NullFlyingEntity.class, entity.position(), level, 0.0D, 4, null);
/*     */         
/* 264 */         if (Math.random() < 0.5D) {
/* 265 */           if (entity instanceof LivingEntity && !entity.level().isClientSide()) {
/* 266 */             ((LivingEntity)entity).addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 10, 2));
/*     */           }
/*     */           
/* 269 */           Intrinsics.checkNotNullExpressionValue(entity.position(), "position(...)"); Intrinsics.checkNotNullExpressionValue(TBSSounds.INSTANCE.getYOUKNOWNOTHING().get(), "get(...)"); WorldExt.tryPlaySound$default(WorldExt.INSTANCE, level, entity.position(), (SoundEvent)TBSSounds.INSTANCE.getYOUKNOWNOTHING().get(), 555.0F, 0.0F, null, 16, null);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\checks\CheckForNullProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */