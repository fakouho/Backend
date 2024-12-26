package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address ar = new Address("서울");
        MemberV1 m1 = new MemberV1("우석",ar);
        MemberV1 m2 = new MemberV1("아리",ar);

        System.out.println(m1);
        System.out.println(m2);

        Address ar2 = new Address("부산");
        m2.setAddress(ar2);

        System.out.println(m1);
        System.out.println(m2);

    }
}
