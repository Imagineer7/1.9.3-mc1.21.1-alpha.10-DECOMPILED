/*    */ package dev.wendigodrip.thebrokenscript.procedures.events;
/*    */ import dev.wendigodrip.thebrokenscript.TheBrokenScript;
/*    */ import net.minecraft.commands.arguments.EntityAnchorArgument;
/*    */ import net.minecraft.core.Holder;
/*    */ import net.minecraft.core.registries.Registries;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.damagesource.DamageTypes;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class EventCamera1Procedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null) {
/*    */       return;
/*    */     }
/* 17 */     TheBrokenScript.queueServerWork(1, () -> {
/*    */           entity.hurt(new DamageSource((Holder)world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 1.0F);
/*    */           entity.lookAt(EntityAnchorArgument.Anchor.EYES, new Vec3(x, y, z));
/*    */           TheBrokenScript.queueServerWork(5, ());
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\procedures\events\EventCamera1Procedure.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */