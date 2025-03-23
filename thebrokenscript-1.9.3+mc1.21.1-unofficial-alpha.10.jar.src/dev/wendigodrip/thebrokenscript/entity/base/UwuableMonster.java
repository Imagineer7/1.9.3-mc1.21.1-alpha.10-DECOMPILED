/*    */ package dev.wendigodrip.thebrokenscript.entity.base;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.nbt.CompoundTag;
/*    */ import net.minecraft.world.level.Level;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\b&\030\0002\0020\0012\0020\002B\037\022\016\020\003\032\n\022\006\b\001\022\0020\0010\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\020\020\013\032\0020\f2\006\020\r\032\0020\016H\026J\020\020\017\032\0020\f2\006\020\r\032\0020\016H\026R\016\020\t\032\0020\nX\016¢\006\002\n\000R\021\020\020\032\0020\n8F¢\006\006\032\004\b\020\020\021¨\006\022"}, d2 = {"Ldev/wendigodrip/thebrokenscript/entity/base/UwuableMonster;", "Lnet/minecraft/world/entity/monster/Monster;", "Lsoftware/bernie/geckolib/animatable/GeoAnimatable;", "type", "Lnet/minecraft/world/entity/EntityType;", "world", "Lnet/minecraft/world/level/Level;", "<init>", "(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/Level;)V", "uwu", "", "addAdditionalSaveData", "", "compound", "Lnet/minecraft/nbt/CompoundTag;", "readAdditionalSaveData", "isUwu", "()Z", "thebrokenscript"})
/*    */ public abstract class UwuableMonster extends Monster implements GeoAnimatable {
/*    */   public UwuableMonster(@NotNull EntityType type, @NotNull Level world) {
/* 10 */     super(type, world);
/*    */ 
/*    */ 
/*    */     
/* 14 */     this.uwu = UwuManager.shouldBeUwu();
/*    */   }
/*    */   private boolean uwu;
/*    */   public void addAdditionalSaveData(@NotNull CompoundTag compound) {
/* 18 */     Intrinsics.checkNotNullParameter(compound, "compound"); compound.putBoolean("uwu", this.uwu);
/*    */   }
/*    */   
/*    */   public void readAdditionalSaveData(@NotNull CompoundTag compound) {
/* 22 */     Intrinsics.checkNotNullParameter(compound, "compound"); this.uwu = compound.contains("uwu") ? compound.getBoolean("uwu") : false;
/*    */   }
/*    */   public final boolean isUwu() {
/* 25 */     return this.uwu;
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\entity\base\UwuableMonster.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */