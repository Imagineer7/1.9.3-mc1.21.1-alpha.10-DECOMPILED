/*     */ package dev.wendigodrip.thebrokenscript.procedures.deceiver;
/*     */ 
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.core.NonNullList;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DeceiverOnInitialEntitySpawnProcedure
/*     */ {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  28 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  31 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  32 */       _level.getServer()
/*  33 */         .getCommands()
/*  34 */         .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  42 */             (Component)Component.literal(""), _level
/*  43 */             .getServer(), null))
/*     */           
/*  45 */           .withSuppressedOutput(), "tellraw @a [\"\",{\"selector\":\"@p\",\"color\":\"yellow\"},{\"text\":\" joined the game\",\"color\":\"yellow\"}]"); }
/*     */ 
/*     */ 
/*     */     
/*  49 */     entity.setCustomName((Component)Component.literal(((Player)world.getEntitiesOfClass(Player.class, 
/*     */             
/*  51 */             AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true)
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*  58 */           .stream().sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/*  61 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/*  63 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).getDisplayName().getString()));
/*  64 */     Entity _entity = entity;
/*  65 */     if (_entity instanceof Player) {
/*     */       ItemStack itemStack;
/*  67 */       Player _player = (Player)_entity;
/*  68 */       NonNullList nonNullList = (_player.getInventory()).armor;
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
/*  83 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/*  84 */       if (entity2 instanceof LivingEntity) {
/*  85 */         LivingEntity _entGetArmor = (LivingEntity)entity2;
/*  86 */         itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
/*     */       } else {
/*  88 */         itemStack = ItemStack.EMPTY;
/*     */       } 
/*  90 */       nonNullList.set(0, itemStack);
/*  91 */       _player.getInventory().setChanged();
/*  92 */     } else if (_entity instanceof LivingEntity) {
/*     */       ItemStack itemStack;
/*  94 */       LivingEntity _living = (LivingEntity)_entity;
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
/* 109 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 110 */       if (entity2 instanceof LivingEntity) {
/* 111 */         LivingEntity _entGetArmor = (LivingEntity)entity2;
/* 112 */         itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.FEET);
/*     */       } else {
/* 114 */         itemStack = ItemStack.EMPTY;
/*     */       } 
/* 116 */       _living.setItemSlot(EquipmentSlot.FEET, itemStack);
/*     */     } 
/* 118 */     _entity = entity;
/* 119 */     if (_entity instanceof Player) {
/*     */       ItemStack itemStack;
/* 121 */       Player _player = (Player)_entity;
/* 122 */       NonNullList nonNullList = (_player.getInventory()).armor;
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
/* 137 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 138 */       if (entity2 instanceof LivingEntity) {
/* 139 */         LivingEntity _entGetArmor = (LivingEntity)entity2;
/* 140 */         itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.LEGS);
/*     */       } else {
/* 142 */         itemStack = ItemStack.EMPTY;
/*     */       } 
/* 144 */       nonNullList.set(1, itemStack);
/* 145 */       _player.getInventory().setChanged();
/* 146 */     } else if (_entity instanceof LivingEntity) {
/*     */       ItemStack itemStack;
/* 148 */       LivingEntity _living = (LivingEntity)_entity;
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
/* 163 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 164 */       if (entity2 instanceof LivingEntity) {
/* 165 */         LivingEntity _entGetArmor = (LivingEntity)entity2;
/* 166 */         itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.LEGS);
/*     */       } else {
/* 168 */         itemStack = ItemStack.EMPTY;
/*     */       } 
/* 170 */       _living.setItemSlot(EquipmentSlot.LEGS, itemStack);
/*     */     } 
/* 172 */     _entity = entity;
/* 173 */     if (_entity instanceof Player) {
/*     */       ItemStack itemStack;
/* 175 */       Player _player = (Player)_entity;
/* 176 */       NonNullList nonNullList = (_player.getInventory()).armor;
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
/* 191 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 192 */       if (entity2 instanceof LivingEntity) {
/* 193 */         LivingEntity _entGetArmor = (LivingEntity)entity2;
/* 194 */         itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
/*     */       } else {
/* 196 */         itemStack = ItemStack.EMPTY;
/*     */       } 
/* 198 */       nonNullList.set(2, itemStack);
/* 199 */       _player.getInventory().setChanged();
/* 200 */     } else if (_entity instanceof LivingEntity) {
/*     */       ItemStack itemStack;
/* 202 */       LivingEntity _living = (LivingEntity)_entity;
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
/* 217 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 218 */       if (entity2 instanceof LivingEntity) {
/* 219 */         LivingEntity _entGetArmor = (LivingEntity)entity2;
/* 220 */         itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.CHEST);
/*     */       } else {
/* 222 */         itemStack = ItemStack.EMPTY;
/*     */       } 
/* 224 */       _living.setItemSlot(EquipmentSlot.CHEST, itemStack);
/*     */     } 
/* 226 */     _entity = entity;
/* 227 */     if (_entity instanceof Player) {
/*     */       ItemStack itemStack;
/* 229 */       Player _player = (Player)_entity;
/* 230 */       NonNullList nonNullList = (_player.getInventory()).armor;
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
/* 245 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 246 */       if (entity2 instanceof LivingEntity) {
/* 247 */         LivingEntity _entGetArmor = (LivingEntity)entity2;
/* 248 */         itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
/*     */       } else {
/* 250 */         itemStack = ItemStack.EMPTY;
/*     */       } 
/* 252 */       nonNullList.set(3, itemStack);
/* 253 */       _player.getInventory().setChanged();
/* 254 */     } else if (_entity instanceof LivingEntity) {
/*     */       ItemStack itemStack;
/* 256 */       LivingEntity _living = (LivingEntity)_entity;
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
/* 271 */       Entity entity2 = world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4000.0D, 4000.0D, 4000.0D), e -> true).stream().sorted((new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null);
/* 272 */       if (entity2 instanceof LivingEntity) {
/* 273 */         LivingEntity _entGetArmor = (LivingEntity)entity2;
/* 274 */         itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
/*     */       } else {
/* 276 */         itemStack = ItemStack.EMPTY;
/*     */       } 
/* 278 */       _living.setItemSlot(EquipmentSlot.HEAD, itemStack);
/*     */     } 
/* 280 */     if (Math.random() < 0.7D)
/* 281 */     { if (entity instanceof LivingEntity) { LivingEntity ent = (LivingEntity)entity;
/* 282 */         ItemStack _setstack = (new ItemStack((ItemLike)Items.IRON_PICKAXE)).copy();
/* 283 */         _setstack.setCount(1);
/* 284 */         ent.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/* 285 */         if (ent instanceof Player) {
/* 286 */           Player _player = (Player)ent;
/* 287 */           _player.getInventory().setChanged();
/*     */         }  }
/*     */        }
/* 290 */     else if (entity instanceof LivingEntity) { LivingEntity ent = (LivingEntity)entity;
/* 291 */       ItemStack _setstack = (new ItemStack((ItemLike)Items.IRON_AXE)).copy();
/* 292 */       _setstack.setCount(1);
/* 293 */       ent.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/* 294 */       if (ent instanceof Player) {
/* 295 */         Player _player = (Player)ent;
/* 296 */         _player.getInventory().setChanged();
/*     */       }  }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\deceiver\DeceiverOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */