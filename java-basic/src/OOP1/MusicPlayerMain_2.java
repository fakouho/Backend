package OOP1;

public class MusicPlayerMain_2 {
    public static void main(String[] args) {
        OOP_02 data = new OOP_02();

        //음악 플레이어 켜기
        data.isOn=true;
        System.out.println("음악 플레이어를 시작합니다.");

        //볼륨 증가
        data.value++;
        System.out.println("음악 플레이어 볼륨 : "+ data.value);
        //볼륨 증가
        data.value++;
        System.out.println("음악 플레이어 볼륨  : "+ data.value);
        //볼륨 감소
        data.value--;
        System.out.println("음악 플레이어 볼륨 : "+ data.value);
        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn==true){
            System.out.println("음악 플레이어 On, 볼륨 "+data.value);
        }else {
            System.out.println("음악플레이어 off ");
        }
        // 음악 플레이어 끄기
        data.isOn=false;
        System.out.println("음악 플레이어 종료");
    }
}
