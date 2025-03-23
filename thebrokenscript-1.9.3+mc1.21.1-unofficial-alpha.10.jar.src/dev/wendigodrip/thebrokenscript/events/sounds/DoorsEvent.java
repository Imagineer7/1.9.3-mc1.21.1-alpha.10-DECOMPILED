/*    */ package dev.wendigodrip.thebrokenscript.events.sounds;
/*    */ import dev.wendigodrip.thebrokenscript.events.BaseEvent;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.sounds.SoundEvents;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J \020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H\026¨\006\f"}, d2 = {"Ldev/wendigodrip/thebrokenscript/events/sounds/DoorsEvent;", "Ldev/wendigodrip/thebrokenscript/events/BaseEvent;", "<init>", "()V", "execute", "", "level", "Lnet/minecraft/world/level/Level;", "entity", "Lnet/minecraft/world/entity/Entity;", "pos", "Lnet/minecraft/world/phys/Vec3;", "thebrokenscript"})
/*    */ public final class DoorsEvent extends BaseEvent {
/*    */   public DoorsEvent() {
/* 16 */     super("doors", 1);
/*    */   } public void execute(@NotNull Level level, @NotNull Entity entity, @NotNull Vec3 pos) {
/* 18 */     Intrinsics.checkNotNullParameter(level, "level"); Intrinsics.checkNotNullParameter(entity, "entity"); Intrinsics.checkNotNullParameter(pos, "pos"); double sx = -3.0D;
/* 19 */     double sy = -3.0D;
/* 20 */     double sz = -3.0D;
/* 21 */     boolean found = false;
/*    */     
/* 23 */     for (int x = 0; x < 6; x++) {
/* 24 */       sy = -3.0D;
/*    */       
/* 26 */       for (int y = 0; y < 6; y++) {
/* 27 */         sz = -3.0D;
/*    */         
/* 29 */         for (int z = 0; z < 6; z++) {
/* 30 */           if (level.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))
/* 31 */             .is(BlockTags.create(ResourceLocation.parse("minecraft:wooden_doors"))))
/*    */           {
/* 33 */             found = true;
/*    */           }
/*    */           
/* 36 */           sz++;
/*    */         } 
/*    */         
/* 39 */         sy++;
/*    */       } 
/*    */       
/* 42 */       sx++;
/*    */     } 
/*    */     
/* 45 */     if (found) {
/* 46 */       Intrinsics.checkNotNullExpressionValue(SoundEvents.WOODEN_DOOR_OPEN, "WOODEN_DOOR_OPEN"); BaseEvent.playSound$default(this, pos, SoundEvents.WOODEN_DOOR_OPEN, 55.0F, 1.0F, false, 16, null);
/*    */       
/* 48 */       if (entity instanceof Player) {
/* 49 */         BlockPos sPos = BlockPos.containing(sx, sy, sz);
/*    */         
/* 51 */         entity.level().getBlockState(sPos).useItemOn((
/* 52 */             (Player)entity).getItemInHand(InteractionHand.MAIN_HAND), 
/* 53 */             entity.level(), 
/* 54 */             (Player)entity, 
/* 55 */             InteractionHand.MAIN_HAND, 
/* 56 */             BlockHitResult.miss(
/* 57 */               new Vec3(sPos.getX(), sPos.getY(), sPos.getZ()), Direction.UP, sPos));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3+mc1.21.1-unofficial-alpha.10.jar!\dev\wendigodrip\thebrokenscript\events\sounds\DoorsEvent.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */