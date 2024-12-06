package class1;

public class ClassStart3 {
    public static void main(String[] args) {

        Mon mon1 = new Mon();
        mon1.title ="베놈";
        mon1.review="재밌어요";

        Mon mon2 = new Mon();
        mon2.title ="놈";
        mon2.review="노밌어요";

        Mon[] mons = new Mon[]{mon1,mon2};

        for (int i = 0; i <mons.length ; i++) {
            Mon[] m = mons;
            System.out.println("제목 : "+m[i].title+" 리뷰 "+m[i].review);
        }

    }
}
