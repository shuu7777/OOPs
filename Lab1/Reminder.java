// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.time.LocalDateTime;

class Reminder extends Notification {
   private LocalDateTime remindTime;
   private boolean repeat;
   private boolean isDone;
   private int snoozeCount;

   public Reminder(LocalDateTime var1, boolean var2, boolean var3, String var4, String var5, String var6, String var7, String var8, boolean var9, String var10) {
      super(var4, var5, var6, var7, var8, var9, var10);
      this.remindTime = var1;
      this.repeat = var2;
      this.isDone = var3;
   }

   public void snooze10min() {
      ++this.snoozeCount;
      this.remindTime = this.remindTime.plusMinutes(10L);
      System.out.println("Reminder snoozed for 10 min. Total snoozes: " + this.snoozeCount);
   }

   public void markDone() {
      this.isDone = true;
      System.out.println("Reminder \"" + this.getTitle() + "\" is done!");
   }

   public String reschedule(LocalDateTime var1) {
      this.remindTime = var1;
      return "Reminder rescheduled to " + String.valueOf(var1);
   }

   public LocalDateTime getRemindTime() {
      return this.remindTime;
   }

   public void setRemindTime(LocalDateTime var1) {
      this.remindTime = var1;
   }

   public boolean isRepeat() {
      return this.repeat;
   }

   public void setRepeat(boolean var1) {
      this.repeat = var1;
   }

   public boolean isDone() {
      return this.isDone;
   }

   public void setDone(boolean var1) {
      this.isDone = var1;
   }

   public int getSnoozeCount() {
      return this.snoozeCount;
   }

   public void setSnoozeCount(int var1) {
      this.snoozeCount = var1;
   }
}
