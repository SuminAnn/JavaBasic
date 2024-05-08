package poly.ex.sender;

public class SenMain {

    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for(Sender sender : senders){
            sender.senMessage("환영합니다!");
        }
    }
}
