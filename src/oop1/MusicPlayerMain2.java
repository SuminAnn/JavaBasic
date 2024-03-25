package oop1;

public class MusicPlayerMain2 {
    
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        //플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //플레이어 상태
        player.showStaus();
        //플레이어 끄기
        player.off();
    }
}
