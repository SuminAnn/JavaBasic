package access;

public class SpeakerMain {
    
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.show();

        speaker.up();
        speaker.show();

        speaker.up();
        speaker.show();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; private 접근제어자를 통해 직접 접근 불가
        speaker.show();
    }
}
