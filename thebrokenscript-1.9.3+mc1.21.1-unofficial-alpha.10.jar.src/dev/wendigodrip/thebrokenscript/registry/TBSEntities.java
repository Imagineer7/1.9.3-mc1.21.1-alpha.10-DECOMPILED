/*     */ package dev.wendigodrip.thebrokenscript.registry;
/*     */ import dev.wendigodrip.thebrokenscript.entity.JumposcrooooEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.NothingiswatchingchaseEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.NullTpBeaconEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndOverhaulStalkEntity;
/*     */ import dev.wendigodrip.thebrokenscript.entity.TheBrokenEndStalkkEntity;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.MobCategory;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
/*     */ import net.neoforged.neoforge.registries.DeferredHolder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000æ\003\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003JI\020\001\032\031\022\b\022\006\022\002\b\0030\006\022\013\022\t\022\005\022\003H\0010\0060\n\"\f\b\000\020\001*\005\030\0010\0012\b\020\001\032\0030\0012\017\020\001\032\n\022\005\022\003H\0010\001H\002J\024\020\001\032\0030\0012\b\020\001\032\0030 \001H\007J\024\020¡\001\032\0030\0012\b\020\001\032\0030¢\001H\007R\033\020\004\032\f\022\b\022\006\022\002\b\0030\0060\005¢\006\b\n\000\032\004\b\007\020\bR(\020\t\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0130\0060\n8\006X\004¢\006\002\n\000R(\020\f\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\r0\0060\n8\006X\004¢\006\002\n\000R(\020\016\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0170\0060\n8\006X\004¢\006\002\n\000R(\020\020\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0210\0060\n8\006X\004¢\006\002\n\000R(\020\022\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0230\0060\n8\006X\004¢\006\002\n\000R(\020\024\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0250\0060\n8\006X\004¢\006\002\n\000R(\020\026\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0270\0060\n8\006X\004¢\006\002\n\000R(\020\030\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0310\0060\n8\006X\004¢\006\002\n\000R(\020\032\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0330\0060\n8\006X\004¢\006\002\n\000R(\020\034\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0350\0060\n8\006X\004¢\006\002\n\000R(\020\036\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010\0370\0060\n8\006X\004¢\006\002\n\000R(\020 \032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010!0\0060\n8\006X\004¢\006\002\n\000R(\020\"\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010#0\0060\n8\006X\004¢\006\002\n\000R(\020$\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010%0\0060\n8\006X\004¢\006\002\n\000R(\020&\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010'0\0060\n8\006X\004¢\006\002\n\000R(\020(\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010)0\0060\n8\006X\004¢\006\002\n\000R(\020*\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010+0\0060\n8\006X\004¢\006\002\n\000R(\020,\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010-0\0060\n8\006X\004¢\006\002\n\000R(\020.\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010/0\0060\n8\006X\004¢\006\002\n\000R(\0200\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\001010\0060\n8\006X\004¢\006\002\n\000R(\0202\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\001030\0060\n8\006X\004¢\006\002\n\000R(\0204\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\001050\0060\n8\006X\004¢\006\002\n\000R(\0206\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\001070\0060\n8\006X\004¢\006\002\n\000R(\0208\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\001090\0060\n8\006X\004¢\006\002\n\000R(\020:\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010;0\0060\n8\006X\004¢\006\002\n\000R(\020<\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010=0\0060\n8\006X\004¢\006\002\n\000R(\020>\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010?0\0060\n8\006X\004¢\006\002\n\000R(\020@\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010A0\0060\n8\006X\004¢\006\002\n\000R(\020B\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010C0\0060\n8\006X\004¢\006\002\n\000R(\020D\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010E0\0060\n8\006X\004¢\006\002\n\000R(\020F\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010G0\0060\n8\006X\004¢\006\002\n\000R(\020H\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010I0\0060\n8\006X\004¢\006\002\n\000R(\020J\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010K0\0060\n8\006X\004¢\006\002\n\000R(\020L\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010M0\0060\n8\006X\004¢\006\002\n\000R(\020N\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010O0\0060\n8\006X\004¢\006\002\n\000R(\020P\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010Q0\0060\n8\006X\004¢\006\002\n\000R&\020R\032\030\022\b\022\006\022\002\b\0030\006\022\n\022\b\022\004\022\0020S0\0060\n8\006X\004¢\006\002\n\000R(\020T\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010U0\0060\n8\006X\004¢\006\002\n\000R(\020V\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010W0\0060\n8\006X\004¢\006\002\n\000R(\020X\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010Y0\0060\n8\006X\004¢\006\002\n\000R(\020Z\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010[0\0060\n8\006X\004¢\006\002\n\000R(\020\\\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010]0\0060\n8\006X\004¢\006\002\n\000R(\020^\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010_0\0060\n8\006X\004¢\006\002\n\000R(\020`\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010a0\0060\n8\006X\004¢\006\002\n\000R(\020b\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010c0\0060\n8\006X\004¢\006\002\n\000R(\020d\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010e0\0060\n8\006X\004¢\006\002\n\000R(\020f\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010g0\0060\n8\006X\004¢\006\002\n\000R(\020h\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010i0\0060\n8\006X\004¢\006\002\n\000R(\020j\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010k0\0060\n8\006X\004¢\006\002\n\000R(\020l\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010m0\0060\n8\006X\004¢\006\002\n\000R(\020n\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010o0\0060\n8\006X\004¢\006\002\n\000R(\020p\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010q0\0060\n8\006X\004¢\006\002\n\000R(\020r\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010s0\0060\n8\006X\004¢\006\002\n\000R(\020t\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010u0\0060\n8\006X\004¢\006\002\n\000R(\020v\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010w0\0060\n8\006X\004¢\006\002\n\000R(\020x\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010y0\0060\n8\006X\004¢\006\002\n\000R(\020z\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010{0\0060\n8\006X\004¢\006\002\n\000R(\020|\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\0010}0\0060\n8\006X\004¢\006\002\n\000R(\020~\032\032\022\b\022\006\022\002\b\0030\006\022\f\022\n\022\006\022\004\030\00100\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R*\020\001\032\033\022\b\022\006\022\002\b\0030\006\022\r\022\013\022\007\022\005\030\0010\0010\0060\n8\006X\004¢\006\002\n\000R(\020\001\032\031\022\b\022\006\022\002\b\0030\006\022\013\022\t\022\005\022\0030\0010\0060\n8\006X\004¢\006\002\n\000¨\006£\001"}, d2 = {"Ldev/wendigodrip/thebrokenscript/registry/TBSEntities;", "", "<init>", "()V", "REGISTRY", "Lnet/neoforged/neoforge/registries/DeferredRegister;", "Lnet/minecraft/world/entity/EntityType;", "getREGISTRY", "()Lnet/neoforged/neoforge/registries/DeferredRegister;", "NULLL", "Lnet/neoforged/neoforge/registries/DeferredHolder;", "Ldev/wendigodrip/thebrokenscript/entity/NulllEntity;", "SILUET", "Ldev/wendigodrip/thebrokenscript/entity/SiluetEntity;", "SILUET_CHASE", "Ldev/wendigodrip/thebrokenscript/entity/SiluetChaseEntity;", "STRIKE", "Ldev/wendigodrip/thebrokenscript/entity/StrikeEntity;", "NOTHINGISWATCHING", "Ldev/wendigodrip/thebrokenscript/entity/NothingiswatchingEntity;", "NOTHINGISWATCHINGCHASE", "Ldev/wendigodrip/thebrokenscript/entity/NothingiswatchingchaseEntity;", "RANDOM_STRUCTURE", "Ldev/wendigodrip/thebrokenscript/entity/RandomStructureEntity;", "FARAWAY", "Ldev/wendigodrip/thebrokenscript/entity/FarawayEntity;", "JFRAME_1ENTITY", "Ldev/wendigodrip/thebrokenscript/entity/Jframe1entityEntity;", "JFRAME_2ENTITY", "Ldev/wendigodrip/thebrokenscript/entity/Jframe2entityEntity;", "JFRAME_3ENTITY", "Ldev/wendigodrip/thebrokenscript/entity/Jframe3entityEntity;", "JFRAME_4ENTITY", "Ldev/wendigodrip/thebrokenscript/entity/Jframe4entityEntity;", "JFRAME_5ENTITY", "Ldev/wendigodrip/thebrokenscript/entity/Jframe5entityEntity;", "JUMPOSCOROOO", "Ldev/wendigodrip/thebrokenscript/entity/JumposcoroooEntity;", "NULL_SCARE", "Ldev/wendigodrip/thebrokenscript/entity/NullScareEntity;", "WRONG_OVERLAY", "Ldev/wendigodrip/thebrokenscript/entity/WrongOverlayEntity;", "FOLLOW", "Ldev/wendigodrip/thebrokenscript/entity/FollowEntity;", "JUMPOSCROOOO", "Ldev/wendigodrip/thebrokenscript/entity/JumposcrooooEntity;", "NULL_FLYING", "Ldev/wendigodrip/thebrokenscript/entity/NullFlyingEntity;", "NULL_WATCHING", "Ldev/wendigodrip/thebrokenscript/entity/NullWatchingEntity;", "NULL_ENDGAME", "Ldev/wendigodrip/thebrokenscript/entity/NullEndgameEntity;", "SILUET_STARE", "Ldev/wendigodrip/thebrokenscript/entity/SiluetStareEntity;", "BEHIND_YOU_OVERLAY", "Ldev/wendigodrip/thebrokenscript/entity/BehindYouOverlayEntity;", "WE_CAN_HEAR_U_OVERLAY", "Ldev/wendigodrip/thebrokenscript/entity/WeCanHearUOverlayEntity;", "CANT_YOU_SEE", "Ldev/wendigodrip/thebrokenscript/entity/CantYouSeeEntity;", "NULL_INVADE_BASE", "Ldev/wendigodrip/thebrokenscript/entity/NullInvadeBaseEntity;", "NULL_TP_BEACON", "Ldev/wendigodrip/thebrokenscript/entity/NullTpBeaconEntity;", "HE", "Ldev/wendigodrip/thebrokenscript/entity/HeEntity;", "BSOD", "Ldev/wendigodrip/thebrokenscript/entity/BsodEntity;", "MAZE_CHASER", "Ldev/wendigodrip/thebrokenscript/entity/MazeChaserEntity;", "MAZE_SHADOWS", "Ldev/wendigodrip/thebrokenscript/entity/MazeShadowsEntity;", "CIRCUIT_STALK", "Ldev/wendigodrip/thebrokenscript/entity/CircuitStalkEntity;", "CIRCUIT_STARE", "Ldev/wendigodrip/thebrokenscript/entity/CircuitStareEntity;", "CIRCUIT_TP_BEACON", "Ldev/wendigodrip/thebrokenscript/entity/CircuitTpBeaconEntity;", "THE_BROKEN_END", "Ldev/wendigodrip/thebrokenscript/entity/TheBrokenEndEntity;", "THE_BROKEN_END_STALK", "Ldev/wendigodrip/thebrokenscript/entity/TheBrokenEndStalkEntity;", "THE_OBLITERATION", "Ldev/wendigodrip/thebrokenscript/entity/TheObliterationEntity;", "THE_BROKEN_END_STALKK", "Ldev/wendigodrip/thebrokenscript/entity/TheBrokenEndStalkkEntity;", "OUT_OF_CAVE_CHECK", "Ldev/wendigodrip/thebrokenscript/entity/OutOfCaveCheckEntity;", "DOTSFRAME_1", "Ldev/wendigodrip/thebrokenscript/entity/Dotsframe1Entity;", "DOTSFRAME_2", "Ldev/wendigodrip/thebrokenscript/entity/Dotsframe2Entity;", "DOTSFRAME_3", "Ldev/wendigodrip/thebrokenscript/entity/Dotsframe3Entity;", "DOTSFRAME_4", "Ldev/wendigodrip/thebrokenscript/entity/Dotsframe4Entity;", "XXRAM_2DIE", "Ldev/wendigodrip/thebrokenscript/entity/Xxram2dieEntity;", "BAN", "Ldev/wendigodrip/thebrokenscript/entity/BanEntity;", "NULL_IS_HERE", "Ldev/wendigodrip/thebrokenscript/entity/NullIsHereEntity;", "STARE", "Ldev/wendigodrip/thebrokenscript/entity/StareEntity;", "CIRCUIT_MINESHAFT_STARE", "Ldev/wendigodrip/thebrokenscript/entity/CircuitMineshaftStareEntity;", "DECEIVER", "Ldev/wendigodrip/thebrokenscript/entity/DeceiverEntity;", "CORRUPTION", "Ldev/wendigodrip/thebrokenscript/entity/CorruptionEntity;", "NULL_MINING", "Ldev/wendigodrip/thebrokenscript/entity/NullMiningEntity;", "ENTITY_SPAWNER", "Ldev/wendigodrip/thebrokenscript/entity/EntitySpawnerEntity;", "INTEGRITY", "Ldev/wendigodrip/thebrokenscript/entity/IntegrityEntity;", "MISSILE", "Ldev/wendigodrip/thebrokenscript/entity/MissileEntity;", "INTEGRITY_BOSSFIGHT", "Ldev/wendigodrip/thebrokenscript/entity/IntegrityBossfightEntity;", "CHUNK_REMOVER", "Ldev/wendigodrip/thebrokenscript/entity/ChunkRemoverEntity;", "THE_BROKEN_END_OVERHAUL_STALK", "Ldev/wendigodrip/thebrokenscript/entity/TheBrokenEndOverhaulStalkEntity;", "HEROBRINE", "Ldev/wendigodrip/thebrokenscript/entity/HerobrineEntity;", "CIRCUIT_MINESHAFT_WALK", "Ldev/wendigodrip/thebrokenscript/entity/CircuitMineshaftWalkEntity;", "CIRCUIT_MINESHAFT_FLEE", "Ldev/wendigodrip/thebrokenscript/entity/CircuitMineshaftFleeEntity;", "CIRCUIT_DISGUISED_AS_CREEPER", "Ldev/wendigodrip/thebrokenscript/entity/CircuitDisguisedAsCreeperEntity;", "CIRCUIT_JUMPSCARE_FRAME_ENTITY", "Ldev/wendigodrip/thebrokenscript/entity/CircuitJumpscareFrameEntityEntity;", "PHANTOM_PLAYER", "Ldev/wendigodrip/thebrokenscript/entity/PhantomPlayerEntity;", "HETZER", "Ldev/wendigodrip/thebrokenscript/entity/HetzerEntity;", "CURVED", "Ldev/wendigodrip/thebrokenscript/entity/CurvedEntity;", "CIRCUIT", "Ldev/wendigodrip/thebrokenscript/entity/CircuitEntity;", "FALSE_VILLAGER", "Ldev/wendigodrip/thebrokenscript/entity/FalseVillagerEntity;", "PIG_CIRCUIT", "Ldev/wendigodrip/thebrokenscript/entity/PigCircuitEntity;", "NULL_UNBEATABLE_BOSSFIGHT", "Ldev/wendigodrip/thebrokenscript/entity/NullUnbeatableBossfightEntity;", "SUB_ANOMALY_1", "Ldev/wendigodrip/thebrokenscript/entity/SubAnomaly1Entity;", "register", "T", "Lnet/minecraft/world/entity/Entity;", "registryname", "", "entityTypeBuilder", "Lnet/minecraft/world/entity/EntityType$Builder;", "init", "", "event", "Lnet/neoforged/fml/event/lifecycle/FMLCommonSetupEvent;", "registerAttributes", "Lnet/neoforged/neoforge/event/entity/EntityAttributeCreationEvent;", "thebrokenscript"})
/*     */ public final class TBSEntities {
/*     */   @NotNull
/*  20 */   public static final TBSEntities INSTANCE = new TBSEntities(); @NotNull private static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(
/*  21 */       (Registry)BuiltInRegistries.ENTITY_TYPE, "thebrokenscript"); @NotNull public final DeferredRegister<EntityType<?>> getREGISTRY() { return REGISTRY; } static { Intrinsics.checkNotNullExpressionValue(DeferredRegister.create((Registry)BuiltInRegistries.ENTITY_TYPE, "thebrokenscript"), "create(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  25 */   public static final DeferredHolder<EntityType<?>, EntityType<NulllEntity>> NULLL = INSTANCE.register(
/*  26 */       "nulll", EntityType.Builder.of(
/*  27 */         NulllEntity::new, MobCategory.MONSTER)
/*  28 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(464).setUpdateInterval(3).fireImmune()
/*  29 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(NulllEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(464).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  33 */   public static final DeferredHolder<EntityType<?>, EntityType<SiluetEntity>> SILUET = INSTANCE.register(
/*  34 */       "siluet", EntityType.Builder.of(
/*  35 */         SiluetEntity::new, MobCategory.MONSTER)
/*  36 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(4864).setUpdateInterval(3).fireImmune()
/*  37 */       .sized(0.6F, 1.5F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(SiluetEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4864).setUpdateInterval(3).fireImmune().sized(0.6F, 1.5F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  41 */   public static final DeferredHolder<EntityType<?>, EntityType<SiluetChaseEntity>> SILUET_CHASE = INSTANCE.register(
/*  42 */       "siluet_chase", EntityType.Builder.of(TBSEntities::SILUET_CHASE$lambda$0, 
/*     */ 
/*     */ 
/*     */         
/*  46 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(864).setUpdateInterval(3)
/*  47 */       .fireImmune().sized(0.6F, 1.5F)); private static final SiluetChaseEntity SILUET_CHASE$lambda$0(EntityType type, Level world) { return new SiluetChaseEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::SILUET_CHASE$lambda$0, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(864).setUpdateInterval(3).fireImmune().sized(0.6F, 1.5F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  51 */   public static final DeferredHolder<EntityType<?>, EntityType<StrikeEntity>> STRIKE = INSTANCE.register(
/*  52 */       "strike", EntityType.Builder.of(
/*  53 */         StrikeEntity::new, MobCategory.MONSTER)
/*  54 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(StrikeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  58 */   public static final DeferredHolder<EntityType<?>, EntityType<NothingiswatchingEntity>> NOTHINGISWATCHING = INSTANCE.register(
/*  59 */       "nothingiswatching", EntityType.Builder.of(TBSEntities::NOTHINGISWATCHING$lambda$1, 
/*     */ 
/*     */ 
/*     */         
/*  63 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(5964).setUpdateInterval(3)
/*  64 */       .fireImmune().sized(0.6F, 3.0F)); private static final NothingiswatchingEntity NOTHINGISWATCHING$lambda$1(EntityType type, Level world) { return new NothingiswatchingEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::NOTHINGISWATCHING$lambda$1, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(5964).setUpdateInterval(3).fireImmune().sized(0.6F, 3.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  68 */   public static final DeferredHolder<EntityType<?>, EntityType<NothingiswatchingchaseEntity>> NOTHINGISWATCHINGCHASE = INSTANCE.register(
/*  69 */       "nothingiswatchingchase", 
/*  70 */       EntityType.Builder.of(TBSEntities::NOTHINGISWATCHINGCHASE$lambda$2, 
/*     */ 
/*     */ 
/*     */         
/*  74 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4464).setUpdateInterval(3)
/*  75 */       .fireImmune().sized(0.6F, 1.8F)); private static final NothingiswatchingchaseEntity NOTHINGISWATCHINGCHASE$lambda$2(EntityType type, Level world) { return new NothingiswatchingchaseEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::NOTHINGISWATCHINGCHASE$lambda$2, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4464).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  79 */   public static final DeferredHolder<EntityType<?>, EntityType<RandomStructureEntity>> RANDOM_STRUCTURE = INSTANCE.register(
/*  80 */       "random_structure", EntityType.Builder.of(TBSEntities::RANDOM_STRUCTURE$lambda$3, 
/*     */ 
/*     */ 
/*     */         
/*  84 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/*  85 */       .sized(0.6F, 1.8F)); private static final RandomStructureEntity RANDOM_STRUCTURE$lambda$3(EntityType type, Level world) { return new RandomStructureEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::RANDOM_STRUCTURE$lambda$3, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  89 */   public static final DeferredHolder<EntityType<?>, EntityType<FarawayEntity>> FARAWAY = INSTANCE.register(
/*  90 */       "faraway", EntityType.Builder.of(
/*  91 */         FarawayEntity::new, MobCategory.MONSTER)
/*  92 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune()
/*  93 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(FarawayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/*  97 */   public static final DeferredHolder<EntityType<?>, EntityType<Jframe1entityEntity>> JFRAME_1ENTITY = INSTANCE.register(
/*  98 */       "jframe_1entity", EntityType.Builder.of(TBSEntities::JFRAME_1ENTITY$lambda$4, 
/*     */ 
/*     */ 
/*     */         
/* 102 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 103 */       .sized(0.6F, 1.8F)); private static final Jframe1entityEntity JFRAME_1ENTITY$lambda$4(EntityType type, Level world) { return new Jframe1entityEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::JFRAME_1ENTITY$lambda$4, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 107 */   public static final DeferredHolder<EntityType<?>, EntityType<Jframe2entityEntity>> JFRAME_2ENTITY = INSTANCE.register(
/* 108 */       "jframe_2entity", EntityType.Builder.of(TBSEntities::JFRAME_2ENTITY$lambda$5, 
/*     */ 
/*     */ 
/*     */         
/* 112 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 113 */       .sized(0.6F, 1.8F)); private static final Jframe2entityEntity JFRAME_2ENTITY$lambda$5(EntityType type, Level world) { return new Jframe2entityEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::JFRAME_2ENTITY$lambda$5, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 117 */   public static final DeferredHolder<EntityType<?>, EntityType<Jframe3entityEntity>> JFRAME_3ENTITY = INSTANCE.register(
/* 118 */       "jframe_3entity", EntityType.Builder.of(TBSEntities::JFRAME_3ENTITY$lambda$6, 
/*     */ 
/*     */ 
/*     */         
/* 122 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 123 */       .sized(0.6F, 1.8F)); private static final Jframe3entityEntity JFRAME_3ENTITY$lambda$6(EntityType type, Level world) { return new Jframe3entityEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::JFRAME_3ENTITY$lambda$6, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 127 */   public static final DeferredHolder<EntityType<?>, EntityType<Jframe4entityEntity>> JFRAME_4ENTITY = INSTANCE.register(
/* 128 */       "jframe_4entity", EntityType.Builder.of(TBSEntities::JFRAME_4ENTITY$lambda$7, 
/*     */ 
/*     */ 
/*     */         
/* 132 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 133 */       .sized(0.6F, 1.8F)); private static final Jframe4entityEntity JFRAME_4ENTITY$lambda$7(EntityType type, Level world) { return new Jframe4entityEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::JFRAME_4ENTITY$lambda$7, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 137 */   public static final DeferredHolder<EntityType<?>, EntityType<Jframe5entityEntity>> JFRAME_5ENTITY = INSTANCE.register(
/* 138 */       "jframe_5entity", EntityType.Builder.of(TBSEntities::JFRAME_5ENTITY$lambda$8, 
/*     */ 
/*     */ 
/*     */         
/* 142 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 143 */       .sized(0.6F, 1.8F)); private static final Jframe5entityEntity JFRAME_5ENTITY$lambda$8(EntityType type, Level world) { return new Jframe5entityEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::JFRAME_5ENTITY$lambda$8, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 147 */   public static final DeferredHolder<EntityType<?>, EntityType<JumposcoroooEntity>> JUMPOSCOROOO = INSTANCE.register(
/* 148 */       "jumposcorooo", EntityType.Builder.of(TBSEntities::JUMPOSCOROOO$lambda$9, 
/*     */ 
/*     */ 
/*     */         
/* 152 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 153 */       .sized(0.6F, 1.8F)); private static final JumposcoroooEntity JUMPOSCOROOO$lambda$9(EntityType type, Level world) { return new JumposcoroooEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::JUMPOSCOROOO$lambda$9, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 157 */   public static final DeferredHolder<EntityType<?>, EntityType<NullScareEntity>> NULL_SCARE = INSTANCE.register(
/* 158 */       "null_scare", EntityType.Builder.of(
/* 159 */         NullScareEntity::new, MobCategory.MONSTER)
/* 160 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6F, 4.0F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(NullScareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6F, 4.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 164 */   public static final DeferredHolder<EntityType<?>, EntityType<WrongOverlayEntity>> WRONG_OVERLAY = INSTANCE.register(
/* 165 */       "wrong_overlay", EntityType.Builder.of(TBSEntities::WRONG_OVERLAY$lambda$10, 
/*     */ 
/*     */ 
/*     */         
/* 169 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 170 */       .sized(0.6F, 1.8F)); private static final WrongOverlayEntity WRONG_OVERLAY$lambda$10(EntityType type, Level world) { return new WrongOverlayEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::WRONG_OVERLAY$lambda$10, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 174 */   public static final DeferredHolder<EntityType<?>, EntityType<FollowEntity>> FOLLOW = INSTANCE.register(
/* 175 */       "follow", EntityType.Builder.of(
/* 176 */         FollowEntity::new, MobCategory.MONSTER)
/* 177 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(5564).setUpdateInterval(3).fireImmune()
/* 178 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(FollowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(5564).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 182 */   public static final DeferredHolder<EntityType<?>, EntityType<JumposcrooooEntity>> JUMPOSCROOOO = INSTANCE.register(
/* 183 */       "jumposcroooo", EntityType.Builder.of(TBSEntities::JUMPOSCROOOO$lambda$11, 
/*     */ 
/*     */ 
/*     */         
/* 187 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 188 */       .sized(0.6F, 1.8F)); private static final JumposcrooooEntity JUMPOSCROOOO$lambda$11(EntityType type, Level world) { return new JumposcrooooEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::JUMPOSCROOOO$lambda$11, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 192 */   public static final DeferredHolder<EntityType<?>, EntityType<NullFlyingEntity>> NULL_FLYING = INSTANCE.register(
/* 193 */       "null_flying", EntityType.Builder.of(
/* 194 */         NullFlyingEntity::new, MobCategory.MONSTER)
/* 195 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune()
/* 196 */       .sized(0.6F, 2.0F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(NullFlyingEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 2.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 200 */   public static final DeferredHolder<EntityType<?>, EntityType<NullWatchingEntity>> NULL_WATCHING = INSTANCE.register(
/* 201 */       "null_watching", EntityType.Builder.of(TBSEntities::NULL_WATCHING$lambda$12, 
/*     */ 
/*     */ 
/*     */         
/* 205 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4964).setUpdateInterval(3)
/* 206 */       .fireImmune().sized(0.6F, 1.8F)); private static final NullWatchingEntity NULL_WATCHING$lambda$12(EntityType type, Level world) { return new NullWatchingEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::NULL_WATCHING$lambda$12, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 210 */   public static final DeferredHolder<EntityType<?>, EntityType<NullEndgameEntity>> NULL_ENDGAME = INSTANCE.register(
/* 211 */       "null_endgame", EntityType.Builder.of(TBSEntities::NULL_ENDGAME$lambda$13, 
/*     */ 
/*     */ 
/*     */         
/* 215 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3)
/* 216 */       .fireImmune().sized(0.6F, 1.8F)); private static final NullEndgameEntity NULL_ENDGAME$lambda$13(EntityType type, Level world) { return new NullEndgameEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::NULL_ENDGAME$lambda$13, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 220 */   public static final DeferredHolder<EntityType<?>, EntityType<SiluetStareEntity>> SILUET_STARE = INSTANCE.register(
/* 221 */       "siluet_stare", EntityType.Builder.of(TBSEntities::SILUET_STARE$lambda$14, 
/*     */ 
/*     */ 
/*     */         
/* 225 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(864).setUpdateInterval(3)
/* 226 */       .fireImmune().sized(0.6F, 1.5F)); private static final SiluetStareEntity SILUET_STARE$lambda$14(EntityType type, Level world) { return new SiluetStareEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::SILUET_STARE$lambda$14, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(864).setUpdateInterval(3).fireImmune().sized(0.6F, 1.5F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 230 */   public static final DeferredHolder<EntityType<?>, EntityType<BehindYouOverlayEntity>> BEHIND_YOU_OVERLAY = INSTANCE.register(
/* 231 */       "behind_you_overlay", EntityType.Builder.of(TBSEntities::BEHIND_YOU_OVERLAY$lambda$15, 
/*     */ 
/*     */ 
/*     */         
/* 235 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 236 */       .sized(0.6F, 1.8F)); private static final BehindYouOverlayEntity BEHIND_YOU_OVERLAY$lambda$15(EntityType type, Level world) { return new BehindYouOverlayEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::BEHIND_YOU_OVERLAY$lambda$15, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 240 */   public static final DeferredHolder<EntityType<?>, EntityType<WeCanHearUOverlayEntity>> WE_CAN_HEAR_U_OVERLAY = INSTANCE.register(
/* 241 */       "we_can_hear_u_overlay", EntityType.Builder.of(TBSEntities::WE_CAN_HEAR_U_OVERLAY$lambda$16, 
/*     */ 
/*     */ 
/*     */         
/* 245 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 246 */       .sized(0.6F, 1.8F)); private static final WeCanHearUOverlayEntity WE_CAN_HEAR_U_OVERLAY$lambda$16(EntityType type, Level world) { return new WeCanHearUOverlayEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::WE_CAN_HEAR_U_OVERLAY$lambda$16, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 250 */   public static final DeferredHolder<EntityType<?>, EntityType<CantYouSeeEntity>> CANT_YOU_SEE = INSTANCE.register(
/* 251 */       "cant_you_see", EntityType.Builder.of(
/* 252 */         CantYouSeeEntity::new, MobCategory.MONSTER)
/* 253 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(CantYouSeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 257 */   public static final DeferredHolder<EntityType<?>, EntityType<NullInvadeBaseEntity>> NULL_INVADE_BASE = INSTANCE.register(
/* 258 */       "null_invade_base", EntityType.Builder.of(TBSEntities::NULL_INVADE_BASE$lambda$17, 
/*     */ 
/*     */ 
/*     */         
/* 262 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3)
/* 263 */       .fireImmune().sized(0.6F, 1.8F)); private static final NullInvadeBaseEntity NULL_INVADE_BASE$lambda$17(EntityType type, Level world) { return new NullInvadeBaseEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::NULL_INVADE_BASE$lambda$17, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 267 */   public static final DeferredHolder<EntityType<?>, EntityType<NullTpBeaconEntity>> NULL_TP_BEACON = INSTANCE.register(
/* 268 */       "null_tp_beacon", EntityType.Builder.of(TBSEntities::NULL_TP_BEACON$lambda$18, 
/*     */ 
/*     */ 
/*     */         
/* 272 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 273 */       .sized(0.6F, 1.8F)); private static final NullTpBeaconEntity NULL_TP_BEACON$lambda$18(EntityType type, Level world) { return new NullTpBeaconEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::NULL_TP_BEACON$lambda$18, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 277 */   public static final DeferredHolder<EntityType<?>, EntityType<HeEntity>> HE = INSTANCE.register(
/* 278 */       "he", EntityType.Builder.of(
/* 279 */         HeEntity::new, MobCategory.MONSTER)
/* 280 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(4964).setUpdateInterval(3).fireImmune()
/* 281 */       .sized(0.6F, 1.5F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(HeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.5F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 285 */   public static final DeferredHolder<EntityType<?>, EntityType<BsodEntity>> BSOD = INSTANCE.register(
/* 286 */       "bsod", EntityType.Builder.of(
/* 287 */         BsodEntity::new, MobCategory.MONSTER)
/* 288 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune()
/* 289 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(BsodEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 293 */   public static final DeferredHolder<EntityType<?>, EntityType<MazeChaserEntity>> MAZE_CHASER = INSTANCE.register(
/* 294 */       "maze_chaser", EntityType.Builder.of(
/* 295 */         MazeChaserEntity::new, MobCategory.MONSTER)
/* 296 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(464).setUpdateInterval(3).fireImmune()
/* 297 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(MazeChaserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(464).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 301 */   public static final DeferredHolder<EntityType<?>, EntityType<MazeShadowsEntity>> MAZE_SHADOWS = INSTANCE.register(
/* 302 */       "maze_shadows", 
/* 303 */       EntityType.Builder.of(MazeShadowsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 304 */       .setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(MazeShadowsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 308 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitStalkEntity>> CIRCUIT_STALK = INSTANCE.register(
/* 309 */       "circuit_stalk", EntityType.Builder.of(TBSEntities::CIRCUIT_STALK$lambda$19, 
/*     */ 
/*     */ 
/*     */         
/* 313 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 314 */       .fireImmune().sized(0.6F, 4.0F)); private static final CircuitStalkEntity CIRCUIT_STALK$lambda$19(EntityType type, Level world) { return new CircuitStalkEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CIRCUIT_STALK$lambda$19, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6F, 4.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 318 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitStareEntity>> CIRCUIT_STARE = INSTANCE.register(
/* 319 */       "circuit_stare", EntityType.Builder.of(TBSEntities::CIRCUIT_STARE$lambda$20, 
/*     */ 
/*     */ 
/*     */         
/* 323 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(7164).setUpdateInterval(3)
/* 324 */       .fireImmune().sized(0.6F, 4.0F)); private static final CircuitStareEntity CIRCUIT_STARE$lambda$20(EntityType type, Level world) { return new CircuitStareEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CIRCUIT_STARE$lambda$20, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(7164).setUpdateInterval(3).fireImmune().sized(0.6F, 4.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 328 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitTpBeaconEntity>> CIRCUIT_TP_BEACON = INSTANCE.register(
/* 329 */       "circuit_tp_beacon", EntityType.Builder.of(TBSEntities::CIRCUIT_TP_BEACON$lambda$21, 
/*     */ 
/*     */ 
/*     */         
/* 333 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 334 */       .sized(0.6F, 5.0F)); private static final CircuitTpBeaconEntity CIRCUIT_TP_BEACON$lambda$21(EntityType type, Level world) { return new CircuitTpBeaconEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CIRCUIT_TP_BEACON$lambda$21, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 5.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 338 */   public static final DeferredHolder<EntityType<?>, EntityType<TheBrokenEndEntity>> THE_BROKEN_END = INSTANCE.register(
/* 339 */       "the_broken_end", EntityType.Builder.of(TBSEntities::THE_BROKEN_END$lambda$22, 
/*     */ 
/*     */ 
/*     */         
/* 343 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9764).setUpdateInterval(3)
/* 344 */       .fireImmune().sized(0.6F, 8.0F)); private static final TheBrokenEndEntity THE_BROKEN_END$lambda$22(EntityType type, Level world) { return new TheBrokenEndEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::THE_BROKEN_END$lambda$22, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9764).setUpdateInterval(3).fireImmune().sized(0.6F, 8.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 348 */   public static final DeferredHolder<EntityType<?>, EntityType<TheBrokenEndStalkEntity>> THE_BROKEN_END_STALK = INSTANCE.register(
/* 349 */       "the_broken_end_stalk", EntityType.Builder.of(TBSEntities::THE_BROKEN_END_STALK$lambda$23, 
/*     */ 
/*     */ 
/*     */         
/* 353 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 354 */       .sized(0.6F, 8.0F)); private static final TheBrokenEndStalkEntity THE_BROKEN_END_STALK$lambda$23(EntityType type, Level world) { return new TheBrokenEndStalkEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::THE_BROKEN_END_STALK$lambda$23, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 8.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 358 */   public static final DeferredHolder<EntityType<?>, EntityType<TheObliterationEntity>> THE_OBLITERATION = INSTANCE.register(
/* 359 */       "the_obliteration", 
/* 360 */       EntityType.Builder.of(TheObliterationEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
/* 361 */       .setTrackingRange(9764).setUpdateInterval(3).fireImmune().sized(10.0F, 10.0F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TheObliterationEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9764).setUpdateInterval(3).fireImmune().sized(10.0F, 10.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 365 */   public static final DeferredHolder<EntityType<?>, EntityType<TheBrokenEndStalkkEntity>> THE_BROKEN_END_STALKK = INSTANCE.register(
/* 366 */       "the_broken_end_stalkk", EntityType.Builder.of(TBSEntities::THE_BROKEN_END_STALKK$lambda$24, 
/*     */ 
/*     */ 
/*     */         
/* 370 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(5964).setUpdateInterval(3)
/* 371 */       .fireImmune().sized(0.6F, 8.0F)); private static final TheBrokenEndStalkkEntity THE_BROKEN_END_STALKK$lambda$24(EntityType type, Level world) { return new TheBrokenEndStalkkEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::THE_BROKEN_END_STALKK$lambda$24, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(5964).setUpdateInterval(3).fireImmune().sized(0.6F, 8.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 375 */   public static final DeferredHolder<EntityType<?>, EntityType<OutOfCaveCheckEntity>> OUT_OF_CAVE_CHECK = INSTANCE.register(
/* 376 */       "out_of_cave_check", EntityType.Builder.of(TBSEntities::OUT_OF_CAVE_CHECK$lambda$25, 
/*     */ 
/*     */ 
/*     */         
/* 380 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 381 */       .fireImmune().sized(0.6F, 1.8F)); private static final OutOfCaveCheckEntity OUT_OF_CAVE_CHECK$lambda$25(EntityType type, Level world) { return new OutOfCaveCheckEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::OUT_OF_CAVE_CHECK$lambda$25, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 385 */   public static final DeferredHolder<EntityType<?>, EntityType<Dotsframe1Entity>> DOTSFRAME_1 = INSTANCE.register(
/* 386 */       "dotsframe_1", EntityType.Builder.of(
/* 387 */         Dotsframe1Entity::new, MobCategory.MONSTER)
/* 388 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(Dotsframe1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 392 */   public static final DeferredHolder<EntityType<?>, EntityType<Dotsframe2Entity>> DOTSFRAME_2 = INSTANCE.register(
/* 393 */       "dotsframe_2", EntityType.Builder.of(
/* 394 */         Dotsframe2Entity::new, MobCategory.MONSTER)
/* 395 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(Dotsframe2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 399 */   public static final DeferredHolder<EntityType<?>, EntityType<Dotsframe3Entity>> DOTSFRAME_3 = INSTANCE.register(
/* 400 */       "dotsframe_3", EntityType.Builder.of(
/* 401 */         Dotsframe3Entity::new, MobCategory.MONSTER)
/* 402 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(Dotsframe3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 406 */   public static final DeferredHolder<EntityType<?>, EntityType<Dotsframe4Entity>> DOTSFRAME_4 = INSTANCE.register(
/* 407 */       "dotsframe_4", EntityType.Builder.of(
/* 408 */         Dotsframe4Entity::new, MobCategory.MONSTER)
/* 409 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(Dotsframe4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 413 */   public static final DeferredHolder<EntityType<?>, EntityType<Xxram2dieEntity>> XXRAM_2DIE = INSTANCE.register(
/* 414 */       "xxram_2die", EntityType.Builder.of(
/* 415 */         Xxram2dieEntity::new, MobCategory.MONSTER)
/* 416 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(5664).setUpdateInterval(3).fireImmune()
/* 417 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(Xxram2dieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(5664).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 421 */   public static final DeferredHolder<EntityType<?>, EntityType<BanEntity>> BAN = INSTANCE.register(
/* 422 */       "ban", EntityType.Builder.of(
/* 423 */         BanEntity::new, MobCategory.MONSTER)
/* 424 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.2F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(BanEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.2F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 428 */   public static final DeferredHolder<EntityType<?>, EntityType<NullIsHereEntity>> NULL_IS_HERE = INSTANCE.register(
/* 429 */       "null_is_here", EntityType.Builder.of(
/* 430 */         NullIsHereEntity::new, MobCategory.MONSTER)
/* 431 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(9664).setUpdateInterval(3).fireImmune()
/* 432 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(NullIsHereEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9664).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 436 */   public static final DeferredHolder<EntityType<?>, EntityType<StareEntity>> STARE = INSTANCE.register(
/* 437 */       "stare", EntityType.Builder.of(
/* 438 */         StareEntity::new, MobCategory.MONSTER)
/* 439 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(StareEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 443 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitMineshaftStareEntity>> CIRCUIT_MINESHAFT_STARE = INSTANCE.register(
/* 444 */       "circuit_mineshaft_stare", 
/* 445 */       EntityType.Builder.of(TBSEntities::CIRCUIT_MINESHAFT_STARE$lambda$26, 
/*     */ 
/*     */ 
/*     */         
/* 449 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3)
/* 450 */       .fireImmune().sized(0.6F, 1.8F)); private static final CircuitMineshaftStareEntity CIRCUIT_MINESHAFT_STARE$lambda$26(EntityType type, Level world) { return new CircuitMineshaftStareEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CIRCUIT_MINESHAFT_STARE$lambda$26, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 454 */   public static final DeferredHolder<EntityType<?>, EntityType<DeceiverEntity>> DECEIVER = INSTANCE.register(
/* 455 */       "deceiver", EntityType.Builder.of(
/* 456 */         DeceiverEntity::new, MobCategory.MONSTER)
/* 457 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(3964).setUpdateInterval(3).fireImmune()
/* 458 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(DeceiverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(3964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 462 */   public static final DeferredHolder<EntityType<?>, EntityType<CorruptionEntity>> CORRUPTION = INSTANCE.register(
/* 463 */       "corruption", EntityType.Builder.of(
/* 464 */         CorruptionEntity::new, MobCategory.MONSTER)
/* 465 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(CorruptionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 0.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 469 */   public static final DeferredHolder<EntityType<?>, EntityType<NullMiningEntity>> NULL_MINING = INSTANCE.register(
/* 470 */       "null_mining", EntityType.Builder.of(
/* 471 */         NullMiningEntity::new, MobCategory.MONSTER)
/* 472 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune()
/* 473 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(NullMiningEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 477 */   public static final DeferredHolder<EntityType<?>, EntityType<EntitySpawnerEntity>> ENTITY_SPAWNER = INSTANCE.register(
/* 478 */       "entity_spawner", EntityType.Builder.of(TBSEntities::ENTITY_SPAWNER$lambda$27, 
/*     */ 
/*     */ 
/*     */         
/* 482 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(764).setUpdateInterval(3)
/* 483 */       .fireImmune().sized(0.6F, 1.8F)); private static final EntitySpawnerEntity ENTITY_SPAWNER$lambda$27(EntityType type, Level world) { return new EntitySpawnerEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::ENTITY_SPAWNER$lambda$27, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(764).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 487 */   public static final DeferredHolder<EntityType<?>, EntityType<IntegrityEntity>> INTEGRITY = INSTANCE.register(
/* 488 */       "integrity", EntityType.Builder.of(
/* 489 */         IntegrityEntity::new, MobCategory.MONSTER)
/* 490 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(2164).setUpdateInterval(3).fireImmune()
/* 491 */       .sized(0.6F, 8.0F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(IntegrityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2164).setUpdateInterval(3).fireImmune().sized(0.6F, 8.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 495 */   public static final DeferredHolder<EntityType<?>, EntityType<MissileEntity>> MISSILE = INSTANCE.register(
/* 496 */       "missile", EntityType.Builder.of(
/* 497 */         MissileEntity::new, MobCategory.MONSTER)
/* 498 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(1964).setUpdateInterval(3).fireImmune()
/* 499 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(MissileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 503 */   public static final DeferredHolder<EntityType<?>, EntityType<IntegrityBossfightEntity>> INTEGRITY_BOSSFIGHT = INSTANCE.register(
/* 504 */       "integrity_bossfight", EntityType.Builder.of(TBSEntities::INTEGRITY_BOSSFIGHT$lambda$28, 
/*     */ 
/*     */ 
/*     */         
/* 508 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4964).setUpdateInterval(3)
/* 509 */       .fireImmune().sized(0.6F, 5.0F)); private static final IntegrityBossfightEntity INTEGRITY_BOSSFIGHT$lambda$28(EntityType type, Level world) { return new IntegrityBossfightEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::INTEGRITY_BOSSFIGHT$lambda$28, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(4964).setUpdateInterval(3).fireImmune().sized(0.6F, 5.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 513 */   public static final DeferredHolder<EntityType<?>, EntityType<ChunkRemoverEntity>> CHUNK_REMOVER = INSTANCE.register(
/* 514 */       "chunk_remover", EntityType.Builder.of(TBSEntities::CHUNK_REMOVER$lambda$29, 
/*     */ 
/*     */ 
/*     */         
/* 518 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 519 */       .sized(0.6F, 1.8F)); private static final ChunkRemoverEntity CHUNK_REMOVER$lambda$29(EntityType type, Level world) { return new ChunkRemoverEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CHUNK_REMOVER$lambda$29, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */ 
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 524 */   public static final DeferredHolder<EntityType<?>, EntityType<TheBrokenEndOverhaulStalkEntity>> THE_BROKEN_END_OVERHAUL_STALK = INSTANCE.register(
/* 525 */       "the_broken_end_overhaul_stalk", 
/* 526 */       EntityType.Builder.of(TBSEntities::THE_BROKEN_END_OVERHAUL_STALK$lambda$30, 
/*     */ 
/*     */ 
/*     */         
/* 530 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2000).setUpdateInterval(3)
/* 531 */       .fireImmune().sized(0.6F, 24.0F)); private static final TheBrokenEndOverhaulStalkEntity THE_BROKEN_END_OVERHAUL_STALK$lambda$30(EntityType type, Level world) { return new TheBrokenEndOverhaulStalkEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::THE_BROKEN_END_OVERHAUL_STALK$lambda$30, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2000).setUpdateInterval(3).fireImmune().sized(0.6F, 24.0F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 535 */   public static final DeferredHolder<EntityType<?>, EntityType<HerobrineEntity>> HEROBRINE = INSTANCE.register(
/* 536 */       "herobrine", EntityType.Builder.of(
/* 537 */         HerobrineEntity::new, MobCategory.MONSTER)
/* 538 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(2464).setUpdateInterval(3).fireImmune()
/* 539 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(HerobrineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(2464).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 543 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitMineshaftWalkEntity>> CIRCUIT_MINESHAFT_WALK = INSTANCE.register(
/* 544 */       "circuit_mineshaft_walk", 
/* 545 */       EntityType.Builder.of(TBSEntities::CIRCUIT_MINESHAFT_WALK$lambda$31, 
/*     */ 
/*     */ 
/*     */         
/* 549 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3)
/* 550 */       .fireImmune().sized(0.6F, 1.8F)); private static final CircuitMineshaftWalkEntity CIRCUIT_MINESHAFT_WALK$lambda$31(EntityType type, Level world) { return new CircuitMineshaftWalkEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CIRCUIT_MINESHAFT_WALK$lambda$31, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 554 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitMineshaftFleeEntity>> CIRCUIT_MINESHAFT_FLEE = INSTANCE.register(
/* 555 */       "circuit_mineshaft_flee", 
/* 556 */       EntityType.Builder.of(TBSEntities::CIRCUIT_MINESHAFT_FLEE$lambda$32, 
/*     */ 
/*     */ 
/*     */         
/* 560 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 561 */       .sized(0.6F, 1.8F)); private static final CircuitMineshaftFleeEntity CIRCUIT_MINESHAFT_FLEE$lambda$32(EntityType type, Level world) { return new CircuitMineshaftFleeEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CIRCUIT_MINESHAFT_FLEE$lambda$32, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */ 
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 566 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitDisguisedAsCreeperEntity>> CIRCUIT_DISGUISED_AS_CREEPER = INSTANCE.register(
/* 567 */       "circuit_disguised_as_creeper", 
/* 568 */       EntityType.Builder.of(TBSEntities::CIRCUIT_DISGUISED_AS_CREEPER$lambda$33, 
/*     */ 
/*     */ 
/*     */         
/* 572 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(966).setUpdateInterval(3)
/* 573 */       .fireImmune().sized(0.6F, 1.7F)); private static final CircuitDisguisedAsCreeperEntity CIRCUIT_DISGUISED_AS_CREEPER$lambda$33(EntityType type, Level world) { return new CircuitDisguisedAsCreeperEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CIRCUIT_DISGUISED_AS_CREEPER$lambda$33, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(966).setUpdateInterval(3).fireImmune().sized(0.6F, 1.7F), "sized(...)"); }
/*     */ 
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 578 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitJumpscareFrameEntityEntity>> CIRCUIT_JUMPSCARE_FRAME_ENTITY = INSTANCE.register(
/* 579 */       "circuit_jumpscare_frame_entity", 
/* 580 */       EntityType.Builder.of(TBSEntities::CIRCUIT_JUMPSCARE_FRAME_ENTITY$lambda$34, 
/*     */ 
/*     */ 
/*     */         
/* 584 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 585 */       .sized(0.6F, 1.8F)); private static final CircuitJumpscareFrameEntityEntity CIRCUIT_JUMPSCARE_FRAME_ENTITY$lambda$34(EntityType type, Level world) { return new CircuitJumpscareFrameEntityEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::CIRCUIT_JUMPSCARE_FRAME_ENTITY$lambda$34, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 589 */   public static final DeferredHolder<EntityType<?>, EntityType<PhantomPlayerEntity>> PHANTOM_PLAYER = INSTANCE.register(
/* 590 */       "phantom_player", EntityType.Builder.of(TBSEntities::PHANTOM_PLAYER$lambda$35, 
/*     */ 
/*     */ 
/*     */         
/* 594 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)
/* 595 */       .sized(0.1F, 0.1F)); private static final PhantomPlayerEntity PHANTOM_PLAYER$lambda$35(EntityType type, Level world) { return new PhantomPlayerEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::PHANTOM_PLAYER$lambda$35, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.1F, 0.1F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 599 */   public static final DeferredHolder<EntityType<?>, EntityType<HetzerEntity>> HETZER = INSTANCE.register(
/* 600 */       "hetzer", EntityType.Builder.of(
/* 601 */         HetzerEntity::new, MobCategory.MONSTER)
/* 602 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(9264).setUpdateInterval(3).fireImmune()
/* 603 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(HetzerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9264).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 607 */   public static final DeferredHolder<EntityType<?>, EntityType<CurvedEntity>> CURVED = INSTANCE.register(
/* 608 */       "curved", EntityType.Builder.of(
/* 609 */         CurvedEntity::new, MobCategory.MONSTER)
/* 610 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune()
/* 611 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(CurvedEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 615 */   public static final DeferredHolder<EntityType<?>, EntityType<CircuitEntity>> CIRCUIT = INSTANCE.register(
/* 616 */       "circuit", EntityType.Builder.of(
/* 617 */         CircuitEntity::new, MobCategory.MONSTER)
/* 618 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune()
/* 619 */       .sized(0.6F, 1.8F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(CircuitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 623 */   public static final DeferredHolder<EntityType<?>, EntityType<FalseVillagerEntity>> FALSE_VILLAGER = INSTANCE.register(
/* 624 */       "false_villager", EntityType.Builder.of(TBSEntities::FALSE_VILLAGER$lambda$36, 
/*     */ 
/*     */ 
/*     */         
/* 628 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3)
/* 629 */       .sized(0.6F, 1.75F)); private static final FalseVillagerEntity FALSE_VILLAGER$lambda$36(EntityType type, Level world) { return new FalseVillagerEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::FALSE_VILLAGER$lambda$36, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).sized(0.6F, 1.75F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 633 */   public static final DeferredHolder<EntityType<?>, EntityType<PigCircuitEntity>> PIG_CIRCUIT = INSTANCE.register(
/* 634 */       "pig_circuit", EntityType.Builder.of(
/* 635 */         PigCircuitEntity::new, MobCategory.MONSTER)
/* 636 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.9F, 0.4F)); static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(PigCircuitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).sized(0.9F, 0.4F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 640 */   public static final DeferredHolder<EntityType<?>, EntityType<NullUnbeatableBossfightEntity>> NULL_UNBEATABLE_BOSSFIGHT = INSTANCE.register(
/* 641 */       "null_unbeatable_bossfight", EntityType.Builder.of(TBSEntities::NULL_UNBEATABLE_BOSSFIGHT$lambda$37, 
/*     */ 
/*     */ 
/*     */         
/* 645 */         MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9664).setUpdateInterval(3)
/* 646 */       .fireImmune().sized(0.6F, 1.8F)); private static final NullUnbeatableBossfightEntity NULL_UNBEATABLE_BOSSFIGHT$lambda$37(EntityType type, Level world) { Intrinsics.checkNotNull(type); Intrinsics.checkNotNull(world); return new NullUnbeatableBossfightEntity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::NULL_UNBEATABLE_BOSSFIGHT$lambda$37, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(9664).setUpdateInterval(3).fireImmune().sized(0.6F, 1.8F), "sized(...)"); }
/*     */   
/*     */   @JvmField
/*     */   @NotNull
/* 650 */   public static final DeferredHolder<EntityType<?>, EntityType<SubAnomaly1Entity>> SUB_ANOMALY_1 = INSTANCE.register(
/* 651 */       "sub_anomaly_1", EntityType.Builder.of(
/* 652 */         TBSEntities::SUB_ANOMALY_1$lambda$38, MobCategory.MONSTER)
/* 653 */       .setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune()
/* 654 */       .sized(0.6F, 0.8F)); private static final SubAnomaly1Entity SUB_ANOMALY_1$lambda$38(EntityType type, Level world) { return new SubAnomaly1Entity(type, world); } static { Intrinsics.checkNotNullExpressionValue(EntityType.Builder.of(TBSEntities::SUB_ANOMALY_1$lambda$38, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(964).setUpdateInterval(3).fireImmune().sized(0.6F, 0.8F), "sized(...)"); }
/*     */   
/*     */   private final <T extends net.minecraft.world.entity.Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder entityTypeBuilder) {
/*     */     // Byte code:
/*     */     //   0: getstatic dev/wendigodrip/thebrokenscript/registry/TBSEntities.REGISTRY : Lnet/neoforged/neoforge/registries/DeferredRegister;
/*     */     //   3: aload_1
/*     */     //   4: aload_2
/*     */     //   5: aload_1
/*     */     //   6: <illegal opcode> get : (Lnet/minecraft/world/entity/EntityType$Builder;Ljava/lang/String;)Ljava/util/function/Supplier;
/*     */     //   11: invokevirtual register : (Ljava/lang/String;Ljava/util/function/Supplier;)Lnet/neoforged/neoforge/registries/DeferredHolder;
/*     */     //   14: dup
/*     */     //   15: ldc 'register(...)'
/*     */     //   17: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   20: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #660	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	21	0	this	Ldev/wendigodrip/thebrokenscript/registry/TBSEntities;
/*     */     //   0	21	1	registryname	Ljava/lang/String;
/*     */     //   0	21	2	entityTypeBuilder	Lnet/minecraft/world/entity/EntityType$Builder;
/*     */   }
/*     */   private static final EntityType register$lambda$39(EntityType.Builder $entityTypeBuilder, String $registryname) {
/* 660 */     return $entityTypeBuilder.build($registryname);
/*     */   }
/*     */   
/*     */   @SubscribeEvent
/*     */   public final void init(@NotNull FMLCommonSetupEvent event) {
/* 665 */     Intrinsics.checkNotNullParameter(event, "event"); event.enqueueWork(TBSEntities::init$lambda$40); } private static final void init$lambda$40() {
/* 666 */     NulllEntity.init();
/* 667 */     SiluetEntity.init();
/* 668 */     SiluetChaseEntity.init();
/* 669 */     StrikeEntity.init();
/* 670 */     NothingiswatchingEntity.init();
/* 671 */     NothingiswatchingchaseEntity.init();
/* 672 */     RandomStructureEntity.init();
/* 673 */     FarawayEntity.init();
/* 674 */     Jframe1entityEntity.init();
/* 675 */     Jframe2entityEntity.init();
/* 676 */     Jframe3entityEntity.init();
/* 677 */     Jframe4entityEntity.init();
/* 678 */     Jframe5entityEntity.init();
/* 679 */     JumposcoroooEntity.init();
/* 680 */     NullScareEntity.init();
/* 681 */     WrongOverlayEntity.init();
/* 682 */     FollowEntity.init();
/* 683 */     JumposcrooooEntity.init();
/* 684 */     NullFlyingEntity.init();
/* 685 */     NullWatchingEntity.init();
/* 686 */     NullEndgameEntity.init();
/* 687 */     SiluetStareEntity.init();
/* 688 */     BehindYouOverlayEntity.init();
/* 689 */     WeCanHearUOverlayEntity.init();
/* 690 */     CantYouSeeEntity.init();
/* 691 */     NullInvadeBaseEntity.init();
/* 692 */     NullTpBeaconEntity.init();
/* 693 */     HeEntity.init();
/* 694 */     BsodEntity.init();
/* 695 */     MazeChaserEntity.init();
/* 696 */     MazeShadowsEntity.Companion.init();
/* 697 */     CircuitStalkEntity.init();
/* 698 */     CircuitStareEntity.init();
/* 699 */     CircuitTpBeaconEntity.init();
/* 700 */     TheBrokenEndEntity.init();
/* 701 */     TheBrokenEndStalkEntity.init();
/* 702 */     TheObliterationEntity.Companion.init();
/* 703 */     TheBrokenEndStalkkEntity.init();
/* 704 */     OutOfCaveCheckEntity.init();
/* 705 */     Dotsframe1Entity.init();
/* 706 */     Dotsframe2Entity.init();
/* 707 */     Dotsframe3Entity.init();
/* 708 */     Dotsframe4Entity.init();
/* 709 */     Xxram2dieEntity.init();
/* 710 */     BanEntity.Companion.init();
/* 711 */     NullIsHereEntity.init();
/* 712 */     StareEntity.init();
/* 713 */     CircuitMineshaftStareEntity.init();
/* 714 */     DeceiverEntity.init();
/* 715 */     CorruptionEntity.init();
/* 716 */     NullMiningEntity.init();
/* 717 */     EntitySpawnerEntity.init();
/* 718 */     IntegrityEntity.init();
/* 719 */     MissileEntity.init();
/* 720 */     IntegrityBossfightEntity.init();
/* 721 */     ChunkRemoverEntity.init();
/* 722 */     TheBrokenEndOverhaulStalkEntity.init();
/* 723 */     HerobrineEntity.init();
/* 724 */     CircuitMineshaftWalkEntity.init();
/* 725 */     CircuitMineshaftFleeEntity.init();
/* 726 */     CircuitDisguisedAsCreeperEntity.init();
/* 727 */     CircuitJumpscareFrameEntityEntity.init();
/* 728 */     PhantomPlayerEntity.init();
/* 729 */     CurvedEntity.init();
/* 730 */     CircuitEntity.init();
/* 731 */     FalseVillagerEntity.init();
/* 732 */     PigCircuitEntity.init();
/* 733 */     NullUnbeatableBossfightEntity.Companion.init();
/* 734 */     SubAnomaly1Entity.init();
/*     */   }
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public final void registerAttributes(@NotNull EntityAttributeCreationEvent event) {
/* 740 */     Intrinsics.checkNotNullParameter(event, "event"); event.put((EntityType)NULLL.get(), NulllEntity.createAttributes().build());
/* 741 */     event.put((EntityType)SILUET.get(), SiluetEntity.createAttributes().build());
/* 742 */     event.put((EntityType)SILUET_CHASE.get(), SiluetChaseEntity.createAttributes().build());
/* 743 */     event.put((EntityType)STRIKE.get(), StrikeEntity.createAttributes().build());
/* 744 */     event.put((EntityType)NOTHINGISWATCHING.get(), NothingiswatchingEntity.createAttributes().build());
/* 745 */     event.put((EntityType)NOTHINGISWATCHINGCHASE.get(), NothingiswatchingchaseEntity.createAttributes().build());
/* 746 */     event.put((EntityType)RANDOM_STRUCTURE.get(), RandomStructureEntity.createAttributes().build());
/* 747 */     event.put((EntityType)FARAWAY.get(), FarawayEntity.createAttributes().build());
/* 748 */     event.put((EntityType)JFRAME_1ENTITY.get(), Jframe1entityEntity.createAttributes().build());
/* 749 */     event.put((EntityType)JFRAME_2ENTITY.get(), Jframe2entityEntity.createAttributes().build());
/* 750 */     event.put((EntityType)JFRAME_3ENTITY.get(), Jframe3entityEntity.createAttributes().build());
/* 751 */     event.put((EntityType)JFRAME_4ENTITY.get(), Jframe4entityEntity.createAttributes().build());
/* 752 */     event.put((EntityType)JFRAME_5ENTITY.get(), Jframe5entityEntity.createAttributes().build());
/* 753 */     event.put((EntityType)JUMPOSCOROOO.get(), JumposcoroooEntity.createAttributes().build());
/* 754 */     event.put((EntityType)NULL_SCARE.get(), NullScareEntity.createAttributes().build());
/* 755 */     event.put((EntityType)WRONG_OVERLAY.get(), WrongOverlayEntity.createAttributes().build());
/* 756 */     event.put((EntityType)FOLLOW.get(), FollowEntity.createAttributes().build());
/* 757 */     event.put((EntityType)JUMPOSCROOOO.get(), JumposcrooooEntity.createAttributes().build());
/* 758 */     event.put((EntityType)NULL_FLYING.get(), NullFlyingEntity.createAttributes().build());
/* 759 */     event.put((EntityType)NULL_WATCHING.get(), NullWatchingEntity.createAttributes().build());
/* 760 */     event.put((EntityType)NULL_ENDGAME.get(), NullEndgameEntity.createAttributes().build());
/* 761 */     event.put((EntityType)SILUET_STARE.get(), SiluetStareEntity.createAttributes().build());
/* 762 */     event.put((EntityType)BEHIND_YOU_OVERLAY.get(), BehindYouOverlayEntity.createAttributes().build());
/* 763 */     event.put((EntityType)WE_CAN_HEAR_U_OVERLAY.get(), WeCanHearUOverlayEntity.createAttributes().build());
/* 764 */     event.put((EntityType)CANT_YOU_SEE.get(), CantYouSeeEntity.createAttributes().build());
/* 765 */     event.put((EntityType)NULL_INVADE_BASE.get(), NullInvadeBaseEntity.createAttributes().build());
/* 766 */     event.put((EntityType)NULL_TP_BEACON.get(), NullTpBeaconEntity.createAttributes().build());
/* 767 */     event.put((EntityType)HE.get(), HeEntity.createAttributes().build());
/* 768 */     event.put((EntityType)BSOD.get(), BsodEntity.createAttributes().build());
/* 769 */     event.put((EntityType)MAZE_CHASER.get(), MazeChaserEntity.createAttributes().build());
/* 770 */     event.put((EntityType)MAZE_SHADOWS.get(), MazeShadowsEntity.Companion.createAttributes().build());
/* 771 */     event.put((EntityType)CIRCUIT_STALK.get(), CircuitStalkEntity.createAttributes().build());
/* 772 */     event.put((EntityType)CIRCUIT_STARE.get(), CircuitStareEntity.createAttributes().build());
/* 773 */     event.put((EntityType)CIRCUIT_TP_BEACON.get(), CircuitTpBeaconEntity.createAttributes().build());
/* 774 */     event.put((EntityType)THE_BROKEN_END.get(), TheBrokenEndEntity.createAttributes().build());
/* 775 */     event.put((EntityType)THE_BROKEN_END_STALK.get(), TheBrokenEndStalkEntity.createAttributes().build());
/* 776 */     event.put((EntityType)THE_OBLITERATION.get(), TheObliterationEntity.Companion.createAttributes().build());
/* 777 */     event.put((EntityType)THE_BROKEN_END_STALKK.get(), TheBrokenEndStalkkEntity.createAttributes().build());
/* 778 */     event.put((EntityType)OUT_OF_CAVE_CHECK.get(), OutOfCaveCheckEntity.createAttributes().build());
/* 779 */     event.put((EntityType)DOTSFRAME_1.get(), Dotsframe1Entity.createAttributes().build());
/* 780 */     event.put((EntityType)DOTSFRAME_2.get(), Dotsframe2Entity.createAttributes().build());
/* 781 */     event.put((EntityType)DOTSFRAME_3.get(), Dotsframe3Entity.createAttributes().build());
/* 782 */     event.put((EntityType)DOTSFRAME_4.get(), Dotsframe4Entity.createAttributes().build());
/* 783 */     event.put((EntityType)XXRAM_2DIE.get(), Xxram2dieEntity.createAttributes().build());
/* 784 */     event.put((EntityType)BAN.get(), BanEntity.Companion.createAttributes().build());
/* 785 */     event.put((EntityType)NULL_IS_HERE.get(), NullIsHereEntity.createAttributes().build());
/* 786 */     event.put((EntityType)STARE.get(), StareEntity.createAttributes().build());
/* 787 */     event.put((EntityType)CIRCUIT_MINESHAFT_STARE.get(), CircuitMineshaftStareEntity.createAttributes().build());
/* 788 */     event.put((EntityType)DECEIVER.get(), DeceiverEntity.createAttributes().build());
/* 789 */     event.put((EntityType)CORRUPTION.get(), CorruptionEntity.createAttributes().build());
/* 790 */     event.put((EntityType)NULL_MINING.get(), NullMiningEntity.createAttributes().build());
/* 791 */     event.put((EntityType)ENTITY_SPAWNER.get(), EntitySpawnerEntity.createAttributes().build());
/* 792 */     event.put((EntityType)INTEGRITY.get(), IntegrityEntity.createAttributes().build());
/* 793 */     event.put((EntityType)MISSILE.get(), MissileEntity.createAttributes().build());
/* 794 */     event.put((EntityType)INTEGRITY_BOSSFIGHT.get(), IntegrityBossfightEntity.createAttributes().build());
/* 795 */     event.put((EntityType)CHUNK_REMOVER.get(), ChunkRemoverEntity.createAttributes().build());
/* 796 */     event.put(
/* 797 */         (EntityType)THE_BROKEN_END_OVERHAUL_STALK.get(), TheBrokenEndOverhaulStalkEntity.createAttributes().build());
/*     */     
/* 799 */     event.put((EntityType)HEROBRINE.get(), HerobrineEntity.createAttributes().build());
/* 800 */     event.put((EntityType)CIRCUIT_MINESHAFT_WALK.get(), CircuitMineshaftWalkEntity.createAttributes().build());
/* 801 */     event.put((EntityType)CIRCUIT_MINESHAFT_FLEE.get(), CircuitMineshaftFleeEntity.createAttributes().build());
/* 802 */     event.put(
/* 803 */         (EntityType)CIRCUIT_DISGUISED_AS_CREEPER.get(), CircuitDisguisedAsCreeperEntity.createAttributes().build());
/*     */     
/* 805 */     event.put(
/* 806 */         (EntityType)CIRCUIT_JUMPSCARE_FRAME_ENTITY.get(), CircuitJumpscareFrameEntityEntity.createAttributes().build());
/*     */     
/* 808 */     event.put((EntityType)PHANTOM_PLAYER.get(), PhantomPlayerEntity.createAttributes().build());
/* 809 */     event.put((EntityType)HETZER.get(), HetzerEntity.Companion.createAttributes().build());
/* 810 */     event.put((EntityType)CURVED.get(), CurvedEntity.createAttributes().build());
/* 811 */     event.put((EntityType)CIRCUIT.get(), CircuitEntity.createAttributes().build());
/* 812 */     event.put((EntityType)FALSE_VILLAGER.get(), FalseVillagerEntity.createAttributes().build());
/* 813 */     event.put((EntityType)PIG_CIRCUIT.get(), PigCircuitEntity.createAttributes().build());
/* 814 */     event.put(
/* 815 */         (EntityType)NULL_UNBEATABLE_BOSSFIGHT.get(), NullUnbeatableBossfightEntity.Companion.createAttributes().build());
/*     */     
/* 817 */     event.put((EntityType)SUB_ANOMALY_1.get(), SubAnomaly1Entity.createAttributes().build());
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\registry\TBSEntities.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */