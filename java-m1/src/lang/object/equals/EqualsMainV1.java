package lang.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 u1=new UserV1("id-100");
        UserV1 u2=new UserV1("id-100");

        System.out.println(u1.equals(u2));

    }
}
