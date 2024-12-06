package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data ab = new Data();
        ab.valer=10;
        System.out.println(ab.valer);
        ch(ab);
        System.out.println(ab.valer);

    }
    public static void ch(Data x){
        x.valer= 50;
    }
}
