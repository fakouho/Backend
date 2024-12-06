package OOP1;

public class MusicPlayerMain_3 {
    public static void main(String[] args) {
        OOP_02 data = new OOP_02();

        //음악 플레이어 켜기
        on(data);
        //볼륨 증가
        plus(data);
        //볼륨 증가
        plus(data);
        //볼륨 감소
        minus(data);
        // 음악 플레이어 상태
        state(data);
        // 음악 플레이어 끄기
        off(data);
    }
    public static void on(OOP_02 data){
        data.isOn=true;
        System.out.println("음악 플레이어를 시작합니다.");
    }
    public static void plus(OOP_02 data){
        data.value++;
        System.out.println("음악 플레이어 볼륨 : "+ data.value);
    }
    public static void minus(OOP_02 data){
        data.value--;
        System.out.println("음악 플레이어 볼륨 : "+ data.value);
    }
    public static void state(OOP_02 data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn==true){
            System.out.println("음악 플레이어 On, 볼륨 "+data.value);
        }else {
            System.out.println("음악플레이어 off ");
        }
    }
    public static void off(OOP_02 data){
        data.isOn=false;
        System.out.println("음악 플레이어 종료");
    }
}
