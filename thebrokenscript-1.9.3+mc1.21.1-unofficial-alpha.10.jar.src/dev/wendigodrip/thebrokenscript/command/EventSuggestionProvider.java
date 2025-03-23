/*    */ package dev.wendigodrip.thebrokenscript.command;
/*    */ import com.mojang.brigadier.context.CommandContext;
/*    */ import com.mojang.brigadier.suggestion.SuggestionsBuilder;
/*    */ import dev.wendigodrip.thebrokenscript.registry.TBSRegistries;
/*    */ import java.util.Iterator;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\b\022\004\022\0020\0020\001B\007¢\006\004\b\003\020\004J$\020\005\032\b\022\004\022\0020\0070\0062\f\020\b\032\b\022\004\022\0020\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/command/EventSuggestionProvider;", "Lcom/mojang/brigadier/suggestion/SuggestionProvider;", "Lnet/minecraft/commands/CommandSourceStack;", "<init>", "()V", "getSuggestions", "Ljava/util/concurrent/CompletableFuture;", "Lcom/mojang/brigadier/suggestion/Suggestions;", "context", "Lcom/mojang/brigadier/context/CommandContext;", "builder", "Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;", "thebrokenscript"})
/*    */ @SourceDebugExtension({"SMAP\nEventSuggestionProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSuggestionProvider.kt\ndev/wendigodrip/thebrokenscript/command/EventSuggestionProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n1863#2,2:21\n*S KotlinDebug\n*F\n+ 1 EventSuggestionProvider.kt\ndev/wendigodrip/thebrokenscript/command/EventSuggestionProvider\n*L\n15#1:21,2\n*E\n"})
/*    */ public final class EventSuggestionProvider implements SuggestionProvider<CommandSourceStack> {
/*    */   @NotNull
/*    */   public CompletableFuture<Suggestions> getSuggestions(@NotNull CommandContext context, @NotNull SuggestionsBuilder builder) {
/* 15 */     Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(builder, "builder"); Intrinsics.checkNotNullExpressionValue(TBSRegistries.INSTANCE.getEVENT_REGISTRY().keySet(), "keySet(...)"); Iterable $this$forEach$iv = TBSRegistries.INSTANCE.getEVENT_REGISTRY().keySet(); int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 21 */     Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); ResourceLocation it = (ResourceLocation)element$iv; int $i$a$-forEach-EventSuggestionProvider$getSuggestions$1 = 0;
/*    */       builder.suggest(it.toString()); }
/*    */     
/*    */     Intrinsics.checkNotNullExpressionValue(builder.buildFuture(), "buildFuture(...)");
/*    */     return builder.buildFuture();
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\command\EventSuggestionProvider.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */