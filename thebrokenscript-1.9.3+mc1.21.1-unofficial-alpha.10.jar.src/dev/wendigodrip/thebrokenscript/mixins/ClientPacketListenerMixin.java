/*    */ package dev.wendigodrip.thebrokenscript.mixins;
/*    */ 
/*    */ import com.llamalad7.mixinextras.injector.ModifyReturnValue;
/*    */ import dev.wendigodrip.thebrokenscript.misc.GameProfiles;
/*    */ import dev.wendigodrip.thebrokenscript.vars.MapVariables;
/*    */ import java.util.Collection;
/*    */ import net.minecraft.client.multiplayer.ClientLevel;
/*    */ import net.minecraft.client.multiplayer.ClientPacketListener;
/*    */ import net.minecraft.client.multiplayer.PlayerInfo;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import org.spongepowered.asm.mixin.Mixin;
/*    */ import org.spongepowered.asm.mixin.Shadow;
/*    */ import org.spongepowered.asm.mixin.injection.At;
/*    */ 
/*    */ 
/*    */ @Mixin({ClientPacketListener.class})
/*    */ public class ClientPacketListenerMixin
/*    */ {
/*    */   @ModifyReturnValue(method = {"getListedOnlinePlayers"}, at = {@At("RETURN")})
/*    */   public Collection<PlayerInfo> modifyOnlinePlayers(Collection<PlayerInfo> original) {
/* 21 */     if (MapVariables.get((LevelAccessor)this.level).isNullHere()) original.add(GameProfiles.NULL_PLAYER_INFO);
/*    */     
/* 23 */     return original;
/*    */   }
/*    */   
/*    */   @Shadow
/*    */   private ClientLevel level;
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\mixins\ClientPacketListenerMixin.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */