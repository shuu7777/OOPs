// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Notification extends Message {
   private String title;
   private boolean priority;
   private String channel;

   public Notification(String var1, String var2, String var3, String var4, String var5, boolean var6, String var7) {
      super(var1, var2, var3, var4);
      this.title = var5;
      this.priority = var6;
      this.channel = var7;
   }

   public String sendNotification() {
      return "Sending notification \"" + this.title + "\" through " + this.channel;
   }

   public boolean isUrgent() {
      return this.priority;
   }

   public void markAsRead() {
      System.out.println("Notification \"" + this.title + "\" was read");
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String var1) {
      this.title = var1;
   }

   public boolean getPriority() {
      return this.priority;
   }

   public void setPriority(boolean var1) {
      this.priority = var1;
   }

   public String getChannel() {
      return this.channel;
   }

   public void setChannel(String var1) {
      this.channel = var1;
   }
}
