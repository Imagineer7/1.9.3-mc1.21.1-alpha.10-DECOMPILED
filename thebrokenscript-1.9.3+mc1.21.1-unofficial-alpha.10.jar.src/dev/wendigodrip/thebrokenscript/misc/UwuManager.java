/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\025\n\000\n\002\020\b\n\000\n\002\020\013\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\b\032\0020\tH\007R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/UwuManager;", "", "<init>", "()V", "NUMBERS", "", "MAX_CHANCE", "", "shouldBeUwu", "", "thebrokenscript"})
/*    */ public final class UwuManager {
/*    */   @NotNull
/*  6 */   public static final UwuManager INSTANCE = new UwuManager(); @NotNull private static final int[] NUMBERS; private static final int MAX_CHANCE = 10000; static { int[] arrayOfInt = new int[13]; arrayOfInt[0] = 69; arrayOfInt[1] = 420; arrayOfInt[2] = 666; arrayOfInt[3] = 6669; arrayOfInt[4] = 2025; arrayOfInt[5] = 2020; arrayOfInt[6] = 4311; arrayOfInt[7] = 8008; arrayOfInt[8] = 111; arrayOfInt[9] = 999; arrayOfInt[10] = 2312; arrayOfInt[11] = 5808; arrayOfInt[12] = 8690; NUMBERS = arrayOfInt; }
/*    */   
/*    */   @JvmStatic
/*    */   public static final boolean shouldBeUwu() {
/* 10 */     return (Random.Default.nextInt(0, 10000) == ArraysKt.random(NUMBERS, (Random)Random.Default));
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\UwuManager.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */