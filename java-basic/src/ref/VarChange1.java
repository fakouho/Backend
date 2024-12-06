package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        a=20;
        System.out.println(a);
        b=15;
        System.out.println(b);

        Data va1=new Data();
        va1.valer = 10;
        Data val2 = new Data();
        val2=va1;

        System.out.println(va1.valer);
        System.out.println(val2.valer);


    }
}
