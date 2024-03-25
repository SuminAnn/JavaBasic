package oop1;

public class MusicPlayerMain1 {
    
    public static void main(String[] args) {
        MusicPlayerData player = new MusicPlayerData();

        //플레이어 켜기
        on(player);
        //볼륨 증가
        volumeUp(player);
        //볼륨 증가
        volumeUp(player);
        //볼륨 감소
        volumeDown(player);
        //플레이어 상태
        showStaus(player);
        //플레이어 끄기
        off(player);
    }

    static void volumeUp(MusicPlayerData player){
        player.volume++;
        System.out.println("음악 플레이어 볼륨:" + player.volume);
    }

    static void volumeDown(MusicPlayerData player){
        player.volume--;
        System.out.println("음악 플레이어 볼륨:" + player.volume);
    }

    static void on(MusicPlayerData player){
        player.isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
    }

    static void off(MusicPlayerData player){
        player.isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    static void showStaus(MusicPlayerData player){
        System.out.println("음악 플레이어 상태 확인");
        if(player.isOn){
            System.out.println("음악 플레이어 ON, 볼륨:" + player.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
        
    }
}
