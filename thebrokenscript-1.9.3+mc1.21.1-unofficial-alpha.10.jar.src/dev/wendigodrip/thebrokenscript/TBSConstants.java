/*    */ package dev.wendigodrip.thebrokenscript;
/*    */ import java.util.Collection;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\002\b\007\n\002\020\002\n\002\b\003\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\017\032\0020\020H\007J\020\020\021\032\0020\b2\006\020\022\032\0020\005H\007R\016\020\004\032\0020\005XT¢\006\002\n\000R\026\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\004\n\002\020\tR\020\020\n\032\004\030\0010\bX\016¢\006\002\n\000R\032\020\013\032\0020\b8FX\004¢\006\f\022\004\b\f\020\003\032\004\b\r\020\016¨\006\023"}, d2 = {"Ldev/wendigodrip/thebrokenscript/TBSConstants;", "", "<init>", "()V", "MOD_ID", "", "MENU_BACKGROUNDS", "", "Lnet/minecraft/resources/ResourceLocation;", "[Lnet/minecraft/resources/ResourceLocation;", "CURRENT_MENU_BACKGROUND", "MENU_BACKGROUND", "getMENU_BACKGROUND$annotations", "getMENU_BACKGROUND", "()Lnet/minecraft/resources/ResourceLocation;", "refreshMenuBackground", "", "id", "path", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nTBSConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TBSConstants.kt\ndev/wendigodrip/thebrokenscript/TBSConstants\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,40:1\n1#2:41\n11158#3:42\n11493#3,3:43\n37#4:46\n36#4,3:47\n*S KotlinDebug\n*F\n+ 1 TBSConstants.kt\ndev/wendigodrip/thebrokenscript/TBSConstants\n*L\n22#1:42\n22#1:43,3\n22#1:46\n22#1:47,3\n*E\n"})
/*    */ public final class TBSConstants {
/*    */   static {
/*  9 */     String[] arrayOfString1 = new String[13]; arrayOfString1[0] = "brokenend"; arrayOfString1[1] = 
/* 10 */       "brokenend2";
/* 11 */     arrayOfString1[2] = "circuit";
/* 12 */     arrayOfString1[3] = "circuit2";
/* 13 */     arrayOfString1[4] = "integrity";
/* 14 */     arrayOfString1[5] = "integrity2";
/* 15 */     arrayOfString1[6] = "moon1";
/* 16 */     arrayOfString1[7] = "moon2";
/* 17 */     arrayOfString1[8] = "moon3";
/* 18 */     arrayOfString1[9] = "moon4";
/* 19 */     arrayOfString1[10] = "moon5";
/* 20 */     arrayOfString1[11] = "moon6";
/* 21 */     arrayOfString1[12] = "moon7"; arrayOfString1 = arrayOfString1;
/* 22 */     int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 42 */     String[] arrayOfString2 = arrayOfString1; Collection<ResourceLocation> destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b; int i;
/* 43 */     for (b = 0, i = arrayOfString2.length; b < i; ) { Object item$iv$iv = arrayOfString2[b];
/* 44 */       Object object1 = item$iv$iv; Collection<ResourceLocation> collection = destination$iv$iv; int $i$a$-map-TBSConstants$MENU_BACKGROUNDS$1 = 0; collection.add(id("textures/gui/menu/" + object1 + ".png")); }
/* 45 */      List list = (List)destination$iv$iv;
/*    */     int $i$f$toTypedArray = 0;
/* 47 */     Collection thisCollection$iv = list;
/*    */     
/* 49 */     MENU_BACKGROUNDS = (ResourceLocation[])thisCollection$iv.toArray((Object[])new ResourceLocation[0]);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final TBSConstants INSTANCE = new TBSConstants();
/*    */   @NotNull
/*    */   public static final String MOD_ID = "thebrokenscript";
/*    */   @NotNull
/*    */   private static final ResourceLocation[] MENU_BACKGROUNDS;
/*    */   @Nullable
/*    */   private static ResourceLocation CURRENT_MENU_BACKGROUND;
/*    */   
/*    */   @NotNull
/*    */   public static final ResourceLocation getMENU_BACKGROUND() {
/*    */     if (CURRENT_MENU_BACKGROUND == null) {
/*    */       Object object = ArraysKt.random((Object[])MENU_BACKGROUNDS, (Random)Random.Default);
/*    */       ResourceLocation it = (ResourceLocation)object;
/*    */       int $i$a$-also-TBSConstants$MENU_BACKGROUND$1 = 0;
/*    */       CURRENT_MENU_BACKGROUND = it;
/*    */     } 
/*    */     return (ResourceLocation)object;
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   public static final void refreshMenuBackground() {
/*    */     CURRENT_MENU_BACKGROUND = (ResourceLocation)ArraysKt.random((Object[])MENU_BACKGROUNDS, (Random)Random.Default);
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   @NotNull
/*    */   public static final ResourceLocation id(@NotNull String path) {
/*    */     Intrinsics.checkNotNullParameter(path, "path");
/*    */     Intrinsics.checkNotNullExpressionValue(ResourceLocation.fromNamespaceAndPath("thebrokenscript", path), "fromNamespaceAndPath(...)");
/*    */     return ResourceLocation.fromNamespaceAndPath("thebrokenscript", path);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\TBSConstants.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */