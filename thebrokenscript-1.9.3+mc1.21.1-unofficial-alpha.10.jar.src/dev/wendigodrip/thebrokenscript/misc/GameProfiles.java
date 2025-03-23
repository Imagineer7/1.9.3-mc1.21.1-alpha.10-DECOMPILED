/*    */ package dev.wendigodrip.thebrokenscript.misc;
/*    */ import com.mojang.authlib.GameProfile;
/*    */ import dev.wendigodrip.thebrokenscript.TBSConstants;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import net.minecraft.client.multiplayer.PlayerInfo;
/*    */ import net.minecraft.client.resources.PlayerSkin;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\020\020\006\032\0020\0078\006X\004¢\006\002\n\000R\020\020\b\032\0020\t8\006X\004¢\006\002\n\000R\020\020\n\032\0020\0138\006X\004¢\006\002\n\000¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/misc/GameProfiles;", "", "<init>", "()V", "NULL_UUID", "", "NULL_GAME_PROFILE", "Lcom/mojang/authlib/GameProfile;", "NULL_PLAYER_INFO", "Lnet/minecraft/client/multiplayer/PlayerInfo;", "NULL_SKIN", "Lnet/minecraft/client/resources/PlayerSkin;", "thebrokenscript"})
/*    */ public final class GameProfiles {
/*    */   @NotNull
/* 13 */   public static final GameProfiles INSTANCE = new GameProfiles(); @JvmField @NotNull public static final GameProfile NULL_GAME_PROFILE = new GameProfile(UUID.fromString("00000000-0000-0000-0000-000000000000"), "null"); @NotNull
/*    */   public static final String NULL_UUID = "00000000-0000-0000-0000-000000000000"; @JvmField
/*    */   @NotNull
/* 16 */   public static final PlayerInfo NULL_PLAYER_INFO = new PlayerInfo(NULL_GAME_PROFILE, false);
/*    */   
/*    */   @JvmField
/*    */   @NotNull
/* 20 */   public static final PlayerSkin NULL_SKIN = new PlayerSkin(TBSConstants.id("textures/skins/null.png"), null, null, null, PlayerSkin.Model.SLIM, true);
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\misc\GameProfiles.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */