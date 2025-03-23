/*     */ package dev.wendigodrip.thebrokenscript.procedures.nullent;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*     */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*     */ import java.util.Comparator;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.Holder;
/*     */ import net.minecraft.core.registries.BuiltInRegistries;
/*     */ import net.minecraft.core.registries.Registries;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.damagesource.DamageTypes;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.AABB;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ public class NullEndgameOnInitialEntitySpawnProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  29 */     if (entity == null) {
/*     */       return;
/*     */     }
/*  32 */     if (world instanceof Level) {
/*  33 */       Level _level = (Level)world;
/*  34 */       if (!_level.isClientSide()) {
/*  35 */         _level.playSound(null, 
/*     */             
/*  37 */             BlockPos.containing(x, y, z), (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*  38 */             .get(TBSConstants.id("theendisnear")), SoundSource.NEUTRAL, 555.0F, 1.0F);
/*     */       
/*     */       }
/*     */       else {
/*     */ 
/*     */         
/*  44 */         _level.playLocalSound(x, y, z, (SoundEvent)BuiltInRegistries.SOUND_EVENT
/*     */ 
/*     */ 
/*     */             
/*  48 */             .get(TBSConstants.id("theendisnear")), SoundSource.NEUTRAL, 555.0F, 1.0F, false);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  56 */     if (world instanceof ServerLevel) {
/*  57 */       ServerLevel serverLevel = (ServerLevel)world;
/*  58 */       serverLevel.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  66 */             (Component)Component.literal(""), serverLevel
/*  67 */             .getServer(), null))
/*     */           
/*  69 */           .withSuppressedOutput(), "tellraw @a {\"text\":\"HERE I AM\",\"color\":\"dark_red\"}");
/*     */     } 
/*     */     
/*  72 */     if (world instanceof ServerLevel) {
/*  73 */       ServerLevel serverLevel = (ServerLevel)world;
/*  74 */       serverLevel.getServer().getCommands().performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, serverLevel, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */             
/*  82 */             (Component)Component.literal(""), serverLevel
/*  83 */             .getServer(), null))
/*     */           
/*  85 */           .withSuppressedOutput(), "tellraw @a {\"text\":\"VOIDNULLSILUETTANOMALY\",\"obfuscated\":true,\"color\":\"dark_red\"}");
/*     */     } 
/*     */ 
/*     */     
/*  89 */     entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(((Player)world
/*     */           
/*  91 */           .getEntitiesOfClass(Player.class, 
/*     */             
/*  93 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */           
/*  96 */           .stream()
/*  97 */           .sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 100 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 102 */             }).compareDistOf(x, y, z))
/* 103 */           .findFirst()
/* 104 */           .orElse(null))
/* 105 */           .getX(), ((Player)world
/* 106 */           .getEntitiesOfClass(Player.class, 
/*     */             
/* 108 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */           
/* 111 */           .stream()
/* 112 */           .sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 115 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 121 */             }).compareDistOf(x, y, z))
/* 122 */           .findFirst()
/* 123 */           .orElse(null))
/* 124 */           .getZ() + 1.0D, ((Player)world
/* 125 */           .getEntitiesOfClass(Player.class, 
/*     */             
/* 127 */             AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/*     */ 
/*     */           
/* 130 */           .stream()
/* 131 */           .sorted((new Object()
/*     */             {
/*     */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 134 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */               }
/* 136 */             }).compareDistOf(x, y, z))
/* 137 */           .findFirst()
/* 138 */           .orElse(null))
/* 139 */           .getY()));
/*     */ 
/*     */     
/* 142 */     ((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), e -> true)
/* 143 */       .stream()
/* 144 */       .sorted((new Object()
/*     */         {
/*     */           Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 147 */             return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */           }
/* 149 */         }).compareDistOf(x, y, z))
/* 150 */       .findFirst()
/* 151 */       .orElse(null))
/* 152 */       .lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y + 1.0D, z));
/* 153 */     TheBrokenScript.queueServerWork(20, () -> {
/*     */           if (!entity.level().isClientSide()) {
/*     */             entity.discard();
/*     */           }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/*     */           ((Player)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 500.0D, 500.0D, 500.0D), ()).stream().sorted((new Object()
/*     */               {
/*     */                 Comparator<Entity> compareDistOf(double _x, double _y, double _z)
/*     */                 {
/* 167 */                   return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*     */                 }
/*     */               }).compareDistOf(x, y, z)).findFirst().orElse(null)).hurt(new DamageSource((Holder)world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.FELL_OUT_OF_WORLD)), 100.0F);
/*     */         });
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\nullent\NullEndgameOnInitialEntitySpawnProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */