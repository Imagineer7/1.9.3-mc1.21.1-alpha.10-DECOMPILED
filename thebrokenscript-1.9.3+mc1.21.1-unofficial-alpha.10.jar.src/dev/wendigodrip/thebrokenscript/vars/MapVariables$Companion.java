/*     */ package dev.wendigodrip.thebrokenscript.vars;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import net.minecraft.core.HolderLookup;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\f\032\0020\0072\006\020\r\032\0020\016J\020\020\017\032\0020\0072\006\020\020\032\0020\021H\007R\016\020\004\032\0020\005XT¢\006\002\n\000R\032\020\006\032\0020\007X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;", "", "<init>", "()V", "DATA_NAME", "", "clientVariables", "Ldev/wendigodrip/thebrokenscript/vars/MapVariables;", "getClientVariables", "()Ldev/wendigodrip/thebrokenscript/vars/MapVariables;", "setClientVariables", "(Ldev/wendigodrip/thebrokenscript/vars/MapVariables;)V", "load", "tag", "Lnet/minecraft/nbt/CompoundTag;", "get", "world", "Lnet/minecraft/world/level/LevelAccessor;", "thebrokenscript"})
/*     */ public final class Companion
/*     */ {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*     */   public final MapVariables getClientVariables() {
/* 123 */     return MapVariables.access$getClientVariables$cp(); } public final void setClientVariables(@NotNull MapVariables <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); MapVariables.access$setClientVariables$cp(<set-?>); }
/*     */    @NotNull
/*     */   public final MapVariables load(@NotNull CompoundTag tag) {
/* 126 */     Intrinsics.checkNotNullParameter(tag, "tag"); MapVariables data = new MapVariables();
/*     */     
/* 128 */     data.read(tag);
/*     */     
/* 130 */     return data;
/*     */   }
/*     */   @JvmStatic
/*     */   @NotNull
/*     */   public final MapVariables get(@NotNull LevelAccessor world) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'world'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: instanceof net/minecraft/world/level/ServerLevelAccessor
/*     */     //   10: ifeq -> 80
/*     */     //   13: aload_1
/*     */     //   14: checkcast net/minecraft/world/level/ServerLevelAccessor
/*     */     //   17: invokeinterface getLevel : ()Lnet/minecraft/server/level/ServerLevel;
/*     */     //   22: invokevirtual getServer : ()Lnet/minecraft/server/MinecraftServer;
/*     */     //   25: getstatic net/minecraft/world/level/Level.OVERWORLD : Lnet/minecraft/resources/ResourceKey;
/*     */     //   28: invokevirtual getLevel : (Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/server/level/ServerLevel;
/*     */     //   31: dup
/*     */     //   32: ifnull -> 71
/*     */     //   35: invokevirtual getDataStorage : ()Lnet/minecraft/world/level/storage/DimensionDataStorage;
/*     */     //   38: dup
/*     */     //   39: ifnull -> 71
/*     */     //   42: new net/minecraft/world/level/saveddata/SavedData$Factory
/*     */     //   45: dup
/*     */     //   46: <illegal opcode> get : ()Ljava/util/function/Supplier;
/*     */     //   51: <illegal opcode> apply : ()Ljava/util/function/BiFunction;
/*     */     //   56: invokespecial <init> : (Ljava/util/function/Supplier;Ljava/util/function/BiFunction;)V
/*     */     //   59: ldc 'thebrokenscript_mapvars'
/*     */     //   61: invokevirtual computeIfAbsent : (Lnet/minecraft/world/level/saveddata/SavedData$Factory;Ljava/lang/String;)Lnet/minecraft/world/level/saveddata/SavedData;
/*     */     //   64: checkcast dev/wendigodrip/thebrokenscript/vars/MapVariables
/*     */     //   67: dup
/*     */     //   68: ifnonnull -> 79
/*     */     //   71: pop
/*     */     //   72: new dev/wendigodrip/thebrokenscript/vars/MapVariables
/*     */     //   75: dup
/*     */     //   76: invokespecial <init> : ()V
/*     */     //   79: areturn
/*     */     //   80: aload_0
/*     */     //   81: invokevirtual getClientVariables : ()Ldev/wendigodrip/thebrokenscript/vars/MapVariables;
/*     */     //   84: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #135	-> 6
/*     */     //   #136	-> 13
/*     */     //   #137	-> 42
/*     */     //   #136	-> 61
/*     */     //   #138	-> 72
/*     */     //   #136	-> 79
/*     */     //   #141	-> 80
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	85	0	this	Ldev/wendigodrip/thebrokenscript/vars/MapVariables$Companion;
/*     */     //   0	85	1	world	Lnet/minecraft/world/level/LevelAccessor;
/*     */   }
/* 137 */   private static final MapVariables get$lambda$0() { return new MapVariables(); } private static final MapVariables get$lambda$1(CompoundTag tag, HolderLookup.Provider paramProvider) { Intrinsics.checkNotNull(tag); return MapVariables.Companion.load(tag); }
/*     */ 
/*     */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\vars\MapVariables$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */