/*     */ package dev.wendigodrip.thebrokenscript.vars;
/*     */ 
/*     */ import dev.wendigodrip.thebrokenscript.config.TBSConfigs;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.HolderLookup;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\006\n\002\b\035\n\002\020\013\n\002\b4\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\030\000 e2\0020\001:\001eB\007¢\006\004\b\002\020\003J\016\020W\032\0020X2\006\020Y\032\0020ZJ\030\020[\032\0020Z2\006\020Y\032\0020Z2\006\020\\\032\0020]H\026J\016\020^\032\0020X2\006\020_\032\0020`R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\006\020\007\"\004\b\b\020\tR\032\020\n\032\0020\005X\016¢\006\016\n\000\032\004\b\013\020\007\"\004\b\f\020\tR\032\020\r\032\0020\005X\016¢\006\016\n\000\032\004\b\016\020\007\"\004\b\017\020\tR\032\020\020\032\0020\005X\016¢\006\016\n\000\032\004\b\021\020\007\"\004\b\022\020\tR\032\020\023\032\0020\005X\016¢\006\016\n\000\032\004\b\024\020\007\"\004\b\025\020\tR\032\020\026\032\0020\005X\016¢\006\016\n\000\032\004\b\027\020\007\"\004\b\030\020\tR\032\020\031\032\0020\005X\016¢\006\016\n\000\032\004\b\032\020\007\"\004\b\033\020\tR\032\020\034\032\0020\005X\016¢\006\016\n\000\032\004\b\035\020\007\"\004\b\036\020\tR\032\020\037\032\0020\005X\016¢\006\016\n\000\032\004\b \020\007\"\004\b!\020\tR\032\020\"\032\0020#X\016¢\006\016\n\000\032\004\b$\020%\"\004\b&\020'R\032\020(\032\0020#X\016¢\006\016\n\000\032\004\b)\020%\"\004\b*\020'R\032\020+\032\0020#X\016¢\006\016\n\000\032\004\b+\020%\"\004\b,\020'R\032\020-\032\0020#X\016¢\006\016\n\000\032\004\b.\020%\"\004\b/\020'R\032\0200\032\0020#X\016¢\006\016\n\000\032\004\b1\020%\"\004\b2\020'R\032\0203\032\0020#X\016¢\006\016\n\000\032\004\b4\020%\"\004\b5\020'R\032\0206\032\0020#X\016¢\006\016\n\000\032\004\b7\020%\"\004\b8\020'R\032\0209\032\0020#X\016¢\006\016\n\000\032\004\b:\020%\"\004\b;\020'R\032\020<\032\0020#X\016¢\006\016\n\000\032\004\b=\020%\"\004\b>\020'R\032\020?\032\0020#X\016¢\006\016\n\000\032\004\b@\020%\"\004\bA\020'R\032\020B\032\0020#X\016¢\006\016\n\000\032\004\bC\020%\"\004\bD\020'R\032\020E\032\0020#X\016¢\006\016\n\000\032\004\bE\020%\"\004\bF\020'R\032\020G\032\0020#X\016¢\006\016\n\000\032\004\bH\020%\"\004\bI\020'R\032\020J\032\0020#X\016¢\006\016\n\000\032\004\bK\020%\"\004\bL\020'R\032\020M\032\0020\005X\016¢\006\016\n\000\032\004\bN\020\007\"\004\bO\020\tR\032\020P\032\0020\005X\016¢\006\016\n\000\032\004\bQ\020\007\"\004\bR\020\tR\032\020S\032\0020\005X\016¢\006\016\n\000\032\004\bT\020\007\"\004\bU\020\tR\016\020V\032\0020#X\016¢\006\002\n\000R$\020b\032\0020#2\006\020a\032\0020#8F@FX\016¢\006\f\032\004\bc\020%\"\004\bd\020'¨\006f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/vars/MapVariables;", "Lnet/minecraft/world/level/saveddata/SavedData;", "<init>", "()V", "baseX", "", "getBaseX", "()D", "setBaseX", "(D)V", "baseY", "getBaseY", "setBaseY", "baseZ", "getBaseZ", "setBaseZ", "homeX", "getHomeX", "setHomeX", "homeY", "getHomeY", "setHomeY", "homeZ", "getHomeZ", "setHomeZ", "dimensionSpawnX", "getDimensionSpawnX", "setDimensionSpawnX", "dimensionSpawnY", "getDimensionSpawnY", "setDimensionSpawnY", "dimensionSpawnZ", "getDimensionSpawnZ", "setDimensionSpawnZ", "hasNullSpawned", "", "getHasNullSpawned", "()Z", "setHasNullSpawned", "(Z)V", "hasSiluetSpawned", "getHasSiluetSpawned", "setHasSiluetSpawned", "isFirstJoin", "setFirstJoin", "hasGeneratedNullDimension", "getHasGeneratedNullDimension", "setHasGeneratedNullDimension", "hasCircuitSpawned", "getHasCircuitSpawned", "setHasCircuitSpawned", "hasTheBrokenEndSpawned", "getHasTheBrokenEndSpawned", "setHasTheBrokenEndSpawned", "hasGeneratedClanBuildDimension", "getHasGeneratedClanBuildDimension", "setHasGeneratedClanBuildDimension", "hasTriggeredRam2Die", "getHasTriggeredRam2Die", "setHasTriggeredRam2Die", "hasRam2DieJoined", "getHasRam2DieJoined", "setHasRam2DieJoined", "hasPlayedCreepyDisc", "getHasPlayedCreepyDisc", "setHasPlayedCreepyDisc", "hasVoidSpawned", "getHasVoidSpawned", "setHasVoidSpawned", "isNullHere", "setNullHere", "hasGeneratedField", "getHasGeneratedField", "setHasGeneratedField", "hasSpawnedEntity", "getHasSpawnedEntity", "setHasSpawnedEntity", "entityReputation", "getEntityReputation", "setEntityReputation", "noWayOutFrame", "getNoWayOutFrame", "setNoWayOutFrame", "moonPhase", "getMoonPhase", "setMoonPhase", "vhsEnabled", "read", "", "nbt", "Lnet/minecraft/nbt/CompoundTag;", "save", "provider", "Lnet/minecraft/core/HolderLookup$Provider;", "syncData", "world", "Lnet/minecraft/world/level/LevelAccessor;", "value", "showvhs", "getShowvhs", "setShowvhs", "Companion", "thebrokenscript"})
/*     */ @SourceDebugExtension({"SMAP\nMapVariables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapVariables.kt\ndev/wendigodrip/thebrokenscript/vars/MapVariables\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
/*     */ public final class MapVariables extends SavedData {
/*  14 */   public final double getBaseX() { return this.baseX; } public final void setBaseX(double <set-?>) { this.baseX = <set-?>; }
/*  15 */   public final double getBaseY() { return this.baseY; } public final void setBaseY(double <set-?>) { this.baseY = <set-?>; }
/*  16 */   public final double getBaseZ() { return this.baseZ; } public final void setBaseZ(double <set-?>) { this.baseZ = <set-?>; }
/*     */   
/*  18 */   public final double getHomeX() { return this.homeX; } public final void setHomeX(double <set-?>) { this.homeX = <set-?>; }
/*  19 */   public final double getHomeY() { return this.homeY; } public final void setHomeY(double <set-?>) { this.homeY = <set-?>; }
/*  20 */   public final double getHomeZ() { return this.homeZ; } public final void setHomeZ(double <set-?>) { this.homeZ = <set-?>; }
/*     */   
/*  22 */   public final double getDimensionSpawnX() { return this.dimensionSpawnX; } public final void setDimensionSpawnX(double <set-?>) { this.dimensionSpawnX = <set-?>; }
/*  23 */   public final double getDimensionSpawnY() { return this.dimensionSpawnY; } public final void setDimensionSpawnY(double <set-?>) { this.dimensionSpawnY = <set-?>; }
/*  24 */   public final double getDimensionSpawnZ() { return this.dimensionSpawnZ; } public final void setDimensionSpawnZ(double <set-?>) { this.dimensionSpawnZ = <set-?>; }
/*     */   
/*  26 */   public final boolean getHasNullSpawned() { return this.hasNullSpawned; } public final void setHasNullSpawned(boolean <set-?>) { this.hasNullSpawned = <set-?>; }
/*  27 */   public final boolean getHasSiluetSpawned() { return this.hasSiluetSpawned; } public final void setHasSiluetSpawned(boolean <set-?>) { this.hasSiluetSpawned = <set-?>; }
/*  28 */   private boolean isFirstJoin = true; public final boolean isFirstJoin() { return this.isFirstJoin; } public final void setFirstJoin(boolean <set-?>) { this.isFirstJoin = <set-?>; }
/*  29 */   public final boolean getHasGeneratedNullDimension() { return this.hasGeneratedNullDimension; } public final void setHasGeneratedNullDimension(boolean <set-?>) { this.hasGeneratedNullDimension = <set-?>; }
/*  30 */   public final boolean getHasCircuitSpawned() { return this.hasCircuitSpawned; } public final void setHasCircuitSpawned(boolean <set-?>) { this.hasCircuitSpawned = <set-?>; }
/*  31 */   public final boolean getHasTheBrokenEndSpawned() { return this.hasTheBrokenEndSpawned; } public final void setHasTheBrokenEndSpawned(boolean <set-?>) { this.hasTheBrokenEndSpawned = <set-?>; }
/*  32 */   public final boolean getHasGeneratedClanBuildDimension() { return this.hasGeneratedClanBuildDimension; } public final void setHasGeneratedClanBuildDimension(boolean <set-?>) { this.hasGeneratedClanBuildDimension = <set-?>; }
/*  33 */   public final boolean getHasTriggeredRam2Die() { return this.hasTriggeredRam2Die; } public final void setHasTriggeredRam2Die(boolean <set-?>) { this.hasTriggeredRam2Die = <set-?>; }
/*  34 */   public final boolean getHasRam2DieJoined() { return this.hasRam2DieJoined; } public final void setHasRam2DieJoined(boolean <set-?>) { this.hasRam2DieJoined = <set-?>; }
/*  35 */   public final boolean getHasPlayedCreepyDisc() { return this.hasPlayedCreepyDisc; } public final void setHasPlayedCreepyDisc(boolean <set-?>) { this.hasPlayedCreepyDisc = <set-?>; }
/*  36 */   public final boolean getHasVoidSpawned() { return this.hasVoidSpawned; } public final void setHasVoidSpawned(boolean <set-?>) { this.hasVoidSpawned = <set-?>; }
/*  37 */   public final boolean isNullHere() { return this.isNullHere; } public final void setNullHere(boolean <set-?>) { this.isNullHere = <set-?>; }
/*  38 */   public final boolean getHasGeneratedField() { return this.hasGeneratedField; } public final void setHasGeneratedField(boolean <set-?>) { this.hasGeneratedField = <set-?>; }
/*  39 */   public final boolean getHasSpawnedEntity() { return this.hasSpawnedEntity; } public final void setHasSpawnedEntity(boolean <set-?>) { this.hasSpawnedEntity = <set-?>; }
/*  40 */    private double entityReputation = 1.0D; public final double getEntityReputation() { return this.entityReputation; } public final void setEntityReputation(double <set-?>) { this.entityReputation = <set-?>; }
/*  41 */   public final double getNoWayOutFrame() { return this.noWayOutFrame; } public final void setNoWayOutFrame(double <set-?>) { this.noWayOutFrame = <set-?>; }
/*  42 */   public final double getMoonPhase() { return this.moonPhase; } public final void setMoonPhase(double <set-?>) { this.moonPhase = <set-?>; }
/*     */   
/*     */   private boolean vhsEnabled = true;
/*     */   
/*     */   public final void read(@NotNull CompoundTag nbt) {
/*  47 */     Intrinsics.checkNotNullParameter(nbt, "nbt"); this.baseX = nbt.getDouble("baseX");
/*  48 */     this.baseY = nbt.getDouble("baseY");
/*  49 */     this.baseZ = nbt.getDouble("baseZ");
/*  50 */     this.hasNullSpawned = nbt.getBoolean("isnullspawned");
/*  51 */     this.hasSiluetSpawned = nbt.getBoolean("issiluettspawned");
/*  52 */     this.isFirstJoin = nbt.getBoolean("firstjoin");
/*  53 */     this.homeX = nbt.getDouble("homeX");
/*  54 */     this.homeY = nbt.getDouble("homeY");
/*  55 */     this.homeZ = nbt.getDouble("homeZ");
/*  56 */     this.hasGeneratedNullDimension = nbt.getBoolean("isnulldimentiongenerated");
/*  57 */     this.dimensionSpawnX = nbt.getDouble("dimentionspawnX");
/*  58 */     this.dimensionSpawnY = nbt.getDouble("dimentionspawnY");
/*  59 */     this.dimensionSpawnZ = nbt.getDouble("dimentionspawnZ");
/*  60 */     this.vhsEnabled = nbt.getBoolean("showvhs");
/*  61 */     this.hasCircuitSpawned = nbt.getBoolean("iscircuitspawned");
/*  62 */     this.hasTheBrokenEndSpawned = nbt.getBoolean("isthebrokenendspawned");
/*  63 */     this.hasGeneratedClanBuildDimension = nbt.getBoolean("clanbuilddimensiongenerated");
/*  64 */     this.hasTriggeredRam2Die = nbt.getBoolean("ram2dietriggered");
/*  65 */     this.hasRam2DieJoined = nbt.getBoolean("ram2diejoined");
/*  66 */     this.hasPlayedCreepyDisc = nbt.getBoolean("disc13or11played");
/*  67 */     this.hasVoidSpawned = nbt.getBoolean("isvoidspawned");
/*  68 */     this.isNullHere = nbt.getBoolean("nullishere");
/*  69 */     this.hasGeneratedField = nbt.getBoolean("isfieldGenerated");
/*  70 */     this.hasSpawnedEntity = nbt.getBoolean("isentityspawned");
/*  71 */     this.entityReputation = nbt.getDouble("reputation");
/*  72 */     this.noWayOutFrame = nbt.getDouble("nowayoutframe");
/*  73 */     this.moonPhase = nbt.getDouble("moonphase");
/*     */   }
/*     */   @NotNull
/*     */   public CompoundTag save(@NotNull CompoundTag nbt, @NotNull HolderLookup.Provider provider) {
/*  77 */     Intrinsics.checkNotNullParameter(nbt, "nbt"); Intrinsics.checkNotNullParameter(provider, "provider"); nbt.putDouble("baseX", this.baseX);
/*  78 */     nbt.putDouble("baseY", this.baseY);
/*  79 */     nbt.putDouble("baseZ", this.baseZ);
/*  80 */     nbt.putBoolean("isnullspawned", this.hasNullSpawned);
/*  81 */     nbt.putBoolean("issiluettspawned", this.hasSiluetSpawned);
/*  82 */     nbt.putBoolean("firstjoin", this.isFirstJoin);
/*  83 */     nbt.putDouble("homeX", this.homeX);
/*  84 */     nbt.putDouble("homeY", this.homeY);
/*  85 */     nbt.putDouble("homeZ", this.homeZ);
/*  86 */     nbt.putBoolean("isnulldimentiongenerated", this.hasGeneratedNullDimension);
/*  87 */     nbt.putDouble("dimentionspawnX", this.dimensionSpawnX);
/*  88 */     nbt.putDouble("dimentionspawnY", this.dimensionSpawnY);
/*  89 */     nbt.putDouble("dimentionspawnZ", this.dimensionSpawnZ);
/*  90 */     nbt.putBoolean("showvhs", this.vhsEnabled);
/*  91 */     nbt.putBoolean("iscircuitspawned", this.hasCircuitSpawned);
/*  92 */     nbt.putBoolean("isthebrokenendspawned", this.hasTheBrokenEndSpawned);
/*  93 */     nbt.putBoolean("clanbuilddimensiongenerated", this.hasGeneratedClanBuildDimension);
/*  94 */     nbt.putBoolean("ram2dietriggered", this.hasTriggeredRam2Die);
/*  95 */     nbt.putBoolean("ram2diejoined", this.hasRam2DieJoined);
/*  96 */     nbt.putBoolean("disc13or11played", this.hasPlayedCreepyDisc);
/*  97 */     nbt.putBoolean("isvoidspawned", this.hasVoidSpawned);
/*  98 */     nbt.putBoolean("nullishere", this.isNullHere);
/*  99 */     nbt.putBoolean("isfieldGenerated", this.hasGeneratedField);
/* 100 */     nbt.putBoolean("isentityspawned", this.hasSpawnedEntity);
/* 101 */     nbt.putDouble("reputation", this.entityReputation);
/* 102 */     nbt.putDouble("nowayoutframe", this.noWayOutFrame);
/* 103 */     nbt.putDouble("moonphase", this.moonPhase);
/* 104 */     return nbt;
/*     */   }
/*     */   
/*     */   public final void syncData(@NotNull LevelAccessor world) {
/* 108 */     Intrinsics.checkNotNullParameter(world, "world"); setDirty();
/* 109 */     if (world instanceof Level && !((Level)world).isClientSide()) {
/* 110 */       PacketDistributor.sendToAllPlayers(
/* 111 */           (CustomPacketPayload)new SavedDataSyncMessage(0, this), new CustomPacketPayload[0]);
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public final boolean getShowvhs() {
/* 117 */     if (this.vhsEnabled) { TBSConfigs.INSTANCE.getCLIENT(); if ((TBSConfigs.INSTANCE.getCLIENT() != null) ? TBSConfigs.INSTANCE.getCLIENT().getEnableVhsOverlay() : true); }  return false; } public final void setShowvhs(boolean value) {
/* 118 */     MapVariables $this$_set_showvhs__u24lambda_u240 = this;
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
/* 146 */     int $i$a$-run-MapVariables$showvhs$1 = 0;
/*     */     $this$_set_showvhs__u24lambda_u240.vhsEnabled = value;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\f\032\0020\0072\006\020\r\032\0020\016J\020\020\017\032\0020\0072\006\020\020\032\0020\021H\007R\016\020\004\032\0020\005XT¢\006\002\n\000R\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;", "", "<init>", "()V", "DATA_NAME", "", "clientVariables", "Ldev/wendigodrip/thebrokenscript/vars/MapVariables;", "getClientVariables", "()Ldev/wendigodrip/thebrokenscript/vars/MapVariables;", "setClientVariables", "(Ldev/wendigodrip/thebrokenscript/vars/MapVariables;)V", "load", "tag", "Lnet/minecraft/nbt/CompoundTag;", "get", "world", "Lnet/minecraft/world/level/LevelAccessor;", "thebrokenscript"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final MapVariables getClientVariables() {
/*     */       return MapVariables.clientVariables;
/*     */     }
/*     */     
/*     */     public final void setClientVariables(@NotNull MapVariables <set-?>) {
/*     */       Intrinsics.checkNotNullParameter(<set-?>, "<set-?>");
/*     */       MapVariables.clientVariables = <set-?>;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final MapVariables load(@NotNull CompoundTag tag) {
/*     */       Intrinsics.checkNotNullParameter(tag, "tag");
/*     */       MapVariables data = new MapVariables();
/*     */       data.read(tag);
/*     */       return data;
/*     */     }
/*     */     
/*     */     @JvmStatic
/*     */     @NotNull
/*     */     public final MapVariables get(@NotNull LevelAccessor world) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'world'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_1
/*     */       //   7: instanceof net/minecraft/world/level/ServerLevelAccessor
/*     */       //   10: ifeq -> 80
/*     */       //   13: aload_1
/*     */       //   14: checkcast net/minecraft/world/level/ServerLevelAccessor
/*     */       //   17: invokeinterface getLevel : ()Lnet/minecraft/server/level/ServerLevel;
/*     */       //   22: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */       //   25: getstatic net/minecraft/world/level/Level.OVERWORLD : Lnet/minecraft/resources/ResourceKey;
/*     */       //   28: invokevirtual getLevel : (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/server/level/ServerLevel;
/*     */       //   31: dup
/*     */       //   32: ifnull -> 71
/*     */       //   35: invokevirtual getDataStorage : ()Lnet/minecraft/world/level/storage/DimensionDataStorage;
/*     */       //   38: dup
/*     */       //   39: ifnull -> 71
/*     */       //   42: new net/minecraft/world/level/saveddata/SavedData$Factory
/*     */       //   45: dup
/*     */       //   46: <illegal opcode> get : ()Ljava/util/function/Supplier;
/*     */       //   51: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
/*     */       //   56: invokespecial <init> : (Ljava/util/function/Supplier;Ljava/util/function/BiFunction;)V
/*     */       //   59: ldc 'thebrokenscript_mapvars'
/*     */       //   61: invokevirtual computeIfAbsent : (Lnet/minecraft/world/level/saveddata/SavedData$Factory;Ljava/lang/String;)Lnet/minecraft/world/level/saveddata/SavedData;
/*     */       //   64: checkcast dev/wendigodrip/thebrokenscript/vars/MapVariables
/*     */       //   67: dup
/*     */       //   68: ifnonnull -> 79
/*     */       //   71: pop
/*     */       //   72: new dev/wendigodrip/thebrokenscript/vars/MapVariables
/*     */       //   75: dup
/*     */       //   76: invokespecial <init> : ()V
/*     */       //   79: areturn
/*     */       //   80: aload_0
/*     */       //   81: invokevirtual getClientVariables : ()Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */       //   84: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #135	-> 6
/*     */       //   #136	-> 13
/*     */       //   #137	-> 42
/*     */       //   #136	-> 61
/*     */       //   #138	-> 72
/*     */       //   #136	-> 79
/*     */       //   #141	-> 80
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	85	0	this	Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */       //   0	85	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */     }
/*     */     
/*     */     private static final MapVariables get$lambda$0() {
/*     */       return new MapVariables();
/*     */     }
/*     */     
/*     */     private static final MapVariables get$lambda$1(CompoundTag tag, HolderLookup.Provider param1Provider) {
/*     */       Intrinsics.checkNotNull(tag);
/*     */       return MapVariables.Companion.load(tag);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private static MapVariables clientVariables = new MapVariables();
/*     */   private double baseX;
/*     */   private double baseY;
/*     */   private double baseZ;
/*     */   private double homeX;
/*     */   private double homeY;
/*     */   private double homeZ;
/*     */   private double dimensionSpawnX;
/*     */   private double dimensionSpawnY;
/*     */   private double dimensionSpawnZ;
/*     */   private boolean hasNullSpawned;
/*     */   private boolean hasSiluetSpawned;
/*     */   private boolean hasGeneratedNullDimension;
/*     */   private boolean hasCircuitSpawned;
/*     */   private boolean hasTheBrokenEndSpawned;
/*     */   private boolean hasGeneratedClanBuildDimension;
/*     */   private boolean hasTriggeredRam2Die;
/*     */   private boolean hasRam2DieJoined;
/*     */   private boolean hasPlayedCreepyDisc;
/*     */   private boolean hasVoidSpawned;
/*     */   private boolean isNullHere;
/*     */   private boolean hasGeneratedField;
/*     */   private boolean hasSpawnedEntity;
/*     */   private double noWayOutFrame;
/*     */   private double moonPhase;
/*     */   @NotNull
/*     */   private static final String DATA_NAME = "thebrokenscript_mapvars";
/*     */   
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public static final MapVariables get(@NotNull LevelAccessor world) {
/*     */     return Companion.get(world);
/*     */   }
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\vars\MapVariables.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */