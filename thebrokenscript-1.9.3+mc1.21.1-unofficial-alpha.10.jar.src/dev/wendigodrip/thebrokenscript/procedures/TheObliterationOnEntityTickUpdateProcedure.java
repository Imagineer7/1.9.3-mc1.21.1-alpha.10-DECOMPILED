/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ import dev.wendigodrip.thebrokenscript.util.EntityExt;
/*     */ import dev.wendigodrip.thebrokenscript.util.EntityFinder;
/*     */ import java.util.Comparator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.entity.vehicle.Boat;
/*     */ import net.minecraft.world.level.ClipContext;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J.\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\t2\006\020\013\032\0020\t2\006\020\f\032\0020\r¨\006\016"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/TheObliterationOnEntityTickUpdateProcedure;", "", "<init>", "()V", "execute", "", "world", "Lnet/minecraft/world/level/Level;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "thebrokenscript"})
/*     */ public final class TheObliterationOnEntityTickUpdateProcedure {
/*     */   public final void execute(@NotNull Level world, double x, double y, double z, @NotNull Entity entity) {
/*  27 */     Intrinsics.checkNotNullParameter(world, "world"); Intrinsics.checkNotNullParameter(entity, "entity"); if (!EntityFinder.INSTANCE.findEntitiesInRange((LevelAccessor)world, Player.class, new Vec3(x, y, z), 100.0D).isEmpty()) {
/*  28 */       if (!entity.level().isClientSide()) {
/*  29 */         entity.discard();
/*     */       }
/*     */       
/*  32 */       EntityExt.INSTANCE.discardNearest(HeEntity.class, new Vec3(x, y, z), world, 4.0D);
/*     */     } 
/*     */     
/*  35 */     if ((IronGolem)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)world, IronGolem.class, new Vec3(x, y, z), 210.0D) != null) { ((IronGolem)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)world, IronGolem.class, new Vec3(x, y, z), 210.0D)).hurt(
/*  36 */           world.damageSources().playerAttack(null), 30.0F); }
/*     */     else
/*     */     { (IronGolem)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)world, IronGolem.class, new Vec3(x, y, z), 210.0D); }
/*  39 */      if ((Boat)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)world, Boat.class, new Vec3(x, y, z), 210.0D) != null) { ((Boat)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)world, Boat.class, new Vec3(x, y, z), 210.0D)).hurt(
/*  40 */           world.damageSources().playerAttack(null), 30.0F); }
/*     */     else
/*     */     { (Boat)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)world, Boat.class, new Vec3(x, y, z), 210.0D); }
/*  43 */      Player player = (Player)EntityFinder.INSTANCE.findClosestEntityInRange((LevelAccessor)world, Player.class, new Vec3(x, y, z), 1000.0D);
/*     */     
/*  45 */     if (player == null)
/*     */       return; 
/*  47 */     entity.lookAt(EntityAnchorArgument.Anchor.EYES, player.position());
/*     */     
/*  49 */     Entity _ent = entity;
/*     */     
/*  51 */     _ent.teleportTo(
/*  52 */         entity.level().clip(
/*  53 */           new ClipContext(
/*  54 */             entity.getEyePosition(1.0F), 
/*  55 */             entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.2D)), 
/*  56 */             ClipContext.Block.OUTLINE, 
/*  57 */             ClipContext.Fluid.NONE, 
/*  58 */             entity))
/*     */         
/*  60 */         .getBlockPos().getX(), entity.level().clip(
/*  61 */           new ClipContext(
/*  62 */             entity.getEyePosition(1.0F), 
/*  63 */             entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.2D)), 
/*  64 */             ClipContext.Block.OUTLINE, 
/*  65 */             ClipContext.Fluid.NONE, 
/*  66 */             entity))
/*     */         
/*  68 */         .getBlockPos().getY(), entity.level().clip(
/*  69 */           new ClipContext(
/*  70 */             entity.getEyePosition(1.0F), 
/*  71 */             entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.2D)), 
/*  72 */             ClipContext.Block.OUTLINE, 
/*  73 */             ClipContext.Fluid.NONE, 
/*  74 */             entity))
/*     */         
/*  76 */         .getBlockPos().getZ());
/*     */     
/*  78 */     if (_ent instanceof ServerPlayer) {
/*  79 */       ((ServerPlayer)_ent).connection.teleport(
/*  80 */           entity.level().clip(
/*  81 */             new ClipContext(
/*  82 */               entity.getEyePosition(1.0F), 
/*  83 */               entity.getEyePosition(1.0F).add(entity.getViewVector(1.0F).scale(0.2D)), 
/*  84 */               ClipContext.Block.OUTLINE, 
/*  85 */               ClipContext.Fluid.NONE, 
/*  86 */               entity))
/*     */           
/*  88 */           .getBlockPos().getX(), entity.level().clip(
/*  89 */             new ClipContext(
/*  90 */               entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(
/*  91 */                 entity.getViewVector(1.0F).scale(0.2D)), 
/*  92 */               ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */           
/*  94 */           .getBlockPos().getY(), entity.level().clip(
/*  95 */             new ClipContext(
/*  96 */               entity.getEyePosition(1.0F), entity.getEyePosition(1.0F).add(
/*  97 */                 entity.getViewVector(1.0F).scale(0.2D)), 
/*  98 */               ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
/*     */           
/* 100 */           .getBlockPos().getZ(), _ent.getYRot(), _ent.getXRot());
/*     */     }
/*     */     
/* 103 */     if (world instanceof ServerLevel) {
/* 104 */       ((ServerLevel)world).getServer().getCommands().performPrefixedCommand((
/* 105 */           new CommandSourceStack(
/* 106 */             CommandSource.NULL, 
/* 107 */             new Vec3(x, y, z), 
/* 108 */             Vec2.ZERO, 
/* 109 */             (ServerLevel)world, 
/* 110 */             4, 
/* 111 */             "", 
/* 112 */             (Component)Component.literal(""), (
/* 113 */             (ServerLevel)world).getServer(), 
/* 114 */             null))
/* 115 */           .withSuppressedOutput(), "gamemode survival @a");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 122 */     if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 820.0D, 820.0D, 820.0D), TheObliterationOnEntityTickUpdateProcedure::execute$lambda$0::execute$lambda$1).isEmpty()) if (entity instanceof Mob) {
/*     */         
/* 124 */         Entity entity2 = world.getEntitiesOfClass(
/* 125 */             Player.class, AABB.ofSize(
/* 126 */               new Vec3(x, y, z), 800.0D, 800.0D, 800.0D), TheObliterationOnEntityTickUpdateProcedure::execute$lambda$2
/*     */             
/* 128 */             ::execute$lambda$3).stream().sorted((new TheObliterationOnEntityTickUpdateProcedure$execute$entity2$2())
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 136 */             .compareDistOf(x, y, z)).findFirst().orElse(null);
/* 137 */         if (entity2 instanceof LivingEntity)
/* 138 */           ((Mob)entity).setTarget((LivingEntity)entity2); 
/*     */       }  
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final TheObliterationOnEntityTickUpdateProcedure INSTANCE = new TheObliterationOnEntityTickUpdateProcedure();
/*     */   
/*     */   private static final boolean execute$lambda$0(Player e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$1(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$2(Player e) {
/*     */     return true;
/*     */   }
/*     */   
/*     */   private static final boolean execute$lambda$3(Function1 $tmp0, Object p0) {
/*     */     return ((Boolean)$tmp0.invoke(p0)).booleanValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003*\001\000\b\n\030\0002\0020\001J2\020\002\032\026\022\006\022\004\030\0010\0040\003j\n\022\006\022\004\030\0010\004`\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\006\020\t\032\0020\007¨\006\n"}, d2 = {"dev/wendigodrip/thebrokenscript/procedures/TheObliterationOnEntityTickUpdateProcedure$execute$entity2$2", "", "compareDistOf", "Ljava/util/Comparator;", "Lnet/minecraft/world/entity/Entity;", "Lkotlin/Comparator;", "_x", "", "_y", "_z", "thebrokenscript"})
/*     */   public static final class TheObliterationOnEntityTickUpdateProcedure$execute$entity2$2 {
/*     */     public final Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*     */       // Byte code:
/*     */       //   0: dload_1
/*     */       //   1: dload_3
/*     */       //   2: dload #5
/*     */       //   4: <illegal opcode> invoke : (DDD)Lkotlin/jvm/functions/Function1;
/*     */       //   9: <illegal opcode> applyAsDouble : (Lkotlin/jvm/functions/Function1;)Ljava/util/function/ToDoubleFunction;
/*     */       //   14: invokestatic comparingDouble : (Ljava/util/function/ToDoubleFunction;)Ljava/util/Comparator;
/*     */       //   17: dup
/*     */       //   18: ldc 'comparingDouble(...)'
/*     */       //   20: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   23: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #130	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	24	0	this	Ldev/wendigodrip/thebrokenscript/procedures/TheObliterationOnEntityTickUpdateProcedure$execute$entity2$2;
/*     */       //   0	24	1	_x	D
/*     */       //   0	24	3	_y	D
/*     */       //   0	24	5	_z	D
/*     */     }
/*     */     
/*     */     private static final double compareDistOf$lambda$1(Function1 $tmp0, Object p0) {
/*     */       return ((Number)$tmp0.invoke(p0)).doubleValue();
/*     */     }
/*     */     
/*     */     private static final double compareDistOf$lambda$0(double $_x, double $_y, double $_z, Entity _entcnd) {
/*     */       Intrinsics.checkNotNull(_entcnd);
/*     */       return _entcnd.distanceToSqr($_x, $_y, $_z);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\TheObliterationOnEntityTickUpdateProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */