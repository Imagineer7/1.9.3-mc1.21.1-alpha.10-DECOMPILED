/*    */ package dev.wendigodrip.thebrokenscript.client.renderer;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.client.renderer.entity.EntityRenderer;
/*    */ import net.minecraft.client.renderer.entity.EntityRendererProvider;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\"\020\004\032\n\022\006\022\004\030\001H\0060\005\"\n\b\001\020\006*\004\030\0010\0072\006\020\b\032\0020\t¨\006\n"}, d2 = {"Ldev/wendigodrip/thebrokenscript/client/renderer/BasicTexturedRenderer$Companion;", "", "<init>", "()V", "create", "Lnet/minecraft/client/renderer/entity/EntityRendererProvider;", "T", "Lnet/minecraft/world/entity/Mob;", "location", "", "thebrokenscript"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final <T extends Mob> EntityRendererProvider<T> create(@NotNull String location) {
/* 35 */     Intrinsics.checkNotNullParameter(location, "location"); return location::create$lambda$0; } private static final EntityRenderer create$lambda$0(String $location, EntityRendererProvider.Context context) {
/* 36 */     Intrinsics.checkNotNullParameter(context, "context"); return (EntityRenderer)new BasicTexturedRenderer<>(
/* 37 */         context, 
/* 38 */         $location, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\client\renderer\BasicTexturedRenderer$Companion.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */