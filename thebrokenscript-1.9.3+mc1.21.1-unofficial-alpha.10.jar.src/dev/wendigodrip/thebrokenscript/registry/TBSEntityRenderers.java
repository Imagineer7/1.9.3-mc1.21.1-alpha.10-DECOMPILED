/*     */ package dev.wendigodrip.thebrokenscript.registry;
/*     */ import dev.wendigodrip.thebrokenscript.client.renderer.BasicTexturedRenderer;
/*     */ import dev.wendigodrip.thebrokenscript.client.renderer.ChunkRemoverRenderer;
/*     */ import dev.wendigodrip.thebrokenscript.client.renderer.FarawayRenderer;
/*     */ import dev.wendigodrip.thebrokenscript.client.renderer.MazeChaserRenderer;
/*     */ import dev.wendigodrip.thebrokenscript.client.renderer.entnull.NullWatchingRenderer;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.client.renderer.entity.EntityRenderer;
/*     */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.neoforged.fml.common.EventBusSubscriber;
/*     */ import net.neoforged.neoforge.client.event.EntityRenderersEvent;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @EventBusSubscriber(value = {Dist.CLIENT}, bus = EventBusSubscriber.Bus.MOD)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007¨\006\b"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSEntityRenderers;", "", "<init>", "()V", "registerEntityRenderers", "", "event", "Lnet/neoforged/neoforge/client/event/EntityRenderersEvent$RegisterRenderers;", "thebrokenscript"})
/*     */ public final class TBSEntityRenderers {
/*     */   @SubscribeEvent
/*     */   public final void registerEntityRenderers(@NotNull EntityRenderersEvent.RegisterRenderers event) {
/*  20 */     Intrinsics.checkNotNullParameter(event, "event"); event.registerEntityRenderer(
/*  21 */         (EntityType)TBSEntities.NULLL.get(), BasicTexturedRenderer.Companion.create("textures/entities/null.png"));
/*     */     
/*  23 */     event.registerEntityRenderer(
/*  24 */         (EntityType)TBSEntities.SILUET.get(), 
/*  25 */         TBSEntityRenderers::registerEntityRenderers$lambda$0);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  30 */     event.registerEntityRenderer(
/*  31 */         (EntityType)TBSEntities.SILUET_CHASE.get(), 
/*  32 */         TBSEntityRenderers::registerEntityRenderers$lambda$1);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  37 */     event.registerEntityRenderer(
/*  38 */         (EntityType)TBSEntities.STRIKE.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  40 */     event.registerEntityRenderer(
/*  41 */         (EntityType)TBSEntities.NOTHINGISWATCHING.get(), 
/*  42 */         TBSEntityRenderers::registerEntityRenderers$lambda$2);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  47 */     event.registerEntityRenderer(
/*  48 */         (EntityType)TBSEntities.NOTHINGISWATCHINGCHASE.get(), 
/*  49 */         TBSEntityRenderers::registerEntityRenderers$lambda$3);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  54 */     event.registerEntityRenderer(
/*  55 */         (EntityType)TBSEntities.RANDOM_STRUCTURE.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  57 */     event.registerEntityRenderer(
/*  58 */         (EntityType)TBSEntities.FARAWAY.get(), 
/*  59 */         TBSEntityRenderers::registerEntityRenderers$lambda$4);
/*  60 */     event.registerEntityRenderer(
/*  61 */         (EntityType)TBSEntities.JFRAME_1ENTITY.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  63 */     event.registerEntityRenderer(
/*  64 */         (EntityType)TBSEntities.JFRAME_2ENTITY.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  66 */     event.registerEntityRenderer(
/*  67 */         (EntityType)TBSEntities.JFRAME_3ENTITY.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  69 */     event.registerEntityRenderer(
/*  70 */         (EntityType)TBSEntities.JFRAME_4ENTITY.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  72 */     event.registerEntityRenderer(
/*  73 */         (EntityType)TBSEntities.JFRAME_5ENTITY.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  75 */     event.registerEntityRenderer(
/*  76 */         (EntityType)TBSEntities.JUMPOSCOROOO.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  78 */     event.registerEntityRenderer(
/*  79 */         (EntityType)TBSEntities.NULL_SCARE.get(), 
/*  80 */         TBSEntityRenderers::registerEntityRenderers$lambda$5);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  85 */     event.registerEntityRenderer(
/*  86 */         (EntityType)TBSEntities.WRONG_OVERLAY.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  88 */     event.registerEntityRenderer(
/*  89 */         (EntityType)TBSEntities.FOLLOW.get(), 
/*  90 */         TBSEntityRenderers::registerEntityRenderers$lambda$6);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  95 */     event.registerEntityRenderer(
/*  96 */         (EntityType)TBSEntities.JUMPOSCROOOO.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/*  98 */     event.registerEntityRenderer(
/*  99 */         (EntityType)TBSEntities.NULL_FLYING.get(), 
/* 100 */         TBSEntityRenderers::registerEntityRenderers$lambda$7);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 105 */     event.registerEntityRenderer(
/* 106 */         (EntityType)TBSEntities.NULL_WATCHING.get(), 
/* 107 */         TBSEntityRenderers::registerEntityRenderers$lambda$8);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 112 */     event.registerEntityRenderer(
/* 113 */         (EntityType)TBSEntities.NULL_ENDGAME.get(), 
/* 114 */         TBSEntityRenderers::registerEntityRenderers$lambda$9);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 119 */     event.registerEntityRenderer(
/* 120 */         (EntityType)TBSEntities.SILUET_STARE.get(), 
/* 121 */         TBSEntityRenderers::registerEntityRenderers$lambda$10);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 126 */     event.registerEntityRenderer(
/* 127 */         (EntityType)TBSEntities.BEHIND_YOU_OVERLAY.get(), 
/* 128 */         TBSEntityRenderers::registerEntityRenderers$lambda$11);
/*     */ 
/*     */     
/* 131 */     event.registerEntityRenderer(
/* 132 */         (EntityType)TBSEntities.WE_CAN_HEAR_U_OVERLAY.get(), 
/* 133 */         BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/* 135 */     event.registerEntityRenderer(
/* 136 */         (EntityType)TBSEntities.CANT_YOU_SEE.get(), 
/* 137 */         TBSEntityRenderers::registerEntityRenderers$lambda$12);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 142 */     event.registerEntityRenderer(
/* 143 */         (EntityType)TBSEntities.NULL_INVADE_BASE.get(), 
/* 144 */         TBSEntityRenderers::registerEntityRenderers$lambda$13);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 149 */     event.registerEntityRenderer(
/* 150 */         (EntityType)TBSEntities.NULL_TP_BEACON.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/* 152 */     event.registerEntityRenderer(
/* 153 */         (EntityType)TBSEntities.HE.get(), 
/* 154 */         TBSEntityRenderers::registerEntityRenderers$lambda$14);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 159 */     event.registerEntityRenderer(
/* 160 */         (EntityType)TBSEntities.BSOD.get(), 
/* 161 */         TBSEntityRenderers::registerEntityRenderers$lambda$15);
/* 162 */     event.registerEntityRenderer(
/* 163 */         (EntityType)TBSEntities.MAZE_CHASER.get(), 
/* 164 */         TBSEntityRenderers::registerEntityRenderers$lambda$16);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 169 */     event.registerEntityRenderer(
/* 170 */         (EntityType)TBSEntities.MAZE_SHADOWS.get(), 
/* 171 */         TBSEntityRenderers::registerEntityRenderers$lambda$17);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 176 */     event.registerEntityRenderer(
/* 177 */         (EntityType)TBSEntities.CIRCUIT_STALK.get(), 
/* 178 */         TBSEntityRenderers::registerEntityRenderers$lambda$18);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 183 */     event.registerEntityRenderer(
/* 184 */         (EntityType)TBSEntities.CIRCUIT_STARE.get(), 
/* 185 */         TBSEntityRenderers::registerEntityRenderers$lambda$19);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     event.registerEntityRenderer(
/* 191 */         (EntityType)TBSEntities.CIRCUIT_TP_BEACON.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/* 193 */     event.registerEntityRenderer(
/* 194 */         (EntityType)TBSEntities.THE_BROKEN_END.get(), 
/* 195 */         TBSEntityRenderers::registerEntityRenderers$lambda$20);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 200 */     event.registerEntityRenderer(
/* 201 */         (EntityType)TBSEntities.THE_BROKEN_END_STALK.get(), 
/* 202 */         TBSEntityRenderers::registerEntityRenderers$lambda$21);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 207 */     event.registerEntityRenderer(
/* 208 */         (EntityType)TBSEntities.THE_OBLITERATION.get(), 
/* 209 */         TBSEntityRenderers::registerEntityRenderers$lambda$22);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     event.registerEntityRenderer(
/* 215 */         (EntityType)TBSEntities.THE_BROKEN_END_STALKK.get(), 
/* 216 */         TBSEntityRenderers::registerEntityRenderers$lambda$23);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 221 */     event.registerEntityRenderer(
/* 222 */         (EntityType)TBSEntities.OUT_OF_CAVE_CHECK.get(), 
/* 223 */         TBSEntityRenderers::registerEntityRenderers$lambda$24);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 228 */     event.registerEntityRenderer(
/* 229 */         (EntityType)TBSEntities.DOTSFRAME_1.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/* 231 */     event.registerEntityRenderer(
/* 232 */         (EntityType)TBSEntities.DOTSFRAME_2.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/* 234 */     event.registerEntityRenderer(
/* 235 */         (EntityType)TBSEntities.DOTSFRAME_3.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/* 237 */     event.registerEntityRenderer(
/* 238 */         (EntityType)TBSEntities.DOTSFRAME_4.get(), BasicTexturedRenderer.Companion.create("textures/entities/gandoniovinvize.png"));
/*     */     
/* 240 */     event.registerEntityRenderer(
/* 241 */         (EntityType)TBSEntities.XXRAM_2DIE.get(), 
/* 242 */         TBSEntityRenderers::registerEntityRenderers$lambda$25);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 247 */     event.registerEntityRenderer(
/* 248 */         (EntityType)TBSEntities.BAN.get(), BasicTexturedRenderer.Companion.create("textures/entities/revuxor.png"));
/*     */     
/* 250 */     event.registerEntityRenderer(
/* 251 */         (EntityType)TBSEntities.NULL_IS_HERE.get(), 
/* 252 */         TBSEntityRenderers::registerEntityRenderers$lambda$26);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 257 */     event.registerEntityRenderer(
/* 258 */         (EntityType)TBSEntities.STARE.get(), 
/* 259 */         TBSEntityRenderers::registerEntityRenderers$lambda$27);
/* 260 */     event.registerEntityRenderer(
/* 261 */         (EntityType)TBSEntities.CIRCUIT_MINESHAFT_STARE.get(), 
/* 262 */         TBSEntityRenderers::registerEntityRenderers$lambda$28);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 267 */     event.registerEntityRenderer(
/* 268 */         (EntityType)TBSEntities.DECEIVER.get(), 
/* 269 */         TBSEntityRenderers::registerEntityRenderers$lambda$29);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 274 */     event.registerEntityRenderer(
/* 275 */         (EntityType)TBSEntities.CORRUPTION.get(), 
/* 276 */         TBSEntityRenderers::registerEntityRenderers$lambda$30);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 281 */     event.registerEntityRenderer(
/* 282 */         (EntityType)TBSEntities.NULL_MINING.get(), 
/* 283 */         TBSEntityRenderers::registerEntityRenderers$lambda$31);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 288 */     event.registerEntityRenderer(
/* 289 */         (EntityType)TBSEntities.ENTITY_SPAWNER.get(), 
/* 290 */         TBSEntityRenderers::registerEntityRenderers$lambda$32);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 295 */     event.registerEntityRenderer(
/* 296 */         (EntityType)TBSEntities.INTEGRITY.get(), 
/* 297 */         TBSEntityRenderers::registerEntityRenderers$lambda$33);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 302 */     event.registerEntityRenderer(
/* 303 */         (EntityType)TBSEntities.MISSILE.get(), 
/* 304 */         TBSEntityRenderers::registerEntityRenderers$lambda$34);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 309 */     event.registerEntityRenderer(
/* 310 */         (EntityType)TBSEntities.INTEGRITY_BOSSFIGHT.get(), 
/* 311 */         TBSEntityRenderers::registerEntityRenderers$lambda$35);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 316 */     event.registerEntityRenderer(
/* 317 */         (EntityType)TBSEntities.CHUNK_REMOVER.get(), 
/* 318 */         TBSEntityRenderers::registerEntityRenderers$lambda$36);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 323 */     event.registerEntityRenderer(
/* 324 */         (EntityType)TBSEntities.THE_BROKEN_END_OVERHAUL_STALK.get(), 
/* 325 */         TBSEntityRenderers::registerEntityRenderers$lambda$37);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 330 */     event.registerEntityRenderer(
/* 331 */         (EntityType)TBSEntities.HEROBRINE.get(), 
/* 332 */         TBSEntityRenderers::registerEntityRenderers$lambda$38);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 337 */     event.registerEntityRenderer(
/* 338 */         (EntityType)TBSEntities.CIRCUIT_MINESHAFT_WALK.get(), 
/* 339 */         TBSEntityRenderers::registerEntityRenderers$lambda$39);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 344 */     event.registerEntityRenderer(
/* 345 */         (EntityType)TBSEntities.CIRCUIT_MINESHAFT_FLEE.get(), 
/* 346 */         TBSEntityRenderers::registerEntityRenderers$lambda$40);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 351 */     event.registerEntityRenderer(
/* 352 */         (EntityType)TBSEntities.CIRCUIT_DISGUISED_AS_CREEPER.get(), 
/* 353 */         TBSEntityRenderers::registerEntityRenderers$lambda$41);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 358 */     event.registerEntityRenderer(
/* 359 */         (EntityType)TBSEntities.CIRCUIT_JUMPSCARE_FRAME_ENTITY.get(), 
/* 360 */         TBSEntityRenderers::registerEntityRenderers$lambda$42);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 365 */     event.registerEntityRenderer(
/* 366 */         (EntityType)TBSEntities.PHANTOM_PLAYER.get(), 
/* 367 */         TBSEntityRenderers::registerEntityRenderers$lambda$43);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 372 */     event.registerEntityRenderer(
/* 373 */         (EntityType)TBSEntities.HETZER.get(), 
/* 374 */         TBSEntityRenderers::registerEntityRenderers$lambda$44);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 379 */     event.registerEntityRenderer(
/* 380 */         (EntityType)TBSEntities.CURVED.get(), 
/* 381 */         TBSEntityRenderers::registerEntityRenderers$lambda$45);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 386 */     event.registerEntityRenderer(
/* 387 */         (EntityType)TBSEntities.CIRCUIT.get(), 
/* 388 */         TBSEntityRenderers::registerEntityRenderers$lambda$46);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 393 */     event.registerEntityRenderer(
/* 394 */         (EntityType)TBSEntities.FALSE_VILLAGER.get(), 
/* 395 */         TBSEntityRenderers::registerEntityRenderers$lambda$47);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 400 */     event.registerEntityRenderer(
/* 401 */         (EntityType)TBSEntities.PIG_CIRCUIT.get(), 
/* 402 */         TBSEntityRenderers::registerEntityRenderers$lambda$48);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 407 */     event.registerEntityRenderer(
/* 408 */         (EntityType)TBSEntities.NULL_UNBEATABLE_BOSSFIGHT.get(), 
/* 409 */         TBSEntityRenderers::registerEntityRenderers$lambda$49);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 414 */     event.registerEntityRenderer((EntityType)TBSEntities.SUB_ANOMALY_1.get(), dev.wendigodrip.thebrokenscript.client.renderer.SubAnomaly1Renderer::new);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final TBSEntityRenderers INSTANCE = new TBSEntityRenderers();
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$0(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new SiluetRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$1(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new SiluetChaseRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$2(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new NothingiswatchingRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$3(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new NothingiswatchingchaseRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$4(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new FarawayRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$5(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new NullScareRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$6(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new FollowRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$7(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new NullFlyingRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$8(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new NullWatchingRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$9(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new NullEndgameRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$10(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new SiluetStareRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$11(EntityRendererProvider.Context it) {
/*     */     Intrinsics.checkNotNull(it);
/*     */     return (EntityRenderer)new BehindYouOverlayRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$12(EntityRendererProvider.Context it) {
/*     */     Intrinsics.checkNotNull(it);
/*     */     return (EntityRenderer)new CantYouSeeRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$13(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new NullInvadeBaseRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$14(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new HeRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$15(EntityRendererProvider.Context it) {
/*     */     Intrinsics.checkNotNull(it);
/*     */     return (EntityRenderer)new BsodRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$16(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new MazeChaserRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$17(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new MazeShadowsRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$18(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new CircuitStalkRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$19(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new CircuitStareRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$20(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new TheBrokenEndRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$21(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new TheBrokenEndStalkRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$22(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new TheObliterationRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$23(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new TheBrokenEndStalkkRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$24(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new OutOfCaveCheckRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$25(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new Xxram2dieRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$26(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new NullIsHereRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$27(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new StareRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$28(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new CircuitMineshaftStareRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$29(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new DeceiverRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$30(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new CorruptionRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$31(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new NullMiningRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$32(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new EntitySpawnerRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$33(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new IntegrityRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$34(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new MissileRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$35(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new IntegrityBossfightRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$36(EntityRendererProvider.Context it) {
/*     */     Intrinsics.checkNotNull(it);
/*     */     return (EntityRenderer)new ChunkRemoverRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$37(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new TheBrokenEndOverhaulStalkRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$38(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new HerobrineRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$39(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new CircuitMineshaftWalkRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$40(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new CircuitMineshaftFleeRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$41(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new CircuitDisguisedAsCreeperRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$42(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new CircuitJumpscareFrameEntityRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$43(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new PhantomPlayerRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$44(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new HetzerRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$45(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new CurvedRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$46(EntityRendererProvider.Context renderManager) {
/*     */     return (EntityRenderer)new CircuitRenderer(renderManager);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$47(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new FalseVillagerRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$48(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new PigCircuitRenderer(it);
/*     */   }
/*     */   
/*     */   private static final EntityRenderer registerEntityRenderers$lambda$49(EntityRendererProvider.Context it) {
/*     */     return (EntityRenderer)new NullUnbeatableBossfightRenderer(it);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSEntityRenderers.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */