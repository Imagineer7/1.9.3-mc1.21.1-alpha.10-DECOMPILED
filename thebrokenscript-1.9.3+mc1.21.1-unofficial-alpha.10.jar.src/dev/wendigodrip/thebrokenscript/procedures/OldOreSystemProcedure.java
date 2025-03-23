/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\006\n\002\b\003\n\002\030\002\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\007J0\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020J<\020\b\032\0020\0052\b\020\006\032\004\030\0010\0212\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\f2\006\020\016\032\0020\f2\b\020\017\032\004\030\0010\020H\002¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/procedures/OldOreSystemProcedure;", "", "<init>", "()V", "onRightClickItem", "", "event", "Lnet/neoforged/neoforge/event/entity/player/PlayerInteractEvent$RightClickItem;", "execute", "world", "Lnet/minecraft/world/level/LevelAccessor;", "x", "", "y", "z", "entity", "Lnet/minecraft/world/entity/Entity;", "Lnet/neoforged/bus/api/Event;", "thebrokenscript"})
/*     */ public final class OldOreSystemProcedure {
/*     */   @SubscribeEvent
/*     */   public final void onRightClickItem(@NotNull PlayerInteractEvent.RightClickItem event) {
/*  23 */     Intrinsics.checkNotNullParameter(event, "event"); if (event.getHand() != event.getEntity().getUsedItemHand()) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*  29 */     Intrinsics.checkNotNullExpressionValue(event.getLevel(), "getLevel(...)"); execute((Event)event, (LevelAccessor)event.getLevel(), 
/*  30 */         event.getPos().getX(), 
/*  31 */         event.getPos().getY(), 
/*  32 */         event.getPos().getZ(), 
/*  33 */         (Entity)event.getEntity());
/*     */   }
/*     */   @NotNull
/*     */   public static final OldOreSystemProcedure INSTANCE = new OldOreSystemProcedure();
/*     */   public final void execute(@NotNull LevelAccessor world, double x, double y, double z, @Nullable Entity entity) {
/*  38 */     Intrinsics.checkNotNullParameter(world, "world"); execute(null, world, x, y, z, entity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void execute(Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/*  49 */     ItemStack itemStack = null;
/*  50 */     Level _level = null;
/*  51 */     LivingEntity _livEnt = null;
/*  52 */     ItemStack itemStack2 = null;
/*  53 */     LivingEntity _livEnt2 = null;
/*  54 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  57 */     if (entity instanceof LivingEntity) {
/*  58 */       _livEnt2 = (LivingEntity)entity;
/*  59 */       itemStack2 = _livEnt2.getMainHandItem();
/*     */     } else {
/*  61 */       itemStack2 = ItemStack.EMPTY;
/*     */     } 
/*  63 */     if (itemStack2.getItem() == Items.RAW_GOLD && 
/*  64 */       !world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
/*     */       
/*  66 */       ItemStack itemStack3 = null;
/*  67 */       ItemStack itemStack4 = null;
/*  68 */       if (entity instanceof LivingEntity) {
/*  69 */         _livEnt = (LivingEntity)entity;
/*  70 */         itemStack4 = _livEnt.getMainHandItem();
/*     */       } else {
/*  72 */         itemStack4 = ItemStack.EMPTY;
/*     */       } 
/*  74 */       if (entity instanceof LivingEntity) {
/*  75 */         _livEnt = (LivingEntity)entity;
/*  76 */         itemStack3 = _livEnt.getMainHandItem();
/*     */       } else {
/*  78 */         itemStack3 = ItemStack.EMPTY;
/*     */       } 
/*  80 */       itemStack4.setCount(itemStack3.getCount() - 1);
/*  81 */       world.setBlock(
/*  82 */           BlockPos.containing(x, y, z), 
/*  83 */           Blocks.GOLD_ORE.defaultBlockState(), 
/*  84 */           3);
/*     */       
/*  86 */       if (world instanceof Level) {
/*  87 */         _level = (Level)world;
/*  88 */         if (!_level.isClientSide()) {
/*  89 */           _level.playSound(
/*  90 */               null, 
/*  91 */               BlockPos.containing(x, y, z), 
/*  92 */               (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.place")), 
/*  93 */               SoundSource.NEUTRAL, 
/*  94 */               1.0F, 
/*  95 */               1.0F);
/*     */         } else {
/*     */           
/*  98 */           _level.playLocalSound(
/*  99 */               x, 
/* 100 */               y, 
/* 101 */               z, 
/* 102 */               (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.place")), 
/* 103 */               SoundSource.NEUTRAL, 
/* 104 */               1.0F, 
/* 105 */               1.0F, 
/* 106 */               false);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     
/* 111 */     if (entity instanceof LivingEntity) {
/* 112 */       _livEnt2 = (LivingEntity)entity;
/* 113 */       itemStack = _livEnt2.getMainHandItem();
/*     */     } else {
/* 115 */       itemStack = ItemStack.EMPTY;
/*     */     } 
/* 117 */     if (itemStack.getItem() == Items.RAW_IRON && 
/* 118 */       !world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
/*     */       
/* 120 */       ItemStack itemStack5 = null;
/* 121 */       ItemStack itemStack6 = null;
/* 122 */       if (entity instanceof LivingEntity) {
/* 123 */         _livEnt = (LivingEntity)entity;
/* 124 */         itemStack6 = _livEnt.getMainHandItem();
/*     */       } else {
/* 126 */         itemStack6 = ItemStack.EMPTY;
/*     */       } 
/* 128 */       if (entity instanceof LivingEntity) {
/* 129 */         _livEnt = (LivingEntity)entity;
/* 130 */         itemStack5 = _livEnt.getMainHandItem();
/*     */       } else {
/* 132 */         itemStack5 = ItemStack.EMPTY;
/*     */       } 
/* 134 */       itemStack6.setCount(itemStack5.getCount() - 1);
/* 135 */       world.setBlock(
/* 136 */           BlockPos.containing(x, y, z), 
/* 137 */           Blocks.IRON_ORE.defaultBlockState(), 
/* 138 */           3);
/*     */       
/* 140 */       if (world instanceof Level) {
/* 141 */         _level = (Level)world;
/* 142 */         if (!_level.isClientSide()) {
/* 143 */           _level.playSound(
/* 144 */               null, 
/* 145 */               BlockPos.containing(x, y, z), 
/* 146 */               (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.place")), 
/* 147 */               SoundSource.NEUTRAL, 
/* 148 */               1.0F, 
/* 149 */               1.0F);
/*     */         } else {
/*     */           
/* 152 */           _level.playLocalSound(
/* 153 */               x, 
/* 154 */               y, 
/* 155 */               z, 
/* 156 */               (SoundEvent)BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.place")), 
/* 157 */               SoundSource.NEUTRAL, 
/* 158 */               1.0F, 
/* 159 */               1.0F, 
/* 160 */               false);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\OldOreSystemProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */