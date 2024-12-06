package OOP1;

public class Object {
    int valume;
    boolean state;

    void on(){
        state=true;
        System.out.println("음악실행");
    }
    void off(){
        state=false;
        System.out.println("음악종료");
    }
    void plus(){
        valume++;
        System.out.println("볼륨업"+valume);
    }
    void minuse(){
        valume--;
        System.out.println("볼룸다운"+valume);
    }
    void st(){
        System.out.println("상태를 확인합니다."+state);
    }

}
