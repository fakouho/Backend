package Access;

import java.util.Scanner;

public class SpeakerMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("초기 볼륨값 입력 :");
        int a = sc.nextInt();
        Speaker sk = new Speaker(a);
        sk.volumUp();
        sk.volumUp();
        sk.showVolume();
        sk.volumDown();

        //필드에 직접 접근
        sk.showVolume();

    }
}
