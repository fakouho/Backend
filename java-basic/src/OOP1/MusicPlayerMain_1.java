package OOP1;

public class MusicPlayerMain_1 {
    public static void main(String[] args) {
        int volumn = 0;
        boolean isOn =false;

        //음악 플레이어 켜기
        isOn=true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨 : "+ volumn);
        //볼륨 증가
        volumn++;
        System.out.println("음악 플레이어 볼륨  : "+ volumn);
        //볼륨 감소
        volumn--;
        System.out.println("음악 플레이어 볼륨 : "+ volumn);
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(isOn==true){
            System.out.println("음악 플레이어 On, 볼륨 "+volumn);
        }else {
            System.out.println("음악플레이어 off ");
        }
        // 음악 플레이어 끄기
        isOn=false;
        System.out.println("음악 플레이어 종료");
    }
}
