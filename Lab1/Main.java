import java.time.LocalDateTime;

class Message {
    private String senderid;
    private String receiverid;
    private String sentTime;
    private String text;

    public Message(String senderid, String receiverid, String sentTime, String text ){
        this.senderid = senderid;
        this.receiverid = receiverid;
        this.sentTime = sentTime;
        this.text = text;
    }

    public String getSenderInfo(){
        return "Sender:" + senderid;
    }

    public boolean isDelievered(){
        return true;
    }

    public String logMessage(){
        return "[" + sentTime + "] " + senderid + " -> " + receiverid + ": " + text;
    }

    public String getSenderId() { return senderid; }
    public void setSenderId(String senderid) {this.senderid = senderid;}
    public String getReceiverId() { return receiverid; }
    public void setReceiverId(String receiverid) {this.receiverid = receiverid;}
    public String getSentTime() { return sentTime; }
    public void setSentTime(String sentTime) {this.sentTime = sentTime;}
    public String getText() { return text; }
    public void setText(String text) {this.text = text;}

}

class Notification extends Message {
    private String title;
    private boolean priority;
    private String channel;

    public Notification(String senderid, String receiverid, String sentTime, String text, String title, boolean priority, String channel ){
        super(senderid, receiverid, sentTime, text);
        this.title = title;
        this.priority = priority;
        this.channel = channel;
    }

    public String sendNotification(){
        return "Sending notification \"" + title + "\" through " + channel;
    }

    public boolean isUrgent(){
        return priority;
    }

    public void markAsRead(){
        System.out.println("Notification \"" + title + "\" was read");
    }

    public String getTitle() { return title; }
    public void setTitle(String title) {this.title = title;}
    public boolean getPriority() { return priority;}
    public void setPriority(boolean priority) {this.priority = priority;}
    public String getChannel() { return channel; }
    public void setChannel(String channel) {this.channel = channel;}

}

class Reminder extends Notification {
    private LocalDateTime remindTime;
    private boolean repeat;
    private boolean isDone;
    private int snoozeCount;

    public Reminder(LocalDateTime remindTime, boolean repeat, boolean isDone, String senderid, String receiverid, String sentTime, String text, String title, boolean priority, String channel ){
        super(senderid, receiverid, sentTime, text, title, priority, channel);
        this.remindTime = remindTime;
        this.repeat = repeat;
        this.isDone = isDone;
    }

     public void snooze10min() {
        this.snoozeCount++;
        this.remindTime = this.remindTime.plusMinutes(10);
        System.out.println("Reminder snoozed for 10 min. Total snoozes: " + snoozeCount);
    }

     public void markDone() {
        this.isDone = true;
        System.out.println("Reminder \"" + getTitle() + "\" is done!");
    }

    public String reschedule(LocalDateTime newTime) {
        this.remindTime = newTime;
        return "Reminder rescheduled to " + newTime;
    }

    public LocalDateTime getRemindTime() { return remindTime; }
    public void setRemindTime(LocalDateTime remindTime) { this.remindTime = remindTime; }
    public boolean isRepeat() { return repeat; }
    public void setRepeat(boolean repeat) { this.repeat = repeat; }
    public boolean isDone() { return isDone; }
    public void setDone(boolean done) { isDone = done; }
    public int getSnoozeCount() { return snoozeCount; }
    public void setSnoozeCount(int snoozeCount) { this.snoozeCount = snoozeCount; }
}

public class Main {
    public static void main(String[] args) {

        Message msg = new Message("Вася", "Ты", "10:00", "Привет");
        System.out.println(msg.getSenderInfo());
        System.out.println(msg.isDelievered());
        System.out.println(msg.logMessage());

        Notification notif = new Notification("Вася", "Ты", "10:05", "Позвони",
                "Важное", true, "Push");
        System.out.println(notif.sendNotification());
        System.out.println(notif.isUrgent());
        notif.markAsRead();

        Reminder rem = new Reminder(LocalDateTime.of(2026, 10, 4, 18, 0),
                false, false, "Вася", "Ты", "10:10", "Позвонить маме",
                "Напоминание", true, "Push");
        rem.snooze10min();
        rem.markDone();
        System.out.println(rem.reschedule(LocalDateTime.of(2026, 10, 5, 9, 0)));
        System.out.println("Is Done? " + rem.isDone());

    }
}
