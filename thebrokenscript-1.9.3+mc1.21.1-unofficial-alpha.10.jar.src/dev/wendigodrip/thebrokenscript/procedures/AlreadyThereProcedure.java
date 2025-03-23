/*     */ package dev.wendigodrip.thebrokenscript.procedures;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.commands.CommandSource;
/*     */ import net.minecraft.commands.CommandSourceStack;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec2;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.neoforged.bus.api.Event;
/*     */ import net.neoforged.bus.api.SubscribeEvent;
/*     */ import net.neoforged.fml.common.EventBusSubscriber;
/*     */ import net.neoforged.neoforge.event.entity.player.PlayerEvent;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class AlreadyThereProcedure
/*     */ {
/*     */   @SubscribeEvent
/*     */   public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
/*  22 */     execute((Event)event, (LevelAccessor)event
/*     */         
/*  24 */         .getEntity().level(), event
/*  25 */         .getEntity().getX(), event
/*  26 */         .getEntity().getY(), event
/*  27 */         .getEntity().getZ(), (Entity)event
/*  28 */         .getEntity());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  33 */     execute(null, world, x, y, z, entity);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
/*  44 */     if (entity != null) {
/*  45 */       if (entity.getDisplayName().getString().equals("xXram2dieXx") && world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  46 */         _level.getServer()
/*  47 */           .getCommands()
/*  48 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  56 */               (Component)Component.literal(""), _level
/*  57 */               .getServer(), null))
/*     */ 
/*     */             
/*  60 */             .withSuppressedOutput(), "kick @p Player is already playing on this server."); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  65 */       if (entity.getDisplayName().getString().equals("DyeXD412") && world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  66 */         _level.getServer()
/*  67 */           .getCommands()
/*  68 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  76 */               (Component)Component.literal(""), _level
/*  77 */               .getServer(), null))
/*     */ 
/*     */             
/*  80 */             .withSuppressedOutput(), "kick @p Player is already playing on this server."); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  85 */       if (entity.getDisplayName().getString().equals("null") && world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/*  86 */         _level.getServer()
/*  87 */           .getCommands()
/*  88 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/*  96 */               (Component)Component.literal(""), _level
/*  97 */               .getServer(), null))
/*     */ 
/*     */             
/* 100 */             .withSuppressedOutput(), "kick @p Player is already playing on this server."); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 105 */       if (entity.getDisplayName().getString().equals("Null") && world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 106 */         _level.getServer()
/* 107 */           .getCommands()
/* 108 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 116 */               (Component)Component.literal(""), _level
/* 117 */               .getServer(), null))
/*     */ 
/*     */             
/* 120 */             .withSuppressedOutput(), "kick @p Player is already playing on this server."); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 125 */       if (entity.getDisplayName().getString().equals("Integrity") && world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 126 */         _level.getServer()
/* 127 */           .getCommands()
/* 128 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 136 */               (Component)Component.literal(""), _level
/* 137 */               .getServer(), null))
/*     */ 
/*     */             
/* 140 */             .withSuppressedOutput(), "kick @p I am watching you."); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 145 */       if (entity.getDisplayName().getString().equals("Modrome") && world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 146 */         _level.getServer()
/* 147 */           .getCommands()
/* 148 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 156 */               (Component)Component.literal(""), _level
/* 157 */               .getServer(), null))
/*     */ 
/*     */             
/* 160 */             .withSuppressedOutput(), "kick @p I am right behind you <o>"); }
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 165 */       if (entity.getDisplayName().getString().equals("modrome") && world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 166 */         _level.getServer()
/* 167 */           .getCommands()
/* 168 */           .performPrefixedCommand((new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 176 */               (Component)Component.literal(""), _level
/* 177 */               .getServer(), null))
/*     */ 
/*     */             
/* 180 */             .withSuppressedOutput(), "kick @p I am right behind you <o>"); }
/*     */     
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\AlreadyThereProcedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */