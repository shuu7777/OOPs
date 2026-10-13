// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Message {
   private String senderid;
   private String receiverid;
   private String sentTime;
   private String text;

   public Message(String var1, String var2, String var3, String var4) {
      this.senderid = var1;
      this.receiverid = var2;
      this.sentTime = var3;
      this.text = var4;
   }

   public String getSenderInfo() {
      return "Sender:" + this.senderid;
   }

   public boolean isDelievered() {
      return true;
   }

   public String logMessage() {
      return "[" + this.sentTime + "] " + this.senderid + " -> " + this.receiverid + ": " + this.text;
   }

   public String getSenderId() {
      return this.senderid;
   }

   public void setSenderId(String var1) {
      this.senderid = var1;
   }

   public String getReceiverId() {
      return this.receiverid;
   }

   public void setReceiverId(String var1) {
      this.receiverid = var1;
   }

   public String getSentTime() {
      return this.sentTime;
   }

   public void setSentTime(String var1) {
      this.sentTime = var1;
   }

   public String getText() {
      return this.text;
   }

   public void setText(String var1) {
      this.text = var1;
   }
}

